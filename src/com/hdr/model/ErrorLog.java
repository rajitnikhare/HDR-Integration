package com.hdr.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import com.hdr.constants.IErrorLogConstants;

/**Error log table for EBS and OSC integration jobs.
 * @author Romesh Soni
 *
 */
@Entity(name="EBS_OSC_ERROR_LOG")
public class ErrorLog {
	
	@Id
	@GenericGenerator(name="kaugen" , strategy="increment")
	@GeneratedValue(generator="kaugen")
	private Long id;
	
	@Column(name="object_name")
	private String objectName;

	@Column(name="table_name")
	private String tableName;

	private String direction;
	
	@Type(type="yes_no")
	private Boolean emailSent;
	
	private Timestamp errorTimestamp;
	
	//MAKE THE LENGTH SIMILAR TO EBS. FOR EBS ITS 4000 CHARS.
	@Column(name = "Error_Message",length=IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN)
	private String errorMessage;
	
	private String primaryFieldName;
	
	private String primaryFieldValue;
	
	@Column(name = "retry_count", columnDefinition = "int default 0")
	private Integer retryCount;
	
	@Column(name="job_name")
	private String jobName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	

	public String getObjectName() {
		return objectName;
	}

	public void setObjectName(String objectName) {
		this.objectName = objectName;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public Boolean getEmailSent() {
		return emailSent;
	}

	public void setEmailSent(Boolean emailSent) {
		this.emailSent = emailSent;
	}

	public Timestamp getErrorTimestamp() {
		return errorTimestamp;
	}

	public void setErrorTimestamp(Timestamp errorTimestamp) {
		this.errorTimestamp = errorTimestamp;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getPrimaryFieldName() {
		return primaryFieldName;
	}

	public void setPrimaryFieldName(String primaryFieldName) {
		this.primaryFieldName = primaryFieldName;
	}

	public String getPrimaryFieldValue() {
		return primaryFieldValue;
	}

	public void setPrimaryFieldValue(String primaryFieldValue) {
		this.primaryFieldValue = primaryFieldValue;
	}

	public Integer getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Integer retryCount) {
		this.retryCount = retryCount;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}
	

}
