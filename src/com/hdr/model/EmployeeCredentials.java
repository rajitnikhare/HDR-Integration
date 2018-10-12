package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

@Entity(name="XXHDR_IN_EMPLOYEE_CRED_STG")
@IdClass(EmployeeCredentialsCompositeKey.class)
public class EmployeeCredentials {
	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
	
	@Id
	@Column(name="CREDENTIAL_DESC", length=80)
	private String credentialDesc;
	
	//RecordName
	@Id
	@Column(name="LICENSE_CERT_NUMBER", length=150)
	private String licenseCertNumber;
	//StateUSA_c
	@Id
	@Column(name="STATE_USA", length=80)
	private String stateUsa;
	
	//State_c
	@Id
	@Column(name="OUTSIDE_USA_PROVINCE_OR_STATE", length=80)
	private String outsideUsaProvinceOrState;
	
	//Expires_c
	@Id
	@Column(name="EXPIRES")
	private Date expires;
	
	@Column(name="LICENSE_CERT_TYPE", length=80)
	private String licenceCertType;
	
	@Column(name="EXPIRED", length=1)
	private String expired;
	
	@Column(name="SUFFIX", length=80)
	private String suffix;

	@Column(name="COUNTRY", length=80)
	private String country;
	
	@Column(name="NATIONAL_REGISTRATION", length=80)
	private String nationalRegistration;
	
	@Column(name="ISSUED")
	private Date issued;
	
	@Column(name="DOES_NOT_EXPIRE", length=1)
	private String doesNotExpire;
	
	@Column(name="WILL_NOT_RENEW", length=80)
	private String willNotRenew;
	
	@Column(name="PROCESS_STATE", length=30)
	private String processState;
	
	@Column(name="RETRY_COUNT")
	private Long retryCount;
	
	@Column(name="ERROR_MESSAGE", length=2000)
	private String errorMessage;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date createdTimeStamp;
	
	@Column(name="MODIFIED_TIMESTAMP")
	private Date mofifiedTimeStamp;
	
	@Transient
	private String operation;
	
	
	@Transient
	private BigDecimal oscCredentialId;
	
	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	

	public String getCredentialDesc() {
		return credentialDesc;
	}

	public void setCredentialDesc(String credentialDesc) {
		this.credentialDesc = credentialDesc;
	}

	public String getLicenseCertType() {
		return licenseCertNumber;
	}

	public void setLicenseCertType(String licenseCertNumber) {
		this.licenseCertNumber = licenseCertNumber;
	}

	public String getExpired() {
		return expired;
	}

	public void setExpired(String expired) {
		this.expired = expired;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStateUsa() {
		return stateUsa;
	}

	public void setStateUsa(String stateUsa) {
		this.stateUsa = stateUsa;
	}

	public String getOutsideUsaProvinceOrState() {
		return outsideUsaProvinceOrState;
	}

	public void setOutsideUsaProvinceOrState(String outsideUsaProvinceOrState) {
		this.outsideUsaProvinceOrState = outsideUsaProvinceOrState;
	}

	public String getNationalRegistration() {
		return nationalRegistration;
	}

	public void setNationalRegistration(String nationalRegistration) {
		this.nationalRegistration = nationalRegistration;
	}


	public Date getIssued() {
		return issued;
	}

	public void setIssued(Date issued) {
		this.issued = issued;
	}

	public Date getExpires() {
		return expires;
	}

	public void setExpires(Date expires) {
		this.expires = expires;
	}

	public String getDoesNotExpire() {
		return doesNotExpire;
	}

	public void setDoesNotExpire(String doesNotExpire) {
		this.doesNotExpire = doesNotExpire;
	}

	public String getWillNotRenew() {
		return willNotRenew;
	}

	public void setWillNotRenew(String willNotRenew) {
		this.willNotRenew = willNotRenew;
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

	public String getLicenseCertNumber() {
		return licenseCertNumber;
	}

	public void setLicenseCertNumber(String licenseCertNumber) {
		this.licenseCertNumber = licenseCertNumber;
	}

	public String getLicenceCertType() {
		return licenceCertType;
	}

	public void setLicenceCertType(String licenceCertType) {
		this.licenceCertType = licenceCertType;
	}

	public BigDecimal getOscCredentialId() {
		return oscCredentialId;
	}

	public void setOscCredentialId(BigDecimal oscCredentialId) {
		this.oscCredentialId = oscCredentialId;
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

	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public Date getMofifiedTimeStamp() {
		return mofifiedTimeStamp;
	}

	public void setMofifiedTimeStamp(Date mofifiedTimeStamp) {
		this.mofifiedTimeStamp = mofifiedTimeStamp;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	
	
	
}
