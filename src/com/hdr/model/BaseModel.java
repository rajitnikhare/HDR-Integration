package com.hdr.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel extends BaseObject implements GenericModel {

	@Column(name="SYNC_STATE")
	private String syncState ;

	@Column(name="SYNC_STATUS")
	private String syncStatus ;

	@Column(name="ERROR_MESSAGE",length=2000)
	private String errorMessage ;

	@Column(name="RETRY_COUNT")
	private Integer retryCount ;
	
	@Column(name="LAST_UPDATED")
	private String lastUpdated;
	
	@Column(name="ERROR_DATE")
	private String errorDate;
	

	public String getErrorDate() {
		return errorDate;
	}

	public void setErrorDate(String errorDate) {
		this.errorDate = errorDate;
	}

	public String getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public String getSyncState() {
		return syncState;
	}

	public void setSyncState(String syncState) {
		this.syncState = syncState;
	}

	public String getSyncStatus() {
		return syncStatus;
	}

	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Integer getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Integer retryCount) {
		this.retryCount = retryCount;
	}
}
