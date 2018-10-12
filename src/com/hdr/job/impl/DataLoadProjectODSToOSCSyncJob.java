package com.hdr.job.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.dbaas.ErrorLogDBAASDao;
import com.hdr.job.AbstractSpringJob;
import com.hdr.sync.SyncObject;
import com.hdr.util.ErrorMsgUtil;

@Service
public class DataLoadProjectODSToOSCSyncJob extends AbstractSpringJob {
	
	private static final Logger log =  Logger.getLogger(DataLoadProjectODSToOSCSyncJob.class);
	
	@Resource(name="dataLoadSyncProjectODSToOSC")
	private SyncObject projectSyncObject;
	
	@Resource
	private ErrorLogDBAASDao errorLogDBaaSDao;
	
	
	@Override
	protected void executeJob() throws Exception {
		try {
			projectSyncObject.syncObject();	
		} catch (Exception e) {
			log.error("In "+this.getClass().getSimpleName()+" Error occured while syncing Project",e);
			setErrorLog(e,"Un-expected error while syncing Project from ODS to OSC. Trace: ");
		}
	}
	
	
	
	/**
	 * 
	 * @param e
	 * @param customMessage
	 */
	private void setErrorLog(Exception e,String customMessage) {
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		emsg = customMessage+emsg;
		log.error(emsg);
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.ODS_TO_FUSION.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PROJECT.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.PROJECT_ODS_OSC_STG.getVal();
		
		errorLogDBaaSDao.logSyncError(objectName, direction, emsg, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
				, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK, this.getJobName()
				,tableName
				);
	}
	
	public void test() throws Exception {
		executeJob();
		
	}

}
