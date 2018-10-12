package com.hdr.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="XXHDR_IN_EMPLOYEE_LANGUAGE_STG")
public class EmployeeLanguage {
	
	@Id
	@Column(name="EMPLOYEE_ID")
	private Long employeeId;
	
	@Column(name="LANGUAGE_DESCR_LONG", length=60)
	private String languageDescrLong;
	
	@Column(name="NATIVE_LANGUAGE_YN", length=1)
	private Character nativeLanguageYn;
	@Column(name="IS_TRANSLATOR_YN",length=1)
	private Character isTranslatorYn;
	@Column(name="IS_TEACHER_YN", length=1)
	private Character isTeacherYn;
	
	@Column(name="LNG_SPEECH_PROF_RATING", length=30)
	private String lngSpeechProfRating;
	
	@Column(name="LNG_READ_PROF_RATING", length=30)
	private String lngReadProfRating;
	@Column(name="LNG_WRITE_PROF_RATING", length=30)
	private String lngWriteProfRating;
	@Column(name="PROCESS_STATE", length=30)
	private String processState;
	@Column(name="RETRY_COUNT")
	private Long retryCount;
	@Column(name="ERROR_MESSAGE", length=2000)
	private String errorMessage;
	@Column(name="CREATED_TIMESTAMP")
	private Date createdTimestamp;
	@Column(name="MODIFIED_TIMESTAMP")
	private Date modifiedTimestamp;
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getLanguageDescrLong() {
		return languageDescrLong;
	}
	public void setLanguageDescrLong(String languageDescrLong) {
		this.languageDescrLong = languageDescrLong;
	}
	public Character getNativeLanguageYn() {
		return nativeLanguageYn;
	}
	public void setNativeLanguageYn(Character nativeLanguageYn) {
		this.nativeLanguageYn = nativeLanguageYn;
	}
	public Character getIsTranslatorYn() {
		return isTranslatorYn;
	}
	public void setIsTranslatorYn(Character isTranslatorYn) {
		this.isTranslatorYn = isTranslatorYn;
	}
	public Character getIsTeacherYn() {
		return isTeacherYn;
	}
	public void setIsTeacherYn(Character isTeacherYn) {
		this.isTeacherYn = isTeacherYn;
	}
	public String getLngSpeechProfRating() {
		return lngSpeechProfRating;
	}
	public void setLngSpeechProfRating(String lngSpeechProfRating) {
		this.lngSpeechProfRating = lngSpeechProfRating;
	}
	public String getLngReadProfRating() {
		return lngReadProfRating;
	}
	public void setLngReadProfRating(String lngReadProfRating) {
		this.lngReadProfRating = lngReadProfRating;
	}
	public String getLngWriteProfRating() {
		return lngWriteProfRating;
	}
	public void setLngWriteProfRating(String lngWriteProfRating) {
		this.lngWriteProfRating = lngWriteProfRating;
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
	public Date getCreatedTimestamp() {
		return createdTimestamp;
	}
	public void setCreatedTimestamp(Date createdTimestamp) {
		this.createdTimestamp = createdTimestamp;
	}
	public Date getModifiedTimestamp() {
		return modifiedTimestamp;
	}
	public void setModifiedTimestamp(Date modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}
	
	
	
}
