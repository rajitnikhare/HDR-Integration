package com.hdr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**JPA Model class representing the xxhdr_pa_osc_prsut_proj_ack table. 
 * @author Romesh Soni
 *
 */
@Entity(name="XXHDR_PJM_OSC_PRSUT_PROJ_ACK")
public class PursuitProjectAcklg {
	
	public String getProjectNumber() {
		return projectNumber;
	}


	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "etailerRaw_seq")
	@SequenceGenerator(name = "etailerRaw_seq", sequenceName = "XXHDR_PJM_OSC_PRSUT_PROJ_ACK_S", allocationSize = 1)
	@Column(name = "record_id")
	private Long recordId;
	
	@Column(name = "batch_key")
	private String batchKey;
	
	//EBS PROJECT ID
	@Column(name = "EBS_PROJECT_ID")
	private String ebsProjectId;

	//Store error message here.
	@Column(name = "STATUS_MESSAGE")
	private String statusMessage;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;
	
	/**
	 * @author jeevan
	 * DATED: 17-DEC-2015
	 * TIMED:3:06 AM
	 * NEW COLUMN ADDED
	 */
	@Column(name="PROJECT_NUMBER", length=255)
	private String projectNumber;
	
	
	@Column(name="OSC_OPPORTUNITY_ID")
	private String oscOpportunityId;

	@Column(name="PROCESS_STATE")
	private String processState;

	@Column(name="RETRY_COUNT")
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


	public String getEbsProjectId() {
		return ebsProjectId;
	}


	public void setEbsProjectId(String ebsProjectId) {
		this.ebsProjectId = ebsProjectId;
	}


	public String getOscOpportunityId() {
		return oscOpportunityId;
	}


	public void setOscOpportunityId(String oscOpportunityId) {
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


	
	
}
