package com.hdr.executor.job.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.ICompanyConstants;
import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.dbaas.ErrorLogDBAASDao;
import com.hdr.job.impl.CompanyODSToOSCSyncJob;
import com.hdr.model.Account;
import com.hdr.model.BaseObject;
import com.hdr.service.AccountServ;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EntityService;
import com.hdr.util.Constants;
import com.hdr.util.ErrorMsgUtil;

@Service
@Scope("prototype")
@Repository("dataLoadCompanyExecutorServImpl")
public class DataLoadCompanyExecutorServImpl implements Runnable {
	
	private static final Logger log =  Logger.getLogger(DataLoadCompanyExecutorServImpl.class);
	
	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;
	
	@Resource
	private ErrorLogDBAASDao errorLogDbaaSDao;
	
	private String sync_status;
	
	@Resource
	private AccountServ accountServ;
	
	@Resource
	private DbUtilityServ dbUtility;
	
	
	
	@Override
	public void run() {
		process();
	}

	private void process() {
		try {
			
			List<Account> unprocessedAccounts = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_ACCOUNT_DATALOAD,new Object[]{sync_status});
			while (unprocessedAccounts != null &&  unprocessedAccounts.size() > 0) {
				for (Account accountFromDBAS : unprocessedAccounts){
					try {
						dbUtility.updateDbStatus(accountFromDBAS,Constants.SYNC_STATUS.IN_PROGRESS.getVal(),null);
						uploadAccountFromDBASToOSCByEBSID(accountFromDBAS);
						dbUtility.updateDbStatus(accountFromDBAS,Constants.SYNC_STATUS.COMPLETED.getVal(),null);
					} catch (Exception e) {
						log.error("Error Occured While Syncing Account from DBAS to OSc:"+ e);
						dbUtility.updateDbStatus(accountFromDBAS,Constants.SYNC_STATUS.ERROR.getVal(),e);
						log.error(e);
						setErrorLog(e,"Error while syncing Company from ODS to OSC . Trace: ",accountFromDBAS);	
					}
				}
				unprocessedAccounts=null;
				unprocessedAccounts = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_ACCOUNT_DATALOAD,new Object[]{sync_status});
			}
			
			
		} catch (Exception e) {
		
		}
		
	}

	/**
	 * 
	 * @param accountFromDBAS
	 * @throws Exception
	 */
	private void uploadAccountFromDBASToOSCByEBSID(Account accountFromDBAS) throws Exception {
		try {
			log.info("starting of uploadAccountfromDBASToOscByEbsId ......");
			com.hdr.ws.stubs.accountService.Account accountC = null;
			if (accountFromDBAS != null){
				String legacyId = accountFromDBAS.getLegacyId();
				
				if(legacyId==null){
					throw new Exception("Legacy Id null for the record..");
				}
				 if(accountFromDBAS.getClientAcctEbsId()==null){
					 throw new Exception("Client Account EBS Id null for the record..");
				 }
					accountC = accountServ.find(getQueryParam(legacyId));
					if(accountC!=null){
						accountFromDBAS.setChildOscId(accountC.getPartyId());
					}else{
						throw new Exception("Skipping the records as no records was found with legacy_id: "+legacyId);
					}
				}
				accountServ.updateDataload(accountFromDBAS);
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
