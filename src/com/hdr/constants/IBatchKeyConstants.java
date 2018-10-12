package com.hdr.constants;

/**All batch key Table Names here.
 * @author Romesh Soni
 *
 */
public interface IBatchKeyConstants {

	String BATCH_KEY_DATE_TIME_FORMAT = "MMDDYYYYHHmmmsss";
	
	public static enum TABLE_NAME  
	{
	   PURSUIT_PROJECT ("PursuitProject"),DELIVERY_PROJECT ("DeliveryProject"),COMPANY ("Company");
	   
	   private String val;
	   private TABLE_NAME(String val)
	   {
		   this.val=val;
	   }
	   public String getVal()
	   {
		   return val;
	   }
	   
	}
	
	String BATCH_KEY_PREFIX_PURSUIT_PROJECT= "BD-INT-002";
	String BATCH_KEY_PREFIX_COMPANY= "BD-INT-001";
	String BATCH_KEY_1_COLUMN_NAME_IN_INTEGRATION_STATISTICS= "BATCH_KEY1";
	
}
