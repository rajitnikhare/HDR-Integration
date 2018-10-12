package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity(name="XXHDR_IN_PROJECT_HEADER_STG")
public class Project{
		
	
	@Id
	@Column(name="PROJECT_ID")
	private Long projecId;
	
	@Column(name="PROJECT_NUMBER", length=25)
	private String projectNumber;//25
	
	@Column(name="PROJECT_DESCR_LONG", length=240)
	private String projectDescrLong;//240
	
	@Column(name="CONTRACT_TYPE", length=60)
	private String contractType;//60
	
	@Column(name="MARKET_SECTOR", length=30)
	private String marketSector;//30
	
	@Column(name="BUSINESS_UNIT", length=30)
	private String businessUnit;//30
	
	@Column(name="HDR_ROLE", length=30)
	private String hdrRole;//30
	
	@Column(name="PRIMARY_COMPANY", length=360)
	private String primaryCompany;//360
	
	@Column(name="PROJECT_GSA_CODE", length=10)
	private String projectGsaCode;//10
	
	@Column(name="OPPORTUNITY_NAME", length=240)
	private String opportunityName;//240
	
	@Column(name="MASTER_CONTRACT_NAME", length=240)
	private String masterContractName;//240
	
	@Column(name="CONTRACT_STATUS", length=30)
	private String contractStatus;//30
	
	
	@Column(name="EBS_PURSUIT_PROJECT_ID")
	private Long ebsPursuitProjectId;
	
	@Column(name="FEDERAL_NUMBER", length=80)
	private String fedralNumber;//80
	
	
	@Column(name="EBS_CONTRACT_ID")
	private Long ebsContractId;
	
	@Column(name="EBS_MASTER_CONTRACT_ID")
	private Long ebsMasterContractId;
	
	@Column(name="NOTICE_TO_PROCEED_DATE")
	private Date noticeToProceedDate;
	
	@Column(name="FIRST_ACTIVITY_DATE")
	private Date firstActivityDate;
	
	@Column(name="EST_COMPLETION_DATE")
	private Date estCompletionDate;
	
	@Column(name="PLANNED_FINISH_DATE")
	private Date plannedFinsihDate;
	
	@Column(name="ACTUAL_START_DATE")
	private Date actualStartDate;
	
	@Column(name="ACTUAL_FINISH_DATE")
	private Date actualFinishDate;
	
	@Column(name="PLANNED_START_DATE")
	private Date plannedStartDate;
	
	@Column(name="BOOKED_FEE")
	private BigDecimal bookedFee;
	
	@Column(name="OSC_OPPORTUNITY_ID", length=30)
	private String oscOpportunityId;//30
	
	@Column(name="EBS_ACCOUNT_ID")
	private Long ebsAccountId;
	
	@Column(name="EBS_ACCOUNT_NUMBER", length=30)
	private String ebsAccountNumber; //30
	
	
	@Column(name="OSC_PARTY_ID", length=30)
	private String oscPartyId; //30
	
	public String getLegacyId() {
		return legacyId;
	}

	public void setLegacyId(String legacyId) {
		this.legacyId = legacyId;
	}

	@Column(name="PROCESS_STATE", length=30)
	private String processState; //30
	
	@Column(name="RETRY_COUNT")
	private Long retryCount;
	
	@Column(name="ERROR_MESSAGE", length=2000)
	private String errorMessage;//2000
	
	@Column(name="CREATED_TIMESTAMP")
	private Date createdTimestamp;
	
	@Column(name="MODIFIED_TIMESTAMP")
	private Date modifiedTimeStamp;
	
	
	@Column(name="OPERATING_COMPANY" , length = 240)
	private String operatingCompany;
	


	//TODO: DATALOAD TEMP
	@Column(name="LEGACY_ID", length=25)
	private String legacyId;
	
	@Transient
	private List<ProjectFeeCost> projectFeeCostList;
	
	@Transient
	private List<ProjectLocation> projectLocationList;
	
	@Transient
	private List<ProjectSubcons> projectSubconsList;
	
	
	@Transient
	private String operation;
	
	@Transient
	private BigDecimal oscProjectId;
	
	public Long getProjecId() {
		return projecId;
	}

	public void setProjecId(Long projecId) {
		this.projecId = projecId;
	}

	public String getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	public String getProjectDescrLong() {
		return projectDescrLong;
	}

	public void setProjectDescrLong(String projectDescrLong) {
		this.projectDescrLong = projectDescrLong;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public String getMarketSector() {
		return marketSector;
	}

	public void setMarketSector(String marketSector) {
		this.marketSector = marketSector;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getHdrRole() {
		return hdrRole;
	}

	public void setHdrRole(String hdrRole) {
		this.hdrRole = hdrRole;
	}

	public String getPrimaryCompany() {
		return primaryCompany;
	}

	public void setPrimaryCompany(String primaryCompany) {
		this.primaryCompany = primaryCompany;
	}

	public String getProjectGsaCode() {
		return projectGsaCode;
	}

	public void setProjectGsaCode(String projectGsaCode) {
		this.projectGsaCode = projectGsaCode;
	}

	public String getOpportunityName() {
		return opportunityName;
	}

	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}

	public String getMasterContractName() {
		return masterContractName;
	}

	public void setMasterContractName(String masterContractName) {
		this.masterContractName = masterContractName;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public Long getEbsPursuitProjectId() {
		return ebsPursuitProjectId;
	}

	public void setEbsPursuitProjectId(Long ebsPursuitProjectId) {
		this.ebsPursuitProjectId = ebsPursuitProjectId;
	}

	public String getFedralNumber() {
		return fedralNumber;
	}

	public void setFedralNumber(String fedralNumber) {
		this.fedralNumber = fedralNumber;
	}

	public Long getEbsContractId() {
		return ebsContractId;
	}

	public BigDecimal getOscProjectId() {
		return oscProjectId;
	}

	public void setOscProjectId(BigDecimal oscProjectId) {
		this.oscProjectId = oscProjectId;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}


	public List<ProjectFeeCost> getProjectFeeCostList() {
		return projectFeeCostList;
	}

	public void setProjectFeeCostList(List<ProjectFeeCost> projectFeeCostList) {
		this.projectFeeCostList = projectFeeCostList;
	}

	public List<ProjectLocation> getProjectLocationList() {
		return projectLocationList;
	}

	public void setProjectLocationList(List<ProjectLocation> projectLocationList) {
		this.projectLocationList = projectLocationList;
	}

	public List<ProjectSubcons> getProjectSubconsList() {
		return projectSubconsList;
	}

	public void setProjectSubconsList(List<ProjectSubcons> projectSubconsList) {
		this.projectSubconsList = projectSubconsList;
	}

	public void setEbsContractId(Long ebsContractId) {
		this.ebsContractId = ebsContractId;
	}

	public Long getEbsMasterContractId() {
		return ebsMasterContractId;
	}

	public void setEbsMasterContractId(Long ebsMasterContractId) {
		this.ebsMasterContractId = ebsMasterContractId;
	}

	public Date getNoticeToProceedDate() {
		return noticeToProceedDate;
	}

	public void setNoticeToProceedDate(Date noticeToProceedDate) {
		this.noticeToProceedDate = noticeToProceedDate;
	}

	public Date getFirstActivityDate() {
		return firstActivityDate;
	}

	public void setFirstActivityDate(Date firstActivityDate) {
		this.firstActivityDate = firstActivityDate;
	}

	public Date getEstCompletionDate() {
		return estCompletionDate;
	}

	public void setEstCompletionDate(Date estCompletionDate) {
		this.estCompletionDate = estCompletionDate;
	}

	public Date getPlannedFinsihDate() {
		return plannedFinsihDate;
	}

	public void setPlannedFinsihDate(Date plannedFinsihDate) {
		this.plannedFinsihDate = plannedFinsihDate;
	}

	public Date getActualStartDate() {
		return actualStartDate;
	}

	public void setActualStartDate(Date actualStartDate) {
		this.actualStartDate = actualStartDate;
	}

	public Date getActualFinishDate() {
		return actualFinishDate;
	}

	public void setActualFinishDate(Date actualFinishDate) {
		this.actualFinishDate = actualFinishDate;
	}

	public Date getPlannedStartDate() {
		return plannedStartDate;
	}

	public void setPlannedStartDate(Date plannedStartDate) {
		this.plannedStartDate = plannedStartDate;
	}

	public BigDecimal getBookedFee() {
		return bookedFee;
	}

	public void setBookedFee(BigDecimal bookedFee) {
		this.bookedFee = bookedFee;
	}

	public String getOscOpportunityId() {
		return oscOpportunityId;
	}

	public void setOscOpportunityId(String oscOpportunityId) {
		this.oscOpportunityId = oscOpportunityId;
	}

	public Long getEbsAccountId() {
		return ebsAccountId;
	}

	public void setEbsAccountId(Long ebsAccountId) {
		this.ebsAccountId = ebsAccountId;
	}

	public String getEbsAccountNumber() {
		return ebsAccountNumber;
	}

	public void setEbsAccountNumber(String ebsAccountNumber) {
		this.ebsAccountNumber = ebsAccountNumber;
	}

	

	public String getOscPartyId() {
		return oscPartyId;
	}

	public void setOscPartyId(String oscPartyId) {
		this.oscPartyId = oscPartyId;
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

	public Date getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}

	public void setModifiedTimeStamp(Date modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}
	public String getOperatingCompany() {
		return operatingCompany;
	}

	public void setOperatingCompany(String operatingCompany) {
		this.operatingCompany = operatingCompany;
	}

	
	
	
	
}
