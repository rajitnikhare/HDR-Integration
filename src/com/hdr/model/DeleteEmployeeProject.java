package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity(name="DeleteEmployeeProject")
public class DeleteEmployeeProject {
	
	@Id
	@Column(name="id")
	private BigDecimal  id;
	
	@Column(name="employee_id")
	private String employeeId;
	
	@Column(name="process_state")
	private String processState;
	
	@Column(name="error_message",length=2000)
	private String errorMessage;
	
	@Column(name="alter_date")
	private Date alterDate;
	
	

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Date getAlterDate() {
		return alterDate;
	}

	public void setAlterDate(Date alterDate) {
		this.alterDate = alterDate;
	}
	


}
