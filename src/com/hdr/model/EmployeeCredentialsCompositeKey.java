package com.hdr.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class EmployeeCredentialsCompositeKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -9123771409497739621L;

	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
	
	@Id
	@Column(name="CREDENTIAL_DESC", length=80)
	private String credentialDesc;
	
	@Id
	@Column(name="LICENSE_CERT_NUMBER", length=150)
	private String licenseCertNumber;
	
	@Id
	@Column(name="STATE_USA", length=80)
	private String stateUsa;
	
	@Id
	@Column(name="OUTSIDE_USA_PROVINCE_OR_STATE", length=80)
	private String outsideUsaProvinceOrState;
	
	@Id
	@Column(name="EXPIRES")
	private Date expires;

	public String getLicenseCertNumber() {
		return licenseCertNumber;
	}

	public void setLicenseCertNumber(String licenseCertNumber) {
		this.licenseCertNumber = licenseCertNumber;
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

	public Date getExpires() {
		return expires;
	}

	public void setExpires(Date expires) {
		this.expires = expires;
	}

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
	
	
}
