package com.hdr.util;

import java.io.File;
import java.io.FilenameFilter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.hdr.constants.ILookUpConstants;
import com.hdr.mail.MailManager;
import com.hdr.model.Lookup;
import com.hdr.model.SystemProperty;
import com.hdr.service.EntityService;

@Component

public class CommonUtil {
	
	private static final Logger log = Logger.getLogger(CommonUtil.class);
	
	private static SimpleDateFormat fileTimestampFormat = new SimpleDateFormat("yyyyMMddHHmmss");
	
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	private static final String regex = "(?<=[\\d])(,)(?=[\\d])";
	
	private static EntityService entityService ;
	
	@Resource
	private MailManager mailManager;
	
	@Autowired
	private static ApplicationContext applicationContext;
	
	
	@Autowired(required = true)
	public void setApplicationContext(ApplicationContext applicationContext) {
		
		CommonUtil.applicationContext = applicationContext;
	}
	
	public static Object getServiceBeanByClass(Class clazz) throws BeansException, ClassNotFoundException
	{
		Object serviceDao =applicationContext.getBean(Class.forName(clazz.getName()));
		return serviceDao;
	}
	
	public static ApplicationContext getApplicationContext() {
		return applicationContext;
	}

	@Autowired(required = true)
	public void setEntityService(@Qualifier("entityServiceImplDBaaS") EntityService entityService) {
		CommonUtil.entityService = entityService;
	}
	
	public static SystemProperty getSystemProperty(String name) {
		return entityService.get(SystemProperty.class, name);
	}
	
	public static Lookup getLookUp(String entityName, String keyName) {
		List<Lookup> lst = entityService.findByNameQuery(ILookUpConstants.GET_LOOKUP_VALUE,new Object[] { entityName, keyName});
		if(lst!=null && lst.size()>0)return lst.get(0);
		return null; 
	}
	
	public static String getLookUpValue(String entityName, String keyName) {
		try {
			Lookup obj = getLookUp(entityName, keyName);
			if (obj == null) {
				return null ;
			}
			return obj.getValue();
		}
		catch(Exception ex) {
			log.error(" Error while system property ",ex);
		}
		return null ;
	}

	
	
	public static String getSystemPropertyValue(String name) {
		try {
			SystemProperty obj = getSystemProperty(name);
			if (obj == null) {
				return null ;
			}
			return obj.getKeyValue() ;
		}
		catch(Exception ex) {
			log.error(" Error while system property ",ex);
		}
		return null ;
	}
	
	
	public static String getLookUpValue(String entityName, String keyName,String defaultValue) {
		try {
			Lookup obj = getLookUp(entityName, keyName);
			if (obj == null) {
				return defaultValue ;
			}
			return obj.getValue();
		}
		catch(Exception ex) {
			log.error(" Error while system property ",ex);
		}
		return null ;
	}

	
	public static String getSystemPropertyValue(String name,String defaultValue) {
		try {
			SystemProperty obj = getSystemProperty(name);
			if (obj == null) {
				return defaultValue ;
			}
			return obj.getKeyValue() ;
		}
		catch(Exception ex) {
			log.error(" Error while system property ",ex);
		}
		return defaultValue ;
	}
	
	public static Timestamp deSerializerCrmodWS1Date(String date) {
		SimpleDateFormat sf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		try {
			Date d = sf.parse(date);
			return new Timestamp(d.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null ;
	}
	
	public static String serializerBoolean(boolean value) {
	      return value ? "Y" : "N";
	}	
	
	public static boolean deSerializerBoolean(String value) {
		if (value == null || value.equals("")) {
			return false ;	
		}
		return value.equals("Y") ? true : false;
	}
	
	public static String getExceptionMessageWithCauses(Exception ex) {
		try {
			StringWriter sw = new StringWriter();
			ex.printStackTrace(new PrintWriter(sw));
			if(sw.toString().length()>1998){
				return sw.toString().substring(0,1998);
			}
			return sw.toString();
		} catch (Exception e) {
			return null;
		}
	}
	
	public static String getExceptionMessageWithRootCause(Exception ex) {
		try {
			String exceptionSimplified = ExceptionUtils.getRootCauseMessage(ex);
			if(exceptionSimplified.length()>1998){
				return exceptionSimplified.toString().substring(0,1998);
			}
			return exceptionSimplified;
		} catch (Exception e) {
			return null;
		}
	}


	

	public static Date getFileTimeStamp(String fileName) {
		try {
			String[] fileNameDelimiters = fileName.split("_");
			String dateString = fileNameDelimiters[fileNameDelimiters.length - 2];
			String timeString = fileNameDelimiters[fileNameDelimiters.length - 1];
			return fileTimestampFormat.parse(dateString + "" + timeString);
		} catch (Exception ex) {
			log.error("Exception occurred while getting Date/Time from File " + fileName , ex);
		} 
		return null;
	}

	


	public void processTrailerLine(String trailerLine, int dataLineNumber, String fileName) {
		String totalRecordsInTrailer = trailerLine.substring(1, trailerLine.length());
		Integer totalRecords = Integer.valueOf(totalRecordsInTrailer);
		 if(totalRecords == dataLineNumber) {
			 log.info("Number of records processed are equal to number of records defined in trailer for file " + fileName);
		 } else {
			 //Do we need to send error notification here
			 log.error("Number of records processed are not equal to number of records defined in trailer of File " + fileName);
		 }
	}
	
	/**
	 * 
	 * @param statusu
	 * Jeevan: Cavium Implementation
	 */
	public static Boolean convertStringToBoolean(String status) {
		if(status!=null && StringUtils.isNotBlank(status)){
			if("Y".equalsIgnoreCase(status)){
				return Boolean.TRUE;
			}
		}
		return Boolean.FALSE;
	}

	/**
	 * Converts a non supoorted number to supported nuber
	 * @return 
	 * @throws Exception 
	 */
	public static String convertIntoNumberFormat(String unformattedNumber) throws Exception{
		try {
		if(unformattedNumber!=null && StringUtils.isNotBlank(unformattedNumber)){
		    	Pattern p = Pattern.compile(regex);
		    	Matcher m = p.matcher(unformattedNumber);
		    	unformattedNumber = m.replaceAll("");
		    	return unformattedNumber;
		}
		 	
		} catch (Exception e) {
			throw e;
		}
		return unformattedNumber;
	}
	
	public static BigDecimal convertStringtoBigDecimal(String unformattedNumber) throws Exception{
		try {
		if(unformattedNumber!=null && StringUtils.isNotBlank(unformattedNumber)){
		char[] b = CommonUtil.convertIntoNumberFormat(unformattedNumber).toCharArray();
		BigDecimal bd = new BigDecimal(b);
		return bd;
		
		}
		 	
		} catch (Exception e) {
			throw e;
		}
		return null;
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str) {
		try {
			int d = Integer.parseInt(str);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
	
}
