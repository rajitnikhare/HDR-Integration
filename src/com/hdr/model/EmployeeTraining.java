package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

@Entity(name="XXHDR_IN_EMPLOYEE_TRN_STG")
@IdClass(EmployeeTrainingCompositeKey.class)
public class EmployeeTraining {
	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
    
	//
	@Id
	@Column(name="TRAINING_SESSION_ID")
	private Long trainingSessionId;
	
	@Id
	@Column(name="TRAINING_TYPE_CODE", length=50)
	private String trainingTypeCode;

	@Column(name="CLASS_SESSION_NAME", length=200)
	private String classSessionName;
	
	@Column(name="SESSION_COMPLETION_DATE")
	private Date sessionCompletionDate;
	
	
	@Column(name="COMPLETION_STATUS_DESCR", length=50)
	private String completionStatusDescr;

	@Column(name="INTERNAL_EXTERNAL_IND", length=30)
	private String internalExternalInd;
	
	@Column(name="MODIFIED_TIMESTAMP")
	private Date modifiedTimeStamp;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date createdTimeStamp;
	
	@Column(name="PROCESS_STATE", length=30)
	private String processState;
	
	@Column(name="ERROR_MESSAGE", length=2000)
	private String errorMessage;//2000

	@Column(name="RETRY_COUNT")
	private Long retryCount;
	
	
	@Transient
	private String operation;
	
	@Transient
	private BigDecimal oscTrainingId;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getTrainingSessionId() {
		return trainingSessionId;
	}

	public void setTrainingSessionId(Long trainingSessionId) {
		this.trainingSessionId = trainingSessionId;
	}

	public Date getSessionCompletionDate() {
		return sessionCompletionDate;
	}

	public void setSessionCompletionDate(Date sessionCompletionDate) {
		this.sessionCompletionDate = sessionCompletionDate;
	}

	public String getClassSessionName() {
		return classSessionName;
	}

	public void setClassSessionName(String classSessionName) {
		this.classSessionName = classSessionName;
	}

	public String getCompletionStatusDescr() {
		return completionStatusDescr;
	}

	public void setCompletionStatusDescr(String completionStatusDescr) {
		this.completionStatusDescr = completionStatusDescr;
	}

	public String getInternalExternalInd() {
		return internalExternalInd;
	}

	public void setInternalExternalInd(String internalExternalInd) {
		this.internalExternalInd = internalExternalInd;
	}

	public Date getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}

	public void setModifiedTimeStamp(Date modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}

	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getTrainingTypeCode() {
		return trainingTypeCode;
	}

	public void setTrainingTypeCode(String trainingTypeCode) {
		this.trainingTypeCode = trainingTypeCode;
	}

	public Long getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public BigDecimal getOscTrainingId() {
		return oscTrainingId;
	}

	public void setOscTrainingId(BigDecimal oscTrainingId) {
		this.oscTrainingId = oscTrainingId;
	}
	
	
}
