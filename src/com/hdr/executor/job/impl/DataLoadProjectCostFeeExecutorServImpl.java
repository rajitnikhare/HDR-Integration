package com.hdr.executor.job.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.ICompanyConstants;
import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.dbaas.ErrorLogDBAASDao;
import com.hdr.job.impl.CompanyODSToOSCSyncJob;
import com.hdr.model.Account;
import com.hdr.model.BaseObject;
import com.hdr.model.DeleteProjectCostFee;
import com.hdr.model.DeleteProjectLocation;
import com.hdr.service.AccountServ;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EntityService;
import com.hdr.service.ProjectServ;
import com.hdr.util.Constants;
import com.hdr.util.ErrorMsgUtil;

@Service
@Scope("prototype")
@Repository("dataLoadProjectCostFeeExecutorServImpl")
public class DataLoadProjectCostFeeExecutorServImpl implements Runnable {
	
	private static final Logger log =  Logger.getLogger(DataLoadProjectCostFeeExecutorServImpl.class);
	
	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;
	
	@Resource
	private ErrorLogDBAASDao errorLogDbaaSDao;
	
	private String sync_status;
	
	@Resource
	private ProjectServ projectServ;
	
	@Resource
	private DbUtilityServ dbUtility;
	
	
	
	@Override
	public void run() {
		process();
	}

	private void process() {
		try {
			
			List<DeleteProjectCostFee> deleteProjectLocationList = entityServiceDBaaS.findByNameQuery("GET_UNPROCESSED_PROJECT_COST_FEE_FOR_DELETE",new Object[]{sync_status});
			while (deleteProjectLocationList != null &&  deleteProjectLocationList.size() > 0) {
				for (DeleteProjectCostFee o : deleteProjectLocationList){
					try {
						o.setProcessState("IN PROGRESS");
						entityServiceDBaaS.save(o);
						delete(o);
						o.setProcessState("COMPLETED");
						entityServiceDBaaS.save(o);
					} catch (Exception e) {
						log.error("Error Occured While Syncing Account from DBAS to OSc:"+ e);
						o.setProcessState("ERROR");
						entityServiceDBaaS.save(o);
						log.error(e);
					}
				}
				deleteProjectLocationList=null;
				deleteProjectLocationList = entityServiceDBaaS.findByNameQuery("GET_UNPROCESSED_PROJECT_COST_FEE_FOR_DELETE",new Object[]{sync_status});
			}
			
			
		} catch (Exception e) {
		
		}
		
	}

	/**
	 * 
	 * @param accountFromDBAS
	 * @throws Exception
	 */
	private void delete(DeleteProjectCostFee accountFromDBAS) throws Exception {
		try {
			log.info("deleting...");
			projectServ.delete(accountFromDBAS);
			
		} catch (Exception e) {
			throw e;
		}

	}

	private BaseObject getQueryParam( String legacyId) {
		BaseObject o = null;
			o = new BaseObject();
			o.setFetchSize(1);
			o.setFetchStart(0);
			o.setViewCriteriaAttributeName(ICompanyConstants.ACCOUNT_FIELD_LEGACY_ID);
			o.setViewCriteriaAttributeValue(legacyId);
			o.setOperator(Constants.FUSION_EQUALS_OPERATOR);
			List<String> findAttrib = new ArrayList<String>();
			findAttrib.add(ICompanyConstants.ACCOUNT_FIELD_PARTY_ID);
			o.setListOfAttribute(findAttrib);;
			return o;
	}

	/**
	 * 
	 * @param e
	 * @param customMessage
	 * @param accountFromDBAS
	 */
	private void setErrorLog(Exception e, String customMessage, Account accountFromDBAS) {
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		String customMsg="Error while syncing Company from ODS to OSC . Trace: ";
		emsg = customMessage+emsg;
		log.error(emsg);
				
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.ODS_TO_FUSION.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.COMPANY.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.COMPANY_ODS_OSC_STG.getVal();
		String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
		String primaryKeyValue = null;
		if(accountFromDBAS!=null)primaryKeyValue = accountFromDBAS.getClientAcctEbsId().toString();
		errorLogDbaaSDao.logSyncError(objectName, direction, emsg, primaryKey, primaryKeyValue, CompanyODSToOSCSyncJob.class.getSimpleName(),tableName);
	}

	public String getSync_status() {
		return sync_status;
	}

	public void setSync_status(String sync_status) {
		this.sync_status = sync_status;
	}
	
		
}
