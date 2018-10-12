
package com.hdr.ws.stubs.customeObject;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Employees_c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Employees_c">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RecordName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpdrfVerSor" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CpdrfLastUpd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CpdrfVerPillar" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="JobDefinitionPackage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="JobDefinitionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AttachmentEntityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PKProxy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IsOwner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResumeDataContact_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Office_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessTitle_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessGroup_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessGroup_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClass_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSector_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSector_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Section_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Section_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HireDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Credentials_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WorkPhone_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmailAddress_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Primary_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="WorkAddress_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Address2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IndustryTenure_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HDRTenure_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ExperienceOverview_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="ExperienceGroupName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExperienceLastUpdated_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Activity_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Activity_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClasses_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClasses_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Languages_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Languages_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleInitials_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResumeDataContacts_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ResumeDataContacts_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FullName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotPublish_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EmployeeLegacySystemID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackEndLastUpdatedDate_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackendIntegrationDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="IntegratedEmployee_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UpdateDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EBSEmployeeNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeProjectsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}EmployeeProjects_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LicensesCertificationsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}LicensesCertifications_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PublicationsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Publications_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PresentationsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Presentations_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProfessionalMembershipsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}ProfessionalMemberships_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TrainingCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Training_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HDRHonorsAwardsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}HDRHonorsAwards_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="IndustryAwardsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}IndustryAwards_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NotesResumeReferencesCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}NotesResumeReferences_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EducationCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Education_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PastEmploymentCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}PastEmployment_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LanguageCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Language_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AcademicHonorsAndResearchCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}AcademicHonorsAndResearch_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ActivitiesCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Activities_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalOverviewsBiosCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}AdditionalOverviewsBios_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AdditionalProjectsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}AdditionalProjects_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Employees_c", propOrder = {
    "id",
    "recordName",
    "createdBy",
    "creationDate",
    "lastUpdatedBy",
    "lastUpdateDate",
    "objectVersionNumber",
    "lastUpdateLogin",
    "cpdrfVerSor",
    "conflictId",
    "userLastUpdateDate",
    "cpdrfLastUpd",
    "cpdrfVerPillar",
    "jobDefinitionPackage",
    "requestId",
    "jobDefinitionName",
    "currencyCode",
    "curcyConvRateType",
    "corpCurrencyCode",
    "sourceType",
    "attachmentEntityName",
    "pkProxy",
    "isOwner",
    "employeeIDC",
    "preferredNameC",
    "resumeDataContactC",
    "officeC",
    "businessTitleC",
    "departmentC",
    "departmentCMeaning",
    "businessGroupC",
    "businessGroupCMeaning",
    "businessClassC",
    "marketSectorC",
    "marketSectorCMeaning",
    "sectionC",
    "sectionCMeaning",
    "hireDateC",
    "credentialsC",
    "languageC",
    "languageCMeaning",
    "workPhoneC",
    "emailAddressC",
    "primaryC",
    "workAddressC",
    "address1C",
    "address2C",
    "cityC",
    "stateC",
    "countryC",
    "countryCMeaning",
    "industryTenureC",
    "hdrTenureC",
    "experienceOverviewC",
    "experienceGroupNameC",
    "experienceLastUpdatedC",
    "activityIdC",
    "activityC",
    "businessClassesC",
    "businessClassesCMeaning",
    "businessUnitC",
    "businessUnitCMeaning",
    "languagesC",
    "languagesCMeaning",
    "lastNameC",
    "middleInitialsC",
    "lastUpdatedByC",
    "resumeDataContactsIdC",
    "resumeDataContactsC",
    "fullNameC",
    "doNotPublishC",
    "employeeLegacySystemIDC",
    "backEndLastUpdatedDateC",
    "firstNameC",
    "backendIntegrationDateC",
    "integratedEmployeeC",
    "updateDateC",
    "ebsEmployeeNumberC",
    "statusC",
    "employeeProjectsCollectionCs",
    "licensesCertificationsCollectionCs",
    "publicationsCollectionCs",
    "presentationsCollectionCs",
    "professionalMembershipsCollectionCs",
    "trainingCollectionCs",
    "hdrHonorsAwardsCollectionCs",
    "industryAwardsCollectionCs",
    "notesResumeReferencesCollectionCs",
    "educationCollectionCs",
    "pastEmploymentCollectionCs",
    "languageCollectionCs",
    "academicHonorsAndResearchCollectionCs",
    "activitiesCollectionCs",
    "additionalOverviewsBiosCollectionCs",
    "additionalProjectsCollectionCs"
})
@XmlRootElement(name = "employees_c")
public class EmployeesC {

    @XmlElement(name = "Id")
    protected BigDecimal id;
    @XmlElement(name = "RecordName")
    protected String recordName;
    @XmlElementRef(name = "CreatedBy", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> createdBy;
    @XmlElementRef(name = "CreationDate", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> creationDate;
    @XmlElementRef(name = "LastUpdatedBy", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdatedBy;
    @XmlElementRef(name = "LastUpdateDate", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastUpdateDate;
    @XmlElementRef(name = "ObjectVersionNumber", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> objectVersionNumber;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "CpdrfVerSor", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpdrfVerSor;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElementRef(name = "CpdrfLastUpd", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cpdrfLastUpd;
    @XmlElementRef(name = "CpdrfVerPillar", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> cpdrfVerPillar;
    @XmlElementRef(name = "JobDefinitionPackage", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobDefinitionPackage;
    @XmlElementRef(name = "RequestId", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "JobDefinitionName", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobDefinitionName;
    @XmlElementRef(name = "CurrencyCode", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "SourceType", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceType;
    @XmlElementRef(name = "AttachmentEntityName", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> attachmentEntityName;
    @XmlElementRef(name = "PKProxy", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pkProxy;
    @XmlElementRef(name = "IsOwner", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> isOwner;
    @XmlElementRef(name = "EmployeeID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeIDC;
    @XmlElementRef(name = "PreferredName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredNameC;
    @XmlElementRef(name = "ResumeDataContact_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resumeDataContactC;
    @XmlElementRef(name = "Office_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> officeC;
    @XmlElementRef(name = "BusinessTitle_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessTitleC;
    @XmlElementRef(name = "Department_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentC;
    @XmlElementRef(name = "Department_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentCMeaning;
    @XmlElementRef(name = "BusinessGroup_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessGroupC;
    @XmlElementRef(name = "BusinessGroup_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessGroupCMeaning;
    @XmlElementRef(name = "BusinessClass_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassC;
    @XmlElementRef(name = "MarketSector_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorC;
    @XmlElementRef(name = "MarketSector_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorCMeaning;
    @XmlElementRef(name = "Section_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectionC;
    @XmlElementRef(name = "Section_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectionCMeaning;
    @XmlElementRef(name = "HireDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> hireDateC;
    @XmlElementRef(name = "Credentials_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> credentialsC;
    @XmlElementRef(name = "Language_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languageC;
    @XmlElementRef(name = "Language_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languageCMeaning;
    @XmlElementRef(name = "WorkPhone_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> workPhoneC;
    @XmlElementRef(name = "EmailAddress_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddressC;
    @XmlElement(name = "Primary_c")
    protected Boolean primaryC;
    @XmlElementRef(name = "WorkAddress_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> workAddressC;
    @XmlElementRef(name = "Address1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address1C;
    @XmlElementRef(name = "Address2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> address2C;
    @XmlElementRef(name = "City_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityC;
    @XmlElementRef(name = "State_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateC;
    @XmlElementRef(name = "Country_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryC;
    @XmlElementRef(name = "Country_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCMeaning;
    @XmlElementRef(name = "IndustryTenure_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> industryTenureC;
    @XmlElementRef(name = "HDRTenure_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hdrTenureC;
    @XmlElementRef(name = "ExperienceOverview_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> experienceOverviewC;
    @XmlElementRef(name = "ExperienceGroupName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> experienceGroupNameC;
    @XmlElementRef(name = "ExperienceLastUpdated_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> experienceLastUpdatedC;
    @XmlElementRef(name = "Activity_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> activityIdC;
    @XmlElementRef(name = "Activity_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> activityC;
    @XmlElementRef(name = "BusinessClasses_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassesC;
    @XmlElementRef(name = "BusinessClasses_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassesCMeaning;
    @XmlElementRef(name = "BusinessUnit_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitC;
    @XmlElementRef(name = "BusinessUnit_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitCMeaning;
    @XmlElementRef(name = "Languages_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languagesC;
    @XmlElementRef(name = "Languages_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languagesCMeaning;
    @XmlElementRef(name = "LastName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastNameC;
    @XmlElementRef(name = "MiddleInitials_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> middleInitialsC;
    @XmlElementRef(name = "LastUpdatedBy_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdatedByC;
    @XmlElementRef(name = "ResumeDataContacts_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> resumeDataContactsIdC;
    @XmlElementRef(name = "ResumeDataContacts_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resumeDataContactsC;
    @XmlElement(name = "FullName_c")
    protected String fullNameC;
    @XmlElement(name = "DoNotPublish_c")
    protected Boolean doNotPublishC;
    @XmlElementRef(name = "EmployeeLegacySystemID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeeLegacySystemIDC;
    @XmlElementRef(name = "BackEndLastUpdatedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backEndLastUpdatedDateC;
    @XmlElementRef(name = "FirstName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firstNameC;
    @XmlElementRef(name = "BackendIntegrationDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> backendIntegrationDateC;
    @XmlElement(name = "IntegratedEmployee_c")
    protected Boolean integratedEmployeeC;
    @XmlElementRef(name = "UpdateDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> updateDateC;
    @XmlElementRef(name = "EBSEmployeeNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsEmployeeNumberC;
    @XmlElementRef(name = "Status_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusC;
    @XmlElement(name = "EmployeeProjectsCollection_c")
    protected List<EmployeeProjectsC> employeeProjectsCollectionCs;
    @XmlElement(name = "LicensesCertificationsCollection_c")
    protected List<LicensesCertificationsC> licensesCertificationsCollectionCs;
    @XmlElement(name = "PublicationsCollection_c")
    protected List<PublicationsC> publicationsCollectionCs;
    @XmlElement(name = "PresentationsCollection_c")
    protected List<PresentationsC> presentationsCollectionCs;
    @XmlElement(name = "ProfessionalMembershipsCollection_c")
    protected List<ProfessionalMembershipsC> professionalMembershipsCollectionCs;
    @XmlElement(name = "TrainingCollection_c")
    protected List<TrainingC> trainingCollectionCs;
    @XmlElement(name = "HDRHonorsAwardsCollection_c")
    protected List<HDRHonorsAwardsC> hdrHonorsAwardsCollectionCs;
    @XmlElement(name = "IndustryAwardsCollection_c")
    protected List<IndustryAwardsC> industryAwardsCollectionCs;
    @XmlElement(name = "NotesResumeReferencesCollection_c")
    protected List<NotesResumeReferencesC> notesResumeReferencesCollectionCs;
    @XmlElement(name = "EducationCollection_c")
    protected List<EducationC> educationCollectionCs;
    @XmlElement(name = "PastEmploymentCollection_c")
    protected List<PastEmploymentC> pastEmploymentCollectionCs;
    @XmlElement(name = "LanguageCollection_c")
    protected List<LanguageC> languageCollectionCs;
    @XmlElement(name = "AcademicHonorsAndResearchCollection_c")
    protected List<AcademicHonorsAndResearchC> academicHonorsAndResearchCollectionCs;
    @XmlElement(name = "ActivitiesCollection_c")
    protected List<ActivitiesC> activitiesCollectionCs;
    @XmlElement(name = "AdditionalOverviewsBiosCollection_c")
    protected List<AdditionalOverviewsBiosC> additionalOverviewsBiosCollectionCs;
    @XmlElement(name = "AdditionalProjectsCollection_c")
    protected List<AdditionalProjectsC> additionalProjectsCollectionCs;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setId(BigDecimal value) {
        this.id = value;
    }

    /**
     * Gets the value of the recordName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordName() {
        return recordName;
    }

    /**
     * Sets the value of the recordName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordName(String value) {
        this.recordName = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCreatedBy(JAXBElement<String> value) {
        this.createdBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCreationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdatedBy(JAXBElement<String> value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setObjectVersionNumber(JAXBElement<BigDecimal> value) {
        this.objectVersionNumber = value;
    }

    /**
     * Gets the value of the lastUpdateLogin property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    /**
     * Sets the value of the lastUpdateLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateLogin(JAXBElement<String> value) {
        this.lastUpdateLogin = value;
    }

    /**
     * Gets the value of the cpdrfVerSor property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpdrfVerSor() {
        return cpdrfVerSor;
    }

    /**
     * Sets the value of the cpdrfVerSor property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpdrfVerSor(JAXBElement<Integer> value) {
        this.cpdrfVerSor = value;
    }

    /**
     * Gets the value of the conflictId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConflictId() {
        return conflictId;
    }

    /**
     * Sets the value of the conflictId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConflictId(Long value) {
        this.conflictId = value;
    }

    /**
     * Gets the value of the userLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUserLastUpdateDate() {
        return userLastUpdateDate;
    }

    /**
     * Sets the value of the userLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUserLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.userLastUpdateDate = value;
    }

    /**
     * Gets the value of the cpdrfLastUpd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCpdrfLastUpd() {
        return cpdrfLastUpd;
    }

    /**
     * Sets the value of the cpdrfLastUpd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCpdrfLastUpd(JAXBElement<String> value) {
        this.cpdrfLastUpd = value;
    }

    /**
     * Gets the value of the cpdrfVerPillar property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getCpdrfVerPillar() {
        return cpdrfVerPillar;
    }

    /**
     * Sets the value of the cpdrfVerPillar property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setCpdrfVerPillar(JAXBElement<Integer> value) {
        this.cpdrfVerPillar = value;
    }

    /**
     * Gets the value of the jobDefinitionPackage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobDefinitionPackage() {
        return jobDefinitionPackage;
    }

    /**
     * Sets the value of the jobDefinitionPackage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobDefinitionPackage(JAXBElement<String> value) {
        this.jobDefinitionPackage = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRequestId(JAXBElement<Long> value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the jobDefinitionName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobDefinitionName() {
        return jobDefinitionName;
    }

    /**
     * Sets the value of the jobDefinitionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobDefinitionName(JAXBElement<String> value) {
        this.jobDefinitionName = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCode(JAXBElement<String> value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the curcyConvRateType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurcyConvRateType() {
        return curcyConvRateType;
    }

    /**
     * Sets the value of the curcyConvRateType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurcyConvRateType(JAXBElement<String> value) {
        this.curcyConvRateType = value;
    }

    /**
     * Gets the value of the corpCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorpCurrencyCode() {
        return corpCurrencyCode;
    }

    /**
     * Sets the value of the corpCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorpCurrencyCode(JAXBElement<String> value) {
        this.corpCurrencyCode = value;
    }

    /**
     * Gets the value of the sourceType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceType() {
        return sourceType;
    }

    /**
     * Sets the value of the sourceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceType(JAXBElement<String> value) {
        this.sourceType = value;
    }

    /**
     * Gets the value of the attachmentEntityName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAttachmentEntityName() {
        return attachmentEntityName;
    }

    /**
     * Sets the value of the attachmentEntityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAttachmentEntityName(JAXBElement<String> value) {
        this.attachmentEntityName = value;
    }

    /**
     * Gets the value of the pkProxy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPKProxy() {
        return pkProxy;
    }

    /**
     * Sets the value of the pkProxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPKProxy(JAXBElement<String> value) {
        this.pkProxy = value;
    }

    /**
     * Gets the value of the isOwner property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIsOwner() {
        return isOwner;
    }

    /**
     * Sets the value of the isOwner property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIsOwner(JAXBElement<String> value) {
        this.isOwner = value;
    }

    /**
     * Gets the value of the employeeIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeIDC() {
        return employeeIDC;
    }

    /**
     * Sets the value of the employeeIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeIDC(JAXBElement<String> value) {
        this.employeeIDC = value;
    }

    /**
     * Gets the value of the preferredNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredNameC() {
        return preferredNameC;
    }

    /**
     * Sets the value of the preferredNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredNameC(JAXBElement<String> value) {
        this.preferredNameC = value;
    }

    /**
     * Gets the value of the resumeDataContactC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResumeDataContactC() {
        return resumeDataContactC;
    }

    /**
     * Sets the value of the resumeDataContactC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResumeDataContactC(JAXBElement<String> value) {
        this.resumeDataContactC = value;
    }

    /**
     * Gets the value of the officeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOfficeC() {
        return officeC;
    }

    /**
     * Sets the value of the officeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOfficeC(JAXBElement<String> value) {
        this.officeC = value;
    }

    /**
     * Gets the value of the businessTitleC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessTitleC() {
        return businessTitleC;
    }

    /**
     * Sets the value of the businessTitleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessTitleC(JAXBElement<String> value) {
        this.businessTitleC = value;
    }

    /**
     * Gets the value of the departmentC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentC() {
        return departmentC;
    }

    /**
     * Sets the value of the departmentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentC(JAXBElement<String> value) {
        this.departmentC = value;
    }

    /**
     * Gets the value of the departmentCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentCMeaning() {
        return departmentCMeaning;
    }

    /**
     * Sets the value of the departmentCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentCMeaning(JAXBElement<String> value) {
        this.departmentCMeaning = value;
    }

    /**
     * Gets the value of the businessGroupC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessGroupC() {
        return businessGroupC;
    }

    /**
     * Sets the value of the businessGroupC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessGroupC(JAXBElement<String> value) {
        this.businessGroupC = value;
    }

    /**
     * Gets the value of the businessGroupCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessGroupCMeaning() {
        return businessGroupCMeaning;
    }

    /**
     * Sets the value of the businessGroupCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessGroupCMeaning(JAXBElement<String> value) {
        this.businessGroupCMeaning = value;
    }

    /**
     * Gets the value of the businessClassC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessClassC() {
        return businessClassC;
    }

    /**
     * Sets the value of the businessClassC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessClassC(JAXBElement<String> value) {
        this.businessClassC = value;
    }

    /**
     * Gets the value of the marketSectorC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketSectorC() {
        return marketSectorC;
    }

    /**
     * Sets the value of the marketSectorC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketSectorC(JAXBElement<String> value) {
        this.marketSectorC = value;
    }

    /**
     * Gets the value of the marketSectorCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketSectorCMeaning() {
        return marketSectorCMeaning;
    }

    /**
     * Sets the value of the marketSectorCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketSectorCMeaning(JAXBElement<String> value) {
        this.marketSectorCMeaning = value;
    }

    /**
     * Gets the value of the sectionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectionC() {
        return sectionC;
    }

    /**
     * Sets the value of the sectionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectionC(JAXBElement<String> value) {
        this.sectionC = value;
    }

    /**
     * Gets the value of the sectionCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectionCMeaning() {
        return sectionCMeaning;
    }

    /**
     * Sets the value of the sectionCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectionCMeaning(JAXBElement<String> value) {
        this.sectionCMeaning = value;
    }

    /**
     * Gets the value of the hireDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getHireDateC() {
        return hireDateC;
    }

    /**
     * Sets the value of the hireDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setHireDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.hireDateC = value;
    }

    /**
     * Gets the value of the credentialsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCredentialsC() {
        return credentialsC;
    }

    /**
     * Sets the value of the credentialsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCredentialsC(JAXBElement<String> value) {
        this.credentialsC = value;
    }

    /**
     * Gets the value of the languageC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguageC() {
        return languageC;
    }

    /**
     * Sets the value of the languageC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguageC(JAXBElement<String> value) {
        this.languageC = value;
    }

    /**
     * Gets the value of the languageCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguageCMeaning() {
        return languageCMeaning;
    }

    /**
     * Sets the value of the languageCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguageCMeaning(JAXBElement<String> value) {
        this.languageCMeaning = value;
    }

    /**
     * Gets the value of the workPhoneC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWorkPhoneC() {
        return workPhoneC;
    }

    /**
     * Sets the value of the workPhoneC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWorkPhoneC(JAXBElement<BigDecimal> value) {
        this.workPhoneC = value;
    }

    /**
     * Gets the value of the emailAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddressC() {
        return emailAddressC;
    }

    /**
     * Sets the value of the emailAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddressC(JAXBElement<String> value) {
        this.emailAddressC = value;
    }

    /**
     * Gets the value of the primaryC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryC() {
        return primaryC;
    }

    /**
     * Sets the value of the primaryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryC(Boolean value) {
        this.primaryC = value;
    }

    /**
     * Gets the value of the workAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWorkAddressC() {
        return workAddressC;
    }

    /**
     * Sets the value of the workAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWorkAddressC(JAXBElement<String> value) {
        this.workAddressC = value;
    }

    /**
     * Gets the value of the address1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress1C() {
        return address1C;
    }

    /**
     * Sets the value of the address1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress1C(JAXBElement<String> value) {
        this.address1C = value;
    }

    /**
     * Gets the value of the address2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddress2C() {
        return address2C;
    }

    /**
     * Sets the value of the address2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddress2C(JAXBElement<String> value) {
        this.address2C = value;
    }

    /**
     * Gets the value of the cityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityC() {
        return cityC;
    }

    /**
     * Sets the value of the cityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityC(JAXBElement<String> value) {
        this.cityC = value;
    }

    /**
     * Gets the value of the stateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateC() {
        return stateC;
    }

    /**
     * Sets the value of the stateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateC(JAXBElement<String> value) {
        this.stateC = value;
    }

    /**
     * Gets the value of the countryC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryC() {
        return countryC;
    }

    /**
     * Sets the value of the countryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryC(JAXBElement<String> value) {
        this.countryC = value;
    }

    /**
     * Gets the value of the countryCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountryCMeaning() {
        return countryCMeaning;
    }

    /**
     * Sets the value of the countryCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountryCMeaning(JAXBElement<String> value) {
        this.countryCMeaning = value;
    }

    /**
     * Gets the value of the industryTenureC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getIndustryTenureC() {
        return industryTenureC;
    }

    /**
     * Sets the value of the industryTenureC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setIndustryTenureC(JAXBElement<BigDecimal> value) {
        this.industryTenureC = value;
    }

    /**
     * Gets the value of the hdrTenureC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHDRTenureC() {
        return hdrTenureC;
    }

    /**
     * Sets the value of the hdrTenureC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHDRTenureC(JAXBElement<BigDecimal> value) {
        this.hdrTenureC = value;
    }

    /**
     * Gets the value of the experienceOverviewC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getExperienceOverviewC() {
        return experienceOverviewC;
    }

    /**
     * Sets the value of the experienceOverviewC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setExperienceOverviewC(JAXBElement<byte[]> value) {
        this.experienceOverviewC = value;
    }

    /**
     * Gets the value of the experienceGroupNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExperienceGroupNameC() {
        return experienceGroupNameC;
    }

    /**
     * Sets the value of the experienceGroupNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExperienceGroupNameC(JAXBElement<String> value) {
        this.experienceGroupNameC = value;
    }

    /**
     * Gets the value of the experienceLastUpdatedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExperienceLastUpdatedC() {
        return experienceLastUpdatedC;
    }

    /**
     * Sets the value of the experienceLastUpdatedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExperienceLastUpdatedC(JAXBElement<String> value) {
        this.experienceLastUpdatedC = value;
    }

    /**
     * Gets the value of the activityIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getActivityIdC() {
        return activityIdC;
    }

    /**
     * Sets the value of the activityIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setActivityIdC(JAXBElement<BigDecimal> value) {
        this.activityIdC = value;
    }

    /**
     * Gets the value of the activityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getActivityC() {
        return activityC;
    }

    /**
     * Sets the value of the activityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setActivityC(JAXBElement<String> value) {
        this.activityC = value;
    }

    /**
     * Gets the value of the businessClassesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessClassesC() {
        return businessClassesC;
    }

    /**
     * Sets the value of the businessClassesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessClassesC(JAXBElement<String> value) {
        this.businessClassesC = value;
    }

    /**
     * Gets the value of the businessClassesCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessClassesCMeaning() {
        return businessClassesCMeaning;
    }

    /**
     * Sets the value of the businessClassesCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessClassesCMeaning(JAXBElement<String> value) {
        this.businessClassesCMeaning = value;
    }

    /**
     * Gets the value of the businessUnitC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessUnitC() {
        return businessUnitC;
    }

    /**
     * Sets the value of the businessUnitC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessUnitC(JAXBElement<String> value) {
        this.businessUnitC = value;
    }

    /**
     * Gets the value of the businessUnitCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessUnitCMeaning() {
        return businessUnitCMeaning;
    }

    /**
     * Sets the value of the businessUnitCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessUnitCMeaning(JAXBElement<String> value) {
        this.businessUnitCMeaning = value;
    }

    /**
     * Gets the value of the languagesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguagesC() {
        return languagesC;
    }

    /**
     * Sets the value of the languagesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguagesC(JAXBElement<String> value) {
        this.languagesC = value;
    }

    /**
     * Gets the value of the languagesCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLanguagesCMeaning() {
        return languagesCMeaning;
    }

    /**
     * Sets the value of the languagesCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLanguagesCMeaning(JAXBElement<String> value) {
        this.languagesCMeaning = value;
    }

    /**
     * Gets the value of the lastNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastNameC() {
        return lastNameC;
    }

    /**
     * Sets the value of the lastNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastNameC(JAXBElement<String> value) {
        this.lastNameC = value;
    }

    /**
     * Gets the value of the middleInitialsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMiddleInitialsC() {
        return middleInitialsC;
    }

    /**
     * Sets the value of the middleInitialsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMiddleInitialsC(JAXBElement<String> value) {
        this.middleInitialsC = value;
    }

    /**
     * Gets the value of the lastUpdatedByC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdatedByC() {
        return lastUpdatedByC;
    }

    /**
     * Sets the value of the lastUpdatedByC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdatedByC(JAXBElement<String> value) {
        this.lastUpdatedByC = value;
    }

    /**
     * Gets the value of the resumeDataContactsIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getResumeDataContactsIdC() {
        return resumeDataContactsIdC;
    }

    /**
     * Sets the value of the resumeDataContactsIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setResumeDataContactsIdC(JAXBElement<BigDecimal> value) {
        this.resumeDataContactsIdC = value;
    }

    /**
     * Gets the value of the resumeDataContactsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResumeDataContactsC() {
        return resumeDataContactsC;
    }

    /**
     * Sets the value of the resumeDataContactsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResumeDataContactsC(JAXBElement<String> value) {
        this.resumeDataContactsC = value;
    }

    /**
     * Gets the value of the fullNameC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullNameC() {
        return fullNameC;
    }

    /**
     * Sets the value of the fullNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullNameC(String value) {
        this.fullNameC = value;
    }

    /**
     * Gets the value of the doNotPublishC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDoNotPublishC() {
        return doNotPublishC;
    }

    /**
     * Sets the value of the doNotPublishC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDoNotPublishC(Boolean value) {
        this.doNotPublishC = value;
    }

    /**
     * Gets the value of the employeeLegacySystemIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeeLegacySystemIDC() {
        return employeeLegacySystemIDC;
    }

    /**
     * Sets the value of the employeeLegacySystemIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeeLegacySystemIDC(JAXBElement<String> value) {
        this.employeeLegacySystemIDC = value;
    }

    /**
     * Gets the value of the backEndLastUpdatedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBackEndLastUpdatedDateC() {
        return backEndLastUpdatedDateC;
    }

    /**
     * Sets the value of the backEndLastUpdatedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBackEndLastUpdatedDateC(JAXBElement<String> value) {
        this.backEndLastUpdatedDateC = value;
    }

    /**
     * Gets the value of the firstNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFirstNameC() {
        return firstNameC;
    }

    /**
     * Sets the value of the firstNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFirstNameC(JAXBElement<String> value) {
        this.firstNameC = value;
    }

    /**
     * Gets the value of the backendIntegrationDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBackendIntegrationDateC() {
        return backendIntegrationDateC;
    }

    /**
     * Sets the value of the backendIntegrationDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBackendIntegrationDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.backendIntegrationDateC = value;
    }

    /**
     * Gets the value of the integratedEmployeeC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedEmployeeC() {
        return integratedEmployeeC;
    }

    /**
     * Sets the value of the integratedEmployeeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedEmployeeC(Boolean value) {
        this.integratedEmployeeC = value;
    }

    /**
     * Gets the value of the updateDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getUpdateDateC() {
        return updateDateC;
    }

    /**
     * Sets the value of the updateDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setUpdateDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.updateDateC = value;
    }

    /**
     * Gets the value of the ebsEmployeeNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSEmployeeNumberC() {
        return ebsEmployeeNumberC;
    }

    /**
     * Sets the value of the ebsEmployeeNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSEmployeeNumberC(JAXBElement<String> value) {
        this.ebsEmployeeNumberC = value;
    }

    /**
     * Gets the value of the statusC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusC() {
        return statusC;
    }

    /**
     * Sets the value of the statusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusC(JAXBElement<String> value) {
        this.statusC = value;
    }

    /**
     * Gets the value of the employeeProjectsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeProjectsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeProjectsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeeProjectsC }
     * 
     * 
     */
    public List<EmployeeProjectsC> getEmployeeProjectsCollectionCs() {
        if (employeeProjectsCollectionCs == null) {
            employeeProjectsCollectionCs = new ArrayList<EmployeeProjectsC>();
        }
        return this.employeeProjectsCollectionCs;
    }

    /**
     * Gets the value of the licensesCertificationsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licensesCertificationsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicensesCertificationsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LicensesCertificationsC }
     * 
     * 
     */
    public List<LicensesCertificationsC> getLicensesCertificationsCollectionCs() {
        if (licensesCertificationsCollectionCs == null) {
            licensesCertificationsCollectionCs = new ArrayList<LicensesCertificationsC>();
        }
        return this.licensesCertificationsCollectionCs;
    }

    /**
     * Gets the value of the publicationsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publicationsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPublicationsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicationsC }
     * 
     * 
     */
    public List<PublicationsC> getPublicationsCollectionCs() {
        if (publicationsCollectionCs == null) {
            publicationsCollectionCs = new ArrayList<PublicationsC>();
        }
        return this.publicationsCollectionCs;
    }

    /**
     * Gets the value of the presentationsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the presentationsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPresentationsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PresentationsC }
     * 
     * 
     */
    public List<PresentationsC> getPresentationsCollectionCs() {
        if (presentationsCollectionCs == null) {
            presentationsCollectionCs = new ArrayList<PresentationsC>();
        }
        return this.presentationsCollectionCs;
    }

    /**
     * Gets the value of the professionalMembershipsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the professionalMembershipsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfessionalMembershipsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfessionalMembershipsC }
     * 
     * 
     */
    public List<ProfessionalMembershipsC> getProfessionalMembershipsCollectionCs() {
        if (professionalMembershipsCollectionCs == null) {
            professionalMembershipsCollectionCs = new ArrayList<ProfessionalMembershipsC>();
        }
        return this.professionalMembershipsCollectionCs;
    }

    /**
     * Gets the value of the trainingCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trainingCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrainingCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrainingC }
     * 
     * 
     */
    public List<TrainingC> getTrainingCollectionCs() {
        if (trainingCollectionCs == null) {
            trainingCollectionCs = new ArrayList<TrainingC>();
        }
        return this.trainingCollectionCs;
    }

    /**
     * Gets the value of the hdrHonorsAwardsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hdrHonorsAwardsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHDRHonorsAwardsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HDRHonorsAwardsC }
     * 
     * 
     */
    public List<HDRHonorsAwardsC> getHDRHonorsAwardsCollectionCs() {
        if (hdrHonorsAwardsCollectionCs == null) {
            hdrHonorsAwardsCollectionCs = new ArrayList<HDRHonorsAwardsC>();
        }
        return this.hdrHonorsAwardsCollectionCs;
    }

    /**
     * Gets the value of the industryAwardsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the industryAwardsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndustryAwardsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndustryAwardsC }
     * 
     * 
     */
    public List<IndustryAwardsC> getIndustryAwardsCollectionCs() {
        if (industryAwardsCollectionCs == null) {
            industryAwardsCollectionCs = new ArrayList<IndustryAwardsC>();
        }
        return this.industryAwardsCollectionCs;
    }

    /**
     * Gets the value of the notesResumeReferencesCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesResumeReferencesCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesResumeReferencesCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotesResumeReferencesC }
     * 
     * 
     */
    public List<NotesResumeReferencesC> getNotesResumeReferencesCollectionCs() {
        if (notesResumeReferencesCollectionCs == null) {
            notesResumeReferencesCollectionCs = new ArrayList<NotesResumeReferencesC>();
        }
        return this.notesResumeReferencesCollectionCs;
    }

    /**
     * Gets the value of the educationCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the educationCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEducationCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EducationC }
     * 
     * 
     */
    public List<EducationC> getEducationCollectionCs() {
        if (educationCollectionCs == null) {
            educationCollectionCs = new ArrayList<EducationC>();
        }
        return this.educationCollectionCs;
    }

    /**
     * Gets the value of the pastEmploymentCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pastEmploymentCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPastEmploymentCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PastEmploymentC }
     * 
     * 
     */
    public List<PastEmploymentC> getPastEmploymentCollectionCs() {
        if (pastEmploymentCollectionCs == null) {
            pastEmploymentCollectionCs = new ArrayList<PastEmploymentC>();
        }
        return this.pastEmploymentCollectionCs;
    }

    /**
     * Gets the value of the languageCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the languageCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLanguageCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LanguageC }
     * 
     * 
     */
    public List<LanguageC> getLanguageCollectionCs() {
        if (languageCollectionCs == null) {
            languageCollectionCs = new ArrayList<LanguageC>();
        }
        return this.languageCollectionCs;
    }

    /**
     * Gets the value of the academicHonorsAndResearchCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the academicHonorsAndResearchCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcademicHonorsAndResearchCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AcademicHonorsAndResearchC }
     * 
     * 
     */
    public List<AcademicHonorsAndResearchC> getAcademicHonorsAndResearchCollectionCs() {
        if (academicHonorsAndResearchCollectionCs == null) {
            academicHonorsAndResearchCollectionCs = new ArrayList<AcademicHonorsAndResearchC>();
        }
        return this.academicHonorsAndResearchCollectionCs;
    }

    /**
     * Gets the value of the activitiesCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the activitiesCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActivitiesCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ActivitiesC }
     * 
     * 
     */
    public List<ActivitiesC> getActivitiesCollectionCs() {
        if (activitiesCollectionCs == null) {
            activitiesCollectionCs = new ArrayList<ActivitiesC>();
        }
        return this.activitiesCollectionCs;
    }

    /**
     * Gets the value of the additionalOverviewsBiosCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalOverviewsBiosCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalOverviewsBiosCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalOverviewsBiosC }
     * 
     * 
     */
    public List<AdditionalOverviewsBiosC> getAdditionalOverviewsBiosCollectionCs() {
        if (additionalOverviewsBiosCollectionCs == null) {
            additionalOverviewsBiosCollectionCs = new ArrayList<AdditionalOverviewsBiosC>();
        }
        return this.additionalOverviewsBiosCollectionCs;
    }

    /**
     * Gets the value of the additionalProjectsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalProjectsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalProjectsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdditionalProjectsC }
     * 
     * 
     */
    public List<AdditionalProjectsC> getAdditionalProjectsCollectionCs() {
        if (additionalProjectsCollectionCs == null) {
            additionalProjectsCollectionCs = new ArrayList<AdditionalProjectsC>();
        }
        return this.additionalProjectsCollectionCs;
    }

}
