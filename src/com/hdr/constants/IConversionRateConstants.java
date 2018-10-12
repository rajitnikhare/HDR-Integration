package com.hdr.constants;

public interface IConversionRateConstants {
	
	
	public static enum CONVERSIONRATE_FUSION_INTEGRATION_STATUS{
		TO_BE_PROCESSED("To be processed"), IN_PROGRESS("In Progress"), COMPLETED("Completed"), ERROR("Error");
		private String val;
		private CONVERSIONRATE_FUSION_INTEGRATION_STATUS(String val) {
			this.val = val;
		}
		public String getVal() {
			return val;
		}

	}
	
	
	public static final String CONVERSIONRATE_FILED_TOCURRENCY="TO_CURRENCY_c";
	public static final String CONVERSIONRATE_FILED_FROMCURRENCY="FROM_CURRENCY_c";
	public static final String CONVERSIONRATE_FILED_CONVERSIONDATE="ConversionDate_c";
	public static final String CURRENCYDAILYRATES_CUSTOM_OBJECT_NAME="CurrencyDailyRate_c";
	public static final String GET_CONVERSION_JOB_STATUS_INFO = "GET_CONVERSION_JOB_STATUS_INFO";
	public static final Object CONVERSION_RATE_EBS_TO_OSC_SYNC_JOB = "ConversionRateEBStoOSCSyncJob";
	public static final String DATE_FORMAT = "dd-MMM-yy";
	public static final String DATE_FORMAT_OSC = "yyyy-MM-dd";
	public static final String GET_UNPROCESSED_CONVERSION_RATES = "GET_UNPROCESSED_CONVERSION_RATES";
	


	
	
	
	

}
