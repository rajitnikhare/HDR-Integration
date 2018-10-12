package com.hdr.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name= "XXHDR_IN_ACCOUNT_STG")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;

	@Column(name = "CLIENTACCT_EBS_ID")
	private Long clientAcctEbsId;

	@Column(name = "CLIENTACCT_NAME", length = 240)
	private String clientAcctName;

	@Column(name = "CLIENTACCT_EBS_PARTY_ID")
	private Long clientAcctEbsPartyId;

	@Column(name = "CLIENTPRTY_NAME", length = 240)
	private String clientPrtyName;

	@Column(name = "REGISTRY_ID")
	private Long registryId;;

	@Column(name = "CLIENTACCT_NUMBER")
	private Long clientAcctNumber;;

	@Column(name = "TYPE", length = 30)
	private String type;

	@Column(name = "PRIMARY_MARKET_SECTOR", length = 30)
	private String primaryMarketSector;

	@Column(name = "ADDRESS_LINE_1", length = 80)
	private String addressLie1;

	@Column(name = "CITY", length = 30)
	private String city;

	@Column(name = "STATE", length = 30)
	private String state;
	
	@Column(name = "COUNTRY", length = 30)
	private String country;


	@Column(name = "POSTAL_CODE", length = 30)
	private String postalCode;

	@Column(name = "LEGACY_ID", length = 25)
	private String legacyId;

	@Column(name = "PROCESS_STATE", length = 30)
	private String processState;

	@Column(name = "CREATED_TIMESTAMP")
	private Date createdTimestamp;

	@Column(name = "MODIFIED_TIMESTAMP")
	private Date modifiedDateTimeStamp;

	@Column(name = "ERROR_MESSAGE", length = 2000)
	private String errorMessage;

	@Column(name = "RETRY_COUNT")
	private Long retryCount;

	@Transient
	private boolean isChild;

	@Transient
	private String operation;

	@Transient
	private Long childOscId;

	@Transient
	private Long parentOscId;

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Long getClientAcctEbsId() {
		return clientAcctEbsId;
	}

	public void setClientAcctEbsId(Long clientAcctEbsId) {
		this.clientAcctEbsId = clientAcctEbsId;
	}

	public String getClientAcctName() {
		return clientAcctName;
	}

	public void setClientAcctName(String clientAcctName) {
		this.clientAcctName = clientAcctName;
	}

	public Long getClientAcctEbsPartyId() {
		return clientAcctEbsPartyId;
	}

	public void setClientAcctEbsPartyId(Long clientAcctEbsPartyId) {
		this.clientAcctEbsPartyId = clientAcctEbsPartyId;
	}

	public String getClientPrtyName() {
		return clientPrtyName;
	}

	public void setClientPrtyName(String clientPrtyName) {
		this.clientPrtyName = clientPrtyName;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}

	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}

	public Date getModifiedDateTimeStamp() {
		return modifiedDateTimeStamp;
	}

	public void setModifiedDateTimeStamp(Date modifiedDateTimeStamp) {
		this.modifiedDateTimeStamp = modifiedDateTimeStamp;
	}

	public Long getChildOscId() {
		return childOscId;
	}

	public void setChildOscId(Long childOscId) {
		this.childOscId = childOscId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public boolean isChild() {
		return isChild;
	}

	public void setChild(boolean isChild) {
		this.isChild = isChild;
	}

	public Long getParentOscId() {
		return parentOscId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPrimaryMarketSector() {
		return primaryMarketSector;
	}

	public void setPrimaryMarketSector(String primaryMarketSector) {
		this.primaryMarketSector = primaryMarketSector;
	}

	public String getAddressLie1() {
		return addressLie1;
	}

	public void setAddressLie1(String addressLie1) {
		this.addressLie1 = addressLie1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setParentOscId(Long parentOscId) {
		this.parentOscId = parentOscId;
	}

	public Long getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	public String getLegacyId() {
		return legacyId;
	}

	public void setLegacyId(String legacyId) {
		this.legacyId = legacyId;
	}

	public Long getRegistryId() {
		return registryId;
	}

	public void setRegistryId(Long registryId) {
		this.registryId = registryId;
	}

	public Long getClientAcctNumber() {
		return clientAcctNumber;
	}

	public void setClientAcctNumber(Long clientAcctNumber) {
		this.clientAcctNumber = clientAcctNumber;
	}

}
