package com.hdr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class EmployeeProjectsCompositeKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4238737878009467058L;
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
	
	@Id
	@Column(name="PROJECT_ID")
	private Long projectId;


}
