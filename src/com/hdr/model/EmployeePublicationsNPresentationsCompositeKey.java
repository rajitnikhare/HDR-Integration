package com.hdr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class EmployeePublicationsNPresentationsCompositeKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8570916066027115769L;

	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
	
	@Id
	@Column(name="PUB_PRESENT_ID", length=30)
	private String pubPresentId;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getPubPresentId() {
		return pubPresentId;
	}

	public void setPubPresentId(String pubPresentId) {
		this.pubPresentId = pubPresentId;
	}
	
	
}
