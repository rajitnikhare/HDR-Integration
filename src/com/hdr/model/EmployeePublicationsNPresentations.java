package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;

@Entity(name="XXHDR_IN_EMPLOYEE_PUB_PRE_STG")
@IdClass(EmployeePublicationsNPresentationsCompositeKey.class)
public class EmployeePublicationsNPresentations {
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
	
	@Id
	@Column(name="PUB_PRESENT_ID", length=30)
	private String pubPresentId;
	
	@Column(name="TITLE", length=80)
	private String title;
	
	@Column(name="EVENTS_PUBLICATIONS", length=80)
	private String eventsPublications;
	
	@Column(name="PUBLICATION_TYPE", length=80)
	private String publicationType;
	
	@Column(name="PUBLICATION_NAME", length=80)
	private String publicationName;
	
	@Column(name="HDR_AUTHOR", length=80)
	private String hdrAuthor;
	
	@Column(name="OTHER_HDR_AUTHORS", length=80)
	private String otherHdrAuthors;
	
	@Column(name="NON_HDR_AUTHORS", length=80)
	private String nonHdrAuthors;
	
	@Column(name="COUNTRY", length=80)
	private String country;
	
	@Column(name="STATE_PROVINCE", length=80)
	private String stateProvince;
	
	@Column(name="CITY", length=80)
	private String city;
	
	@Column(name="YEAR", length=10)
	private String year;
	
	@Column(name="PROCESS_STATE", length=30)
	private String processState;
	
	@Column(name="RETRY_COUNT")
	private Long retryCount;
	
	@Column(name="ERROR_MESSAGE", length=2000)
	private String errorMessage;
	
	@Column(name="CREATED_TIMESTAMP")
	private Date createdTimeStamp;
	
	@Column(name="MODIFIED_TIMESTAMP")
	private Date mofifiedTimeStamp;
	
	@Transient
	private String operation;
	
	@Transient
	private BigDecimal oscId;

	public BigDecimal getOscId() {
		return oscId;
	}

	public void setOscId(BigDecimal oscId) {
		this.oscId = oscId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public String getPubPresentId() {
		return pubPresentId;
	}

	public void setPubPresentId(String pubPresentId) {
		this.pubPresentId = pubPresentId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEventsPublications() {
		return eventsPublications;
	}

	public void setEventsPublications(String eventsPublications) {
		this.eventsPublications = eventsPublications;
	}

	public String getPublicationType() {
		return publicationType;
	}

	public void setPublicationType(String publicationType) {
		this.publicationType = publicationType;
	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}

	public String getHdrAuthor() {
		return hdrAuthor;
	}

	public void setHdrAuthor(String hdrAuthor) {
		this.hdrAuthor = hdrAuthor;
	}

	public String getOtherHdrAuthors() {
		return otherHdrAuthors;
	}

	public void setOtherHdrAuthors(String otherHdrAuthors) {
		this.otherHdrAuthors = otherHdrAuthors;
	}

	public String getNonHdrAuthors() {
		return nonHdrAuthors;
	}

	public void setNonHdrAuthors(String nonHdrAuthors) {
		this.nonHdrAuthors = nonHdrAuthors;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getStateProvince() {
		return stateProvince;
	}

	public void setStateProvince(String stateProvince) {
		this.stateProvince = stateProvince;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public Long getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public Date getMofifiedTimeStamp() {
		return mofifiedTimeStamp;
	}

	public void setMofifiedTimeStamp(Date mofifiedTimeStamp) {
		this.mofifiedTimeStamp = mofifiedTimeStamp;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	
	
}

