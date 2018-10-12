package com.hdr.job;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.mail.MessagingException;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hdr.mail.MailManager;
import com.hdr.model.ErrorLog;
import com.hdr.model.Job;
import com.hdr.service.EntityService;
import com.hdr.util.Constants;


public abstract class AbstractSpringJob {
	
	private static final Logger log = Logger.getLogger(AbstractSpringJob.class);
	
	private String jobName ; 

	@Resource(name="entityServiceImplDBaaS")
	private EntityService entityService ;
	
	final String DISPLAY_NAME_FOR_PROCESS="AbstractSpringJob";
	
	@Resource
	MailManager mailManager;

	Map<String,Object> errorData = new HashMap<String,Object>(); 
	
	List<ErrorLog> errors = new ArrayList(); 

	protected boolean sendEmail;
	
	public boolean isSendEmail() {
		return sendEmail;
	}

	public void setSendEmail(boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	public MailManager getMailManager() {
		return mailManager;
	}

	public void setMailManager(MailManager mailManager) {
		this.mailManager = mailManager;
	}

	public List<ErrorLog> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorLog> errors) {
		this.errors = errors;
	}

	public EntityService getEntityService() {
		return entityService;
	}

	public void setEntityService(EntityService entityService) {
		this.entityService = entityService;
	}

	public String getJobName() {
		if (StringUtils.isBlank(jobName)) {
			log.info("jobName not defined, taking default jobName as class name ");
			jobName =  this.getClass().getSimpleName();
		}
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public void executeInternal() throws Exception {
		log.info(">"+getJobName());
		errors = new ArrayList();
		try {			
			if (isJobEnable()) 
			{
				executeJob();	
				log.info("Job executed successfully");
				logJobProcess(null);
			} 
			else 
			{
				log.info("skipping the job " + jobName + " is disabled");				
			}
			
		} catch (Exception e) {
			try {
				log.error("Error in scheduler: " +  this.getClass().getName(),e);
			} catch (Exception e1) {
				log.error("Error while logging error message for the job " + this.getClass().getName(),e);
			}
		} finally {
			
		}
		log.info("<"+getJobName());
	}
	
	private String getErrorMessage(String fullStackTrace) {
		if(fullStackTrace != null && fullStackTrace.length() > 2000) {
			return fullStackTrace.substring(0, 2000);
		}
		return fullStackTrace;
	}

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	protected boolean isJobEnable() throws Exception {
		Job job  = entityService.get(Job.class,getJobName());
		if (job == null) {
			// create new record
			job = new Job();
			job.setActive(true);
			job.setEnableNotification(true);
			job.setJobName(getJobName());
			entityService.save(job);
		}
		return job.isActive();
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	protected void logJobProcess(String errorMessage) throws Exception{
		//log.debug(">>logJobProcess");
		Job job  = entityService.get(Job.class, getJobName());
		 java.util.Date date= new java.util.Date();
		job.setLastRun(new Timestamp(date.getTime()));
		
		if (errorMessage == null) {
			job.setStatus(Constants.SYNC_STATUS.COMPLETED.getVal());
			job.setErrorLog(null);
		} else {
			job.setStatus(Constants.SYNC_STATUS.ERROR.getVal());
			log.info("Error message : " + errorMessage + " with length : " + errorMessage.length());
			job.setErrorLog(errorMessage);
		}
		entityService.save(job);
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	private void sendEmailOnError() throws MessagingException  {/*
		if (!errors.isEmpty() && sendEmail) {
			errorData.put("errors", errors);
			errorData.put("jobName", getJobName());
			mailManager.sendMail(CommonUtil.getSystemPropertyValue("fromEmailId"), CommonUtil.getSystemPropertyValue("toEmailId").split(","), "Error while running job " + getJobName(), "template/crm_to_staging.vm", errorData);
		}
	*/}
	
	/**
	 * Perform the job
	 * 
	 * @param context
	 * @throws Exception 
	 */
	protected abstract void executeJob() throws Exception;
	
	protected String getLastRunTimestamp() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		Job job = getEntityService().get(Job.class, getJobName());
		Date lastRunTimestamp = job == null ? null : job.getLastRun();
		return lastRunTimestamp == null ? null : dateFormat.format(lastRunTimestamp);
	}
	
	protected Timestamp getLastRunTimestampDate() {
		Job job = getEntityService().get(Job.class, getJobName());
		Timestamp lastRunTimestamp = job == null ? null : job.getLastRun();
		return lastRunTimestamp == null ? null : lastRunTimestamp;
	}
}
