package com.hdr.sync.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IBatchKeyConstants;
import com.hdr.constants.ICompanyConstants;
import com.hdr.constants.IErrorLogConstants;
import com.hdr.dao.ebs.CompanyEBSDao;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.job.impl.CompanyOscToEbsSyncJob;
import com.hdr.model.BaseModel;
import com.hdr.model.BaseObject;
import com.hdr.model.Company;
import com.hdr.model.IntegrationStatistic;
import com.hdr.service.CompanyServ;
import com.hdr.service.EntityService;
import com.hdr.sync.SyncObject;
import com.hdr.util.CompanyMappingUtil;
import com.hdr.util.Constants;
import com.hdr.util.ErrorMsgUtil;
import com.hdr.ws.stubs.accountService.Account;

@Repository("syncCompanyOSCtoEBS")
@Service
public class SyncCompanyOSCtoEBS implements SyncObject {
	/**
	 * Registering Logger for SyncCompanyObject.class
	 */
	private static final Logger log = Logger.getLogger(SyncCompanyOSCtoEBS.class);
	/**
	 * Batch Key Format Setter
	 */
	private SimpleDateFormat sdf = new SimpleDateFormat(IBatchKeyConstants.BATCH_KEY_DATE_TIME_FORMAT);
	
	@Resource
	private CompanyServ companyWS;
	
	@Resource													
	private CompanyEBSDao companyEBSDao;
	
	@Resource
	private ErrorLogDao errorLogDao;

	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;
	
	@Resource(name = "entityServiceImplEBS")
	private EntityService entityServiceEBS;
	
	/**
	 * Main Method
	 */
	@Override
	public void syncObject() throws Exception {
		process();
	}

	private void process() throws Exception {
		
		/**
		 * This method will set the fetch criteria
		 */
		BaseModel o = getQueryParam();
		boolean updatePollingInfo = false;
		/**
		 * Format as specified by HDR
		 * 'BD-INT-001'||TO_CHAR(SYSDATE,'MMDDYYYYHHMISS');
		 * BD-INT-00112348201518054000
		 */
		String batchKey = IBatchKeyConstants.BATCH_KEY_PREFIX_COMPANY +sdf.format(new Date());
		
		if(o!=null){
				/**
				 * This method will persist the batch key for reference purpose for one cycle;
				 */
				try {
					persistBacthKey(batchKey);
				} catch (Exception e) {
					/**
					 * The error has been logged already in function call. Just ignore further processing now.
					 * 
					 */
					return;
				}
				/**
				 * companyWS bean will make a web service call to OSC get all unprocessed records whose
				 * Account Type =  Prospect and EBS Integration Status  = 'To be processed'
				 */
			    List<Object> slpList =  companyWS.findByEBSIntegrationStatus(o);
			    /**
			     * We will iterate till we stop getting unprocessed records from OSC
			     */
			    while(slpList!=null && slpList.size()>0){
			    	updatePollingInfo = true;
			    	for (Object k : slpList) {
			    		try {
			    			/**
			    			 * Casting Object to Account
			    			 */
			    			Account s = (Account) k;
			    			
			    			/**
			    			 * If a parent is associated to the THIS account then we will fetch parent by its ID
			    			 * for Parent Organization Name and Parent EBS Specific IDs
			    			 */
			    			boolean isChildACreate = false;
			    			boolean isChild = false;
			    			Account parentAccount = null;
			    			if(s.getParentAccountPartyId()!=null && s.getParentAccountPartyId().getValue()!=null){
			    				 isChild = true;
			    				 parentAccount = companyWS.getById(s.getParentAccountPartyId().getValue());
			    			}else{
			    				isChild = false;
			    				BaseObject ob = getBOforToDetermineIfChildIsPresent(s);
			    				List<Object> out = companyWS.findAccount(ob);
			    				if(out!=null && out.size()>0){
			    					log.info("We can process this record as we have child record");
			    				}else{
			    					/**
			    					 * TODO: Small Bug Fix. Commented the part and needs to be deployed
			    					 */
			    					//companyWS.updateEBSIntegrationStaus(ICompanyConstants.ACCOUNT_FUSION_INTEGRATION_STATUS.COMPLETED.getVal(), s.getPartyId());
			    					continue;
			    				}
			    			}
			    				/**
				    			 * Company Mapping Util is responsible to Map all the fields of company we recieved from OSC to
				    			 * all the respective field of table
				    			 */
			    				if(isChild ){
			    					if(s.getOrganizationDEOEBSAccountIdC()!=null && s.getOrganizationDEOEBSAccountIdC().getValue()!=null && StringUtils.isNotBlank( s.getOrganizationDEOEBSAccountIdC().getValue())){
			    						isChildACreate = false;
			    					}else{
			    						isChildACreate = true;
			    					}
			    					
			    				}
			    				if(isChildACreate){
			    					if(parentAccount.getOrganizationDEOEBSPartyIdC()!=null && parentAccount.getOrganizationDEOEBSPartyIdC().getValue()!=null){
			    						log.info("Parent is an update...");
			    					}else{
			    						
			    						if(checkIfParentAccountIsAlreadyPresentInDB(parentAccount,batchKey)){
			    							Company parentc	= CompanyMappingUtil.companyObjectMapper(parentAccount,batchKey,null);
					    					entityServiceEBS.save(parentc);
					    					companyWS.updateEBSIntegrationStaus(ICompanyConstants.ACCOUNT_FUSION_INTEGRATION_STATUS.IN_PROGRESS.getVal(), parentAccount.getPartyId());	
			    						}
				    					isChildACreate=false;
				    					System.out.println();
			    					}
			    				}
					    		Company c = CompanyMappingUtil.companyObjectMapper(s,batchKey,parentAccount);
					    		/**
					    		 * Responsible for persisting company
					    		 * into EBS Staging table
					    		 */
					    		entityServiceEBS.save(c);
					    		/**
					    		 * Mark This rocord in OSC as In Progress
					    		 */
					    		companyWS.updateEBSIntegrationStaus(ICompanyConstants.ACCOUNT_FUSION_INTEGRATION_STATUS.IN_PROGRESS.getVal(), s.getPartyId());
						} catch (Exception e) {
							log.error("Error Occured while persisting data into EBS database",e);
							setErrorLog(e,"Error while reading Customer(Company) from OSC. Trace: ");
						}
			    	}
			    	/**
			    	 * Here we keep incrementing the row before we make next query to OSC
			    	 */
			    	o.setFetchStart(o.getFetchStart() + slpList.size());
			    	/**
			    	 * Makes Sure the list is null
			    	 */
			    	slpList = null;
			    	/**
			    	 * Re Query OSC for unprocessed records from OSC from the incremented row number
			    	 * Here one more task is pending which is updating the flag so that record is not picked again 
			    	 */
			    	slpList = companyWS.findByEBSIntegrationStatus(o);
			    }
		}
		
		if(updatePollingInfo){
			callConcurrentRequestFunctionAndUpdatePolllingInfo(batchKey);
		}
		
	}

	

	private boolean checkIfParentAccountIsAlreadyPresentInDB(Account parentAccount, String batchKey) {
		try {
			List<Company> cmpnyList = entityServiceEBS.findByNameQuery(Constants.GET_PARENT_ACCOUNT, new Object[]{parentAccount.getPartyId(),batchKey},2);
			if(cmpnyList!=null && cmpnyList.size()>0){
				return false;
			}
		} catch (Exception e) {
			log.error("Error occured while checking if the parent account is alreqady present in DB",e);
		}
		return true;
	}

	private void callConcurrentRequestFunctionAndUpdatePolllingInfo(String batchKey) {
		
		  log.info(">>callConcurrentRequestFunctionAndUpdatePolllingInfo");
		
		  try 
		  {
		    
			//call ebs concurrent request procedure
			  companyEBSDao.callCompanyConcurrentRequest(batchKey);
		  } catch (Exception e) {
			
			//you will come to this block if the call to concurrent request function fails.
			log.error(e);
			setErrorLog(e,"Error while calling concurrent request stored function for Pursuit Project Stg. Trace: ");
			
		}
		
	}

	private BaseObject getBOforToDetermineIfChildIsPresent(Account s) {
		BaseObject ob = new BaseObject();
		ob.setFetchStart(0);
		ob.setFetchSize(35);
		ob.setViewCriteriaAttributeName(ICompanyConstants.ACCOUNT_FIELD_PARENT_PARTY_ID);
		ob.setViewCriteriaAttributeValue(s.getPartyId().toString());
		ob.setOperator(Constants.FUSION_EQUALS_OPERATOR);
		List<String> fndAttrib = new ArrayList<String>();
		fndAttrib.add(ICompanyConstants.ACCOUNT_FIELD_PARTY_ID);
		ob.setListOfAttribute(fndAttrib);
		return ob;
	}
	/**
	 * 
	 * @param batchKey
	 * @throws Exception 
	 */
	private void persistBacthKey(String batchKey) throws Exception {
		try {
			IntegrationStatistic i = new IntegrationStatistic();
			i.setBatchKey1(batchKey);
			i.setLastUpdatedDate(new Date());
			i.setBatchKey2(null);
			i.setTablename(IBatchKeyConstants.TABLE_NAME.COMPANY.getVal());
			i.setSyncStatus(Constants.SYNC_STATUS.READY.toString());
			entityServiceDBaaS.save(i);
			
		} catch (Exception e) {
			log.error("Error occured while persisting batch key",e);
			setErrorLog(e, "Error while trying to save Batch Key in PaaS. Trace: ");
			throw e;
			
			
			
		}
		
	}
	
	/**
	 * 
	 * @param e
	 * @param custmessage
	 */
	private void setErrorLog(Exception e,String custmessage) {
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		emsg = custmessage+emsg;
		log.error(emsg);
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.FUSION_TO_EBS.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.COMPANY.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.COMPANY_STG.getVal();
		
		errorLogDao.logSyncError(objectName, direction, emsg, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
				, IErrorLogConstants.INFORMATION_TO_SAVE_WHEN_VALUE_BLANK
				, CompanyOscToEbsSyncJob.class.getSimpleName()
				,tableName
				);
	}
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private BaseModel getQueryParam() throws Exception {
		try {
			BaseModel o = new BaseModel();
			o.setFetchSize(Constants.FUSION_READ_LIMIT);
			o.setFetchStart(0);
			return o;
		} catch (Exception e) {
			log.error("Error Occured while setting Criteria",e);
			throw e;
		}
			
	}
		
}
