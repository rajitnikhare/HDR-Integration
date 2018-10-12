package com.hdr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class EmployeeEducationCompositeKey implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8577509765299176505L;
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
	//Concentration
	@Id
	@Column(name="EDUCATION_TYPE_CODE", length=30)
	private String educationTypeCode;
	//Major
	@Id
	@Column(name="EDUCATION_MAJOR_CODE", length=30)
	private String educationMajorCode;
	
	//Degree Completed
	@Id
	@Column(name="GRADUATED_YN", length=1)
	private String graduatedYn;

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEducationTypeCode() {
		return educationTypeCode;
	}

	public void setEducationTypeCode(String educationTypeCode) {
		this.educationTypeCode = educationTypeCode;
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
	
	

}
