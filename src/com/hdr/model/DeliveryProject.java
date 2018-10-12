package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JPA Model class representing the Delivery Project
 * XXHDR_PJM_OSC_DELVRY_PROJ_STG table.
 * 
 * @author Romesh Soni
 *
 */
@Entity(name = "XXHDR_PJM_OSC_DELVRY_PROJ_STG")
public class DeliveryProject {

	@Id
	@Column(name = "record_id")
	private Long recordId;

	@Column(name = "batch_key")
	private String batchKey;

	// DELIVERED PROJECT ID
	@Column(name = "DELIVERED_PROJECT_ID")
	private BigDecimal deliveredProjectId;
	
	
	@Column(name = "DELIVERED_PROJECT_NUM")
	private BigDecimal deliveredProjectNum;
	 
	public BigDecimal getDeliveredProjectNum() {
		return deliveredProjectNum;
	}

	public void setDeliveredProjectNum(BigDecimal deliveredProjectNum) {
		this.deliveredProjectNum = deliveredProjectNum;
	}

	@Column(name = "PURSUIT_PROJECT_ID")
	private BigDecimal pursuitProjectId;
	

	@Column(name = "OPPORTUNITY_ID")
	private BigDecimal oscOpportunityId;

	// Store error message here.
	@Column(name = "STATUS_MESSAGE")
	private String statusMessage;

	@Temporal(TemporalType.DATE)
	@Column(name = "LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name = "PROCESS_STATE")
	private String processState;

	@Column(name = "RETRY_COUNT")
	Integer retryCount;

	public Long getRecordId() {
		return recordId;
	}

	public void setRecordId(Long recordId) {
		this.recordId = recordId;
	}

	public String getBatchKey() {
		return batchKey;
	}

	public void setBatchKey(String batchKey) {
		this.batchKey = batchKey;
	}

	

	public BigDecimal getOscOpportunityId() {
		return oscOpportunityId;
	}

	public void setOscOpportunityId(BigDecimal oscOpportunityId) {
		this.oscOpportunityId = oscOpportunityId;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public Integer getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Integer retryCount) {
		this.retryCount = retryCount;
	}

	public BigDecimal getDeliveredProjectId() {
		return deliveredProjectId;
	}

	public void setDeliveredProjectId(BigDecimal deliveredProjectId) {
		this.deliveredProjectId = deliveredProjectId;
	}

	public BigDecimal getPursuitProjectId() {
		return pursuitProjectId;
	}

	public void setPursuitProjectId(BigDecimal pursuitProjectId) {
		this.pursuitProjectId = pursuitProjectId;
	}

	
}
