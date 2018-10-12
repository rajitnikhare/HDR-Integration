package com.hdr.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

public class SereneUtil {
	
	private static Logger log = Logger.getLogger(SereneUtil.class);
	
	private static SimpleDateFormat ws1DateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

	public static String getExceptionMessageWithCauses(Exception ex) {
		try {
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			return sw.toString();
		} catch (Exception e) {
			return null;
		}
	}
	
	
	public static String getInterpretationOfCRMOnDemandErrorMsg(String errorStack) {
		if(errorStack != null){
			String keyList = PropFileUtil.getValue("KEY_LIST");
			List<String> list = new ArrayList<String>(Arrays.asList(keyList.split(" , ")));
			for (String key : list) {
				if(errorStack.contains(key)) {
					errorStack = errorStack.replaceAll(key, PropFileUtil.getValue(key));
				}
			}
			errorStack = errorStack.length() > 2000 ? errorStack.substring(0,2000) : errorStack;
		}
		return errorStack;
	}

	public static String getWS1Date(Date date) {
		try {
			 return date != null ? ws1DateFormat.format(date) : null;
		} catch(Exception ex) {
			log.error("Unable to format date", ex);
			return null;
		}
	}

	/*public static Date getTimeObjectInCRMODZone() {
		TimeZone.setDefault(TimeZone.getTimeZone(ConfigUtil.getProperty("crmod.user.timezone")));
	    Date date = new Date();
		return date;
		
	}*/
	
	/**
	 * Subjects
	 * @return
	 */
	public static String getGenericErrorNotificationSummary(){
		return "[Cavium-Integration Error Notification Email]";
	}
	

	public static String getSummaryStatus() {
		return "[Cavium-Integration Completion Mail]";
	}

	public static String getSummaryTestStatus() {
		return "[Cavium-Integration Test Mail]";
	}


	public static String getProductCreateNotificationSummary() {
		return "[Cavium-Product Create Notification]";
	}


	public static String getSummaryGenericErrorStatus() {
		return "[Cavium-Error In Sync]";
	}
	
	public static String getAggressiveModeStatus() {
		return "[Cavium-Aggressive Mode]";
	}


	public static String getSummaryStatusJob() {
		
		return "[Cavium-Summary Notification Mail]";
	}

	public static String getObjectSpecificSummaryStatusJob(String objectName) {
		
		return "Cavium "+objectName+" Create/Update";
	}

	
	public static String getAccountAlterNotificationSummary() {
		return "[Cavium-Account Alter Notification Mail]";
	}

	
}
