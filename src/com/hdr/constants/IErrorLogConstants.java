package com.hdr.constants;

/**Constants for error handling
 *  
 * @author Romesh Soni
 *
 */
public interface IErrorLogConstants {

	int MAX_LENGTH_ERROR_MSG_COLUMN = 3500;
	
	public static String INFORMATION_TO_SAVE_WHEN_VALUE_BLANK="NA";

	public static enum  DIRECTION_FOR_ERROR_LOG 
	{EBS_TO_FUSION,FUSION_TO_EBS,FUSION_TO_FUSION
		,OTHER_GENERIC_EXCEPTIONS,FUSION_TO_EQUITY,EQUITY_TO_FUSION,ODS_TO_FUSION};
	
	public static enum OBJECT_NAME_FOR_ERROR_LOG  
	{
		EMPLOYEE ("EMPLOYEE"), PURSUIT_PROJECT ("PURSUIT_PROJECT"), DELIVERY_PROJECT("DELIVERY_PROJECT"), COMPANY("COMPANY"), PROJECT("PROJECT"), CONTRACT("CONTRACT"), CONVERSION("CONVERSION");
	   
	   private String val;
	   private OBJECT_NAME_FOR_ERROR_LOG(String val)
	   {
		   this.val=val;
	   }
	   public String getVal()
	   {
		   return val;
	   }
	   
	}
	
	
	public static enum TABLE_NAMES  
	{
	   PURSUIT_PROJECT_STG ("XXHDR_PJM_OSC_PRSUT_PROJ_STG")
	   , PURSUIT_PROJECT_ACK ("XXHDR_PJM_OSC_PRSUT_PROJ_ACK")
	   ,INTEGRATION_STATISTICS("I_INTEGRATION_STATISTICS")
	   ,DELIVERY_PROJECT_ACK("XXHDR_PJM_OSC_DELVRY_PROJ_STG")
	   ,COMPANY_STG("XXHDR_HZ_OSC_CUST_PARTY_STG")
	   ,COMPANY_ODS_OSC_STG("XXHDR_IN_ACCOUNT_STG")
	   , COMPANY_ACK ("XXHDR_HZ_OSC_CUST_PARTY_ACK")
	   ,PROJECT_ODS_OSC_STG("XXHDR_IN_PROJECT_HEADER_STG")
	   ,CONTRACT_ODS_OSC_STG("XXHDR_IN_CONTRACT_STG")
	   ,CONVERSION_ODS_OSC_STG("GL_DAILY_RATES")
	   ,EMPLOYEE_ODS_OSC_STG("XXHDR_IN_EMPLOYEE_HEADER_STG")
	   ;
	   
	   private String val;
	   private TABLE_NAMES(String val)
	   {
		   this.val=val;
	   }
	   public String getVal()
	   {
		   return val;
	   }
	   
	}
	
	String RECORD_ID_COLUMN_NAME = "RECORD_ID";
}
