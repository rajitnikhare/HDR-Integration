package com.hdr.util;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import com.hdr.constants.ICompanyConstants;
import com.hdr.constants.IErrorLogConstants;
import com.hdr.constants.IOpportunityConstants;
import com.hdr.dao.ebs.ErrorLogDao;
import com.hdr.job.impl.DeliveryProjectWonOpportunitySyncJob;
import com.hdr.job.impl.PursuitProjectOSCToEBSSyncJob;
import com.hdr.model.BaseObject;
import com.hdr.model.PursuitProject;
import com.hdr.service.CompanyServ;
import com.hdr.service.ContractServ;
import com.hdr.service.EmployeeServ;
import com.hdr.ws.stubs.accountService.Account;
import com.hdr.ws.stubs.accountService.PrimaryAddress;
import com.hdr.ws.stubs.customeObject.ContractC;
import com.hdr.ws.stubs.customeObject.EmployeesC;
import com.hdr.ws.stubs.customeObject.ServiceException;
import com.hdr.ws.stubs.opportunity.AmountType;
import com.hdr.ws.stubs.opportunity.Opportunity;

/**
 * Utility Class to do conversion between OSC Opportunity (Pursuit Project)
 * Object and Pursuit Project model (ORM) object and similar conversion
 * functions used in Opportunity OSC<>EBS Sync.
 * @author Romesh Soni
 *
 */
public class PursuitProjectMappingUtil {

	private static final Logger log = Logger
			.getLogger(PursuitProjectMappingUtil.class);

	public static List<PursuitProject> convertOSCOptiesToStagePursuitProjects(String batchKey, List<Object> lst, EmployeeServ employeeWS,CompanyServ companyWS, ContractServ contractWS,ErrorLogDao errorLogDao,boolean isDeliveryProjectInterface){
		log.info(">>convertOSCOptiesToStagePursuitProjects " + batchKey);

		if (lst == null || lst.isEmpty()) {
			log.debug("No Opportunities/Pursuit Projects to process.");
			return null;
		}

		List<PursuitProject> lstPursuitProject = new ArrayList<PursuitProject>();
		
		for (Object obj : lst) 
		{	
		
			Opportunity opty = (Opportunity) obj;
			if("Opty Test State 1".equalsIgnoreCase(opty.getName())){
				System.out.println();
			}
			try 
			{
				convertOpty(lstPursuitProject, opty, batchKey, employeeWS, companyWS, contractWS,isDeliveryProjectInterface);
				
			} catch (Exception e) {
				
				int errorMaxLength = IErrorLogConstants.MAX_LENGTH_ERROR_MSG_COLUMN;
				String emsg = ErrorMsgUtil.getErrorMsg_FixedChars_ForStagingTable(errorMaxLength, e);
				String customMsg="Error while trying to create Pursuit Project Model Object. "
						+ "Due to this error, this Opportunity/Pursuit Project will not be saved in EBS db. Trace: ";
				emsg = customMsg+emsg;
				log.error(emsg);
				String direction = IErrorLogConstants.DIRECTION_FOR_ERROR_LOG.FUSION_TO_EBS.toString();
				String objectName = IErrorLogConstants.OBJECT_NAME_FOR_ERROR_LOG.PURSUIT_PROJECT.getVal();
				String tableName = IErrorLogConstants.TABLE_NAMES.PURSUIT_PROJECT_STG.getVal();
				//you dont have a record_id when you are trying to save a record in db.
				String primaryFieldName = "OSC_OPPORTUNITY_ID";
				String primaryFieldValue = opty.getOptyId().toString();
				String className = null;
				if(isDeliveryProjectInterface)
					className=DeliveryProjectWonOpportunitySyncJob.class.getSimpleName();
				else 
					className=PursuitProjectOSCToEBSSyncJob.class.getSimpleName();
					
				errorLogDao.logSyncError(objectName
						, direction
						, emsg
						, primaryFieldName
						, primaryFieldValue
						, className
						,tableName
						);
				
			}

		}

		log.info("<<convertOSCOptiesToStagePursuitProjects");

		return lstPursuitProject;
	}

	private static void convertOpty(List<PursuitProject> lstPursuitProject,Opportunity opty,String batchKey, EmployeeServ employeeWS,CompanyServ companyWS, ContractServ contractWS,boolean isDeliveryProjectInterface) throws Exception {
		
		
		String WONSTATUS = IOpportunityConstants.OSC_OPPORTUNITY_STATUS.WON.getVal();
		
		if(!isDeliveryProjectInterface)
		{
			//skip WON Opportunities only if you are executing pursuit project osc to ebs sync.
			//for delivery project WON Opty interface, you still save the opty in ebs stage table
			if(opty.getStatusCode()!=null&&opty.getStatusCode().getValue()!=null && opty.getStatusCode().getValue().equalsIgnoreCase(WONSTATUS))
			{
				log.info("Skipping WON opty: "+ opty.getName());
				return;
			}
		}
		
		PursuitProject pursuitProject = new PursuitProject();

		pursuitProject.setBatchKey(batchKey);

		pursuitProject.setDataSource(Constants.SOURCE_TARGET.OSC.toString());
		pursuitProject.setDataTarget(Constants.SOURCE_TARGET.EBS.toString());
		
	/*	if (opty.getOperatingUnitC() != null)
			pursuitProject.setOperatingUnit(opty.getOperatingUnitC()
					.getValue());
*/

		String projectName = opty.getName();
		
		if(projectName.length()>30)
		{
			projectName = projectName.substring(0,30);
		}
		
		if (opty.getName() != null)
			pursuitProject.setProjectName(projectName);

		// TODO: FIX DESC LATER.
		if (opty.getName() != null)
			pursuitProject.setProjectDescription(opty.getName());


		if (opty.getEstimatedProjectStartDateC() != null)
			pursuitProject.setProjectStartDate(DateUtils
					.xmlGregorianCalendarToTimestamp(opty
							.getEstimatedProjectStartDateC()));

		if (opty.getEstimatedProjectEndDateC() != null)
			pursuitProject.setProjectFinishDate(DateUtils
					.xmlGregorianCalendarToTimestamp(opty
							.getEstimatedProjectEndDateC()));

		/*if (opty.getBillableCompanyIdC() != null
				&& opty.getBillableCompanyIdC().getValue() != null)
			pursuitProject.setEbsCustAcctNum(opty.getBillableCompanyIdC()
					.getValue().toString());
*/
		if (opty.getOptyId() != null)
			pursuitProject.setOscOpportunityId(opty.getOptyId().toString());

		if (opty.getMarketSectorsC() != null)
			pursuitProject.setMarketSector(opty.getMarketSectorsC());

		if (opty.getEstimatedNetFeesC() != null) {
			pursuitProject.setProposedFee(opty.getEstimatedNetFeesC()
					.getValue());
		}

		if(StringUtils.isNotBlank(opty.getBusinessUnitC()))
			pursuitProject.setBusinessUnit(opty.getBusinessUnitC());
		
		if(StringUtils.isNotBlank(opty.getDeliveryMethodC()))
				pursuitProject.setDeliveryMethod(opty.getDeliveryMethodC());
		
		
		if (opty.getWinProbabilityC() != null) {
			BigDecimal probability = new BigDecimal(
					opty.getWinProbabilityC());
			pursuitProject.setProbability(probability);
		}

		if (opty.getBusinessClassC() != null)
			pursuitProject.setBusinessClass(opty.getBusinessClassC());

		if (opty.getContractTypeC() != null&&StringUtils.isNotBlank(opty.getContractTypeC()))
			pursuitProject.setContractType(opty.getContractTypeC());

		//pursuit type logic
		setPursuitType(opty.getContractTypeC(),pursuitProject);


		if (opty.isGoNoGoC() != null)
		{
			pursuitProject.setGngCheckbox(getOSCBooleanToEBS1CharString(opty.isGoNoGoC()));
			
		}
			

		if (opty.getCreationDate() != null)
			pursuitProject
					.setCreationDate(DateUtils
							.xmlGregorianCalendarToTimestamp(opty
									.getCreationDate()));

		/**
		 * @author jeevan
		 * Dated:17-DEC-2015
		 * Timed:3:01 AM IST
		 * getMarketingChargeNumberC to Project Number not ID
		 * Updated
		 * Dated:22-DEC-2015
		 */
		if (opty.getMarketingChargeNumbersC() != null && opty.getMarketingChargeNumbersC().getValue() != null){
			pursuitProject.setProjectNumber(opty.getMarketingChargeNumbersC().getValue());
		}
		
		if (opty.getEBSPursuitProjectIdC() != null && opty.getEBSPursuitProjectIdC().getValue() != null){
			pursuitProject.setEbsProjectId(BigDecimal.valueOf(Long.valueOf(opty.getEBSPursuitProjectIdC().getValue())));
		}
			
		 
		
		
		/**
		 * @author jeevan
		 * Dated:22-DEC-2015
		 * Timed:2:21 AM IST
		 * New Field PursuitProjectNumberC was added
		 * 
		 */
		if(opty.getPursuitProjectNumberC()!=null && opty.getPursuitProjectNumberC().getValue()!=null)pursuitProject.setProjectNumber(String.valueOf(opty.getPursuitProjectNumberC().getValue()));
		
		/**
		 * @author jeevan
		 * OOB Currency was removed
		 * Dated: 06-JAN-2015
		 */
	/*	if (StringUtils.isNotBlank(opty.getCurrencyCode()))
			pursuitProject.setCurrency(opty.getCurrencyCode());*/
		/**
		 * @author jeevan
		 * Custom Currency was added
		 * Dated: 06-JAN-2015
		 */
		if(opty.getCurrencyC()!=null && StringUtils.isNotBlank(opty.getCurrencyC())){
			pursuitProject.setCurrency(opty.getCurrencyC());
		}
		

		AmountType amountTypeTotalContractCapacitys = opty
				.getTotalContractCapacitysC();
		if (amountTypeTotalContractCapacitys != null
				&& amountTypeTotalContractCapacitys.getValue() != null) {
			BigDecimal bdTotalContractCapacitys = amountTypeTotalContractCapacitys
					.getValue();
			pursuitProject
					.setTotalContractCapacity(bdTotalContractCapacitys);
		}

		if (opty.getAwardTypesC() != null)
			pursuitProject.setAwardType(opty.getAwardTypesC().getValue());

		if (opty.isNoCapacityLimitC() != null)
			pursuitProject.setNoCapacityLimit(getOSCBooleanToEBS1CharString(opty.isNoCapacityLimitC()
					));

		if (opty.isUnableToPredictC() != null)
			pursuitProject.setUnableToPredict(getOSCBooleanToEBS1CharString(opty.isUnableToPredictC()
					));

		AmountType atHDRPotentialCapacityNet = opty
				.getHDRPotentialCapacityNetsC();
		if (atHDRPotentialCapacityNet != null
				&& atHDRPotentialCapacityNet.getValue() != null) {
			BigDecimal bdHDRPotentialCapacityNet = atHDRPotentialCapacityNet
					.getValue();
			pursuitProject
					.setHdrPotentialCapacityNet(bdHDRPotentialCapacityNet);
		}

		AmountType atHDRPotentialCapacitysGross = opty
				.getHDRPotentialCapacityGrosssC();
		if (atHDRPotentialCapacitysGross != null
				&& atHDRPotentialCapacitysGross.getValue() != null) {
			BigDecimal bdHDRPotentialCapacitysGross = atHDRPotentialCapacitysGross
					.getValue();
			pursuitProject
					.setHdrPotentialCapacityGross(bdHDRPotentialCapacitysGross);
		}
		/*if (opty.getBillableCompanyIdC() != null
				&& opty.getBillableCompanyIdC().getValue() != null)
		{
			fillBillableCompanyEBSDetails(opty,pursuitProject, companyWS);
			
		}*/
		if (opty.getBillableAccountIDC() != null && opty.getBillableAccountIDC().getValue() != null)
		{
	fillBillableCompanyEBSDetails(opty,pursuitProject, companyWS);
	
		}
		
		
		//Skip opportunity if EBS Account Id not populated for Billable customer
		BigDecimal ebsAccountIdForBillableCustomer = pursuitProject.getEbsCustAcctId();
		
		if(ebsAccountIdForBillableCustomer==null)
		{
			log.info("EBS Account Id not populated for this opportunity customer. Will not save opty in Pursuit project Stag table.");
			return;
		}
		
		
		//Contract EBS ID
		if (opty.getContractNameIdC() != null && opty.getContractNameIdC().getValue() != null){
			fillMasterContractEBSDetails(opty,pursuitProject, contractWS);
		}
		
		/**
		 * @author jeevan
		 * Dated:17-Dec-2015
		 * Timed:01:12 AM
		 * Added EstBookingDate_c
		 */
		
		if(opty.getEstBookingDateC()!=null){
			pursuitProject.setExpectApprovalDate(DateUtils.xmlGregorianCalendarToTimestamp(opty.getEstBookingDateC()));
		}
		
		/**
		 * @author jeevan
		 * Dated:17-Dec-2015
		 * Timed:12:43 AM
		 * Added ProjectManagerEffectiveStart_c
		 */
		if(opty.getProjectManagerEffectiveStartC()!=null && opty.getProjectManagerEffectiveStartC().getValue()!=null){
			pursuitProject.setPmEffectiveFromDate(DateUtils.xmlGregorianCalendarToTimestamp(opty.getProjectManagerEffectiveStartC().getValue()));
		}
		
		//project manager name
		/**
		 * Project Manager Removed
		 * @author jeevan
		 * 22-DEC-2015
		 * 
		 * Project Manager Added
		 * @author jeevan
		 * 01-JAN-2016
		 */
		
		if (opty.getProjectManagersC() != null)
			pursuitProject.setProjectManager(opty.getProjectManagersC().getValue());

		
		//project manager OSC Id (employee osc id)
		if(opty.getProjectManagersIdC()!=null&&opty.getProjectManagersIdC().getValue()!=null)
		{
			pursuitProject.setProjectManagerOSCId(opty.getProjectManagersIdC().getValue());
			//fill ebs employee id
			fillProjectManagerEBSDetails(pursuitProject,employeeWS);
			
		}
		
		if(opty.getStatusCode()!=null&&opty.getStatusCode().getValue()!=null)
		  pursuitProject.setOpportunityStatus(opty.getStatusCode().getValue());
		
		if(isDeliveryProjectInterface)
		{
			//FOR DELIVERY PROJECT. UPDATE THE STATUS TO WON. AS YOU HAD DOWNLOADED THE OPTY FROM SALES CLOUD BEFORE MAKING IT TO WON
			pursuitProject.setOpportunityStatus(WONSTATUS);
		}
		
		pursuitProject.setCreationDate(new Date());
		pursuitProject.setLastUpdateDate(new Date());
		
		
		pursuitProject.setOscLastUpdateDate(
		 DateUtils.xmlGregorianCalendarToTimestamp(opty.getLastUpdateDate()));

		// fill Pursuit Leader
		//fillPursuitLeader(opty, pursuitProject);

		//note: some of the opties may dont reach to this point and may get ignored before, due to  validations 
		lstPursuitProject.add(pursuitProject);
		
		
	}

	private static String getOSCBooleanToEBS1CharString(Boolean goNoGoC) {
		
		if(goNoGoC==null)
			return null;
		else if(goNoGoC)
			return "Y";
		else
			return "N";
		
	}

	
	private static void fillMasterContractEBSDetails(Opportunity opty,
			PursuitProject pursuitProject, ContractServ contractWS) throws ServiceException {
		
		log.info(">>fillMasterContractEBSDetails");
		
		Long contractOSCId = opty.getContractNameIdC().getValue().longValue();
		BaseObject bo = new BaseObject();
		bo.setFetchStart(0);
		bo.setFetchSize(1);
		
		
		ArrayList <String>lstFindAttributes = new ArrayList<String>();
		lstFindAttributes.add("RecordName");
	
		bo.setListOfAttribute(lstFindAttributes);
		
		bo.setViewCriteriaAttributeName("Id");
		bo.setViewCriteriaAttributeValue(contractOSCId.toString());
		bo.setOperator("=");
		
		List<Object> employessList = contractWS.findContract(bo);
		
		if(employessList!=null&&!employessList.isEmpty())
		{
			ContractC Contract = (ContractC) employessList.get(0);
			if(Contract.getRecordName()!=null)
				pursuitProject.setOscMsaId(Contract.getRecordName());
		}
		
		
		log.info("<<fillMasterContractEBSDetails");
	}

	private static void setPursuitType(String contractType,
			PursuitProject pursuitProject) {
		
		log.info(">>setPursuitType");
		
		String MASTER= IOpportunityConstants.OSC_CONTRACT_TYPE.Master.getVal();
		String TASK_ORDER= IOpportunityConstants.OSC_CONTRACT_TYPE.TASK_ORDER.getVal();
		
		if(StringUtils.isNotBlank(contractType)&&contractType.equalsIgnoreCase(MASTER))
		{
			log.info("Master");
			String msa = IOpportunityConstants.EBS_PURSUIT_TYPE.MSA.getVal();
			pursuitProject.setPursuitType(msa);
		}
		else if(StringUtils.isNotBlank(contractType)&&contractType.equalsIgnoreCase(TASK_ORDER))
		{
			log.info("Task Order");
			String task = IOpportunityConstants.EBS_PURSUIT_TYPE.TASK_ORDER.getVal();
			pursuitProject.setPursuitType(task);
		}
		else
		{
			log.info("Other");
			String standard = IOpportunityConstants.EBS_PURSUIT_TYPE.STANDARD.getVal();
			pursuitProject.setPursuitType(standard);
		}
			
		
		log.info("<<setPursuitType");
	}

	private static void fillBillableCompanyEBSDetails(Opportunity opty,
			PursuitProject pursuitProject, CompanyServ companyWS) throws com.hdr.ws.stubs.accountService.ServiceException {
		
		log.info(">>fillBillableCompanyEBSDetails");
		
		String billableCompanyOSCPartyId = opty.getBillableAccountIDC().getValue();
		
		BaseObject bo = new BaseObject();
		bo.setFetchStart(0);
		bo.setFetchSize(1);
		
		
		ArrayList <String>lstFindAttributes = new ArrayList<String>();
		
		lstFindAttributes.add("OrganizationName");
		lstFindAttributes.add("PrimaryAddress");
		lstFindAttributes.add("OrganizationDEO_EBSAccountId_c");
		lstFindAttributes.add("OrganizationDEO_EBSAccountNumber_c");
		lstFindAttributes.add("ParentAccountPartyId");
		
	
		bo.setListOfAttribute(lstFindAttributes);
		
		bo.setViewCriteriaAttributeName("PartyId");
		bo.setViewCriteriaAttributeValue(billableCompanyOSCPartyId);
		bo.setOperator("=");
		
		List<Object> list = companyWS.findAccount(bo);
		
		if(list!=null&&!list.isEmpty())
		{
			Account account = (Account) list.get(0);
			//osc id
			pursuitProject.setBillableCompanyOscPartyId(billableCompanyOSCPartyId);
			
			//EBS ID (EBS_CUST_ACCT_ID) Child field
			if(account.getOrganizationDEOEBSAccountIdC()!=null&&account.getOrganizationDEOEBSAccountIdC().getValue()!=null)
				pursuitProject.setEbsCustAcctId(new BigDecimal(account.getOrganizationDEOEBSAccountIdC().getValue()));
			
			//EBS_CUST_ACCT_NUM Child field
			if(account.getOrganizationDEOEBSAccountNumberC()!=null&&account.getOrganizationDEOEBSAccountNumberC().getValue()!=null)
				pursuitProject.setEbsCustAcctNum(account.getOrganizationDEOEBSAccountNumberC().getValue());
			
			//EBS_PARTY_ID: EBS Id for parent account
			if(account.getParentAccountPartyId()!=null&&account.getParentAccountPartyId().getValue()!=null)
			{
				log.info("Parent account associated");
				
				long parentAccountOSCPartyId = account.getParentAccountPartyId().getValue();
				
				//Fill parent account detail
				fillParentAccountEBSPartyId(parentAccountOSCPartyId, pursuitProject, companyWS);
				
				
			}
			else
				log.info("Parent account not associated");
			
			//Primary Address details
			fillPrimaryAddressDetailsForBillableCompany(pursuitProject,account);
		}
		
		log.info("<<fillBillableCompanyEBSDetails");
		
	}

	private static void fillParentAccountEBSPartyId(
			Long parentAccountOSCPartyId, PursuitProject pursuitProject,
			CompanyServ companyWS) throws com.hdr.ws.stubs.accountService.ServiceException {
		
		log.info(">>fillParentAccountEBSPartyId parentAccountOSCPartyId: "+ parentAccountOSCPartyId);
		
		
		BaseObject bo = new BaseObject();
		bo.setFetchStart(0);
		bo.setFetchSize(1);
		
		
		ArrayList <String>lstFindAttributes = new ArrayList<String>();
		
		lstFindAttributes.add("OrganizationName");
		lstFindAttributes.add("OrganizationDEO_EBSPartyId_c");
		lstFindAttributes.add("OrganizationDEO_EBSRegId_c");

		bo.setListOfAttribute(lstFindAttributes);
		
		bo.setViewCriteriaAttributeName("PartyId");
		bo.setViewCriteriaAttributeValue(parentAccountOSCPartyId.toString());
		bo.setOperator("=");
		
		List<Object> list = companyWS.findAccount(bo);
		
		Account account = (Account) list.get(0);
		
		//EBS_PARTY_ID
		if(account.getOrganizationDEOEBSPartyIdC()!=null&&account.getOrganizationDEOEBSPartyIdC().getValue()!=null)
		  pursuitProject.setEbsPartyId(account.getOrganizationDEOEBSPartyIdC().getValue().toString());
		
		//REGISTRY_ID
		if(account.getOrganizationDEOEBSRegIdC()!=null&&account.getOrganizationDEOEBSRegIdC().getValue()!=null)
			pursuitProject.setRegistryId(account.getOrganizationDEOEBSRegIdC().getValue());
		
		log.info("<<fillParentAccountEBSPartyId");
		
	}

	private static void fillPrimaryAddressDetailsForBillableCompany(
			PursuitProject pursuitProject, Account account) {
		
		
		log.info(">>fillPrimaryAddressDetailsForBillableCompany");
		
		if(account.getPrimaryAddress()==null)
		{
			log.info("No primary address associated.");
			return;
		}
			
		
		PrimaryAddress primaryAddress = account.getPrimaryAddress();
		
		if(primaryAddress.getAddressLine1()!=null&&!StringUtils.isBlank(primaryAddress.getAddressLine1().getValue()))
		{
			pursuitProject.setAddress1(
			primaryAddress.getAddressLine1().getValue());	
		}
		
		if(primaryAddress.getAddressLine2()!=null&&!StringUtils.isBlank(primaryAddress.getAddressLine2().getValue()))
		{
			pursuitProject.setAddress2(
			primaryAddress.getAddressLine2().getValue());	
		}
		
		if(primaryAddress.getAddressLine3()!=null&&!StringUtils.isBlank(primaryAddress.getAddressLine3().getValue()))
		{
			pursuitProject.setAddress3(
			primaryAddress.getAddressLine3().getValue());	
		}

		if(primaryAddress.getAddressLine4()!=null&&!StringUtils.isBlank(primaryAddress.getAddressLine4().getValue()))
		{
			pursuitProject.setAddress4(
			primaryAddress.getAddressLine4().getValue());	
		}

		if(StringUtils.isNotBlank(primaryAddress.getCountry()))
				pursuitProject.setCountry(primaryAddress.getCountry());
		
		if(primaryAddress.getCity()!=null&&StringUtils.isNotBlank(primaryAddress.getCity().getValue()))
			pursuitProject.setCity(primaryAddress.getCity().getValue());
		
		if(primaryAddress.getProvince()!=null&&StringUtils.isNotBlank(primaryAddress.getProvince().getValue()))
			pursuitProject.setProvince(primaryAddress.getProvince().getValue());
		
		if(primaryAddress.getCounty()!=null && StringUtils.isNotBlank(primaryAddress.getCounty().getValue()))
			pursuitProject.setCounty(primaryAddress.getCounty().getValue());
		
		if(primaryAddress.getState()!=null&&StringUtils.isNotBlank(primaryAddress.getState().getValue())){
			pursuitProject.setState(CommonUtil.getLookUpValue(Constants.HDR_INT_OBJECT.Company.toString(), primaryAddress.getState().getValue(),primaryAddress.getState().getValue()));
		}
			
		
		if(primaryAddress.getPostalCode()!=null&&StringUtils.isNotBlank(primaryAddress.getPostalCode().getValue()))
			pursuitProject.setPostal(primaryAddress.getPostalCode().getValue());
		

		
		
		log.info("<<fillPrimaryAddressDetailsForBillableCompany");
	}

	private static void fillProjectManagerEBSDetails(
			PursuitProject pursuitProject, EmployeeServ employeeWS) throws ServiceException {
		
		Long projectManagers_Id_c = pursuitProject.getProjectManagerOSCId().longValue();
		BaseObject bo = new BaseObject();
		bo.setFetchStart(0);
		bo.setFetchSize(1);
		
		
		ArrayList <String>lstFindAttributes = new ArrayList<String>();
		lstFindAttributes.add("FullName_c");
		lstFindAttributes.add("EmployeeID_c");
	
		bo.setListOfAttribute(lstFindAttributes);
		
		bo.setViewCriteriaAttributeName("Id");
		bo.setViewCriteriaAttributeValue(projectManagers_Id_c.toString());
		bo.setOperator("=");
		
		List<Object> employessList = employeeWS.findEmployee(bo);
		if(employessList!=null&&!employessList.isEmpty())
		{
			EmployeesC employee = (EmployeesC) employessList.get(0);
			if(employee.getEmployeeIDC()!=null&&employee.getEmployeeIDC().getValue()!=null)
			{
				pursuitProject.setEbsProjMgrEmpId(employee.getEmployeeIDC().getValue());
			}
				
			
		}
	}


}
