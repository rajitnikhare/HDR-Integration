package com.hdr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class ProjectFeeCostCompositekey implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1915879903016122788L;

	@Id
	@Column(name="PROJECT_ID")
	private Long projectId;
	
	@Id
	@Column(name="COST_FEE_ID")
	private Long costFeeId;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getCostFeeId() {
		return costFeeId;
	}

	public void setCostFeeId(Long costFeeId) {
		this.costFeeId = costFeeId;
	}
	
	
}
