package com.hdr.util;

public class Constants {
	
	/**
	 * @author Jeevan We have to remove unwanted Constants on the fly
	 */
	//public static final String FCRMOD_CUSTOMERACCOUNT_URL = "FCRMOD_CUSTOMERACCOUNT_URL";
	public static final String FCRMOD_OPPORTUNITY_URL = "FCRMOD_OPPORTUNITY_URL";
	public static final String FCRMOD_PERSON_URL = "FCRMOD_PERSON_URL";
	public static final String FCRMOD_SALESPARTY_URL = "FCRMOD_SALESPARTY_URL";
	public static final String FCRMOD_LOCATION_URL = "FCRMOD_LOCATION_URL";
	public static final String FCRMOD_ORGANIZATIONPARTY_URL = "FCRMOD_ORGANIZATIONPARTY_URL";
	public static final String FCRMOD_SALES_CUSTOM_OBJECT_URL = "FCRMOD_SALES_CUSTOM_OBJECT_URL";
	public static final String FCRMOD_EMPLOYEE_URL = "FCRMOD_EMPLOYEE_URL";
	public static final String FCRMOD_ACCOUNT_URL = "FCRMOD_ACCOUNT_URL";
	
	public static final String FUSION_ATTRIBUTE_NAME_LEGACY_ID="";
	
	public static final String FUSION_ATTRIBUTE_NAME_EBS_ID="EmployeeID_c";
	
	
	
	
	
	//max rows to read from fusion
	public static final int FUSION_READ_LIMIT = 100;
	//LAST UPDATE DATE COLUMN NAME AT FUSION
	public static final String FUSION_LAST_UPDATE_COL_NAME = "LastUpdateDate";
	
	public static final int FUSION_OFFSET = 0;
	public static final String FUSION_DATE_ATTRIBUTE_NAME = "LastUpdateDate";
	
	//FUSION- OPERATOR TO USE TO DOWNLOAD LATEST RECORD  
	public static final String FUSION_DATE_AFTER_OPERATOR = "AFTER";
	public static final String FUSION_EQUALS_OPERATOR = "=";
	public static final String FUSION_SALES_ACCOUNT = "SalesAccount";
	public static final String FUSION_ORGANIZATION_PARTY_ATTRIBUTE_NAME = "OrganizationParty";
	
	
	
	public static enum  SYNC_STATUS  {COMPLETED("COMPLETED"),IN_PROGRESS("IN PROGRESS"),ERROR("ERROR"),READY("READY");
		 private String val;
		   private SYNC_STATUS(String val)
		   {
			   this.val=val;
		   }
		   public String getVal()
		   {
			   return val;
		   }
		   
	
	};
	public static enum  SYNC_STATE  {EBS_TO_OSC,OSC_TO_EBS};
	public static enum  ACCOUNT_FUSION_INTEGRATION_STATUS{To_be_processed,In_Progress,Completed,Failed};
	public static enum  SOURCE_TARGET  {OSC,EBS};
	public static enum  HDR_INT_OBJECT {Company};
	public static enum  HDR_OPERATION {CREATE,UPDATE,QUERY,DELETE};
	public static enum  HDR_PROJECT_CHILD {Location_c,DatesMilestones_c, CostsFees_c, Subconsultant_c, ProjectTeam_c};
	//Nagesh code on 11262015
	public static enum  HDR_EMPLOYEE_CHILD {Education_c,Training_c,EmployeeProjects_c,LicensesCertifications_c,Presentations_c};
	
	
	
	public static final String GET_POLLING_INFO = "GET_POLLING_INFO";
	public static final String GET_INTEGRATIONJOB_INFO = "GET_INTEGRATIONJOB_INFO";
	public static final String GET_UNPROCESSED_ACCOUNT = "GET_UNPROCESSED_ACCOUNT";
	public static final String GET_UNPROCESSED_CHILD_ACCOUNT = "GET_UNPROCESSED_CHILD_ACCOUNT";
	public static final String GET_UNPROCESSED_PARENT_ACCOUNT = "GET_UNPROCESSED_PARENT_ACCOUNT";
	public static final String GET_UNPROCESSED_PRICELIST = "GET_UNPROCESSED_PRICELIST";
	public static final String GET_UNPROCESSED_PRODUCTITEM = "GET_UNPROCESSED_PRODUCTITEM";
	public static final String GET_UNPROCESSED_BILLING = "GET_UNPROCESSED_BILLING";
	public static final String GET_UNPROCESSED_BACKLOG = "GET_UNPROCESSED_BACKLOG";
	public static final String GET_UNPROCESSED_EMPLOYEES = "GET_UNPROCESSED_EMPLOYEES";
	public static final String GET_UNPROCESSED_PROJECTS="GET_UNPROCESSED_PROJECTS";
	public static final String GET_UNPROCESSED_CONVERSIONRATES="GET_UNPROCESSED_CONVERSIONRATES";
	
	
	//job names
	
	public static final String CONVERSIONRATEEBSTOOSCSYNCJOB="ConversionRateEBStoOSCSyncJob";
	
	
	
	
	
	
	
	
	//public static enum  JOBS_STATUS  {COMPLETED,IN_PROGRESS,ERROR};
	public static enum  OBJECTS  {BACKLOG_BILLING,PRODUCT,PRICELIST,ACCOUNT};
	public static enum  OBJECTS_V2  {Backlog,Billing,Product,Pricelist,Customer};
	public static final String SYNC_JOB_QUERY = "SYNC_JOB_QUERY";
	public static final String DATA_SYNC_STAGE_QUERY = "DATA_SYNC_STAGE_QUERY";
	
	public static final String APP_PROPERTY_FILE_NAME = "application.properties";
	public static enum  SYNC_STEP {UNPROCESSED,CRMOD_TO_DB,DB_CRMOD,STAGING_FCRM, JDE_STAGING,FUSION_TO_STAGING,WAITING_FOR_AGENT,WAITING_FOR_AGENCY,DMB_TO_STAGING,PROCESSED,JDE_TO_STAGING,STAGING_TO_FUSION,STAGING_TO_DMB,EBS_TO_STAGING,STAGING_TO_OSC};
	
	//FUSION TIME ZONE 
	public static final String FUSION_TIMEZONE = "UTC";
	//FUSION DATE FORMAT 2014-08-05
	public static final String FUSION_DATE_FORMAT_UTC = "yyyy-MM-dd'T'HH:mm:ss.SSS";
	public static final String FUSION_DATE_FORMAT = "yyyy-MM-dd";
	//ROMESH: PLEASE DONT MODIFY BELOW CONSTANT (FUSION_DATE_FORMAT_UTC_WITH_NO_NANO_SECONDS).
		public static final String FUSION_DATE_FORMAT_UTC_WITH_NO_NANO_SECONDS = "yyyy-MM-dd'T'HH:mm:ss'.'";
	
	//
	
	
	//FUSION- OPERATOR TO USE EQUAL TO COMPARISION FOR NUMERIC FIELDS  
	public static final String FUSION_NUMERIC_EQUAL_TO_OPERATOR = "=";

	
	
	
	public static enum  DATABASE {COMPLETED,ERROR};
	
	
	public static final String UNPROCESSED_STAGING_AGENTS_AGENT_ID_FUSION_UPDATE = "UNPROCESSED_STAGING_AGENTS_AGENT_ID_FUSION_UPDATE";
	public static final String UNPROCESSED_STAGING_AGENCIES_AGENCY_ID_FUSION_UPDATE="UNPROCESSED_STAGING_AGENCIES_AGENCY_ID_FUSION_UPDATE";
	public static final String UNPROCESSED_STAGING_OPPORTUNITIES_JDEFIELDS_FUSION_UPDATE="UNPROCESSED_STAGING_OPPORTUNITIES_JDEFIELDS_FUSION_UPDATE";
	public static final String UNPROCESSED_STAGING_OPPORTUNITIES_DMBFIELDS_FUSION_UPDATE="UNPROCESSED_STAGING_OPPORTUNITIES_DMBFIELDS_FUSION_UPDATE";
	
	//Value to send for For fusion field "CreatedByModule" while creating new records 
	public static final String FUSION_RECORD_CREATEDBYMODULE="HZ_WS";
	public static final String FCRMOD_USERNAME = "FCRMOD_USERNAME";
	public static final String FCRMOD_PASSWORD = "FCRMOD_PASSWORD";
	

	
	//FCRMOD COLUMNS
	public static final String FCRMOD_PERSON_ROWID_COLNAME= "PartyId";
	public static final String FCRMOD_SALESPARTY_ROWID_COLNAME= "PartyId";
	public static final String FCRMOD_OPPORTUNITY_ROWID_COLNAME= "OptyId";
	public static final String FCRMOD_LOCATION_ROWID_COLNAME= "LocationId";
	public static final String FCRMOD_METROAREA_ROWID_COLNAME= "CRM_CUST_ID";
	
	public static final String OrganizationParty= "OrganizationParty";
	public static final String Relationship="Relationship";
	
	//constants
	public static final boolean FUSION_DREAMBLDR_PROCESS_FLAG_FOR_OPP_DOWNLOAD=true;
	
	public static final String FILE_BASE_DIR = "FILE_BASE_DIR";
	
	public static final String APPLICATION_SOURCE_SYSTEM = "JDE";
	
	public static final String FILE_INCOMING_DIRECTORY = "INCOMING";
	
	public static final String FILE_WORK_DIRECTORY = "WORK";
	
	public static final String FILE_ARCHIVE_DIRECTORY = "ARCHIVE";
	
	public static final String ACCOUNT_SUBJECT_AREA = "Tenant";
	
	public static final String BUILDING_SUBJECT_AREA = "Building";
	
	public static final String PROPERTY_SUBJECT_AREA = "Property";
	
	public static final String UNIT_SUBJECT_AREA = "Unit";
	
	public static final String LEASE_ABSTRACT_SUBJECT_AREA = "Lease";

	public static final String PROPERTY_FCRMOD_OBJECT_NAME = "Properties_c";

	public static final String UNIT_FCRMOD_OBJECT_NAME = "Units_c";

	public static final String LEASE_ABSTRACT_FCRMOD_OBJECT_NAME = "Lease_c";

	public static final String GET_STAGING_ACCOUNT_BY_ID = "GET_STAGING_ACCOUNT_BY_ID";

	public static final String CREATED_BY_USER_NAME = "Integration";

	public static final String MODIFIED_BY_USER_NAME = "Integration";

	public static final String DATA_LINE_STARTS_WITH = "D";

	public static final String GET_STAGING_PROPERTY_BY_ID = "GET_STAGING_PROPERTY_BY_ID";

	public static final String GET_STAGING_UNIT_BY_ID = "GET_STAGING_UNIT_BY_ID";

	public static final String GET_STAGING_LEASE_ABSTRACT_BY_ID = "GET_STAGING_LEASE_ABSTRACT_BY_ID";

	public static final String CREATED_BY_MODULE_NAME = "TCA_V1_API";

	

	public static final String LEASING_SITE_TYPE = "SELL_TO";

	public static final String BILLING_SITE_TYPE = "BILL_TO";

	public static final String SALES_ACCOUNT_TYPE_TENANT = "Tenant";

	public static final String QUERY_EQUAL_TO_OPERATOR = "=";

	public static final String COUNTRY_NAME_US = "US";

	public static final String COUNTRY_NAME_CANADA = "CA";

	public static final String EXTERNAL_SYSTEM_ID_ATTRIBUTE_NAME = ".EXT_ID_ATTRIB_NAME";

	public static final String ERROR_EMAIL_SUBJECT = "[Drees Homes] CRM Integration Error while processing ";

	public static final String OBJECT_NAME_ACCOUNT = "Account";

	public static final String OBJECT_NAME_PROPERTY = "Property";

	public static final String OBJECT_NAME_UNIT = "Unit";

	public static final String OBJECT_NAME_LEASE = "Lease";

	public static final String FILE_EXTRACT_DELIMITER = "\\|";

	public static final String SALES_ACCOUNT_ID_TAG = "SalesAccountId";

	public static final String PERCENT_SIGN = "%";

	public static final String TRAILER_LINE_STARTS_WITH = "T";

	public static final String TOTAL_BASE_RENTAL_INCOME_FIELD_NAME = "Total Base Rental Income";

	public static final String TOTAL_EP_COSTS_FIELD_NAME = "Total EP Costs";

	public static final String SALES_VOLUME_FIELD_NAME = "Sales Volume";

	public static final String OFFICE_LEASABLE_SIZE_FIELD_NAME = "Leasable Size Office";

	public static final String RETAIL_LEASABLE_SIZE_FIELD_NAME = "Leasable Size Retail";

	public static final String IFRS_CAPITALIZED_VALUATION_FIELD_NAME = "IFRS Capitalized Valuation";

	public static final String IFRS_STABELIZED_NOI_FIELD_NAME = "IFRS Stabelized NOI";

	public static final String DEVELOPMENT_BUDGET_AMOUNT_FIELD_NAME = "Development Budget Amount";

	public static final String DEVELOPMENT_BUDGET_SCOPE_FIELD_NAME = "Development Budget Scope";

	public static final String RENTABLE_SPACE_FIELD_NAME = "Rentable Sapce";

	public static final String USABLE_SPACE_FIELD_NAME = "Usable Space";

	public static final String BUDGET_NET_RENT_FIELD_NAME = "Budget Net Rent";

	public static final String BUDGET_TENANT_INDUCE_FIELD_NAME = "Budget Tenant Induce";

	public static final String BUDGET_LANDLORD_COST_FIELD_NAME = "Budget LandLord's Cost";

	public static final String BUDGET_FREE_RENT_MONTHS_FIELD_NAME = "Budget Free Rent Months";

	public static final String BUDGET_NER_FIELD_NAME = "Budget NER";

	public static final String BASE_RENT_FIELD_NAME = "Base Rent";

	public static final String ANNUAL_BREAK_POINT_FIELD_NAME = "Annual Break Point";

	public static final String BUDGETED_LANDLORD_WORK_FIELD_NAME = "Budgeted Landlord Work";

	public static final String TENANT_ALLOWANCES_FIELD_NAME = "Tenant Allowances";

	public static final String UNIT_OPERATING_COSTS_FIELD_NAME = "Unit Operating Cost";

	public static final String DEPOSIT_FIELD_NAME = "Deposit";

	public static final String INCOME_PRODUCING_DATE_FIELD_NAME = "Income Producing Date";

	public static final String ORIGINAL_CONSTRUCTION_DATE_FIELD_NAME = "Original Construction Date";

	public static final String VALUATION_DATE_FIELD_NAME = "Valuation Date";

	public static final String CONSTRUCTION_START_DATE_FIELD_NAME = "Construction Start Date";

	public static final String CONSTRUCTION_COMPLETION_DATE_FIELD_NAME = "Construction Completion Date";

	public static final String REDEVELOPMENT_DATE_FIELD_NAME = "Redevelopment Date";

	public static final String DATE_OF_ROOF_REPLACEMENT_FIELD_NAME = "Date of Roof Replacement";

	public static final String DATE_LAST_VACATED_FIELD_NAME = "Date Last Vacated";

	public static final String LEASE_EFFECTIVE_DATE_FIELD_NAME = "Lease Effective Date";

	public static final String LEASE_EXPIRY_DATE_FIELD_NAME = "Lease Expiry Date";

	public static final String BASE_RENT_PERIOD_FROM_FIELD_NAME = "Base Rent Period From";

	public static final String BASE_RENT_PERIOD_TO_FIELD_NAME = "Base Rent Period To";

	public static final String FREE_RENT_START_DATE_FIELD_NAME = "Free Rent Start Date";

	public static final String FREE_RENT_END_DATE_FIELD_NAME = "Free Rent End Date";

	public static final String TENANT_RENEWAL_NOTIFICATION_DATE_FIELD_NAME = "Tenant Renewal Notification Date";

	public static final String RENEWAL_DATE_FIELD_NAME = "Renewal Date";

	public static final String AGREEMENT_EXECUTION_DATE_FIELD_NAME = "Agreement Execution Date";

	public static final String OPENING_DATE_FIELD_NAME = "Opening Date";

	public static final String ACTUAL_MOVEOUT_DATE_FIELD_NAME = "Actual Move Out Date";

	public static final String NUMBER_OF_UNITS_OFFICE_FIELD_NAME = "Number Of Units (Office)";

	public static final String NUMBER_OF_UNITS_RETAIL_FIELD_NAME = "Number Of Units (Retail)";

	public static final String NUMBER_OF_INDOOR_PARKING_SPACES_FIELD_NAME = "Number Of Indoor Parking Spaces";

	public static final String NUMBER_OF_OUTDOOR_PARKING_SPACES_FIELD_NAME = "Number Of Outdoor Parking Spaces";

	public static final String INITIAL_FREE_RENT_PERIOD_FIELD_NAME = "Initial Free Rent Period";

	public static final String NUMBER_OF_RENEWAL_OPTIONS = "Number Of Renewal Options";

	public static final String RENEWAL_TERMS_FIELD_NAME = "Renewal Terms";

	public static final String FIXTURING_PERIOD_FIELD_NAME = "Fixturing Period";

	public static final String UNIT_AVAILABLE_FIELD_NAME = "Unit Available";

	public static final String UNIT_OCCUPIED_FIELD_NAME = "Unit Occupied";
	
	
	
	//lookup values key names
	public static final String CRM_PICKLIST_MAPPING_KEY_STATE = "US_STATE";
	public static final String CRM_PICKLIST_MAPPING_KEY_OPPTY_RANK = "OPPTY_RANK";
	public static final String CRM_PICKLIST_MAPPING_KEY_OPPTY_SALES_STAGE = "OPPTY_SALES_STAGE";
	
	public static final String PROPERTY_ENCRYPTION_PREFIX = "ENC(";
	public static final String PROPERTY_ENCRYPTION_PASSWORD = "crmod";
	
	public static final String UNPROCESSED_FLOOR_PLAN_ELEVATION_QUERY = "unProcessedFloorPlanElevation";
	public static final String FLOOR_PLAN_ELEVATION_FCRMOD_OBJECT_NAME = "FloorPlanElevation_c";
	
	public static final String EMAIL_TEMPLATE_FCRMOD_OBJECT_NAME = "EmailTemplates_c";
	
	public static final String SALES_CUSTOM_OBJECT_DEFAULT_URL = "https://crm-aufsn4x0bwf.oracleoutsourcing.com:443/opptyMgmtExtensibility/SalesCustomObjectService";
	public static final String UPDATE_SYNC_FIELDS_FLOOR_PLAN_ELEVATION = "updateSyncFieldFloorPlanElevation";

	public static final String DMB_PICKLIST_QUERY = "DMB_PICKLIST_QUERY";
	public static final String CRM_PICKLIST_QUERY = "CRM_PICKLIST_QUERY";

	public static final String UNPROCESSED_WEB_TO_LEAD_QUERY = "UNPROCESSED_WEB_TO_LEAD_QUERY";
	
	//SYSTEM PROPERTY KEY NAMES
	public static final String SYS_PROP_KEY_OPP_SALESTAGE_CRMID_PROSPECT = "OPP_SALESTAGE_CRMID_PROSPECT";
	public static final String SYS_PROP_KEY_OPP_SALESTAGE_CRMID_QUA_LEAD = "OPP_SALESTAGE_CRMID_QUA_LEAD";
	public static final String SYS_PROP_KEY_OPP_SALESTAGE_CRMID_OPN_BUYR = "OPP_SALESTAGE_CRMID_OPN_BUYR";
	public static final String SYS_PROP_KEY_OPP_SALESTAGE_CRMID_CLOSD_BUYR = "OPP_SALESTAGE_CRMID_CLOSD_BUYR";
	public static final String SYS_PROP_KEY_OPP_SALESTAGE_CRMID_CANCLD = "OPP_SALESTAGE_CRMID_CANCLD";
	public static final String SYS_PROP_KEY_OPP_SALESTAGE_CRMID_LOST = "OPP_SALESTAGE_CRMID_LOST";

	public static final String FCRMOD_INTERACTION_URL = "FCRMOD_INTERACTION_URL";
	public static final String FCRMOD_INTERACTION_DEFAULT_URL = "https://crm-aufsn4x0bwf.oracleoutsourcing.com:443/appCmmnCompInteractions/InteractionService";
	
	public static final String FCRMOD_ACTIVITY_URL = "FCRMOD_ACTIVITY_URL";
	public static final String FCRMOD_ACTIVITY_DEFAULT_URL = "https://crm-aufsn4x0bwf.oracleoutsourcing.com:443/appCmmnCompActivities/ActivityTaskService";

	
	public static final String FCRMOD_APPOINTMENT_URL = "FCRMOD_APPOINTMENT_URL";
	public static final String FCRMOD_INTERACTION_APPOINTMENT_URL = "https://crm-aufsn4x0bwf.oracleoutsourcing.com/appCmmnCompActivities/ActivityAppointmentService?WSDL";

	
	public static final String UPDATE_SYNC_FIELDS_WEBTO_LEAD = "updateSyncFieldsWebToLead";	
	//below constants are used while logging errors
	public static final String PRIMARY_FIELD_NAME_AGENCY_TABLE = "crm_row_id";
	public static final String TABLE_NAME_AGENCY_TABLE = "CRM_AGENCY";
	public static final String PRIMARY_FIELD_NAME_AGENT_TABLE = "crm_row_id";
	public static final String TABLE_NAME_AGENT_TABLE = "CRM_AGENT";
	public static final String PRIMARY_FIELD_NAME_FLOOR_PLAN_ELEV_TABLE = "NEIGHBORHOOD_CODE,PLAN_CODE,ELEVATION_CODE";
	public static final String TABLE_NAME_FLOOR_PLAN_ELEV_TABLE = "CRM_FLOOR_PLAN_ELEVATION";
	public static final String PRIMARY_FIELD_NAME_OPPTY_TABLE = "crm_row_id";
	public static final String TABLE_NAME_OPPTY_TABLE = "CRM_OPPORTUNITY";
	public static final String PRIMARY_FIELD_NAME_WEB_TO_LEAD_TABLE = "WTL_ID";
	public static final String TABLE_NAME_WEB_TO_LEAD_TABLE = "WTL_WEB_TO_LEAD";
	public static final String LEAD_VISIT_DATE_DIFFERENCE = "LEAD_VISIT_DATE_DIFFERENCE";
	public static final String TABLE_NAME_METROAREA_TABLE = "CRM_METRO_AREA";
	
	public static final String GET_PROCESSED_DATA_FOR_PURGE="GET_PROCESSED_DATA_FOR_PURGE";
	public static final String PURGE_DELETE="PURGE_DELETE";
	public static final String FCRMOD_ATTACHMENT_URL = "FCRMOD_ATTACHMENT_URL";
	public static final String GET_PURGE_DETAIL = "GET_PURGE_DETAIL";
	//EQUITY STAFFING
	public static final String FUSION_OPPORTUNITY_TALEO_STATUS = "TBP";
	
	public static final String EQUITY_OBJECT_REQUISITION = "REQUISITION";
	public static final String EQUITY_OBJECT_ACCOUNT = "ACCOUNT";
	public static final String EQUITY_OBJECT_CONTACT = "CONTACT";
	public static final String EQUITY_OBJECT_CANDIDATE = "CANDIDATE";
	public static final String EQUITY_OBJECT_USER = "USER";
	
	public static final String EQUITY_COMPANY_CODE = "EQUITY_COMPANY_CODE";
	public static final String EQUITY_USERNAME = "EQUITY_USERNAME";
	public static final String EQUITY_PASSWORD = "EQUITY_PASSWORD";
	
	public static final String EQUITY_CANDIDATE_LAST_MODIFIED_DATETIME ="EQUITY_CANDIDATE_LAST_MODIFIED_DATETIME";
	public static final String EQUITY_DATE_FORMAT = "yyyy-MM-dd";
	public static final String EQUITY_DATE_TIME_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZ";
	public static final String EQUITY_PROCESSED = "EP";
	public static final int EQUITY_REQUISITION_CREATE = 1;
	public static final int EQUITY_REQUISITION_UPDATE = 0;
	public static final String EQUITY_CANDIDATE_LAST_MODIFIED_DATE = "EQUITY_CANDIDATE_LAST_MODIFIED_DATE";
	public static final String FUSION_OPPORTUNITY_SALES_STAGE = "FUSION_OPPORTUNITY_SALES_STAGE";
	public static enum  DIRECTION_FOR_ERROR_LOGS {FUSION_TO_EQUITY,EQUITY_TO_FUSION};
	
	//Opportunity Sales Stages
	public static final String OPP_SS_LEAD ="Lead";
	public static final String OPP_SS_REQUIREMENTS ="Requirements";
	public static final String OPP_SS_SUBMITTED_TO_BD ="Submitted to BD";
	public static final String OPP_SS_SUMITTED_TO_CLIENT ="Submitted to Client";
	public static final String OPP_SS_INTERVIEWS ="Interviews";
	public static final String OPP_SS_STMTOF_WRK_NEGO ="Statement of Work Negotiation";
	public static final String OPP_SS_STMTOF_WRK_EXE  = "Statement of Work Executed";
	public static final String OPP_SS_CANDID_ON_BOARDING ="Candidate OnBoarding";
	public static final String OPP_SS_COSED_WIN ="Closed/Win";
	public static final String OPP_SS_CANCELLED ="Cancelled";
	public static final String OPP_SS_CLOSED_LOST ="Closed/Lost";
	public static final String OPP_SS_INTERVIEWING = "Interviewing";
	
	//For Candidate Fetch
	public static final String EQUITY_LAST_UPDATED_ATTRIB = "lastUpdated";
	public static final String EQUITY_AFTER_DATE_OPERATOR = "|";
	public static final long FUSION_SUBMITTED_TO_BD_ID = 300000001050237l;
	public static final long FUSION_SUBMITTED_TO_CLIENT_ID = 300000001050246l;
	public static final long FUSION_INTERVIEW_ID = 300000001050253l;
	public static final CharSequence FUSION_STRING_YES = "Y";
	public static final String FUSION_ATTRIBUTE_NAME_RETRY_COUNT ="RetryCount_c";
	public static final Integer FUSION_ATTRIBUTE_RETRY_COUNT =3;
	public static final String FUSION_ATTRIBUTE_RETRY_COUNT_OPERATOR = "&lt;";
	public static final String FUSION_ATTRIBUTE_OPTY_ID = "optyId";
	public static final String EQUITY_ATTRIBUTE_CANDIDATE_ID = "candidateId";
	public static final String FCRMOD_INT_UPDATE = "INT_UPDATE";
	public static final String HASH_SEPERATOR = "#";
	public static final String MY_SQL_FORMAT = "dd-MM-yyyy";
	public static final String FUSION_CREATED_BY_MODULE = "HZ_WS";
	public static final String FUSION_SELL_TO = "SELL_TO";
	public static final String FUSION_ATTRIBUTE_NAME_SALES_ACCOUNT = "SalesAccount";
	public static final String FUSION_ATTRIBUTE_OPERATOE_EQUAL = "=";
	public static final String FUSION_ATTRIBUTE_NAME_CUSTOMER_ID = "PartyOrigSysRef_c";
	public static final String FUSION_ATTRIBUTE_NAME_ORGANIZATION_PARTY = "OrganizationParty";
	public static final String FUSION_ATTRIBUTE_NAME_ORGANIZATION_PROFILE = "OrganizationProfile";
	public static final String FUSION_ATTRIBUTE_NAME_ORG_SYS_REF = "OrigSystemPricingAttrRef_c";
	public static final String FUSION_CUSTOM_OBJECT_PRICELIST = "PriceList_c";
	public static final String FUSION_CUSTOM_OBJECT_BACKLOGANDBILLING = "BillingAndBacklog_c";
	public static final String GET_UNPROCESSED_ACCOUNT_V2 = "GET_UNPROCESSED_ACCOUNT_V2";
	
	public static final String SYNC_ACCOUNT_FROM_EBS = "SYNC_ACCOUNT_FROM_EBS";
	public static final String SYNC_PRICELIST_FROM_EBS = "SYNC_PRICELIST_FROM_EBS";
	public static final String GET_UNPROCESSED_PRICELIST_V2 = "GET_UNPROCESSED_PRICELIST_V2";
	public static final String SYNC_PRODUCT_FROM_EBS = "SYNC_PRODUCT_FROM_EBS";
	public static final String GET_UNPROCESSED_PRODUCTITEM_V2 = "GET_UNPROCESSED_PRODUCTITEM_V2";
	public static final String GET_UNPROCESSED_BACKLOG_AND_BILLING_V2 = "GET_UNPROCESSED_BACKLOG_AND_BILLING_V2";
	public static final String SYNC_BACKLOG_AND_BILLING_FROM_EBS = "SYNC_BACKLOG_AND_BILLING_FROM_EBS";
	public static final String FUSION_ATTRIBUTE_RECORD_NAME = "RecordName";
	public static final String GET_UNPROCESSED_BACKLOG_AND_BILLING = "GET_UNPROCESSED_BACKLOG_AND_BILLING";
	public static final String FCRMOD_ITEM_URL = "FCRMOD_ITEM_URL";
	public static final String GET_CUSTOMER_ADDRESS = "GET_CUSTOMER_ADDRESS";
	public static final String GET_UPROCESSED_EMAIL = "GET_UPROCESSED_EMAIL";
	public static final String EMAIL_NOTIFICATION_BATCH_SIZE = "EMAIL_NOTIFICATION_BATCH_SIZE";
	public static final String GET_UPROCESSED_EMAIL_GENERAL = "GET_UPROCESSED_EMAIL_GENERAL";
	public static final String MAIL_PROPERTY_FILE_NAME = "mail.properties";
	public static final String IS_BACKLOG_AND_BILLING = "IS_BACKLOG_AND_BILLING";
	public static final String IS_PRICELIST = "IS_PRICELIST";
	public static final String IS_PRODUCT = "IS_PRODUCT";
	public static final String IS_ACCOUNT = "IS_ACCOUNT";
	public static final String isObjectActive="1";
	public static final String CAV_FORECASTING_GENERIC_ERROR_SIMPLE = "simpleMessage";
	public static final String CAV_FORECASTING_GENERIC_ERROR_DETAIL = "detailedMessage";
	public static final String LOAD_BB_AGGRESSIVE = "LOAD_BB_AGGRESSIVE";
	public static final String CAV_INT_FETCH_DAY_ACC = "CAV_INT_FETCH_DAY_ACC";
	public static final String CAV_INT_FETCH_DAY_PRC = "CAV_INT_FETCH_DAY_PRC";
	public static final String CAV_INT_FETCH_DAY_BB = "CAV_INT_FETCH_DAY_BB";
	public static final String CAV_INT_FETCH_DAY_PRO = "CAV_INT_FETCH_DAY_PRO";
	public static final String GET_UNPROCESSED_ACCOUNT_CACHE = "GET_UNPROCESSED_ACCOUNT_CACHE";
	public static final String GET_UNPROCESSED_STATS = "GET_UNPROCESSED_STATS";
	public static final String GET_UNPROCESSED_COMPANY_ACKLG = "GET_UNPROCESSED_COMPANY_ACKLG";
	public static final String GET_BACTH_KEY = "GET_BACTH_KEY";
	public static final String GET_UNPROCESSED_ADDRESS_ACKLG = "GET_UNPROCESSED_ADDRESS_ACKLG";
	public static final String GET_UNPROCESSED_PURSUIT_PROJECT_ACKLG="GET_UNPROCESSED_PURSUIT_PROJECT_ACKLG";
	public static final String GET_UNPROCESSED_DELIVERY_PROJECT_ACKLG="GET_UNPROCESSED_DELIVERY_PROJECT_ACKLG";
	

	public static final String GET_UNPROCESSED_ACKNOWLEDGEMENT_RECORDS = "GET_UNPROCESSED_ACKNOWLEDGEMENT_RECORDS";
	public static final String GET_UNPROCESSED_PROJECTS_HEADER = "GET_UNPROCESSED_PROJECTS_HEADER";
	public static final String GET_UNPROCESSED_PROJECT_AD_DATES = "GET_UNPROCESSED_PROJECT_AD_DATES";
	public static final String GET_UNPROCESSED_PROJECT_FEE_COST = "GET_UNPROCESSED_PROJECT_FEE_COST";
	public static final String GET_UNPROCESSED_PROJECT_LOCATION = "GET_UNPROCESSED_PROJECT_LOCATION";
	public static final String GET_UNPROCESSED_PROJECT_SUBCONS = "GET_UNPROCESSED_PROJECT_SUBCONS";
	public static final String GET_UNPROCESSED_PROJECT_TEAM = "GET_UNPROCESSED_PROJECT_TEAM";

	//constants added by Nagesh on 26/11/2015 for Employee
	public static final String GET_UNPROCESSED_EMPLOYEES_HEADER = "GET_UNPROCESSED_EMPLOYEES_HEADER";
	public static final String GET_UNPROCESSED_EMPLOYEES_TRAINING = "GET_UNPROCESSED_EMPLOYEES_TRAINING";
	public static final String GET_UNPROCESSED_EMPLOYEES_EDUCATION = "GET_UNPROCESSED_EMPLOYEES_EDUCATION";
	public static final String GET_UNPROCESSED_EMPLOYEES_PROJECTS = "GET_UNPROCESSED_EMPLOYEES_PROJECTS";
	public static final String GET_UNPROCESSED_EMPLOYEES_CREDENTIALS = "GET_UNPROCESSED_EMPLOYEES_CREDENTIALS";
	public static final String GET_UNPROCESSED_EMPLOYEES_PUBLICATIONSPRESENTATIONS = "GET_UNPROCESSED_EMPLOYEES_PUBLICATIONSPRESENTATIONS";
	//constants end by Nagesh
	
	public static final String ACCOUNT_FIELD_TYPE = "Type";
	public static final Object ACCOUNT_TYPE_PROSPECT = "ZCA_PROSPECT";
	public static final String ACCOUNT_FIELD_EBS_INTEGRATION_STATUS = "OrganizationDEO_EBSIntegrationStatus_c";
	public static final String ACCOUNT_FIELD_CLASSIFICATION_HDR_MARKETTING = "HDR Marketing";
	public static final String ACCOUNT_FIELD_PROFILE_CLASS_PROSPECT = "Prospect";
	public static final String ACCOUNT_FIELD_ACCOUNT_TYPE_EXTERNAL = "External";
	public static final String ACCOUNT_FIELD_ORGANIZATION_TYPE_ORGANIZATION = "ORGANIZATION";
	public static final String HDR_INT_STATUS_CODE = "N";

	
	
	
	public static enum  FUSION_BACKLOG_BILLING_SOURCE  {Backlog,Billing};
	public static final int SYNC_JOB_MAX_RETRY_COUNT = 3;
	public static final String GET_BATCH_KEY = "GET_BATCH_KEY";
	public static final String GET_UNPROCESSED_CONTRACT_HEADER = "GET_UNPROCESSED_CONTRACT_HEADER";
	public static final String FCRMOD_URL = "FCRMOD_URL";
	public static final String GET_UNPROCESSED_ACCOUNT_DATALOAD = "GET_UNPROCESSED_ACCOUNT_DATALOAD";
	public static final String FCRMOD_CONTRACT_URL = "FCRMOD_CONTRACT_URL";
	public static final String GET_PARENT_ACCOUNT = "GET_PARENT_ACCOUNT";
	
}
