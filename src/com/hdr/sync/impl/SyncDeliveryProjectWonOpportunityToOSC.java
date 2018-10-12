package com.hdr.sync.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IBatchKeyConstants;
import com.hdr.constants.IErrorLogConstants;
import com.hdr.constants.IOpportunityConstants;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.dao.ebs.PursuitProjectEBSDao;
import com.hdr.exception.FusionException;
import com.hdr.job.impl.DeliveryProjectWonOpportunitySyncJob;
import com.hdr.model.DeliveryProject;
import com.hdr.model.PursuitProject;
import com.hdr.service.CompanyServ;
import com.hdr.service.ContractServ;
import com.hdr.service.EmployeeServ;
import com.hdr.service.EntityService;
import com.hdr.service.ProjectServ;
import com.hdr.service.PursuitProjectService;
import com.hdr.sync.SyncObject;
import com.hdr.util.Constants;
import com.hdr.util.ErrorMsgUtil;
import com.hdr.util.PursuitProjectMappingUtil;
import com.hdr.ws.stubs.customeObject.ObjectFactory;
import com.hdr.ws.stubs.customeObject.ProjectsC;
import com.hdr.ws.stubs.opportunity.Opportunity;
import com.hdr.ws.stubs.opportunity.ServiceException;

/**
 * Helper class to sync Delivery Projects (Won Opportunity) to OSC.
 * When a delivery project is created in HDR system (not in EBS or OSC), we need to get the delivery project information
 * (osc opty id and ebs pursuit project id mainly) from XXHDR_PJM_OSC_DELVRY_PROJ_STG  table and make the opty WON
 * in OSC and also associate (create if not already found in OSC) a Delivery Project. After that, make an entry in 
 * the Pursuit Project staging table XXHDR_PJM_OSC_PRSUT_PROJ_STG and let EBS know that this Opportunity has been marked
 * as WON. So that at the end, in EBS the Opportunity can be marked as CLOSED.   
 * @author Romesh Soni
 *
 */
@Repository("syncDeliveryProjectWonOpportunityToOSC")
@Service
public class SyncDeliveryProjectWonOpportunityToOSC implements SyncObject {
	private static final Logger log = Logger
			.getLogger(SyncDeliveryProjectWonOpportunityToOSC.class);

	private SimpleDateFormat sdf = new SimpleDateFormat(IBatchKeyConstants.BATCH_KEY_DATE_TIME_FORMAT);
	
	@Resource
	private PursuitProjectService pursuitProjectWS;

	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;

	@Resource
	private ErrorLogDao errorLogDao;

	@Resource
	private ProjectServ projectWS;
	
	@Resource													
	EmployeeServ employeeWS;
	
	@Resource													
	CompanyServ companyWS;
	
	@Resource													
	ContractServ contractWS;
	
	@Resource													
	PursuitProjectEBSDao pursuitProjectEBSDao;
	
	/**
	 * Main Method
	 */
	@Override
	public void syncObject() throws Exception {
		process();
	}

	/**
	 * 
	 * @throws Exception
	 */
	private void process() throws Exception {
		
			try {
				/**
				 * This method process' Delivery Projects
				 */
				boolean allRecordsSynchedSuccessfully = processDeliveryProject();
				
			} catch (Exception e) {
				log.error("Error Occured in the acknowlledment process", e);
				
			}

		}



	/**
	 * 
	 * @param iList
	 */
	private boolean processDeliveryProject() {
		
		log.info(">>processDeliveryProject");
		
		boolean allRecordsSynchedToOSCSuccessfully=true;
		
		String processStateReady=Constants.SYNC_STATUS.READY.toString();
		String processStateFailed=Constants.SYNC_STATUS.ERROR.toString();
		Integer maxRetryCount = Constants.SYNC_JOB_MAX_RETRY_COUNT;

			List<DeliveryProject> cAckList=null;
			
			try{
				cAckList = entityServiceEBS.findByNameQuery(Constants.GET_UNPROCESSED_DELIVERY_PROJECT_ACKLG,new Object[] {processStateReady,processStateFailed,maxRetryCount}, 10000);
			} catch (Exception e) {
				setErrorlog(e);		
			}
			
			if (cAckList != null && cAckList.size() > 0) 
			{
				//generate a batch key. 
				String batchKey = IBatchKeyConstants.BATCH_KEY_PREFIX_PURSUIT_PROJECT + sdf.format(new Date());
				
				for (DeliveryProject c : cAckList) 
				{
					try 
					{
						
						//before doing processing, change the sync status to IN PROGRESS
						markRecordInProgress(c);
						//find opty either by osc opty id or pursuit project id
						Opportunity oscOpportunity = pursuitProjectWS.findOpportuntiyForDeliveryProjectAck(c);
						if(oscOpportunity==null){
							//if opty not found. throw an exception as you could not proceed anymore. 
							throwOptyNotFoundError();
						}else{
							//opty found in osc. 
							//create/update delivery project in osc and associate to opty
							associateDeliveryProjectToOpty(c,oscOpportunity);
							
							//update opty to WON Status
							updateOptyToWonStatus(oscOpportunity,c.getDeliveredProjectNum());
							
							//save record in pursuit project staging table and call concurrent request function
							savePursuitProjectInStagingAndCallConcurrentRequest(batchKey,oscOpportunity);
							
						}
						
						markRecordProcessedSuccessfully(c);
						
					} catch (Exception e) 
					{
						allRecordsSynchedToOSCSuccessfully=false;
						
						log.error(e);
						int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
						String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
						String customMsg="Error while updating Opportunity in OSC while synching Delivery Project from EBS to OSC. Trace: ";
						emsg = customMsg+emsg;
						log.error(emsg);
						
						//mark the record failed in ack table
						markRecordFailed(c, emsg);
						
						String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
						String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.DELIVERY_PROJECT.getVal();
						String tableName = IErrorLogConstants.TABLE_NAMES.DELIVERY_PROJECT_ACK.getVal();
						String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
						String primaryKeyValue = c.getRecordId().toString();
						errorLogDao.logSyncError(objectName, direction
								, emsg
								, primaryKey
								, primaryKeyValue
								, DeliveryProjectWonOpportunitySyncJob.class.getSimpleName()
								,tableName
								);						
					}

				}
			}
			
			
		
		
		return allRecordsSynchedToOSCSuccessfully;
	}

	private void setErrorlog(Exception e) {
		log.error(e);
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		String customMsg="Error while trying to read pending records from stage table. Trace: ";
		emsg = customMsg+emsg;
		log.error(emsg);
		
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.DELIVERY_PROJECT.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.DELIVERY_PROJECT_ACK.getVal();
		String primaryKey  = IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK;
		String primaryKeyValue = IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK;
		errorLogDao.logSyncError(objectName, direction
				, emsg
				, primaryKey
				, primaryKeyValue
				, DeliveryProjectWonOpportunitySyncJob.class.getSimpleName()
				,tableName
				);
	}

private void markRecordInProgress(DeliveryProject c) {
		
		log.info(">>markRecordInProgress");
		
		c.setLastUpdateDate(new Date());
		c.setProcessState(Constants.SYNC_STATUS.IN_PROGRESS.toString());
		try 
		{
			entityServiceEBS.save(c);
			
		} catch (Exception e) {
			
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error while updating changing record status to IN PROGRESS in db. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
					
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.DELIVERY_PROJECT_ACK.getVal();
			String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
			String primaryKeyValue = c.getRecordId().toString();
			errorLogDao.logSyncError(objectName, direction
					, emsg
					, primaryKey
					, primaryKeyValue
					, DeliveryProjectWonOpportunitySyncJob.class.getSimpleName()
					,tableName
					);	
		}
	}

	private void savePursuitProjectInStagingAndCallConcurrentRequest(
			String batchKey, Opportunity oscOpportunity) throws Exception {
		
		log.debug(">>savePursuitProjectInStagingAndCallConcurrentRequest");
		
		List<Object> lst = new ArrayList<Object>();
		lst.add(oscOpportunity);
		
		boolean isDeliveryProjectInterface = true;
		List<PursuitProject> lstPursuitProject = PursuitProjectMappingUtil
				.convertOSCOptiesToStagePursuitProjects(batchKey, lst
						, employeeWS,companyWS,contractWS,errorLogDao,isDeliveryProjectInterface);
		
		if(lstPursuitProject==null||lstPursuitProject.isEmpty())
		{
			String emsg = " The OSC Opportunity was updated to WON and the Delivery project was created/updated successfully."
					+ " However, exception occurred while converting OSC opty to Model object to save in Pusrsuit Project Stg table..";
			
			throw new Exception(emsg);
		}

		//save pursuit project in staging table
		pursuitProjectEBSDao.savePursuitProjectsInDb(lstPursuitProject);
		
		//call ebs concurrent request procedure
		try 
		{
			pursuitProjectEBSDao.callPursuitProjectConcurrentRequest(batchKey);
		} catch (Exception e) 
		{
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error while calling stored function submit_conc_request. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.DELIVERY_PROJECT_ACK.getVal();
			String primaryKey  = "XXHDR_PJM_OSC_PRSUT_PROJ_STG.BATCH_KEY";
			String primaryKeyValue = batchKey;
			
			errorLogDao.logSyncError(objectName, direction
					, emsg
					, primaryKey
					, primaryKeyValue
					, DeliveryProjectWonOpportunitySyncJob.class.getSimpleName()
					,tableName
					);	
		}
		
		
		
	}

	private void associateDeliveryProjectToOpty(DeliveryProject c, Opportunity oscOpportunity) throws Exception {
		
		log.debug(">>associateDeliveryProjectToOpty");
		BigDecimal deliveryProjectNum = c.getDeliveredProjectNum();
		try {
			//find if there is any delivery project in osc already.
			ProjectsC projectsC1 = (ProjectsC) projectWS.findProjectByEBSIdForDeliveryProjectSync(deliveryProjectNum);
			
			ProjectsC projectsCToSave= new ProjectsC();
			if(projectsC1!=null)
			{
				projectsCToSave.setId(projectsC1.getId());
				log.debug("delivery project found in osc.");
			}
			else
			{
				log.debug("delivery project not found in osc.");
				//delivery project id in record name
				projectsCToSave.setRecordName(deliveryProjectNum.toString());
			}
			
			ObjectFactory factory = new ObjectFactory();
			
			//associate opty with this delivery project			
			projectsCToSave.setOpportunityNameSIdC(factory.createProjectsCOpportunityNameSIdC(new BigDecimal(oscOpportunity.getOptyId())));
			if(oscOpportunity.getHDRDivisionC()!=null)projectsCToSave.setCompanyC(factory.createProjectsCCompanyC(oscOpportunity.getHDRDivisionC()));
			//if(oscOpportunity.getDeliveryMethodC()!=null)
			//projectsCToSave.setDeliveryMethodC(factory.createProjectsCDeliveryMethodC(oscOpportunity.getDeliveryMethodC()));
			
			
			projectWS.mergeProject(projectsCToSave);
			
			
		} catch (FusionException e) {
			
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN, e);
			emsg = "Error while trying to find/merge Delivery Project in OSC.  :"+emsg;
			log.error(emsg);
			throw new Exception(emsg);
			
		}

		
		
	}

	private void updateOptyToWonStatus(Opportunity oscOpportunity, BigDecimal deliveryProjectNum) throws Exception {
		
		String WONSTATUS = IOpportunityConstants.OSC_OPPORTUNITY_STATUS.WON.getVal();
		
		if(oscOpportunity.getStatusCode()!=null&&oscOpportunity.getStatusCode().getValue()!=null && oscOpportunity.getStatusCode().getValue().equalsIgnoreCase(WONSTATUS))
		{
			log.info("Opportunity is already in  WON Status. No need to update.");
			return;
		}
		//Update opty status to WON. 
		try 
		{
			pursuitProjectWS.updateOpportunityStatusToWON(oscOpportunity.getOptyId(),deliveryProjectNum);
		} catch (ServiceException e) {
			
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN, e);
			emsg = "Error while UPDATING opportunity in OSC and changing status to WON :"+emsg;
			log.error(emsg);
			throw new Exception(emsg);
		}
		
		
	}

	private void throwOptyNotFoundError() throws Exception {
		
		log.debug(">>throwOptyNotFoundError");
		
		String emsg = "Opportuntiy not found for given OSC Opportunity Id.";
		throw new Exception(emsg);
		
		
	}

	private void markRecordProcessedSuccessfully(DeliveryProject c) {
		
		log.info(">>markRecordProcessedSuccessfully");
		
		c.setStatusMessage(null);
		c.setLastUpdateDate(new Date());
		c.setProcessState(Constants.SYNC_STATUS.COMPLETED.toString());
		c.setRetryCount(0);
		
		try 
		{
			entityServiceEBS.save(c);
			
		} catch (Exception e) {
			
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error while updating delivery project staging table after Saving delivery project in OSC. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
					
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.DELIVERY_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.DELIVERY_PROJECT_ACK.getVal();
			String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
			String primaryKeyValue = c.getRecordId().toString();
			errorLogDao.logSyncError(objectName, direction
					, emsg
					, primaryKey
					, primaryKeyValue
					, DeliveryProjectWonOpportunitySyncJob.class.getSimpleName()
					,tableName
					);	
		}
		
							
	
		
		
	}
	
private void markRecordFailed(DeliveryProject c,String emsg) {
		log.info(">>markRecordFailed");
		
		c.setStatusMessage(emsg);
		c.setLastUpdateDate(new Date());
		c.setProcessState(Constants.SYNC_STATUS.ERROR.toString());
		
		Integer iRetryCount = c.getRetryCount();
		if(iRetryCount==null)
			iRetryCount=0;
		
		iRetryCount++;
		
		c.setRetryCount(iRetryCount);
		
		try 
		{
			entityServiceEBS.save(c);
			
		} catch (Exception e) {
			
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg2 = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error while updating delivery project stage table for error fields, "
					+ "after failed attempt to save delivery project in OSC. Trace: ";
			emsg2 = customMsg+emsg2;
			log.error(emsg2);
					
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.EBS_TO_FUSION.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.DELIVERY_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.DELIVERY_PROJECT_ACK.getVal();
			String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
			String primaryKeyValue = c.getRecordId().toString();
			errorLogDao.logSyncError(objectName, direction
					, emsg2
					, primaryKey
					, primaryKeyValue
					, DeliveryProjectWonOpportunitySyncJob.class.getSimpleName()
					,tableName
					);	
		}
		
	}

}
