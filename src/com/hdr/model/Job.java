package com.hdr.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity(name="I_INTEGRATION_JOB")
public class Job implements GenericModel {

	@Id
	@Column(name="job_name")
	private String jobName ;
	
	@Column
	private String description ;
	
	@Column
	@Type(type="yes_no")
	private Boolean active ;
	
	@Column
	private String status ;
	
	@Column(name="last_run")
	//@Temporal(TemporalType.TIMESTAMP)
	private Timestamp lastRun ;
	
	@Column(name="error_log")
	private String errorLog ;
	
	@Column
	@Type(type="yes_no")
	private boolean enableNotification ;
	
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getLastRun() {
		return lastRun;
	}
	public void setLastRun(Timestamp lastRun) {
		this.lastRun = lastRun;
	}
	public String getErrorLog() {
		return errorLog;
	}
	public void setErrorLog(String errorLog) {
		this.errorLog = errorLog;
	}
	public boolean isEnableNotification() {
		return enableNotification;
	}
	public void setEnableNotification(boolean enableNotification) {
		this.enableNotification = enableNotification;
	}

}
