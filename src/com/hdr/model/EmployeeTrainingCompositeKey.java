package com.hdr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class EmployeeTrainingCompositeKey implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1969020940951860532L;

	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
    
	@Id
	@Column(name="TRAINING_SESSION_ID")
	private Long trainingSessionId;
	
	@Id
	@Column(name="TRAINING_TYPE_CODE", length=50)
	private String trainingTypeCode;

	public Long getEmployeeId() {
		return employeeId;
	}

	public Long getTrainingSessionId() {
		return trainingSessionId;
	}

	public void setTrainingSessionId(Long trainingSessionId) {
		this.trainingSessionId = trainingSessionId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getTrainingTypeCode() {
		return trainingTypeCode;
	}

	public void setTrainingTypeCode(String trainingTypeCode) {
		this.trainingTypeCode = trainingTypeCode;
	}



}
