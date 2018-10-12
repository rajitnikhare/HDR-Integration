package com.hdr.constants;

/**Interface to contain Constants related to Sales Cloud Opportunity/Pursuit Project.
 * 
 * @author Romesh Soni
 *
 */
public interface IOpportunityConstants {

	public static enum EMPLOYEE_ROLE  
	{
	   PURSUIT_LEADER ("Pursuit Leader");
	   
	   private String val;
	   private EMPLOYEE_ROLE(String val)
	   {
		   this.val=val;
	   }
	   public String getVal()
	   {
		   return val;
	   }
	   
	}
	
	public static enum OSC_CONTRACT_TYPE  
	{
	   Master ("Master"), TASK_ORDER("Task Order");
	   
	   private String val;
	   private OSC_CONTRACT_TYPE(String val)
	   {
		   this.val=val;
	   }
	   public String getVal()
	   {
		   return val;
	   }
	   
	}
		
	public static enum EBS_PURSUIT_TYPE  
	{
	   MSA ("MSA"), TASK_ORDER("Task Order"),STANDARD("Standard");
	   
	   private String val;
	   private EBS_PURSUIT_TYPE(String val)
	   {
		   this.val=val;
	   }
	   public String getVal()
	   {
		   return val;
	   }
	   
	}
	
	//The marketing charge number field in osc is pursuit project id holder.
	String OSC_API_PURSUIT_PROJECT_ID="MarketingChargeNumber_c";
	String OPPORTUNITY_FIELD_OPTYID="OptyId";
	String OPPORTUNITY = "Opportunity";
	
	public static enum OSC_OPPORTUNITY_STATUS  
	{
	   WON("WON");
	   
	   private String val;
	   private OSC_OPPORTUNITY_STATUS(String val)
	   {
		   this.val=val;
	   }
	   public String getVal()
	   {
		   return val;
	   }
	   
	}
	
	
}
