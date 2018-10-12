package com.hdr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="I_POLLING_INFO")
public class PollingInfo {
	/**
	 * No Fields:4 
	 */
	@Id
	@Column(name = "JOB_NAME", length = 200)
	private String JobName;

	@Column(name = "LAST_RUN")
	private Date LastRun;

	@Column(name = "LAST_RUN_STRING", length = 30)
	private String LastRunString;

	@Column(name = "ERROR_MESSAGE", length = 2000)
	private String ErrorMessage;

	
	
	public String getJobName() {
		return JobName;
	}

	public void setJobName(String jobName) {
		JobName = jobName;
	}

	public Date getLastRun() {
		return LastRun;
	}

	public void setLastRun(Date lastRun) {
		LastRun = lastRun;
	}

	public String getLastRunString() {
		return LastRunString;
	}

	public void setLastRunString(String lastRunString) {
		LastRunString = lastRunString;
	}

	public String getErrorMessage() {
		return ErrorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		ErrorMessage = errorMessage;
	}

}
