package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

@Entity(name="XXHDR_IN_EMPLOYEE_EDU_STG")
@IdClass(EmployeeEducationCompositeKey.class)
public class EmployeeEducation {

	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;

	@Column(name="EDUCATION_TYPE_DESCR_LONG", length=150)
	private String educationTypeDescrLong;
	
	@Id
	@Column(name="EDUCATION_TYPE_CODE", length=30)
	private String educationTypeCode;
	
	@Id
	@Column(name="EDUCATION_MAJOR_CODE", length=30)
	private String educationMajorCode;
	
	@Id
	@Column(name="GRADUATED_YN", length=1)
	private String graduatedYn;
	

	@Column(name="DEGREE", length=90)
	private String degree;
	
	
	@Column(name="INSTITUTION_CODE", length=150)
	private String institutionCode;
	
	@Column(name="INSTITUTION_DESCR_LONG", length=150)
	private String institutionDescrLong;
	

	@Column(name="COUNTRY", length=80)
	private String country;
	

	@Column(name="STATE_PROVINCE", length=80)
	private String state;
	
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

	@Transient
	private String operation;
	
	@Transient
	private BigDecimal oscEducationId;
	
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEducationTypeDescrLong() {
		return educationTypeDescrLong;
	}

	public void setEducationTypeDescrLong(String educationTypeDescrLong) {
		this.educationTypeDescrLong = educationTypeDescrLong;
	}

	public String getEducationMajorCode() {
		return educationMajorCode;
	}

	public void setEducationMajorCode(String educationMajorCode) {
		this.educationMajorCode = educationMajorCode;
	}


	public String getGraduatedYn() {
		return graduatedYn;
	}

	public void setGraduatedYn(String graduatedYn) {
		this.graduatedYn = graduatedYn;
	}

	public String getInstitutionCode() {
		return institutionCode;
	}

	public void setInstitutionCode(String institutionCode) {
		this.institutionCode = institutionCode;
	}

	public String getInstitutionDescrLong() {
		return institutionDescrLong;
	}

	public void setInstitutionDescrLong(String institutionDescrLong) {
		this.institutionDescrLong = institutionDescrLong;
	}

	public String getProcessState() {
		return processState;
	}

	public String getEducationTypeCode() {
		return educationTypeCode;
	}

	public void setEducationTypeCode(String educationTypeCode) {
		this.educationTypeCode = educationTypeCode;
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}

	public void setModifiedTimeStamp(Date modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public BigDecimal getOscEducationId() {
		return oscEducationId;
	}

	public void setOscEducationId(BigDecimal oscEducationId) {
		this.oscEducationId = oscEducationId;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
	
	
}
