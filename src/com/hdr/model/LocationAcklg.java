package com.hdr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="xxhdr_hz_osc_cust_site_ack")
public class LocationAcklg {
	@Id
	@Column(name = "record_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long recordId;

	@Column(name = "batch_key", length = 240)
	private String batchKey;

	@Column(name = "osc_party_id")
	private Long oscPartyId;

	@Column(name = "osc_site_id")
	private Long oscSiteId;
	
	@Column(name = "bill_to_site_status", length = 1)
	private String billToSiteStatus;
	
	@Column(name = "ship_to_site_status", length = 1)
	private String shipToSiteStatus;
	
	@Column(name = "ebs_party_id")
	private Long ebsPartyId;
	
	@Column(name = "ebs_account_id")
	private Long ebsAccountId;

	@Column(name = "ebs_location_id")
	private Long ebsLocationId;

	@Column(name = "ebs_party_site_id")
	private Long ebsPartySiteId;

	@Column(name = "ebs_cust_acct_site_id")
	private Long ebsCustAcctSiteId;

	@Column(name = "ebs_bill_site_use_id")
	private Long ebsBillSiteUseId;

	@Column(name = "ebs_ship_site_use_id")
	private Long ebsShipSiteUseId;
	
	@Column(name = "dataSource", length = 50)
	private String dataSource;

	@Column(name = "dataTarget", length = 50)
	private String dataTarget;
	
	
	@Column(name = "status_code", length = 1)
	private String statusCode;

	@Column(name = "status_message", length = 4000)
	private String statusMessage;
	
	@Column(name = "reprocessing_status", length = 1)
	private String reprocessingStatus;

	@Column(name = "oracle_session_id")
	private Long oracleSessionId;
	
	@Column(name="retry_count")
	private Long retryCount;
	
	@Column(name = "request_id")
	private Long requestId;
	
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

	public Long getOscPartyId() {
		return oscPartyId;
	}

	public void setOscPartyId(Long oscPartyId) {
		this.oscPartyId = oscPartyId;
	}

	public Long getOscSiteId() {
		return oscSiteId;
	}

	public void setOscSiteId(Long oscSiteId) {
		this.oscSiteId = oscSiteId;
	}

	public String getBillToSiteStatus() {
		return billToSiteStatus;
	}

	public void setBillToSiteStatus(String billToSiteStatus) {
		this.billToSiteStatus = billToSiteStatus;
	}

	public String getShipToSiteStatus() {
		return shipToSiteStatus;
	}

	public void setShipToSiteStatus(String shipToSiteStatus) {
		this.shipToSiteStatus = shipToSiteStatus;
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

	public Long getEbsLocationId() {
		return ebsLocationId;
	}

	public void setEbsLocationId(Long ebsLocationId) {
		this.ebsLocationId = ebsLocationId;
	}

	public Long getEbsPartySiteId() {
		return ebsPartySiteId;
	}

	public void setEbsPartySiteId(Long ebsPartySiteId) {
		this.ebsPartySiteId = ebsPartySiteId;
	}

	public Long getEbsCustAcctSiteId() {
		return ebsCustAcctSiteId;
	}

	public void setEbsCustAcctSiteId(Long ebsCustAcctSiteId) {
		this.ebsCustAcctSiteId = ebsCustAcctSiteId;
	}

	public Long getEbsBillSiteUseId() {
		return ebsBillSiteUseId;
	}

	public void setEbsBillSiteUseId(Long ebsBillSiteUseId) {
		this.ebsBillSiteUseId = ebsBillSiteUseId;
	}

	public Long getEbsShipSiteUseId() {
		return ebsShipSiteUseId;
	}

	public void setEbsShipSiteUseId(Long ebsShipSiteUseId) {
		this.ebsShipSiteUseId = ebsShipSiteUseId;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDataTarget() {
		return dataTarget;
	}

	public void setDataTarget(String dataTarget) {
		this.dataTarget = dataTarget;
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

	public Long getRetryCount() {
		return retryCount;
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

