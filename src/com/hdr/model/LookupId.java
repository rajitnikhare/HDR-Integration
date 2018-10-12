package com.hdr.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class LookupId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4332718891226909751L;
	@Id
	private String keyName;
	@Id
	private String value;
	@Id
	private String entityName;

	public String getKeyName() {
		return keyName;
	}

	public String getValue() {
		return value;
	}

	public String getEntityName() {
		return entityName;
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
	

	
}
