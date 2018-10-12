package com.hdr.job.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.job.AbstractSpringJob;
import com.hdr.sync.SyncObject;
import com.hdr.util.ErrorMsgUtil;

@Service
public class CompanyOscToEbsSyncJob extends AbstractSpringJob {
	
	private static final Logger log =  Logger.getLogger(CompanyOscToEbsSyncJob.class);
	
	@Resource(name="syncCompanyOSCtoEBS")
	private SyncObject companySyncObject;
	
	@Resource
	private ErrorLogDao errorLogDao;
	
	@Override
	protected void executeJob() throws Exception {
		try {
			companySyncObject.syncObject();	
		} catch (Exception e) {
			log.error("In "+this.getClass().getSimpleName()+" Error occured while syncing Company",e);
			setErrorLog(e,"Un-expected error while synching Company  from OSC to EBS. Trace: ");
		}
	}




		/**
		 * 
		 * @param e
		 * @param custMessage
		 */
		private void setErrorLog(Exception e, String custMessage) {
		log.error(e);
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		emsg = custMessage+emsg;
		log.error(emsg);
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.FUSION_TO_EBS.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_STG.getVal();
		
		errorLogDao.logSyncError(objectName, direction, emsg, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
				, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK, this.getJobName()
				,tableName
				);
	}

	
	public void test() throws Exception {
		executeJob();
		
	}

}
