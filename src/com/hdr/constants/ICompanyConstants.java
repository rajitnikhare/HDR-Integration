package com.hdr.constants;

/**Interface to contain Constants related to Sales Cloud Company.
 * 
 * @author jeevan
 *
 */
public interface ICompanyConstants {
	
	
	/**
	 * 
	 * @author jeevan
	 *
	 */
	public static enum ACCOUNT_FUSION_INTEGRATION_STATUS{
		TO_BE_PROCESSED("To be processed"), IN_PROGRESS("In Progress"), COMPLETED("Completed"), ERROR("Error");
		private String val;
		private ACCOUNT_FUSION_INTEGRATION_STATUS(String val) {
			this.val = val;
		}
		public String getVal() {
			return val;
		}

	}
	
	
	
	public static enum ACCOUNT_TYPE_PROSPECT{
		ZCA_PROSPECT("ZCA_PROSPECT"), ZCA_CUSTOMER("ZCA_CUSTOMER");
		private String val;
		private ACCOUNT_TYPE_PROSPECT(String val) {
			this.val = val;
		}
		public String getVal() {
			return val;
		}

	}
	public static final String ACCOUNT_FIELD_TYPE = "Type";
	public static final String ACCOUNT_FIELD_EBS_INTEGRATION_STATUS = "OrganizationDEO_EBSIntegrationStatus_c";
	public static final String ACCOUNT_FIELD_CLASSIFICATION_HDR_MARKETTING = "HDR Marketing";
	public static final String ACCOUNT_FIELD_PROFILE_CLASS_PROSPECT = "Prospect";
	public static final String ACCOUNT_FIELD_ACCOUNT_TYPE_EXTERNAL = "External";
	public static final String ACCOUNT_FIELD_ORGANIZATION_TYPE_ORGANIZATION = "ORGANIZATION";
	public static final String ACCOUNT_FIELD_EBS_PARTY_ID = "OrganizationDEO_EBSPartyId_c";
	public static final String ACCOUNT_FIELD_EBS_ACCOUNT_ID = "OrganizationDEO_EBSAccountId_c";
	public static final String ACCOUNT_FIELD_PARTY_ID = "PartyId";
	public static final String ACCOUNT_FIELD_PARENT_PARTY_ID = "ParentAccountPartyId";
	public static final String GET_UNPROCESSED_COMPANY_ACKLG = "GET_UNPROCESSED_COMPANY_ACKLG";
	public static final String ACCOUNT_FIELD_LEGACY_ID = "OrganizationDEO_CompanyLegacySystemID_c";
	public static final String PARENT = "PARENT";
	
	
	
}


