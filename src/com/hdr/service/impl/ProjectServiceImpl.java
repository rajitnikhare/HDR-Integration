
package com.hdr.service.impl;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.constants.ICompanyConstants;
import com.hdr.constants.IProjectConstants;
import com.hdr.exception.FusionException;
import com.hdr.model.BaseObject;
import com.hdr.model.DeleteProjectCostFee;
import com.hdr.model.DeleteProjectLocation;
import com.hdr.model.Project;
import com.hdr.model.ProjectFeeCost;
import com.hdr.model.ProjectLocation;
import com.hdr.model.ProjectSubcons;
import com.hdr.service.AccountServ;
import com.hdr.service.ProjectServ;
import com.hdr.service.PursuitProjectService;
import com.hdr.util.Constants;
import com.hdr.util.DateUtils;
import com.hdr.ws.stubs.accountService.Account;
import com.hdr.ws.stubs.customeObject.AmountType;
import com.hdr.ws.stubs.customeObject.Conjunction;
import com.hdr.ws.stubs.customeObject.CostsFeesC;
import com.hdr.ws.stubs.customeObject.FindControl;
import com.hdr.ws.stubs.customeObject.FindCriteria;
import com.hdr.ws.stubs.customeObject.LocationC;
import com.hdr.ws.stubs.customeObject.ObjectFactory;
import com.hdr.ws.stubs.customeObject.ProjectsC;
import com.hdr.ws.stubs.customeObject.SalesCustomObjectService;
import com.hdr.ws.stubs.customeObject.SalesCustomObjectService_Service;
import com.hdr.ws.stubs.customeObject.SubconsultantC;
import com.hdr.ws.stubs.customeObject.ViewCriteria;
import com.hdr.ws.stubs.customeObject.ViewCriteriaItem;
import com.hdr.ws.stubs.customeObject.ViewCriteriaRow;
import com.hdr.ws.stubs.opportunity.Opportunity;
import com.hdr.ws.stubs.opportunity.ServiceException;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;



@Service
public class ProjectServiceImpl extends AbstractFCRMODWebService implements ProjectServ{

	private static final Logger log = Logger.getLogger(ProjectServiceImpl.class);
	
	private static final ObjectFactory factory  = new ObjectFactory();
	
	@Resource
	private AccountServ accountServ;
	
	@Resource
	private PursuitProjectService optyServ;
	
	@Override
	public Object find(BaseObject o) throws FusionException {
		if(o!=null){
			try {
				  SalesCustomObjectService publicService =getPublicService();
				  /**
				   * Find Criteria
				   */
				  FindCriteria findCriteria = new FindCriteria();
				  findCriteria.setExcludeAttribute(false);
				  findCriteria.setFetchSize(o.getFetchSize());
				  findCriteria.setFetchStart(o.getFetchStart());
				  findCriteria.getFindAttributes().addAll(o.getListOfAttribute());
				  
				  /**
				   * Find Control
				   */
				  FindControl findControl = new FindControl();
				  findControl.setRetrieveAllTranslations(false);
				  
				  /**
				   * View Criteria Item
				   */
				  ViewCriteriaItem criteriaItem = new ViewCriteriaItem();
				  criteriaItem.setConjunction(Conjunction.AND);
				  criteriaItem.setAttribute(o.getViewCriteriaAttributeName());
				  criteriaItem.setOperator(o.getOperator());
				  criteriaItem.getValues().add(o.getViewCriteriaAttributeValue());
				  /**
				   * View Criteria Row
				   */
				  ViewCriteriaRow criteriaRow = new ViewCriteriaRow();
				  criteriaRow.setConjunction(Conjunction.AND);
				  criteriaRow.getItems().add(criteriaItem);
				  /**
				   * View Criteria 
				   */
				  ViewCriteria criteria = new ViewCriteria();
				  criteria.setConjunction(Conjunction.AND);
				  criteria.getGroups().add(criteriaRow);
				  
				  findCriteria.setFilter(criteria);
				  /**
				   * WS Call
				   */
				  List<Object> out = publicService.findEntity(findCriteria, findControl, IProjectConstants.PROJECT_CUSTOM_OBJECT_NAME);
				  if(out!=null && out.size()>0){
					  return out.get(0);
				  }
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}



	@Override
	public Object findProjectChild(BaseObject o) throws FusionException {
		if(o!=null){
			try {
				SalesCustomObjectService publicService = getPublicService();
				
				
				  FindCriteria findCriteria = new FindCriteria();
				  findCriteria.setExcludeAttribute(false);
				  findCriteria.setFetchSize(o.getFetchSize());
				  findCriteria.setFetchStart(o.getFetchStart());
				  findCriteria.getFindAttributes().addAll(o.getListOfAttribute());
				  
				  FindControl findControl = new FindControl();
				  findControl.setRetrieveAllTranslations(false);
				  
				  
				  ViewCriteriaItem criteriaItemA = new ViewCriteriaItem();
				  criteriaItemA.setConjunction(Conjunction.AND);
				  criteriaItemA.setAttribute(o.getViewCriteriaAttributeName());
				  criteriaItemA.setOperator(o.getOperator());
				  criteriaItemA.getValues().add(o.getViewCriteriaAttributeValue());
				  
				  
				  
				  ViewCriteriaItem criteriaItemB = new ViewCriteriaItem();
				  criteriaItemB.setConjunction(Conjunction.AND);
				  criteriaItemB.setAttribute(o.getViewCriteriaAttributeName2());
				  criteriaItemB.setOperator(o.getOperator2());
				  criteriaItemB.getValues().add(o.getViewCriteriaAttributeValue2());
				  
				  ViewCriteriaRow criteriaRowA = new ViewCriteriaRow();
				  criteriaRowA.setConjunction(Conjunction.AND);
				  criteriaRowA.getItems().add(criteriaItemA);
				  
				  ViewCriteriaRow criteriaRowB = new ViewCriteriaRow();
				  criteriaRowB.setConjunction(Conjunction.AND);
				  criteriaRowB.getItems().add(criteriaItemB);
				  
				  ViewCriteria criteria = new ViewCriteria();
				  criteria.setConjunction(Conjunction.AND);
				  criteria.getGroups().add(criteriaRowA);
				  criteria.getGroups().add(criteriaRowB);
				  
				  findCriteria.setFilter(criteria);
				  
				  List<Object> out = publicService.findEntity(findCriteria, findControl, o.getViewCriteriaAttributeNameInner());
				  if(out!=null && out.size()>0){
					  return out.get(0);
				  }
				
				
				
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}
	
	@Override
	public ProjectsC findProjectByEBSIdForDeliveryProjectSync(BigDecimal deliveryProjectId) throws FusionException {
		
		          log.debug(">>findProjectByEBSIdForDeliveryProjectSync deliveryProjectId: "+ deliveryProjectId);

				  try 
				  {
					  SalesCustomObjectService publicService =getPublicService();
					  
					  FindCriteria findCriteria = new FindCriteria();
					  findCriteria.setExcludeAttribute(false);
					  findCriteria.setFetchSize(1);
					  findCriteria.setFetchStart(0);
					  findCriteria.getFindAttributes().add("Id");
					  
					  FindControl findControl = new FindControl();
					  findControl.setRetrieveAllTranslations(false);
					  
					  
					  ViewCriteriaItem criteriaItem = new ViewCriteriaItem();
					  criteriaItem.setConjunction(Conjunction.AND);
					  criteriaItem.setAttribute("RecordName");
					  criteriaItem.setOperator(Constants.FUSION_EQUALS_OPERATOR);
					  criteriaItem.getValues().add(deliveryProjectId.toString());
					  
					  ViewCriteriaRow criteriaRow = new ViewCriteriaRow();
					  criteriaRow.setConjunction(Conjunction.AND);
					  criteriaRow.getItems().add(criteriaItem);
					  
					  ViewCriteria criteria = new ViewCriteria();
					  criteria.setConjunction(Conjunction.AND);
					  criteria.getGroups().add(criteriaRow);
					  
					  findCriteria.setFilter(criteria);
					  
					  List<Object> out = publicService.findEntity(findCriteria, findControl, "Projects_c");
					  if(out!=null && out.size()>0)
					  {
						  return (ProjectsC)out.get(0);
					  }
				}  catch (Exception e) {
					throw new FusionException(e);
				}
				
		
		          return null;
	}

	@Override
	public void mergeProject(ProjectsC project) throws FusionException
	{
		log.debug(">>mergeProject");
		
		try 
		{
			SalesCustomObjectService publicService =getPublicService();
			publicService.mergeEntity(project, "Projects_c");
			
		}catch (Exception e) {
			throw new FusionException(e);
		}
		
		
	}

	@Override
	public Object merge(Project projFromDBaaS) throws FusionException {
		if(projFromDBaaS!=null){
			try {
				SalesCustomObjectService publisService = getPublicService();
				ProjectsC projForOSC = factory.createProjectsC();
				if(projFromDBaaS.getProjecId()!=null)projForOSC.setRecordName(projFromDBaaS.getProjecId().toString());
				projForOSC.setId(projFromDBaaS.getOscProjectId());
				setProjectFields(projForOSC,projFromDBaaS);
				setSubCons(projFromDBaaS, projForOSC);
				 
				setLocation(projFromDBaaS, projForOSC);
				 
				setCostFees(projFromDBaaS, projForOSC);
				
				publisService.mergeEntity(projForOSC,IProjectConstants.PROJECT_CUSTOM_OBJECT_NAME);
				
			}catch (Exception e) {
				throw new FusionException(e);
			}
		}
		
		
		
		
		
		return null;
	}
	
	@Override
	public Object delete(DeleteProjectLocation projFromDBaaS) throws FusionException {
		if(projFromDBaaS!=null){
			try {
				SalesCustomObjectService publisService = getPublicService();
				LocationC loc =  factory.createLocationC();
				loc.setId(projFromDBaaS.getId());
				publisService.deleteEntity(loc,"Location_c");
				
			}catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}
		@Override
		public Object delete(DeleteProjectCostFee projFromDBaaS) throws FusionException {
			if(projFromDBaaS!=null){
				try {
					SalesCustomObjectService publisService = getPublicService();
					CostsFeesC loc =  factory.createCostsFeesC();
					loc.setId(projFromDBaaS.getId());
					publisService.deleteEntity(loc,"CostsFees_c");
					
				}catch (Exception e) {
					throw new FusionException(e);
				}
			}
		return null;
	}

	@Override
	public Object create(Project projFromDBaaS) throws FusionException {
		if(projFromDBaaS!=null){
			try {
				SalesCustomObjectService publisService = getPublicService();
				ProjectsC projForOSC = factory.createProjectsC();
				/**
				 * Project Number
				 */
				projForOSC.setRecordName(projFromDBaaS.getProjectNumber());
				
				
				 setProjectFields(projForOSC,projFromDBaaS);
				
				 setSubCons(projFromDBaaS, projForOSC);
				 
				 setLocation(projFromDBaaS, projForOSC);
				 
				 setCostFees(projFromDBaaS, projForOSC);
				
				 
				
				 publisService.createEntity(projForOSC,IProjectConstants.PROJECT_CUSTOM_OBJECT_NAME);
				
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}
	
	
	
	private void setProjectFields(ProjectsC projForOSC, Project projFromDBaaS) throws Exception {
		try {
			
			projForOSC.setIntegratedProjectC(true);
			
			/**
			 * PROJECT NUMBER
			 */
			projForOSC.setRecordName(projFromDBaaS.getProjectNumber());
			/**
			 * PROJECT ID			
			 */
			if(checkLong(projFromDBaaS.getProjecId()))projForOSC.setEBSProjectIDC(factory.createProjectsCEBSProjectIDC(String.valueOf(projFromDBaaS.getProjecId())));
			
			/**
			 * Project Description-- Mapped to Contract Name
			 */
			projForOSC.setContractNameC(factory.createProjectsCContractNameC(projFromDBaaS.getProjectDescrLong()));
			/**
			 * CONTRACT_TYPE
			 */
			projForOSC.setContractTypeC(factory.createProjectsCContractTypeC(projFromDBaaS.getContractType()));
			/**
			 * There is better way to write this piece, but I am not sure as of now what all values can come in COMPANY
			 * One this has been confirmed we can write efficient piece that fits the information
			 */
			if(IProjectConstants.PROJECT_FIELD_COMPANY_ENGINEERING.equalsIgnoreCase(projFromDBaaS.getOperatingCompany())){
				/**
				 *MARKET_SECTOR
				 */
				projForOSC.setMarketSectorC(factory.createProjectsCMarketSectorC(projFromDBaaS.getMarketSector()));
				/**
				 * BUSINESS_UNIT
				 */
				projForOSC.setBusinessUnitC(factory.createProjectsCBusinessUnitC(projFromDBaaS.getBusinessUnit()));
			}else if(IProjectConstants.PROJECT_FIELD_COMPANY_ARCHITECTURE.equalsIgnoreCase(projFromDBaaS.getOperatingCompany())){
				
				projForOSC.setMarketSectorC(factory.createProjectsCMarketSectorC(null));
				/**
				 * BUSINESS_UNIT
				 */
				projForOSC.setBusinessUnitC(factory.createProjectsCBusinessUnitC(null));
			}else{
				projForOSC.setMarketSectorC(factory.createProjectsCMarketSectorC(null));
				/**
				 * BUSINESS_UNIT
				 */
				projForOSC.setBusinessUnitC(factory.createProjectsCBusinessUnitC(null));
			}
			
			/**
			 * HDR_ROLE
			 */
			projForOSC.setHDRRoleC(factory.createProjectsCHDRRoleC(projFromDBaaS.getHdrRole()));
			/**
			 * PRIMARY_COMPANY
			 */
			 Account a =getAccount(projFromDBaaS.getEbsAccountId());
			 if(a!=null){
				 projForOSC.setPrimaryCompanyIdC(factory.createProjectsCPrimaryCompanyIdC(BigDecimal.valueOf(a.getPartyId())));
			 }else{
				 //TODO: Create the record but update it as error
				 //throw new Exception("Account Cannot be null with EBS Account id:"+projFromDBaaS.getEbsAccountId()+" for project id:"+projFromDBaaS.getProjecId());
			 }
			/**
			 * PROJECT_GSA_CODE
			 */
			 projForOSC.setPrimaryGSACodesAndSF330CodeC(factory.createProjectsCPrimaryGSACodesAndSF330CodeC(projFromDBaaS.getProjectGsaCode()));
			 /**
			  * OPPORTUNITY_NAME 
			  *TODO:there is nore RnD needed as in how the opportunity Detail is going to Come
			  */
			 projForOSC.setOpportunityNameSC(factory.createProjectsCOpportunityNameSC(projFromDBaaS.getOpportunityName()));
			 /**
			  * MASTER_CONTRACT_NAME
			  */
			 projForOSC.setMasterContractNameC(factory.createProjectsCMasterContractNameC(projFromDBaaS.getMasterContractName()));
			 /**
			  * CONTRACT_STATUS
			  */
			 projForOSC.setContractStatusC(factory.createProjectsCContractStatusC(projFromDBaaS.getContractStatus()));
			 /**
			  * EBS_PURSUIT_PROJECT_ID LONG
			  * 
			  */
			 if(checkLong(projFromDBaaS.getEbsPursuitProjectId()))projForOSC.setEBSProjectNumberC(factory.createProjectsCEBSProjectNumberC(String.valueOf(projFromDBaaS.getEbsPursuitProjectId())));
			 /**
			  * FEDERAL_NUMBER
			  */
			 projForOSC.setFederalNumberC(factory.createProjectsCFederalNumberC(projFromDBaaS.getFedralNumber()));
			 
			 /**
			  * EBS_CONTRACT_ID LONG
			  */
			 if(checkLong(projFromDBaaS.getEbsContractId()))projForOSC.setContractIDC(factory.createProjectsCContractIDC(projFromDBaaS.getEbsContractId().toString()));
			 
			 /**
			  * EBS_MASTER_CONTRACT_ID Long
			  */
			 if(checkLong(projFromDBaaS.getEbsMasterContractId()))projForOSC.setMasterContractIDC(factory.createProjectsCMasterContractIDC(projFromDBaaS.getEbsMasterContractId().toString()));
			 
			 /**
			  * NOTICE_TO_PROCEED_DATE DATE
			  */
			 if(checkDate(projFromDBaaS.getNoticeToProceedDate()))projForOSC.setNoticeToProceedC(factory.createProjectsCNoticeToProceedC(getFusionDate(projFromDBaaS.getNoticeToProceedDate())));
			 /**
			  * FIRST_ACTIVITY_DATE DATE
			  */
			 if(checkDate(projFromDBaaS.getFirstActivityDate()))projForOSC.setFirstActivityDateC(factory.createProjectsCFirstActivityDateC(getFusionDate(projFromDBaaS.getFirstActivityDate())));
			 /**
			  * EST_COMPLETION_DATE DATE
			  */
			 if(checkDate(projFromDBaaS.getEstCompletionDate()))projForOSC.setEstimatedCompletionDateC(factory.createProjectsCEstimatedCompletionDateC(getFusionDate(projFromDBaaS.getEstCompletionDate())));
			 /**
			  * PLANNED_FINISH_DATE DATE
			  */
			 if(checkDate(projFromDBaaS.getPlannedFinsihDate()))projForOSC.setPlannedFinishDateC(factory.createProjectsCPlannedFinishDateC(getFusionDate(projFromDBaaS.getPlannedFinsihDate())));
			 /**
			  * ACTUAL_START_DATE  DATE
			  */
			 if(checkDate(projFromDBaaS.getActualStartDate()))projForOSC.setActualStartDateC(factory.createProjectsCActualStartDateC(getFusionDate(projFromDBaaS.getActualStartDate())));
			 /**
			  * ACTUAL_FINISH_DATE DATE
			  */
			 if(checkDate(projFromDBaaS.getActualFinishDate()))projForOSC.setActualFinishDateC(factory.createProjectsCActualFinishDateC(getFusionDate(projFromDBaaS.getActualFinishDate())));
			 /**
			  * PLANNED_START_DATE DATE
			  */
			 if(checkDate(projFromDBaaS.getPlannedStartDate()))projForOSC.setPlannedStartDateC(factory.createProjectsCPlannedStartDateC(getFusionDate(projFromDBaaS.getPlannedStartDate())));
			 /**
			  * BOOKED_FEE BigDecimal
			  */
			 if(checkBD(projFromDBaaS.getBookedFee()))projForOSC.setBookedFeeC(factory.createProjectsCBookedFeeC(getAmountbd(projFromDBaaS.getBookedFee())));
			 /**
			  * OSC_OPPORTUNITY_ID
			  *TODO: NOT SURE MAPPING 
			  */
			 if(checkString(projFromDBaaS.getOscOpportunityId()))projForOSC.setOpportunityIdC(factory.createProjectsCOpportunityIdC(projFromDBaaS.getOscOpportunityId()));
			 /**
			  * We will query OSC Opportunity With this ID and Associate the Project Id to it
			  * 
			  */
			 
			 /**
			  * EBS_ACCOUNT_ID
			  * TODO: NOT SURE MAPPING 
			  */
			 
			 /**
			  * EBS_ACCOUNT_NUMBER
			  * TODO: NOT SURE MAPPING 
			  */
			 
			 /**
			  * OSC_PARTY_ID
			  * TODO: NOT SURE MAPPING 
			  */
			 updateOptyWithEBSProjectNumber(projFromDBaaS);
		} catch (Exception e) {
			throw new Exception("Error occured while setting fields for Project with id:"+projFromDBaaS.getProjecId());
		}
		
	}



	private void updateOptyWithEBSProjectNumber(Project projFromDBaaS) throws ServiceException, Exception {
		try {

			 BaseObject bo = new BaseObject();
			 bo.setFetchSize(1);
			 bo.setFetchStart(0);
			 bo.setViewCriteriaAttributeName("OptyId");
			 bo.setViewCriteriaAttributeValue(projFromDBaaS.getOscOpportunityId());
			 bo.setOperator("=");
			 List<String> findAtribList = new ArrayList<String>();
			 findAtribList.add("OptyId");	
			 bo.setListOfAttribute(findAtribList);
			 List<Opportunity> out = optyServ.get(bo);
			 if(out!=null && out.size()>0){
			     out.get(0);
			     optyServ.updateAndAssociateEBSProject(out.get(0),projFromDBaaS.getProjectNumber());
			 }else{
				 //throw new Exception("We did not get any opty with Opty Id: "+projFromDBaaS.getOscOpportunityId());
			 }
			 
		
		} catch (Exception e) {
			System.out.println();
			throw new Exception("Error occured while updating the opportunity with RBS Project Id",e);
		}
	}



	private AmountType getAmountbd(BigDecimal bookedFee) {
		AmountType a = new AmountType();
		a.setValue(bookedFee);
		return a;
	}



	private boolean checkBD(BigDecimal bookedFee) {
		
		return bookedFee!=null;
	}



	/**
	 * 
	 * @param objFrmDBaaS
	 * @param objFrmOsc
	 * @throws Exception
	 */
	private void setCostFees(Project objFrmDBaaS, ProjectsC objFrmOsc) throws Exception {
		List<ProjectFeeCost> objListDBaaS = objFrmDBaaS.getProjectFeeCostList(); 
		 if(objListDBaaS!=null && !objListDBaaS.isEmpty()){
			 List<CostsFeesC> objListOsc = objFrmOsc.getCostsFeesCollectionCs(); 
			
			 
			 for (ProjectFeeCost  objDBaaS : objListDBaaS) {
				 CostsFeesC objOsc = factory.createCostsFeesC();
				 if(objDBaaS.getDescription()!=null){
					  if(!"CREATE".equalsIgnoreCase(objDBaaS.getOperation())){
						  objOsc.setId(objDBaaS.getCostFeesOSCId());
					  }
					  objOsc.setDescriptionsC(objDBaaS.getDescription());
					 }else{
						 throw new Exception("Project Cost Fees :Description is a rquired fields, and its null from DBaaS: Project Id:"+objFrmDBaaS.getProjecId()+",Child Id: "+ objDBaaS.getCostFeeId());
					 }
				 
				 objOsc.setIntegratedCostsFeesC(true);
				 /**
				  * PROJECT_ID
				  */
				 //objOsc.setProjectsIdC(factory.createCostsFeesCProjectsIdC(BigDecimal.valueOf(objFrmDBaaS.getProjecId())));
				 /**
				  * ESTIMATED_COST
				  */
				 if(checkLong(objDBaaS.getEstimatedCost()))objOsc.setEstimatedConstructionCostUSDC(factory.createCostsFeesCEstimatedConstructionCostUSDC(getAmount(objDBaaS.getEstimatedCost())));
				 /**
				  * ACTUAL_COST
				  */
				 if(checkLong(objDBaaS.getActualCost()))objOsc.setActualConstructionCostUSDC(factory.createCostsFeesCActualConstructionCostUSDC(getAmount(objDBaaS.getActualCost())));
				 /**
				  * COST_FEE_ID
				  */
				 if(objDBaaS.getCostFeeId()!=null){
					 objOsc.setRecordName(objDBaaS.getCostFeeId().toString());
					 objOsc.setCostFeeIdC(factory.createCostsFeesCCostFeeIdC(objDBaaS.getCostFeeId().toString()));
				 }else{
					 throw new Exception("Project Cost Fees :Id is a rquired fields, and its null from DBaaS: Project Id:"+objFrmDBaaS.getProjecId());
				 }
				
				 /**
				  * DESCRIPTION
				  */
				 if(checkString(objDBaaS.getDescription()))objOsc.setDescriptionC(factory.createCostsFeesCDescriptionC(objDBaaS.getDescription().getBytes()));
				 objListOsc.add(objOsc);
			}
			 
		 }
	}
	
	/**
	 * 
	 * @param objFrmDBaaS
	 * @param objFrmOsc
	 * @throws Exception
	 */
	private void setLocation(Project objFrmDBaaS, ProjectsC objFrmOsc) throws Exception {
		List<ProjectLocation> objListDBaaS = objFrmDBaaS.getProjectLocationList(); 
		 if(objListDBaaS!=null && !objListDBaaS.isEmpty()){
			 List<LocationC> objListOsc = objFrmOsc.getLocationCollectionCs(); 
		
			 
			 for (ProjectLocation  objDBaaS : objListDBaaS) {
				 LocationC objOsc = factory.createLocationC();
				 if(objDBaaS.getPrjLocationCountryDescr()!=null && objDBaaS.getPrjLocStateDescr()!=null){
					  if(!"CREATE".equalsIgnoreCase(objDBaaS.getOperation())){
						  objOsc.setId(objDBaaS.getProjectLocationOscId());
					  }
					  if(checkString(objDBaaS.getPrjLocStateDescr()))objOsc.setStatesC(objDBaaS.getPrjLocStateDescr());
					  if(checkString(objDBaaS.getPrjLocCountryCode()))objOsc.setCountryC(objDBaaS.getPrjLocCountryCode());
					 }else{
						 throw new Exception("Project Location :State or Country is a rquired fields, and its null from DBaaS: Project Id:"+objFrmDBaaS.getProjecId()+",Child Id: "+ objDBaaS.getPrjLocationCode());
					 }
				 /**
				  * Project Id
				  *///TODO::Foriegn key error
				 //objOsc.setProjectsIdC(factory.createLocationCProjectsIdC(BigDecimal.valueOf(objFrmDBaaS.getProjecId())));
				 
				 objOsc.setIntegratedLocationC(true);
				 
				 if(objDBaaS.getPrjLocationCode()!=null){
					 /**
					  * PRJ_LOCATION_CODE
					  */
					 objOsc.setRecordName(objDBaaS.getPrjLocationCode().toString());
					 /**
					  * PRJ_LOCATION_CODE
					  */
					 if(objDBaaS.getPrjLocationCode()!=null)objOsc.setLocationIdC(factory.createLocationCLocationIdC(objDBaaS.getPrjLocationCode().toString()));
				 }else{
					 throw new Exception("Project Location :Location Id is a rquired fields, and its null from DBaaS: Project Id:"+objFrmDBaaS.getProjecId());
				 }
					
				 /**
				  * PRJ_LOC_COUNTY
				  */
				 objOsc.setCountyC(factory.createLocationCCountyC(objDBaaS.getProjLocCounty()));
				 /**
				  * PRJ_LOC_ADDRESS_LINE_1
				  *TODO MAPPING NOT SURE
				  */
				 //if(checkString(objDBaaS.getPejLocAddressLine1()))objOsc.set(factory.createLocationCCountyC(objDBaaS.getProjLocCounty()));
				 /**
				  * PRJ_LOC_CITY
				  */
				 objOsc.setCityC(factory.createLocationCCityC(objDBaaS.getPrjLocCity()));
				 /**
				  * PRJ_LOC_ADDRESS_LINE_1
				  *TODO MAPPING NOT SURE
				  */
				 //if(checkString(objDBaaS.getPrjLocStateProvCode()))objOsc.set(factory.createLocationCCityC(objDBaaS.getPrjLocCity()));
				 /**
				  *TODO MAPPING NOT SURE
				  *..PRJ_LOC_POSTAL
				  *..PRJ_LOC_COUNTRY_CODE
				  */
				 objListOsc.add(objOsc);
			}
			 
		 }
	}
	
	/**
	 * 
	 * @param objFrmDBaaS
	 * @param objFrmOsc
	 * @throws Exception
	 */
	private void setSubCons(Project objFrmDBaaS, ProjectsC objFrmOsc) throws Exception {
		List<ProjectSubcons> objListDBaaS = objFrmDBaaS.getProjectSubconsList(); 
		 if(objListDBaaS!=null && !objListDBaaS.isEmpty()){
			 List<SubconsultantC> objListOsc = objFrmOsc.getSubconsultantCollectionCs(); 
			 for (ProjectSubcons  objDBaaS : objListDBaaS) {
				 SubconsultantC objOsc = factory.createSubconsultantC();
				 if(objDBaaS.getSubconsultantId()!=null){
					 
					 /**
					  * We will Query Account With EBS Account Id for Classification 
					  */
					 
					 /**
					  * Account Specific Details
					  */
					 	Account a = setAccount(objFrmDBaaS, objDBaaS);
					  if(!"CREATE".equalsIgnoreCase(objDBaaS.getOperation())){
						  objOsc.setId(objDBaaS.getProjectSubConOscId());
					  }
					  /**
					   * Subconsultant Id
					   */
					  if(objDBaaS.getSubconsultantId()!=null)objOsc.setSubconsultantIdC(factory.createSubconsultantCSubconsultantIdC(String.valueOf(objDBaaS.getSubconsultantId())));
					  /**
					   * Subconsultant Id Mapped to Record Name
					   */
					  objOsc.setRecordName(objDBaaS.getSubconsultantId().toString());
					  /**
					   * Subconsultant Services
					   */
					  objOsc.setSubconsultantServicessC(factory.createSubconsultantCSubconsultantServicessC(objDBaaS.getSubconsultantServices()));
					  /**
					   * Cost
					   */
					  if(checkLong(objDBaaS.getCosts())){
						  objOsc.setActualCostUSDC(factory.createSubconsultantCActualCostUSDC(getAmount(objDBaaS.getCosts())));
					  }
					  /**
					   * Account Name
					   */
					  objOsc.setCompanyC(a.getPartyUniqueName());
					  /**
					   * Classification
					   */
					  if(a.getOrganizationDEOClassificationC()!=null && checkString(a.getOrganizationDEOClassificationC().getValue()))objOsc.setCompanyClassificationssC(factory.createSubconsultantCCompanyClassificationC(a.getOrganizationDEOClassificationC().getValue()));
					  /**
					   * Account Id
					   */
					  objOsc.setCompanyIdC(BigDecimal.valueOf(a.getPartyId()));
					  
					 }else{
						 throw new Exception("Project Sub Cons:Company Id  is a rquired fiels, and its null from DBaaS: Project Id:"+objFrmDBaaS.getProjecId()+",Child Id: "+ objDBaaS.getSubconsultantId());
					 }
				 objListOsc.add(objOsc);
			}
			 
		 }
	}



	private Account setAccount(Project objFrmDBaaS, ProjectSubcons objDBaaS) throws FusionException, Exception {
		Account a =null;
		 if(objFrmDBaaS.getEbsAccountId()!=null){
			  a =	getAccount(objFrmDBaaS.getEbsAccountId());
			 if(a==null){
				 throw new Exception("EBS Account Id in Subconsultant child with project id:"+objDBaaS.getProjectId()+" and Subconsultant id:"+objDBaaS.getSubconsultantId()+"was not found in OSC");
			 }
		 }else{
			 throw new Exception("EBS Account Id in Subconsultant child with project id:"+objDBaaS.getProjectId()+" and Subconsultant id:"+objDBaaS.getSubconsultantId()+"cannot be null");
		 }
		return a;
	}



	private Account getAccount(Long ebsAccountId) throws FusionException {
		if(ebsAccountId!=null){
			try {
				
				BaseObject bo = new BaseObject();
				bo.setFetchSize(1);
				bo.setFetchStart(0);
				bo.setViewCriteriaAttributeName(ICompanyConstants.ACCOUNT_FIELD_EBS_ACCOUNT_ID);
				bo.setOperator(Constants.FUSION_EQUALS_OPERATOR);
				bo.setViewCriteriaAttributeValue(ebsAccountId.toString());
				List<String> attribList = new ArrayList<String>();
				attribList.add("PartyId");
				attribList.add("OrganizationDEO_CompanyClassification_c");
				attribList.add("PartyUniqueName");
				bo.setListOfAttribute(attribList);
				Account account = accountServ.find(bo); 
				if(account!=null){
					return account;
				}
				
			} catch (Exception e) {
				log.error("Error occured while fetching account get subconultant details with account id:"+ebsAccountId);
				throw new FusionException("Error occured while fetching account get subconultant details with account id:"+ebsAccountId,e);
			}
		}
		return null;
		
	}

	private boolean checkDate(Date date) {
		return date!=null;
	}

	private boolean checkLong(Long value) {
		return value!=null;
	}

	private AmountType getAmount(Long value) {
		AmountType a = new AmountType();
		  a.setValue(BigDecimal.valueOf(value));
		  return a;
	}

	
	private XMLGregorianCalendar getFusionDate(Date date) {
		Timestamp currentTimestamp = new Timestamp((date).getTime());
		String currentTimeAsString = DateUtils.formatGivenTimestampToFusionFormat(currentTimestamp);
		return DateUtils.getXMLGregorianCalendar(currentTimeAsString);
	}



	private boolean checkString(String value) {
		return value!=null && StringUtils.isNotBlank(value);
	}



	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	private SalesCustomObjectService getPublicService() throws Exception{
		SalesCustomObjectService_Service service = new SalesCustomObjectService_Service();
		SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
		SalesCustomObjectService publisService = service.getSalesCustomObjectServiceSoapHttpPort(securityFeatures); 
		setWSBindingProvider(publisService, "https://caye-test.crm.us2.oraclecloud.com:443/opptyMgmtExtensibility/SalesCustomObjectService");
		return publisService;
	}

	
	//TODO: DATALOAD TEMP

	@Override
	public Object mergeForDataload(Object o) throws FusionException {
		if(o!=null){
			try {
				Project projFromDBaaS  = (Project) o;
				SalesCustomObjectService publisService = getPublicService();
				ProjectsC projForOSC = factory.createProjectsC();
				projForOSC.setId(projFromDBaaS.getOscProjectId());
				projForOSC.setRecordName(String.valueOf(projFromDBaaS.getProjecId()));
				projForOSC.setEBSProjectNumberC(factory.createProjectsCEBSProjectNumberC(projFromDBaaS.getProjectNumber()));
				publisService.mergeEntity(projForOSC,IProjectConstants.PROJECT_CUSTOM_OBJECT_NAME);
				
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}
	
	//TODO: DATALOAD TEMP
	@Override
	public Object createForDataload(Object o) throws FusionException {
		if(o!=null){
			try {
				Project projFromDBaaS  = (Project) o;
				SalesCustomObjectService publisService = getPublicService();
				ProjectsC projForOSC = factory.createProjectsC();
				if(projFromDBaaS.getProjecId()!=null)projForOSC.setRecordName(projFromDBaaS.getProjecId().toString());
				setProjectFields(projForOSC,projFromDBaaS);
				publisService.createEntity(projForOSC,IProjectConstants.PROJECT_CUSTOM_OBJECT_NAME);
				
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}
}