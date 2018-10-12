package com.hdr.sync.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.job.impl.PursuitProjectAcklgEBSToOSCSyncJob;
import com.hdr.model.PursuitProjectAcklg;
import com.hdr.service.EntityService;
import com.hdr.service.PursuitProjectService;
import com.hdr.sync.SyncObject;
import com.hdr.util.Constants;
import com.hdr.util.ErrorMsgUtil;

/**
 * Helper class to sync Pursuit Project Acknowledgments from EBS to OSC.
 * This job will Sync Pursuit Projects Acknowledgments from EBS to Sales Cloud.
 * The job will query OSC Opportunity using the OSC_OPPORTUNITY_ID from XXHDR_PJM_OSC_PRSUT_PROJ_ACK table. 
 * It will update the OSC Opportunity and set the EBS Project Id using the db field EBS_PROJECT_ID.  
 * 
 * @author Romesh Soni
 *
 */
@Repository("syncPursuitProjectAcklgEBSToOSC")
@Service
public class SyncPursuitProjectAcklgEBSToOSC implements SyncObject {
	/**
	 * Registering Logger for SyncPursuitProjectAcklgEBSToOSC.class
	 */
	private static final Logger log = Logger
			.getLogger(SyncPursuitProjectAcklgEBSToOSC.class);

	@Resource
	private PursuitProjectService pursuitProjectWS;

	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;

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

			try 
			{
				boolean allRecordsSynchedSuccessfully = processPursuitProject();
					
			} catch (Exception e) {
				log.error("Error Occured in the acknowlledment process", e);
			}

		

	}

	
	/**
	 * 
	 * @param iList
	 */
	private boolean processPursuitProject() {
		
		    boolean allRecordsSynchedToOSCSuccessfully=true;
		
			String processStateReady=Constants.SYNC_STATUS.READY.toString();
			String processStateFailed=Constants.SYNC_STATUS.ERROR.toString();
			Integer maxRetryCount = Constants.SYNC_JOB_MAX_RETRY_COUNT;

			List<PursuitProjectAcklg> cAckList = entityServiceEBS.findByNameQuery(
					Constants.GET_UNPROCESSED_PURSUIT_PROJECT_ACKLG,
					new Object[] 
							{
							processStateReady
							,processStateFailed
							,maxRetryCount
							
							}, 10000);
			
			if (cAckList != null && cAckList.size() > 0) 
			{
				for (PursuitProjectAcklg c : cAckList) 
				{
					try 
					{
						//before doing processing, change the sync status to IN PROGRESS
						markRecordInProgress(c);
						
						//update record in sales cloud
						pursuitProjectWS.updatePursuitProjectAcklg(c);
						
						//mark record saved 
						markRecordProcessedSuccessfully(c);
						
					} catch (Exception e) 
					{
						allRecordsSynchedToOSCSuccessfully=false;
						
						log.error(e);
						int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
						String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
						String customMsg="Error while updating Opportunity in OSC while synching acknowledgment from EBS to OSC. Trace: ";
						emsg = customMsg+emsg;
						log.error(emsg);
						
						//mark the record failed in ack table
						markRecordFailed(c, emsg);
						
						String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
						String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
						String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_ACK.getVal();
						String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
						String primaryKeyValue = c.getRecordId().toString();
						errorLogDao.logSyncError(objectName, direction
								, emsg
								, primaryKey
								, primaryKeyValue
								, PursuitProjectAcklgEBSToOSCSyncJob.class.getSimpleName()
								,tableName
								);						
					}

				}
			}
			
			
		
		
		return allRecordsSynchedToOSCSuccessfully;
	}
	
private void markRecordInProgress(PursuitProjectAcklg c) {
		
		log.info(">>markRecordInProgress");
		
		c.setLastUpdateDate(new Date());
		c.setProcessState(Constants.SYNC_STATUS.IN_PROGRESS.toString());
		try 
		{
			entityServiceEBS.save(c);
			
		} catch (Exception e) {
			
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error while updating changing record status to IN PROGRESS in db. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
					
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_ACK.getVal();
			String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
			String primaryKeyValue = c.getRecordId().toString();
			errorLogDao.logSyncError(objectName, direction
					, emsg
					, primaryKey
					, primaryKeyValue
					, PursuitProjectAcklgEBSToOSCSyncJob.class.getSimpleName()
					,tableName
					);	
		}
	}


	private void markRecordProcessedSuccessfully(PursuitProjectAcklg c) {
		
		log.info(">>markRecordProcessedSuccessfully");
		
		c.setStatusMessage(null);
		c.setLastUpdateDate(new Date());
		c.setProcessState(Constants.SYNC_STATUS.COMPLETED.toString());
		c.setRetryCount(0);
		
		try 
		{
			entityServiceEBS.save(c);
			
		} catch (Exception e) {
			
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error while updating acknowledgment after Saving acknowledgment in OSC. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
					
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_ACK.getVal();
			String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
			String primaryKeyValue = c.getRecordId().toString();
			errorLogDao.logSyncError(objectName, direction
					, emsg
					, primaryKey
					, primaryKeyValue
					, PursuitProjectAcklgEBSToOSCSyncJob.class.getSimpleName()
					,tableName
					);	
		}
		
							
	
		
		
	}
	
private void markRecordFailed(PursuitProjectAcklg c,String emsg) {
		log.info(">>markRecordFailed");
		
		c.setStatusMessage(emsg);
		c.setLastUpdateDate(new Date());
		c.setProcessState(Constants.SYNC_STATUS.ERROR.toString());
		
		Integer iRetryCount = c.getRetryCount();
		if(iRetryCount==null)
			iRetryCount=0;
		
		iRetryCount++;
		
		c.setRetryCount(iRetryCount);
		
		try 
		{
			entityServiceEBS.save(c);
			
		} catch (Exception e) {
			
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg2 = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error while updating acknowledgment table for error fields, "
					+ "after failed attempt to save acknowledgment in OSC. Trace: ";
			emsg2 = customMsg+emsg2;
			log.error(emsg2);
					
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_ACK.getVal();
			String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
			String primaryKeyValue = c.getRecordId().toString();
			errorLogDao.logSyncError(objectName, direction
					, emsg2
					, primaryKey
					, primaryKeyValue
					, PursuitProjectAcklgEBSToOSCSyncJob.class.getSimpleName()
					,tableName
					);	
		}
		
	}

}
