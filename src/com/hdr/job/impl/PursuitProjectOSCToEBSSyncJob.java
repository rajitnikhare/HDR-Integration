package com.hdr.job.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.job.AbstractSpringJob;
import com.hdr.sync.SyncObject;
import com.hdr.util.ErrorMsgUtil;

/**This job will Sync Pursuit Projects (Sales Cloud Opportunities) from Sales Cloud to EBS.
 * Notes: 
 * 1) Filter Out WON Opties.
 * 2) Dont download opties modified by Integration User
 * @author Jeevan Abraham
 *
 */
@Service
public class PursuitProjectOSCToEBSSyncJob extends AbstractSpringJob {

	private static final Logger log = Logger.getLogger(PursuitProjectOSCToEBSSyncJob.class);

	@Resource(name="syncPursuitProjectObject")
	private SyncObject pursuitProjectSyncObject;

	@Resource
	private ErrorLogDao errorLogDao;

	@Override
	protected void executeJob() throws Exception {
		// process();
		syncPursuitProjectsFromOscToEbs();

	}

	private void syncPursuitProjectsFromOscToEbs() {
		
		log.info("started syncPursuitProjectsFromOscToEbs");

		try {
			pursuitProjectSyncObject.syncObject();	
		} catch (Exception e) 
		{
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Un-expected error while synching Pursuit Project from OSC to EBS. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.FUSION_TO_EBS.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_STG.getVal();
			
			errorLogDao.logSyncError(objectName, direction, emsg, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK, this.getJobName()
					,tableName
					);
		}
		
		
		log.info("ending of syncPursuitProjectsFromOscToEbs....");

	}


	
	
	
	 // This is for test purpose
	  
	public void test() throws Exception {
		executeJob();

	}

}
