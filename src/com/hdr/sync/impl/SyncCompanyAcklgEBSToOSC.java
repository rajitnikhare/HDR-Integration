package com.hdr.sync.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IBatchKeyConstants;
import com.hdr.constants.ICompanyConstants;
import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.job.impl.CompanyAcklgEBSToOSCSyncJob;
import com.hdr.job.impl.PursuitProjectAcklgEBSToOSCSyncJob;
import com.hdr.model.CompanyAcklg;
import com.hdr.model.IntegrationStatistic;
import com.hdr.service.CompanyServ;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EntityService;
import com.hdr.sync.SyncObject;
import com.hdr.util.Constants;
import com.hdr.util.ErrorMsgUtil;

@Repository("syncCompanyAcklgEBSToOSC")
@Service
public class SyncCompanyAcklgEBSToOSC implements SyncObject {
	/**
	 * Registering Logger for SyncCompanyOSCtoEBSAcklg.class
	 */
	private static final Logger log = Logger.getLogger(SyncCompanyAcklgEBSToOSC.class);

	@Resource
	private CompanyServ companyWS;

	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;
	
	@Resource
	private DbUtilityServ dbutil;
	
	@Resource
	private ErrorLogDao errorLogDao;

	/**
	 * Main Method
	 */
	@Override
	public void syncObject() throws Exception {
		process();
	}

	/**
	 * 
	 * @throws Exception
	 */
	private void process() throws Exception {
		boolean isIstat =false;
		List<IntegrationStatistic> iList = entityServiceDBaaS.findByNameQuery(Constants.GET_BATCH_KEY,new Object[] {Constants.HDR_INT_OBJECT.Company.toString() });
		if(iList!=null && !iList.isEmpty()){isIstat = true;}
		/**
		 * If we do not get null value or null batch key value we will proceed
		 */
			try {
				/**
				 * This method process' Company
				 */
				processCompany(iList);
				/**
				 * Update the I STATS in DBaaS with suitable sync status
				 */
				if(isIstat)updateIntStats(iList, null);
			} catch (Exception e) {
				log.error("Error Occured in the acknowlledment process", e);
				/**
				 * Update the I STATS in DBaaS with suitable sync status
				 */
				if(isIstat)updateIntStats(iList, e);
			}

		

	}

	/**
	 * 
	 * @param iList
	 * @param e1
	 */
	private void updateIntStats(List<IntegrationStatistic> iList, Exception e1) {
		try {
			if (e1 != null) {
				iList.get(0).setSyncStatus(Constants.SYNC_STATUS.ERROR.toString());
				iList.get(0).setBatchKey2(iList.get(0).getBatchKey1());
			} else {
				iList.get(0).setSyncStatus(Constants.SYNC_STATUS.COMPLETED.toString());
				iList.get(0).setBatchKey2(iList.get(0).getBatchKey1());
				iList.get(0).setBatchKey1(null);

			}
			iList.get(0).setLastUpdatedDate(new Date());
			entityServiceDBaaS.save(iList.get(0));
		} catch (Exception e) {
			log.error("Error Occured in setting integration statistics", e);
		}

	}
	/**
	 * 
	 * @param iList
	 * @throws Exception 
	 */
	private void processCompany(List<IntegrationStatistic> iList) throws Exception {
		
			List<CompanyAcklg> cAckList = entityServiceEBS.findByNameQuery(ICompanyConstants.GET_UNPROCESSED_COMPANY_ACKLG,null,100);
			while(cAckList != null && cAckList.size() > 0) {
				for (CompanyAcklg c : cAckList) {
					try {
						dbutil.updateDbStatus(c,Constants.SYNC_STATUS.IN_PROGRESS.getVal(),null);
						companyWS.updateCompanyAcklg(c);
						dbutil.updateDbStatus(c,Constants.SYNC_STATUS.COMPLETED.getVal(),null);
					} catch (Exception e) {
						log.error("Error occured while updating company ackwoledgment back to OSC", e);
						dbutil.updateDbStatus(c,Constants.SYNC_STATUS.ERROR.getVal(),e);
						log.error(e);
						setErrorLog(e,"Error while updating Company in OSC while synching acknowledgment from EBS to OSC. Trace: ",c);	
						
						
					}
				}
				cAckList = null;
				cAckList = entityServiceEBS.findByNameQuery(ICompanyConstants.GET_UNPROCESSED_COMPANY_ACKLG);
				
			}
	}

	
	/**
	 * 
	 * @param e
	 * @param customeMessage
	 * @param c
	 */
	private void setErrorLog( Exception e, String customeMessage,CompanyAcklg c) {
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		emsg = customeMessage+emsg;
		log.error(emsg);
		
		//mark the record failed in ack table
		//markRecordFailed(c, emsg);
		
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.COMPANY.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.COMPANY_ACK.getVal();
		String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
		String primaryKeyValue = c.getRecordId().toString();
		errorLogDao.logSyncError(objectName, direction
				, emsg
				, primaryKey
				, primaryKeyValue
				, CompanyAcklgEBSToOSCSyncJob.class.getSimpleName()
				,tableName
				);
	}

}
