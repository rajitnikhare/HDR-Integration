package com.hdr.sync.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.exception.FusionException;
import com.hdr.model.BaseObject;
import com.hdr.model.Employee;
import com.hdr.model.EmployeeCredentials;
import com.hdr.model.EmployeeEducation;
import com.hdr.model.EmployeeProjects;
import com.hdr.model.EmployeePublicationsNPresentations;
import com.hdr.model.EmployeeTraining;
import com.hdr.service.DbUtilityServ;
import com.hdr.service.EmployeeServ;
import com.hdr.service.EntityService;
import com.hdr.sync.SyncObject;
import com.hdr.util.Constants;
import com.hdr.util.Constants.HDR_OPERATION;
import com.hdr.ws.stubs.customeObject.EducationC;
import com.hdr.ws.stubs.customeObject.EmployeeProjectsC;
import com.hdr.ws.stubs.customeObject.EmployeesC;
import com.hdr.ws.stubs.customeObject.LicensesCertificationsC;
import com.hdr.ws.stubs.customeObject.PresentationsC;
import com.hdr.ws.stubs.customeObject.TrainingC;

@Repository("syncEmployeeODSToOSC")
@Service
public class SyncEmployeeODSToOSC implements SyncObject {
	/**
	 * Registering Logger for SyncCompanyObject.class
	 */
	private static final Logger log = Logger.getLogger(SyncEmployeeODSToOSC.class);

	@Resource
	private EmployeeServ employeeWS;

	@Resource
	private DbUtilityServ dbutil;

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

		List<Employee> employeeHeaderList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_HEADER);
		/**
		 * We will query child object only if we have a ready parent account. It
		 * is assumed that if a child has an update the parent will also come in
		 * the header table no matter if there is any update in header or not
		 */
		if (employeeHeaderList != null && employeeHeaderList.size() > 0) {
			for (Employee p : employeeHeaderList) {
				dbutil.updateDbStatus(p, Constants.SYNC_STATUS.IN_PROGRESS.getVal(), null);
				try {
					Long empId = p.getEmployeeId();
					if (empId == null) {
						throw new Exception("Employee Id is null for this records");
					}
					/**
					 * We will query Oracle Sales Cloud to See if this employee
					 * header is present
					 * 
					 */
					Object out = employeeWS.find(getQueryParam(String.valueOf(empId)));

					if (out != null) {
						//UPDATE
						EmployeesC empOSC = (EmployeesC)out;
						Employee preparedEmployee = prepareChildListWithSuitableOperation(p,empOSC,"UPDATE");
						p.setOscId(((EmployeesC)out).getId());
						employeeWS.merge(preparedEmployee);
					} else {
						//CREATE
						Employee preparedEmployee = prepareChildListWithSuitableOperation(p,null,"CREATE");
						employeeWS.create(preparedEmployee);
					}
					dbutil.updateDbStatus(p, Constants.SYNC_STATUS.COMPLETED.getVal(), null);
				} catch (Exception e) {
					dbutil.updateDbStatus(p, Constants.SYNC_STATUS.ERROR.getVal(), null);
					log.error("Error occured while preparing child", e);
					throw e;
					// Error Handling Happens here

				}

			}

		}

	}

	private Employee prepareChildListWithSuitableOperation(Employee p, EmployeesC empOSC, String operation) throws Exception {
		try {
			/**
				select * from XXHDR_IN_EMPLOYEE_CRED_STG  
			 */
			/**
			 * Employee Project
			 * XXHDR_IN_EMPLOYEE_PROJECTS_STG
			 */
			getEmployeeProject(p, operation,empOSC);
			/**
			 * Employee Training
			 * XXHDR_IN_EMPLOYEE_TRN_S
			 */
			getEmployeeTraining(p, operation,empOSC);
			/**
			 * 
			 * Employee Publication And Presentation
			 * XXHDR_IN_EMPLOYEE_PUB_PRE_STG
			 */
			getEmployeePubAndPresent(p, operation,empOSC);
			/**
			 * Employee Credential
			 */
			//TODO: WORK IN PROGRESS
			getEmployeeCredential(p, operation,empOSC);
			/**
			 *Employee Education 
			 *XXHDR_IN_EMPLOYEE_EDU_STG
			 */
			getEmployeeEducation(p, operation,empOSC);
			
		} catch (Exception e) {
			throw new Exception("Error occurred while preparing child objects for Employee",e);
		}
		
		return p;
	}
	
	
	/**
	 * Employee Credential
	 * @param p
	 * @param operation
	 * @param empOSC 
	 * @throws Exception
	 * @throws FusionException
	 *///WORKING
	private void getEmployeeCredential(Employee p, String operation, EmployeesC empOSC) throws Exception, FusionException {
		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		List<EmployeeCredentials> finalDBList = null;
		List<LicensesCertificationsC> lFromOSC = null;
		Map<String, BigDecimal> childIdMap = null;
		
		List<EmployeeCredentials> dblist = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_CREDENTIALS, new Object[]{p.getEmployeeId()},100);
		/**
		 * MyChange
		 */
		/**
		 * EXPIRES
		   OUTSIDE_USA_PROVINCE_OR_STATE
		   STATE_USA
		   LICENSE_CERT_NUMBER
		   CREDENTIAL_DESC
		 */
		if(dblist!=null && dblist.size()>0){
			finalDBList = new ArrayList<EmployeeCredentials>();
			if("UPDATE".equalsIgnoreCase(operation)){
				lFromOSC = empOSC.getLicensesCertificationsCollectionCs();
				childIdMap =  new HashMap<String, BigDecimal>();
				for (LicensesCertificationsC objOSC : lFromOSC) {
					
					
				 if(objOSC.getExpiresC()!=null && objOSC.getExpiresC().getValue()!=null &&  objOSC.getStateC()!=null &&  objOSC.getStateC().getValue()!=null &&  objOSC.getStateUSAC()!=null &&  objOSC.getStateUSAC().getValue()!=null && objOSC.getLicenceCertNumberC()!=null && objOSC.getLicenceCertNumberC().getValue()!=null && objOSC.getRecordName()!=null){
					 XMLGregorianCalendar formattedExpiresDate =	objOSC.getExpiresC().getValue(); 
					 
					 String strinfExpiredDate = sdf.format(formattedExpiresDate.toGregorianCalendar().getTime());
					 String   state = objOSC.getStateC().getValue();
					 String stateUsa =  objOSC.getStateUSAC().getValue();
					 String licenceCertNumber = objOSC.getLicenseCertNumberC().getValue();
					 String credentialDesc =  objOSC.getRecordName(); 
					 String cPrimiaryKey = strinfExpiredDate+"#"+state+"#"+stateUsa+"#"+licenceCertNumber+"#"+credentialDesc;
					 if(cPrimiaryKey!=null){
							childIdMap.put(cPrimiaryKey,objOSC.getId());
						}
				 }
				}
			}
		}
		/**
		 * MyChange
		 */
			
		while (dblist!=null && dblist.size()>0){
			for (EmployeeCredentials eP : dblist) {
				dbutil.updateDbStatus(eP,Constants.SYNC_STATUS.IN_PROGRESS.getVal(), null);
				if("CREATE".equalsIgnoreCase(operation)){
					eP.setOperation(operation);
				}else if("UPDATE".equalsIgnoreCase(operation)){
					//Strategize for Child object
					
					/**
					 * EXPIRES
					   OUTSIDE_USA_PROVINCE_OR_STATE
					   STATE_USA
					   LICENSE_CERT_NUMBER
					   CREDENTIAL_DESC
					 */
					if(eP.getExpires()!=null && eP.getOutsideUsaProvinceOrState()!= null && eP.getStateUsa()!=null && eP.getLicenseCertNumber()!=null && eP.getCredentialDesc()!=null ){
						String strindDbExpiresDate = sdf.format(eP.getExpires());
						String cPrimiaryKeyDb = strindDbExpiresDate+"#"+eP.getOutsideUsaProvinceOrState()+"#"+eP.getStateUsa()+"#"+eP.getLicenseCertNumber()+"#"+eP.getCredentialDesc();
						if(cPrimiaryKeyDb!=null){
							if(childIdMap!=null && childIdMap.get(cPrimiaryKeyDb)!=null){
								eP.setOscCredentialId(childIdMap.get(cPrimiaryKeyDb));;
								eP.setOperation(HDR_OPERATION.UPDATE.toString());
								finalDBList.add(eP);
							}else{
								eP.setOscCredentialId(null);
								eP.setOperation(HDR_OPERATION.CREATE.toString());
								finalDBList.add(eP);
							}
						}
					}
				}
			}
			dblist = null;
			dblist = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_CREDENTIALS, new Object[]{p.getEmployeeId()},100);
		}
		p.setEmployeeCredentials(finalDBList);
	}
	
	
	
	/**
	 * Employee Education
	 * @param p
	 * @param operation
	 * @param empOSC 
	 * @throws Exception
	 * @throws FusionException
	 */
	private void getEmployeeEducation(Employee p, String operation, EmployeesC empOSC) throws Exception, FusionException {
		List<EmployeeEducation> finalDBList = null;
		List<EducationC> lFromOSC = null;
		Map<String, BigDecimal> childIdMap = null;
		
		List<EmployeeEducation> dblist = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_EDUCATION, new Object[]{p.getEmployeeId()},100);
		/**
		 * My Change
		 */
		if(dblist!=null && dblist.size()>0){
			finalDBList = new ArrayList<EmployeeEducation>();
			if("UPDATE".equalsIgnoreCase(operation)){
				lFromOSC = empOSC.getEducationCollectionCs();
				childIdMap =  new HashMap<String, BigDecimal>();
				for (EducationC objOSC : lFromOSC) {
					/**
					 * EDUCATION_TYPE_CODE
					EDUCATION_MAJOR_CODE
					GRADUATED_YN
					INSTITUTION_CODE
					COUNTRY
					STATE_PROVINCE
					 */
					String flag  = "FALSE";
					if(objOSC.isDegreeCompletedC()){
						 flag = "TRUE";
					}
					if(objOSC.getEducationTypeCodeC()!=null && objOSC.getEducationTypeCodeC().getValue()!=null && objOSC.getMajorC()!=null && objOSC.getMajorC().getValue()!=null && objOSC.getCountryC()!=null && objOSC.getCountryC().getValue()!=null && objOSC.getStatesProvincesC()!=null && objOSC.getStatesProvincesC().getValue()!=null ){
						String pCompositeKeyOSC = objOSC.getEducationTypeCodeC().getValue()+"#"+objOSC.getMajorC().getValue()+"#"+flag+"#"+objOSC.getRecordName()+"#"+objOSC.getCountryC().getValue()+"#"+objOSC.getStatesProvincesC().getValue();
						childIdMap.put(pCompositeKeyOSC,objOSC.getId());
					}
				}
			}
		}
		/**
		 * My Change
		 */
		while (dblist!=null && dblist.size()>0){
			for (EmployeeEducation eP : dblist) {
				dbutil.updateDbStatus(eP,Constants.SYNC_STATUS.IN_PROGRESS.getVal(), null);
				if("CREATE".equalsIgnoreCase(operation)){
					eP.setOperation(operation);
				}else if("UPDATE".equalsIgnoreCase(operation)){
					//Strategize for Child object
					
					/**
					 * EDUCATION_TYPE_CODE
					EDUCATION_MAJOR_CODE
					GRADUATED_YN
					INSTITUTION_CODE
					COUNTRY
					STATE_PROVINCE
					 */
					if(eP.getEducationTypeCode()!=null && eP.getEducationMajorCode()!=null && eP.getGraduatedYn()!=null && eP.getInstitutionCode()!=null && eP.getCountry()!=null && eP.getState()!=null){
						String flagDb  = "FALSE";
						if("Y".equalsIgnoreCase(eP.getGraduatedYn())){
							flagDb = "TRUE";
						}
						String pCompositeKeyDB = eP.getEducationTypeCode()+"#"+eP.getEducationMajorCode()+"#"+flagDb+"#"+eP.getInstitutionCode()+"#"+eP.getCountry()+"#"+eP.getState();
						if(childIdMap!=null && childIdMap.get(pCompositeKeyDB)!=null){
							eP.setOscEducationId(childIdMap.get(pCompositeKeyDB));
							eP.setOperation(HDR_OPERATION.UPDATE.toString());
							finalDBList.add(eP);
						}else{
							eP.setOscEducationId(null);
							eP.setOperation(HDR_OPERATION.CREATE.toString());
							finalDBList.add(eP);
						}
						
					}else{
						throw new Exception("Primary Key cannot be blank in the child Education of employee");
					}
				}
			}
			dblist = null;
			dblist = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_EDUCATION, new Object[]{p.getEmployeeId()},100);
		}
		p.setEmployeeEducationList(finalDBList);
	}
	
	
	
	/**
	 * Employee Publication And Presentation
	 * @param p
	 * @param operation
	 * @param empOSC 
	 * @throws Exception
	 * @throws FusionException
	 */
	private void getEmployeePubAndPresent(Employee p, String operation, EmployeesC empOSC) throws Exception, FusionException {
		List<EmployeePublicationsNPresentations> finalDBList = null;
		List<PresentationsC> lFromOSC = null;
		Map<String, BigDecimal> childIdMap = null;
		List<EmployeePublicationsNPresentations> dblist = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_PUBLICATIONSPRESENTATIONS, new Object[]{p.getEmployeeId()},100);
		/**
		 * MyChange
		 */
		if(dblist!=null && dblist.size()>0){
			finalDBList = new ArrayList<EmployeePublicationsNPresentations>();
			if("UPDATE".equalsIgnoreCase(operation)){
				lFromOSC = empOSC.getPresentationsCollectionCs();
				childIdMap =  new HashMap<String, BigDecimal>();
				for (PresentationsC objOSC : lFromOSC) {
					if(objOSC.getRecordName()!=null){
						childIdMap.put(objOSC.getRecordName(),objOSC.getId());
					}
				}
			}
			
			
		}
		/**
		 * MyChange
		 */
		while (dblist!=null && dblist.size()>0){
			for (EmployeePublicationsNPresentations eP : dblist) {
				dbutil.updateDbStatus(eP,Constants.SYNC_STATUS.IN_PROGRESS.getVal(), null);
				if("CREATE".equalsIgnoreCase(operation)){
					eP.setOperation(operation);
				}else if("UPDATE".equalsIgnoreCase(operation)){
					//Strategize for Child object
					if(eP.getPubPresentId()!=null){
						if(childIdMap!=null && childIdMap.get(String.valueOf(eP.getPubPresentId()))!=null){
							eP.setOscId(childIdMap.get(String.valueOf(eP.getPubPresentId())));
							eP.setOperation(HDR_OPERATION.UPDATE.toString());
							finalDBList.add(eP);
						}else{
							eP.setOscId(null);
							eP.setOperation(HDR_OPERATION.CREATE.toString());
							finalDBList.add(eP);
						}
						
						
					}else{
						throw new Exception("Presentaion Id cannot be blank in the child Publication And Presentation of employee");
					}
				}
			}
			dblist = null;
			dblist = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_PUBLICATIONSPRESENTATIONS, new Object[]{p.getEmployeeId()},100);
		}
		p.setEmployeePublicationsPresentations(finalDBList);
	}
	
	
	/**
	 * Employee Training
	 * @param p
	 * @param operation
	 * @param empOSC 
	 * @throws Exception
	 * @throws FusionException
	 */
	private void getEmployeeTraining(Employee p, String operation, EmployeesC empOSC) throws Exception, FusionException {
		List<EmployeeTraining> finalDBList = null;
		List<TrainingC> lFromOSC = null;
		Map<String, BigDecimal> childIdMap = null;
		List<EmployeeTraining> dblist = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_TRAINING, new Object[]{p.getEmployeeId()},100);
		/**
		 * My Change
		 */
		if(dblist!=null && dblist.size()>0){
			finalDBList = new ArrayList<EmployeeTraining>();
			if("UPDATE".equalsIgnoreCase(operation)){
				lFromOSC = empOSC.getTrainingCollectionCs();
				childIdMap =  new HashMap<String, BigDecimal>();
				for (TrainingC objOSC : lFromOSC) {
					if(objOSC.getRecordName()!=null && objOSC.getTrainingTypeCodeC()!=null && objOSC.getTrainingTypeCodeC().getValue()!=null){
						String pCompositePrimaryKey = objOSC.getRecordName()+"#"+objOSC.getTrainingTypeCodeC().getValue();
						childIdMap.put(pCompositePrimaryKey,objOSC.getId());
					}
				}
			}
		} 
		/**
		 * My Change
		 */
		while (dblist!=null && dblist.size()>0){
			for (EmployeeTraining eP : dblist) {
				dbutil.updateDbStatus(eP,Constants.SYNC_STATUS.IN_PROGRESS.getVal(), null);
				if("CREATE".equalsIgnoreCase(operation)){
					eP.setOperation(operation);
				}else if("UPDATE".equalsIgnoreCase(operation)){
					if(eP.getTrainingSessionId()!=null && eP.getTrainingTypeCode()!=null && eP.getEmployeeId()!=null){
					 String pCompositePrimaryKeyDb = String.valueOf(eP.getTrainingSessionId())+"#"+eP.getTrainingTypeCode();
					 if(childIdMap!=null && childIdMap.get(pCompositePrimaryKeyDb)!=null){
							eP.setOscTrainingId(childIdMap.get(pCompositePrimaryKeyDb));
							eP.setOperation(HDR_OPERATION.UPDATE.toString());
							finalDBList.add(eP);
						}else{
							eP.setOscTrainingId(null);
							eP.setOperation(HDR_OPERATION.CREATE.toString());
							finalDBList.add(eP);
						}
					}else{
						throw new Exception("Primary Key Id cannot be blank in the child Training of employee");
					}
				}
			}
			dblist = null;
			dblist = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_TRAINING, new Object[]{p.getEmployeeId()},100);
		}
		p.setEmployeeTraining(finalDBList);
	}
	
	
	
	private void getEmployeeProject(Employee p, String operation, EmployeesC empOSC) throws Exception, FusionException {
		List<EmployeeProjects> empProjDBList = null;
		List<EmployeeProjectsC> lFromOSC = null;
		Map<String, BigDecimal> childIdMap = null;
		List<EmployeeProjects> eProjList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_PROJECTS, new Object[]{p.getEmployeeId()},100);
		/**
		 * MyChange
		 */
		if(eProjList!=null && eProjList.size()>0){
			empProjDBList = new ArrayList<EmployeeProjects>();
			if("UPDATE".equalsIgnoreCase(operation)){
				lFromOSC = empOSC.getEmployeeProjectsCollectionCs();
				childIdMap =  new HashMap<String, BigDecimal>();
				for (EmployeeProjectsC objOSC : lFromOSC) {
					if(objOSC.getEBSProjectIDC()!=null && objOSC.getEBSProjectIDC().getValue()!=null){
						childIdMap.put(objOSC.getEBSProjectIDC().getValue(),objOSC.getId());
					}
				}
			}
		}
		/**
		 * MyChange
		 */
		while (eProjList!=null && eProjList.size()>0){
			for (EmployeeProjects eP : eProjList) {
				dbutil.updateDbStatus(eP,Constants.SYNC_STATUS.IN_PROGRESS.getVal(), null);
				if("CREATE".equalsIgnoreCase(operation)){
					eP.setOperation(operation);
				}else if("UPDATE".equalsIgnoreCase(operation)){
					//Strategize for Child object
					//Object out =employeeWS.findEmployeeChild(getChildQueryParam(eP,"Employees_Id_c","RecordName",null,null,"EmployeeProjects_c"));
					if(eP.getProjectId()!=null){
						if(childIdMap!=null && childIdMap.get(String.valueOf(eP.getProjectId()))!=null){
							eP.setOscEmployeeProjectId(childIdMap.get(String.valueOf(eP.getProjectId())));
							eP.setOperation(HDR_OPERATION.UPDATE.toString());
							empProjDBList.add(eP);
						}else{
							eP.setOscEmployeeProjectId(null);
							eP.setOperation(HDR_OPERATION.CREATE.toString());
							empProjDBList.add(eP);
						}
						
					}else{
						throw new Exception("Project Id cannot be blank in the chile project of employee");
					}					
				}
			}
			eProjList = null;
			eProjList = entityServiceDBaaS.findByNameQuery(Constants.GET_UNPROCESSED_EMPLOYEES_PROJECTS, new Object[]{p.getEmployeeId()},100);
		}
		p.setEmployeeProjects(empProjDBList);
	}

	private BaseObject getChildQueryParam(Object obj, String parent, String child,String child2,String child3,String childName) {
		BaseObject o = new BaseObject();
		/**
		 * Employee Project
		 */
		if(obj instanceof EmployeeProjects){
			EmployeeProjects op = (EmployeeProjects) obj;
			o.setFetchSize(1);
			o.setFetchStart(0);
			o.setOperator(Constants.FUSION_EQUALS_OPERATOR);
			o.setViewCriteriaAttributeName(parent);
			o.setViewCriteriaAttributeValue(String.valueOf(op.getEmployeeId()));
			
			o.setViewCriteriaAttributeName2(child);
			o.setViewCriteriaAttributeValue(String.valueOf(op.getProjectId()));
			o.setViewCriteriaAttributeNameInner(childName);
			List<String> attribList  = new ArrayList<String>();
			attribList.add("Id");
		}else if(obj instanceof EmployeeTraining){
			EmployeeTraining op = (EmployeeTraining) obj;
			o.setFetchSize(1);
			o.setFetchStart(0);
			o.setOperator(Constants.FUSION_EQUALS_OPERATOR);
			o.setViewCriteriaAttributeName(parent);
			o.setViewCriteriaAttributeValue(String.valueOf(op.getEmployeeId()));
			
			o.setViewCriteriaAttributeName2(child);
			o.setViewCriteriaAttributeValue(String.valueOf(op.getTrainingSessionId()));
			o.setViewCriteriaAttributeNameInner(childName);
			List<String> attribList  = new ArrayList<String>();
			attribList.add("Id");
		}else if(obj instanceof EmployeeEducation){
			//Employees_Id_c","Concentration_c","DegreeCompleted_c","Major_c
			EmployeeEducation op = (EmployeeEducation) obj;
			o.setFetchSize(1);
			o.setFetchStart(0);
			o.setOperator(Constants.FUSION_EQUALS_OPERATOR);
			o.setViewCriteriaAttributeName(parent);
			o.setViewCriteriaAttributeValue(String.valueOf(op.getEmployeeId()));
			
			o.setViewCriteriaAttributeName2(child);
			o.setViewCriteriaAttributeValue2(op.getEducationTypeCode());
			
			o.setViewCriteriaAttributeName3(child2);
			if(op.getGraduatedYn()=="Y")o.setViewCriteriaAttributeValue3("true");
			if(op.getGraduatedYn()=="N")o.setViewCriteriaAttributeValue3("false");
			
			o.setViewCriteriaAttributeName4(child3);
			o.setViewCriteriaAttributeValue4(op.getEducationMajorCode());
			
			o.setViewCriteriaAttributeNameInner(childName);
			List<String> attribList  = new ArrayList<String>();
			attribList.add("Id");
		}
		
		return o;
	}

	private BaseObject getQueryParam(String e) {
		BaseObject o = new BaseObject();
		o.setViewCriteriaAttributeName("EmployeeID_c");
		o.setOperator("=");
		o.setViewCriteriaAttributeValue(e);
		o.setFetchSize(1);
		o.setFetchStart(0);
		List<String> findAttribList = new ArrayList<String>();
		findAttribList.add("Id");
		findAttribList.add("EmployeeID_c");
		findAttribList.add("EducationCollection_c");
		findAttribList.add("EmployeeProjectsCollection_c");
		findAttribList.add("TrainingCollection_c");
		findAttribList.add("LicensesCertificationsCollection_c");
		findAttribList.add("PresentationsCollection_c");
		o.setListOfAttribute(findAttribList);
		return o;
	}

}
