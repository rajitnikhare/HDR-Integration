package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;


@Entity(name="XXHDR_IN_PROJECT_LOCATION_STG")
@IdClass(ProjectLocationCompositeKey.class)
public class ProjectLocation {
	
	@Id
	@Column(name="PROJECT_ID")
	private Long projectId;
	
	@Id
	@Column(name="PRJ_LOCATION_CODE")
	private Long prjLocationCode;
	
	@Column(name="PRJ_LOC_ADDRESS_LINE_1", length=60)
	private String pejLocAddressLine1;
	
	@Column(name="PRJ_LOC_COUNTY", length=60)
	private String projLocCounty;
	
	@Column(name="PRJ_LOC_CITY", length=60)
	private String prjLocCity;
	
	@Column(name="PRJ_LOC_STATE_PROV_CODE", length=10)
	private String prjLocStateProvCode;

	@Column(name="PRJ_LOC_STATE_DESCR", length=30)
	private String prjLocStateDescr;
	
	@Column(name="PRJ_LOC_POSTAL", length=30)
	private String prjLocPostal;
	
	@Column(name="PRJ_LOC_COUNTRY_CODE", length=15)
	private String prjLocCountryCode;
	
	@Column(name="PRJ_LOCATION_COUNTRY_DESCR", length=240)
	private String prjLocationCountryDescr;
	
	@Column(name="PROCESS_STATE", length=30)
	private String processState;
	
	@Column(name="RETRY_COUNT")
	private Long retryCount;
	
	@Column(name="ERROR_MESSAGE", length=2000)
	private String errorMessage;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date createdTimestamp;
	
	@Column(name="MODIFIED_TIMESTAMP")
	private Date modifiedTimestamp;
	
	@Transient
	private String operation;
	
	@Transient
	private BigDecimal projectLocationOscId;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	

	public Long getPrjLocationCode() {
		return prjLocationCode;
	}

	public void setPrjLocationCode(Long prjLocationCode) {
		this.prjLocationCode = prjLocationCode;
	}

	public String getPejLocAddressLine1() {
		return pejLocAddressLine1;
	}

	public void setPejLocAddressLine1(String pejLocAddressLine1) {
		this.pejLocAddressLine1 = pejLocAddressLine1;
	}

	public String getProjLocCounty() {
		return projLocCounty;
	}

	public void setProjLocCounty(String projLocCounty) {
		this.projLocCounty = projLocCounty;
	}

	public String getPrjLocCity() {
		return prjLocCity;
	}

	public void setPrjLocCity(String prjLocCity) {
		this.prjLocCity = prjLocCity;
	}

	public String getPrjLocStateProvCode() {
		return prjLocStateProvCode;
	}

	public void setPrjLocStateProvCode(String prjLocStateProvCode) {
		this.prjLocStateProvCode = prjLocStateProvCode;
	}

	public String getPrjLocStateDescr() {
		return prjLocStateDescr;
	}

	public void setPrjLocStateDescr(String prjLocStateDescr) {
		this.prjLocStateDescr = prjLocStateDescr;
	}

	public String getPrjLocPostal() {
		return prjLocPostal;
	}

	public void setPrjLocPostal(String prjLocPostal) {
		this.prjLocPostal = prjLocPostal;
	}

	public String getPrjLocCountryCode() {
		return prjLocCountryCode;
	}

	public void setPrjLocCountryCode(String prjLocCountryCode) {
		this.prjLocCountryCode = prjLocCountryCode;
	}

	public String getPrjLocationCountryDescr() {
		return prjLocationCountryDescr;
	}

	public void setPrjLocationCountryDescr(String prjLocationCountryDescr) {
		this.prjLocationCountryDescr = prjLocationCountryDescr;
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

	public BigDecimal getProjectLocationOscId() {
		return projectLocationOscId;
	}

	public void setProjectLocationOscId(BigDecimal projectLocationOscId) {
		this.projectLocationOscId = projectLocationOscId;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
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
	
	
	
	
	
}
