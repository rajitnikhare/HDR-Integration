package com.hdr.sync.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IConversionRateConstants;
import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.job.impl.CurrencyConversionEbsToOscSyncJob;
import com.hdr.model.BaseModel;
import com.hdr.model.ConversionRate;
import com.hdr.model.Job;
import com.hdr.service.ConversionServ;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EntityService;
import com.hdr.service.MailServ;
import com.hdr.sync.SyncObject;
import com.hdr.util.CommonUtil;
import com.hdr.util.Constants;
import com.hdr.util.DateUtils;
import com.hdr.util.ErrorMsgUtil;
import com.hdr.util.PropFileUtil;
import com.hdr.ws.stubs.customeObject.CurrencyDailyRateC;

@Repository("syncConversionEBSToOSC")
@Service
public class SyncConversionEBSToOSC implements SyncObject {
	/**
	 * Registering Logger for SyncCompanyOSCtoEBSAcklg.class
	 */
	private static final Logger log = Logger.getLogger(SyncConversionEBSToOSC.class);


	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;
	
	@Resource
	private DbUtilityServ dbutil;
	
	@Resource
	private ErrorLogDao errorLogDao;
	
	@Resource
	private ConversionServ conversionServ;
	
	@Resource
	private MailServ mailServ;
	
	public static final SimpleDateFormat CONVERSIONRATEDATEFORMATE = new SimpleDateFormat(IConversionRateConstants.DATE_FORMAT);
	public static final SimpleDateFormat CONVERSIONRATEDATEFORMATEOSC = new SimpleDateFormat(IConversionRateConstants.DATE_FORMAT_OSC);

	@Override
	public void syncObject() throws Exception {
		/**
		 * Query Integration Job and get Conversion Job Status
		 */
		List jobInfoLst = entityServiceDBaaS.findByNameQuery(IConversionRateConstants.GET_CONVERSION_JOB_STATUS_INFO);
		/**
		 * Preparing Last run and Job status value
		 */
		checkConditions(jobInfoLst);
		
	}
	/**
	 * 
	 * @param jobInfoLst
	 * @throws Exception
	 */
	private void checkConditions(List jobInfoLst) throws Exception {
		Date lastRunDateDb = null;
		String lastRunStatus = null;
		Job jobInfo = null;
		if (jobInfoLst != null && jobInfoLst.size() > 0) {
			jobInfo = (Job) jobInfoLst.get(0);
			lastRunDateDb = jobInfo.getLastRun();
			lastRunStatus = jobInfo.getDescription();
			if(lastRunStatus==null || StringUtils.isBlank(lastRunStatus)){
				lastRunStatus = Constants.SYNC_STATUS.ERROR.getVal();
			}
		}else{
			log.info("No entry in integration job table");
			log.info(">> Making new entry for next scheduled run");
			setJobStatus(Constants.SYNC_STATUS.ERROR.getVal());
			lastRunStatus= Constants.SYNC_STATUS.ERROR.getVal();
			log.info(">> New Entry Inserted");
		}
		/**
		 * Converting to a specific format = 'dd-MM-yy'
		 */
		String lastRunDate = null;
		String currentDate = CONVERSIONRATEDATEFORMATE.format(new Date());
		if (lastRunDateDb != null) {
			lastRunDate = CONVERSIONRATEDATEFORMATE.format(lastRunDateDb);
		} else {
			lastRunDate = CONVERSIONRATEDATEFORMATE.format(new Date());
		}
		log.info("Current Date:" + currentDate);
		log.info("Last Run Date:" + lastRunDate);
		/**
		 * If last run date is not equal to current date on which this job runs
		 * 1. Update last run to Current date 2. Process all the records 3.
		 * After processing increment the day by one day. 4. Process for the
		 * incremented date.
		 */
		if (checkCondition(lastRunStatus, lastRunDate, currentDate)) {
			processCurrentAndIncrementedDateRecords(jobInfo, currentDate);
		}else if (currentDate.equals(lastRunDate) && lastRunStatus.equalsIgnoreCase(Constants.SYNC_STATUS.COMPLETED.getVal())) {
			log.info("Skipping job as current date == last run date and status = 'COMPLETED'");
		}
	}
	private boolean checkCondition(String lastRunStatus, String lastRunDate, String currentDate) {
		return (!currentDate.equals(lastRunDate)) || (currentDate.equals(lastRunDate) && (lastRunStatus.equalsIgnoreCase(Constants.SYNC_STATUS.ERROR.getVal())|| lastRunStatus.equalsIgnoreCase(Constants.SYNC_STATUS.IN_PROGRESS.getVal())));
	}
	
	/**
	 * 
	 * @param jobInfo
	 * @param currentDate
	 * @throws Exception
	 */
	private void processCurrentAndIncrementedDateRecords(Job jobInfo, String currentDate) throws Exception {
		boolean isProcessErroredcurrentDate = false;
		boolean isProcessErroredcurrentDateAddOne = false;
		updateIntegrationJob(jobInfo,Constants.SYNC_STATUS.IN_PROGRESS.getVal());
		isProcessErroredcurrentDate = process(currentDate,false);
		isProcessErroredcurrentDateAddOne = process(CONVERSIONRATEDATEFORMATE.format(DateUtils.incrementAndGetDate(1,new Date())),true);
		if(isProcessErroredcurrentDate || isProcessErroredcurrentDateAddOne){
			setJobStatus(Constants.SYNC_STATUS.ERROR.getVal());
			sentNotificationMail();
		}else{
			setJobStatus(Constants.SYNC_STATUS.COMPLETED.getVal());
		}
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void sentNotificationMail(){
		Map m = new HashedMap();
		m.put("objectName", "CONVERSION");
		m.put("direction", "EBS to OSC");
		m.put("tableName", "GL_DAILY_RATES");
		m.put("error_log_table", "EBS_OSC_ERROR_LOG");
		m.put("hostAddress", PropFileUtil.getValue(Constants.FCRMOD_URL));
		m.put("loginId",  PropFileUtil.getValue(Constants.FCRMOD_USERNAME));
		try {
			mailServ.sendMail(CommonUtil.getSystemPropertyValue("EMAIL_NOTIFICATION_FROM"),CommonUtil.getSystemPropertyValue("EMAIL_NOTIFICATION_TO").split(","), m.get("direction")+ " - " +m.get("objectName"), "template/summary_email_notification_job_cr.vm",m);	
		} catch (Exception e) {
			log.error("Error occured while sending out notification mail",e); 		
		}
		
	}
	

	/**
	 * 
	 * @param j
	 * updates integration job
	 * @param status 
	 */
	private void updateIntegrationJob(Job j, String status) {
		if(j!=null){
			try {
				j.setLastRun(DateUtils.getTimestampFromUtilDate(new Date()));
				j.setDescription(status);
				entityServiceDBaaS.save(j);
			} catch (Exception e) {
				log.error("Error occured while update job info of conversion job",e);
			}
		}
	}


	private boolean process(String stringDate, boolean isIncremented) throws Exception {
		boolean isProcessErrored =false;
		try {
			log.info(stringDate.toUpperCase());
			@SuppressWarnings("unchecked")
			List<ConversionRate> conversionRates = entityServiceEBS.findByNameQuery(IConversionRateConstants.GET_UNPROCESSED_CONVERSION_RATES, new Object[] {stringDate.toUpperCase()},10000);
			if (conversionRates != null && conversionRates.size() > 0) {
				for (ConversionRate conversionRatesFromEBS : conversionRates) {
					try {
						log.info("upsert started");
						if(isIncremented)conversionRatesFromEBS.setIncremented(true);
						uploadConversionRateFromEBSTOOSC(conversionRatesFromEBS);
						log.info("upsert sucessfully completed");
					} catch (Exception e) {
						log.error("Error occured while syncing Conversion Rates to OSC",e);
						setErrorLog(e,"Error while syncing Conversion Rates in OSC from EBS to OSC. Trace: ",conversionRatesFromEBS);	
						isProcessErrored = true;
					}
				}
			}
		}
		catch (Exception e) {
			log.error("Error occured while syncing converstion Rate from EBS to OSC", e);
			setJobStatus(Constants.SYNC_STATUS.ERROR.getVal());
			isProcessErrored = true;
		}
		return isProcessErrored;
	}


	private void setJobStatus(String status) {
		Job job=new Job();
		job.setJobName("CurrencyConversionEbsToOscSyncJob");
		job.setDescription(status);
		job.setLastRun(DateUtils.getTimestampFromUtilDate(new Date()));
		job.setActive(true);
		job.setEnableNotification(true);
		entityServiceDBaaS.save(job);
		
	}


	private void uploadConversionRateFromEBSTOOSC(ConversionRate conversionRatesFromEBS) throws Exception {
		/**
		 * first check whether exists in osc or not by FROM_CURRENCY,TO_CURRENCY,CONVERSION_DATE 
		 * 
		 */
		if(conversionRatesFromEBS!=null){
			CurrencyDailyRateC cOsc =(CurrencyDailyRateC) conversionServ.find(getQueryParam(conversionRatesFromEBS));
				//currencyDailyRatesFromOSC =(CurrencyDailyRateC) conversionServ.find(toCurrency, fromCurrency,conversionDate.toString());
				if(cOsc!=null){
					conversionRatesFromEBS.setOscId(cOsc.getId());
					conversionServ.update(conversionRatesFromEBS);
				}else{
					//currencyDailyRatesToOSC=populateDataFromConversionFromEBSToCurrencyDailyRatesToOSC(conversionRatesFromEBS);
					conversionServ.create(conversionRatesFromEBS);
				   }
				}
	}

	private BaseModel getQueryParam(ConversionRate conversionRatesFromEBS) throws Exception {
		try {
			BaseModel o = new BaseModel();
			o.setFetchSize(1);
			o.setFetchStart(0);
			o.setViewCriteriaAttributeName(IConversionRateConstants.CONVERSIONRATE_FILED_TOCURRENCY);
			o.setViewCriteriaAttributeName2(IConversionRateConstants.CONVERSIONRATE_FILED_FROMCURRENCY);
			o.setViewCriteriaAttributeNameInner(IConversionRateConstants.CONVERSIONRATE_FILED_CONVERSIONDATE);
			
			o.setViewCriteriaAttributeValue(conversionRatesFromEBS.getToCurrency());
			o.setViewCriteriaAttributeValue2(conversionRatesFromEBS.getFromCurrency());
			o.setViewCriteriaAttributeValueInner(CONVERSIONRATEDATEFORMATEOSC.format(conversionRatesFromEBS.getConversionDate()));
			
			o.setOperator(Constants.FUSION_EQUALS_OPERATOR);
			
			List<String> attribList =  new ArrayList<String>();
			attribList.add("Id");
			o.setListOfAttribute(attribList);
			return o;
		} catch (Exception e) {
			throw e;
		}
	}
	
	
	private void setErrorLog( Exception e, String customeMessage,ConversionRate c) {
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		emsg = customeMessage+emsg;
		log.error(emsg);
		
		//mark the record failed in ack table
		//markRecordFailed(c, emsg);
		
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.CONVERSION.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.CONVERSION_ODS_OSC_STG.getVal();
		String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
		String primaryKeyValue = c.getFromCurrency() +" to " +c.getToCurrency();
		errorLogDao.logSyncError(objectName, direction
				, emsg
				, primaryKey
				, primaryKeyValue
				, CurrencyConversionEbsToOscSyncJob.class.getSimpleName()
				,tableName
				);
	}
	
	

}
