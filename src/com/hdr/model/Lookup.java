package com.hdr.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity(name="I_LOOKUP")
@IdClass(LookupId.class)
public class Lookup implements GenericModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String keyName;
	
	@Id
	private String value;
	
	@Id
	private String entityName;
	
	
	private String crmName;
	
	private String entityDirection;
	
	private Date updatedDate;
	
	private Boolean isActive;

	public String getKeyName() {
		return keyName;
	}

	public String getValue() {
		return value;
	}

	public String getEntityName() {
		return entityName;
	}

	public String getCrmName() {
		return crmName;
	}

	public String getEntityDirection() {
		return entityDirection;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public void setCrmName(String crmName) {
		this.crmName = crmName;
	}

	public void setEntityDirection(String entityDirection) {
		this.entityDirection = entityDirection;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	

	

}
