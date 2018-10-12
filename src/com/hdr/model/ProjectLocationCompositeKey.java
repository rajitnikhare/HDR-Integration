package com.hdr.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 * @author jeevan
 *
 */
@Embeddable
public class ProjectLocationCompositeKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5730623393875844916L;

	@Id
	@Column(name="PROJECT_ID")
	private Long projectId;
	
	@Id
	@Column(name="PRJ_LOCATION_CODE")
	private Long prjLocationCode;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public Long getPrjLocationCode() {
		return prjLocationCode;
	}

	public void setPrjLocationCode(Long prjLocationCode) {
		this.prjLocationCode = prjLocationCode;
	}

	
	
	
}
