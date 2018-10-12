package com.hdr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="xxhdr_hz_osc_cust_party_ack")
public class CompanyAcklg {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cust_seq_gen")
	 @SequenceGenerator(name = "cust_seq_gen",  sequenceName = "XXHDR_HZ_OSC_CUST_PARTY_STG_S" , allocationSize = 1)
	 @Column(name = "record_id",nullable=false)
	private Long recordId;
	
	@Column(name = "batch_key", length = 240)
	private String batchKey;
	
	@Column(name = "osc_parent_id")
	private Long oscParentId;
	
	@Column(name = "party_status", length = 1)
	private String partyStatus;
	
	@Column(name = "osc_party_id")
	private Long oscPartyId;
	
	@Column(name = "account_status", length = 1)
	private String accountStatus;
	
	@Column(name = "registry_id", length = 30)
	private String registryId;
	
	@Column(name = "ebs_party_id")
	private Long ebsPartyId;
	
	@Column(name = "account_number")
	private Long accountNumber;
	
	@Column(name = "ebs_account_id")
	private Long ebsAccountId;
	
	
	@Column(name = "dataSource", length = 50)
	private String data_source;

	@Column(name = "dataTarget", length = 50)
	private String data_target;

	@Column(name = "status_code", length = 1)
	private String statusCode;
	
	@Column(name = "status_message", length = 4000)
	private String statusMessage;
	
	@Column(name = "reprocessing_status", length = 1)
	private String reprocessingStatus;

	@Column(name="retry_count")
	private Long retryCount;
	
	@Column(name = "request_id")
	private Long requestId;
	
	@Column(name = "oracle_session_id")
	private Long oracleSessionId;
	
	@Column(name = "attribute1", length = 150)
	private String attribute1;

	@Column(name = "attribute2", length = 150)
	private String attribute2;

	@Column(name = "attribute3", length = 150)
	private String attribute3;

	@Column(name = "attribute4", length = 150)
	private String attribute4;

	@Column(name = "attribute5", length = 150)
	private String attribute5;
	
	@Column(name = "created_by")
	private Long createdBy;

	@Column(name = "creation_date")
	private Date createdDate;

	@Column(name = "last_update_date")
	private Date lastUpdatedDate;

	@Column(name = "last_updated_by")
	private Long lastUpdatedBy;

	@Column(name = "last_update_login")
	private Long lastUpdateLogin;
	
	@Column(name="process_state")
	private String processState;
	
	
	@Column(name="profile_class")
	private String profileClass;
	

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

	public Long getOscParentId() {
		return oscParentId;
	}

	public void setOscParentId(Long oscParentId) {
		this.oscParentId = oscParentId;
	}

	public String getPartyStatus() {
		return partyStatus;
	}

	public void setPartyStatus(String partyStatus) {
		this.partyStatus = partyStatus;
	}

	public Long getOscPartyId() {
		return oscPartyId;
	}

	public void setOscPartyId(Long oscPartyId) {
		this.oscPartyId = oscPartyId;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public String getRegistryId() {
		return registryId;
	}

	public void setRegistryId(String registryId) {
		this.registryId = registryId;
	}

	public Long getEbsPartyId() {
		return ebsPartyId;
	}

	public void setEbsPartyId(Long ebsPartyId) {
		this.ebsPartyId = ebsPartyId;
	}

	public Long getEbsAccountId() {
		return ebsAccountId;
	}

	public void setEbsAccountId(Long ebsAccountId) {
		this.ebsAccountId = ebsAccountId;
	}

	public String getData_source() {
		return data_source;
	}

	public void setData_source(String data_source) {
		this.data_source = data_source;
	}

	public String getData_target() {
		return data_target;
	}

	public void setData_target(String data_target) {
		this.data_target = data_target;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public String getReprocessingStatus() {
		return reprocessingStatus;
	}

	public void setReprocessingStatus(String reprocessingStatus) {
		this.reprocessingStatus = reprocessingStatus;
	}

	public Long getRetryCount() {
		return retryCount;
	}

	public String getProfileClass() {
		return profileClass;
	}

	public void setProfileClass(String profileClass) {
		this.profileClass = profileClass;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public Long getOracleSessionId() {
		return oracleSessionId;
	}

	public void setOracleSessionId(Long oracleSessionId) {
		this.oracleSessionId = oracleSessionId;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public Long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return attribute3;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}

	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Long getLastUpdateLogin() {
		return lastUpdateLogin;
	}

	public void setLastUpdateLogin(Long lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}

	
	



	
}
