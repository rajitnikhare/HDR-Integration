package com.hdr.constants;

/**
 * Constants for the OSC Project object.
 * 
 * @author Jeevan
 *
 */
public interface IProjectConstants {

	String PROJECT_CUSTOM_OBJECT_NAME = "Projects_c";

	String PROJECT_FIELD_COMPANY_ENGINEERING = "Engineering";
	String PROJECT_FIELD_COMPANY_ARCHITECTURE = "Architecture";
	
	public static final String PROJECT_FIELD_COST_FEE_COLLECTION = "CostsFeesCollection_c";
	public static final String PROJECT_FIELD_LOCATION_COLLECTION = "LocationCollection_c";
	public static final String PROJECT_FIELD_SUBCONSULTANT_COLLECTION = "SubconsultantCollection_c";
	public static final String PROJECT_FIELD_ID = "Id";
	public static final String PROJECT_FIELD_RECORDNAME = "RecordName";
	public static final String PROJECT_FIELD_COSTFEEID = "CostFeeId_c";
	public static final String PROJECT_FIELD_LOCATIONID = "LocationId_c";
	public static final String PROJECT_FIELD_EBS_PROJECT_ID = "EBSProjectID_c";

	public static enum HDR_PROJECT_CHILD {
		Location_c, DatesMilestones_c, CostsFees_c, Subconsultant_c, ProjectTeam_c
	};
}
