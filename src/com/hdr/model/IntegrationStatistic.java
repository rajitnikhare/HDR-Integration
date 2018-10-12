package com.hdr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="I_INTEGRATION_STATISTICS")
public class IntegrationStatistic {
	@Id
	@Column(name="TABLENAME")
	private String tablename;
	private String batchKey1;
	private String batchKey2;
	private String syncStatus;
	private Date lastUpdatedDate;
	
	public String getTablename() {
		return tablename;
	}
	public void setTablename(String tablename) {
		this.tablename = tablename;
	}
	
	
	
	public String getBatchKey1() {
		return batchKey1;
	}
	public void setBatchKey1(String batchKey1) {
		this.batchKey1 = batchKey1;
	}
	public String getBatchKey2() {
		return batchKey2;
	}
	public void setBatchKey2(String batchKey2) {
		this.batchKey2 = batchKey2;
	}
	public String getSyncStatus() {
		return syncStatus;
	}
	public void setSyncStatus(String syncStatus) {
		this.syncStatus = syncStatus;
	}
	public Date getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	
	
	
	
	
	

}
