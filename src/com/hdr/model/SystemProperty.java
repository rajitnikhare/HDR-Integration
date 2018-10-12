package com.hdr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity(name="I_SYSTEM_PROPERTY")
public class SystemProperty  implements GenericModel  {

	@Id
	@Column(name="key_name", length=30)
	private String keyName ;

	@Column(name="picklist_name")
	private String picklistName;

	@Column(name="key_value")
	private String keyValue;
	
	@Column
	private String description ;
	
	@Column(name="field_status")
	@Type(type="yes_no")
	private Boolean fieldStatus = true;

	@Column(name="field_order")
	private Integer fieldOrder = 0;
	

	public String getPicklistName() {
		return picklistName;
	}

	public void setPicklistName(String picklistName) {
		this.picklistName = picklistName;
	}

	public String getKeyName() {
		return keyName;
	}

	public void setKeyName(String keyName) {
		this.keyName = keyName;
	}

	public String getKeyValue() {
		return keyValue;
	}

	public void setKeyValue(String keyValue) {
		this.keyValue = keyValue;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isFieldStatus() {
		return fieldStatus;
	}

	public void setFieldStatus(boolean fieldStatus) {
		this.fieldStatus = fieldStatus;
	}

	public int getFieldOrder() {
		return fieldOrder;
	}

	public void setFieldOrder(int fieldOrder) {
		this.fieldOrder = fieldOrder;
	}

	
}

