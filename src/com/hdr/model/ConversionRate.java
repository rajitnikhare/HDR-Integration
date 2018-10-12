package com.hdr.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Transient;


@Entity(name="GL_DAILY_RATES")
@IdClass(ConversionRateCompositeKey.class)
public class ConversionRate {
	
	@Id
	@Column(name="FROM_CURRENCY")
	private String fromCurrency;
	
	@Id
	@Column(name="TO_CURRENCY")
	private String toCurrency;
	
	@Id
	@Column(name="CONVERSION_DATE")
	private Date  conversionDate;
	
	@Column(name="CONVERSION_TYPE")
	private String conversionType;
	
	@Column(name="CONVERSION_RATE")
	private BigDecimal conversionRate;
	
	@Column(name="STATUS_CODE")
	private String statusCode;
	
	@Column(name="CREATION_DATE")
	private Date creationDate;
	
	@Column(name="CREATED_BY")
	private Long createdBy;
	

	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;
	
	@Column(name="LAST_UPDATED_BY")
	private Long lastUpdatedBy;
	
	@Column(name="LAST_UPDATE_LOGIN")
	private Long lastUpdateLogin;
	
	@Column(name="CONTEXT")
	private String context;
	
	@Column(name="ATTRIBUTE1")
	private String attribute1;
	
	@Column(name="ATTRIBUTE2")
	private String attribute2;
	
	@Column(name="ATTRIBUTE3")
	private String attribute3;

	@Column(name="ATTRIBUTE4")
	private String attribute4;
	
	@Column(name="ATTRIBUTE5")
	private String attribute5;
	
	@Column(name="ATTRIBUTE6")
	private String attribute6;
	
	@Column(name="ATTRIBUTE7")
	private String attribute7;
	
	@Column(name="ATTRIBUTE8")
	private String attribute8;
	
	@Column(name="ATTRIBUTE9")
	private String attribute9;
	
	@Column(name="ATTRIBUTE10")
	private String attribute10;
	
	@Column(name="ATTRIBUTE11")
	private String attribute11;
	
	@Column(name="ATTRIBUTE12")
	private String attribute12;
	
	@Column(name="ATTRIBUTE13")
	private String attribute13;
	
	@Column(name="ATTRIBUTE14")
	private String attribute14;
	
	@Column(name="ATTRIBUTE15")
	private String attribute15;
	
	@Column(name="RATE_SOURCE_CODE")
	private String rateSourceCode;
	
	@Transient
	private BigDecimal oscId;

	@Transient
	private boolean incremented;

	
	public String getFromCurrency() {
		return fromCurrency;
	}

	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}

	public String getToCurrency() {
		return toCurrency;
	}

	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}

	public Date getConversionDate() {
		return conversionDate;
	}

	public void setConversionDate(Date conversionDate) {
		this.conversionDate = conversionDate;
	}

	public String getConversioType() {
		return conversionType;
	}

	public void setConversioType(String conversioType) {
		this.conversionType = conversioType;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public Long getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(Long lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Long getLastUpdateLogin() {
		return lastUpdateLogin;
	}

	public void setLastUpdateLogin(Long lastUpdateLogin) {
		this.lastUpdateLogin = lastUpdateLogin;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getAttribute1() {
		return attribute1;
	}

	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
	}

	public String getAttribute2() {
		return attribute2;
	}

	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
	}

	public String getAttribute3() {
		return attribute3;
	}

	public boolean isIncremented() {
		return incremented;
	}

	public void setIncremented(boolean incremented) {
		this.incremented = incremented;
	}

	public String getConversionType() {
		return conversionType;
	}

	public void setConversionType(String conversionType) {
		this.conversionType = conversionType;
	}

	public BigDecimal getOscId() {
		return oscId;
	}

	public void setOscId(BigDecimal oscId) {
		this.oscId = oscId;
	}

	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
	}

	public String getAttribute4() {
		return attribute4;
	}

	public void setAttribute4(String attribute4) {
		this.attribute4 = attribute4;
	}

	public String getAttribute5() {
		return attribute5;
	}

	public void setAttribute5(String attribute5) {
		this.attribute5 = attribute5;
	}

	public String getAttribute6() {
		return attribute6;
	}

	public void setAttribute6(String attribute6) {
		this.attribute6 = attribute6;
	}

	public String getAttribute7() {
		return attribute7;
	}

	public void setAttribute7(String attribute7) {
		this.attribute7 = attribute7;
	}

	public String getAttribute8() {
		return attribute8;
	}

	public void setAttribute8(String attribute8) {
		this.attribute8 = attribute8;
	}

	public String getAttribute9() {
		return attribute9;
	}

	public void setAttribute9(String attribute9) {
		this.attribute9 = attribute9;
	}

	public String getAttribute10() {
		return attribute10;
	}

	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
	}

	public String getAttribute11() {
		return attribute11;
	}

	public void setAttribute11(String attribute11) {
		this.attribute11 = attribute11;
	}

	public String getAttribute12() {
		return attribute12;
	}

	public void setAttribute12(String attribute12) {
		this.attribute12 = attribute12;
	}

	public String getAttribute13() {
		return attribute13;
	}

	public void setAttribute13(String attribute13) {
		this.attribute13 = attribute13;
	}

	public String getAttribute14() {
		return attribute14;
	}

	public void setAttribute14(String attribute14) {
		this.attribute14 = attribute14;
	}

	public String getAttribute15() {
		return attribute15;
	}

	public void setAttribute15(String attribute15) {
		this.attribute15 = attribute15;
	}

	public String getRateSourceCode() {
		return rateSourceCode;
	}

	public void setRateSourceCode(String rateSourceCode) {
		this.rateSourceCode = rateSourceCode;
	}

		
}
