package com.hdr.util;

import org.apache.commons.lang3.exception.ExceptionUtils;

/**
 * @author Romesh Soni
 *
 */
public class ErrorMsgUtil {

	public static String getErrorMsg_FixedChars_ForStagingTable(int numOfMaxCharsInERROR, Throwable e)
	{
		String strerror=getErrorMessage_fixChars_ForStagingTable(numOfMaxCharsInERROR,stackTraceToString(e));
		
		return strerror;
		
	}
	
	private static String getErrorMessage_fixChars_ForStagingTable(int numOfMaxCharsInERROR, String fullStackTrace) {
		
		if(fullStackTrace != null && fullStackTrace.length() > numOfMaxCharsInERROR) {
			return fullStackTrace.substring(0, numOfMaxCharsInERROR);
		}
		return fullStackTrace;
	}
	
	
	
	
	private static String stackTraceToString(Throwable e) {
		
		Throwable rootcause = ExceptionUtils.getRootCause(e);
		if(rootcause==null)
		{
			rootcause= e;
		}
		
		StringBuilder sb = new StringBuilder();
	    sb.append(rootcause.getMessage());
	    sb.append("\n");
	    for (StackTraceElement element : rootcause.getStackTrace()) {
	        sb.append(element.toString());
	        sb.append("\n");
	    }
	    return sb.toString();
	    
		
	}
	
}
