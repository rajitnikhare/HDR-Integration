package com.hdr.job.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.job.AbstractSpringJob;
import com.hdr.sync.SyncObject;
import com.hdr.util.ErrorMsgUtil;

/**Responsibility of this job:  
 * When a delivery project is created in HDR system (not in EBS or OSC), we need to get the delivery project information
 * (osc opty id and ebs pursuit project id mainly) from XXHDR_PJM_OSC_DELVRY_PROJ_STG  table and make the opty WON
 * in OSC and also associate (create if not already found in OSC) a Delivery Project. After that, make an entry in 
 * the Pursuit Project staging table XXHDR_PJM_OSC_PRSUT_PROJ_STG and let EBS know that this Opportunity has been marked
 * as WON. So that at the end, in EBS the Opportunity can be marked as CLOSED.   
 * 
 * @author Jeevan Abraham
 *
 */
@Service
public class DeliveryProjectWonOpportunitySyncJob extends AbstractSpringJob {

	private static final Logger log = Logger
			.getLogger(DeliveryProjectWonOpportunitySyncJob.class);

	@Resource(name="syncDeliveryProjectWonOpportunityToOSC")
	private SyncObject syncDeliveryProjectWonOpportunityToOSC;
	
	@Resource
	private ErrorLogDao errorLogDao;


	@Override
	protected void executeJob() throws Exception {
		// process();
		syncDeliveryProjectWonOpportunityToOSC();

	}

	private void syncDeliveryProjectWonOpportunityToOSC() {
		
		log.info("started syncDeliveryProjectWonOpportunityToOSC");

		try 
		{
			syncDeliveryProjectWonOpportunityToOSC.syncObject();
		} catch (Exception e) {
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Uneexpected error while synching Delivery Project to OSC. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.DELIVERY_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.DELIVERY_PROJECT_ACK.getVal();
			
			errorLogDao.logSyncError(objectName, direction, emsg, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK, this.getJobName()
					,tableName
					);
			
		}
		
		log.info("ending of syncDeliveryProjectWonOpportunityToOSC....");

	}


	
	
	
	 // This is for test purpose
	  
	public void test() throws Exception {
		executeJob();

	}

}
