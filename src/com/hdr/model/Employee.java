package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity(name="XXHDR_IN_EMPLOYEE_HEADER_STG")
public class Employee
{	

	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
    
	@Column(name="EMPLOYEE_NUMBER",length=30)
	private String employeeNumber;
	
	@Column(name="FIRST_NAME", length=30)
	private String firstName;
	
	@Column(name="MIDDLE_NAME", length=30)
	private String middleName;
	
	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	@Column(name="LAST_NAME", length=30)
	private String lastName;
	
	@Column(name="PREF_FIRST_NAME", length=30)
	private String prefFirstName;
	
	@Column(name="BUSINESS_CARD_TITLE", length=150)
	private String businessCardTitle;
	
	@Column(name="DOMAIN_USERNAME", length=100)
	private String domainUserNAme;
	
	@Column(name="BUSINESS_GROUP_CODE", length=10)
	private String businessGroupCode;
	
	@Column(name="BUSINESS_GROUP_DESCR_LONG", length=60)
	private String businessGroupDescrLong;
	
	@Column(name="MARKET_SECTOR_CODE", length=10)
	private String marketSectorCode;
	
	@Column(name="MARKET_SECTOR_DESCR_LONG", length=60)
	private String marketSectorDescrLong;
	
	@Column(name="BUSINESS_CLASS_CODE", length=10)
	private String businessClassCode;
	
	@Column(name="BUSINESS_CLASS_DESCR_LONG", length=60)
	private String businessClassDescrLong;
	
	@Column(name="BUSINESS_UNIT_CODE", length=10)
	private String businessUnitCode;
	
	@Column(name="BUSINESS_UNIT_DESCR", length=60)
	private String businessUnitDescr;
	
	
	@Column(name="PROF_EXPERIENCE_DATE")
	private Date profExperienceDate;
	
	@Column(name="ADJUSTED_SERVICE_DATE")
	private Date adjustedServiceDate;
	
	@Column(name="OFFICE", length=80)
	private String office;
	
	@Column(name="EMAIL_ADDRESS", length=80)
	private String emailAddress;
	
	@Column(name="INDUSTRY_TENURE")
	private Long industryTenure;
	
	@Column(name="HDR_TENURE")
	private Long hdrTenure;
	
	@Column(name="PROCESS_STATE", length=30)
	private String processState;
	
	@Column(name="RETRY_COUNT")
	private Long retryCount;
	
	@Column(name="ERROR_MESSAGE", length=2000)
	private String errorMessage;//2000
	
	@Column(name="CREATED_TIMESTAMP")
	private Date createdTimestamp;
	
	@Column(name="MODIFIED_TIMESTAMP")
	private Date modifiedTimeStamp;
	
	//TODO: DATALOAD TEMP
	@Column(name="LEGACY_ID", length=25)
	private String legacyId;
	
	@Transient
	private List<EmployeeEducation> employeeEducationList;
	
	@Transient
	private List<EmployeeTraining> employeeTraining;
	
	@Transient
	private List<EmployeeProjects> employeeProjects;
	
	@Transient
	private List<EmployeeCredentials> employeeCredentials;
	
	@Transient
	private List<EmployeePublicationsNPresentations> employeePublicationsPresentations;

	@Transient
	private String operation;
	@Transient
	private BigDecimal oscId;
	
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPrefFirstName() {
		return prefFirstName;
	}

	public void setPrefFirstName(String prefFirstName) {
		this.prefFirstName = prefFirstName;
	}

	public String getBusinessCardTitle() {
		return businessCardTitle;
	}

	public void setBusinessCardTitle(String businessCardTitle) {
		this.businessCardTitle = businessCardTitle;
	}

	public String getDomainUserNAme() {
		return domainUserNAme;
	}

	public void setDomainUserNAme(String domainUserNAme) {
		this.domainUserNAme = domainUserNAme;
	}

	public String getBusinessGroupCode() {
		return businessGroupCode;
	}

	public void setBusinessGroupCode(String businessGroupCode) {
		this.businessGroupCode = businessGroupCode;
	}

	public String getBusinessGroupDescrLong() {
		return businessGroupDescrLong;
	}

	public void setBusinessGroupDescrLong(String businessGroupDescrLong) {
		this.businessGroupDescrLong = businessGroupDescrLong;
	}

	public String getMarketSectorCode() {
		return marketSectorCode;
	}

	public void setMarketSectorCode(String marketSectorCode) {
		this.marketSectorCode = marketSectorCode;
	}

	public String getMarketSectorDescrLong() {
		return marketSectorDescrLong;
	}

	public void setMarketSectorDescrLong(String marketSectorDescrLong) {
		this.marketSectorDescrLong = marketSectorDescrLong;
	}

	public String getBusinessClassCode() {
		return businessClassCode;
	}

	public void setBusinessClassCode(String businessClassCode) {
		this.businessClassCode = businessClassCode;
	}

	public String getBusinessClassDescrLong() {
		return businessClassDescrLong;
	}

	public void setBusinessClassDescrLong(String businessClassDescrLong) {
		this.businessClassDescrLong = businessClassDescrLong;
	}

	public String getBusinessUnitCode() {
		return businessUnitCode;
	}

	public void setBusinessUnitCode(String businessUnitCode) {
		this.businessUnitCode = businessUnitCode;
	}

	public String getBusinessUnitDescr() {
		return businessUnitDescr;
	}

	public void setBusinessUnitDescr(String businessUnitDescr) {
		this.businessUnitDescr = businessUnitDescr;
	}

	public Date getProfExperienceDate() {
		return profExperienceDate;
	}

	public void setProfExperienceDate(Date profExperienceDate) {
		this.profExperienceDate = profExperienceDate;
	}

	public Date getAdjustedServiceDate() {
		return adjustedServiceDate;
	}

	public void setAdjustedServiceDate(Date adjustedServiceDate) {
		this.adjustedServiceDate = adjustedServiceDate;
	}

	public String getOffice() {
		return office;
	}

	public void setOffice(String office) {
		this.office = office;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Long getIndustryTenure() {
		return industryTenure;
	}

	public void setIndustryTenure(Long industryTenure) {
		this.industryTenure = industryTenure;
	}

	public Long getHdrTenure() {
		return hdrTenure;
	}

	public void setHdrTenure(Long hdrTenure) {
		this.hdrTenure = hdrTenure;
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

	public List<EmployeeEducation> getEmployeeEducationList() {
		return employeeEducationList;
	}

	public void setEmployeeEducationList(List<EmployeeEducation> employeeEducationList) {
		this.employeeEducationList = employeeEducationList;
	}

	public List<EmployeeTraining> getEmployeeTraining() {
		return employeeTraining;
	}

	public void setEmployeeTraining(List<EmployeeTraining> employeeTraining) {
		this.employeeTraining = employeeTraining;
	}

	public List<EmployeeProjects> getEmployeeProjects() {
		return employeeProjects;
	}

	public void setEmployeeProjects(List<EmployeeProjects> employeeProjects) {
		this.employeeProjects = employeeProjects;
	}

	public List<EmployeeCredentials> getEmployeeCredentials() {
		return employeeCredentials;
	}

	public void setEmployeeCredentials(List<EmployeeCredentials> employeeCredentials) {
		this.employeeCredentials = employeeCredentials;
	}

	public List<EmployeePublicationsNPresentations> getEmployeePublicationsPresentations() {
		return employeePublicationsPresentations;
	}

	public void setEmployeePublicationsPresentations(
			List<EmployeePublicationsNPresentations> employeePublicationsPresentations) {
		this.employeePublicationsPresentations = employeePublicationsPresentations;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}


	public String getLegacyId() {
		return legacyId;
	}

	public void setLegacyId(String legacyId) {
		this.legacyId = legacyId;
	}

	public BigDecimal getOscId() {
		return oscId;
	}

	public void setOscId(BigDecimal oscId) {
		this.oscId = oscId;
	}
	
	
	}
