
package com.hdr.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;

@Entity(name = "xxhdr_hz_osc_cust_party_stg")
public class Company {
	//WORKING MODE
	 @Id
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cust_seq_gen")
	 @SequenceGenerator(name = "cust_seq_gen",  sequenceName = "XXHDR_HZ_OSC_CUST_PARTY_STG_S" , allocationSize = 1)
	 @Column(name = "record_id",nullable=false)
	 private Long recordId;

	@Column(name = "batch_key", length = 240)
	private String batchKey;

	@Column(name = "osc_parent_id")
	private Long oscParentId;

	@Column(name = "organization_name", length = 360)
	private String organizationName;

/*	@Column(name = "party_status", length = 1)
	private String partyStatus;*/

	@Column(name = "osc_party_id")
	private Long oscPartyId;

	@Column(name = "account_description", length = 240)
	private String accountDescription;

	@Column(name = "classification", length = 30)
	private String classification;

	/*@Column(name = "account_status", length = 1)
	private String accountStatus;*/

	@Column(name = "registry_id", length = 30)
	private String registryId;

	@Column(name = "ebs_party_id")
	private Long ebsPartyId;

	@Column(name = "profile_class", length = 30)
	private String profileClass;

	@Column(name = "account_type", length = 30)
	private String accountType;

	@Column(name = "account_number", length = 30)
	private String accountNumber;

	@Column(name = "organization_type", length = 30)
	private String organizationType;

	@Column(name = "ebs_account_id")
	private Long ebsAccountId;

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

	@Column(name = "attribute6", length = 150)
	private String attribute6;

	@Column(name = "attribute7", length = 150)
	private String attribute7;

	@Column(name = "attribute8", length = 150)
	private String attribute8;

	@Column(name = "attribute9", length = 150)
	private String attribute9;

	@Column(name = "attribute10", length = 150)
	private String attribute10;

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

	@Column(name = "oracle_session_id")
	private Long oracleSessionId;

	@Column(name = "request_id")
	private Long requestId;

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
	
	@Transient
	private List<Location> locationList;

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

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}


	public Long getOscPartyId() {
		return oscPartyId;
	}

	public void setOscPartyId(Long oscPartyId) {
		this.oscPartyId = oscPartyId;
	}

	public String getAccountDescription() {
		return accountDescription;
	}

	public void setAccountDescription(String accountDescription) {
		this.accountDescription = accountDescription;
	}

	public String getClassification() {
		return classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
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

	public String getProfileClass() {
		return profileClass;
	}

	public void setProfileClass(String profileClass) {
		this.profileClass = profileClass;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public List<Location> getLocationList() {
		return locationList;
	}

	public void setLocationList(List<Location> locationList) {
		this.locationList = locationList;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public Long getEbsAccountId() {
		return ebsAccountId;
	}

	public void setEbsAccountId(Long ebsAccountId) {
		this.ebsAccountId = ebsAccountId;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
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

	public String getAttribute6() {
		return attribute6;
	}

	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	public String getAttribute7() {
		return attribute7;
	}

	public void setAttribute7(String attribute7) {
		this.attribute7 = attribute7;
	}

	public String getAttribute8() {
		return attribute8;
	}

	public void setAttribute8(String attribute8) {
		this.attribute8 = attribute8;
	}

	public String getAttribute9() {
		return attribute9;
	}

	public void setAttribute9(String attribute9) {
		this.attribute9 = attribute9;
	}

	public String getAttribute10() {
		return attribute10;
	}

	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
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

	public Long getOracleSessionId() {
		return oracleSessionId;
	}

	public void setOracleSessionId(Long oracleSessionId) {
		this.oracleSessionId = oracleSessionId;
	}

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
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
