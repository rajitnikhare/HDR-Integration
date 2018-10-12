package com.hdr.job.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.job.AbstractSpringJob;
import com.hdr.sync.SyncObject;
import com.hdr.util.ErrorMsgUtil;

/**This job will Sync Pursuit Projects Acknowledgments from EBS to Sales Cloud.
 * The job will query OSC Opportunity using the OSC_OPPORTUNITY_ID from XXHDR_PJM_OSC_PRSUT_PROJ_ACK table. 
 * It will update the OSC Opportunity and set the EBS Project Id using the db field EBS_PROJECT_ID.  
 * 
 * @author Jeevan Abraham
 *
 */
@Service
public class PursuitProjectAcklgEBSToOSCSyncJob extends AbstractSpringJob {

	private static final Logger log = Logger
			.getLogger(PursuitProjectAcklgEBSToOSCSyncJob.class);

	@Resource(name="syncPursuitProjectAcklgEBSToOSC")
	private SyncObject syncPursuitProjectAcklgEBSToOSC;
	
	@Resource
	private ErrorLogDao errorLogDao;


	@Override
	protected void executeJob() throws Exception {
		// process();
		syncPursuitProjectsAcknowledgmentsFromEbsToOsc();

	}

	private void syncPursuitProjectsAcknowledgmentsFromEbsToOsc() {
		
		log.info("started syncPursuitProjectsAcknowledgmentsFromEbsToOsc");

		try 
		{
			syncPursuitProjectAcklgEBSToOSC.syncObject();
		} catch (Exception e) {
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Uneexpected error while synching Pursuit Project Acknowledgment from EBS to OSC. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_ACK.getVal();
			
			errorLogDao.logSyncError(objectName, direction, emsg, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK, this.getJobName()
					,tableName
					);
			
		}
		
		log.info("ending of syncPursuitProjectsAcknowledgmentsFromEbsToOsc....");

	}


	
	
	
	 // This is for test purpose
	  
	public void test() throws Exception {
		executeJob();

	}

}
