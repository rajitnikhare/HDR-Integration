package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

@Entity(name="XXHDR_IN_PROJECT_SUBCONS_STG")
@IdClass(ProjectSubconsCompositeKey.class)
public class ProjectSubcons {
	
	@Id
	@Column(name="PROJECT_ID")
	private Long projectId;
	
	@Id
	@Column(name="SUBCONSULTANT_ID")
	private Long subconsultantId;
	
	@Column(name="SUBCONSULTANT_SERVICES",length=1000)
	private String subconsultantServices;
	
	@Column(name="COSTS")
	private Long costs;
	
	@Column(name="EBS_ACCOUNT_ID")
	private Long ebsAccountId;
	
	@Column(name="PROCESS_STATE",length=30)
	private String processState;
	
	@Column(name="RETRY_COUNT")
	private Long retryCount;
	
	@Column(name="ERROR_MESSAGE",length=2000)
	private String errorMessage ;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date createdTimestamp;
	
	@Column(name="MODIFIED_TIMESTAMP")
	private Date modifiedTimestamp;

	@Transient
	private String operation;
	
	@Transient
	private BigDecimal projectSubConOscId;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getSubconsultantId() {
		return subconsultantId;
	}

	public void setSubconsultantId(Long subconsultantId) {
		this.subconsultantId = subconsultantId;
	}

	public String getSubconsultantServices() {
		return subconsultantServices;
	}

	public void setSubconsultantServices(String subconsultantServices) {
		this.subconsultantServices = subconsultantServices;
	}

	public Long getCosts() {
		return costs;
	}

	public void setCosts(Long costs) {
		this.costs = costs;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public Long getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Date getModifiedTimestamp() {
		return modifiedTimestamp;
	}

	public void setModifiedTimestamp(Date modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public BigDecimal getProjectSubConOscId() {
		return projectSubConOscId;
	}

	public void setProjectSubConOscId(BigDecimal projectSubConOscId) {
		this.projectSubConOscId = projectSubConOscId;
	}

	public Long getEbsAccountId() {
		return ebsAccountId;
	}

	public void setEbsAccountId(Long ebsAccountId) {
		this.ebsAccountId = ebsAccountId;
	}
	
	
	
	
	
	
}
