package com.hdr.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;

@Embeddable
public class ConversionRateCompositeKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7662422835118691326L;

	@Id
	@Column(name="FROM_CURRENCY")
	private String fromCurrency;
	
	@Id
	@Column(name="TO_CURRENCY")
	private String toCurrency;
	
	@Id
	@Column(name="CONVERSION_DATE")
	private Date  conversionDate;

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
	
	
	
}
