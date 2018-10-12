package com.hdr.sync.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.commons.collections.map.HashedMap;
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
import com.hdr.service.MailServ;
import com.hdr.service.ProjectServ;
import com.hdr.sync.SyncObject;
import com.hdr.util.CommonUtil;
import com.hdr.util.Constants;
import com.hdr.util.Constants.HDR_OPERATION;
import com.hdr.util.ErrorMsgUtil;
import com.hdr.util.PropFileUtil;
import com.hdr.ws.stubs.customeObject.CostsFeesC;
import com.hdr.ws.stubs.customeObject.LocationC;
import com.hdr.ws.stubs.customeObject.ProjectsC;
import com.hdr.ws.stubs.customeObject.SubconsultantC;

@Repository("syncProjectODSToOSC")
@Service
public class SyncProjectODSToOSC implements SyncObject{
	/**
	 * Registering Logger for SyncCompanyObject.class
	 */
	private static final Logger log = Logger.getLogger(SyncProjectODSToOSC.class);

	@Resource
	private ProjectServ projectWS;
	
	@Resource
	private DbUtilityServ dbutil;
	
	@Resource
	private MailServ mailServ;
	
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

	@SuppressWarnings("unchecked")
	private void process() throws Exception {
		/**
		 * Query Unprocessed Project
		 * Query: select o from com.hdr.model.Project o where ((PROCESS_STATE = 'READY') or (PROCESS_STATE='ERROR' and RETRY_COUNT<3))
		 */
		List<Project> projectHeaderList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECTS_HEADER);
		/**Please note
		 * We will query child object only if we have a 'READY' parent account.
		 * It is assumed that if a child has an update the parent will also come in the header table no matter if there is any update
		 * in header or not
		 */
		boolean isErrored  = false;
		/**
		 * Iterate through
		 */
		while(projectHeaderList!=null && projectHeaderList.size()>0){
				for (Project p : projectHeaderList) {
					try {
						dbutil.updateDbStatus(p,Constants.SYNC_STATUS.IN_PROGRESS.getVal(),null);
						prepareChildListWithSuitableOperation(p);
						if(Constants.HDR_OPERATION.CREATE.toString().equalsIgnoreCase(p.getOperation())){
							projectWS.create(p);
						}else{
							projectWS.merge(p);
						}
						dbutil.updateDbStatus(p, Constants.SYNC_STATUS.COMPLETED.getVal(),null);
						dbutil.setProjectChildDBStatus(p, Constants.SYNC_STATUS.COMPLETED.getVal(), null, true);
						
					} catch (Exception e) {
						isErrored =   true;
					 log.error("Error occured while preparing child",e);
					  dbutil.updateDbStatus(p, Constants.SYNC_STATUS.ERROR.getVal(),e);
					  dbutil.setProjectChildDBStatus(p, Constants.SYNC_STATUS.ERROR.getVal(),e, true);
					 //Error Handling Happens here
					  setErrorLog(e,"Error while syncing Project from ODS to OSC . Trace: ",p);
						
					}
					
				}
			projectHeaderList=null;
			projectHeaderList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECTS_HEADER);
		}
		
		if(isErrored){sentNotificationMail();};
		
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void sentNotificationMail(){
		Map m = new HashedMap();
		m.put("objectName", "PROJECT");
		m.put("direction", "ODS to OSC");
		m.put("error_log_table", "ODS_OSC_ERROR_LOG");
		m.put("tableName", "XXHDR_IN_PROJECT_HEADER_STG");
		m.put("hostAddress", PropFileUtil.getValue(Constants.FCRMOD_URL));
		m.put("loginId",  PropFileUtil.getValue(Constants.FCRMOD_USERNAME));
		try {
			mailServ.sendMail(CommonUtil.getSystemPropertyValue("EMAIL_NOTIFICATION_FROM"),CommonUtil.getSystemPropertyValue("EMAIL_NOTIFICATION_TO").split(","), m.get("direction")+ " - " +m.get("objectName"), "template/summary_email_notification_job_cr.vm",m);	
		} catch (Exception e) {
			log.error("Error occured while sending out notification mail",e); 		
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
			/**
			 * Even though Record Name is changed from Project Id to Project Number, we will still query Oracle Sales Cloud with Project ID
			 * to determine if the current records is an update or create.
			 */
			Long p = projHeader.getProjecId();
			/**
			 * We will query Oracle Sales Cloud to See if this project header is present
			 * 
			 */	BaseObject o =getQueryParam(p,IProjectConstants.PROJECT_FIELD_EBS_PROJECT_ID);
				Object out =  projectWS.find(o);
				if(out!=null){
				/**
				 *   Project is already present
				 *   Then strategize the merge
				 */
				  ProjectsC pFromOsc = (ProjectsC) out;
				  projHeader.setOscProjectId(pFromOsc.getId());
				  projHeader.setOperation(Constants.HDR_OPERATION.UPDATE.toString());
				  getChild(projHeader, p,null,pFromOsc);
				}else{
					/**
					 * This is a brand new header we will simply create project with all the child
					 */
					projHeader.setOperation(Constants.HDR_OPERATION.CREATE.toString());
					getChild(projHeader, p,Constants.HDR_OPERATION.CREATE.toString(),null);
				}
				return projHeader;
				
		}
		return null;
	}

	private void getChild(Project projHeader, Long ebsProjectId, String operation, ProjectsC pFromOsc) throws Exception {
		try {
			// FeeCost
			setProjectFeeCost(projHeader, ebsProjectId, operation, pFromOsc);
			// Location
			setProjectLocation(projHeader, ebsProjectId, operation, pFromOsc);
			// Subcons
			getProjectSubcons(projHeader, ebsProjectId, operation, pFromOsc);
			// Team
			
		} catch (Exception e) {
			log.error("Error occured while fetchin child",e);
			throw e;
		}
	}

	private BaseObject getQueryParam(Long p,String queryField) {
		BaseObject o = new BaseObject();
		o.setViewCriteriaAttributeName(queryField);
		o.setViewCriteriaAttributeValue(p.toString());
		o.setOperator(Constants.FUSION_EQUALS_OPERATOR);
		o.setFetchSize(1);
		o.setFetchStart(0);
		List<String> findAttribList = new ArrayList<String>();
		findAttribList.add(IProjectConstants.PROJECT_FIELD_ID);
		findAttribList.add(IProjectConstants.PROJECT_FIELD_RECORDNAME);
		findAttribList.add(IProjectConstants.PROJECT_FIELD_COST_FEE_COLLECTION);
		findAttribList.add(IProjectConstants.PROJECT_FIELD_LOCATION_COLLECTION);
		findAttribList.add(IProjectConstants.PROJECT_FIELD_SUBCONSULTANT_COLLECTION);
		
		
		
		findAttribList.add(queryField);
		o.setListOfAttribute(findAttribList);
		return o;
	}


	private void getProjectSubcons(Project projHeader, Long p, String operation, ProjectsC pFromOsc) throws Exception {
		List<ProjectSubcons> mainProjectSubconList = new ArrayList<ProjectSubcons>();
		/**
		 * #
		 */
		Map<String, BigDecimal> childIdMap = null;
		if("UPDATE".equalsIgnoreCase(operation) || operation == null){childIdMap = extractSubconsultantChild(pFromOsc);}
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
						if(projectSubcons.getSubconsultantId()!=null){
							if(childIdMap!=null && childIdMap.get(String.valueOf(projectSubcons.getSubconsultantId()))!=null){
								projectSubcons.setProjectSubConOscId(childIdMap.get(String.valueOf(projectSubcons.getSubconsultantId())));
								projectSubcons.setOperation(HDR_OPERATION.UPDATE.toString());
							}else{
								projectSubcons.setOperation(null);
								projectSubcons.setOperation(HDR_OPERATION.CREATE.toString());
							}	
						}else{
							throw new Exception("Project: Subconsultant : Subconsultant Id is blank for this records with project id: "+p);
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

	private Map<String, BigDecimal> extractSubconsultantChild(ProjectsC pFromOsc) {
		/**
		 * MY CHAGE STARTS
		 */
		Map<String,BigDecimal> childIdMap = null;
		List<SubconsultantC> lFromOSC = pFromOsc.getSubconsultantCollectionCs();
		if(lFromOSC!=null){
			childIdMap = new HashMap<String, BigDecimal>();
			for (SubconsultantC objOSC : lFromOSC) {
				if(objOSC.getSubconsultantIdC()!=null && objOSC.getSubconsultantIdC().getValue()!=null){
					childIdMap.put(objOSC.getSubconsultantIdC().getValue(),objOSC.getId());
				}
			}
		}
		/**
		 * MY CHAGE ENDS
		 */
		return childIdMap;
	}

	private void setProjectLocation(Project projHeader, Long p, String operation, ProjectsC pFromOsc) throws Exception {
		List<ProjectLocation> mainProjectLocationList = new ArrayList<ProjectLocation>();
		/**
		 * #
		 */
		Map<String, BigDecimal> childIdMap = null;
		if("UPDATE".equalsIgnoreCase(operation) || operation ==  null){childIdMap = extractProjectLocationChild(pFromOsc);}
		
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
						//BaseObject o = getQueryParamForChild(IProjectConstants.HDR_PROJECT_CHILD.CostsFees_c.toString(),projHeader,projectFeeCost.getCostFeeId().toString(),IProjectConstants.PROJECT_FIELD_COSTFEEID);
						//Object out = projectWS.findProjectChild(o);
						if(projectLocation.getPrjLocationCode()!=null){
							if(childIdMap!=null && childIdMap.get(String.valueOf(projectLocation.getPrjLocationCode()))!=null){
								projectLocation.setProjectLocationOscId(childIdMap.get(String.valueOf(projectLocation.getPrjLocationCode())));
								projectLocation.setOperation(HDR_OPERATION.UPDATE.toString());
							}else{
								projectLocation.setOperation(null);
								projectLocation.setOperation(HDR_OPERATION.CREATE.toString());
							}	
						}else{
							throw new Exception("Project: Location: Location Id is blank for this records with project id: "+p);
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

	private Map<String, BigDecimal> extractProjectLocationChild(ProjectsC pFromOsc) {
		/**
		 * MY CHAGE STARTS
		 */
		Map<String,BigDecimal> childIdMap = null;
		List<LocationC> lFromOSC = pFromOsc.getLocationCollectionCs();
		if(lFromOSC!=null){
			childIdMap =  new HashMap<String, BigDecimal>();
			for (LocationC objOSC : lFromOSC) {
				if(objOSC.getLocationIdC()!=null && objOSC.getLocationIdC().getValue()!=null){
					childIdMap.put(objOSC.getLocationIdC().getValue(),objOSC.getId());
				}
			}
		}
		/**
		 * MY CHAGE ENDS
		 */
		return childIdMap;
	}

	private void setProjectFeeCost(Project projHeader, Long p, String operation, ProjectsC pFromOsc) throws Exception {
		
		List<ProjectFeeCost> mainprojectFeeCostListList = new ArrayList<ProjectFeeCost>();
		/**
		 * #
		 */
		System.out.println();
		Map<String, BigDecimal> childIdMap = null;
		if("UPDATE".equalsIgnoreCase(operation) || operation == null){childIdMap = extractProjectCostFee(pFromOsc);}
		List<ProjectFeeCost> projectFeeCostList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_PROJECT_FEE_COST, new Object[]{p});
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
						//BaseObject o = getQueryParamForChild(IProjectConstants.HDR_PROJECT_CHILD.CostsFees_c.toString(),projHeader,projectFeeCost.getCostFeeId().toString(),IProjectConstants.PROJECT_FIELD_COSTFEEID);
						//Object out = projectWS.findProjectChild(o);
						if(projectFeeCost.getCostFeeId()!=null){
							if(childIdMap!=null && childIdMap.get(String.valueOf(projectFeeCost.getCostFeeId()))!=null){
								projectFeeCost.setCostFeesOSCId(childIdMap.get(String.valueOf(projectFeeCost.getCostFeeId())));
								projectFeeCost.setOperation(HDR_OPERATION.UPDATE.toString());
							}else{
								projectFeeCost.setCostFeesOSCId(null);
								projectFeeCost.setOperation(HDR_OPERATION.CREATE.toString());
							}	
						}else{
							throw new Exception("Cost Fee Id is blank for this records with project id: "+p);
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

	private Map<String, BigDecimal> extractProjectCostFee(ProjectsC pFromOsc) {
		/**
		 * MY CHAGE STARTS
		 */
		Map<String,BigDecimal> childIdMap = null;
		List<CostsFeesC> lFromOSC = pFromOsc.getCostsFeesCollectionCs();
		if(lFromOSC!=null){
			childIdMap =  new HashMap<String, BigDecimal>();
			for (CostsFeesC objOSC : lFromOSC) {
				if(objOSC.getCostFeeIdC()!=null && objOSC.getCostFeeIdC().getValue()!=null){
					childIdMap.put(objOSC.getCostFeeIdC().getValue(),objOSC.getId());
				}
			}
		}
		/**
		 * MY CHAGE ENDS
		 */
		return childIdMap;
	}

	
	
	

	private BaseObject getQueryParamForChild(String childName, Project projHeader, String childId, String childIdField) throws Exception{
		BaseObject o = new BaseObject();
		o.setFetchSize(1);
		o.setFetchStart(0);
		o.setViewCriteriaAttributeName("Projects_Id_c");
		o.setOperator("=");
		o.setViewCriteriaAttributeValue(projHeader.getOscProjectId().toString());
		
		o.setViewCriteriaAttributeName2(childIdField);
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
