package com.hdr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class ProjectSubconsCompositeKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6004318558552278829L;

	@Id
	@Column(name="PROJECT_ID")
	private Long projectId;
	
	@Id
	@Column(name="SUBCONSULTANT_ID")
	private Long subconsultantId;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getSubconsultantId() {
		return subconsultantId;
	}

	public void setSubconsultantId(Long subconsultantId) {
		this.subconsultantId = subconsultantId;
	}
	
	
	
}
