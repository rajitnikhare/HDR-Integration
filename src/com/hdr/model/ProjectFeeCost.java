package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;
import javax.print.attribute.standard.MediaSize.NA;

@Entity(name="XXHDR_IN_PROJECT_FEE_COST_STG")
@IdClass(ProjectFeeCostCompositekey.class)
public class ProjectFeeCost {
	
	@Id
	@Column(name="PROJECT_ID")
	private Long projectId;
	
	@Column(name="ESTIMATED_COST")
	private Long estimatedCost ;
	
	@Column(name="ACTUAL_COST")
	private Long actualCost;
	
	@Column(name="DESCRIPTION" , length=30)
	private String description;
	
	@Id
	@Column(name="COST_FEE_ID")
	private Long costFeeId;
	
	@Column(name="PROCESS_STATE" , length=30)
	private String processState ;
	
	@Column(name="RETRY_COUNT")
	private Long retryCount;
	
	@Column(name="ERROR_MESSAGE" , length=2000)
	private String errorMessage;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date createdTimestamp;
	
	
	@Column(name="MODIFIED_TIMESTAMP")
	private Date modifiedtimestamp;

	@Transient
	private String operation;
	
	@Transient
	private BigDecimal costFeesOSCId;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getEstimatedCost() {
		return estimatedCost;
	}

	public void setEstimatedCost(Long estimatedCost) {
		this.estimatedCost = estimatedCost;
	}

	public Long getActualCost() {
		return actualCost;
	}

	public void setActualCost(Long actualCost) {
		this.actualCost = actualCost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getCostFeeId() {
		return costFeeId;
	}

	public void setCostFeeId(Long costFeeId) {
		this.costFeeId = costFeeId;
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

	public Date getModifiedtimestamp() {
		return modifiedtimestamp;
	}

	public void setModifiedtimestamp(Date modifiedtimestamp) {
		this.modifiedtimestamp = modifiedtimestamp;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public BigDecimal getCostFeesOSCId() {
		return costFeesOSCId;
	}

	public void setCostFeesOSCId(BigDecimal costFeesOSCId) {
		this.costFeesOSCId = costFeesOSCId;
	}

	
	
	
}
