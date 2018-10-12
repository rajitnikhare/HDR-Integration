package com.hdr.sync.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IErrorLogConstants;
import com.hdr.constants.IProjectConstants;
import com.hdr.dao.dbaas.ErrorLogDBAASDao;
import com.hdr.job.impl.CompanyODSToOSCSyncJob;
import com.hdr.model.BaseObject;
import com.hdr.model.Project;
import com.hdr.model.ProjectFeeCost;
import com.hdr.model.ProjectLocation;
import com.hdr.model.ProjectSubcons;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EntityService;
import com.hdr.service.ProjectServ;
import com.hdr.sync.SyncObject;
import com.hdr.util.Constants;
import com.hdr.util.Constants.HDR_OPERATION;
import com.hdr.util.ErrorMsgUtil;
import com.hdr.ws.stubs.customeObject.CostsFeesC;
import com.hdr.ws.stubs.customeObject.LocationC;
import com.hdr.ws.stubs.customeObject.ProjectsC;
import com.hdr.ws.stubs.customeObject.SubconsultantC;

@Repository("dataLoadSyncProjectODSToOSC")
@Service
public class DataLoadSyncProjectODSToOSC implements SyncObject{
	/**
	 * Registering Logger for SyncCompanyObject.class
	 */
	private static final Logger log = Logger.getLogger(DataLoadSyncProjectODSToOSC.class);

	@Resource
	private ProjectServ projectWS;
	
	@Resource
	private DbUtilityServ dbutil;
	
	
	@Resource
	private ErrorLogDBAASDao errorLogDbaaSDao;
	

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
		
		List<Project> projectHeaderList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECTS_HEADER);
		while(projectHeaderList!=null && projectHeaderList.size()>0){
				for (Project p : projectHeaderList) {
					try {
						dbutil.updateDbStatus(p,Constants.SYNC_STATUS.IN_PROGRESS.getVal(),null);
						prepareChildListWithSuitableOperation(p);
						if(Constants.HDR_OPERATION.CREATE.toString().equalsIgnoreCase(p.getOperation())){
							//throw new Exception("This records is skipped as it is a create operation");
							projectWS.createForDataload(p);
						}else{
							projectWS.mergeForDataload(p);
						}
						dbutil.updateDbStatus(p, Constants.SYNC_STATUS.COMPLETED.getVal(),null);
					} catch (Exception e) {
						 log.error("Error occured while preparing child",e);
					     dbutil.updateDbStatus(p, Constants.SYNC_STATUS.ERROR.getVal(),e);
					 //Error Handling Happens here
					  setErrorLog(e,"Error while syncing Project from ODS to OSC . Trace: ",p);
						
					}
				}
			projectHeaderList=null;
			projectHeaderList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECTS_HEADER);
		}
		
	}

	
	
	/**
	 * 
	 * @param e
	 * @param customMessage
	 * @param p
	 */
	private void setErrorLog(Exception e, String customMessage, Project p) {
		int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
		String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
		emsg = customMessage+emsg;
		log.error(emsg);
				
		String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.ODS_TO_FUSION.toString();
		String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PROJECT.getVal();
		String tableName = IErrorLogConstants.TABLE_NAMES.PROJECT_ODS_OSC_STG.getVal();
		String primaryKey  = IErrorLogConstants.RECORD_ID_COLUMN_NAME;
		String primaryKeyValue = null;
		if(p!=null)primaryKeyValue = p.getProjecId().toString();
		errorLogDbaaSDao.logSyncError(objectName, direction, emsg, primaryKey, primaryKeyValue, CompanyODSToOSCSyncJob.class.getSimpleName(),tableName);
	}
	/**
	 * 
	 * @param projHeader
	 * @return
	 * @throws Exception
	 */
	private Project prepareChildListWithSuitableOperation(Project projHeader) throws Exception {
		if(projHeader!=null){
			//WE SWITCHED LEGACY ID QUERY TO PROJECT ID QUERY TO FIX LEGACY NULL ISSUE
			//String p = projHeader.getLegacyId();
			String p = String.valueOf(projHeader.getProjecId());
			if(p==null || StringUtils.isBlank(p)){
				throw new Exception("Legacy Id is blank or null for records with project id:"+ projHeader.getProjecId());
			}
			/**
			 * We will query Oracle Sales Cloud to See if this project header is present
			 * 
			 */	BaseObject o =getQueryParam(p);
				Object out =  projectWS.find(o);
				if(out!=null){
				/**
				 *  Project is already present
				 *   Then Strategize the merge
				 */
				  ProjectsC pFromOsc = (ProjectsC) out;
				  projHeader.setOscProjectId(pFromOsc.getId());
				  projHeader.setOperation(Constants.HDR_OPERATION.UPDATE.toString());
				}else{
					 projHeader.setOperation(Constants.HDR_OPERATION.CREATE.toString());
				}
				return projHeader;
		}
		return null;
	}

	private void getChild(Project projHeader, Long p, String operation) throws Exception {
		try {
			//FeeCost
			setProjectFeeCost(projHeader, p,operation);
			//Location
			setProjectLocation(projHeader, p,operation);
			//Subcons
			getProjectSubcons(projHeader, p,operation);
			//Team
			
		} catch (Exception e) {
			log.error("Error occured while fetchin child",e);
			throw e;
		}
	}

	private BaseObject getQueryParam(String p) {
		BaseObject o = new BaseObject();
		//o.setViewCriteriaAttributeName("ProjectLegacySystemID_c");
		o.setViewCriteriaAttributeName("RecordName");
		o.setViewCriteriaAttributeValue(p);
		o.setOperator(Constants.FUSION_EQUALS_OPERATOR);
		o.setFetchSize(1);
		o.setFetchStart(0);
		List<String> findAttribList = new ArrayList<String>();
		findAttribList.add(IProjectConstants.PROJECT_FIELD_ID);
		findAttribList.add(IProjectConstants.PROJECT_FIELD_RECORDNAME);
		o.setListOfAttribute(findAttribList);
		return o;
	}


	private void getProjectSubcons(Project projHeader, Long p, String operation) throws Exception {
		List<ProjectSubcons> mainProjectSubconList = new ArrayList<ProjectSubcons>();
		List<ProjectSubcons> projectSubconsList=entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECT_SUBCONS, new Object[]{p});
		while(projectSubconsList!=null && projectSubconsList.size()>0){
			for (ProjectSubcons projectSubcons : projectSubconsList) {
				try {
					dbutil.updateDbStatus(projectSubcons, Constants.SYNC_STATUS.IN_PROGRESS.getVal(),null);
					
					if(operation!=null){
						projectSubcons.setOperation(operation);
					}else{
						/**
						 * We will make WS call on child to determine if create or update
						 */
						BaseObject o = getQueryParamForChild(Constants.HDR_PROJECT_CHILD.Subconsultant_c.toString(),projHeader,projectSubcons.getSubconsultantId().toString());
						Object out = projectWS.findProjectChild(o);
						if(out!=null){
							SubconsultantC SubconsultantOsc = (SubconsultantC)out;
							projectSubcons.setProjectSubConOscId(SubconsultantOsc.getId());
							projectSubcons.setOperation(HDR_OPERATION.UPDATE.toString());
							
						}else{
							projectSubcons.setProjectSubConOscId(null);
							projectSubcons.setOperation(HDR_OPERATION.CREATE.toString());
						}
					}
					mainProjectSubconList.add(projectSubcons);
				} catch (Exception e) {
					log.error("Error occured while setting process state for projectSubcons ",e);
					throw new Exception("Error occured while querying project child('"+Constants.HDR_PROJECT_CHILD.Subconsultant_c.toString()+"','Project Id:"+projHeader.getProjecId()+"','Child Id:'"+projectSubcons.getSubconsultantId()+") to determine if the child is an update or create",e);
				}
				
			}
			projectSubconsList = null;
			projectSubconsList=entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECT_SUBCONS, new Object[]{p});
		}
		
		if(mainProjectSubconList!=null && !mainProjectSubconList.isEmpty()){
			projHeader.setProjectSubconsList(mainProjectSubconList);
		}
	}

	private void setProjectLocation(Project projHeader, Long p, String operation) throws Exception {
		List<ProjectLocation> mainProjectLocationList = new ArrayList<ProjectLocation>();
		List<ProjectLocation> projectLocationList=entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECT_LOCATION, new Object[]{p});
		while(projectLocationList!=null && projectLocationList.size()>0){
			for (ProjectLocation projectLocation : projectLocationList) {
				try {
					dbutil.updateDbStatus(projectLocation, Constants.SYNC_STATUS.IN_PROGRESS.getVal(),null);
					if(operation!=null){
						projectLocation.setOperation(operation);
					}else{
						/**
						 * We will make WS call on child to determine if create or update
						 */
						BaseObject o = getQueryParamForChild(Constants.HDR_PROJECT_CHILD.Location_c.toString(),projHeader,projectLocation.getPrjLocationCode().toString());
						Object out = projectWS.findProjectChild(o);
						if(out!=null){
							LocationC LocationCosc = (LocationC)out;
							projectLocation.setProjectLocationOscId(LocationCosc.getId());
							projectLocation.setOperation(HDR_OPERATION.UPDATE.toString());
							
						}else{
							projectLocation.setProjectLocationOscId(null);
							projectLocation.setOperation(HDR_OPERATION.CREATE.toString());
						}
						
					}
					mainProjectLocationList.add(projectLocation);
				} catch (Exception e) {
					log.error("Error occured while setting process state for projectLocation ",e);
					throw new Exception("Error occured while querying project child('"+Constants.HDR_PROJECT_CHILD.Location_c.toString()+"','Project Id:"+projHeader.getProjecId()+"','Child Id:'"+projectLocation.getPrjLocationCode()+") to determine if the child is an update or create",e);
				}
				
			}
			projectLocationList = null;
			projectLocationList=entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECT_LOCATION, new Object[]{p});
		}
		
		if(mainProjectLocationList!=null && !mainProjectLocationList.isEmpty()){
			projHeader.setProjectLocationList(mainProjectLocationList);
		}
	}

	private void setProjectFeeCost(Project projHeader, Long p, String operation) throws Exception {
		List<ProjectFeeCost> mainprojectFeeCostListList = new ArrayList<ProjectFeeCost>();
		List<ProjectFeeCost> projectFeeCostList=entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECT_FEE_COST, new Object[]{p});
		while(projectFeeCostList!=null && projectFeeCostList.size()>0){
			for (ProjectFeeCost projectFeeCost : projectFeeCostList) {
				try {
					dbutil.updateDbStatus(projectFeeCost, Constants.SYNC_STATUS.IN_PROGRESS.getVal(),null);
					if(operation!=null){
						projectFeeCost.setOperation(operation);
					}else{
						/**
						 * We will make WS call on child to determine if create or update
						 */
						BaseObject o = getQueryParamForChild(Constants.HDR_PROJECT_CHILD.CostsFees_c.toString(),projHeader,projectFeeCost.getCostFeeId().toString());
						Object out = projectWS.findProjectChild(o);
						if(out!=null){
							CostsFeesC costFeesOSC = (CostsFeesC)out;
							projectFeeCost.setCostFeesOSCId(costFeesOSC.getId());
							projectFeeCost.setOperation(HDR_OPERATION.UPDATE.toString());
							
						}else{
							projectFeeCost.setCostFeesOSCId(null);
							projectFeeCost.setOperation(HDR_OPERATION.CREATE.toString());
						}
						
					}
					mainprojectFeeCostListList.add(projectFeeCost);
				} catch (Exception e) {
					log.error("Error occured while setting process state for projectFeeCost ",e);
					throw new Exception("Error occured while querying project child('"+Constants.HDR_PROJECT_CHILD.CostsFees_c.toString()+"','Project Id:"+projHeader.getProjecId()+"','Child Id:'"+projectFeeCost.getCostFeeId()+") to determine if the child is an update or create",e);
				}
				
			}
			projectFeeCostList = null;
			projectFeeCostList=entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECT_FEE_COST, new Object[]{p});
		}
		
		if(mainprojectFeeCostListList!=null && !mainprojectFeeCostListList.isEmpty()){
			projHeader.setProjectFeeCostList(mainprojectFeeCostListList);
		}
	}

	
	
	

	private BaseObject getQueryParamForChild(String childName, Project projHeader, String childId) throws Exception{
		BaseObject o = new BaseObject();
		o.setFetchSize(1);
		o.setFetchStart(0);
		o.setViewCriteriaAttributeName("Projects_Id_c");
		o.setOperator("=");
		o.setViewCriteriaAttributeValue(projHeader.getOscProjectId().toString());
		
		o.setViewCriteriaAttributeName2("RecordName");
		o.setOperator2("=");
		o.setViewCriteriaAttributeValue2(childId);
		
		
		List<String> fndAttriList = new ArrayList<String>();
		fndAttriList.add("Id");
		fndAttriList.add("RecordName");
		fndAttriList.add("Projects_Id_c");
		
		o.setListOfAttribute(fndAttriList);
		o.setViewCriteriaAttributeNameInner(childName);
		
		return o;
		
		
	}
}
