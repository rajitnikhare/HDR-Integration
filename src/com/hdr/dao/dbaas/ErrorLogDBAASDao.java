package com.hdr.dao.dbaas;

import java.sql.Timestamp;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.constants.IErrorLogConstants;
import com.hdr.model.ErrorLogForOdsOsc;
import com.hdr.service.EntityService;

/**Dao for ODS_OSC_ERROR_LOG TABLE
 * @author Romesh Soni
 *
 */
@Service
public class ErrorLogDBAASDao {

	private static final Logger log = Logger.getLogger(ErrorLogDBAASDao.class);

	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityService;

	/**
	 * {@inheritDoc}
	 */
	
	public void logSyncError(String objectName, String direction, String errorMessage, String primaryFieldName,
			String primaryFieldValue ,String jobName,String tableName) {
		
			ErrorLogForOdsOsc errorLog = new ErrorLogForOdsOsc();

			// set ObjectName
			if (objectName == null || objectName.equals("")) {
				errorLog.setObjectName(IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK);
			} else {
				errorLog.setObjectName(objectName);
			}
			// set direction
			if (direction == null || direction.equals("")) {
				errorLog.setDirection(IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.OTHER_GENERIC_EXCEPTIONS.toString());
			} else {
				errorLog.setDirection(direction);
			}
			// set emailSent as false
			errorLog.setEmailSent(false);
			// set errorTimeStamp
			errorLog.setErrorTimestamp(new Timestamp((new java.util.Date()).getTime()));

			// set errorMessage:
			if (null == errorMessage || errorMessage.isEmpty()) {
				errorLog.setErrorMessage(IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK);
			} else {
				errorLog.setErrorMessage(getErrorMessage(errorMessage));
			}

			// set primaryFieldName
			if (primaryFieldName == null || primaryFieldName.equals("")) {
				errorLog.setPrimaryFieldName(IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK);
			} else {
				errorLog.setPrimaryFieldName(primaryFieldName);
			}

			// set primaryFieldValue
			if (primaryFieldValue == null || primaryFieldValue.equals("")) {
				errorLog.setPrimaryFieldValue(IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK);
			} else {
				errorLog.setPrimaryFieldValue(primaryFieldValue);
			}

			errorLog.setTableName(tableName);
			
			errorLog.setJobName(jobName);
			entityService.save(errorLog);
		

	}

	/**
	 * get errorMessage within valid length w.r.t. table column
	 * 
	 * @param errorMessage
	 * @return
	 */
	private String getErrorMessage(String errorMessage) {
		if (errorMessage != null && errorMessage.length() > IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN) {
			//log.debug("Truncating errorMessage : " + errorMessage);
			return errorMessage.substring(0, IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN);
		}
		return errorMessage;
	}

	
	public void logSyncJobGenericError(Exception e, String DIRECTION,
			String PRIMARY_FIELD_NAME, String PRIMARY_FIELD_VALUE,
			String TABLE_NAME, String appendMsg, String DISPLAY_NAME_FOR_PROCESS,String objectName) {

		saveErrorLogObject(e, DIRECTION, PRIMARY_FIELD_NAME, PRIMARY_FIELD_VALUE, TABLE_NAME, appendMsg,DISPLAY_NAME_FOR_PROCESS,objectName);
	}
	
	public void saveErrorLogObject(Exception e, String DIRECTION,
			String PRIMARY_FIELD_NAME, String PRIMARY_FIELD_VALUE,
			String tableName,String appendMsg,String DISPLAY_NAME_FOR_PROCESS,String objectName)
	{
		if(
				
				 (PRIMARY_FIELD_NAME!=null&&!PRIMARY_FIELD_NAME.trim().equals(""))
				 			  )

			{		
		        ErrorLogForOdsOsc errorLog = new ErrorLogForOdsOsc();
				
				//new error_log entry
				if(DIRECTION==null||DIRECTION.equals(""))
					DIRECTION= IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.OTHER_GENERIC_EXCEPTIONS.toString();

				errorLog.setDirection(DIRECTION);
				errorLog.setEmailSent(false);
				errorLog.setErrorTimestamp(new Timestamp((new java.util.Date()).getTime()));
				
				if(PRIMARY_FIELD_NAME==null||PRIMARY_FIELD_NAME.equals(""))
					PRIMARY_FIELD_NAME=IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK;
				if(PRIMARY_FIELD_VALUE==null||PRIMARY_FIELD_VALUE.equals(""))
					PRIMARY_FIELD_VALUE=IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK;
				if(tableName ==null||tableName .equals(""))
					tableName =IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK;
				
				errorLog.setPrimaryFieldName(PRIMARY_FIELD_NAME);
				errorLog.setPrimaryFieldValue(PRIMARY_FIELD_VALUE);
				errorLog.setObjectName(objectName);
				errorLog.setTableName(tableName);
				
		        String strerror=getErrorMessage(stackTraceToString(e));
		        //log.info("e:"+e);
		        //log.info("strerror:"+strerror);
				
		        //some extra information needed to be appended?
		        if(appendMsg!=null)
		        	appendMsg=appendMsg+", ";
		        else
		        	appendMsg="";

		        if(DISPLAY_NAME_FOR_PROCESS!=null)
		        	DISPLAY_NAME_FOR_PROCESS=DISPLAY_NAME_FOR_PROCESS+", ";
		        else
		        	DISPLAY_NAME_FOR_PROCESS="";

		        
		        
				if(strerror!=null&&!strerror.trim().equals(""))
				errorLog.setErrorMessage(DISPLAY_NAME_FOR_PROCESS+appendMsg+strerror);
				else
					errorLog.setErrorMessage(DISPLAY_NAME_FOR_PROCESS+appendMsg+e.getMessage());
				
				
				entityService.save(errorLog);
			}
	}
	
	private String stackTraceToString(Throwable e) {
	    StringBuilder sb = new StringBuilder();
	    sb.append(e.getMessage());
	    sb.append("\n");
	    for (StackTraceElement element : e.getStackTrace()) {
	        sb.append(element.toString());
	        sb.append("\n");
	    }
	    return sb.toString();
	}

	
	
}
