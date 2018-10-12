package com.hdr.sync.impl;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IBatchKeyConstants;
import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.dao.ebs.PursuitProjectEBSDao;

import com.hdr.job.impl.PursuitProjectOSCToEBSSyncJob;
import com.hdr.model.BaseModel;
import com.hdr.model.IntegrationStatistic;
import com.hdr.model.PollingInfo;
import com.hdr.model.PursuitProject;
import com.hdr.service.CompanyServ;
import com.hdr.service.ContractServ;
import com.hdr.service.EmployeeServ;
import com.hdr.service.EntityService;
import com.hdr.service.PursuitProjectService;
import com.hdr.sync.SyncObject;
import com.hdr.util.Constants;
import com.hdr.util.DateUtils;
import com.hdr.util.ErrorMsgUtil;
import com.hdr.util.PursuitProjectMappingUtil;

/**
 * Helper class to sync Pursuit Projects from OSC to EBS.
 * Notes: 
 * 1) Filter Out WON Opties.
 * 2) Dont download opties modified by Integration User
 * 3) Dont download opty if the associated Billable customer doesnt have EBS Account Id populated.
 * @author Romesh Soni
 *
 */
@Repository("syncPursuitProjectObject")
@Service
public class SyncPursuitProjectOSCToEBSObject implements SyncObject {

	private static final Logger log = Logger
			.getLogger(SyncPursuitProjectOSCToEBSObject.class);
	/**
	 * Batch Key Format Setter
	 */
	private SimpleDateFormat sdf = new SimpleDateFormat(IBatchKeyConstants.BATCH_KEY_DATE_TIME_FORMAT);

	@Resource(name = "pursuitProjectServImpl")
	private PursuitProjectService pursuitProjectService;

	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;

	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;

	@Resource													
	EmployeeServ employeeWS;
	
	@Resource													
	CompanyServ companyWS;
	
	@Resource													
	ContractServ contractWS;
	
	@Resource													
	PursuitProjectEBSDao pursuitProjectEBSDao;

	@Resource
	private ErrorLogDao errorLogDao;

	/**
	 * Main Method
	 */
	@Override
	public void syncObject() throws Exception {
		process();
	}

	private void process() throws Exception {

		log.info(">>process");

		/**
		 * This method will query Polling info table in DBaaS and get 
		 * last poll date for this job to fetch data from osc.
		 * When the job runs for the first time, this method will not find any polling info and 
		 * hence registers a new polling info as a starter and waits for next immediate scheduled 
		 * run
		 */
		BaseModel o = getQueryParam();
		
		String lastUpdateDateOfLastProcessedRecord =null;
		
		if(o==null)
		{
			log.info("Polling info has jusy been configured with current time. Data will be pulled next time the job runs.");
			return;
		}
		
		/**
		 * Format as specified by HDR
		 * 'BD-INT-001'||TO_CHAR(SYSDATE,'MMDDYYYYHHMISS');
		 */
		String batchKey = IBatchKeyConstants.BATCH_KEY_PREFIX_PURSUIT_PROJECT + sdf.format(new Date());

		/**
		 * This method will persist the batch key for reference purpose for one
		 * cycle;
		 */
		try 
		{
			persistBatchKey(batchKey);
		} catch (Exception e1) {
			//the error has been logged already in function call. Just ignore further processing now.
			return;
		}

		boolean isDeliveryProjectInterface = false;
		try {
			List<Object> lst = pursuitProjectService.getPendingToEBSPursuitProjects(o);
			while (lst != null && !lst.isEmpty()) {
				List<PursuitProject> lstPursuitProject = PursuitProjectMappingUtil.convertOSCOptiesToStagePursuitProjects(batchKey, lst, employeeWS,companyWS,contractWS,errorLogDao,isDeliveryProjectInterface);
				log.debug("# of Opportunities/Pursuit Projects  actually downloaded from  OSC: "+ lst.size());
				log.debug("# of Opportunities/Pursuit Projects applicable (not filtered out due to validations) "+ "to be saved in EBS Table: "+ lstPursuitProject.size());
				lastUpdateDateOfLastProcessedRecord = pursuitProjectEBSDao.savePursuitProjectsInDb(lstPursuitProject);
				log.info("lastUpdateDateOfLastProcessedRecord from main job: "+ lastUpdateDateOfLastProcessedRecord);

				/**
		    	 * Here we keep incrementing the row before we make next query to OSC
		    	 */
		    	o.setFetchStart(o.getFetchStart() + Constants.FUSION_READ_LIMIT);

				lst.clear();
				lst = null;
				lstPursuitProject.clear();
				lstPursuitProject = null;
				
				lst = pursuitProjectService.getPendingToEBSPursuitProjects(o);

			}

		} catch (Exception e) {
			
			//you will come to this block if you get any error trying to make WS calls to OSC.
			//All other error are handled in respective functions. 
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error while reading Opportunities(Pursuit Projects) from OSC. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.FUSION_TO_EBS.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_STG.getVal();
			
			errorLogDao.logSyncError(objectName, direction, emsg, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, PursuitProjectOSCToEBSSyncJob.class.getSimpleName()
					,tableName
					);

		}

	     callConcurrentRequestFunctionAndUpdatePolllingInfo(batchKey,lastUpdateDateOfLastProcessedRecord);
		
	}

	private void callConcurrentRequestFunctionAndUpdatePolllingInfo(String batchKey,String lastUpdateDateOfLastProcessedRecord) {
		
		  log.info(">>callConcurrentRequestFunctionAndUpdatePolllingInfo");
		
		  try 
		  {
			  if(lastUpdateDateOfLastProcessedRecord!=null)
			  {
				  //inside this if means you got at least one record saved in staging db.
				  //call ebs concurrent request procedure
				  try 
				  {
					pursuitProjectEBSDao.callPursuitProjectConcurrentRequest(batchKey);
				} catch (Exception e) {
					
					int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
					String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
					String customMsg="Error while calling stored function submit_conc_request. Trace: ";
					emsg = customMsg+emsg;
					log.error(emsg);
					String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.FUSION_TO_EBS.toString();
					String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
					String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_STG.getVal();
					String primaryKey  = "XXHDR_PJM_OSC_PRSUT_PROJ_STG.BATCH_KEY";
					String primaryKeyValue = batchKey;
					
					errorLogDao.logSyncError(objectName, direction
							, emsg
							, primaryKey
							, primaryKeyValue
							, PursuitProjectOSCToEBSSyncJob.class.getSimpleName()
							,tableName
							);	
				}
				  
				  //never set Null in polling info.
				  //update polling info
				  setPollingInfo(lastUpdateDateOfLastProcessedRecord);
			  }
			  else
				  log.debug("Polling info doesnt need to be modified.");
			  
		} catch (Exception e) {
			
			//you will come to this block if the call to concurrent request function fails.
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error while calling concurrent request stored function for Pursuit Project Stg. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.FUSION_TO_EBS.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_STG.getVal();
			
			errorLogDao.logSyncError(objectName, direction, emsg, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, PursuitProjectOSCToEBSSyncJob.class.getSimpleName()
					,tableName
					);
		}
		
	}

	

	private void persistBatchKey(String batchKey) throws Exception {
		try {
			IntegrationStatistic i = new IntegrationStatistic();
			i.setBatchKey1(batchKey);
			i.setLastUpdatedDate(new Date());
			i.setBatchKey2(null);
			i.setTablename(IBatchKeyConstants.TABLE_NAME.PURSUIT_PROJECT.getVal());
			i.setSyncStatus("READY");
			entityServiceDBaaS.save(i);

		} catch (Exception e) {
			log.error("Error occured while persisting batch key", e);
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error while trying to save Batch Key in PaaS. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.FUSION_TO_EBS.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_STG.getVal();
			
			errorLogDao.logSyncError(objectName, direction, emsg, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, PursuitProjectOSCToEBSSyncJob.class.getSimpleName()
					,tableName
					);
			
			throw e;
		}

	}
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private BaseModel getQueryParam() throws Exception {
		List<PollingInfo> pInfo = entityServiceDBaaS.findByNameQuery(Constants.GET_POLLING_INFO, new Object[]{this.getClass().getSimpleName()});
		if(pInfo!=null && pInfo.size()>0){
			BaseModel o = new BaseModel();
			o.setFetchSize(Constants.FUSION_READ_LIMIT);
			o.setFetchStart(0);
			o.setViewCriteriaAttributeValue(pInfo.get(0).getLastRunString());
			return o;
		}else
		{
			Timestamp currentTimestamp = new Timestamp((new Date()).getTime());
			String currentTimeAsString = DateUtils.formatGivenTimestampToFusionFormat(currentTimestamp);
			setPollingInfo(currentTimeAsString);
		}
		return null;
	}
	/**
	 * @param lastUpdateDateOfLastProcessedRecord 
	 * 
	 */
	private void setPollingInfo(String lastUpdateDateOfLastProcessedRecord) {
		try 
		{
			PollingInfo p  = new PollingInfo();
			p.setJobName(this.getClass().getSimpleName());
			//p.setLastRun(new Date());
			p.setLastRunString(lastUpdateDateOfLastProcessedRecord);
			entityServiceDBaaS.save(p);	
		} catch (Exception e) 
		{
			log.error(e);
			int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
			String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
			String customMsg="Error occured while setting new polling info. Trace: ";
			emsg = customMsg+emsg;
			log.error(emsg);
			String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.FUSION_TO_EBS.toString();
			String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
			String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_STG.getVal();
			
			errorLogDao.logSyncError(objectName, direction, emsg, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
					, PursuitProjectOSCToEBSSyncJob.class.getSimpleName()
					,tableName
					);
			
		}
		
	}
	

}
