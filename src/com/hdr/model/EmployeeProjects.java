package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

@Entity(name="XXHDR_IN_EMPLOYEE_PROJECTS_STG")
@IdClass(EmployeeProjectsCompositeKey.class)
public class EmployeeProjects {
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
	
	@Id
	@Column(name="PROJECT_ID")
	private Long projectId;
	
	@Column(name="CONTRACT_NAME", length=240)
	private String contractName;
	
	@Column(name="CLIENT_NAME", length=240)
	private String clientName;
	
	@Column(name="PROJECT_ROLE", length=240)
	private String projectRole;
	
	@Column(name="PROJECT_DESCRIPTION", length=240)
	private String description;
	
	@Column(name="PROJECT_STATUS", length=240)
	private String status;
	
	@Column(name="PROJECT_LAST_ACTIVITY_DATE")
	private Date projectLastActivityDate;
	
	@Column(name="HOURS_CHARGED")
	private Long hoursCharged;
	
	@Column(name="MASTER_CONTRACT_NAME", length=240)
	private String masterContractName;
	
	@Column(name="PROCESS_STATE", length=30)
	private String processState;
	
	@Column(name="RETRY_COUNT")
	private Long retryCount;
	
	@Column(name="ERROR_MESSAGE", length=2000)
	private String errorMessage;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date createdTimeStamp;
	
	@Column(name="MODIFIED_TIMESTAMP")
	private Date modifiedTimeStamp;
	
	@Column(name="PROJECT_NUMBER",length=25)
	private String projectNumber;
	
	@Transient
	private String operation;

	@Transient
	private BigDecimal oscEmployeeProjectId;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getProjectRole() {
		return projectRole;
	}

	public void setProjectRole(String projectRole) {
		this.projectRole = projectRole;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getProjectLastActivityDate() {
		return projectLastActivityDate;
	}

	public void setProjectLastActivityDate(Date projectLastActivityDate) {
		this.projectLastActivityDate = projectLastActivityDate;
	}

	public Long getHoursCharged() {
		return hoursCharged;
	}

	public void setHoursCharged(Long hoursCharged) {
		this.hoursCharged = hoursCharged;
	}

	public String getMasterContractName() {
		return masterContractName;
	}

	public void setMasterContractName(String masterContractName) {
		this.masterContractName = masterContractName;
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

	public String getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public Date getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}

	public void setModifiedTimeStamp(Date modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public BigDecimal getOscEmployeeProjectId() {
		return oscEmployeeProjectId;
	}

	public void setOscEmployeeProjectId(BigDecimal oscEmployeeProjectId) {
		this.oscEmployeeProjectId = oscEmployeeProjectId;
	}
	

	
	
}
