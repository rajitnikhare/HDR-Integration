
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
 * <p>Java class for Projects_c complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Projects_c">
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
 *         &lt;element name="BillableCompany_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BillableCompany_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCompany_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrimaryCompany_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCompanyAddress_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="BillableCompanyAddress_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="KeyProject_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProjectNotConstructed_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketingProjectName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractDescription_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FederalNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestrictionComments_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="PreBookingID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryDescription_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="AdditionalDescription_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="OpportunityName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBusinessGroupFromContra_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryBusinessClassFromContra_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalBusinessGroups_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalBusinessClasses_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSectorDescription_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="ProfessionalServicesDates_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ConstructionCompletionDates_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PrimaryGSACodeFromContract_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSACode1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSACode2_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSACode3_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSACode4_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSACode5_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatedGrossFeeUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ActualGrossFeeUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedNetFeeUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ActualNetFeeUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedSubConsultantFeeUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ActualSubConsultantFeeUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedConstructionCostUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ActualConstructionCostUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedTotalProjectCostUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ActualTotalProjectCostUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ConstructionBidUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="CostFeesDescription_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="Amount_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="KeyComparativeFeaturesBenefits_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectDescriptionGeneralOverv_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="Title_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_code_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Locale_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="VendorId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Subconsultant_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualCostUSD_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ServiceProvided_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Client_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ClientDescription_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="AdditionalProject_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalProjectDescription_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="Integration_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntegrationDescription_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="BusinessClass_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClassDescription_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressSequenceNumber_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Customer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HDRRole_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HDRRole_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyProjectType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyProjectType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityNameS_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpportunityNameS_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingDataContact_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MarketingDataContact_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSector_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSector_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractStatus_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestrictionType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RestrictionType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubComponent_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubComponent_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Component_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Component_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAreaFacilityType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAreaFacilityType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalProjectType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdditionalProjectType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnterpriseType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnterpriseType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Favorable_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Confidential_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Location_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterContractName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfidentialforCosts_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConfidentialforDates_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ServiceType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractProject_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ContractProject_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Reference_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProjectStartDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProjectEndDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Data_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Data_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Type_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SustainableRating_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SustainableRating_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoticeToProceed_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="FirstActivityDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LastActivityDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProjectName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SustainableRatings_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SustainableRatings_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatedCompletionDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PrimaryMarketingRecord_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="GSACode_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSACode_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfessionalServices_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfessionalServices_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FacilityType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpaceComponents_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpaceComponents_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResearchType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ResearchType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectTypes_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectTypes_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldingRoomType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HoldingRoomType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SF330ProfileCode_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KeyWords_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClasses_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClasses_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAreaFacilityTypes_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ServiceAreaFacilityTypes_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Components_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Components_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubComponents_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubComponents_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClassDescriptionS_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClassDescriptionS_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessGroup_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessGroup_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubComponentNew_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubComponentNew_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSACodes_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSACodes_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SF330Code_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SF330Code_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SF330ProfileCodes_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SF330ProfileCodes_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessGroups_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessGroups_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryMethod_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryMethod_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterContractID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryGSACodesAndSF330Code_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Componentss_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSectors_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnits_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessGroupss_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClassess_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingClientName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectLegacySystemID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackEndLastUpdatedDate_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActualStartDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ActualFinishDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PlannedStartDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PlannedFinishDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Department_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FederalContractNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillableClient_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BillableClient_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractNames_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ContractNames_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataContact_EmailAddress_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BookedFee_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ProjectBusinessGroup_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityForReporting_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryCompanyForReporting_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IntBackEndLastUpdatedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="BackEndLastUpdatedDateInt_c" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="IntegratedProject_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Currency1_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportingPrimaryAccount_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportingBillableAccount_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReportingDataContact_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSProjectNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSProjectID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingChargeNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatesMilestonesCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}DatesMilestones_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MeasuresCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Measures_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectAwardsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}ProjectAwards_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SubconsultantCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Subconsultant_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="LocationCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Location_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="AditonalProjectsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}AditonalProjects_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CostsFeesCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}CostsFees_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="BillableCompanyCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}BillableCompany_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrimaryCompanyCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}PrimaryCompany_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectDescriptionCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}ProjectDescription_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OwnerCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Owner_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectNamesCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}ProjectNames_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="FacilityTypesCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}FacilityTypes_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Contacts_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectTeamCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}ProjectTeam_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectServicesCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}ProjectServices_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TestimonialsCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}Testimonials_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="NotesAdditionalDescriptionCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}NotesAdditionalDescription_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ClientOwnerReferencesCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}ClientOwnerReferences_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GSACodesCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}GSACodes_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectAwardNewCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}ProjectAwardNew_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="GSACodeCollection_c" type="{/oracle/apps/sales/custExtn/views/common/}GSA_Codes_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Projects_c", propOrder = {
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
    "billableCompanyIdC",
    "billableCompanyC",
    "primaryCompanyIdC",
    "primaryCompanyC",
    "primaryCompanyAddressC",
    "billableCompanyAddressC",
    "keyProjectC",
    "projectNotConstructedC",
    "marketingProjectNameC",
    "contractIDC",
    "contractDescriptionC",
    "federalNumberC",
    "restrictionCommentsC",
    "preBookingIDC",
    "primaryDescriptionC",
    "additionalDescriptionC",
    "opportunityNameC",
    "opportunityIdC",
    "primaryBusinessGroupFromContraC",
    "primaryBusinessClassFromContraC",
    "additionalBusinessGroupsC",
    "additionalBusinessClassesC",
    "marketSectorDescriptionC",
    "professionalServicesDatesC",
    "constructionCompletionDatesC",
    "primaryGSACodeFromContractC",
    "gsaCode1C",
    "gsaCode2C",
    "gsaCode3C",
    "gsaCode4C",
    "gsaCode5C",
    "estimatedGrossFeeUSDC",
    "actualGrossFeeUSDC",
    "estimatedNetFeeUSDC",
    "actualNetFeeUSDC",
    "estimatedSubConsultantFeeUSDC",
    "actualSubConsultantFeeUSDC",
    "estimatedConstructionCostUSDC",
    "actualConstructionCostUSDC",
    "estimatedTotalProjectCostUSDC",
    "actualTotalProjectCostUSDC",
    "constructionBidUSDC",
    "costFeesDescriptionC",
    "amountC",
    "keyComparativeFeaturesBenefitsC",
    "projectDescriptionGeneralOvervC",
    "titleC",
    "locationCodeC",
    "localeC",
    "countyC",
    "stateC",
    "vendorIdC",
    "subconsultantC",
    "actualCostUSDC",
    "serviceProvidedC",
    "clientC",
    "clientDescriptionC",
    "additionalProjectC",
    "additionalProjectDescriptionC",
    "integrationC",
    "integrationDescriptionC",
    "businessClassC",
    "businessClassDescriptionC",
    "ownerIdC",
    "addressSequenceNumberC",
    "customerC",
    "cityC",
    "postalCodeC",
    "hdrRoleC",
    "hdrRoleCMeaning",
    "businessUnitC",
    "businessUnitCMeaning",
    "keyProjectTypeC",
    "keyProjectTypeCMeaning",
    "opportunityNameSIdC",
    "opportunityNameSC",
    "marketingDataContactIdC",
    "marketingDataContactC",
    "marketSectorC",
    "marketSectorCMeaning",
    "contractStatusC",
    "contractStatusCMeaning",
    "projectTypeC",
    "projectTypeCMeaning",
    "restrictionTypeC",
    "restrictionTypeCMeaning",
    "subComponentC",
    "subComponentCMeaning",
    "componentC",
    "componentCMeaning",
    "serviceAreaFacilityTypeC",
    "serviceAreaFacilityTypeCMeaning",
    "countryC",
    "countryCMeaning",
    "additionalProjectTypeC",
    "additionalProjectTypeCMeaning",
    "enterpriseTypeC",
    "enterpriseTypeCMeaning",
    "favorableC",
    "confidentialC",
    "locationC",
    "masterContractNameC",
    "contractNameC",
    "confidentialforCostsC",
    "confidentialforDatesC",
    "serviceTypeC",
    "serviceTypeCMeaning",
    "contractProjectIdC",
    "contractProjectC",
    "referenceC",
    "projectStartDateC",
    "projectEndDateC",
    "dataIdC",
    "dataC",
    "typeC",
    "typeCMeaning",
    "sustainableRatingC",
    "sustainableRatingCMeaning",
    "noticeToProceedC",
    "firstActivityDateC",
    "lastActivityDateC",
    "projectNameC",
    "companyC",
    "companyCMeaning",
    "sustainableRatingsC",
    "sustainableRatingsCMeaning",
    "estimatedCompletionDateC",
    "primaryMarketingRecordC",
    "gsaCodeC",
    "gsaCodeCMeaning",
    "professionalServicesC",
    "professionalServicesCMeaning",
    "facilityTypeC",
    "facilityTypeCMeaning",
    "spaceComponentsC",
    "spaceComponentsCMeaning",
    "researchTypeC",
    "researchTypeCMeaning",
    "projectTypesC",
    "projectTypesCMeaning",
    "holdingRoomTypeC",
    "holdingRoomTypeCMeaning",
    "sf330ProfileCodeC",
    "keyWordsC",
    "businessClassesC",
    "businessClassesCMeaning",
    "serviceAreaFacilityTypesC",
    "serviceAreaFacilityTypesCMeaning",
    "componentsC",
    "componentsCMeaning",
    "subComponentsC",
    "subComponentsCMeaning",
    "businessClassDescriptionSC",
    "businessClassDescriptionSCMeaning",
    "businessGroupC",
    "businessGroupCMeaning",
    "subComponentNewC",
    "subComponentNewCMeaning",
    "gsaCodesC",
    "gsaCodesCMeaning",
    "sf330CodeC",
    "sf330CodeCMeaning",
    "sf330ProfileCodesC",
    "sf330ProfileCodesCMeaning",
    "businessGroupsC",
    "businessGroupsCMeaning",
    "deliveryMethodC",
    "deliveryMethodCMeaning",
    "currencyC",
    "currencyCMeaning",
    "masterContractIDC",
    "primaryGSACodesAndSF330CodeC",
    "componentssC",
    "marketSectorsC",
    "businessUnitsC",
    "businessGroupssC",
    "businessClassessC",
    "marketingClientNameC",
    "projectLegacySystemIDC",
    "ebsidc",
    "contractTypeC",
    "backEndLastUpdatedDateC",
    "actualStartDateC",
    "actualFinishDateC",
    "plannedStartDateC",
    "plannedFinishDateC",
    "departmentC",
    "federalContractNumberC",
    "billableClientIdC",
    "billableClientC",
    "contractNamesIdC",
    "contractNamesC",
    "dataContactEmailAddressC",
    "bookedFeeC",
    "projectBusinessGroupC",
    "opportunityForReportingC",
    "primaryCompanyForReportingC",
    "intBackEndLastUpdatedDateC",
    "backEndLastUpdatedDateIntC",
    "integratedProjectC",
    "currency1C",
    "reportingPrimaryAccountC",
    "reportingBillableAccountC",
    "reportingDataContactC",
    "ebsProjectNumberC",
    "ebsProjectIDC",
    "marketingChargeNumberC",
    "datesMilestonesCollectionCs",
    "measuresCollectionCs",
    "projectAwardsCollectionCs",
    "subconsultantCollectionCs",
    "locationCollectionCs",
    "aditonalProjectsCollectionCs",
    "costsFeesCollectionCs",
    "billableCompanyCollectionCs",
    "primaryCompanyCollectionCs",
    "projectDescriptionCollectionCs",
    "ownerCollectionCs",
    "projectNamesCollectionCs",
    "facilityTypesCollectionCs",
    "contactsCollectionCs",
    "projectTeamCollectionCs",
    "projectServicesCollectionCs",
    "testimonialsCollectionCs",
    "notesAdditionalDescriptionCollectionCs",
    "clientOwnerReferencesCollectionCs",
    "gsaCodesCollectionCs",
    "projectAwardNewCollectionCs",
    "gsaCodeCollectionCs"
})
@XmlRootElement(name = "projects_c")
public class ProjectsC {

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
    @XmlElementRef(name = "BillableCompany_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> billableCompanyIdC;
    @XmlElementRef(name = "BillableCompany_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billableCompanyC;
    @XmlElementRef(name = "PrimaryCompany_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> primaryCompanyIdC;
    @XmlElementRef(name = "PrimaryCompany_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryCompanyC;
    @XmlElementRef(name = "PrimaryCompanyAddress_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> primaryCompanyAddressC;
    @XmlElementRef(name = "BillableCompanyAddress_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> billableCompanyAddressC;
    @XmlElement(name = "KeyProject_c")
    protected Boolean keyProjectC;
    @XmlElement(name = "ProjectNotConstructed_c")
    protected Boolean projectNotConstructedC;
    @XmlElementRef(name = "MarketingProjectName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingProjectNameC;
    @XmlElementRef(name = "ContractID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractIDC;
    @XmlElementRef(name = "ContractDescription_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractDescriptionC;
    @XmlElementRef(name = "FederalNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> federalNumberC;
    @XmlElementRef(name = "RestrictionComments_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> restrictionCommentsC;
    @XmlElementRef(name = "PreBookingID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preBookingIDC;
    @XmlElementRef(name = "PrimaryDescription_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> primaryDescriptionC;
    @XmlElementRef(name = "AdditionalDescription_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> additionalDescriptionC;
    @XmlElementRef(name = "OpportunityName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityNameC;
    @XmlElementRef(name = "OpportunityId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityIdC;
    @XmlElementRef(name = "PrimaryBusinessGroupFromContra_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryBusinessGroupFromContraC;
    @XmlElementRef(name = "PrimaryBusinessClassFromContra_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryBusinessClassFromContraC;
    @XmlElementRef(name = "AdditionalBusinessGroups_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalBusinessGroupsC;
    @XmlElementRef(name = "AdditionalBusinessClasses_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalBusinessClassesC;
    @XmlElementRef(name = "MarketSectorDescription_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> marketSectorDescriptionC;
    @XmlElementRef(name = "ProfessionalServicesDates_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> professionalServicesDatesC;
    @XmlElementRef(name = "ConstructionCompletionDates_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> constructionCompletionDatesC;
    @XmlElementRef(name = "PrimaryGSACodeFromContract_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryGSACodeFromContractC;
    @XmlElementRef(name = "GSACode1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gsaCode1C;
    @XmlElementRef(name = "GSACode2_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gsaCode2C;
    @XmlElementRef(name = "GSACode3_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gsaCode3C;
    @XmlElementRef(name = "GSACode4_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gsaCode4C;
    @XmlElementRef(name = "GSACode5_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gsaCode5C;
    @XmlElementRef(name = "EstimatedGrossFeeUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> estimatedGrossFeeUSDC;
    @XmlElementRef(name = "ActualGrossFeeUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> actualGrossFeeUSDC;
    @XmlElementRef(name = "EstimatedNetFeeUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> estimatedNetFeeUSDC;
    @XmlElementRef(name = "ActualNetFeeUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> actualNetFeeUSDC;
    @XmlElementRef(name = "EstimatedSubConsultantFeeUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> estimatedSubConsultantFeeUSDC;
    @XmlElementRef(name = "ActualSubConsultantFeeUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> actualSubConsultantFeeUSDC;
    @XmlElementRef(name = "EstimatedConstructionCostUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> estimatedConstructionCostUSDC;
    @XmlElementRef(name = "ActualConstructionCostUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> actualConstructionCostUSDC;
    @XmlElementRef(name = "EstimatedTotalProjectCostUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> estimatedTotalProjectCostUSDC;
    @XmlElementRef(name = "ActualTotalProjectCostUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> actualTotalProjectCostUSDC;
    @XmlElementRef(name = "ConstructionBidUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> constructionBidUSDC;
    @XmlElementRef(name = "CostFeesDescription_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> costFeesDescriptionC;
    @XmlElementRef(name = "Amount_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> amountC;
    @XmlElementRef(name = "KeyComparativeFeaturesBenefits_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyComparativeFeaturesBenefitsC;
    @XmlElementRef(name = "ProjectDescriptionGeneralOverv_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> projectDescriptionGeneralOvervC;
    @XmlElementRef(name = "Title_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> titleC;
    @XmlElementRef(name = "Location_code_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationCodeC;
    @XmlElementRef(name = "Locale_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localeC;
    @XmlElementRef(name = "County_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countyC;
    @XmlElementRef(name = "State_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateC;
    @XmlElementRef(name = "VendorId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorIdC;
    @XmlElementRef(name = "Subconsultant_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subconsultantC;
    @XmlElementRef(name = "ActualCostUSD_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> actualCostUSDC;
    @XmlElementRef(name = "ServiceProvided_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceProvidedC;
    @XmlElementRef(name = "Client_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> clientC;
    @XmlElementRef(name = "ClientDescription_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> clientDescriptionC;
    @XmlElementRef(name = "AdditionalProject_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalProjectC;
    @XmlElementRef(name = "AdditionalProjectDescription_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> additionalProjectDescriptionC;
    @XmlElementRef(name = "Integration_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> integrationC;
    @XmlElementRef(name = "IntegrationDescription_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> integrationDescriptionC;
    @XmlElementRef(name = "BusinessClass_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassC;
    @XmlElementRef(name = "BusinessClassDescription_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassDescriptionC;
    @XmlElementRef(name = "OwnerId_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerIdC;
    @XmlElementRef(name = "AddressSequenceNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> addressSequenceNumberC;
    @XmlElementRef(name = "Customer_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> customerC;
    @XmlElementRef(name = "City_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityC;
    @XmlElementRef(name = "PostalCode_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCodeC;
    @XmlElementRef(name = "HDRRole_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hdrRoleC;
    @XmlElementRef(name = "HDRRole_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hdrRoleCMeaning;
    @XmlElementRef(name = "BusinessUnit_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitC;
    @XmlElementRef(name = "BusinessUnit_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitCMeaning;
    @XmlElementRef(name = "KeyProjectType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyProjectTypeC;
    @XmlElementRef(name = "KeyProjectType_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyProjectTypeCMeaning;
    @XmlElementRef(name = "OpportunityNameS_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> opportunityNameSIdC;
    @XmlElementRef(name = "OpportunityNameS_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityNameSC;
    @XmlElementRef(name = "MarketingDataContact_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> marketingDataContactIdC;
    @XmlElementRef(name = "MarketingDataContact_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingDataContactC;
    @XmlElementRef(name = "MarketSector_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorC;
    @XmlElementRef(name = "MarketSector_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorCMeaning;
    @XmlElementRef(name = "ContractStatus_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractStatusC;
    @XmlElementRef(name = "ContractStatus_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractStatusCMeaning;
    @XmlElementRef(name = "ProjectType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectTypeC;
    @XmlElementRef(name = "ProjectType_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectTypeCMeaning;
    @XmlElementRef(name = "RestrictionType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> restrictionTypeC;
    @XmlElementRef(name = "RestrictionType_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> restrictionTypeCMeaning;
    @XmlElementRef(name = "SubComponent_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subComponentC;
    @XmlElementRef(name = "SubComponent_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subComponentCMeaning;
    @XmlElementRef(name = "Component_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componentC;
    @XmlElementRef(name = "Component_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componentCMeaning;
    @XmlElementRef(name = "ServiceAreaFacilityType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceAreaFacilityTypeC;
    @XmlElementRef(name = "ServiceAreaFacilityType_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceAreaFacilityTypeCMeaning;
    @XmlElementRef(name = "Country_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryC;
    @XmlElementRef(name = "Country_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countryCMeaning;
    @XmlElementRef(name = "AdditionalProjectType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalProjectTypeC;
    @XmlElementRef(name = "AdditionalProjectType_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> additionalProjectTypeCMeaning;
    @XmlElementRef(name = "EnterpriseType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enterpriseTypeC;
    @XmlElementRef(name = "EnterpriseType_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enterpriseTypeCMeaning;
    @XmlElement(name = "Favorable_c")
    protected Boolean favorableC;
    @XmlElement(name = "Confidential_c")
    protected Boolean confidentialC;
    @XmlElementRef(name = "Location_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationC;
    @XmlElementRef(name = "MasterContractName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterContractNameC;
    @XmlElementRef(name = "ContractName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractNameC;
    @XmlElement(name = "ConfidentialforCosts_c")
    protected Boolean confidentialforCostsC;
    @XmlElement(name = "ConfidentialforDates_c")
    protected Boolean confidentialforDatesC;
    @XmlElementRef(name = "ServiceType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceTypeC;
    @XmlElementRef(name = "ServiceType_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceTypeCMeaning;
    @XmlElementRef(name = "ContractProject_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> contractProjectIdC;
    @XmlElementRef(name = "ContractProject_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractProjectC;
    @XmlElement(name = "Reference_c")
    protected Boolean referenceC;
    @XmlElementRef(name = "ProjectStartDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> projectStartDateC;
    @XmlElementRef(name = "ProjectEndDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> projectEndDateC;
    @XmlElementRef(name = "Data_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> dataIdC;
    @XmlElementRef(name = "Data_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataC;
    @XmlElementRef(name = "Type_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeC;
    @XmlElementRef(name = "Type_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeCMeaning;
    @XmlElementRef(name = "SustainableRating_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sustainableRatingC;
    @XmlElementRef(name = "SustainableRating_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sustainableRatingCMeaning;
    @XmlElementRef(name = "NoticeToProceed_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> noticeToProceedC;
    @XmlElementRef(name = "FirstActivityDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> firstActivityDateC;
    @XmlElementRef(name = "LastActivityDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastActivityDateC;
    @XmlElement(name = "ProjectName_c")
    protected String projectNameC;
    @XmlElementRef(name = "Company_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyC;
    @XmlElementRef(name = "Company_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyCMeaning;
    @XmlElementRef(name = "SustainableRatings_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sustainableRatingsC;
    @XmlElementRef(name = "SustainableRatings_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sustainableRatingsCMeaning;
    @XmlElementRef(name = "EstimatedCompletionDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> estimatedCompletionDateC;
    @XmlElement(name = "PrimaryMarketingRecord_c")
    protected Boolean primaryMarketingRecordC;
    @XmlElementRef(name = "GSACode_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gsaCodeC;
    @XmlElementRef(name = "GSACode_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gsaCodeCMeaning;
    @XmlElementRef(name = "ProfessionalServices_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> professionalServicesC;
    @XmlElementRef(name = "ProfessionalServices_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> professionalServicesCMeaning;
    @XmlElementRef(name = "FacilityType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> facilityTypeC;
    @XmlElementRef(name = "FacilityType_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> facilityTypeCMeaning;
    @XmlElementRef(name = "SpaceComponents_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spaceComponentsC;
    @XmlElementRef(name = "SpaceComponents_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> spaceComponentsCMeaning;
    @XmlElementRef(name = "ResearchType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> researchTypeC;
    @XmlElementRef(name = "ResearchType_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> researchTypeCMeaning;
    @XmlElementRef(name = "ProjectTypes_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectTypesC;
    @XmlElementRef(name = "ProjectTypes_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectTypesCMeaning;
    @XmlElementRef(name = "HoldingRoomType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> holdingRoomTypeC;
    @XmlElementRef(name = "HoldingRoomType_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> holdingRoomTypeCMeaning;
    @XmlElementRef(name = "SF330ProfileCode_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sf330ProfileCodeC;
    @XmlElementRef(name = "KeyWords_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> keyWordsC;
    @XmlElementRef(name = "BusinessClasses_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassesC;
    @XmlElementRef(name = "BusinessClasses_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassesCMeaning;
    @XmlElementRef(name = "ServiceAreaFacilityTypes_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceAreaFacilityTypesC;
    @XmlElementRef(name = "ServiceAreaFacilityTypes_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceAreaFacilityTypesCMeaning;
    @XmlElementRef(name = "Components_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componentsC;
    @XmlElementRef(name = "Components_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componentsCMeaning;
    @XmlElementRef(name = "SubComponents_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subComponentsC;
    @XmlElementRef(name = "SubComponents_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subComponentsCMeaning;
    @XmlElementRef(name = "BusinessClassDescriptionS_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassDescriptionSC;
    @XmlElementRef(name = "BusinessClassDescriptionS_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassDescriptionSCMeaning;
    @XmlElementRef(name = "BusinessGroup_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessGroupC;
    @XmlElementRef(name = "BusinessGroup_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessGroupCMeaning;
    @XmlElementRef(name = "SubComponentNew_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subComponentNewC;
    @XmlElementRef(name = "SubComponentNew_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subComponentNewCMeaning;
    @XmlElementRef(name = "GSACodes_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gsaCodesC;
    @XmlElementRef(name = "GSACodes_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gsaCodesCMeaning;
    @XmlElementRef(name = "SF330Code_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sf330CodeC;
    @XmlElementRef(name = "SF330Code_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sf330CodeCMeaning;
    @XmlElementRef(name = "SF330ProfileCodes_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sf330ProfileCodesC;
    @XmlElementRef(name = "SF330ProfileCodes_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sf330ProfileCodesCMeaning;
    @XmlElementRef(name = "BusinessGroups_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessGroupsC;
    @XmlElementRef(name = "BusinessGroups_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessGroupsCMeaning;
    @XmlElementRef(name = "DeliveryMethod_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryMethodC;
    @XmlElementRef(name = "DeliveryMethod_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryMethodCMeaning;
    @XmlElementRef(name = "Currency_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyC;
    @XmlElementRef(name = "Currency_cMeaning", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCMeaning;
    @XmlElementRef(name = "MasterContractID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterContractIDC;
    @XmlElementRef(name = "PrimaryGSACodesAndSF330Code_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryGSACodesAndSF330CodeC;
    @XmlElementRef(name = "Componentss_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> componentssC;
    @XmlElementRef(name = "MarketSectors_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorsC;
    @XmlElementRef(name = "BusinessUnits_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitsC;
    @XmlElementRef(name = "BusinessGroupss_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessGroupssC;
    @XmlElementRef(name = "BusinessClassess_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassessC;
    @XmlElementRef(name = "MarketingClientName_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingClientNameC;
    @XmlElementRef(name = "ProjectLegacySystemID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectLegacySystemIDC;
    @XmlElementRef(name = "EBSID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsidc;
    @XmlElementRef(name = "ContractType_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractTypeC;
    @XmlElementRef(name = "BackEndLastUpdatedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backEndLastUpdatedDateC;
    @XmlElementRef(name = "ActualStartDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualStartDateC;
    @XmlElementRef(name = "ActualFinishDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualFinishDateC;
    @XmlElementRef(name = "PlannedStartDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedStartDateC;
    @XmlElementRef(name = "PlannedFinishDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> plannedFinishDateC;
    @XmlElementRef(name = "Department_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentC;
    @XmlElementRef(name = "FederalContractNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> federalContractNumberC;
    @XmlElementRef(name = "BillableClient_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> billableClientIdC;
    @XmlElementRef(name = "BillableClient_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billableClientC;
    @XmlElementRef(name = "ContractNames_Id_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> contractNamesIdC;
    @XmlElementRef(name = "ContractNames_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractNamesC;
    @XmlElementRef(name = "DataContact_EmailAddress_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataContactEmailAddressC;
    @XmlElementRef(name = "BookedFee_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> bookedFeeC;
    @XmlElementRef(name = "ProjectBusinessGroup_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectBusinessGroupC;
    @XmlElementRef(name = "OpportunityForReporting_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityForReportingC;
    @XmlElementRef(name = "PrimaryCompanyForReporting_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryCompanyForReportingC;
    @XmlElementRef(name = "IntBackEndLastUpdatedDate_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> intBackEndLastUpdatedDateC;
    @XmlElementRef(name = "BackEndLastUpdatedDateInt_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> backEndLastUpdatedDateIntC;
    @XmlElement(name = "IntegratedProject_c")
    protected Boolean integratedProjectC;
    @XmlElementRef(name = "Currency1_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currency1C;
    @XmlElementRef(name = "ReportingPrimaryAccount_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportingPrimaryAccountC;
    @XmlElementRef(name = "ReportingBillableAccount_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportingBillableAccountC;
    @XmlElementRef(name = "ReportingDataContact_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reportingDataContactC;
    @XmlElementRef(name = "EBSProjectNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsProjectNumberC;
    @XmlElementRef(name = "EBSProjectID_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsProjectIDC;
    @XmlElementRef(name = "MarketingChargeNumber_c", namespace = "/oracle/apps/sales/custExtn/views/common/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingChargeNumberC;
    @XmlElement(name = "DatesMilestonesCollection_c")
    protected List<DatesMilestonesC> datesMilestonesCollectionCs;
    @XmlElement(name = "MeasuresCollection_c")
    protected List<MeasuresC> measuresCollectionCs;
    @XmlElement(name = "ProjectAwardsCollection_c")
    protected List<ProjectAwardsC> projectAwardsCollectionCs;
    @XmlElement(name = "SubconsultantCollection_c")
    protected List<SubconsultantC> subconsultantCollectionCs;
    @XmlElement(name = "LocationCollection_c")
    protected List<LocationC> locationCollectionCs;
    @XmlElement(name = "AditonalProjectsCollection_c")
    protected List<AditonalProjectsC> aditonalProjectsCollectionCs;
    @XmlElement(name = "CostsFeesCollection_c")
    protected List<CostsFeesC> costsFeesCollectionCs;
    @XmlElement(name = "BillableCompanyCollection_c")
    protected List<BillableCompanyC> billableCompanyCollectionCs;
    @XmlElement(name = "PrimaryCompanyCollection_c")
    protected List<PrimaryCompanyC> primaryCompanyCollectionCs;
    @XmlElement(name = "ProjectDescriptionCollection_c")
    protected List<ProjectDescriptionC> projectDescriptionCollectionCs;
    @XmlElement(name = "OwnerCollection_c")
    protected List<OwnerC> ownerCollectionCs;
    @XmlElement(name = "ProjectNamesCollection_c")
    protected List<ProjectNamesC> projectNamesCollectionCs;
    @XmlElement(name = "FacilityTypesCollection_c")
    protected List<FacilityTypesC> facilityTypesCollectionCs;
    @XmlElement(name = "ContactsCollection_c")
    protected List<ContactsC> contactsCollectionCs;
    @XmlElement(name = "ProjectTeamCollection_c")
    protected List<ProjectTeamC> projectTeamCollectionCs;
    @XmlElement(name = "ProjectServicesCollection_c")
    protected List<ProjectServicesC> projectServicesCollectionCs;
    @XmlElement(name = "TestimonialsCollection_c")
    protected List<TestimonialsC> testimonialsCollectionCs;
    @XmlElement(name = "NotesAdditionalDescriptionCollection_c")
    protected List<NotesAdditionalDescriptionC> notesAdditionalDescriptionCollectionCs;
    @XmlElement(name = "ClientOwnerReferencesCollection_c")
    protected List<ClientOwnerReferencesC> clientOwnerReferencesCollectionCs;
    @XmlElement(name = "GSACodesCollection_c")
    protected List<GSACodesC> gsaCodesCollectionCs;
    @XmlElement(name = "ProjectAwardNewCollection_c")
    protected List<ProjectAwardNewC> projectAwardNewCollectionCs;
    @XmlElement(name = "GSACodeCollection_c")
    protected List<GSACodesC2> gsaCodeCollectionCs;

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
     * Gets the value of the billableCompanyIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBillableCompanyIdC() {
        return billableCompanyIdC;
    }

    /**
     * Sets the value of the billableCompanyIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBillableCompanyIdC(JAXBElement<BigDecimal> value) {
        this.billableCompanyIdC = value;
    }

    /**
     * Gets the value of the billableCompanyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillableCompanyC() {
        return billableCompanyC;
    }

    /**
     * Sets the value of the billableCompanyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillableCompanyC(JAXBElement<String> value) {
        this.billableCompanyC = value;
    }

    /**
     * Gets the value of the primaryCompanyIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrimaryCompanyIdC() {
        return primaryCompanyIdC;
    }

    /**
     * Sets the value of the primaryCompanyIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrimaryCompanyIdC(JAXBElement<BigDecimal> value) {
        this.primaryCompanyIdC = value;
    }

    /**
     * Gets the value of the primaryCompanyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryCompanyC() {
        return primaryCompanyC;
    }

    /**
     * Sets the value of the primaryCompanyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryCompanyC(JAXBElement<String> value) {
        this.primaryCompanyC = value;
    }

    /**
     * Gets the value of the primaryCompanyAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPrimaryCompanyAddressC() {
        return primaryCompanyAddressC;
    }

    /**
     * Sets the value of the primaryCompanyAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPrimaryCompanyAddressC(JAXBElement<byte[]> value) {
        this.primaryCompanyAddressC = value;
    }

    /**
     * Gets the value of the billableCompanyAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBillableCompanyAddressC() {
        return billableCompanyAddressC;
    }

    /**
     * Sets the value of the billableCompanyAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBillableCompanyAddressC(JAXBElement<byte[]> value) {
        this.billableCompanyAddressC = value;
    }

    /**
     * Gets the value of the keyProjectC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isKeyProjectC() {
        return keyProjectC;
    }

    /**
     * Sets the value of the keyProjectC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setKeyProjectC(Boolean value) {
        this.keyProjectC = value;
    }

    /**
     * Gets the value of the projectNotConstructedC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isProjectNotConstructedC() {
        return projectNotConstructedC;
    }

    /**
     * Sets the value of the projectNotConstructedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProjectNotConstructedC(Boolean value) {
        this.projectNotConstructedC = value;
    }

    /**
     * Gets the value of the marketingProjectNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingProjectNameC() {
        return marketingProjectNameC;
    }

    /**
     * Sets the value of the marketingProjectNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingProjectNameC(JAXBElement<String> value) {
        this.marketingProjectNameC = value;
    }

    /**
     * Gets the value of the contractIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractIDC() {
        return contractIDC;
    }

    /**
     * Sets the value of the contractIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractIDC(JAXBElement<String> value) {
        this.contractIDC = value;
    }

    /**
     * Gets the value of the contractDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractDescriptionC() {
        return contractDescriptionC;
    }

    /**
     * Sets the value of the contractDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractDescriptionC(JAXBElement<String> value) {
        this.contractDescriptionC = value;
    }

    /**
     * Gets the value of the federalNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFederalNumberC() {
        return federalNumberC;
    }

    /**
     * Sets the value of the federalNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFederalNumberC(JAXBElement<String> value) {
        this.federalNumberC = value;
    }

    /**
     * Gets the value of the restrictionCommentsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getRestrictionCommentsC() {
        return restrictionCommentsC;
    }

    /**
     * Sets the value of the restrictionCommentsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setRestrictionCommentsC(JAXBElement<byte[]> value) {
        this.restrictionCommentsC = value;
    }

    /**
     * Gets the value of the preBookingIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreBookingIDC() {
        return preBookingIDC;
    }

    /**
     * Sets the value of the preBookingIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreBookingIDC(JAXBElement<String> value) {
        this.preBookingIDC = value;
    }

    /**
     * Gets the value of the primaryDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getPrimaryDescriptionC() {
        return primaryDescriptionC;
    }

    /**
     * Sets the value of the primaryDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setPrimaryDescriptionC(JAXBElement<byte[]> value) {
        this.primaryDescriptionC = value;
    }

    /**
     * Gets the value of the additionalDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getAdditionalDescriptionC() {
        return additionalDescriptionC;
    }

    /**
     * Sets the value of the additionalDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setAdditionalDescriptionC(JAXBElement<byte[]> value) {
        this.additionalDescriptionC = value;
    }

    /**
     * Gets the value of the opportunityNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityNameC() {
        return opportunityNameC;
    }

    /**
     * Sets the value of the opportunityNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityNameC(JAXBElement<String> value) {
        this.opportunityNameC = value;
    }

    /**
     * Gets the value of the opportunityIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityIdC() {
        return opportunityIdC;
    }

    /**
     * Sets the value of the opportunityIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityIdC(JAXBElement<String> value) {
        this.opportunityIdC = value;
    }

    /**
     * Gets the value of the primaryBusinessGroupFromContraC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryBusinessGroupFromContraC() {
        return primaryBusinessGroupFromContraC;
    }

    /**
     * Sets the value of the primaryBusinessGroupFromContraC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryBusinessGroupFromContraC(JAXBElement<String> value) {
        this.primaryBusinessGroupFromContraC = value;
    }

    /**
     * Gets the value of the primaryBusinessClassFromContraC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryBusinessClassFromContraC() {
        return primaryBusinessClassFromContraC;
    }

    /**
     * Sets the value of the primaryBusinessClassFromContraC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryBusinessClassFromContraC(JAXBElement<String> value) {
        this.primaryBusinessClassFromContraC = value;
    }

    /**
     * Gets the value of the additionalBusinessGroupsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalBusinessGroupsC() {
        return additionalBusinessGroupsC;
    }

    /**
     * Sets the value of the additionalBusinessGroupsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalBusinessGroupsC(JAXBElement<String> value) {
        this.additionalBusinessGroupsC = value;
    }

    /**
     * Gets the value of the additionalBusinessClassesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalBusinessClassesC() {
        return additionalBusinessClassesC;
    }

    /**
     * Sets the value of the additionalBusinessClassesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalBusinessClassesC(JAXBElement<String> value) {
        this.additionalBusinessClassesC = value;
    }

    /**
     * Gets the value of the marketSectorDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getMarketSectorDescriptionC() {
        return marketSectorDescriptionC;
    }

    /**
     * Sets the value of the marketSectorDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setMarketSectorDescriptionC(JAXBElement<byte[]> value) {
        this.marketSectorDescriptionC = value;
    }

    /**
     * Gets the value of the professionalServicesDatesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProfessionalServicesDatesC() {
        return professionalServicesDatesC;
    }

    /**
     * Sets the value of the professionalServicesDatesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProfessionalServicesDatesC(JAXBElement<XMLGregorianCalendar> value) {
        this.professionalServicesDatesC = value;
    }

    /**
     * Gets the value of the constructionCompletionDatesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getConstructionCompletionDatesC() {
        return constructionCompletionDatesC;
    }

    /**
     * Sets the value of the constructionCompletionDatesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setConstructionCompletionDatesC(JAXBElement<XMLGregorianCalendar> value) {
        this.constructionCompletionDatesC = value;
    }

    /**
     * Gets the value of the primaryGSACodeFromContractC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryGSACodeFromContractC() {
        return primaryGSACodeFromContractC;
    }

    /**
     * Sets the value of the primaryGSACodeFromContractC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryGSACodeFromContractC(JAXBElement<String> value) {
        this.primaryGSACodeFromContractC = value;
    }

    /**
     * Gets the value of the gsaCode1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSACode1C() {
        return gsaCode1C;
    }

    /**
     * Sets the value of the gsaCode1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSACode1C(JAXBElement<String> value) {
        this.gsaCode1C = value;
    }

    /**
     * Gets the value of the gsaCode2C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSACode2C() {
        return gsaCode2C;
    }

    /**
     * Sets the value of the gsaCode2C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSACode2C(JAXBElement<String> value) {
        this.gsaCode2C = value;
    }

    /**
     * Gets the value of the gsaCode3C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSACode3C() {
        return gsaCode3C;
    }

    /**
     * Sets the value of the gsaCode3C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSACode3C(JAXBElement<String> value) {
        this.gsaCode3C = value;
    }

    /**
     * Gets the value of the gsaCode4C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSACode4C() {
        return gsaCode4C;
    }

    /**
     * Sets the value of the gsaCode4C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSACode4C(JAXBElement<String> value) {
        this.gsaCode4C = value;
    }

    /**
     * Gets the value of the gsaCode5C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSACode5C() {
        return gsaCode5C;
    }

    /**
     * Sets the value of the gsaCode5C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSACode5C(JAXBElement<String> value) {
        this.gsaCode5C = value;
    }

    /**
     * Gets the value of the estimatedGrossFeeUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getEstimatedGrossFeeUSDC() {
        return estimatedGrossFeeUSDC;
    }

    /**
     * Sets the value of the estimatedGrossFeeUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setEstimatedGrossFeeUSDC(JAXBElement<AmountType> value) {
        this.estimatedGrossFeeUSDC = value;
    }

    /**
     * Gets the value of the actualGrossFeeUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getActualGrossFeeUSDC() {
        return actualGrossFeeUSDC;
    }

    /**
     * Sets the value of the actualGrossFeeUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setActualGrossFeeUSDC(JAXBElement<AmountType> value) {
        this.actualGrossFeeUSDC = value;
    }

    /**
     * Gets the value of the estimatedNetFeeUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getEstimatedNetFeeUSDC() {
        return estimatedNetFeeUSDC;
    }

    /**
     * Sets the value of the estimatedNetFeeUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setEstimatedNetFeeUSDC(JAXBElement<AmountType> value) {
        this.estimatedNetFeeUSDC = value;
    }

    /**
     * Gets the value of the actualNetFeeUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getActualNetFeeUSDC() {
        return actualNetFeeUSDC;
    }

    /**
     * Sets the value of the actualNetFeeUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setActualNetFeeUSDC(JAXBElement<AmountType> value) {
        this.actualNetFeeUSDC = value;
    }

    /**
     * Gets the value of the estimatedSubConsultantFeeUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getEstimatedSubConsultantFeeUSDC() {
        return estimatedSubConsultantFeeUSDC;
    }

    /**
     * Sets the value of the estimatedSubConsultantFeeUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setEstimatedSubConsultantFeeUSDC(JAXBElement<AmountType> value) {
        this.estimatedSubConsultantFeeUSDC = value;
    }

    /**
     * Gets the value of the actualSubConsultantFeeUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getActualSubConsultantFeeUSDC() {
        return actualSubConsultantFeeUSDC;
    }

    /**
     * Sets the value of the actualSubConsultantFeeUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setActualSubConsultantFeeUSDC(JAXBElement<AmountType> value) {
        this.actualSubConsultantFeeUSDC = value;
    }

    /**
     * Gets the value of the estimatedConstructionCostUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getEstimatedConstructionCostUSDC() {
        return estimatedConstructionCostUSDC;
    }

    /**
     * Sets the value of the estimatedConstructionCostUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setEstimatedConstructionCostUSDC(JAXBElement<AmountType> value) {
        this.estimatedConstructionCostUSDC = value;
    }

    /**
     * Gets the value of the actualConstructionCostUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getActualConstructionCostUSDC() {
        return actualConstructionCostUSDC;
    }

    /**
     * Sets the value of the actualConstructionCostUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setActualConstructionCostUSDC(JAXBElement<AmountType> value) {
        this.actualConstructionCostUSDC = value;
    }

    /**
     * Gets the value of the estimatedTotalProjectCostUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getEstimatedTotalProjectCostUSDC() {
        return estimatedTotalProjectCostUSDC;
    }

    /**
     * Sets the value of the estimatedTotalProjectCostUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setEstimatedTotalProjectCostUSDC(JAXBElement<AmountType> value) {
        this.estimatedTotalProjectCostUSDC = value;
    }

    /**
     * Gets the value of the actualTotalProjectCostUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getActualTotalProjectCostUSDC() {
        return actualTotalProjectCostUSDC;
    }

    /**
     * Sets the value of the actualTotalProjectCostUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setActualTotalProjectCostUSDC(JAXBElement<AmountType> value) {
        this.actualTotalProjectCostUSDC = value;
    }

    /**
     * Gets the value of the constructionBidUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getConstructionBidUSDC() {
        return constructionBidUSDC;
    }

    /**
     * Sets the value of the constructionBidUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setConstructionBidUSDC(JAXBElement<AmountType> value) {
        this.constructionBidUSDC = value;
    }

    /**
     * Gets the value of the costFeesDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getCostFeesDescriptionC() {
        return costFeesDescriptionC;
    }

    /**
     * Sets the value of the costFeesDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setCostFeesDescriptionC(JAXBElement<byte[]> value) {
        this.costFeesDescriptionC = value;
    }

    /**
     * Gets the value of the amountC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getAmountC() {
        return amountC;
    }

    /**
     * Sets the value of the amountC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setAmountC(JAXBElement<AmountType> value) {
        this.amountC = value;
    }

    /**
     * Gets the value of the keyComparativeFeaturesBenefitsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyComparativeFeaturesBenefitsC() {
        return keyComparativeFeaturesBenefitsC;
    }

    /**
     * Sets the value of the keyComparativeFeaturesBenefitsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyComparativeFeaturesBenefitsC(JAXBElement<String> value) {
        this.keyComparativeFeaturesBenefitsC = value;
    }

    /**
     * Gets the value of the projectDescriptionGeneralOvervC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getProjectDescriptionGeneralOvervC() {
        return projectDescriptionGeneralOvervC;
    }

    /**
     * Sets the value of the projectDescriptionGeneralOvervC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setProjectDescriptionGeneralOvervC(JAXBElement<byte[]> value) {
        this.projectDescriptionGeneralOvervC = value;
    }

    /**
     * Gets the value of the titleC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTitleC() {
        return titleC;
    }

    /**
     * Sets the value of the titleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTitleC(JAXBElement<String> value) {
        this.titleC = value;
    }

    /**
     * Gets the value of the locationCodeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationCodeC() {
        return locationCodeC;
    }

    /**
     * Sets the value of the locationCodeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationCodeC(JAXBElement<String> value) {
        this.locationCodeC = value;
    }

    /**
     * Gets the value of the localeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocaleC() {
        return localeC;
    }

    /**
     * Sets the value of the localeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocaleC(JAXBElement<String> value) {
        this.localeC = value;
    }

    /**
     * Gets the value of the countyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCountyC() {
        return countyC;
    }

    /**
     * Sets the value of the countyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCountyC(JAXBElement<String> value) {
        this.countyC = value;
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
     * Gets the value of the vendorIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getVendorIdC() {
        return vendorIdC;
    }

    /**
     * Sets the value of the vendorIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setVendorIdC(JAXBElement<String> value) {
        this.vendorIdC = value;
    }

    /**
     * Gets the value of the subconsultantC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubconsultantC() {
        return subconsultantC;
    }

    /**
     * Sets the value of the subconsultantC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubconsultantC(JAXBElement<String> value) {
        this.subconsultantC = value;
    }

    /**
     * Gets the value of the actualCostUSDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getActualCostUSDC() {
        return actualCostUSDC;
    }

    /**
     * Sets the value of the actualCostUSDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setActualCostUSDC(JAXBElement<AmountType> value) {
        this.actualCostUSDC = value;
    }

    /**
     * Gets the value of the serviceProvidedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceProvidedC() {
        return serviceProvidedC;
    }

    /**
     * Sets the value of the serviceProvidedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceProvidedC(JAXBElement<String> value) {
        this.serviceProvidedC = value;
    }

    /**
     * Gets the value of the clientC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClientC() {
        return clientC;
    }

    /**
     * Sets the value of the clientC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClientC(JAXBElement<String> value) {
        this.clientC = value;
    }

    /**
     * Gets the value of the clientDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getClientDescriptionC() {
        return clientDescriptionC;
    }

    /**
     * Sets the value of the clientDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setClientDescriptionC(JAXBElement<byte[]> value) {
        this.clientDescriptionC = value;
    }

    /**
     * Gets the value of the additionalProjectC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalProjectC() {
        return additionalProjectC;
    }

    /**
     * Sets the value of the additionalProjectC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalProjectC(JAXBElement<String> value) {
        this.additionalProjectC = value;
    }

    /**
     * Gets the value of the additionalProjectDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getAdditionalProjectDescriptionC() {
        return additionalProjectDescriptionC;
    }

    /**
     * Sets the value of the additionalProjectDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setAdditionalProjectDescriptionC(JAXBElement<byte[]> value) {
        this.additionalProjectDescriptionC = value;
    }

    /**
     * Gets the value of the integrationC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIntegrationC() {
        return integrationC;
    }

    /**
     * Sets the value of the integrationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIntegrationC(JAXBElement<String> value) {
        this.integrationC = value;
    }

    /**
     * Gets the value of the integrationDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getIntegrationDescriptionC() {
        return integrationDescriptionC;
    }

    /**
     * Sets the value of the integrationDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setIntegrationDescriptionC(JAXBElement<byte[]> value) {
        this.integrationDescriptionC = value;
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
     * Gets the value of the businessClassDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessClassDescriptionC() {
        return businessClassDescriptionC;
    }

    /**
     * Sets the value of the businessClassDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessClassDescriptionC(JAXBElement<String> value) {
        this.businessClassDescriptionC = value;
    }

    /**
     * Gets the value of the ownerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerIdC() {
        return ownerIdC;
    }

    /**
     * Sets the value of the ownerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerIdC(JAXBElement<String> value) {
        this.ownerIdC = value;
    }

    /**
     * Gets the value of the addressSequenceNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAddressSequenceNumberC() {
        return addressSequenceNumberC;
    }

    /**
     * Sets the value of the addressSequenceNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAddressSequenceNumberC(JAXBElement<BigDecimal> value) {
        this.addressSequenceNumberC = value;
    }

    /**
     * Gets the value of the customerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCustomerC() {
        return customerC;
    }

    /**
     * Sets the value of the customerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCustomerC(JAXBElement<String> value) {
        this.customerC = value;
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
     * Gets the value of the postalCodeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCodeC() {
        return postalCodeC;
    }

    /**
     * Sets the value of the postalCodeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCodeC(JAXBElement<String> value) {
        this.postalCodeC = value;
    }

    /**
     * Gets the value of the hdrRoleC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHDRRoleC() {
        return hdrRoleC;
    }

    /**
     * Sets the value of the hdrRoleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHDRRoleC(JAXBElement<String> value) {
        this.hdrRoleC = value;
    }

    /**
     * Gets the value of the hdrRoleCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHDRRoleCMeaning() {
        return hdrRoleCMeaning;
    }

    /**
     * Sets the value of the hdrRoleCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHDRRoleCMeaning(JAXBElement<String> value) {
        this.hdrRoleCMeaning = value;
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
     * Gets the value of the keyProjectTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyProjectTypeC() {
        return keyProjectTypeC;
    }

    /**
     * Sets the value of the keyProjectTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyProjectTypeC(JAXBElement<String> value) {
        this.keyProjectTypeC = value;
    }

    /**
     * Gets the value of the keyProjectTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyProjectTypeCMeaning() {
        return keyProjectTypeCMeaning;
    }

    /**
     * Sets the value of the keyProjectTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyProjectTypeCMeaning(JAXBElement<String> value) {
        this.keyProjectTypeCMeaning = value;
    }

    /**
     * Gets the value of the opportunityNameSIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOpportunityNameSIdC() {
        return opportunityNameSIdC;
    }

    /**
     * Sets the value of the opportunityNameSIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOpportunityNameSIdC(JAXBElement<BigDecimal> value) {
        this.opportunityNameSIdC = value;
    }

    /**
     * Gets the value of the opportunityNameSC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityNameSC() {
        return opportunityNameSC;
    }

    /**
     * Sets the value of the opportunityNameSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityNameSC(JAXBElement<String> value) {
        this.opportunityNameSC = value;
    }

    /**
     * Gets the value of the marketingDataContactIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMarketingDataContactIdC() {
        return marketingDataContactIdC;
    }

    /**
     * Sets the value of the marketingDataContactIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMarketingDataContactIdC(JAXBElement<BigDecimal> value) {
        this.marketingDataContactIdC = value;
    }

    /**
     * Gets the value of the marketingDataContactC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingDataContactC() {
        return marketingDataContactC;
    }

    /**
     * Sets the value of the marketingDataContactC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingDataContactC(JAXBElement<String> value) {
        this.marketingDataContactC = value;
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
     * Gets the value of the contractStatusC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractStatusC() {
        return contractStatusC;
    }

    /**
     * Sets the value of the contractStatusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractStatusC(JAXBElement<String> value) {
        this.contractStatusC = value;
    }

    /**
     * Gets the value of the contractStatusCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractStatusCMeaning() {
        return contractStatusCMeaning;
    }

    /**
     * Sets the value of the contractStatusCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractStatusCMeaning(JAXBElement<String> value) {
        this.contractStatusCMeaning = value;
    }

    /**
     * Gets the value of the projectTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectTypeC() {
        return projectTypeC;
    }

    /**
     * Sets the value of the projectTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectTypeC(JAXBElement<String> value) {
        this.projectTypeC = value;
    }

    /**
     * Gets the value of the projectTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectTypeCMeaning() {
        return projectTypeCMeaning;
    }

    /**
     * Sets the value of the projectTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectTypeCMeaning(JAXBElement<String> value) {
        this.projectTypeCMeaning = value;
    }

    /**
     * Gets the value of the restrictionTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestrictionTypeC() {
        return restrictionTypeC;
    }

    /**
     * Sets the value of the restrictionTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestrictionTypeC(JAXBElement<String> value) {
        this.restrictionTypeC = value;
    }

    /**
     * Gets the value of the restrictionTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRestrictionTypeCMeaning() {
        return restrictionTypeCMeaning;
    }

    /**
     * Sets the value of the restrictionTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRestrictionTypeCMeaning(JAXBElement<String> value) {
        this.restrictionTypeCMeaning = value;
    }

    /**
     * Gets the value of the subComponentC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubComponentC() {
        return subComponentC;
    }

    /**
     * Sets the value of the subComponentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubComponentC(JAXBElement<String> value) {
        this.subComponentC = value;
    }

    /**
     * Gets the value of the subComponentCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubComponentCMeaning() {
        return subComponentCMeaning;
    }

    /**
     * Sets the value of the subComponentCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubComponentCMeaning(JAXBElement<String> value) {
        this.subComponentCMeaning = value;
    }

    /**
     * Gets the value of the componentC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComponentC() {
        return componentC;
    }

    /**
     * Sets the value of the componentC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComponentC(JAXBElement<String> value) {
        this.componentC = value;
    }

    /**
     * Gets the value of the componentCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComponentCMeaning() {
        return componentCMeaning;
    }

    /**
     * Sets the value of the componentCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComponentCMeaning(JAXBElement<String> value) {
        this.componentCMeaning = value;
    }

    /**
     * Gets the value of the serviceAreaFacilityTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceAreaFacilityTypeC() {
        return serviceAreaFacilityTypeC;
    }

    /**
     * Sets the value of the serviceAreaFacilityTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceAreaFacilityTypeC(JAXBElement<String> value) {
        this.serviceAreaFacilityTypeC = value;
    }

    /**
     * Gets the value of the serviceAreaFacilityTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceAreaFacilityTypeCMeaning() {
        return serviceAreaFacilityTypeCMeaning;
    }

    /**
     * Sets the value of the serviceAreaFacilityTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceAreaFacilityTypeCMeaning(JAXBElement<String> value) {
        this.serviceAreaFacilityTypeCMeaning = value;
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
     * Gets the value of the additionalProjectTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalProjectTypeC() {
        return additionalProjectTypeC;
    }

    /**
     * Sets the value of the additionalProjectTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalProjectTypeC(JAXBElement<String> value) {
        this.additionalProjectTypeC = value;
    }

    /**
     * Gets the value of the additionalProjectTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdditionalProjectTypeCMeaning() {
        return additionalProjectTypeCMeaning;
    }

    /**
     * Sets the value of the additionalProjectTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdditionalProjectTypeCMeaning(JAXBElement<String> value) {
        this.additionalProjectTypeCMeaning = value;
    }

    /**
     * Gets the value of the enterpriseTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnterpriseTypeC() {
        return enterpriseTypeC;
    }

    /**
     * Sets the value of the enterpriseTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnterpriseTypeC(JAXBElement<String> value) {
        this.enterpriseTypeC = value;
    }

    /**
     * Gets the value of the enterpriseTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnterpriseTypeCMeaning() {
        return enterpriseTypeCMeaning;
    }

    /**
     * Sets the value of the enterpriseTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnterpriseTypeCMeaning(JAXBElement<String> value) {
        this.enterpriseTypeCMeaning = value;
    }

    /**
     * Gets the value of the favorableC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFavorableC() {
        return favorableC;
    }

    /**
     * Sets the value of the favorableC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFavorableC(Boolean value) {
        this.favorableC = value;
    }

    /**
     * Gets the value of the confidentialC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfidentialC() {
        return confidentialC;
    }

    /**
     * Sets the value of the confidentialC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfidentialC(Boolean value) {
        this.confidentialC = value;
    }

    /**
     * Gets the value of the locationC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocationC() {
        return locationC;
    }

    /**
     * Sets the value of the locationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocationC(JAXBElement<String> value) {
        this.locationC = value;
    }

    /**
     * Gets the value of the masterContractNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMasterContractNameC() {
        return masterContractNameC;
    }

    /**
     * Sets the value of the masterContractNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMasterContractNameC(JAXBElement<String> value) {
        this.masterContractNameC = value;
    }

    /**
     * Gets the value of the contractNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractNameC() {
        return contractNameC;
    }

    /**
     * Sets the value of the contractNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractNameC(JAXBElement<String> value) {
        this.contractNameC = value;
    }

    /**
     * Gets the value of the confidentialforCostsC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfidentialforCostsC() {
        return confidentialforCostsC;
    }

    /**
     * Sets the value of the confidentialforCostsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfidentialforCostsC(Boolean value) {
        this.confidentialforCostsC = value;
    }

    /**
     * Gets the value of the confidentialforDatesC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isConfidentialforDatesC() {
        return confidentialforDatesC;
    }

    /**
     * Sets the value of the confidentialforDatesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setConfidentialforDatesC(Boolean value) {
        this.confidentialforDatesC = value;
    }

    /**
     * Gets the value of the serviceTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceTypeC() {
        return serviceTypeC;
    }

    /**
     * Sets the value of the serviceTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceTypeC(JAXBElement<String> value) {
        this.serviceTypeC = value;
    }

    /**
     * Gets the value of the serviceTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceTypeCMeaning() {
        return serviceTypeCMeaning;
    }

    /**
     * Sets the value of the serviceTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceTypeCMeaning(JAXBElement<String> value) {
        this.serviceTypeCMeaning = value;
    }

    /**
     * Gets the value of the contractProjectIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getContractProjectIdC() {
        return contractProjectIdC;
    }

    /**
     * Sets the value of the contractProjectIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setContractProjectIdC(JAXBElement<BigDecimal> value) {
        this.contractProjectIdC = value;
    }

    /**
     * Gets the value of the contractProjectC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractProjectC() {
        return contractProjectC;
    }

    /**
     * Sets the value of the contractProjectC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractProjectC(JAXBElement<String> value) {
        this.contractProjectC = value;
    }

    /**
     * Gets the value of the referenceC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReferenceC() {
        return referenceC;
    }

    /**
     * Sets the value of the referenceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReferenceC(Boolean value) {
        this.referenceC = value;
    }

    /**
     * Gets the value of the projectStartDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProjectStartDateC() {
        return projectStartDateC;
    }

    /**
     * Sets the value of the projectStartDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProjectStartDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.projectStartDateC = value;
    }

    /**
     * Gets the value of the projectEndDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProjectEndDateC() {
        return projectEndDateC;
    }

    /**
     * Sets the value of the projectEndDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProjectEndDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.projectEndDateC = value;
    }

    /**
     * Gets the value of the dataIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDataIdC() {
        return dataIdC;
    }

    /**
     * Sets the value of the dataIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDataIdC(JAXBElement<BigDecimal> value) {
        this.dataIdC = value;
    }

    /**
     * Gets the value of the dataC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataC() {
        return dataC;
    }

    /**
     * Sets the value of the dataC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataC(JAXBElement<String> value) {
        this.dataC = value;
    }

    /**
     * Gets the value of the typeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeC() {
        return typeC;
    }

    /**
     * Sets the value of the typeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeC(JAXBElement<String> value) {
        this.typeC = value;
    }

    /**
     * Gets the value of the typeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeCMeaning() {
        return typeCMeaning;
    }

    /**
     * Sets the value of the typeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeCMeaning(JAXBElement<String> value) {
        this.typeCMeaning = value;
    }

    /**
     * Gets the value of the sustainableRatingC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSustainableRatingC() {
        return sustainableRatingC;
    }

    /**
     * Sets the value of the sustainableRatingC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSustainableRatingC(JAXBElement<String> value) {
        this.sustainableRatingC = value;
    }

    /**
     * Gets the value of the sustainableRatingCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSustainableRatingCMeaning() {
        return sustainableRatingCMeaning;
    }

    /**
     * Sets the value of the sustainableRatingCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSustainableRatingCMeaning(JAXBElement<String> value) {
        this.sustainableRatingCMeaning = value;
    }

    /**
     * Gets the value of the noticeToProceedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getNoticeToProceedC() {
        return noticeToProceedC;
    }

    /**
     * Sets the value of the noticeToProceedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setNoticeToProceedC(JAXBElement<XMLGregorianCalendar> value) {
        this.noticeToProceedC = value;
    }

    /**
     * Gets the value of the firstActivityDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getFirstActivityDateC() {
        return firstActivityDateC;
    }

    /**
     * Sets the value of the firstActivityDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setFirstActivityDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.firstActivityDateC = value;
    }

    /**
     * Gets the value of the lastActivityDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastActivityDateC() {
        return lastActivityDateC;
    }

    /**
     * Sets the value of the lastActivityDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastActivityDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.lastActivityDateC = value;
    }

    /**
     * Gets the value of the projectNameC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectNameC() {
        return projectNameC;
    }

    /**
     * Sets the value of the projectNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectNameC(String value) {
        this.projectNameC = value;
    }

    /**
     * Gets the value of the companyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyC() {
        return companyC;
    }

    /**
     * Sets the value of the companyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyC(JAXBElement<String> value) {
        this.companyC = value;
    }

    /**
     * Gets the value of the companyCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyCMeaning() {
        return companyCMeaning;
    }

    /**
     * Sets the value of the companyCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyCMeaning(JAXBElement<String> value) {
        this.companyCMeaning = value;
    }

    /**
     * Gets the value of the sustainableRatingsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSustainableRatingsC() {
        return sustainableRatingsC;
    }

    /**
     * Sets the value of the sustainableRatingsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSustainableRatingsC(JAXBElement<String> value) {
        this.sustainableRatingsC = value;
    }

    /**
     * Gets the value of the sustainableRatingsCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSustainableRatingsCMeaning() {
        return sustainableRatingsCMeaning;
    }

    /**
     * Sets the value of the sustainableRatingsCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSustainableRatingsCMeaning(JAXBElement<String> value) {
        this.sustainableRatingsCMeaning = value;
    }

    /**
     * Gets the value of the estimatedCompletionDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEstimatedCompletionDateC() {
        return estimatedCompletionDateC;
    }

    /**
     * Sets the value of the estimatedCompletionDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEstimatedCompletionDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.estimatedCompletionDateC = value;
    }

    /**
     * Gets the value of the primaryMarketingRecordC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrimaryMarketingRecordC() {
        return primaryMarketingRecordC;
    }

    /**
     * Sets the value of the primaryMarketingRecordC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrimaryMarketingRecordC(Boolean value) {
        this.primaryMarketingRecordC = value;
    }

    /**
     * Gets the value of the gsaCodeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSACodeC() {
        return gsaCodeC;
    }

    /**
     * Sets the value of the gsaCodeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSACodeC(JAXBElement<String> value) {
        this.gsaCodeC = value;
    }

    /**
     * Gets the value of the gsaCodeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSACodeCMeaning() {
        return gsaCodeCMeaning;
    }

    /**
     * Sets the value of the gsaCodeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSACodeCMeaning(JAXBElement<String> value) {
        this.gsaCodeCMeaning = value;
    }

    /**
     * Gets the value of the professionalServicesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfessionalServicesC() {
        return professionalServicesC;
    }

    /**
     * Sets the value of the professionalServicesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfessionalServicesC(JAXBElement<String> value) {
        this.professionalServicesC = value;
    }

    /**
     * Gets the value of the professionalServicesCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfessionalServicesCMeaning() {
        return professionalServicesCMeaning;
    }

    /**
     * Sets the value of the professionalServicesCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfessionalServicesCMeaning(JAXBElement<String> value) {
        this.professionalServicesCMeaning = value;
    }

    /**
     * Gets the value of the facilityTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFacilityTypeC() {
        return facilityTypeC;
    }

    /**
     * Sets the value of the facilityTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFacilityTypeC(JAXBElement<String> value) {
        this.facilityTypeC = value;
    }

    /**
     * Gets the value of the facilityTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFacilityTypeCMeaning() {
        return facilityTypeCMeaning;
    }

    /**
     * Sets the value of the facilityTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFacilityTypeCMeaning(JAXBElement<String> value) {
        this.facilityTypeCMeaning = value;
    }

    /**
     * Gets the value of the spaceComponentsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpaceComponentsC() {
        return spaceComponentsC;
    }

    /**
     * Sets the value of the spaceComponentsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpaceComponentsC(JAXBElement<String> value) {
        this.spaceComponentsC = value;
    }

    /**
     * Gets the value of the spaceComponentsCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSpaceComponentsCMeaning() {
        return spaceComponentsCMeaning;
    }

    /**
     * Sets the value of the spaceComponentsCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSpaceComponentsCMeaning(JAXBElement<String> value) {
        this.spaceComponentsCMeaning = value;
    }

    /**
     * Gets the value of the researchTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResearchTypeC() {
        return researchTypeC;
    }

    /**
     * Sets the value of the researchTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResearchTypeC(JAXBElement<String> value) {
        this.researchTypeC = value;
    }

    /**
     * Gets the value of the researchTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResearchTypeCMeaning() {
        return researchTypeCMeaning;
    }

    /**
     * Sets the value of the researchTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResearchTypeCMeaning(JAXBElement<String> value) {
        this.researchTypeCMeaning = value;
    }

    /**
     * Gets the value of the projectTypesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectTypesC() {
        return projectTypesC;
    }

    /**
     * Sets the value of the projectTypesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectTypesC(JAXBElement<String> value) {
        this.projectTypesC = value;
    }

    /**
     * Gets the value of the projectTypesCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectTypesCMeaning() {
        return projectTypesCMeaning;
    }

    /**
     * Sets the value of the projectTypesCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectTypesCMeaning(JAXBElement<String> value) {
        this.projectTypesCMeaning = value;
    }

    /**
     * Gets the value of the holdingRoomTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoldingRoomTypeC() {
        return holdingRoomTypeC;
    }

    /**
     * Sets the value of the holdingRoomTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoldingRoomTypeC(JAXBElement<String> value) {
        this.holdingRoomTypeC = value;
    }

    /**
     * Gets the value of the holdingRoomTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHoldingRoomTypeCMeaning() {
        return holdingRoomTypeCMeaning;
    }

    /**
     * Sets the value of the holdingRoomTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHoldingRoomTypeCMeaning(JAXBElement<String> value) {
        this.holdingRoomTypeCMeaning = value;
    }

    /**
     * Gets the value of the sf330ProfileCodeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSF330ProfileCodeC() {
        return sf330ProfileCodeC;
    }

    /**
     * Sets the value of the sf330ProfileCodeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSF330ProfileCodeC(JAXBElement<String> value) {
        this.sf330ProfileCodeC = value;
    }

    /**
     * Gets the value of the keyWordsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getKeyWordsC() {
        return keyWordsC;
    }

    /**
     * Sets the value of the keyWordsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setKeyWordsC(JAXBElement<String> value) {
        this.keyWordsC = value;
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
     * Gets the value of the serviceAreaFacilityTypesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceAreaFacilityTypesC() {
        return serviceAreaFacilityTypesC;
    }

    /**
     * Sets the value of the serviceAreaFacilityTypesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceAreaFacilityTypesC(JAXBElement<String> value) {
        this.serviceAreaFacilityTypesC = value;
    }

    /**
     * Gets the value of the serviceAreaFacilityTypesCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getServiceAreaFacilityTypesCMeaning() {
        return serviceAreaFacilityTypesCMeaning;
    }

    /**
     * Sets the value of the serviceAreaFacilityTypesCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setServiceAreaFacilityTypesCMeaning(JAXBElement<String> value) {
        this.serviceAreaFacilityTypesCMeaning = value;
    }

    /**
     * Gets the value of the componentsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComponentsC() {
        return componentsC;
    }

    /**
     * Sets the value of the componentsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComponentsC(JAXBElement<String> value) {
        this.componentsC = value;
    }

    /**
     * Gets the value of the componentsCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComponentsCMeaning() {
        return componentsCMeaning;
    }

    /**
     * Sets the value of the componentsCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComponentsCMeaning(JAXBElement<String> value) {
        this.componentsCMeaning = value;
    }

    /**
     * Gets the value of the subComponentsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubComponentsC() {
        return subComponentsC;
    }

    /**
     * Sets the value of the subComponentsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubComponentsC(JAXBElement<String> value) {
        this.subComponentsC = value;
    }

    /**
     * Gets the value of the subComponentsCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubComponentsCMeaning() {
        return subComponentsCMeaning;
    }

    /**
     * Sets the value of the subComponentsCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubComponentsCMeaning(JAXBElement<String> value) {
        this.subComponentsCMeaning = value;
    }

    /**
     * Gets the value of the businessClassDescriptionSC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessClassDescriptionSC() {
        return businessClassDescriptionSC;
    }

    /**
     * Sets the value of the businessClassDescriptionSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessClassDescriptionSC(JAXBElement<String> value) {
        this.businessClassDescriptionSC = value;
    }

    /**
     * Gets the value of the businessClassDescriptionSCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessClassDescriptionSCMeaning() {
        return businessClassDescriptionSCMeaning;
    }

    /**
     * Sets the value of the businessClassDescriptionSCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessClassDescriptionSCMeaning(JAXBElement<String> value) {
        this.businessClassDescriptionSCMeaning = value;
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
     * Gets the value of the subComponentNewC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubComponentNewC() {
        return subComponentNewC;
    }

    /**
     * Sets the value of the subComponentNewC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubComponentNewC(JAXBElement<String> value) {
        this.subComponentNewC = value;
    }

    /**
     * Gets the value of the subComponentNewCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubComponentNewCMeaning() {
        return subComponentNewCMeaning;
    }

    /**
     * Sets the value of the subComponentNewCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubComponentNewCMeaning(JAXBElement<String> value) {
        this.subComponentNewCMeaning = value;
    }

    /**
     * Gets the value of the gsaCodesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSACodesC() {
        return gsaCodesC;
    }

    /**
     * Sets the value of the gsaCodesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSACodesC(JAXBElement<String> value) {
        this.gsaCodesC = value;
    }

    /**
     * Gets the value of the gsaCodesCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGSACodesCMeaning() {
        return gsaCodesCMeaning;
    }

    /**
     * Sets the value of the gsaCodesCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGSACodesCMeaning(JAXBElement<String> value) {
        this.gsaCodesCMeaning = value;
    }

    /**
     * Gets the value of the sf330CodeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSF330CodeC() {
        return sf330CodeC;
    }

    /**
     * Sets the value of the sf330CodeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSF330CodeC(JAXBElement<String> value) {
        this.sf330CodeC = value;
    }

    /**
     * Gets the value of the sf330CodeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSF330CodeCMeaning() {
        return sf330CodeCMeaning;
    }

    /**
     * Sets the value of the sf330CodeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSF330CodeCMeaning(JAXBElement<String> value) {
        this.sf330CodeCMeaning = value;
    }

    /**
     * Gets the value of the sf330ProfileCodesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSF330ProfileCodesC() {
        return sf330ProfileCodesC;
    }

    /**
     * Sets the value of the sf330ProfileCodesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSF330ProfileCodesC(JAXBElement<String> value) {
        this.sf330ProfileCodesC = value;
    }

    /**
     * Gets the value of the sf330ProfileCodesCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSF330ProfileCodesCMeaning() {
        return sf330ProfileCodesCMeaning;
    }

    /**
     * Sets the value of the sf330ProfileCodesCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSF330ProfileCodesCMeaning(JAXBElement<String> value) {
        this.sf330ProfileCodesCMeaning = value;
    }

    /**
     * Gets the value of the businessGroupsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessGroupsC() {
        return businessGroupsC;
    }

    /**
     * Sets the value of the businessGroupsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessGroupsC(JAXBElement<String> value) {
        this.businessGroupsC = value;
    }

    /**
     * Gets the value of the businessGroupsCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessGroupsCMeaning() {
        return businessGroupsCMeaning;
    }

    /**
     * Sets the value of the businessGroupsCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessGroupsCMeaning(JAXBElement<String> value) {
        this.businessGroupsCMeaning = value;
    }

    /**
     * Gets the value of the deliveryMethodC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryMethodC() {
        return deliveryMethodC;
    }

    /**
     * Sets the value of the deliveryMethodC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryMethodC(JAXBElement<String> value) {
        this.deliveryMethodC = value;
    }

    /**
     * Gets the value of the deliveryMethodCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryMethodCMeaning() {
        return deliveryMethodCMeaning;
    }

    /**
     * Sets the value of the deliveryMethodCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryMethodCMeaning(JAXBElement<String> value) {
        this.deliveryMethodCMeaning = value;
    }

    /**
     * Gets the value of the currencyC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyC() {
        return currencyC;
    }

    /**
     * Sets the value of the currencyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyC(JAXBElement<String> value) {
        this.currencyC = value;
    }

    /**
     * Gets the value of the currencyCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrencyCMeaning() {
        return currencyCMeaning;
    }

    /**
     * Sets the value of the currencyCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrencyCMeaning(JAXBElement<String> value) {
        this.currencyCMeaning = value;
    }

    /**
     * Gets the value of the masterContractIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMasterContractIDC() {
        return masterContractIDC;
    }

    /**
     * Sets the value of the masterContractIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMasterContractIDC(JAXBElement<String> value) {
        this.masterContractIDC = value;
    }

    /**
     * Gets the value of the primaryGSACodesAndSF330CodeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryGSACodesAndSF330CodeC() {
        return primaryGSACodesAndSF330CodeC;
    }

    /**
     * Sets the value of the primaryGSACodesAndSF330CodeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryGSACodesAndSF330CodeC(JAXBElement<String> value) {
        this.primaryGSACodesAndSF330CodeC = value;
    }

    /**
     * Gets the value of the componentssC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComponentssC() {
        return componentssC;
    }

    /**
     * Sets the value of the componentssC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComponentssC(JAXBElement<String> value) {
        this.componentssC = value;
    }

    /**
     * Gets the value of the marketSectorsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketSectorsC() {
        return marketSectorsC;
    }

    /**
     * Sets the value of the marketSectorsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketSectorsC(JAXBElement<String> value) {
        this.marketSectorsC = value;
    }

    /**
     * Gets the value of the businessUnitsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessUnitsC() {
        return businessUnitsC;
    }

    /**
     * Sets the value of the businessUnitsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessUnitsC(JAXBElement<String> value) {
        this.businessUnitsC = value;
    }

    /**
     * Gets the value of the businessGroupssC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessGroupssC() {
        return businessGroupssC;
    }

    /**
     * Sets the value of the businessGroupssC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessGroupssC(JAXBElement<String> value) {
        this.businessGroupssC = value;
    }

    /**
     * Gets the value of the businessClassessC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessClassessC() {
        return businessClassessC;
    }

    /**
     * Sets the value of the businessClassessC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessClassessC(JAXBElement<String> value) {
        this.businessClassessC = value;
    }

    /**
     * Gets the value of the marketingClientNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingClientNameC() {
        return marketingClientNameC;
    }

    /**
     * Sets the value of the marketingClientNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingClientNameC(JAXBElement<String> value) {
        this.marketingClientNameC = value;
    }

    /**
     * Gets the value of the projectLegacySystemIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectLegacySystemIDC() {
        return projectLegacySystemIDC;
    }

    /**
     * Sets the value of the projectLegacySystemIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectLegacySystemIDC(JAXBElement<String> value) {
        this.projectLegacySystemIDC = value;
    }

    /**
     * Gets the value of the ebsidc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSIDC() {
        return ebsidc;
    }

    /**
     * Sets the value of the ebsidc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSIDC(JAXBElement<String> value) {
        this.ebsidc = value;
    }

    /**
     * Gets the value of the contractTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractTypeC() {
        return contractTypeC;
    }

    /**
     * Sets the value of the contractTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractTypeC(JAXBElement<String> value) {
        this.contractTypeC = value;
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
     * Gets the value of the actualStartDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualStartDateC() {
        return actualStartDateC;
    }

    /**
     * Sets the value of the actualStartDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualStartDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.actualStartDateC = value;
    }

    /**
     * Gets the value of the actualFinishDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualFinishDateC() {
        return actualFinishDateC;
    }

    /**
     * Sets the value of the actualFinishDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualFinishDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.actualFinishDateC = value;
    }

    /**
     * Gets the value of the plannedStartDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedStartDateC() {
        return plannedStartDateC;
    }

    /**
     * Sets the value of the plannedStartDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedStartDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedStartDateC = value;
    }

    /**
     * Gets the value of the plannedFinishDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getPlannedFinishDateC() {
        return plannedFinishDateC;
    }

    /**
     * Sets the value of the plannedFinishDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setPlannedFinishDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.plannedFinishDateC = value;
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
     * Gets the value of the federalContractNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFederalContractNumberC() {
        return federalContractNumberC;
    }

    /**
     * Sets the value of the federalContractNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFederalContractNumberC(JAXBElement<String> value) {
        this.federalContractNumberC = value;
    }

    /**
     * Gets the value of the billableClientIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBillableClientIdC() {
        return billableClientIdC;
    }

    /**
     * Sets the value of the billableClientIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBillableClientIdC(JAXBElement<BigDecimal> value) {
        this.billableClientIdC = value;
    }

    /**
     * Gets the value of the billableClientC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillableClientC() {
        return billableClientC;
    }

    /**
     * Sets the value of the billableClientC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillableClientC(JAXBElement<String> value) {
        this.billableClientC = value;
    }

    /**
     * Gets the value of the contractNamesIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getContractNamesIdC() {
        return contractNamesIdC;
    }

    /**
     * Sets the value of the contractNamesIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setContractNamesIdC(JAXBElement<BigDecimal> value) {
        this.contractNamesIdC = value;
    }

    /**
     * Gets the value of the contractNamesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractNamesC() {
        return contractNamesC;
    }

    /**
     * Sets the value of the contractNamesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractNamesC(JAXBElement<String> value) {
        this.contractNamesC = value;
    }

    /**
     * Gets the value of the dataContactEmailAddressC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataContactEmailAddressC() {
        return dataContactEmailAddressC;
    }

    /**
     * Sets the value of the dataContactEmailAddressC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataContactEmailAddressC(JAXBElement<String> value) {
        this.dataContactEmailAddressC = value;
    }

    /**
     * Gets the value of the bookedFeeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBookedFeeC() {
        return bookedFeeC;
    }

    /**
     * Sets the value of the bookedFeeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBookedFeeC(JAXBElement<AmountType> value) {
        this.bookedFeeC = value;
    }

    /**
     * Gets the value of the projectBusinessGroupC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectBusinessGroupC() {
        return projectBusinessGroupC;
    }

    /**
     * Sets the value of the projectBusinessGroupC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectBusinessGroupC(JAXBElement<String> value) {
        this.projectBusinessGroupC = value;
    }

    /**
     * Gets the value of the opportunityForReportingC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityForReportingC() {
        return opportunityForReportingC;
    }

    /**
     * Sets the value of the opportunityForReportingC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityForReportingC(JAXBElement<String> value) {
        this.opportunityForReportingC = value;
    }

    /**
     * Gets the value of the primaryCompanyForReportingC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryCompanyForReportingC() {
        return primaryCompanyForReportingC;
    }

    /**
     * Sets the value of the primaryCompanyForReportingC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryCompanyForReportingC(JAXBElement<String> value) {
        this.primaryCompanyForReportingC = value;
    }

    /**
     * Gets the value of the intBackEndLastUpdatedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getIntBackEndLastUpdatedDateC() {
        return intBackEndLastUpdatedDateC;
    }

    /**
     * Sets the value of the intBackEndLastUpdatedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setIntBackEndLastUpdatedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.intBackEndLastUpdatedDateC = value;
    }

    /**
     * Gets the value of the backEndLastUpdatedDateIntC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBackEndLastUpdatedDateIntC() {
        return backEndLastUpdatedDateIntC;
    }

    /**
     * Sets the value of the backEndLastUpdatedDateIntC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBackEndLastUpdatedDateIntC(JAXBElement<XMLGregorianCalendar> value) {
        this.backEndLastUpdatedDateIntC = value;
    }

    /**
     * Gets the value of the integratedProjectC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegratedProjectC() {
        return integratedProjectC;
    }

    /**
     * Sets the value of the integratedProjectC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegratedProjectC(Boolean value) {
        this.integratedProjectC = value;
    }

    /**
     * Gets the value of the currency1C property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCurrency1C() {
        return currency1C;
    }

    /**
     * Sets the value of the currency1C property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCurrency1C(JAXBElement<String> value) {
        this.currency1C = value;
    }

    /**
     * Gets the value of the reportingPrimaryAccountC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportingPrimaryAccountC() {
        return reportingPrimaryAccountC;
    }

    /**
     * Sets the value of the reportingPrimaryAccountC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportingPrimaryAccountC(JAXBElement<String> value) {
        this.reportingPrimaryAccountC = value;
    }

    /**
     * Gets the value of the reportingBillableAccountC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportingBillableAccountC() {
        return reportingBillableAccountC;
    }

    /**
     * Sets the value of the reportingBillableAccountC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportingBillableAccountC(JAXBElement<String> value) {
        this.reportingBillableAccountC = value;
    }

    /**
     * Gets the value of the reportingDataContactC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReportingDataContactC() {
        return reportingDataContactC;
    }

    /**
     * Sets the value of the reportingDataContactC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReportingDataContactC(JAXBElement<String> value) {
        this.reportingDataContactC = value;
    }

    /**
     * Gets the value of the ebsProjectNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSProjectNumberC() {
        return ebsProjectNumberC;
    }

    /**
     * Sets the value of the ebsProjectNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSProjectNumberC(JAXBElement<String> value) {
        this.ebsProjectNumberC = value;
    }

    /**
     * Gets the value of the ebsProjectIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSProjectIDC() {
        return ebsProjectIDC;
    }

    /**
     * Sets the value of the ebsProjectIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSProjectIDC(JAXBElement<String> value) {
        this.ebsProjectIDC = value;
    }

    /**
     * Gets the value of the marketingChargeNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingChargeNumberC() {
        return marketingChargeNumberC;
    }

    /**
     * Sets the value of the marketingChargeNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingChargeNumberC(JAXBElement<String> value) {
        this.marketingChargeNumberC = value;
    }

    /**
     * Gets the value of the datesMilestonesCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datesMilestonesCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDatesMilestonesCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatesMilestonesC }
     * 
     * 
     */
    public List<DatesMilestonesC> getDatesMilestonesCollectionCs() {
        if (datesMilestonesCollectionCs == null) {
            datesMilestonesCollectionCs = new ArrayList<DatesMilestonesC>();
        }
        return this.datesMilestonesCollectionCs;
    }

    /**
     * Gets the value of the measuresCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measuresCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasuresCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MeasuresC }
     * 
     * 
     */
    public List<MeasuresC> getMeasuresCollectionCs() {
        if (measuresCollectionCs == null) {
            measuresCollectionCs = new ArrayList<MeasuresC>();
        }
        return this.measuresCollectionCs;
    }

    /**
     * Gets the value of the projectAwardsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectAwardsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectAwardsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectAwardsC }
     * 
     * 
     */
    public List<ProjectAwardsC> getProjectAwardsCollectionCs() {
        if (projectAwardsCollectionCs == null) {
            projectAwardsCollectionCs = new ArrayList<ProjectAwardsC>();
        }
        return this.projectAwardsCollectionCs;
    }

    /**
     * Gets the value of the subconsultantCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subconsultantCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubconsultantCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubconsultantC }
     * 
     * 
     */
    public List<SubconsultantC> getSubconsultantCollectionCs() {
        if (subconsultantCollectionCs == null) {
            subconsultantCollectionCs = new ArrayList<SubconsultantC>();
        }
        return this.subconsultantCollectionCs;
    }

    /**
     * Gets the value of the locationCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the locationCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocationCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationC }
     * 
     * 
     */
    public List<LocationC> getLocationCollectionCs() {
        if (locationCollectionCs == null) {
            locationCollectionCs = new ArrayList<LocationC>();
        }
        return this.locationCollectionCs;
    }

    /**
     * Gets the value of the aditonalProjectsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aditonalProjectsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAditonalProjectsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AditonalProjectsC }
     * 
     * 
     */
    public List<AditonalProjectsC> getAditonalProjectsCollectionCs() {
        if (aditonalProjectsCollectionCs == null) {
            aditonalProjectsCollectionCs = new ArrayList<AditonalProjectsC>();
        }
        return this.aditonalProjectsCollectionCs;
    }

    /**
     * Gets the value of the costsFeesCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the costsFeesCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCostsFeesCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CostsFeesC }
     * 
     * 
     */
    public List<CostsFeesC> getCostsFeesCollectionCs() {
        if (costsFeesCollectionCs == null) {
            costsFeesCollectionCs = new ArrayList<CostsFeesC>();
        }
        return this.costsFeesCollectionCs;
    }

    /**
     * Gets the value of the billableCompanyCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the billableCompanyCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBillableCompanyCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BillableCompanyC }
     * 
     * 
     */
    public List<BillableCompanyC> getBillableCompanyCollectionCs() {
        if (billableCompanyCollectionCs == null) {
            billableCompanyCollectionCs = new ArrayList<BillableCompanyC>();
        }
        return this.billableCompanyCollectionCs;
    }

    /**
     * Gets the value of the primaryCompanyCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the primaryCompanyCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrimaryCompanyCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PrimaryCompanyC }
     * 
     * 
     */
    public List<PrimaryCompanyC> getPrimaryCompanyCollectionCs() {
        if (primaryCompanyCollectionCs == null) {
            primaryCompanyCollectionCs = new ArrayList<PrimaryCompanyC>();
        }
        return this.primaryCompanyCollectionCs;
    }

    /**
     * Gets the value of the projectDescriptionCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectDescriptionCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectDescriptionCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectDescriptionC }
     * 
     * 
     */
    public List<ProjectDescriptionC> getProjectDescriptionCollectionCs() {
        if (projectDescriptionCollectionCs == null) {
            projectDescriptionCollectionCs = new ArrayList<ProjectDescriptionC>();
        }
        return this.projectDescriptionCollectionCs;
    }

    /**
     * Gets the value of the ownerCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ownerCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOwnerCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OwnerC }
     * 
     * 
     */
    public List<OwnerC> getOwnerCollectionCs() {
        if (ownerCollectionCs == null) {
            ownerCollectionCs = new ArrayList<OwnerC>();
        }
        return this.ownerCollectionCs;
    }

    /**
     * Gets the value of the projectNamesCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectNamesCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectNamesCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectNamesC }
     * 
     * 
     */
    public List<ProjectNamesC> getProjectNamesCollectionCs() {
        if (projectNamesCollectionCs == null) {
            projectNamesCollectionCs = new ArrayList<ProjectNamesC>();
        }
        return this.projectNamesCollectionCs;
    }

    /**
     * Gets the value of the facilityTypesCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facilityTypesCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacilityTypesCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FacilityTypesC }
     * 
     * 
     */
    public List<FacilityTypesC> getFacilityTypesCollectionCs() {
        if (facilityTypesCollectionCs == null) {
            facilityTypesCollectionCs = new ArrayList<FacilityTypesC>();
        }
        return this.facilityTypesCollectionCs;
    }

    /**
     * Gets the value of the contactsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactsC }
     * 
     * 
     */
    public List<ContactsC> getContactsCollectionCs() {
        if (contactsCollectionCs == null) {
            contactsCollectionCs = new ArrayList<ContactsC>();
        }
        return this.contactsCollectionCs;
    }

    /**
     * Gets the value of the projectTeamCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectTeamCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectTeamCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectTeamC }
     * 
     * 
     */
    public List<ProjectTeamC> getProjectTeamCollectionCs() {
        if (projectTeamCollectionCs == null) {
            projectTeamCollectionCs = new ArrayList<ProjectTeamC>();
        }
        return this.projectTeamCollectionCs;
    }

    /**
     * Gets the value of the projectServicesCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectServicesCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectServicesCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectServicesC }
     * 
     * 
     */
    public List<ProjectServicesC> getProjectServicesCollectionCs() {
        if (projectServicesCollectionCs == null) {
            projectServicesCollectionCs = new ArrayList<ProjectServicesC>();
        }
        return this.projectServicesCollectionCs;
    }

    /**
     * Gets the value of the testimonialsCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the testimonialsCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTestimonialsCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TestimonialsC }
     * 
     * 
     */
    public List<TestimonialsC> getTestimonialsCollectionCs() {
        if (testimonialsCollectionCs == null) {
            testimonialsCollectionCs = new ArrayList<TestimonialsC>();
        }
        return this.testimonialsCollectionCs;
    }

    /**
     * Gets the value of the notesAdditionalDescriptionCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notesAdditionalDescriptionCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotesAdditionalDescriptionCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NotesAdditionalDescriptionC }
     * 
     * 
     */
    public List<NotesAdditionalDescriptionC> getNotesAdditionalDescriptionCollectionCs() {
        if (notesAdditionalDescriptionCollectionCs == null) {
            notesAdditionalDescriptionCollectionCs = new ArrayList<NotesAdditionalDescriptionC>();
        }
        return this.notesAdditionalDescriptionCollectionCs;
    }

    /**
     * Gets the value of the clientOwnerReferencesCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the clientOwnerReferencesCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClientOwnerReferencesCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClientOwnerReferencesC }
     * 
     * 
     */
    public List<ClientOwnerReferencesC> getClientOwnerReferencesCollectionCs() {
        if (clientOwnerReferencesCollectionCs == null) {
            clientOwnerReferencesCollectionCs = new ArrayList<ClientOwnerReferencesC>();
        }
        return this.clientOwnerReferencesCollectionCs;
    }

    /**
     * Gets the value of the gsaCodesCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gsaCodesCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGSACodesCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GSACodesC }
     * 
     * 
     */
    public List<GSACodesC> getGSACodesCollectionCs() {
        if (gsaCodesCollectionCs == null) {
            gsaCodesCollectionCs = new ArrayList<GSACodesC>();
        }
        return this.gsaCodesCollectionCs;
    }

    /**
     * Gets the value of the projectAwardNewCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectAwardNewCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectAwardNewCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectAwardNewC }
     * 
     * 
     */
    public List<ProjectAwardNewC> getProjectAwardNewCollectionCs() {
        if (projectAwardNewCollectionCs == null) {
            projectAwardNewCollectionCs = new ArrayList<ProjectAwardNewC>();
        }
        return this.projectAwardNewCollectionCs;
    }

    /**
     * Gets the value of the gsaCodeCollectionCs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gsaCodeCollectionCs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGSACodeCollectionCs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GSACodesC2 }
     * 
     * 
     */
    public List<GSACodesC2> getGSACodeCollectionCs() {
        if (gsaCodeCollectionCs == null) {
            gsaCodeCollectionCs = new ArrayList<GSACodesC2>();
        }
        return this.gsaCodeCollectionCs;
    }

}
