package com.hdr.util;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;



public class DateUtils {
	
	private static Logger log = Logger.getLogger(DateUtils.class);
	private static String DB_FORMAT = "MM/dd/yyyy";
	
	// private static String FULL_CAL_FORMAT = "EEE, d MMM yyyy HH:mm:ss z";
	private static final String FULL_CAL_FORMAT = "MM/dd/yyyy HH:mm:ss";
	private static final DateFormat dateFormat = new SimpleDateFormat(FULL_CAL_FORMAT);
	private static final DateFormat defaultDateFormat = new SimpleDateFormat(DB_FORMAT);
	
	public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");
	private static final SimpleDateFormat sdf = new SimpleDateFormat(Constants.FUSION_DATE_FORMAT_UTC_WITH_NO_NANO_SECONDS);
	
	
	public static final SimpleDateFormat CONVERSIONRATEDATEFORMATE = new SimpleDateFormat("dd-MM-yy");
	
	public static final DateTimeFormatter CRMOD_DATE_TIME_FORMATTER = DateTimeFormat.forPattern("MM/dd/yyyy HH:mm:ss");
	public static final DateTimeFormatter CRMOD_DATE_FORMATTER = DateTimeFormat.forPattern("MM/dd/yyyy");
	
	public static final DateTimeFormatter DATE_TIMEZONE_FORMATTER = DateTimeFormat.forPattern("M/dd/yyyy hh:mm aaa z");
	
	private static final String SFDC_FORMAT = "yyyy-MM-dd";
	private static final SimpleDateFormat dateformat2 = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	private static final SimpleDateFormat dateOnlyFormat2 = new SimpleDateFormat("MM/dd/yyyy");
	private static final Calendar cal = Calendar.getInstance();
	private static final TimeZone t = TimeZone.getTimeZone("PT");
	
	
	public static java.util.Date sfdcTime(String dt) throws ParseException{
	
		java.util.Date oDate= dateformat2.parse(dt);
		
		
		return oDate; 
		
		
	}
	public static DateTime substractOneMinute(DateTime dt){
		return dt.minusMinutes(1);
	}
	
	/**
	 * Convert date from source time zone to destination time zone
	 * 
	 * @param date
	 * @param sourceTimeZone
	 * @param destinationTimeZone
	 * @return
	 */
	public static DateTime convertJodaTimezone(DateTime date, String sourceTimeZone, String destinationTimeZone) {
		  DateTime srcDateTime = date.toDateTime(DateTimeZone.forID(sourceTimeZone));
		  DateTime dstDateTime = srcDateTime.withZone(DateTimeZone.forID(destinationTimeZone));
		  return dstDateTime;
	}
	
	/**
	 * Convert the date stored in GMT to the time zone
	 * 
	 * @param date
	 * @param timezone
	 * @return
	 */
	public static Date getDateInTimeZone(Date date, String timezone){
		DateTime dt = new DateTime(date.getTime());
		dt = convertJodaTimezone(dt, DateTimeZone.UTC.getID(), timezone);
		return dt.toLocalDateTime().toDateTime().toDate();
		//return CRMOD_DATE_FORMATTER.print(dt);
	}
	
	
	/**
	 * Return the current time in GMT
	 * 
	 * @return
	 */
	public static Timestamp getCurrentTimestampInGMT(){
		DateTime dt = convertJodaTimezone(new DateTime(), DateTimeZone.getDefault().getID(), DateTimeZone.UTC.getID());
	    
	    return new Timestamp(dt.getMillis());
	}
	
	public static Timestamp toTimeStamp(String pattern, String dateStr) {
		DateFormat df = null;
		if (StringUtils.isBlank(pattern)) {
			df = defaultDateFormat;
		} else {
			df = new SimpleDateFormat(pattern);	
		}
		
		Date date = null;
		try {
			date = df.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return new Timestamp(date.getTime());
	}
	
	public static String toFullCalString(Date date) {
		return dateFormat.format(date);
	}
	public static String conversionDate(Date date) {
		return CONVERSIONRATEDATEFORMATE.format(date);
	}
	
	public static String toFullCalString(DateTime date) {
		return DATE_TIME_FORMATTER.print(date);
	}

	public static String currentDateAsStr(){
		return format(new Date(), null);
	}
	
	public static String format(Date date, String pattern) {
		String formattedDateAsStr = null;
		if (pattern == null || pattern.trim().equals("")) {
			formattedDateAsStr = defaultDateFormat.format(date);
		} else {
			try {
				DateFormat defDateFormat = new SimpleDateFormat(pattern);
				formattedDateAsStr = defDateFormat.format(date);
			} catch (Exception e) {
				formattedDateAsStr = defaultDateFormat.format(date);
			}
		}

		return formattedDateAsStr;
	}
	
	public static Date convertEpochToDate(String timeInLongFormat) {
		return new Date(new Long(timeInLongFormat));
	}
	
	public static Date addMonths(Date input, int months){
		Calendar cal = Calendar.getInstance();
		cal.setTime(input);
		cal.add(Calendar.MONTH, months);
		Date output = cal.getTime();
		return output;
	}
	
	public static void main(String []args){
		//addMonths(new Date(), 12);
		
        Long currentTimeInMillis = System.currentTimeMillis();
		
		
		DateTime x = DateUtils.changeGivenTimeToGMT(currentTimeInMillis);
		
		
		x=x.plusDays(-10);
		
		
	}
	

	public static DateTime convertDateToTimezone(Date date, String sourceTimeZone, String destinationTimeZone) {
		  DateTime jodaTime = new DateTime(date.getTime());
		  DateTime srcDate = jodaTime.toDateTime(DateTimeZone.forID(sourceTimeZone));
		  DateTime dstDate = srcDate.withZone(DateTimeZone.forID(destinationTimeZone));
		  return dstDate;
	}
	
	public static Timestamp getTimestampFromUtilDate(java.util.Date date){
		Timestamp ts = null;
		if (date!=null){
			ts = new Timestamp(date.getTime());
		}
		return ts;
	}
	


	
	/**
	 * 
	 * @param date
	 * @return
	 */

	
	public static XMLGregorianCalendar getXMLGregorianCalendarBySQLDate(Date date){
		if(date!=null){
			try {
				GregorianCalendar c = new GregorianCalendar();
				c.setTime(date);
				XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
				return date2;

			} catch (DatatypeConfigurationException e) {
				log.error("error while setting converting date");
			}
		}
		
		return null;
	}
	
	public static XMLGregorianCalendar getXMLGregorianCalendar(String dateStr)
	{
		try 
		{
			GregorianCalendar c = new GregorianCalendar();
			SimpleDateFormat sf = new SimpleDateFormat("YYYY-MM-DD");
			
			c.setTimeInMillis(sf.parse(dateStr).getTime());

			XMLGregorianCalendar date2 
			= DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			return date2;
			
		} catch (Exception e) {
			log.error("error while setting converting date",e);
		}
		return null;
	}
	
	public static DateTime getCurrentTimeInGMT()
	{
		DateTime current_timestamp_in_utc = new DateTime(System.currentTimeMillis(), DateTimeZone.UTC);
		return current_timestamp_in_utc;
	}
	
	public static DateTime changeGivenTimeToGMT(Long timeMillis)
	{
		DateTime current_timestamp_in_utc = new DateTime(timeMillis, DateTimeZone.UTC);
		return current_timestamp_in_utc;
	}
	//EQUITY
	public static XMLGregorianCalendar getXMLGregorianCalendarBySQLDate(java.sql.Date sqlDate)
	{
		try 
		{
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(sqlDate);

			XMLGregorianCalendar date2 
			= DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			return date2;
			
		} catch (DatatypeConfigurationException e) {
			log.error("error while setting converting date");
		}
		return null;
	}
	
	public static XMLGregorianCalendar getXMLGregorianCalendarByUtilDate(java.util.Date sqlDate) throws ParseException
	{
		try 
		{	
	
			GregorianCalendar c = (GregorianCalendar) GregorianCalendar.getInstance();
			/*cal.setTimeZone(t);*/
			cal.setTime(sqlDate);
			//cal.add(Calendar.DAY_OF_MONTH,1);
			c.setTime(cal.getTime());
			XMLGregorianCalendar date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			
			return date2;
			
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
			log.error("error while setting converting date");
		}
		return null;
	}
	
	public static String getCRMPODTimeZOneConvertedTime(Date date) throws Exception {
		if(date!=null){
			try {
			sdf.setTimeZone(TimeZone.getTimeZone("CDT"));
			log.info(sdf.format(date));
			return sdf.format(date);
			} catch (Exception e) {
				log.error("Error Occured whilw fixing time",e);
				throw e;
			}
				
		}
		return null;
		
		
	}
	
	public static Timestamp xmlGregorianCalendarToTimestamp(XMLGregorianCalendar xmlCal) {
		
		  if(xmlCal==null)return null;
		
		  
		  Timestamp timestamp = new Timestamp(xmlCal.toGregorianCalendar()
		   .getTimeInMillis());
		  
		  BigDecimal fr=null;
		  BigDecimal fr2=null;
		  if(xmlCal.getFractionalSecond()!=null)
		  {
		  fr = xmlCal.getFractionalSecond();
		  fr2 = fr.multiply(new BigDecimal("1E9"));
		  timestamp.setNanos(fr2.intValue());
		  }
		  
		  DateTimeZone inTimeZone = DateTimeZone.getDefault();
		  long utc = inTimeZone.convertLocalToUTC(timestamp.getTime(), false);
		  Timestamp newTs = new Timestamp(utc);
		  if(fr2!=null)
		  newTs.setNanos(fr2.intValue());
		  
		  return newTs;
		 }	
	public static String formatGivenTimestampToFusionFormat(Timestamp dateIn)
	{
		String timeAsISO1=null;
			
			if(dateIn!=null)
			{
		        String ISO8601_FORMAT = Constants.FUSION_DATE_FORMAT_UTC_WITH_NO_NANO_SECONDS;
		        SimpleDateFormat df = new SimpleDateFormat(ISO8601_FORMAT);
		        if(!TimeZone.getDefault().getID().equals("UTC")) 
		        {
		          df.setTimeZone(TimeZone.getTimeZone(Constants.FUSION_TIMEZONE));
		        }
		        
		        timeAsISO1 = df.format(dateIn.getTime()) + dateIn.getNanos();
			}
		return timeAsISO1;
		
	}
	public static Date incrementAndGetDate(int i, Date date) throws Exception {
		try {
			Calendar c = Calendar.getInstance();
			c.setTime(date);
			c.add(Calendar.DATE, i);
			return c.getTime();
		} catch (Exception e) {
			log.error("Error occured while incrementing date",e);
			throw e;
		}
	}

	
}
