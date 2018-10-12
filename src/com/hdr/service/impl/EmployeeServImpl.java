package com.hdr.service.impl;


import java.math.BigDecimal;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IEmployeeConstants;
import com.hdr.exception.FusionException;
import com.hdr.exception.ObjectMappingException;
import com.hdr.model.BaseObject;
import com.hdr.model.DeleteEmployeeProject;
import com.hdr.model.Employee;
import com.hdr.model.EmployeeCredentials;
import com.hdr.model.EmployeeEducation;
import com.hdr.model.EmployeeLanguage;
import com.hdr.model.EmployeeProjects;
import com.hdr.model.EmployeePublicationsNPresentations;
import com.hdr.model.EmployeeTraining;
import com.hdr.service.EmployeeServ;
import com.hdr.service.EntityService;
import com.hdr.util.Constants;
import com.hdr.util.DateUtils;
import com.hdr.util.PropFileUtil;
import com.hdr.ws.stubs.customeObject.Conjunction;
import com.hdr.ws.stubs.customeObject.EducationC;
import com.hdr.ws.stubs.customeObject.EmployeeProjectsC;
import com.hdr.ws.stubs.customeObject.EmployeesC;
import com.hdr.ws.stubs.customeObject.FindControl;
import com.hdr.ws.stubs.customeObject.FindCriteria;
import com.hdr.ws.stubs.customeObject.LicensesCertificationsC;
import com.hdr.ws.stubs.customeObject.ObjectFactory;
import com.hdr.ws.stubs.customeObject.PresentationsC;
import com.hdr.ws.stubs.customeObject.SalesCustomObjectService;
import com.hdr.ws.stubs.customeObject.SalesCustomObjectService_Service;
import com.hdr.ws.stubs.customeObject.ServiceException;
import com.hdr.ws.stubs.customeObject.TrainingC;
import com.hdr.ws.stubs.customeObject.ViewCriteria;
import com.hdr.ws.stubs.customeObject.ViewCriteriaItem;
import com.hdr.ws.stubs.customeObject.ViewCriteriaRow;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;


/**Sales Cloud Web service Handler class for "Employees_c" Custom Object.
 * @author Romesh Soni
 *
 */
@Service
@Repository("employeeServimpl")
public class EmployeeServImpl extends AbstractFCRMODWebService implements EmployeeServ 
{
	private static final Logger log = Logger.getLogger(EmployeeServImpl.class);
	private static final com.hdr.ws.stubs.customeObject.ObjectFactory factory =  new ObjectFactory();
	
	@Resource(name = "entityServiceImplDBaaS")
	private EntityService entityServiceDBaaS;
	
	
	@Override
	public List<Object> findEmployee(BaseObject bo) throws ServiceException
	{
		log.info(">>findEmployee");
		
		SalesCustomObjectService service = getService();

		FindCriteria findCriteria = new FindCriteria();
		FindControl findControl = new FindControl();
		findCriteria.setFetchSize(bo.getFetchSize());
		findCriteria.setFetchStart(bo.getFetchStart());
		findCriteria.getFindAttributes().addAll(bo.getListOfAttribute());
		
		ViewCriteriaItem criteriaItemHeader = new ViewCriteriaItem();
		criteriaItemHeader.setConjunction(Conjunction.AND);
		criteriaItemHeader.setUpperCaseCompare(false);
		criteriaItemHeader.setAttribute(bo.getViewCriteriaAttributeName());
		criteriaItemHeader.setOperator(bo.getOperator());
		criteriaItemHeader.getValues().add(bo.getViewCriteriaAttributeValue());

		
		ViewCriteriaRow viewCriteriaRowHeader = new ViewCriteriaRow();
		viewCriteriaRowHeader.setConjunction(Conjunction.AND);
		viewCriteriaRowHeader.setUpperCaseCompare(false);
		viewCriteriaRowHeader.getItems().add(criteriaItemHeader);
		
		
		
		ViewCriteria criteriaHeader = new ViewCriteria();
		criteriaHeader.setConjunction(Conjunction.AND);
		criteriaHeader.getGroups().add(viewCriteriaRowHeader);
		
		
		
		findCriteria.setFilter(criteriaHeader);
		findCriteria.setExcludeAttribute(false);
		findControl.setRetrieveAllTranslations(true);
		
		
		 List<Object> employessList=service.findEntity(findCriteria,
				  findControl, IEmployeeConstants.EMPLOYEE_CUSTOM_OBJECT_NAME); 
		 
		 if(employessList!=null&&!employessList.isEmpty())
		 {
			 log.info("Employee(s) found.");
		 }
		 else
			 log.info("No employee(s) found.");
		
		
		
		log.info("<<findEmployee");
		
		return employessList;
	}
	
	

	
	public SalesCustomObjectService getService()
	{
		SalesCustomObjectService_Service objectService_Service = new SalesCustomObjectService_Service();
		SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
		SalesCustomObjectService service = objectService_Service.getSalesCustomObjectServiceSoapHttpPort(securityFeatures);
		System.out.println("End Point Url : "+PropFileUtil.getValue(Constants.FCRMOD_SALES_CUSTOM_OBJECT_URL));
		setWSBindingProvider(service,PropFileUtil.getValue(Constants.FCRMOD_SALES_CUSTOM_OBJECT_URL));
		return service;
	}
	
	//Nagesh Code Starts from here
	@Override
	public Object findEmployeeChild(BaseObject o) throws FusionException {
		if(o!=null){
			try {
				SalesCustomObjectService publicService = getService();
				
				
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
				  criteriaItemB.setOperator(o.getOperator());
				  criteriaItemB.getValues().add(o.getViewCriteriaAttributeValue2());
				  
				  
				  
				  ViewCriteriaRow criteriaRowC =null;
				  if(o.getViewCriteriaAttributeName3()!=null){
					  
					  ViewCriteriaItem criteriaItemC = new ViewCriteriaItem();
					  criteriaItemC.setConjunction(Conjunction.AND);
					  criteriaItemC.setAttribute(o.getViewCriteriaAttributeName3());
					  criteriaItemC.setOperator(o.getOperator());
					  criteriaItemC.getValues().add(o.getViewCriteriaAttributeValue3());
					  
					  criteriaRowC = new ViewCriteriaRow();
					  criteriaRowC.setConjunction(Conjunction.AND);
					  criteriaRowC.getItems().add(criteriaItemC);
					  
					  
				  }
				  ViewCriteriaRow criteriaRowD =null;
				  if(o.getViewCriteriaAttributeName4()!=null){
					  ViewCriteriaItem criteriaItemD = new ViewCriteriaItem();
					  criteriaItemD.setConjunction(Conjunction.AND);
					  criteriaItemD.setAttribute(o.getViewCriteriaAttributeName4());
					  criteriaItemD.setOperator(o.getOperator());
					  criteriaItemD.getValues().add(o.getViewCriteriaAttributeValue4());
					  
					  criteriaRowD = new ViewCriteriaRow();
					  criteriaRowD.setConjunction(Conjunction.AND);
					  criteriaRowD.getItems().add(criteriaItemD);
				  }
				  
				  
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
				  
				  if(criteriaRowC!=null){
					  criteria.getGroups().add(criteriaRowC);
				  }
				  
				  if(criteriaRowD!=null){
					  criteria.getGroups().add(criteriaRowD);
				  }
				  
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
	public Object find(BaseObject o) throws FusionException {
		if(o!=null){
			try {
				  SalesCustomObjectService publicService =getService();
				  
				  FindCriteria findCriteria = new FindCriteria();
				  findCriteria.setExcludeAttribute(false);
				  findCriteria.setFetchSize(o.getFetchSize());
				  findCriteria.setFetchStart(o.getFetchStart());
				  findCriteria.getFindAttributes().addAll(o.getListOfAttribute());
				  
				  FindControl findControl = new FindControl();
				  findControl.setRetrieveAllTranslations(false);
				  
				  
				  ViewCriteriaItem criteriaItem = new ViewCriteriaItem();
				  criteriaItem.setConjunction(Conjunction.AND);
				  criteriaItem.setAttribute(o.getViewCriteriaAttributeName());
				  criteriaItem.setOperator(o.getOperator());
				  criteriaItem.getValues().add(o.getViewCriteriaAttributeValue());
				  
				  ViewCriteriaRow criteriaRow = new ViewCriteriaRow();
				  criteriaRow.setConjunction(Conjunction.AND);
				  criteriaRow.getItems().add(criteriaItem);
				  
				  ViewCriteria criteria = new ViewCriteria();
				  criteria.setConjunction(Conjunction.AND);
				  criteria.getGroups().add(criteriaRow);
				  
				  findCriteria.setFilter(criteria);
				  
				  List<Object> out = publicService.findEntity(findCriteria, findControl, IEmployeeConstants.EMPLOYEE_CUSTOM_OBJECT_NAME);
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
	public Employee create(Employee oDb) throws FusionException {
		log.debug(">>createEmployee");		
		
		if(oDb!=null){
			try {
				 	log.debug(">>createEmployee");
				 	log.debug(">>mergeEmployee");
					SalesCustomObjectService publicService = getService();			 
					EmployeesC eOsc = factory.createEmployeesC();
					//setEmployeeField(o,eOsc);
					setFieldsForEmployee(eOsc,oDb);
					/**
					 * Employee Project
					 */
					setEmployeeProject(eOsc,oDb);
					/**
					 * Employee Pub And Pre
					 */
					setEmployeePubAndPresentation(eOsc,oDb);
					/**
					 * Employee Training
					 */
					setEmployeeTraining(eOsc,oDb);
					/**
					 * Employee Credential
					 */
					//STILL WORKING//
					/**
					 * Employee Education
					 * "Employees_Id_c","Concentration_c","DegreeCompleted_c","Major_c","Presentations_c"
					 */
					setEmployeeEducation(eOsc,oDb);
					
					publicService.createEntity(eOsc, "Employees_c");
					log.debug("createEmployee created successfully");
			} catch (Exception e) {
				log.debug("createEmployee error");				  
				throw new FusionException(e);
			}
		}
		return null;
	}
	
	
	/**
	 * Jeevan#
	 * @param oDb
	 * @return
	 * @throws FusionException
	 */
	@Override
	public Employee merge(Employee oDb) throws FusionException {
		if(oDb!=null){
			try {
				 	log.debug(">>mergeEmployee");
					SalesCustomObjectService publicService = getService();			 
					EmployeesC eOsc = factory.createEmployeesC();
					eOsc.setId(oDb.getOscId());
					//setEmployeeField(o,eOsc);
					setFieldsForEmployee(eOsc,oDb);
					/**
					 * Employee Project
					 */
					setEmployeeProject(eOsc,oDb);
					/**
					 * Employee Pub And Pre
					 */
					setEmployeePubAndPresentation(eOsc,oDb);
					/**
					 * Employee Training
					 */
					setEmployeeTraining(eOsc,oDb);
					/**
					 * Employee Credential
					 */
					//STILL WORKING//
					setEmployeeCredential(eOsc,oDb);
					/**
					 * Employee Education
					 * "Employees_Id_c","Concentration_c","DegreeCompleted_c","Major_c","Presentations_c"
					 */
					setEmployeeEducation(eOsc,oDb);
					
			} catch (Exception e) {
				log.debug("mergeEmployee error");				  
				throw new FusionException(e);
			}
		}
		return null;
	}
	/**
	 * EmployeeCredential
	 * @param eOsc
	 * @param oDb
	 * @throws ObjectMappingException 
	 */
	private void setEmployeeCredential(EmployeesC eOsc, Employee oDb) throws ObjectMappingException {
		if(oDb!=null){
			try {
				List<EmployeeCredentials> dbList = oDb.getEmployeeCredentials();
				if(dbList!=null && dbList.size()>0){
					  List<LicensesCertificationsC> eOscObjList = eOsc.getLicensesCertificationsCollectionCs(); 
					for (EmployeeCredentials eDb : dbList) {
						  eOscObjList.add(setEmloyeeCredentialField(eDb,eOsc));
					}
				}else{
					log.info("No Employee Education found..");
				}
			} catch (Exception e) {
			throw new ObjectMappingException("Error occured while mapping Education : ",e);	
			}
		}
	}
	/**
	 * 
	 * @param eDb
	 * @param eOsc
	 * @return
	 * @throws ObjectMappingException
	 */
	private LicensesCertificationsC setEmloyeeCredentialField(EmployeeCredentials eDb, EmployeesC eOsc)  throws ObjectMappingException  {
		if(eDb!=null){
			LicensesCertificationsC eOscObj = factory.createLicensesCertificationsC();
			/**
			 * CREDENTIAL_DESC
			 */
			eOscObj.setRecordName(eDb.getCredentialDesc());
			/**
			 * LICENSE_CERT_NUMBER
			 */
			eOscObj.setLicenseCertNumberC(factory.createLicensesCertificationsCLicenseCertNumberC(eDb.getLicenseCertNumber()));
			/**
			 * STATE_USA
			 */
			eOscObj.setStateUSAC(factory.createLicensesCertificationsCStateUSAC(eDb.getStateUsa()));
			/**
			 * EXPIRES
			 */
			eOscObj.setExpiresC(DateUtils.getXMLGregorianCalendarBySQLDate(eDb.getExpires()));	
			
			/**
			 * LICENSE_CERT_TYPE
			 */
					
			
			/**
			 * EXPIRED
			 */
					
			
			/**
			 * SUFFIX

			 */
					
			
			/**
			 * COUNTRY

			 */
					
			
			/**
			 * NATIONAL_REGISTRATION

			 */
			/**
			 * ISSUED

			 */
			/**
			 * DOES_NOT_EXPIRE

			 */
			/**
			 * WILL_NOT_RENEW

			 */
			
		}
		return null;
	}




	/**
	 * EmployeeEducation
	 * @param eOsc
	 * @param oDb
	 * @throws ObjectMappingException 
	 */
	private void setEmployeeEducation(EmployeesC eOsc, Employee oDb) throws ObjectMappingException {
		if(oDb!=null){
			try {
				List<EmployeeEducation> dbList = oDb.getEmployeeEducationList();
				if(dbList!=null && dbList.size()>0){
					  List<EducationC> eOscObjList = eOsc.getEducationCollectionCs(); 
					for (EmployeeEducation eDb : dbList) {
						  eOscObjList.add(setEmloyeeEducationField(eDb,eOsc));
					}
				}else{
					log.info("No Employee Education found..");
				}
			} catch (Exception e) {
			throw new ObjectMappingException("Error occured while mapping Education : ",e);	
			}
		}
	}

	/**
	 * Employee Training
	 * @param eOsc
	 * @param oDb
	 * @throws ObjectMappingException
	 */
	private void setEmployeeTraining(EmployeesC eOsc, Employee oDb)throws ObjectMappingException  {
		if(oDb!=null){
			try {
				List<EmployeeTraining> dbList = oDb.getEmployeeTraining();
				if(dbList!=null && dbList.size()>0){
					  List<TrainingC> eOscObjList = eOsc.getTrainingCollectionCs(); 
					for (EmployeeTraining eDb : dbList) {
						  eOscObjList.add(setEmloyeeTrainingField(eDb,eOsc));
					}
				}else{
					log.info("No Employee Training found..");
				}
			} catch (Exception e) {
			throw new ObjectMappingException("Error occured while mapping Pub and Pre : ",e);	
			}
		}
	}

	/**
	 * EmployeePubAndPresentation
	 * @param eOsc
	 * @param oDb
	 * @throws ObjectMappingException
	 */
	private void setEmployeePubAndPresentation(EmployeesC eOsc, Employee oDb)throws ObjectMappingException  {
		if(oDb!=null){
			try {
				List<EmployeePublicationsNPresentations> dbList = oDb.getEmployeePublicationsPresentations();
				if(dbList!=null && dbList.size()>0){
					  List<PresentationsC> eOscObjList = eOsc.getPresentationsCollectionCs(); 
					for (EmployeePublicationsNPresentations eDb : dbList) {
						  eOscObjList.add(setEmloyeePubAndPreField(eDb,eOsc));
					}
					
				}else{
					log.info("No Employee Pub and Pre found..");
				}
			} catch (Exception e) {
			throw new ObjectMappingException("Error occured while mapping Pub and Pre : ",e);	
			}
		}
	}

	/**
	 * Employee Project
	 * @param eOsc
	 * @param oDb
	 * @throws ObjectMappingException
	 */
	private void setEmployeeProject(EmployeesC eOsc, Employee oDb) throws ObjectMappingException {
		if(oDb!=null){
			try {
				List<EmployeeProjects> dbList = oDb.getEmployeeProjects();
				if(dbList!=null && dbList.size()>0){
					  List<EmployeeProjectsC> eOscObjList =	eOsc.getEmployeeProjectsCollectionCs(); 
					for (EmployeeProjects eDb : dbList) {
						  eOscObjList.add(setEmloyeeProjectField(eDb,eOsc));
					}
					
				}else{
					log.info("No Employee Project found..");
				}
			} catch (Exception e) {
			throw new ObjectMappingException("Error occured while mapping Employee Project: ",e);	
			}
		}
	}
	
	
	
	
	private TrainingC setEmloyeeTrainingField(EmployeeTraining eDb, EmployeesC eOsc) throws ObjectMappingException {
		TrainingC eOscObj = factory.createTrainingC(); 
		/**
		 * OSC Id for Training
		 */
		if(eDb.getOscTrainingId()!=null){
			eOscObj.setId(eDb.getOscTrainingId());
		}
		/**
		 * TRAINING_SESSION_ID
		 */
		if(eDb.getTrainingSessionId()!=null){
			eOscObj.setRecordName(String.valueOf(eDb.getTrainingSessionId()));	
		}else{
			throw new ObjectMappingException("Employee Session Id can not be null");
		}
		
		/**
		 * TRAINING_TYPE_CODE
		 * TODO: Mapping not sure
		 */
		
		/**
		 * EMPLOYEE_ID
		 */
		if(eDb.getEmployeeId()!=null){
			eOscObj.setEmployeesIdC(factory.createTrainingCEmployeesIdC(BigDecimal.valueOf(eDb.getEmployeeId())));	
		}else{
			throw new ObjectMappingException("Employee Id can not be null");
		}
		
		/**
		 * CLASS_SESSION_NAME
		 * TODO: Mapping not sure
		 */
		
		/**
		 * SESSION_COMPLETION_DATE
		 */
			eOscObj.setDateC(factory.createTrainingCDateC(DateUtils.getXMLGregorianCalendarBySQLDate(eDb.getSessionCompletionDate())));
		/**
		 * COMPLETION_STATUS_DESCR
		 */
			if(eDb.getCompletionStatusDescr()!=null)eOscObj.setTrainingDescriptionC(factory.createTrainingCTrainingDescriptionC(eDb.getCompletionStatusDescr().getBytes()));
		/**
		 * INTERNAL_EXTERNAL_IND
		 * TODO: Mapping not sure
		 */
		
	
		return eOscObj;
	}

	/**
	 * Employee Education
	 * @param eDb
	 * @param eOsc
	 * @return
	 * @throws ObjectMappingException 
	 */
	private EducationC setEmloyeeEducationField(EmployeeEducation eDb, EmployeesC eOsc) throws ObjectMappingException {
		EducationC eOscObj = factory.createEducationC(); 
		/**
		 *  OSC Id for Education
		 */
		if(eDb.getOscEducationId()!=null){
			eOscObj.setId(eDb.getOscEducationId());
		}
		/**
		 * EMPLOYEE_ID
		 */
		//Can't really set this field. THis is am association field
		/*if(eDb.getEmployeeId()!=null){
			eOscObj.setEmployeesIdC(factory.createEducationCEmployeesIdC(BigDecimal.valueOf(eDb.getEmployeeId())));
		}else{
			throw new ObjectMappingException("Employee Id can not be null");
		}*/
		//"Employees_Id_c","Concentration_c","DegreeCompleted_c","Major_c"
		/**ID
		 * EDUCATION_TYPE_CODE
		 */
		eOscObj.setEducationTypeCodeC(factory.createEducationCEducationTypeCodeC(eDb.getEducationTypeCode()));
		/**
		 * EDUCATION_TYPE_DESCR_LONG
		 * TODO: Mapping not sure
		 */
		/**ID
		 * EDUCATION_MAJOR_CODE
		 */
		eOscObj.setMajorC(factory.createEducationCMajorC(eDb.getEducationMajorCode()));
		/**ID
		 * GRADUATED_YN
		 */
		if("Y".equalsIgnoreCase(eDb.getGraduatedYn())){
			eOscObj.setDegreeCompletedC(true);
		}else{
			eOscObj.setDegreeCompletedC(false);
		}
		/**
		 * DEGREE
		 */
		eOscObj.setDegreeC(factory.createEducationCDegreeC(eDb.getDegree()));
		/**
		 * INSTITUTION_CODE
		 */
		eOscObj.setRecordName(eDb.getInstitutionCode());
		/**
		 * INSTITUTION_DESCR_LONG
		 */
		//eOscObj.setRecordName(eDb.getInstitutionDescrLong());
		/**
		 * COUNTRY
		 */
		eOscObj.setCountryC(factory.createEducationCCountryC(eDb.getCountry()));
		/**
		 * STATE_PROVINCE
		 */
		eOscObj.setStatesProvincesC(factory.createEducationCStatesProvincesC(eDb.getState()));
		/**
		 * DEGREE
		 */
		eOscObj.setDegreeC(factory.createEducationCDegreeC(eDb.getDegree()));
		return eOscObj;
	}
	
	/**
	 * Employee Pub and Pre Field Mapping
	 * @param eDb
	 * @param eOsc
	 * @return
	 */
	private PresentationsC setEmloyeePubAndPreField(EmployeePublicationsNPresentations eDb, EmployeesC eOsc) {
		PresentationsC eOscObj = factory.createPresentationsC(); 
		/**
		 * OSC Id for Pub and Pre
		 */
		if(eDb.getOscId()!=null){
			eOscObj.setId(eDb.getOscId());
		}
		/**
		 * EMPLOYEE_ID	
		 */
		//this is an association field, cant really set this field.
		//if(eDb.getEmployeeId()!=null)eOscObj.setEmployeesIdC(factory.createPresentationsCEmployeesIdC(BigDecimal.valueOf(eDb.getEmployeeId()))  );
		
		/**
		 * PUB_PRESENT_ID
		 */
		eOscObj.setRecordName(eDb.getPubPresentId());
		
		/**
		 * TITLE
		 */
		eOscObj.setTitleC(factory.createPresentationsCTitleC(eDb.getTitle()));
		/**
		 * EVENTS_PUBLICATIONS
		 */
		eOscObj.setConferenceNameC(factory.createPresentationsCConferenceNameC(eDb.getEventsPublications()));
		/**
		 * PUBLICATION_TYPE
		 */
		eOscObj.setPublicationTypeC(factory.createPresentationsCPublicationTypeC(eDb.getPublicationType()));
		/**
		 * PUBLICATION_NAME
		 * TODO:Please check this.Mapped to record name but we do no have any fields for Pub and Presentation Id
		 */
		
		/**
		 * HDR_AUTHOR
		 */
		eOscObj.setHDRAuthorC(factory.createPresentationsCHDRAuthorC(eDb.getHdrAuthor()));
		/**
		 * OTHER_HDR_AUTHORS
		 */
		eOscObj.setOtherHDRAuthorsC(factory.createPresentationsCOtherHDRAuthorsC(eDb.getOtherHdrAuthors()));
		/**
		 * NON_HDR_AUTHORS
		 */
		eOscObj.setNonHDRAuthorsC(factory.createPresentationsCNonHDRAuthorsC(eDb.getNonHdrAuthors()));
		/**
		/**
		 * COUNTRY
		 */
		eOscObj.setLocationC(factory.createPresentationsCLocationC(eDb.getCountry()));
		/**
		 * STATE_PROVINCE
		 */
		eOscObj.setStateC(factory.createPresentationsCStateC(eDb.getStateProvince()));
		/**
		 * CITY
		 */
		eOscObj.setCityC(factory.createPresentationsCCityC(eDb.getCity()));
		/**
		 * YEAR
		 */
		eOscObj.setYearC(factory.createPresentationsCYearC(eDb.getYear()));
		
		return eOscObj;
	}


	/**
	 * Employee Project Field Mapping
	 * @param eDb
	 * @param eOsc
	 * @return
	 */

	private EmployeeProjectsC setEmloyeeProjectField(EmployeeProjects eDb, EmployeesC eOsc) {
			EmployeeProjectsC eOscObj = factory.createEmployeeProjectsC();
		  
		    /**
		     * OSD Id for project
		     */
		    if(eDb.getOscEmployeeProjectId()!=null){
		    	eOscObj.setId(eDb.getOscEmployeeProjectId());
		    }
		    /**
		     * Project Employee Id
		     */
		    //This field is an Association field. Cant really set any value
		    //eOscObj.setEmployeesIdC(factory.createEmployeeProjectsCEmployeesIdC(BigDecimal.valueOf(eDb.getEmployeeId())));
		    /**
		     * Project Id
		     */
		    eOscObj.setEBSProjectIDC(factory.createEmployeeProjectsCEBSProjectIDC(String.valueOf(eDb.getProjectId())));
		    /**
		     * CONTRACT_NAME
		     */
		    eOscObj.setContractNameC(factory.createEmployeeProjectsCContractNameC(eDb.getContractName()));
		    /**
		     * CLIENT_NAME
		     */
		    eOscObj.setClientNameC(factory.createEmployeeProjectsCClientNameC(eDb.getClientName()));
		    /**
		     * PROJECT_ROLE
		     */
		    eOscObj.setProjectRoleC(factory.createEmployeeProjectsCProjectRoleC(eDb.getProjectRole()));
		    /**
		     * PROJECT_DESCRIPTION
		     */
		    if(eDb.getDescription()!=null)eOscObj.setDescriptionC(factory.createEmployeeProjectsCDescriptionC(eDb.getDescription().getBytes()));
		    /**
		     * PROJECT_STATUS
		     */
		    eOscObj.setStatusC(factory.createEmployeeProjectsCStatusC(eDb.getStatus()));
		    /**
		     * PROJECT_LAST_ACTIVITY_DATE
		     */
		    eOscObj.setProjectLastActivityDateC(factory.createEmployeeProjectsCProjectLastActivityDateC(DateUtils.getXMLGregorianCalendarBySQLDate(eDb.getProjectLastActivityDate())));
		    /**
		     * HOURS_CHARGED
		     */
		    if(eDb.getHoursCharged()!=null)eOscObj.setHoursChargedsC(factory.createEmployeeProjectsCHoursChargedsC(BigDecimal.valueOf(eDb.getHoursCharged())));
		    /**
		     * MASTER_CONTRACT_NAME
		     */
		    eOscObj.setMasterContractNamesC(factory.createEmployeeProjectsCMasterContractNamesC(eDb.getMasterContractName()));
		    /**
		     * PROJECT_NUMBER
		     *
		     */
		    eOscObj.setRecordName(eDb.getProjectNumber());
		    return  eOscObj;
	}
	

	@Override
	public Object mergeForDataLoad(Object o) throws FusionException {
		log.info(">> merge");
		if(o!=null){
			try {
				
				Employee eDb = (Employee) o;
				SalesCustomObjectService publicService = getService();
				EmployeesC oscObj = factory.createEmployeesC(); 
				oscObj.setId(eDb.getOscId());	
				oscObj.setEmployeeIDC(factory.createEmployeesCEmployeeIDC(eDb.getEmployeeId().toString()));
				publicService.mergeEntity(oscObj, "Employees_c");
				log.info("<< merge");
				
			} catch (Exception e) {
			  throw new FusionException(e);
			}
		}
		return null;
	}
	



	@Override
	public Object delete(DeleteEmployeeProject o) throws FusionException {
		log.info(">> delete");
		if(o!=null){
			try {
				SalesCustomObjectService publicService = getService();
				EmployeeProjectsC proj = factory.createEmployeeProjectsC();
				proj.setId(o.getId());
				publicService.deleteEntity(proj, "EmployeeProjects_c");
				log.info("<< delete");
				
			} catch (Exception e) {
			  throw new FusionException(e);
			}
		}
		return null;
	}




	@Override
	public Object createForDataLoad(Employee eDb ) throws FusionException {

		log.info(">> create");
		if(eDb!=null){
			try {
				SalesCustomObjectService publicService = getService();
				EmployeesC oscObj = factory.createEmployeesC(); 
				oscObj.setEmployeeIDC(factory.createEmployeesCEmployeeIDC(eDb.getEmployeeId().toString()));
				setFieldsForEmployee(oscObj,eDb);
				publicService.createEntity(oscObj, "Employees_c");
				log.info("<< merge");
				
			} catch (Exception e) {
				System.out.println();
			  throw new FusionException(e);
			}
		}
		return null;
	
	}




	private void setFieldsForEmployee(EmployeesC osc, Employee db) throws ObjectMappingException {
		
		/**
		 * OSC id
		 */
		if(db.getOscId()!=null)osc.setId(db.getOscId());
		/**
		 * EMPLOYEE_NUMBER
		 * 
		 */
		osc.setEBSEmployeeNumberC(factory.createEmployeesCEBSEmployeeNumberC(db.getEmployeeNumber()));
		/**
		 * FIRST NAME
		 */
		osc.setFirstNameC(factory.createEmployeesCFirstNameC(db.getFirstName()));
		
		/**
		 * MIDDLE_NAME
		 */
		osc.setMiddleInitialsC(factory.createEmployeesCMiddleInitialsC(db.getMiddleName()));
		/**
		 * LAST_NAME
		 */
		osc.setRecordName(db.getLastName());
		/**
		 * PREF_FIRST_NAME
		 */
		osc.setPreferredNameC(factory.createEmployeesCPreferredNameC(db.getPrefFirstName()));
		/**
		 * BUSINESS_CARD_TITLE
		 */
		osc.setBusinessTitleC(factory.createEmployeesCBusinessTitleC(db.getBusinessCardTitle()));
		/**
		 * DOMAIN_USERNAME
		 * NOT SURE MAPPING
		 */
		/**
		 * BUSINESS_GROUP_CODE
		 */
		osc.setBusinessGroupC(factory.createEmployeesCBusinessGroupC(db.getBusinessGroupCode()));
		/**
		 * BUSINESS_GROUP_DESCR_LONG
		 * NOT SURE MAPPING
		 */
		/**
		 * MARKET_SECTOR_CODE
		 */
		osc.setMarketSectorC(factory.createEmployeesCMarketSectorC(db.getMarketSectorCode()));
		/**
		 * MARKET_SECTOR_DESCR_LONG
		 * NOT SURE MAPPING
		 */
		/**
		 * BUSINESS_CLASS_CODE
		 */
		osc.setBusinessClassesC(factory.createEmployeesCBusinessClassesC(db.getBusinessClassCode()));
		/**
		 * BUSINESS_CLASS_DESCR_LONG
		 * NOT SURE MAPPING
		 */
		/**
		 * BUSINESS_UNIT_CODE
		 */
		osc.setBusinessUnitC(factory.createEmployeesCBusinessUnitC(db.getBusinessUnitCode()));
		/**
		 * BUSINESS_UNIT_DESCR
		 * NOT SURE MAPPING
		 */
		/**
		 * PROF_EXPERIENCE_DATE
		 * NOT SURE MAPPING
		 */
		/**
		 * ADJUSTED_SERVICE_DATE
		 * NOT SURE MAPPING
		 */
		/**
		 * OFFICE
		 */
		osc.setOfficeC(factory.createEmployeesCOfficeC(db.getOffice()));
		/**
		 * EMAIL_ADDRESS
		 */
		osc.setEmailAddressC(factory.createEmployeesCEmailAddressC(db.getEmailAddress()));
		/**
		 * INDUSTRY_TENURE
		 */
		if(db.getIndustryTenure()!=null)osc.setIndustryTenureC(factory.createEmployeesCIndustryTenureC(BigDecimal.valueOf(db.getIndustryTenure())));
		/**
		 * HDR_TENURE
		 */
		if(db.getHdrTenure()!=null)osc.setHDRTenureC(factory.createEmployeesCHDRTenureC(BigDecimal.valueOf(db.getHdrTenure())));
		/**
		 * LEGACY_ID
		 */
		osc.setEmployeeLegacySystemIDC(factory.createEmployeesCEmployeeLegacySystemIDC(db.getLegacyId()));
		/**
		 * LANGUAGE
		 * FIND FROM 
		 * 
		 */
		osc.setLanguagesC(factory.createEmployeesCLanguagesC( getLangauge(db)));
		 
	}




	private String getLangauge(Employee db) throws ObjectMappingException {
		try {

			List<EmployeeLanguage> langList = entityServiceDBaaS.findByNameQuery(IEmployeeConstants.FIND_EMPLOYEE_LANGUAGE, new Object[]{db.getEmployeeId()});
			  if(langList!=null){
				  StringBuilder sb = new StringBuilder();
				  int size=  langList.size();
				  for (EmployeeLanguage employeeLanguage : langList) {
					  if(size==1){
						  sb.append(employeeLanguage.getLanguageDescrLong());
					  }else{
						  sb.append(employeeLanguage.getLanguageDescrLong()+",");
					  }
					  
					  size--;
				}
				  return sb.toString();
			  }else{
				  return null;
			  }
		
		} catch (Exception e) {
			throw new ObjectMappingException("Error Occured while forming langugae for employee with employee id ="+db.getEmployeeId(),e);
		}
	}
	
}
