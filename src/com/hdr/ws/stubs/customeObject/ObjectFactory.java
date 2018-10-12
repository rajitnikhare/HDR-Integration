
package com.hdr.ws.stubs.customeObject;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hdr.ws.stubs.customeObject package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindCriteria_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findCriteria");
    private final static QName _DataObject_QNAME = new QName("commonj.sdo", "dataObject");
    private final static QName _ServiceErrorMessage_QNAME = new QName("http://xmlns.oracle.com/adf/svc/errors/", "ServiceErrorMessage");
    private final static QName _ProjectAwardsCYearReceivedCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "YearReceived_cMeaning");
    private final static QName _ProjectAwardsCLastUpdateDate_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastUpdateDate");
    private final static QName _ProjectAwardsCIsOwner_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IsOwner");
    private final static QName _ProjectAwardsCOrganizationAbbreviationCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrganizationAbbreviation_cMeaning");
    private final static QName _ProjectAwardsCJobDefinitionName_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "JobDefinitionName");
    private final static QName _ProjectAwardsCRankCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Rank_cMeaning");
    private final static QName _ProjectAwardsCCompanyIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Company_Id_c");
    private final static QName _ProjectAwardsCOrganizationNamesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrganizationNames_c");
    private final static QName _ProjectAwardsCCurcyConvRateType_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CurcyConvRateType");
    private final static QName _ProjectAwardsCYearReceivedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "YearReceived_c");
    private final static QName _ProjectAwardsCAwardIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AwardId_c");
    private final static QName _ProjectAwardsCCpdrfVerSor_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CpdrfVerSor");
    private final static QName _ProjectAwardsCOrganizationLevelOfAwardC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrganizationLevelOfAward_c");
    private final static QName _ProjectAwardsCYearAwardReceivedSCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "YearAwardReceivedS_cMeaning");
    private final static QName _ProjectAwardsCCommentC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Comment_c");
    private final static QName _ProjectAwardsCRankC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Rank_c");
    private final static QName _ProjectAwardsCRanksC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Ranks_c");
    private final static QName _ProjectAwardsCAwardProgramC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AwardProgram_c");
    private final static QName _ProjectAwardsCProjectsIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Projects_Id_c");
    private final static QName _ProjectAwardsCLevelCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Level_cMeaning");
    private final static QName _ProjectAwardsCLevelC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Level_c");
    private final static QName _ProjectAwardsCYearAwardReceivedSC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "YearAwardReceivedS_c");
    private final static QName _ProjectAwardsCRequestId_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RequestId");
    private final static QName _ProjectAwardsCUserLastUpdateDate_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "UserLastUpdateDate");
    private final static QName _ProjectAwardsCCategoryC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Category_c");
    private final static QName _ProjectAwardsCContractIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractId_c");
    private final static QName _ProjectAwardsCContractIdsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractIds_c");
    private final static QName _ProjectAwardsCCorpCurrencyCode_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CorpCurrencyCode");
    private final static QName _ProjectAwardsCAwardNameCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AwardName_cMeaning");
    private final static QName _ProjectAwardsCCommentsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Comments_c");
    private final static QName _ProjectAwardsCJobDefinitionPackage_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "JobDefinitionPackage");
    private final static QName _ProjectAwardsCCpdrfVerPillar_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CpdrfVerPillar");
    private final static QName _ProjectAwardsCCreatedBy_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CreatedBy");
    private final static QName _ProjectAwardsCOrganizationAbbreviationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrganizationAbbreviation_c");
    private final static QName _ProjectAwardsCDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Description_c");
    private final static QName _ProjectAwardsCLastUpdateLogin_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastUpdateLogin");
    private final static QName _ProjectAwardsCOrganizationNameCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrganizationName_cMeaning");
    private final static QName _ProjectAwardsCCompanyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Company_c");
    private final static QName _ProjectAwardsCLastUpdatedBy_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastUpdatedBy");
    private final static QName _ProjectAwardsCAwardProgramCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AwardProgram_cMeaning");
    private final static QName _ProjectAwardsCOrganizationAbbreviationsIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrganizationAbbreviations_Id_c");
    private final static QName _ProjectAwardsCCurrencyCode_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CurrencyCode");
    private final static QName _ProjectAwardsCAwardNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AwardName_c");
    private final static QName _ProjectAwardsCObjectVersionNumber_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ObjectVersionNumber");
    private final static QName _ProjectAwardsCCpdrfLastUpd_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CpdrfLastUpd");
    private final static QName _ProjectAwardsCOrganizationAbbreviationsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrganizationAbbreviations_c");
    private final static QName _ProjectAwardsCAwardNamesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AwardNames_c");
    private final static QName _ProjectAwardsCCreationDate_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CreationDate");
    private final static QName _ProjectLocationCRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RequestId");
    private final static QName _ProjectLocationCIsOwner_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "IsOwner");
    private final static QName _ProjectLocationCLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastUpdateDate");
    private final static QName _ProjectLocationCJobDefinitionName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "JobDefinitionName");
    private final static QName _ProjectLocationCUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "UserLastUpdateDate");
    private final static QName _ProjectLocationCJobDefinitionPackage_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "JobDefinitionPackage");
    private final static QName _ProjectLocationCLongitudeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Longitude_c");
    private final static QName _ProjectLocationCCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CorpCurrencyCode");
    private final static QName _ProjectLocationCCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CurcyConvRateType");
    private final static QName _ProjectLocationCCreatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CreatedBy");
    private final static QName _ProjectLocationCCpdrfVerPillar_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CpdrfVerPillar");
    private final static QName _ProjectLocationCLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastUpdateLogin");
    private final static QName _ProjectLocationCLocationCodeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LocationCode_c");
    private final static QName _ProjectLocationCCpdrfVerSor_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CpdrfVerSor");
    private final static QName _ProjectLocationCLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastUpdatedBy");
    private final static QName _ProjectLocationCOpportunityVOIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityVO_Id_c");
    private final static QName _ProjectLocationCObjectVersionNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ObjectVersionNumber");
    private final static QName _ProjectLocationCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CurrencyCode");
    private final static QName _ProjectLocationCLatitudeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Latitude_c");
    private final static QName _ProjectLocationCCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CreationDate");
    private final static QName _ProjectLocationCAddressC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Address_c");
    private final static QName _ProjectLocationCCpdrfLastUpd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CpdrfLastUpd");
    private final static QName _ProjectContractCProjectsIdSrcProjectsCToProjectContractC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Projects_Id_Src_Projects_cToProject_Contract_c");
    private final static QName _ProjectContractCContractIdTgtContractCToProjectContractC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Contract_Id_Tgt_Contract_cToProject_Contract_c");
    private final static QName _PastEmploymentCEmployeesIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Employees_Id_c");
    private final static QName _PastEmploymentCEndDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EndDate_c");
    private final static QName _PastEmploymentCStartDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "StartDate_c");
    private final static QName _ProjectsCSF330ProfileCodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SF330ProfileCode_c");
    private final static QName _ProjectsCCurrencyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Currency_c");
    private final static QName _ProjectsCContractStatusCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractStatus_cMeaning");
    private final static QName _ProjectsCEstimatedSubConsultantFeeUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EstimatedSubConsultantFeeUSD_c");
    private final static QName _ProjectsCMarketSectorDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSectorDescription_c");
    private final static QName _ProjectsCServiceAreaFacilityTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ServiceAreaFacilityType_cMeaning");
    private final static QName _ProjectsCContractDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractDescription_c");
    private final static QName _ProjectsCProjectTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectType_cMeaning");
    private final static QName _ProjectsCActualStartDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActualStartDate_c");
    private final static QName _ProjectsCHDRRoleC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HDRRole_c");
    private final static QName _ProjectsCPlannedStartDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PlannedStartDate_c");
    private final static QName _ProjectsCBackEndLastUpdatedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackEndLastUpdatedDate_c");
    private final static QName _ProjectsCEBSProjectNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EBSProjectNumber_c");
    private final static QName _ProjectsCSubComponentNewCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubComponentNew_cMeaning");
    private final static QName _ProjectsCSpaceComponentsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SpaceComponents_c");
    private final static QName _ProjectsCMasterContractNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MasterContractName_c");
    private final static QName _ProjectsCPKProxy_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PKProxy");
    private final static QName _ProjectsCGSACodeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GSACode_cMeaning");
    private final static QName _ProjectsCLocationCodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Location_code_c");
    private final static QName _ProjectsCPrimaryBusinessGroupFromContraC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryBusinessGroupFromContra_c");
    private final static QName _ProjectsCProfessionalServicesDatesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProfessionalServicesDates_c");
    private final static QName _ProjectsCSubComponentsCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubComponents_cMeaning");
    private final static QName _ProjectsCBusinessGroupCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessGroup_cMeaning");
    private final static QName _ProjectsCBusinessUnitCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessUnit_cMeaning");
    private final static QName _ProjectsCGSACode4C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GSACode4_c");
    private final static QName _ProjectsCRestrictionTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RestrictionType_cMeaning");
    private final static QName _ProjectsCSustainableRatingC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SustainableRating_c");
    private final static QName _ProjectsCMarketingClientNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketingClientName_c");
    private final static QName _ProjectsCAdditionalProjectDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalProjectDescription_c");
    private final static QName _ProjectsCEstimatedTotalProjectCostUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EstimatedTotalProjectCostUSD_c");
    private final static QName _ProjectsCDeliveryMethodC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DeliveryMethod_c");
    private final static QName _ProjectsCSubComponentsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubComponents_c");
    private final static QName _ProjectsCSF330CodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SF330Code_c");
    private final static QName _ProjectsCComponentsCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Components_cMeaning");
    private final static QName _ProjectsCCityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "City_c");
    private final static QName _ProjectsCProjectBusinessGroupC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectBusinessGroup_c");
    private final static QName _ProjectsCDepartmentC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Department_c");
    private final static QName _ProjectsCLocationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Location_c");
    private final static QName _ProjectsCContractNamesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractNames_c");
    private final static QName _ProjectsCMarketSectorsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSectors_c");
    private final static QName _ProjectsCPrimaryCompanyForReportingC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryCompanyForReporting_c");
    private final static QName _ProjectsCKeyComparativeFeaturesBenefitsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "KeyComparativeFeaturesBenefits_c");
    private final static QName _ProjectsCBusinessUnitsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessUnits_c");
    private final static QName _ProjectsCRestrictionTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RestrictionType_c");
    private final static QName _ProjectsCSpaceComponentsCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SpaceComponents_cMeaning");
    private final static QName _ProjectsCBusinessGroupssC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessGroupss_c");
    private final static QName _ProjectsCPostalCodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PostalCode_c");
    private final static QName _ProjectsCAdditionalDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalDescription_c");
    private final static QName _ProjectsCEnterpriseTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EnterpriseType_cMeaning");
    private final static QName _ProjectsCKeyWordsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "KeyWords_c");
    private final static QName _ProjectsCSustainableRatingsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SustainableRatings_c");
    private final static QName _ProjectsCFacilityTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FacilityType_c");
    private final static QName _ProjectsCBackEndLastUpdatedDateIntC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackEndLastUpdatedDateInt_c");
    private final static QName _ProjectsCPrimaryCompanyAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryCompanyAddress_c");
    private final static QName _ProjectsCContractProjectC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractProject_c");
    private final static QName _ProjectsCSustainableRatingCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SustainableRating_cMeaning");
    private final static QName _ProjectsCActualCostUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActualCostUSD_c");
    private final static QName _ProjectsCDataC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Data_c");
    private final static QName _ProjectsCContractNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractName_c");
    private final static QName _ProjectsCMarketingDataContactC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketingDataContact_c");
    private final static QName _ProjectsCCustomerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Customer_c");
    private final static QName _ProjectsCActualNetFeeUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActualNetFeeUSD_c");
    private final static QName _ProjectsCSustainableRatingsCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SustainableRatings_cMeaning");
    private final static QName _ProjectsCGSACode5C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GSACode5_c");
    private final static QName _ProjectsCProjectTypesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectTypes_cMeaning");
    private final static QName _ProjectsCMarketingChargeNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketingChargeNumber_c");
    private final static QName _ProjectsCServiceTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ServiceType_cMeaning");
    private final static QName _ProjectsCFederalContractNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FederalContractNumber_c");
    private final static QName _ProjectsCServiceAreaFacilityTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ServiceAreaFacilityType_c");
    private final static QName _ProjectsCSubComponentC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubComponent_c");
    private final static QName _ProjectsCGSACodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GSACode_c");
    private final static QName _ProjectsCContractTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractType_c");
    private final static QName _ProjectsCProjectDescriptionGeneralOvervC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectDescriptionGeneralOverv_c");
    private final static QName _ProjectsCActualGrossFeeUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActualGrossFeeUSD_c");
    private final static QName _ProjectsCBusinessClassDescriptionSCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessClassDescriptionS_cMeaning");
    private final static QName _ProjectsCGSACode3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GSACode3_c");
    private final static QName _ProjectsCEBSProjectIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EBSProjectID_c");
    private final static QName _ProjectsCBillableClientC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillableClient_c");
    private final static QName _ProjectsCMarketingProjectNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketingProjectName_c");
    private final static QName _ProjectsCTitleC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Title_c");
    private final static QName _ProjectsCIntBackEndLastUpdatedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IntBackEndLastUpdatedDate_c");
    private final static QName _ProjectsCContractIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractID_c");
    private final static QName _ProjectsCCostFeesDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CostFeesDescription_c");
    private final static QName _ProjectsCIntegrationDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IntegrationDescription_c");
    private final static QName _ProjectsCBusinessGroupC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessGroup_c");
    private final static QName _ProjectsCSF330ProfileCodesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SF330ProfileCodes_c");
    private final static QName _ProjectsCEnterpriseTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EnterpriseType_c");
    private final static QName _ProjectsCAdditionalBusinessClassesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalBusinessClasses_c");
    private final static QName _ProjectsCEstimatedConstructionCostUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EstimatedConstructionCostUSD_c");
    private final static QName _ProjectsCBillableCompanyIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillableCompany_Id_c");
    private final static QName _ProjectsCBusinessClassesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessClasses_cMeaning");
    private final static QName _ProjectsCPrimaryBusinessClassFromContraC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryBusinessClassFromContra_c");
    private final static QName _ProjectsCStateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "State_c");
    private final static QName _ProjectsCOpportunityNameSC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OpportunityNameS_c");
    private final static QName _ProjectsCHoldingRoomTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HoldingRoomType_c");
    private final static QName _ProjectsCGSACode1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GSACode1_c");
    private final static QName _ProjectsCReportingPrimaryAccountC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ReportingPrimaryAccount_c");
    private final static QName _ProjectsCPrimaryDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryDescription_c");
    private final static QName _ProjectsCGSACode2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GSACode2_c");
    private final static QName _ProjectsCFacilityTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FacilityType_cMeaning");
    private final static QName _ProjectsCComponentC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Component_c");
    private final static QName _ProjectsCBillableClientIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillableClient_Id_c");
    private final static QName _ProjectsCSubconsultantC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Subconsultant_c");
    private final static QName _ProjectsCContractStatusC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractStatus_c");
    private final static QName _ProjectsCComponentCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Component_cMeaning");
    private final static QName _ProjectsCProjectLegacySystemIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectLegacySystemID_c");
    private final static QName _ProjectsCServiceProvidedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ServiceProvided_c");
    private final static QName _ProjectsCAdditionalProjectTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalProjectType_cMeaning");
    private final static QName _ProjectsCMasterContractIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MasterContractID_c");
    private final static QName _ProjectsCAdditionalProjectTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalProjectType_c");
    private final static QName _ProjectsCServiceTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ServiceType_c");
    private final static QName _ProjectsCBusinessClassessC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessClassess_c");
    private final static QName _ProjectsCSubComponentNewC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubComponentNew_c");
    private final static QName _ProjectsCBusinessGroupsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessGroups_c");
    private final static QName _ProjectsCActualTotalProjectCostUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActualTotalProjectCostUSD_c");
    private final static QName _ProjectsCHoldingRoomTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HoldingRoomType_cMeaning");
    private final static QName _ProjectsCActualFinishDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActualFinishDate_c");
    private final static QName _ProjectsCBookedFeeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BookedFee_c");
    private final static QName _ProjectsCBillableCompanyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillableCompany_c");
    private final static QName _ProjectsCOpportunityNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OpportunityName_c");
    private final static QName _ProjectsCTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Type_c");
    private final static QName _ProjectsCFirstActivityDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FirstActivityDate_c");
    private final static QName _ProjectsCAdditionalBusinessGroupsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalBusinessGroups_c");
    private final static QName _ProjectsCProjectStartDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectStartDate_c");
    private final static QName _ProjectsCProfessionalServicesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProfessionalServices_c");
    private final static QName _ProjectsCAmountC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Amount_c");
    private final static QName _ProjectsCBillableCompanyAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillableCompanyAddress_c");
    private final static QName _ProjectsCProjectEndDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectEndDate_c");
    private final static QName _ProjectsCCurrencyCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Currency_cMeaning");
    private final static QName _ProjectsCKeyProjectTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "KeyProjectType_c");
    private final static QName _ProjectsCOpportunityForReportingC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OpportunityForReporting_c");
    private final static QName _ProjectsCBusinessClassesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessClasses_c");
    private final static QName _ProjectsCActualConstructionCostUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActualConstructionCostUSD_c");
    private final static QName _ProjectsCMarketingDataContactIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketingDataContact_Id_c");
    private final static QName _ProjectsCVendorIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "VendorId_c");
    private final static QName _ProjectsCCountryCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Country_cMeaning");
    private final static QName _ProjectsCEstimatedGrossFeeUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EstimatedGrossFeeUSD_c");
    private final static QName _ProjectsCConstructionBidUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ConstructionBidUSD_c");
    private final static QName _ProjectsCServiceAreaFacilityTypesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ServiceAreaFacilityTypes_c");
    private final static QName _ProjectsCOpportunityIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OpportunityId_c");
    private final static QName _ProjectsCSF330CodeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SF330Code_cMeaning");
    private final static QName _ProjectsCAdditionalProjectC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalProject_c");
    private final static QName _ProjectsCMarketSectorCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSector_cMeaning");
    private final static QName _ProjectsCSourceType_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SourceType");
    private final static QName _ProjectsCDataIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Data_Id_c");
    private final static QName _ProjectsCBusinessClassDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessClassDescription_c");
    private final static QName _ProjectsCPrimaryCompanyIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryCompany_Id_c");
    private final static QName _ProjectsCLastActivityDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastActivityDate_c");
    private final static QName _ProjectsCNoticeToProceedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NoticeToProceed_c");
    private final static QName _ProjectsCDataContactEmailAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DataContact_EmailAddress_c");
    private final static QName _ProjectsCAttachmentEntityName_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AttachmentEntityName");
    private final static QName _ProjectsCHDRRoleCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HDRRole_cMeaning");
    private final static QName _ProjectsCComponentssC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Componentss_c");
    private final static QName _ProjectsCEstimatedNetFeeUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EstimatedNetFeeUSD_c");
    private final static QName _ProjectsCPrimaryCompanyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryCompany_c");
    private final static QName _ProjectsCOwnerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OwnerId_c");
    private final static QName _ProjectsCDeliveryMethodCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DeliveryMethod_cMeaning");
    private final static QName _ProjectsCContractProjectIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractProject_Id_c");
    private final static QName _ProjectsCRestrictionCommentsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RestrictionComments_c");
    private final static QName _ProjectsCSubComponentCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubComponent_cMeaning");
    private final static QName _ProjectsCKeyProjectTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "KeyProjectType_cMeaning");
    private final static QName _ProjectsCEstimatedCompletionDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EstimatedCompletionDate_c");
    private final static QName _ProjectsCPrimaryGSACodesAndSF330CodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryGSACodesAndSF330Code_c");
    private final static QName _ProjectsCGSACodesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GSACodes_cMeaning");
    private final static QName _ProjectsCResearchTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ResearchType_cMeaning");
    private final static QName _ProjectsCOpportunityNameSIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OpportunityNameS_Id_c");
    private final static QName _ProjectsCResearchTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ResearchType_c");
    private final static QName _ProjectsCCountryC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Country_c");
    private final static QName _ProjectsCProfessionalServicesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProfessionalServices_cMeaning");
    private final static QName _ProjectsCProjectTypesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectTypes_c");
    private final static QName _ProjectsCCompanyCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Company_cMeaning");
    private final static QName _ProjectsCContractNamesIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractNames_Id_c");
    private final static QName _ProjectsCComponentsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Components_c");
    private final static QName _ProjectsCReportingDataContactC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ReportingDataContact_c");
    private final static QName _ProjectsCAddressSequenceNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AddressSequenceNumber_c");
    private final static QName _ProjectsCMarketSectorC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSector_c");
    private final static QName _ProjectsCEBSIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EBSID_c");
    private final static QName _ProjectsCBusinessClassDescriptionSC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessClassDescriptionS_c");
    private final static QName _ProjectsCCurrency1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Currency1_c");
    private final static QName _ProjectsCGSACodesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GSACodes_c");
    private final static QName _ProjectsCCountyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "County_c");
    private final static QName _ProjectsCPlannedFinishDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PlannedFinishDate_c");
    private final static QName _ProjectsCConstructionCompletionDatesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ConstructionCompletionDates_c");
    private final static QName _ProjectsCPrimaryGSACodeFromContractC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryGSACodeFromContract_c");
    private final static QName _ProjectsCClientDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ClientDescription_c");
    private final static QName _ProjectsCBusinessGroupsCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessGroups_cMeaning");
    private final static QName _ProjectsCTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Type_cMeaning");
    private final static QName _ProjectsCReportingBillableAccountC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ReportingBillableAccount_c");
    private final static QName _ProjectsCLocaleC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Locale_c");
    private final static QName _ProjectsCClientC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Client_c");
    private final static QName _ProjectsCProjectTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectType_c");
    private final static QName _ProjectsCActualSubConsultantFeeUSDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActualSubConsultantFeeUSD_c");
    private final static QName _ProjectsCIntegrationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Integration_c");
    private final static QName _ProjectsCSF330ProfileCodesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SF330ProfileCodes_cMeaning");
    private final static QName _ProjectsCPreBookingIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PreBookingID_c");
    private final static QName _ProjectsCBusinessUnitC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessUnit_c");
    private final static QName _ProjectsCServiceAreaFacilityTypesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ServiceAreaFacilityTypes_cMeaning");
    private final static QName _ProjectsCBusinessClassC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessClass_c");
    private final static QName _ProjectsCFederalNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FederalNumber_c");
    private final static QName _LocationCEBSCompanyIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EBSCompanyID_c");
    private final static QName _LocationCLocationCodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LocationCode_c");
    private final static QName _LocationCEBSCompanyAddressTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EBSCompanyAddressType_c");
    private final static QName _LocationCLongitudeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Longitude_c");
    private final static QName _LocationCEBSCompanyAddressIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EBSCompanyAddressID_c");
    private final static QName _LocationCLocationIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LocationId_c");
    private final static QName _LocationCDoNotUseC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DoNotUse_c");
    private final static QName _LocationCStatesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "States_cMeaning");
    private final static QName _LocationCLocationSourceC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LocationSource_c");
    private final static QName _LocationCLatitudeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Latitude_c");
    private final static QName _OptyContractCOpportunityIdSrcOpportunityToOptyContractC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Opportunity_Id_Src_OpportunityToOpty_Contract_c");
    private final static QName _OptyContractCContractIdTgtContractCToOptyContractC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Contract_Id_Tgt_Contract_cToOpty_Contract_c");
    private final static QName _LanguageCSpeakCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Speak_cMeaning");
    private final static QName _LanguageCNativeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Native_c");
    private final static QName _LanguageCTeacherCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Teacher_cMeaning");
    private final static QName _LanguageCReadCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Read_cMeaning");
    private final static QName _LanguageCWriteC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Write_c");
    private final static QName _LanguageCNativeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Native_cMeaning");
    private final static QName _LanguageCReadC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Read_c");
    private final static QName _LanguageCLanguageC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Language_c");
    private final static QName _LanguageCSpeakC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Speak_c");
    private final static QName _LanguageCTranslatorC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Translator_c");
    private final static QName _LanguageCTranslatorCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Translator_cMeaning");
    private final static QName _LanguageCTeacherC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Teacher_c");
    private final static QName _LanguageCLanguageCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Language_cMeaning");
    private final static QName _PartnersJointBidsCRoleCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Role_cMeaning");
    private final static QName _PartnersJointBidsCTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Type_cMeaning");
    private final static QName _PartnersJointBidsCCommentC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Comment_c");
    private final static QName _PartnersJointBidsCRoleC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Role_c");
    private final static QName _PartnersJointBidsCTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Type_c");
    private final static QName _PartnersJointBidsCDoNotUseC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DoNotUse_c");
    private final static QName _ProfessionalMembershipsCStatusC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Status_c");
    private final static QName _ProfessionalMembershipsCAcronymC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Acronym_c");
    private final static QName _ProfessionalMembershipsCAdditionalInformationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalInformation_c");
    private final static QName _ProfessionalMembershipsCChapterC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Chapter_c");
    private final static QName _ProfessionalMembershipsCCommitteeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Committee_c");
    private final static QName _ProfessionalMembershipsCEndYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EndYear_c");
    private final static QName _ProfessionalMembershipsCRoleCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Role_cMeaning");
    private final static QName _ProfessionalMembershipsCDurationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Duration_c");
    private final static QName _ProfessionalMembershipsCStatusCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Status_cMeaning");
    private final static QName _ProfessionalMembershipsCBeginYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BeginYear_c");
    private final static QName _ProfessionalMembershipsCRoleC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Role_c");
    private final static QName _ActivitiesCActivityTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActivityType_c");
    private final static QName _ActivitiesCDateYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DateYear_c");
    private final static QName _ApproversCApproverDesignationC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ApproverDesignation_c");
    private final static QName _ApproversCTitleC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Title_c");
    private final static QName _ApproversCGoNoGoFormC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "GoNoGoForm_c");
    private final static QName _ApproversCGoNoGoFormCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "GoNoGoForm_cMeaning");
    private final static QName _ApproversCCommentsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Comments_c");
    private final static QName _ApproversCApprovalDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ApprovalDate_c");
    private final static QName _AcademicHonorsAndResearchCDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Date_c");
    private final static QName _ClientOwnerReferencesCOwnerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Owner_c");
    private final static QName _ClientOwnerReferencesCContactsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Contacts_c");
    private final static QName _ClientOwnerReferencesCBackendEmailC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackendEmail_c");
    private final static QName _ClientOwnerReferencesCNotessC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Notess_c");
    private final static QName _ClientOwnerReferencesCBackendPrC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackendPr_c");
    private final static QName _ClientOwnerReferencesCLastConfirmedBysIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastConfirmedBys_Id_c");
    private final static QName _ClientOwnerReferencesCReferenceC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Reference_c");
    private final static QName _ClientOwnerReferencesCRefChangedByC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RefChangedBy_c");
    private final static QName _ClientOwnerReferencesCLastConfirmedByC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastConfirmedBy_c");
    private final static QName _ClientOwnerReferencesCContactC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Contact_c");
    private final static QName _ClientOwnerReferencesCOwnerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Owner_Id_c");
    private final static QName _ClientOwnerReferencesCContactsIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Contacts_Id_c");
    private final static QName _ClientOwnerReferencesCLastConfirmedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastConfirmedDate_c");
    private final static QName _ClientOwnerReferencesCNotesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Notes_c");
    private final static QName _ClientOwnerReferencesCContactIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Contact_Id_c");
    private final static QName _ClientOwnerReferencesCLastConfirmedBysC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastConfirmedBys_c");
    private final static QName _ClientOwnerReferencesCDateReferenceChangedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DateReferenceChanged_c");
    private final static QName _ClientOwnerReferencesCReferenceCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Reference_cMeaning");
    private final static QName _AdditionalOverviewsBiosCLastUpdateByIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastUpdateBy_Id_c");
    private final static QName _AdditionalOverviewsBiosCLastUpdateByC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastUpdateBy_c");
    private final static QName _AdditionalOverviewsBiosCLastUpdatedByC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastUpdatedBy_c");
    private final static QName _AdditionalOverviewsBiosCLastUpdateDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastUpdateDate_c");
    private final static QName _AdditionalOverviewsBiosCLastUpdatedByIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastUpdatedBy_Id_c");
    private final static QName _PublicationsCYearC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Year_c");
    private final static QName _PublicationsCPublicationTypesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PublicationTypes_c");
    private final static QName _PublicationsCPublicationTypesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PublicationTypes_cMeaning");
    private final static QName _AditonalProjectsCCompanyDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CompanyDescription_c");
    private final static QName _AditonalProjectsCBusinessClasssC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessClasss_c");
    private final static QName _AditonalProjectsCBusUnitDescriptonC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusUnitDescripton_c");
    private final static QName _AditonalProjectsCProjectDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectDescription_c");
    private final static QName _AditonalProjectsCBusinessClasssCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessClasss_cMeaning");
    private final static QName _PresentationsCPublicationTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PublicationType_c");
    private final static QName _PresentationsCConferenceNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ConferenceName_c");
    private final static QName _PresentationsCNonHDRAuthorsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NonHDRAuthors_c");
    private final static QName _PresentationsCPublicationTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PublicationType_cMeaning");
    private final static QName _PresentationsCHDRAuthorC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HDRAuthor_c");
    private final static QName _PresentationsCYearCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Year_cMeaning");
    private final static QName _PresentationsCOtherHDRAuthorsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OtherHDRAuthors_c");
    private final static QName _AwardOrganizationCBackEndOrganizationNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackEndOrganizationName_c");
    private final static QName _AwardOrganizationCOrganizationNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrganizationName_c");
    private final static QName _ProjectAwardNewCOrganizationAbbreviationIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrganizationAbbreviation_Id_c");
    private final static QName _ProjectAwardNewCOrganizationAbbreviation1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OrganizationAbbreviation1_c");
    private final static QName _OptyProjectCProjectsIdTgtProjectsCToOptyProjectC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Projects_Id_Tgt_Projects_cToOpty_Project_c");
    private final static QName _OptyProjectCOpportunityIdSrcOpportunityToOptyProjectC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Opportunity_Id_Src_OpportunityToOpty_Project_c");
    private final static QName _OwnerCCustomerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Customer_Id_c");
    private final static QName _OwnerCAddress1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Address1_c");
    private final static QName _OwnerCAddress3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Address3_c");
    private final static QName _OwnerCAddress2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Address2_c");
    private final static QName _SubconsultantCSubconsultantServicessCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubconsultantServicess_cMeaning");
    private final static QName _SubconsultantCCompanyClassificationCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CompanyClassification_cMeaning");
    private final static QName _SubconsultantCCompanyClassificationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CompanyClassification_c");
    private final static QName _SubconsultantCFeesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Fees_c");
    private final static QName _SubconsultantCCompanyClassificationssCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CompanyClassificationss_cMeaning");
    private final static QName _SubconsultantCSubconsultantIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubconsultantId_c");
    private final static QName _SubconsultantCCompanyClassificationssC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CompanyClassificationss_c");
    private final static QName _SubconsultantCCompanyClassificationsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CompanyClassifications_c");
    private final static QName _SubconsultantCSubconsultantServicessC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubconsultantServicess_c");
    private final static QName _GSACodesC2GSACodessC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GSACodess_c");
    private final static QName _GSACodesC2SF330C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SF330_c");
    private final static QName _GSACodesC2NetFeeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NetFee_c");
    private final static QName _RelatedOpportunitiesCPotentialSNBUSDCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PotentialSNBUSD_cCurcyConvRate");
    private final static QName _RelatedOpportunitiesCFeeChgANTPUSDC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FeeChgANTPUSD_c");
    private final static QName _RelatedOpportunitiesCMasterOpportunityC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MasterOpportunity_c");
    private final static QName _RelatedOpportunitiesCFeeChgANTPUSDCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FeeChgANTPUSD_cCurcyConvRate");
    private final static QName _RelatedOpportunitiesCTransferC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Transfer_c");
    private final static QName _RelatedOpportunitiesCBusinessClassCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessClass_cMeaning");
    private final static QName _RelatedOpportunitiesCBusinessGroupC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessGroup_c");
    private final static QName _RelatedOpportunitiesCMasterOpportunityIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MasterOpportunity_Id_c");
    private final static QName _RelatedOpportunitiesCPotentialSNBUSDC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PotentialSNBUSD_c");
    private final static QName _RelatedOpportunitiesCPotentialSNBUSDCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PotentialSNBUSD_cCurrencyCode");
    private final static QName _RelatedOpportunitiesCContractNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContractNumber_c");
    private final static QName _RelatedOpportunitiesCFeeChgANTPUSDCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FeeChgANTPUSD_cCurrencyCode");
    private final static QName _RelatedOpportunitiesCBusinessUnitC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessUnit_c");
    private final static QName _RelatedOpportunitiesCBusinessUnitCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessUnit_cMeaning");
    private final static QName _RelatedOpportunitiesCBusinessClassC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessClass_c");
    private final static QName _RelatedOpportunitiesCBusinessGroupCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessGroup_cMeaning");
    private final static QName _PursuitMilestonesCDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Date_c");
    private final static QName _PursuitMilestonesCMilestoneTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MilestoneType_c");
    private final static QName _PursuitMilestonesCMilestoneTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MilestoneType_cMeaning");
    private final static QName _EducationCStateProvinceC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "StateProvince_c");
    private final static QName _EducationCDegreeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Degree_c");
    private final static QName _EducationCInstitutionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Institution_c");
    private final static QName _EducationCMajorC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Major_c");
    private final static QName _EducationCConcentrationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Concentration_c");
    private final static QName _EducationCYearsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Years_c");
    private final static QName _EducationCStatesProvincesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "StatesProvinces_c");
    private final static QName _EducationCEducationTypeCodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EducationTypeCode_c");
    private final static QName _EmployeesCEBSEmployeeNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EBSEmployeeNumber_c");
    private final static QName _EmployeesCSectionCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Section_cMeaning");
    private final static QName _EmployeesCIndustryTenureC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "IndustryTenure_c");
    private final static QName _EmployeesCActivityIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Activity_Id_c");
    private final static QName _EmployeesCActivityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Activity_c");
    private final static QName _EmployeesCFirstNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FirstName_c");
    private final static QName _EmployeesCBackendIntegrationDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackendIntegrationDate_c");
    private final static QName _EmployeesCEmployeeLegacySystemIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EmployeeLegacySystemID_c");
    private final static QName _EmployeesCEmployeeIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EmployeeID_c");
    private final static QName _EmployeesCDepartmentCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Department_cMeaning");
    private final static QName _EmployeesCExperienceOverviewC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ExperienceOverview_c");
    private final static QName _EmployeesCUpdateDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "UpdateDate_c");
    private final static QName _EmployeesCCredentialsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Credentials_c");
    private final static QName _EmployeesCResumeDataContactsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ResumeDataContacts_c");
    private final static QName _EmployeesCWorkPhoneC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "WorkPhone_c");
    private final static QName _EmployeesCLastNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastName_c");
    private final static QName _EmployeesCHireDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HireDate_c");
    private final static QName _EmployeesCPreferredNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PreferredName_c");
    private final static QName _EmployeesCExperienceLastUpdatedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ExperienceLastUpdated_c");
    private final static QName _EmployeesCHDRTenureC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HDRTenure_c");
    private final static QName _EmployeesCResumeDataContactC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ResumeDataContact_c");
    private final static QName _EmployeesCOfficeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Office_c");
    private final static QName _EmployeesCBusinessTitleC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessTitle_c");
    private final static QName _EmployeesCWorkAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "WorkAddress_c");
    private final static QName _EmployeesCExperienceGroupNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ExperienceGroupName_c");
    private final static QName _EmployeesCSectionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Section_c");
    private final static QName _EmployeesCLanguagesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Languages_c");
    private final static QName _EmployeesCMiddleInitialsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MiddleInitials_c");
    private final static QName _EmployeesCEmailAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EmailAddress_c");
    private final static QName _EmployeesCLanguagesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Languages_cMeaning");
    private final static QName _EmployeesCResumeDataContactsIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ResumeDataContacts_Id_c");
    private final static QName _ProjectTeamCProjectRoleC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectRole_c");
    private final static QName _ProjectTeamCResumeProjectRoleC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ResumeProjectRole_c");
    private final static QName _ProjectTeamCHoursChargedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HoursCharged_c");
    private final static QName _ProjectTeamCResumeSummaryC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ResumeSummary_c");
    private final static QName _ProjectTeamCDefaultResumeSummaryC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DefaultResumeSummary_c");
    private final static QName _ProjectTeamCSubConsultantTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubConsultantType_cMeaning");
    private final static QName _ProjectTeamCSubConsultantTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SubConsultantType_c");
    private final static QName _NotesResumeReferencesCSavedByC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SavedBy_c");
    private final static QName _NotesResumeReferencesCTypeOfResumeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TypeOfResume_c");
    private final static QName _NotesResumeReferencesCSavedSearchC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SavedSearch_c");
    private final static QName _NotesResumeReferencesCDateModifiedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DateModified_c");
    private final static QName _NotesResumeReferencesCRemoveSavedSearchFromOSCC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RemoveSavedSearchFromOSC_c");
    private final static QName _EmployeeProjectsCMasterContractNamesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MasterContractNames_c");
    private final static QName _EmployeeProjectsCProjectExperienceTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectExperienceType_cMeaning");
    private final static QName _EmployeeProjectsCResponsibilitiesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Responsibilities_c");
    private final static QName _EmployeeProjectsCRolesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Roles_cMeaning");
    private final static QName _EmployeeProjectsCHoursChargedsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HoursChargeds_c");
    private final static QName _EmployeeProjectsCProjectLastActivityDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectLastActivityDate_c");
    private final static QName _EmployeeProjectsCAdditionalProjectRoleC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalProjectRole_c");
    private final static QName _EmployeeProjectsCProjectNameIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectName_Id_c");
    private final static QName _EmployeeProjectsCAdditionalProjectRolesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalProjectRoles_c");
    private final static QName _EmployeeProjectsCProjectExperienceTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectExperienceType_c");
    private final static QName _EmployeeProjectsCProjectLocationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectLocation_c");
    private final static QName _EmployeeProjectsCMasterContractNameIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MasterContractName_Id_c");
    private final static QName _EmployeeProjectsCEBSProjectIDIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EBSProjectID_Id_c");
    private final static QName _EmployeeProjectsCProjectNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectName_c");
    private final static QName _EmployeeProjectsCEBSNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EBSNumber_c");
    private final static QName _EmployeeProjectsCClientNameC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ClientName_c");
    private final static QName _EmployeeProjectsCRolesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Roles_c");
    private final static QName _ContactsCNamesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Names_c");
    private final static QName _ContactsCReferenceChangedDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ReferenceChangedDate_c");
    private final static QName _ContactsCEmailC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Email_c");
    private final static QName _ContactsCNamesIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Names_Id_c");
    private final static QName _ContactsCPhoneC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Phone_c");
    private final static QName _ContactsCJobTitleC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "JobTitle_c");
    private final static QName _ProjectDescriptionCDescriptionTypeCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DescriptionType_cMeaning");
    private final static QName _ProjectNamesCProjectName4C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectName4_c");
    private final static QName _ProjectNamesCProjectName3C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectName3_c");
    private final static QName _ProjectNamesCProjectNamesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectNames_c");
    private final static QName _ProjectNamesCProjectName2C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectName2_c");
    private final static QName _ProjectNamesCProjectName5C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectName5_c");
    private final static QName _TasksCProjectsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Projects_c");
    private final static QName _TasksCTaskOwnerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TaskOwner_Id_c");
    private final static QName _TasksCTaskIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TaskId_c");
    private final static QName _TasksCTaskOwnerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TaskOwner_c");
    private final static QName _MeasuresCDescriptionsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Descriptions_c");
    private final static QName _MeasuresCMeasuresCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Measures_cMeaning");
    private final static QName _MeasuresCMeasuressCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Measuress_cMeaning");
    private final static QName _MeasuresCMeasuresC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Measures_c");
    private final static QName _MeasuresCMeasureC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Measure_c");
    private final static QName _MeasuresCMeasureDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MeasureDescription_c");
    private final static QName _MeasuresCUnitC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Unit_c");
    private final static QName _PrimaryCompanyCLastChekedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LastCheked_c");
    private final static QName _PrimaryCompanyCAddressNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AddressNumber_c");
    private final static QName _PrimaryCompanyCPrimaryCompanyIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryCompanyId_c");
    private final static QName _PrimaryCompanyCCheckedByC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CheckedBy_c");
    private final static QName _PrimaryCompanyCAddressC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Address_c");
    private final static QName _PrimaryCompanyCAddressNumberDescriptonC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AddressNumberDescripton_c");
    private final static QName _OpportunityForecastCConfidencesC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Confidences_c");
    private final static QName _OpportunityForecastCConfidenceC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Confidence_c");
    private final static QName _OpportunityForecastCForecastDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ForecastDate_c");
    private final static QName _OpportunityForecastCConfidencesCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Confidences_cMeaning");
    private final static QName _OpportunityForecastCTotalGrossForecastC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalGrossForecast_c");
    private final static QName _OpportunityForecastCTotalNetForecastC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalNetForecast_c");
    private final static QName _OpportunityForecastCNetForecastC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "NetForecast_c");
    private final static QName _OpportunityForecastCGrossForecastC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "GrossForecast_c");
    private final static QName _CostsFeesCDescriptionsCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Descriptions_cMeaning");
    private final static QName _CostsFeesCDescriptionssC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Descriptionss_c");
    private final static QName _CostsFeesCCurrencysC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Currencys_c");
    private final static QName _CostsFeesCCostFeeIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CostFeeId_c");
    private final static QName _EmployeessCBackEndCountForEmailC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BackEndCountForEmail_c");
    private final static QName _EmployeessCDepartmentC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Department_c");
    private final static QName _EmployeessCLastNameC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastName_c");
    private final static QName _EmployeessCDepartmentCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Department_cMeaning");
    private final static QName _EmployeessCEmailAddressC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmailAddress_c");
    private final static QName _ContractCMasterContractC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MasterContract_c");
    private final static QName _ContractCNAICSSC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NAICSS_c");
    private final static QName _ContractCProjectManagerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectManager_c");
    private final static QName _ContractCMasterContractIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MasterContract_Id_c");
    private final static QName _ContractCHDRCompaniesIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HDRCompanies_Id_c");
    private final static QName _ContractCEBSIDContractC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EBSIDContract_c");
    private final static QName _ContractCOpportunityIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Opportunity_Id_c");
    private final static QName _ContractCTotalValueOfAllOpenOpportunitiC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TotalValueOfAllOpenOpportuniti_c");
    private final static QName _ContractCTotalContractCapacityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TotalContractCapacity_c");
    private final static QName _ContractCParentCompanyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ParentCompany_c");
    private final static QName _ContractCParentAccountC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ParentAccount_c");
    private final static QName _ContractCAreaOfReachC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AreaOfReach_c");
    private final static QName _ContractCHDRPotentialCapacityGrossC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HDRPotentialCapacityGross_c");
    private final static QName _ContractCReportingMasterContractC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ReportingMasterContract_c");
    private final static QName _ContractCFirmsAwardedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FirmsAwarded_c");
    private final static QName _ContractCParentCompanyIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ParentCompany_Id_c");
    private final static QName _ContractCCustomerDetailsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CustomerDetails_c");
    private final static QName _ContractCHDRCompanyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HDRCompany_c");
    private final static QName _ContractCTotalRemainingPotentialCapacitC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TotalRemainingPotentialCapacit_c");
    private final static QName _ContractCTotalContractValueToDateGrossC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TotalContractValueToDateGross_c");
    private final static QName _ContractCHDRPotentialCapacityNetC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HDRPotentialCapacityNet_c");
    private final static QName _ContractCMasterOpportunityIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MasterOpportunityID_c");
    private final static QName _ContractCMarketSectosC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MarketSectos_c");
    private final static QName _ContractCFirmsAwardedsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FirmsAwardeds_c");
    private final static QName _ContractCGeographicReachC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "GeographicReach_c");
    private final static QName _ContractCHDRC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HDR_c");
    private final static QName _ContractCContractIDSC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractIDS_c");
    private final static QName _ContractCEndDatedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "EndDated_c");
    private final static QName _ContractCBillableAccountForReportingC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BillableAccountForReporting_c");
    private final static QName _ContractCProjectManagerIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ProjectManager_Id_c");
    private final static QName _ContractCNAICSC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NAICS_c");
    private final static QName _ContractCParentCompaniesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ParentCompanies_c");
    private final static QName _ContractCProbabilityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Probability_c");
    private final static QName _ContractCNAICSCodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NAICSCode_c");
    private final static QName _ContractCPrimaryAccountForReportingC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryAccountForReporting_c");
    private final static QName _ContractCStageC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Stage_c");
    private final static QName _ContractCContractManagerC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractManager_c");
    private final static QName _ContractCFeeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Fee_c");
    private final static QName _ContractCOpportunityNameForReportingC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "OpportunityNameForReporting_c");
    private final static QName _ContractCContractNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractNumber_c");
    private final static QName _ContractCContractAwardTypesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractAwardTypes_c");
    private final static QName _ContractCBackendContractManagerEmailAddC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackendContractManagerEmailAdd_c");
    private final static QName _ContractCNAICSDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NAICSDescription_c");
    private final static QName _ContractCTotalRemainingCapacityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TotalRemainingCapacity_c");
    private final static QName _ContractCXC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "X_c");
    private final static QName _ContractCContractAwardTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractAwardType_c");
    private final static QName _ContractCHDRCompaniesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "HDRCompanies_c");
    private final static QName _ContractCContractLegacySystemIDC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ContractLegacySystemID_c");
    private final static QName _ContractCOpportunityC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Opportunity_c");
    private final static QName _IndustryAwardsCOrganizationsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Organizations_c");
    private final static QName _IndustryAwardsCOrganizationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Organization_c");
    private final static QName _IndustryAwardsCOrganizationIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Organization_Id_c");
    private final static QName _IndustryAwardsCSponsorC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Sponsor_c");
    private final static QName _IndustryAwardsCProjectC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Project_c");
    private final static QName _IndustryAwardsCProjectIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Project_Id_c");
    private final static QName _BillableCompanyCCustomersC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Customers_c");
    private final static QName _BillableCompanyCCompanyIdC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "CompanyId_c");
    private final static QName _ProjectServicesCBusinessClassCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BusinessClass_cMeaning");
    private final static QName _ProjectServicesCServiceTypesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ServiceTypes_c");
    private final static QName _ProjectServicesCServiceTypesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ServiceTypes_cMeaning");
    private final static QName _DatesMilestonesCActualCompletionDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ActualCompletionDate_c");
    private final static QName _DatesMilestonesCCurrencuC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Currencu_c");
    private final static QName _DatesMilestonesCContractC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Contract_c");
    private final static QName _DatesMilestonesCDatesmmyyyyC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Datesmmyyyy_c");
    private final static QName _DatesMilestonesCMilestonesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Milestones_c");
    private final static QName _DatesMilestonesCCurrencuCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Currencu_cMeaning");
    private final static QName _DatesMilestonesCAdditionalDescriptionCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Additional_Description_cMeaning");
    private final static QName _DatesMilestonesCMilestoneDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "MilestoneDescription_c");
    private final static QName _TrainingCExpirationDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ExpirationDate_c");
    private final static QName _TrainingCTrainingTypeCodeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TrainingTypeCode_c");
    private final static QName _TrainingCTrainingDescriptionC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TrainingDescription_c");
    private final static QName _TrainingCProviderC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Provider_c");
    private final static QName _FacilityTypesCSpaceComponents1C_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SpaceComponents1_c");
    private final static QName _FacilityTypesCAdditionalBusinessClasseC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalBusinessClasse_c");
    private final static QName _FacilityTypesCSustainableComponentsC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SustainableComponents_c");
    private final static QName _FacilityTypesCPrimaryBusinessGroupFromContraCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryBusinessGroupFromContra_cMeaning");
    private final static QName _FacilityTypesCFacilityTypesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FacilityTypes_cMeaning");
    private final static QName _FacilityTypesCSustainableComponentsCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SustainableComponents_cMeaning");
    private final static QName _FacilityTypesCSpaceComponents1CMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "SpaceComponents1_cMeaning");
    private final static QName _FacilityTypesCAdditionalBusinessGroupsCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalBusinessGroups_cMeaning");
    private final static QName _FacilityTypesCPrimaryBusinessGroupFromContrCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryBusinessGroupFromContr_cMeaning");
    private final static QName _FacilityTypesCFacilityTypesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FacilityTypes_c");
    private final static QName _FacilityTypesCPrimaryBusinessGroupFromContrC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryBusinessGroupFromContr_c");
    private final static QName _FacilityTypesCPrimaryBusinessClassFromContraCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryBusinessClassFromContra_cMeaning");
    private final static QName _FacilityTypesCAdditionalBusinessClasseCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalBusinessClasse_cMeaning");
    private final static QName _FacilityTypesCPrimaryBusinessClassFromContrCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryBusinessClassFromContr_cMeaning");
    private final static QName _FacilityTypesCAdditionalBusinessClassesCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "AdditionalBusinessClasses_cMeaning");
    private final static QName _FacilityTypesCPrimaryBusinessClassFromContrC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "PrimaryBusinessClassFromContr_c");
    private final static QName _LicensesCertificationsCExpiresC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Expires_c");
    private final static QName _LicensesCertificationsCIssuedC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Issued_c");
    private final static QName _LicensesCertificationsCDonNotUseC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "DonNotUse_c");
    private final static QName _LicensesCertificationsCNationalRegistrationC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NationalRegistration_c");
    private final static QName _LicensesCertificationsCLicenseCertificationTypesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LicenseCertificationTypes_c");
    private final static QName _LicensesCertificationsCWillNotRenewCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "WillNotRenew_cMeaning");
    private final static QName _LicensesCertificationsCBackEndFieldC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "BackEndField_c");
    private final static QName _LicensesCertificationsCRegnNoC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "RegnNo_c");
    private final static QName _LicensesCertificationsCLicenseCertificationTypeC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LicenseCertificationType_c");
    private final static QName _LicensesCertificationsCLicenseCertNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LicenseCertNumber_c");
    private final static QName _LicensesCertificationsCLicenceCertNumberC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "LicenceCertNumber_c");
    private final static QName _LicensesCertificationsCWillNotRenewC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "WillNotRenew_c");
    private final static QName _LicensesCertificationsCNationalRegistrationCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "NationalRegistration_cMeaning");
    private final static QName _LicensesCertificationsCNoC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "No_c");
    private final static QName _LicensesCertificationsCStateUSAC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "StateUSA_c");
    private final static QName _CurrencyDailyRateCTOCURRENCYC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "TO_CURRENCY_c");
    private final static QName _CurrencyDailyRateCConversionDateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ConversionDate_c");
    private final static QName _CurrencyDailyRateCConversionDatesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ConversionDates_c");
    private final static QName _CurrencyDailyRateCConversionRateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ConversionRate_c");
    private final static QName _CurrencyDailyRateCInverseRateC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "InverseRate_c");
    private final static QName _CurrencyDailyRateCConversionRatesC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "ConversionRates_c");
    private final static QName _CurrencyDailyRateCFROMCURRENCYC_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "FROM_CURRENCY_c");
    private final static QName _GSACodesCDescriptionCMeaning_QNAME = new QName("/oracle/apps/sales/custExtn/views/common/", "Description_cMeaning");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hdr.ws.stubs.customeObject
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProcessEntityResponse }
     * 
     */
    public ProcessEntityResponse createProcessEntityResponse() {
        return new ProcessEntityResponse();
    }

    /**
     * Create an instance of {@link DeleteEntityResponse }
     * 
     */
    public DeleteEntityResponse createDeleteEntityResponse() {
        return new DeleteEntityResponse();
    }

    /**
     * Create an instance of {@link CreateEntityResponse }
     * 
     */
    public CreateEntityResponse createCreateEntityResponse() {
        return new CreateEntityResponse();
    }

    /**
     * Create an instance of {@link UpdateEntity }
     * 
     */
    public UpdateEntity createUpdateEntity() {
        return new UpdateEntity();
    }

    /**
     * Create an instance of {@link GetEntity }
     * 
     */
    public GetEntity createGetEntity() {
        return new GetEntity();
    }

    /**
     * Create an instance of {@link DeleteEntity }
     * 
     */
    public DeleteEntity createDeleteEntity() {
        return new DeleteEntity();
    }

    /**
     * Create an instance of {@link MergeEntityResponse }
     * 
     */
    public MergeEntityResponse createMergeEntityResponse() {
        return new MergeEntityResponse();
    }

    /**
     * Create an instance of {@link CreateEntity }
     * 
     */
    public CreateEntity createCreateEntity() {
        return new CreateEntity();
    }

    /**
     * Create an instance of {@link UpdateEntityResponse }
     * 
     */
    public UpdateEntityResponse createUpdateEntityResponse() {
        return new UpdateEntityResponse();
    }

    /**
     * Create an instance of {@link GetEntityList }
     * 
     */
    public GetEntityList createGetEntityList() {
        return new GetEntityList();
    }

    /**
     * Create an instance of {@link ProcessEntity }
     * 
     */
    public ProcessEntity createProcessEntity() {
        return new ProcessEntity();
    }

    /**
     * Create an instance of {@link ProcessControl }
     * 
     */
    public ProcessControl createProcessControl() {
        return new ProcessControl();
    }

    /**
     * Create an instance of {@link GetEntityListResponse }
     * 
     */
    public GetEntityListResponse createGetEntityListResponse() {
        return new GetEntityListResponse();
    }

    /**
     * Create an instance of {@link ServiceViewInfo }
     * 
     */
    public ServiceViewInfo createServiceViewInfo() {
        return new ServiceViewInfo();
    }

    /**
     * Create an instance of {@link FindEntity }
     * 
     */
    public FindEntity createFindEntity() {
        return new FindEntity();
    }

    /**
     * Create an instance of {@link FindCriteria }
     * 
     */
    public FindCriteria createFindCriteria() {
        return new FindCriteria();
    }

    /**
     * Create an instance of {@link FindControl }
     * 
     */
    public FindControl createFindControl() {
        return new FindControl();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsResponse }
     * 
     */
    public GetDfltObjAttrHintsResponse createGetDfltObjAttrHintsResponse() {
        return new GetDfltObjAttrHintsResponse();
    }

    /**
     * Create an instance of {@link ObjAttrHints }
     * 
     */
    public ObjAttrHints createObjAttrHints() {
        return new ObjAttrHints();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHints }
     * 
     */
    public GetDfltObjAttrHints createGetDfltObjAttrHints() {
        return new GetDfltObjAttrHints();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeResponse }
     * 
     */
    public GetServiceLastUpdateTimeResponse createGetServiceLastUpdateTimeResponse() {
        return new GetServiceLastUpdateTimeResponse();
    }

    /**
     * Create an instance of {@link FindEntityResponse }
     * 
     */
    public FindEntityResponse createFindEntityResponse() {
        return new FindEntityResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTime }
     * 
     */
    public GetServiceLastUpdateTime createGetServiceLastUpdateTime() {
        return new GetServiceLastUpdateTime();
    }

    /**
     * Create an instance of {@link GetEntityResponse }
     * 
     */
    public GetEntityResponse createGetEntityResponse() {
        return new GetEntityResponse();
    }

    /**
     * Create an instance of {@link MergeEntity }
     * 
     */
    public MergeEntity createMergeEntity() {
        return new MergeEntity();
    }

    /**
     * Create an instance of {@link AwardOrganizationC }
     * 
     */
    public AwardOrganizationC createAwardOrganizationC() {
        return new AwardOrganizationC();
    }

    /**
     * Create an instance of {@link ContractC }
     * 
     */
    public ContractC createContractC() {
        return new ContractC();
    }

    /**
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
    }

    /**
     * Create an instance of {@link ProposalDevelopmentsC }
     * 
     */
    public ProposalDevelopmentsC createProposalDevelopmentsC() {
        return new ProposalDevelopmentsC();
    }

    /**
     * Create an instance of {@link PresentationsC }
     * 
     */
    public PresentationsC createPresentationsC() {
        return new PresentationsC();
    }

    /**
     * Create an instance of {@link ProjectContractC }
     * 
     */
    public ProjectContractC createProjectContractC() {
        return new ProjectContractC();
    }

    /**
     * Create an instance of {@link OptyProjectC }
     * 
     */
    public OptyProjectC createOptyProjectC() {
        return new OptyProjectC();
    }

    /**
     * Create an instance of {@link CurrencyDailyRateC }
     * 
     */
    public CurrencyDailyRateC createCurrencyDailyRateC() {
        return new CurrencyDailyRateC();
    }

    /**
     * Create an instance of {@link ActivitiesC }
     * 
     */
    public ActivitiesC createActivitiesC() {
        return new ActivitiesC();
    }

    /**
     * Create an instance of {@link SubconsultantC }
     * 
     */
    public SubconsultantC createSubconsultantC() {
        return new SubconsultantC();
    }

    /**
     * Create an instance of {@link IndustryAwardsC }
     * 
     */
    public IndustryAwardsC createIndustryAwardsC() {
        return new IndustryAwardsC();
    }

    /**
     * Create an instance of {@link DeepLinkingC }
     * 
     */
    public DeepLinkingC createDeepLinkingC() {
        return new DeepLinkingC();
    }

    /**
     * Create an instance of {@link TasksC }
     * 
     */
    public TasksC createTasksC() {
        return new TasksC();
    }

    /**
     * Create an instance of {@link EmployeeProjectsC }
     * 
     */
    public EmployeeProjectsC createEmployeeProjectsC() {
        return new EmployeeProjectsC();
    }

    /**
     * Create an instance of {@link LanguageC }
     * 
     */
    public LanguageC createLanguageC() {
        return new LanguageC();
    }

    /**
     * Create an instance of {@link NotesResumeReferencesC }
     * 
     */
    public NotesResumeReferencesC createNotesResumeReferencesC() {
        return new NotesResumeReferencesC();
    }

    /**
     * Create an instance of {@link ProfessionalMembershipsC }
     * 
     */
    public ProfessionalMembershipsC createProfessionalMembershipsC() {
        return new ProfessionalMembershipsC();
    }

    /**
     * Create an instance of {@link GSACodeC }
     * 
     */
    public GSACodeC createGSACodeC() {
        return new GSACodeC();
    }

    /**
     * Create an instance of {@link GSACodesC }
     * 
     */
    public GSACodesC createGSACodesC() {
        return new GSACodesC();
    }

    /**
     * Create an instance of {@link EmployeesC }
     * 
     */
    public EmployeesC createEmployeesC() {
        return new EmployeesC();
    }

    /**
     * Create an instance of {@link LicensesCertificationsC }
     * 
     */
    public LicensesCertificationsC createLicensesCertificationsC() {
        return new LicensesCertificationsC();
    }

    /**
     * Create an instance of {@link PublicationsC }
     * 
     */
    public PublicationsC createPublicationsC() {
        return new PublicationsC();
    }

    /**
     * Create an instance of {@link TrainingC }
     * 
     */
    public TrainingC createTrainingC() {
        return new TrainingC();
    }

    /**
     * Create an instance of {@link HDRHonorsAwardsC }
     * 
     */
    public HDRHonorsAwardsC createHDRHonorsAwardsC() {
        return new HDRHonorsAwardsC();
    }

    /**
     * Create an instance of {@link EducationC }
     * 
     */
    public EducationC createEducationC() {
        return new EducationC();
    }

    /**
     * Create an instance of {@link PastEmploymentC }
     * 
     */
    public PastEmploymentC createPastEmploymentC() {
        return new PastEmploymentC();
    }

    /**
     * Create an instance of {@link AcademicHonorsAndResearchC }
     * 
     */
    public AcademicHonorsAndResearchC createAcademicHonorsAndResearchC() {
        return new AcademicHonorsAndResearchC();
    }

    /**
     * Create an instance of {@link AdditionalOverviewsBiosC }
     * 
     */
    public AdditionalOverviewsBiosC createAdditionalOverviewsBiosC() {
        return new AdditionalOverviewsBiosC();
    }

    /**
     * Create an instance of {@link AdditionalProjectsC }
     * 
     */
    public AdditionalProjectsC createAdditionalProjectsC() {
        return new AdditionalProjectsC();
    }

    /**
     * Create an instance of {@link ProjectTeamC }
     * 
     */
    public ProjectTeamC createProjectTeamC() {
        return new ProjectTeamC();
    }

    /**
     * Create an instance of {@link FacilityTypesC }
     * 
     */
    public FacilityTypesC createFacilityTypesC() {
        return new FacilityTypesC();
    }

    /**
     * Create an instance of {@link ProjectAwardNewC }
     * 
     */
    public ProjectAwardNewC createProjectAwardNewC() {
        return new ProjectAwardNewC();
    }

    /**
     * Create an instance of {@link ContactsC }
     * 
     */
    public ContactsC createContactsC() {
        return new ContactsC();
    }

    /**
     * Create an instance of {@link LocationC }
     * 
     */
    public LocationC createLocationC() {
        return new LocationC();
    }

    /**
     * Create an instance of {@link ProjectNamesC }
     * 
     */
    public ProjectNamesC createProjectNamesC() {
        return new ProjectNamesC();
    }

    /**
     * Create an instance of {@link DatesMilestonesC }
     * 
     */
    public DatesMilestonesC createDatesMilestonesC() {
        return new DatesMilestonesC();
    }

    /**
     * Create an instance of {@link PrimaryCompanyC }
     * 
     */
    public PrimaryCompanyC createPrimaryCompanyC() {
        return new PrimaryCompanyC();
    }

    /**
     * Create an instance of {@link ProjectServicesC }
     * 
     */
    public ProjectServicesC createProjectServicesC() {
        return new ProjectServicesC();
    }

    /**
     * Create an instance of {@link TestimonialsC }
     * 
     */
    public TestimonialsC createTestimonialsC() {
        return new TestimonialsC();
    }

    /**
     * Create an instance of {@link BillableCompanyC }
     * 
     */
    public BillableCompanyC createBillableCompanyC() {
        return new BillableCompanyC();
    }

    /**
     * Create an instance of {@link ProjectAwardsC }
     * 
     */
    public ProjectAwardsC createProjectAwardsC() {
        return new ProjectAwardsC();
    }

    /**
     * Create an instance of {@link OwnerC }
     * 
     */
    public OwnerC createOwnerC() {
        return new OwnerC();
    }

    /**
     * Create an instance of {@link MeasuresC }
     * 
     */
    public MeasuresC createMeasuresC() {
        return new MeasuresC();
    }

    /**
     * Create an instance of {@link ProjectsC }
     * 
     */
    public ProjectsC createProjectsC() {
        return new ProjectsC();
    }

    /**
     * Create an instance of {@link AditonalProjectsC }
     * 
     */
    public AditonalProjectsC createAditonalProjectsC() {
        return new AditonalProjectsC();
    }

    /**
     * Create an instance of {@link CostsFeesC }
     * 
     */
    public CostsFeesC createCostsFeesC() {
        return new CostsFeesC();
    }

    /**
     * Create an instance of {@link ProjectDescriptionC }
     * 
     */
    public ProjectDescriptionC createProjectDescriptionC() {
        return new ProjectDescriptionC();
    }

    /**
     * Create an instance of {@link NotesAdditionalDescriptionC }
     * 
     */
    public NotesAdditionalDescriptionC createNotesAdditionalDescriptionC() {
        return new NotesAdditionalDescriptionC();
    }

    /**
     * Create an instance of {@link ClientOwnerReferencesC }
     * 
     */
    public ClientOwnerReferencesC createClientOwnerReferencesC() {
        return new ClientOwnerReferencesC();
    }

    /**
     * Create an instance of {@link GSACodesC2 }
     * 
     */
    public GSACodesC2 createGSACodesC2() {
        return new GSACodesC2();
    }

    /**
     * Create an instance of {@link OptyContractC }
     * 
     */
    public OptyContractC createOptyContractC() {
        return new OptyContractC();
    }

    /**
     * Create an instance of {@link ChildFindCriteria }
     * 
     */
    public ChildFindCriteria createChildFindCriteria() {
        return new ChildFindCriteria();
    }

    /**
     * Create an instance of {@link BigDecimalResult }
     * 
     */
    public BigDecimalResult createBigDecimalResult() {
        return new BigDecimalResult();
    }

    /**
     * Create an instance of {@link SortOrder }
     * 
     */
    public SortOrder createSortOrder() {
        return new SortOrder();
    }

    /**
     * Create an instance of {@link SortAttribute }
     * 
     */
    public SortAttribute createSortAttribute() {
        return new SortAttribute();
    }

    /**
     * Create an instance of {@link DataObjectResult }
     * 
     */
    public DataObjectResult createDataObjectResult() {
        return new DataObjectResult();
    }

    /**
     * Create an instance of {@link BooleanResult }
     * 
     */
    public BooleanResult createBooleanResult() {
        return new BooleanResult();
    }

    /**
     * Create an instance of {@link MeasureType }
     * 
     */
    public MeasureType createMeasureType() {
        return new MeasureType();
    }

    /**
     * Create an instance of {@link MethodResult }
     * 
     */
    public MethodResult createMethodResult() {
        return new MethodResult();
    }

    /**
     * Create an instance of {@link TimeResult }
     * 
     */
    public TimeResult createTimeResult() {
        return new TimeResult();
    }

    /**
     * Create an instance of {@link DateResult }
     * 
     */
    public DateResult createDateResult() {
        return new DateResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaRow }
     * 
     */
    public ViewCriteriaRow createViewCriteriaRow() {
        return new ViewCriteriaRow();
    }

    /**
     * Create an instance of {@link BytesResult }
     * 
     */
    public BytesResult createBytesResult() {
        return new BytesResult();
    }

    /**
     * Create an instance of {@link CtrlHint }
     * 
     */
    public CtrlHint createCtrlHint() {
        return new CtrlHint();
    }

    /**
     * Create an instance of {@link DoubleResult }
     * 
     */
    public DoubleResult createDoubleResult() {
        return new DoubleResult();
    }

    /**
     * Create an instance of {@link ViewCriteriaItem }
     * 
     */
    public ViewCriteriaItem createViewCriteriaItem() {
        return new ViewCriteriaItem();
    }

    /**
     * Create an instance of {@link ShortResult }
     * 
     */
    public ShortResult createShortResult() {
        return new ShortResult();
    }

    /**
     * Create an instance of {@link BigIntegerResult }
     * 
     */
    public BigIntegerResult createBigIntegerResult() {
        return new BigIntegerResult();
    }

    /**
     * Create an instance of {@link DataHandlerResult }
     * 
     */
    public DataHandlerResult createDataHandlerResult() {
        return new DataHandlerResult();
    }

    /**
     * Create an instance of {@link IntegerResult }
     * 
     */
    public IntegerResult createIntegerResult() {
        return new IntegerResult();
    }

    /**
     * Create an instance of {@link FloatResult }
     * 
     */
    public FloatResult createFloatResult() {
        return new FloatResult();
    }

    /**
     * Create an instance of {@link StringResult }
     * 
     */
    public StringResult createStringResult() {
        return new StringResult();
    }

    /**
     * Create an instance of {@link ByteResult }
     * 
     */
    public ByteResult createByteResult() {
        return new ByteResult();
    }

    /**
     * Create an instance of {@link LongResult }
     * 
     */
    public LongResult createLongResult() {
        return new LongResult();
    }

    /**
     * Create an instance of {@link AttrCtrlHints }
     * 
     */
    public AttrCtrlHints createAttrCtrlHints() {
        return new AttrCtrlHints();
    }

    /**
     * Create an instance of {@link ViewCriteria }
     * 
     */
    public ViewCriteria createViewCriteria() {
        return new ViewCriteria();
    }

    /**
     * Create an instance of {@link TimestampResult }
     * 
     */
    public TimestampResult createTimestampResult() {
        return new TimestampResult();
    }

    /**
     * Create an instance of {@link ServiceErrorMessage }
     * 
     */
    public ServiceErrorMessage createServiceErrorMessage() {
        return new ServiceErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceMessage }
     * 
     */
    public ServiceMessage createServiceMessage() {
        return new ServiceMessage();
    }

    /**
     * Create an instance of {@link ServiceDMLErrorMessage }
     * 
     */
    public ServiceDMLErrorMessage createServiceDMLErrorMessage() {
        return new ServiceDMLErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceRowValErrorMessage }
     * 
     */
    public ServiceRowValErrorMessage createServiceRowValErrorMessage() {
        return new ServiceRowValErrorMessage();
    }

    /**
     * Create an instance of {@link ServiceAttrValErrorMessage }
     * 
     */
    public ServiceAttrValErrorMessage createServiceAttrValErrorMessage() {
        return new ServiceAttrValErrorMessage();
    }

    /**
     * Create an instance of {@link JavaInfo }
     * 
     */
    public JavaInfo createJavaInfo() {
        return new JavaInfo();
    }

    /**
     * Create an instance of {@link Datagraph }
     * 
     */
    public Datagraph createDatagraph() {
        return new Datagraph();
    }

    /**
     * Create an instance of {@link ModelsType }
     * 
     */
    public ModelsType createModelsType() {
        return new ModelsType();
    }

    /**
     * Create an instance of {@link XSDType }
     * 
     */
    public XSDType createXSDType() {
        return new XSDType();
    }

    /**
     * Create an instance of {@link ChangeSummaryType }
     * 
     */
    public ChangeSummaryType createChangeSummaryType() {
        return new ChangeSummaryType();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link Types }
     * 
     */
    public Types createTypes() {
        return new Types();
    }

    /**
     * Create an instance of {@link XMLInfo }
     * 
     */
    public XMLInfo createXMLInfo() {
        return new XMLInfo();
    }

    /**
     * Create an instance of {@link PartnersJointBidsC }
     * 
     */
    public PartnersJointBidsC createPartnersJointBidsC() {
        return new PartnersJointBidsC();
    }

    /**
     * Create an instance of {@link RelatedOpportunitiesC }
     * 
     */
    public RelatedOpportunitiesC createRelatedOpportunitiesC() {
        return new RelatedOpportunitiesC();
    }

    /**
     * Create an instance of {@link EmployeessC }
     * 
     */
    public EmployeessC createEmployeessC() {
        return new EmployeessC();
    }

    /**
     * Create an instance of {@link OpportunityForecastC }
     * 
     */
    public OpportunityForecastC createOpportunityForecastC() {
        return new OpportunityForecastC();
    }

    /**
     * Create an instance of {@link ProjectLocationC }
     * 
     */
    public ProjectLocationC createProjectLocationC() {
        return new ProjectLocationC();
    }

    /**
     * Create an instance of {@link ApproversC }
     * 
     */
    public ApproversC createApproversC() {
        return new ApproversC();
    }

    /**
     * Create an instance of {@link CompetitorC }
     * 
     */
    public CompetitorC createCompetitorC() {
        return new CompetitorC();
    }

    /**
     * Create an instance of {@link PursuitMilestonesC }
     * 
     */
    public PursuitMilestonesC createPursuitMilestonesC() {
        return new PursuitMilestonesC();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindCriteria }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findCriteria")
    public JAXBElement<FindCriteria> createFindCriteria(FindCriteria value) {
        return new JAXBElement<FindCriteria>(_FindCriteria_QNAME, FindCriteria.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "dataObject")
    public JAXBElement<Object> createDataObject(Object value) {
        return new JAXBElement<Object>(_DataObject_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ServiceErrorMessage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/errors/", name = "ServiceErrorMessage")
    public JAXBElement<ServiceErrorMessage> createServiceErrorMessage(ServiceErrorMessage value) {
        return new JAXBElement<ServiceErrorMessage>(_ServiceErrorMessage_QNAME, ServiceErrorMessage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "YearReceived_cMeaning", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCYearReceivedCMeaning(String value) {
        return new JAXBElement<String>(_ProjectAwardsCYearReceivedCMeaning_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ProjectAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectAwardsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationAbbreviation_cMeaning", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCOrganizationAbbreviationCMeaning(String value) {
        return new JAXBElement<String>(_ProjectAwardsCOrganizationAbbreviationCMeaning_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Rank_cMeaning", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCRankCMeaning(String value) {
        return new JAXBElement<String>(_ProjectAwardsCRankCMeaning_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Company_Id_c", scope = ProjectAwardsC.class)
    public JAXBElement<BigDecimal> createProjectAwardsCCompanyIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCCompanyIdC_QNAME, BigDecimal.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationNames_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCOrganizationNamesC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCOrganizationNamesC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "YearReceived_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCYearReceivedC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCYearReceivedC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AwardId_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCAwardIdC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCAwardIdC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ProjectAwardsC.class)
    public JAXBElement<Integer> createProjectAwardsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationLevelOfAward_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCOrganizationLevelOfAwardC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCOrganizationLevelOfAwardC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "YearAwardReceivedS_cMeaning", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCYearAwardReceivedSCMeaning(String value) {
        return new JAXBElement<String>(_ProjectAwardsCYearAwardReceivedSCMeaning_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Comment_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCCommentC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCommentC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Rank_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCRankC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCRankC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Ranks_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCRanksC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCRanksC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AwardProgram_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCAwardProgramC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCAwardProgramC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = ProjectAwardsC.class)
    public JAXBElement<BigDecimal> createProjectAwardsCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Level_cMeaning", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCLevelCMeaning(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLevelCMeaning_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Level_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCLevelC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLevelC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "YearAwardReceivedS_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCYearAwardReceivedSC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCYearAwardReceivedSC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ProjectAwardsC.class)
    public JAXBElement<Long> createProjectAwardsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ProjectAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectAwardsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Category_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCCategoryC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCategoryC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCContractIdC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCContractIdC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractIds_c", scope = ProjectAwardsC.class)
    public JAXBElement<BigDecimal> createProjectAwardsCContractIdsC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCContractIdsC_QNAME, BigDecimal.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AwardName_cMeaning", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCAwardNameCMeaning(String value) {
        return new JAXBElement<String>(_ProjectAwardsCAwardNameCMeaning_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Comments_c", scope = ProjectAwardsC.class)
    public JAXBElement<byte[]> createProjectAwardsCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCCommentsC_QNAME, byte[].class, ProjectAwardsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ProjectAwardsC.class)
    public JAXBElement<Integer> createProjectAwardsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationAbbreviation_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCOrganizationAbbreviationC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCOrganizationAbbreviationC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = ProjectAwardsC.class)
    public JAXBElement<byte[]> createProjectAwardsCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, ProjectAwardsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationName_cMeaning", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCOrganizationNameCMeaning(String value) {
        return new JAXBElement<String>(_ProjectAwardsCOrganizationNameCMeaning_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Company_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCCompanyC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCompanyC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AwardProgram_cMeaning", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCAwardProgramCMeaning(String value) {
        return new JAXBElement<String>(_ProjectAwardsCAwardProgramCMeaning_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationAbbreviations_Id_c", scope = ProjectAwardsC.class)
    public JAXBElement<BigDecimal> createProjectAwardsCOrganizationAbbreviationsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCOrganizationAbbreviationsIdC_QNAME, BigDecimal.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AwardName_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCAwardNameC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCAwardNameC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ProjectAwardsC.class)
    public JAXBElement<BigDecimal> createProjectAwardsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationAbbreviations_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCOrganizationAbbreviationsC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCOrganizationAbbreviationsC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AwardNames_c", scope = ProjectAwardsC.class)
    public JAXBElement<String> createProjectAwardsCAwardNamesC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCAwardNamesC_QNAME, String.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ProjectAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectAwardsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ProjectAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = ProjectLocationC.class)
    public JAXBElement<Long> createProjectLocationCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectLocationCRequestId_QNAME, Long.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectLocationCIsOwner_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = ProjectLocationC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectLocationCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionName_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = ProjectLocationC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectLocationCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionPackage_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Longitude_c", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCLongitudeC(String value) {
        return new JAXBElement<String>(_ProjectLocationCLongitudeC_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCorpCurrencyCode_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurcyConvRateType_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCCreatedBy_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = ProjectLocationC.class)
    public JAXBElement<Integer> createProjectLocationCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerPillar_QNAME, Integer.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdateLogin_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LocationCode_c", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCLocationCodeC(String value) {
        return new JAXBElement<String>(_ProjectLocationCLocationCodeC_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = ProjectLocationC.class)
    public JAXBElement<Integer> createProjectLocationCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerSor_QNAME, Integer.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdatedBy_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = ProjectLocationC.class)
    public JAXBElement<BigDecimal> createProjectLocationCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCOpportunityVOIdC_QNAME, BigDecimal.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = ProjectLocationC.class)
    public JAXBElement<BigDecimal> createProjectLocationCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCObjectVersionNumber_QNAME, BigDecimal.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurrencyCode_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Latitude_c", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCLatitudeC(String value) {
        return new JAXBElement<String>(_ProjectLocationCLatitudeC_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = ProjectLocationC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectLocationCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCCreationDate_QNAME, XMLGregorianCalendar.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Address_c", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCAddressC(String value) {
        return new JAXBElement<String>(_ProjectLocationCAddressC_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectLocationCCpdrfLastUpd_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_Src_Projects_cToProject_Contract_c", scope = ProjectContractC.class)
    public JAXBElement<BigDecimal> createProjectContractCProjectsIdSrcProjectsCToProjectContractC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectContractCProjectsIdSrcProjectsCToProjectContractC_QNAME, BigDecimal.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ProjectContractC.class)
    public JAXBElement<String> createProjectContractCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ProjectContractC.class)
    public JAXBElement<Long> createProjectContractCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ProjectContractC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectContractCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ProjectContractC.class)
    public JAXBElement<String> createProjectContractCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ProjectContractC.class)
    public JAXBElement<String> createProjectContractCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Contract_Id_Tgt_Contract_cToProject_Contract_c", scope = ProjectContractC.class)
    public JAXBElement<BigDecimal> createProjectContractCContractIdTgtContractCToProjectContractC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectContractCContractIdTgtContractCToProjectContractC_QNAME, BigDecimal.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ProjectContractC.class)
    public JAXBElement<String> createProjectContractCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ProjectContractC.class)
    public JAXBElement<Integer> createProjectContractCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ProjectContractC.class)
    public JAXBElement<String> createProjectContractCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ProjectContractC.class)
    public JAXBElement<Integer> createProjectContractCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ProjectContractC.class)
    public JAXBElement<String> createProjectContractCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ProjectContractC.class)
    public JAXBElement<String> createProjectContractCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ProjectContractC.class)
    public JAXBElement<BigDecimal> createProjectContractCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ProjectContractC.class)
    public JAXBElement<String> createProjectContractCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ProjectContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = PastEmploymentC.class)
    public JAXBElement<String> createPastEmploymentCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = PastEmploymentC.class)
    public JAXBElement<XMLGregorianCalendar> createPastEmploymentCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = PastEmploymentC.class)
    public JAXBElement<Long> createPastEmploymentCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = PastEmploymentC.class)
    public JAXBElement<XMLGregorianCalendar> createPastEmploymentCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = PastEmploymentC.class)
    public JAXBElement<String> createPastEmploymentCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = PastEmploymentC.class)
    public JAXBElement<BigDecimal> createPastEmploymentCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = PastEmploymentC.class)
    public JAXBElement<String> createPastEmploymentCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = PastEmploymentC.class)
    public JAXBElement<String> createPastEmploymentCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = PastEmploymentC.class)
    public JAXBElement<String> createPastEmploymentCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = PastEmploymentC.class)
    public JAXBElement<Integer> createPastEmploymentCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = PastEmploymentC.class)
    public JAXBElement<String> createPastEmploymentCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = PastEmploymentC.class)
    public JAXBElement<Integer> createPastEmploymentCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = PastEmploymentC.class)
    public JAXBElement<String> createPastEmploymentCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndDate_c", scope = PastEmploymentC.class)
    public JAXBElement<XMLGregorianCalendar> createPastEmploymentCEndDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCEndDateC_QNAME, XMLGregorianCalendar.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = PastEmploymentC.class)
    public JAXBElement<String> createPastEmploymentCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = PastEmploymentC.class)
    public JAXBElement<String> createPastEmploymentCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = PastEmploymentC.class)
    public JAXBElement<BigDecimal> createPastEmploymentCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = PastEmploymentC.class)
    public JAXBElement<String> createPastEmploymentCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = PastEmploymentC.class)
    public JAXBElement<XMLGregorianCalendar> createPastEmploymentCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StartDate_c", scope = PastEmploymentC.class)
    public JAXBElement<XMLGregorianCalendar> createPastEmploymentCStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCStartDateC_QNAME, XMLGregorianCalendar.class, PastEmploymentC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SF330ProfileCode_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSF330ProfileCodeC(String value) {
        return new JAXBElement<String>(_ProjectsCSF330ProfileCodeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Currency_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCurrencyC(String value) {
        return new JAXBElement<String>(_ProjectsCCurrencyC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractStatus_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCContractStatusCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCContractStatusCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedSubConsultantFeeUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCEstimatedSubConsultantFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCEstimatedSubConsultantFeeUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ProjectsC.class)
    public JAXBElement<Integer> createProjectsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSectorDescription_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCMarketSectorDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCMarketSectorDescriptionC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceAreaFacilityType_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCServiceAreaFacilityTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCServiceAreaFacilityTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractDescription_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCContractDescriptionC(String value) {
        return new JAXBElement<String>(_ProjectsCContractDescriptionC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectType_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCProjectTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCProjectTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualStartDate_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCActualStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCActualStartDateC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDRRole_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCHDRRoleC(String value) {
        return new JAXBElement<String>(_ProjectsCHDRRoleC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PlannedStartDate_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCPlannedStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCPlannedStartDateC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackEndLastUpdatedDate_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBackEndLastUpdatedDateC(String value) {
        return new JAXBElement<String>(_ProjectsCBackEndLastUpdatedDateC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSProjectNumber_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCEBSProjectNumberC(String value) {
        return new JAXBElement<String>(_ProjectsCEBSProjectNumberC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubComponentNew_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSubComponentNewCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSubComponentNewCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SpaceComponents_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSpaceComponentsC(String value) {
        return new JAXBElement<String>(_ProjectsCSpaceComponentsC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MasterContractName_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCMasterContractNameC(String value) {
        return new JAXBElement<String>(_ProjectsCMasterContractNameC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCPKProxy(String value) {
        return new JAXBElement<String>(_ProjectsCPKProxy_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACode_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCGSACodeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCGSACodeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Location_code_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCLocationCodeC(String value) {
        return new JAXBElement<String>(_ProjectsCLocationCodeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryBusinessGroupFromContra_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCPrimaryBusinessGroupFromContraC(String value) {
        return new JAXBElement<String>(_ProjectsCPrimaryBusinessGroupFromContraC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProfessionalServicesDates_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCProfessionalServicesDatesC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCProfessionalServicesDatesC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubComponents_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSubComponentsCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSubComponentsCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessGroup_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessGroupCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessGroupCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessUnit_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessUnitCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACode4_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCGSACode4C(String value) {
        return new JAXBElement<String>(_ProjectsCGSACode4C_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RestrictionType_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCRestrictionTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCRestrictionTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SustainableRating_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSustainableRatingC(String value) {
        return new JAXBElement<String>(_ProjectsCSustainableRatingC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ProjectsC.class)
    public JAXBElement<BigDecimal> createProjectsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketingClientName_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCMarketingClientNameC(String value) {
        return new JAXBElement<String>(_ProjectsCMarketingClientNameC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalProjectDescription_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCAdditionalProjectDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCAdditionalProjectDescriptionC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedTotalProjectCostUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCEstimatedTotalProjectCostUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCEstimatedTotalProjectCostUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DeliveryMethod_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCDeliveryMethodC(String value) {
        return new JAXBElement<String>(_ProjectsCDeliveryMethodC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubComponents_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSubComponentsC(String value) {
        return new JAXBElement<String>(_ProjectsCSubComponentsC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SF330Code_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSF330CodeC(String value) {
        return new JAXBElement<String>(_ProjectsCSF330CodeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Components_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCComponentsCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCComponentsCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "City_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCityC(String value) {
        return new JAXBElement<String>(_ProjectsCCityC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectBusinessGroup_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCProjectBusinessGroupC(String value) {
        return new JAXBElement<String>(_ProjectsCProjectBusinessGroupC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Department_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCDepartmentC(String value) {
        return new JAXBElement<String>(_ProjectsCDepartmentC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Location_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCLocationC(String value) {
        return new JAXBElement<String>(_ProjectsCLocationC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractNames_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCContractNamesC(String value) {
        return new JAXBElement<String>(_ProjectsCContractNamesC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSectors_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCMarketSectorsC(String value) {
        return new JAXBElement<String>(_ProjectsCMarketSectorsC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryCompanyForReporting_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCPrimaryCompanyForReportingC(String value) {
        return new JAXBElement<String>(_ProjectsCPrimaryCompanyForReportingC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "KeyComparativeFeaturesBenefits_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCKeyComparativeFeaturesBenefitsC(String value) {
        return new JAXBElement<String>(_ProjectsCKeyComparativeFeaturesBenefitsC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessUnits_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessUnitsC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessUnitsC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RestrictionType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCRestrictionTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCRestrictionTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SpaceComponents_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSpaceComponentsCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSpaceComponentsCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessGroupss_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessGroupssC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessGroupssC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PostalCode_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCPostalCodeC(String value) {
        return new JAXBElement<String>(_ProjectsCPostalCodeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalDescription_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCAdditionalDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCAdditionalDescriptionC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EnterpriseType_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCEnterpriseTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCEnterpriseTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "KeyWords_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCKeyWordsC(String value) {
        return new JAXBElement<String>(_ProjectsCKeyWordsC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SustainableRatings_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSustainableRatingsC(String value) {
        return new JAXBElement<String>(_ProjectsCSustainableRatingsC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FacilityType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCFacilityTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCFacilityTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackEndLastUpdatedDateInt_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCBackEndLastUpdatedDateIntC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCBackEndLastUpdatedDateIntC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryCompanyAddress_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCPrimaryCompanyAddressC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCPrimaryCompanyAddressC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractProject_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCContractProjectC(String value) {
        return new JAXBElement<String>(_ProjectsCContractProjectC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SustainableRating_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSustainableRatingCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSustainableRatingCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualCostUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCActualCostUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualCostUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Data_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCDataC(String value) {
        return new JAXBElement<String>(_ProjectsCDataC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractName_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCContractNameC(String value) {
        return new JAXBElement<String>(_ProjectsCContractNameC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketingDataContact_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCMarketingDataContactC(String value) {
        return new JAXBElement<String>(_ProjectsCMarketingDataContactC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Customer_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCustomerC(String value) {
        return new JAXBElement<String>(_ProjectsCCustomerC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualNetFeeUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCActualNetFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualNetFeeUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SustainableRatings_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSustainableRatingsCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSustainableRatingsCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACode5_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCGSACode5C(String value) {
        return new JAXBElement<String>(_ProjectsCGSACode5C_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectTypes_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCProjectTypesCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCProjectTypesCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketingChargeNumber_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCMarketingChargeNumberC(String value) {
        return new JAXBElement<String>(_ProjectsCMarketingChargeNumberC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceType_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCServiceTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCServiceTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FederalContractNumber_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCFederalContractNumberC(String value) {
        return new JAXBElement<String>(_ProjectsCFederalContractNumberC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceAreaFacilityType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCServiceAreaFacilityTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCServiceAreaFacilityTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubComponent_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSubComponentC(String value) {
        return new JAXBElement<String>(_ProjectsCSubComponentC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACode_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCGSACodeC(String value) {
        return new JAXBElement<String>(_ProjectsCGSACodeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Company_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCompanyC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCompanyC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCContractTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCContractTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectDescriptionGeneralOverv_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCProjectDescriptionGeneralOvervC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCProjectDescriptionGeneralOvervC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualGrossFeeUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCActualGrossFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualGrossFeeUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClassDescriptionS_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessClassDescriptionSCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassDescriptionSCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACode3_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCGSACode3C(String value) {
        return new JAXBElement<String>(_ProjectsCGSACode3C_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSProjectID_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCEBSProjectIDC(String value) {
        return new JAXBElement<String>(_ProjectsCEBSProjectIDC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillableClient_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBillableClientC(String value) {
        return new JAXBElement<String>(_ProjectsCBillableClientC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketingProjectName_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCMarketingProjectNameC(String value) {
        return new JAXBElement<String>(_ProjectsCMarketingProjectNameC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Title_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCTitleC(String value) {
        return new JAXBElement<String>(_ProjectsCTitleC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IntBackEndLastUpdatedDate_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCIntBackEndLastUpdatedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCIntBackEndLastUpdatedDateC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractID_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCContractIDC(String value) {
        return new JAXBElement<String>(_ProjectsCContractIDC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CostFeesDescription_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCCostFeesDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCCostFeesDescriptionC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IntegrationDescription_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCIntegrationDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCIntegrationDescriptionC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessGroup_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessGroupC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessGroupC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SF330ProfileCodes_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSF330ProfileCodesC(String value) {
        return new JAXBElement<String>(_ProjectsCSF330ProfileCodesC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EnterpriseType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCEnterpriseTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCEnterpriseTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalBusinessClasses_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCAdditionalBusinessClassesC(String value) {
        return new JAXBElement<String>(_ProjectsCAdditionalBusinessClassesC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedConstructionCostUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCEstimatedConstructionCostUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCEstimatedConstructionCostUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillableCompany_Id_c", scope = ProjectsC.class)
    public JAXBElement<BigDecimal> createProjectsCBillableCompanyIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCBillableCompanyIdC_QNAME, BigDecimal.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClasses_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessClassesCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassesCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryBusinessClassFromContra_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCPrimaryBusinessClassFromContraC(String value) {
        return new JAXBElement<String>(_ProjectsCPrimaryBusinessClassFromContraC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "State_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCStateC(String value) {
        return new JAXBElement<String>(_ProjectsCStateC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OpportunityNameS_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCOpportunityNameSC(String value) {
        return new JAXBElement<String>(_ProjectsCOpportunityNameSC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HoldingRoomType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCHoldingRoomTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCHoldingRoomTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACode1_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCGSACode1C(String value) {
        return new JAXBElement<String>(_ProjectsCGSACode1C_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ReportingPrimaryAccount_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCReportingPrimaryAccountC(String value) {
        return new JAXBElement<String>(_ProjectsCReportingPrimaryAccountC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryDescription_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCPrimaryDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCPrimaryDescriptionC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACode2_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCGSACode2C(String value) {
        return new JAXBElement<String>(_ProjectsCGSACode2C_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FacilityType_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCFacilityTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCFacilityTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Component_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCComponentC(String value) {
        return new JAXBElement<String>(_ProjectsCComponentC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillableClient_Id_c", scope = ProjectsC.class)
    public JAXBElement<BigDecimal> createProjectsCBillableClientIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCBillableClientIdC_QNAME, BigDecimal.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Subconsultant_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSubconsultantC(String value) {
        return new JAXBElement<String>(_ProjectsCSubconsultantC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractStatus_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCContractStatusC(String value) {
        return new JAXBElement<String>(_ProjectsCContractStatusC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Component_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCComponentCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCComponentCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectLegacySystemID_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCProjectLegacySystemIDC(String value) {
        return new JAXBElement<String>(_ProjectsCProjectLegacySystemIDC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceProvided_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCServiceProvidedC(String value) {
        return new JAXBElement<String>(_ProjectsCServiceProvidedC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalProjectType_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCAdditionalProjectTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCAdditionalProjectTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MasterContractID_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCMasterContractIDC(String value) {
        return new JAXBElement<String>(_ProjectsCMasterContractIDC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalProjectType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCAdditionalProjectTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCAdditionalProjectTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCServiceTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCServiceTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClassess_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessClassessC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassessC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubComponentNew_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSubComponentNewC(String value) {
        return new JAXBElement<String>(_ProjectsCSubComponentNewC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessGroups_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessGroupsC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessGroupsC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualTotalProjectCostUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCActualTotalProjectCostUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualTotalProjectCostUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HoldingRoomType_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCHoldingRoomTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCHoldingRoomTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualFinishDate_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCActualFinishDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCActualFinishDateC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BookedFee_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCBookedFeeC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCBookedFeeC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillableCompany_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBillableCompanyC(String value) {
        return new JAXBElement<String>(_ProjectsCBillableCompanyC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OpportunityName_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCOpportunityNameC(String value) {
        return new JAXBElement<String>(_ProjectsCOpportunityNameC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FirstActivityDate_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCFirstActivityDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCFirstActivityDateC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalBusinessGroups_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCAdditionalBusinessGroupsC(String value) {
        return new JAXBElement<String>(_ProjectsCAdditionalBusinessGroupsC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectStartDate_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCProjectStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCProjectStartDateC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProfessionalServices_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCProfessionalServicesC(String value) {
        return new JAXBElement<String>(_ProjectsCProfessionalServicesC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Amount_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCAmountC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCAmountC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillableCompanyAddress_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCBillableCompanyAddressC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCBillableCompanyAddressC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectEndDate_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCProjectEndDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCProjectEndDateC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Currency_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCurrencyCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCCurrencyCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "KeyProjectType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCKeyProjectTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCKeyProjectTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OpportunityForReporting_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCOpportunityForReportingC(String value) {
        return new JAXBElement<String>(_ProjectsCOpportunityForReportingC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClasses_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessClassesC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassesC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualConstructionCostUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCActualConstructionCostUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualConstructionCostUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketingDataContact_Id_c", scope = ProjectsC.class)
    public JAXBElement<BigDecimal> createProjectsCMarketingDataContactIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCMarketingDataContactIdC_QNAME, BigDecimal.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VendorId_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCVendorIdC(String value) {
        return new JAXBElement<String>(_ProjectsCVendorIdC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Country_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCountryCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCCountryCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedGrossFeeUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCEstimatedGrossFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCEstimatedGrossFeeUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ConstructionBidUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCConstructionBidUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCConstructionBidUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceAreaFacilityTypes_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCServiceAreaFacilityTypesC(String value) {
        return new JAXBElement<String>(_ProjectsCServiceAreaFacilityTypesC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OpportunityId_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCOpportunityIdC(String value) {
        return new JAXBElement<String>(_ProjectsCOpportunityIdC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SF330Code_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSF330CodeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSF330CodeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalProject_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCAdditionalProjectC(String value) {
        return new JAXBElement<String>(_ProjectsCAdditionalProjectC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSector_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCMarketSectorCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCMarketSectorCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = ProjectsC.class, defaultValue = "Projects_c")
    public JAXBElement<String> createProjectsCSourceType(String value) {
        return new JAXBElement<String>(_ProjectsCSourceType_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Data_Id_c", scope = ProjectsC.class)
    public JAXBElement<BigDecimal> createProjectsCDataIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCDataIdC_QNAME, BigDecimal.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClassDescription_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessClassDescriptionC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassDescriptionC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryCompany_Id_c", scope = ProjectsC.class)
    public JAXBElement<BigDecimal> createProjectsCPrimaryCompanyIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCPrimaryCompanyIdC_QNAME, BigDecimal.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastActivityDate_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCLastActivityDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCLastActivityDateC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NoticeToProceed_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCNoticeToProceedC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCNoticeToProceedC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DataContact_EmailAddress_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCDataContactEmailAddressC(String value) {
        return new JAXBElement<String>(_ProjectsCDataContactEmailAddressC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = ProjectsC.class, defaultValue = "Projects_c")
    public JAXBElement<String> createProjectsCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_ProjectsCAttachmentEntityName_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDRRole_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCHDRRoleCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCHDRRoleCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Componentss_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCComponentssC(String value) {
        return new JAXBElement<String>(_ProjectsCComponentssC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedNetFeeUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCEstimatedNetFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCEstimatedNetFeeUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryCompany_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCPrimaryCompanyC(String value) {
        return new JAXBElement<String>(_ProjectsCPrimaryCompanyC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OwnerId_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCOwnerIdC(String value) {
        return new JAXBElement<String>(_ProjectsCOwnerIdC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DeliveryMethod_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCDeliveryMethodCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCDeliveryMethodCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractProject_Id_c", scope = ProjectsC.class)
    public JAXBElement<BigDecimal> createProjectsCContractProjectIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCContractProjectIdC_QNAME, BigDecimal.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RestrictionComments_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCRestrictionCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCRestrictionCommentsC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubComponent_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSubComponentCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSubComponentCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "KeyProjectType_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCKeyProjectTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCKeyProjectTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedCompletionDate_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCEstimatedCompletionDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCEstimatedCompletionDateC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryGSACodesAndSF330Code_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCPrimaryGSACodesAndSF330CodeC(String value) {
        return new JAXBElement<String>(_ProjectsCPrimaryGSACodesAndSF330CodeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACodes_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCGSACodesCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCGSACodesCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ResearchType_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCResearchTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCResearchTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OpportunityNameS_Id_c", scope = ProjectsC.class)
    public JAXBElement<BigDecimal> createProjectsCOpportunityNameSIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCOpportunityNameSIdC_QNAME, BigDecimal.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ResearchType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCResearchTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCResearchTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ProjectsC.class)
    public JAXBElement<Long> createProjectsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Country_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCountryC(String value) {
        return new JAXBElement<String>(_ProjectsCCountryC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProfessionalServices_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCProfessionalServicesCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCProfessionalServicesCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectTypes_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCProjectTypesC(String value) {
        return new JAXBElement<String>(_ProjectsCProjectTypesC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Company_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCompanyCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCCompanyCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractNames_Id_c", scope = ProjectsC.class)
    public JAXBElement<BigDecimal> createProjectsCContractNamesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCContractNamesIdC_QNAME, BigDecimal.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ProjectsC.class)
    public JAXBElement<Integer> createProjectsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Components_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCComponentsC(String value) {
        return new JAXBElement<String>(_ProjectsCComponentsC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ReportingDataContact_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCReportingDataContactC(String value) {
        return new JAXBElement<String>(_ProjectsCReportingDataContactC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AddressSequenceNumber_c", scope = ProjectsC.class)
    public JAXBElement<BigDecimal> createProjectsCAddressSequenceNumberC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCAddressSequenceNumberC_QNAME, BigDecimal.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSector_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCMarketSectorC(String value) {
        return new JAXBElement<String>(_ProjectsCMarketSectorC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSID_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCEBSIDC(String value) {
        return new JAXBElement<String>(_ProjectsCEBSIDC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClassDescriptionS_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessClassDescriptionSC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassDescriptionSC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Currency1_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCurrency1C(String value) {
        return new JAXBElement<String>(_ProjectsCCurrency1C_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACodes_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCGSACodesC(String value) {
        return new JAXBElement<String>(_ProjectsCGSACodesC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "County_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCountyC(String value) {
        return new JAXBElement<String>(_ProjectsCCountyC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PlannedFinishDate_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCPlannedFinishDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCPlannedFinishDateC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ConstructionCompletionDates_c", scope = ProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectsCConstructionCompletionDatesC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCConstructionCompletionDatesC_QNAME, XMLGregorianCalendar.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryGSACodeFromContract_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCPrimaryGSACodeFromContractC(String value) {
        return new JAXBElement<String>(_ProjectsCPrimaryGSACodeFromContractC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ClientDescription_c", scope = ProjectsC.class)
    public JAXBElement<byte[]> createProjectsCClientDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCClientDescriptionC_QNAME, byte[].class, ProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessGroups_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessGroupsCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessGroupsCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCTypeCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ReportingBillableAccount_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCReportingBillableAccountC(String value) {
        return new JAXBElement<String>(_ProjectsCReportingBillableAccountC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Locale_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCLocaleC(String value) {
        return new JAXBElement<String>(_ProjectsCLocaleC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Client_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCClientC(String value) {
        return new JAXBElement<String>(_ProjectsCClientC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectType_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCProjectTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCProjectTypeC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualSubConsultantFeeUSD_c", scope = ProjectsC.class)
    public JAXBElement<AmountType> createProjectsCActualSubConsultantFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualSubConsultantFeeUSDC_QNAME, AmountType.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Integration_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCIntegrationC(String value) {
        return new JAXBElement<String>(_ProjectsCIntegrationC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SF330ProfileCodes_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCSF330ProfileCodesCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSF330ProfileCodesCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PreBookingID_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCPreBookingIDC(String value) {
        return new JAXBElement<String>(_ProjectsCPreBookingIDC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessUnit_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessUnitC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessUnitC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceAreaFacilityTypes_cMeaning", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCServiceAreaFacilityTypesCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCServiceAreaFacilityTypesCMeaning_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClass_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCBusinessClassC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FederalNumber_c", scope = ProjectsC.class)
    public JAXBElement<String> createProjectsCFederalNumberC(String value) {
        return new JAXBElement<String>(_ProjectsCFederalNumberC_QNAME, String.class, ProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = LocationC.class)
    public JAXBElement<XMLGregorianCalendar> createLocationCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = LocationC.class)
    public JAXBElement<String> createLocationCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = LocationC.class)
    public JAXBElement<String> createLocationCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSCompanyID_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCEBSCompanyIDC(String value) {
        return new JAXBElement<String>(_LocationCEBSCompanyIDC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "County_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCCountyC(String value) {
        return new JAXBElement<String>(_ProjectsCCountyC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = LocationC.class)
    public JAXBElement<String> createLocationCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "City_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCCityC(String value) {
        return new JAXBElement<String>(_ProjectsCCityC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = LocationC.class)
    public JAXBElement<Integer> createLocationCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LocationCode_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCLocationCodeC(String value) {
        return new JAXBElement<String>(_LocationCLocationCodeC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Country_cMeaning", scope = LocationC.class)
    public JAXBElement<String> createLocationCCountryCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCCountryCMeaning_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = LocationC.class)
    public JAXBElement<BigDecimal> createLocationCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = LocationC.class)
    public JAXBElement<Long> createLocationCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = LocationC.class)
    public JAXBElement<XMLGregorianCalendar> createLocationCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Locale_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCLocaleC(String value) {
        return new JAXBElement<String>(_ProjectsCLocaleC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = LocationC.class)
    public JAXBElement<BigDecimal> createLocationCContractIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCContractIdC_QNAME, BigDecimal.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSCompanyAddressType_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCEBSCompanyAddressTypeC(String value) {
        return new JAXBElement<String>(_LocationCEBSCompanyAddressTypeC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Longitude_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCLongitudeC(String value) {
        return new JAXBElement<String>(_LocationCLongitudeC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = LocationC.class)
    public JAXBElement<String> createLocationCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSCompanyAddressID_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCEBSCompanyAddressIDC(String value) {
        return new JAXBElement<String>(_LocationCEBSCompanyAddressIDC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = LocationC.class)
    public JAXBElement<String> createLocationCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = LocationC.class)
    public JAXBElement<Integer> createLocationCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = LocationC.class)
    public JAXBElement<String> createLocationCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = LocationC.class)
    public JAXBElement<String> createLocationCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = LocationC.class)
    public JAXBElement<byte[]> createLocationCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, LocationC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = LocationC.class)
    public JAXBElement<String> createLocationCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "State_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCStateC(String value) {
        return new JAXBElement<String>(_ProjectsCStateC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LocationId_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCLocationIdC(String value) {
        return new JAXBElement<String>(_LocationCLocationIdC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = LocationC.class)
    public JAXBElement<String> createLocationCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = LocationC.class)
    public JAXBElement<BigDecimal> createLocationCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "States_cMeaning", scope = LocationC.class)
    public JAXBElement<String> createLocationCStatesCMeaning(String value) {
        return new JAXBElement<String>(_LocationCStatesCMeaning_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = LocationC.class)
    public JAXBElement<String> createLocationCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LocationSource_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCLocationSourceC(String value) {
        return new JAXBElement<String>(_LocationCLocationSourceC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = LocationC.class)
    public JAXBElement<XMLGregorianCalendar> createLocationCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Latitude_c", scope = LocationC.class)
    public JAXBElement<String> createLocationCLatitudeC(String value) {
        return new JAXBElement<String>(_LocationCLatitudeC_QNAME, String.class, LocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = OptyContractC.class)
    public JAXBElement<String> createOptyContractCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = OptyContractC.class)
    public JAXBElement<Long> createOptyContractCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = OptyContractC.class)
    public JAXBElement<XMLGregorianCalendar> createOptyContractCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = OptyContractC.class)
    public JAXBElement<String> createOptyContractCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Opportunity_Id_Src_OpportunityToOpty_Contract_c", scope = OptyContractC.class)
    public JAXBElement<BigDecimal> createOptyContractCOpportunityIdSrcOpportunityToOptyContractC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OptyContractCOpportunityIdSrcOpportunityToOptyContractC_QNAME, BigDecimal.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = OptyContractC.class)
    public JAXBElement<String> createOptyContractCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Contract_Id_Tgt_Contract_cToOpty_Contract_c", scope = OptyContractC.class)
    public JAXBElement<BigDecimal> createOptyContractCContractIdTgtContractCToOptyContractC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OptyContractCContractIdTgtContractCToOptyContractC_QNAME, BigDecimal.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = OptyContractC.class)
    public JAXBElement<String> createOptyContractCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = OptyContractC.class)
    public JAXBElement<Integer> createOptyContractCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = OptyContractC.class)
    public JAXBElement<String> createOptyContractCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = OptyContractC.class)
    public JAXBElement<Integer> createOptyContractCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = OptyContractC.class)
    public JAXBElement<String> createOptyContractCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = OptyContractC.class)
    public JAXBElement<String> createOptyContractCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = OptyContractC.class)
    public JAXBElement<BigDecimal> createOptyContractCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = OptyContractC.class)
    public JAXBElement<String> createOptyContractCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, OptyContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = LanguageC.class)
    public JAXBElement<XMLGregorianCalendar> createLanguageCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Speak_cMeaning", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCSpeakCMeaning(String value) {
        return new JAXBElement<String>(_LanguageCSpeakCMeaning_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Native_c", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCNativeC(String value) {
        return new JAXBElement<String>(_LanguageCNativeC_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Teacher_cMeaning", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCTeacherCMeaning(String value) {
        return new JAXBElement<String>(_LanguageCTeacherCMeaning_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Read_cMeaning", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCReadCMeaning(String value) {
        return new JAXBElement<String>(_LanguageCReadCMeaning_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = LanguageC.class)
    public JAXBElement<Integer> createLanguageCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Write_c", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCWriteC(String value) {
        return new JAXBElement<String>(_LanguageCWriteC_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Native_cMeaning", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCNativeCMeaning(String value) {
        return new JAXBElement<String>(_LanguageCNativeCMeaning_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = LanguageC.class)
    public JAXBElement<Long> createLanguageCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = LanguageC.class)
    public JAXBElement<XMLGregorianCalendar> createLanguageCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Read_c", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCReadC(String value) {
        return new JAXBElement<String>(_LanguageCReadC_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = LanguageC.class)
    public JAXBElement<BigDecimal> createLanguageCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Language_c", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCLanguageC(String value) {
        return new JAXBElement<String>(_LanguageCLanguageC_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Speak_c", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCSpeakC(String value) {
        return new JAXBElement<String>(_LanguageCSpeakC_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = LanguageC.class)
    public JAXBElement<Integer> createLanguageCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Translator_c", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCTranslatorC(String value) {
        return new JAXBElement<String>(_LanguageCTranslatorC_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Translator_cMeaning", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCTranslatorCMeaning(String value) {
        return new JAXBElement<String>(_LanguageCTranslatorCMeaning_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Teacher_c", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCTeacherC(String value) {
        return new JAXBElement<String>(_LanguageCTeacherC_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = LanguageC.class)
    public JAXBElement<BigDecimal> createLanguageCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Language_cMeaning", scope = LanguageC.class)
    public JAXBElement<String> createLanguageCLanguageCMeaning(String value) {
        return new JAXBElement<String>(_LanguageCLanguageCMeaning_QNAME, String.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = LanguageC.class)
    public JAXBElement<XMLGregorianCalendar> createLanguageCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, LanguageC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = PartnersJointBidsC.class)
    public JAXBElement<Long> createPartnersJointBidsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectLocationCRequestId_QNAME, Long.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectLocationCIsOwner_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = PartnersJointBidsC.class)
    public JAXBElement<XMLGregorianCalendar> createPartnersJointBidsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionName_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = PartnersJointBidsC.class)
    public JAXBElement<XMLGregorianCalendar> createPartnersJointBidsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionPackage_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCorpCurrencyCode_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurcyConvRateType_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCCreatedBy_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = PartnersJointBidsC.class)
    public JAXBElement<Integer> createPartnersJointBidsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerPillar_QNAME, Integer.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Role_cMeaning", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCRoleCMeaning(String value) {
        return new JAXBElement<String>(_PartnersJointBidsCRoleCMeaning_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdateLogin_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = PartnersJointBidsC.class)
    public JAXBElement<Integer> createPartnersJointBidsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerSor_QNAME, Integer.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Type_cMeaning", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCTypeCMeaning(String value) {
        return new JAXBElement<String>(_PartnersJointBidsCTypeCMeaning_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comment_c", scope = PartnersJointBidsC.class)
    public JAXBElement<byte[]> createPartnersJointBidsCCommentC(byte[] value) {
        return new JAXBElement<byte[]>(_PartnersJointBidsCCommentC_QNAME, byte[].class, PartnersJointBidsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdatedBy_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = PartnersJointBidsC.class)
    public JAXBElement<BigDecimal> createPartnersJointBidsCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCOpportunityVOIdC_QNAME, BigDecimal.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = PartnersJointBidsC.class)
    public JAXBElement<BigDecimal> createPartnersJointBidsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCObjectVersionNumber_QNAME, BigDecimal.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurrencyCode_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Role_c", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCRoleC(String value) {
        return new JAXBElement<String>(_PartnersJointBidsCRoleC_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Type_c", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCTypeC(String value) {
        return new JAXBElement<String>(_PartnersJointBidsCTypeC_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = PartnersJointBidsC.class)
    public JAXBElement<XMLGregorianCalendar> createPartnersJointBidsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCCreationDate_QNAME, XMLGregorianCalendar.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DoNotUse_c", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCDoNotUseC(String value) {
        return new JAXBElement<String>(_PartnersJointBidsCDoNotUseC_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectLocationCCpdrfLastUpd_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ProfessionalMembershipsC.class)
    public JAXBElement<XMLGregorianCalendar> createProfessionalMembershipsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCStatusC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusC_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ProfessionalMembershipsC.class)
    public JAXBElement<Integer> createProfessionalMembershipsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Acronym_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCAcronymC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCAcronymC_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalInformation_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCAdditionalInformationC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCAdditionalInformationC_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StartDate_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<XMLGregorianCalendar> createProfessionalMembershipsCStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCStartDateC_QNAME, XMLGregorianCalendar.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Chapter_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCChapterC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCChapterC_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ProfessionalMembershipsC.class)
    public JAXBElement<Long> createProfessionalMembershipsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ProfessionalMembershipsC.class)
    public JAXBElement<XMLGregorianCalendar> createProfessionalMembershipsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<BigDecimal> createProfessionalMembershipsCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Committee_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCCommitteeC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCCommitteeC_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ProfessionalMembershipsC.class)
    public JAXBElement<Integer> createProfessionalMembershipsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndYear_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCEndYearC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCEndYearC_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Role_cMeaning", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCRoleCMeaning(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCRoleCMeaning_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Duration_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<BigDecimal> createProfessionalMembershipsCDurationC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProfessionalMembershipsCDurationC_QNAME, BigDecimal.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndDate_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<XMLGregorianCalendar> createProfessionalMembershipsCEndDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCEndDateC_QNAME, XMLGregorianCalendar.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "State_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCStateC(String value) {
        return new JAXBElement<String>(_ProjectsCStateC_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_cMeaning", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCStatusCMeaning(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusCMeaning_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BeginYear_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCBeginYearC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCBeginYearC_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ProfessionalMembershipsC.class)
    public JAXBElement<BigDecimal> createProfessionalMembershipsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ProfessionalMembershipsC.class)
    public JAXBElement<XMLGregorianCalendar> createProfessionalMembershipsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Role_c", scope = ProfessionalMembershipsC.class)
    public JAXBElement<String> createProfessionalMembershipsCRoleC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCRoleC_QNAME, String.class, ProfessionalMembershipsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ActivitiesC.class)
    public JAXBElement<XMLGregorianCalendar> createActivitiesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ActivitiesC.class)
    public JAXBElement<Long> createActivitiesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActivityType_c", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCActivityTypeC(String value) {
        return new JAXBElement<String>(_ActivitiesCActivityTypeC_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ActivitiesC.class)
    public JAXBElement<XMLGregorianCalendar> createActivitiesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = ActivitiesC.class)
    public JAXBElement<BigDecimal> createActivitiesCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ActivitiesC.class)
    public JAXBElement<Integer> createActivitiesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ActivitiesC.class)
    public JAXBElement<Integer> createActivitiesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DateYear_c", scope = ActivitiesC.class)
    public JAXBElement<XMLGregorianCalendar> createActivitiesCDateYearC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivitiesCDateYearC_QNAME, XMLGregorianCalendar.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ActivitiesC.class)
    public JAXBElement<BigDecimal> createActivitiesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ActivitiesC.class)
    public JAXBElement<String> createActivitiesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ActivitiesC.class)
    public JAXBElement<XMLGregorianCalendar> createActivitiesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ActivitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = ApproversC.class)
    public JAXBElement<XMLGregorianCalendar> createApproversCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = ApproversC.class)
    public JAXBElement<String> createApproversCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectLocationCIsOwner_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ApproverDesignation_c", scope = ApproversC.class)
    public JAXBElement<String> createApproversCApproverDesignationC(String value) {
        return new JAXBElement<String>(_ApproversCApproverDesignationC_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = ApproversC.class)
    public JAXBElement<String> createApproversCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionName_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = ApproversC.class)
    public JAXBElement<String> createApproversCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurcyConvRateType_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = ApproversC.class)
    public JAXBElement<Integer> createApproversCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerSor_QNAME, Integer.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Title_c", scope = ApproversC.class)
    public JAXBElement<String> createApproversCTitleC(String value) {
        return new JAXBElement<String>(_ApproversCTitleC_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = ApproversC.class)
    public JAXBElement<BigDecimal> createApproversCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCOpportunityVOIdC_QNAME, BigDecimal.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "GoNoGoForm_c", scope = ApproversC.class)
    public JAXBElement<String> createApproversCGoNoGoFormC(String value) {
        return new JAXBElement<String>(_ApproversCGoNoGoFormC_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = ApproversC.class)
    public JAXBElement<Long> createApproversCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectLocationCRequestId_QNAME, Long.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "GoNoGoForm_cMeaning", scope = ApproversC.class)
    public JAXBElement<String> createApproversCGoNoGoFormCMeaning(String value) {
        return new JAXBElement<String>(_ApproversCGoNoGoFormCMeaning_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = ApproversC.class)
    public JAXBElement<XMLGregorianCalendar> createApproversCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = ApproversC.class)
    public JAXBElement<String> createApproversCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionPackage_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments_c", scope = ApproversC.class)
    public JAXBElement<byte[]> createApproversCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_ApproversCCommentsC_QNAME, byte[].class, ApproversC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = ApproversC.class)
    public JAXBElement<String> createApproversCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCorpCurrencyCode_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = ApproversC.class)
    public JAXBElement<Integer> createApproversCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerPillar_QNAME, Integer.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = ApproversC.class)
    public JAXBElement<String> createApproversCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCCreatedBy_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = ApproversC.class)
    public JAXBElement<String> createApproversCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdateLogin_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = ApproversC.class)
    public JAXBElement<String> createApproversCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdatedBy_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = ApproversC.class)
    public JAXBElement<BigDecimal> createApproversCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCObjectVersionNumber_QNAME, BigDecimal.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = ApproversC.class)
    public JAXBElement<String> createApproversCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurrencyCode_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = ApproversC.class)
    public JAXBElement<XMLGregorianCalendar> createApproversCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCCreationDate_QNAME, XMLGregorianCalendar.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ApprovalDate_c", scope = ApproversC.class)
    public JAXBElement<XMLGregorianCalendar> createApproversCApprovalDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ApproversCApprovalDateC_QNAME, XMLGregorianCalendar.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DoNotUse_c", scope = ApproversC.class)
    public JAXBElement<String> createApproversCDoNotUseC(String value) {
        return new JAXBElement<String>(_PartnersJointBidsCDoNotUseC_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = ApproversC.class)
    public JAXBElement<String> createApproversCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectLocationCCpdrfLastUpd_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<XMLGregorianCalendar> createAcademicHonorsAndResearchCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<Long> createAcademicHonorsAndResearchCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<XMLGregorianCalendar> createAcademicHonorsAndResearchCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<BigDecimal> createAcademicHonorsAndResearchCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Comments_c", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<byte[]> createAcademicHonorsAndResearchCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCCommentsC_QNAME, byte[].class, AcademicHonorsAndResearchC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<Integer> createAcademicHonorsAndResearchCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Date_c", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<XMLGregorianCalendar> createAcademicHonorsAndResearchCDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcademicHonorsAndResearchCDateC_QNAME, XMLGregorianCalendar.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<Integer> createAcademicHonorsAndResearchCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_cMeaning", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCTypeCMeaning_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<BigDecimal> createAcademicHonorsAndResearchCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<XMLGregorianCalendar> createAcademicHonorsAndResearchCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_c", scope = AcademicHonorsAndResearchC.class)
    public JAXBElement<String> createAcademicHonorsAndResearchCTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCTypeC_QNAME, String.class, AcademicHonorsAndResearchC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ClientOwnerReferencesC.class)
    public JAXBElement<XMLGregorianCalendar> createClientOwnerReferencesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Company_Id_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<BigDecimal> createClientOwnerReferencesCCompanyIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCCompanyIdC_QNAME, BigDecimal.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Owner_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCOwnerC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCOwnerC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Contacts_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCContactsC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCContactsC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackendEmail_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCBackendEmailC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCBackendEmailC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Notess_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<byte[]> createClientOwnerReferencesCNotessC(byte[] value) {
        return new JAXBElement<byte[]>(_ClientOwnerReferencesCNotessC_QNAME, byte[].class, ClientOwnerReferencesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ClientOwnerReferencesC.class)
    public JAXBElement<Integer> createClientOwnerReferencesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackendPr_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCBackendPrC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCBackendPrC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastConfirmedBys_Id_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<BigDecimal> createClientOwnerReferencesCLastConfirmedBysIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ClientOwnerReferencesCLastConfirmedBysIdC_QNAME, BigDecimal.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Reference_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCReferenceC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCReferenceC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RefChangedBy_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCRefChangedByC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCRefChangedByC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_cMeaning", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCTypeCMeaning_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastConfirmedBy_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCLastConfirmedByC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCLastConfirmedByC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Contact_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCContactC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCContactC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<BigDecimal> createClientOwnerReferencesCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Owner_Id_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<BigDecimal> createClientOwnerReferencesCOwnerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ClientOwnerReferencesCOwnerIdC_QNAME, BigDecimal.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Contacts_Id_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<BigDecimal> createClientOwnerReferencesCContactsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ClientOwnerReferencesCContactsIdC_QNAME, BigDecimal.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastConfirmedDate_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<XMLGregorianCalendar> createClientOwnerReferencesCLastConfirmedDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ClientOwnerReferencesCLastConfirmedDateC_QNAME, XMLGregorianCalendar.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ClientOwnerReferencesC.class)
    public JAXBElement<Long> createClientOwnerReferencesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ClientOwnerReferencesC.class)
    public JAXBElement<XMLGregorianCalendar> createClientOwnerReferencesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Notes_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCNotesC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCNotesC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Contact_Id_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<BigDecimal> createClientOwnerReferencesCContactIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ClientOwnerReferencesCContactIdC_QNAME, BigDecimal.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ClientOwnerReferencesC.class)
    public JAXBElement<Integer> createClientOwnerReferencesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastConfirmedBys_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCLastConfirmedBysC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCLastConfirmedBysC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DateReferenceChanged_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCDateReferenceChangedC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCDateReferenceChangedC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Company_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCCompanyC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCompanyC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Reference_cMeaning", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCReferenceCMeaning(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCReferenceCMeaning_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ClientOwnerReferencesC.class)
    public JAXBElement<BigDecimal> createClientOwnerReferencesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ClientOwnerReferencesC.class)
    public JAXBElement<String> createClientOwnerReferencesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ClientOwnerReferencesC.class)
    public JAXBElement<XMLGregorianCalendar> createClientOwnerReferencesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ClientOwnerReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<XMLGregorianCalendar> createAdditionalOverviewsBiosCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<Integer> createAdditionalOverviewsBiosCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateBy_Id_c", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<BigDecimal> createAdditionalOverviewsBiosCLastUpdateByIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AdditionalOverviewsBiosCLastUpdateByIdC_QNAME, BigDecimal.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateBy_c", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCLastUpdateByC(String value) {
        return new JAXBElement<String>(_AdditionalOverviewsBiosCLastUpdateByC_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy_c", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCLastUpdatedByC(String value) {
        return new JAXBElement<String>(_AdditionalOverviewsBiosCLastUpdatedByC_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_cMeaning", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCTypeCMeaning_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Title_c", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCTitleC(String value) {
        return new JAXBElement<String>(_ProjectsCTitleC_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate_c", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<XMLGregorianCalendar> createAdditionalOverviewsBiosCLastUpdateDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AdditionalOverviewsBiosCLastUpdateDateC_QNAME, XMLGregorianCalendar.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<Long> createAdditionalOverviewsBiosCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<XMLGregorianCalendar> createAdditionalOverviewsBiosCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<BigDecimal> createAdditionalOverviewsBiosCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<Integer> createAdditionalOverviewsBiosCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<byte[]> createAdditionalOverviewsBiosCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, AdditionalOverviewsBiosC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy_Id_c", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<BigDecimal> createAdditionalOverviewsBiosCLastUpdatedByIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_AdditionalOverviewsBiosCLastUpdatedByIdC_QNAME, BigDecimal.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<BigDecimal> createAdditionalOverviewsBiosCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<String> createAdditionalOverviewsBiosCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = AdditionalOverviewsBiosC.class)
    public JAXBElement<XMLGregorianCalendar> createAdditionalOverviewsBiosCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, AdditionalOverviewsBiosC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = PublicationsC.class)
    public JAXBElement<XMLGregorianCalendar> createPublicationsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = PublicationsC.class)
    public JAXBElement<Long> createPublicationsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = PublicationsC.class)
    public JAXBElement<XMLGregorianCalendar> createPublicationsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = PublicationsC.class)
    public JAXBElement<BigDecimal> createPublicationsCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = PublicationsC.class)
    public JAXBElement<Integer> createPublicationsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = PublicationsC.class)
    public JAXBElement<Integer> createPublicationsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Year_c", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCYearC(String value) {
        return new JAXBElement<String>(_PublicationsCYearC_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PublicationTypes_c", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCPublicationTypesC(String value) {
        return new JAXBElement<String>(_PublicationsCPublicationTypesC_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = PublicationsC.class)
    public JAXBElement<BigDecimal> createPublicationsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PublicationTypes_cMeaning", scope = PublicationsC.class)
    public JAXBElement<String> createPublicationsCPublicationTypesCMeaning(String value) {
        return new JAXBElement<String>(_PublicationsCPublicationTypesCMeaning_QNAME, String.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = PublicationsC.class)
    public JAXBElement<XMLGregorianCalendar> createPublicationsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, PublicationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = AditonalProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createAditonalProjectsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CompanyDescription_c", scope = AditonalProjectsC.class)
    public JAXBElement<byte[]> createAditonalProjectsCCompanyDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_AditonalProjectsCCompanyDescriptionC_QNAME, byte[].class, AditonalProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClasss_c", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCBusinessClasssC(String value) {
        return new JAXBElement<String>(_AditonalProjectsCBusinessClasssC_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = AditonalProjectsC.class)
    public JAXBElement<Integer> createAditonalProjectsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusUnitDescripton_c", scope = AditonalProjectsC.class)
    public JAXBElement<byte[]> createAditonalProjectsCBusUnitDescriptonC(byte[] value) {
        return new JAXBElement<byte[]>(_AditonalProjectsCBusUnitDescriptonC_QNAME, byte[].class, AditonalProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectType_cMeaning", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCProjectTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCProjectTypeCMeaning_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = AditonalProjectsC.class)
    public JAXBElement<BigDecimal> createAditonalProjectsCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = AditonalProjectsC.class)
    public JAXBElement<Long> createAditonalProjectsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = AditonalProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createAditonalProjectsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = AditonalProjectsC.class)
    public JAXBElement<BigDecimal> createAditonalProjectsCContractIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCContractIdC_QNAME, BigDecimal.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectType_c", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCProjectTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCProjectTypeC_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessUnits_c", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCBusinessUnitsC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessUnitsC_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectDescription_c", scope = AditonalProjectsC.class)
    public JAXBElement<byte[]> createAditonalProjectsCProjectDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_AditonalProjectsCProjectDescriptionC_QNAME, byte[].class, AditonalProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = AditonalProjectsC.class)
    public JAXBElement<Integer> createAditonalProjectsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = AditonalProjectsC.class)
    public JAXBElement<byte[]> createAditonalProjectsCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, AditonalProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Company_c", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCCompanyC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCompanyC_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessUnit_c", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCBusinessUnitC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessUnitC_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClass_c", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCBusinessClassC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassC_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClassDescription_c", scope = AditonalProjectsC.class)
    public JAXBElement<byte[]> createAditonalProjectsCBusinessClassDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCBusinessClassDescriptionC_QNAME, byte[].class, AditonalProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = AditonalProjectsC.class)
    public JAXBElement<BigDecimal> createAditonalProjectsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClasss_cMeaning", scope = AditonalProjectsC.class)
    public JAXBElement<String> createAditonalProjectsCBusinessClasssCMeaning(String value) {
        return new JAXBElement<String>(_AditonalProjectsCBusinessClasssCMeaning_QNAME, String.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = AditonalProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createAditonalProjectsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, AditonalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = PresentationsC.class)
    public JAXBElement<XMLGregorianCalendar> createPresentationsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PublicationType_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCPublicationTypeC(String value) {
        return new JAXBElement<String>(_PresentationsCPublicationTypeC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ConferenceName_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCConferenceNameC(String value) {
        return new JAXBElement<String>(_PresentationsCConferenceNameC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = PresentationsC.class)
    public JAXBElement<Integer> createPresentationsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "City_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCCityC(String value) {
        return new JAXBElement<String>(_ProjectsCCityC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Title_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCTitleC(String value) {
        return new JAXBElement<String>(_ProjectsCTitleC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Location_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCLocationC(String value) {
        return new JAXBElement<String>(_ProjectsCLocationC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = PresentationsC.class)
    public JAXBElement<Long> createPresentationsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NonHDRAuthors_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCNonHDRAuthorsC(String value) {
        return new JAXBElement<String>(_PresentationsCNonHDRAuthorsC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = PresentationsC.class)
    public JAXBElement<XMLGregorianCalendar> createPresentationsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = PresentationsC.class)
    public JAXBElement<BigDecimal> createPresentationsCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PublicationType_cMeaning", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCPublicationTypeCMeaning(String value) {
        return new JAXBElement<String>(_PresentationsCPublicationTypeCMeaning_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = PresentationsC.class)
    public JAXBElement<Integer> createPresentationsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Year_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCYearC(String value) {
        return new JAXBElement<String>(_PublicationsCYearC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDRAuthor_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCHDRAuthorC(String value) {
        return new JAXBElement<String>(_PresentationsCHDRAuthorC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Year_cMeaning", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCYearCMeaning(String value) {
        return new JAXBElement<String>(_PresentationsCYearCMeaning_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "State_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCStateC(String value) {
        return new JAXBElement<String>(_ProjectsCStateC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = PresentationsC.class)
    public JAXBElement<BigDecimal> createPresentationsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OtherHDRAuthors_c", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCOtherHDRAuthorsC(String value) {
        return new JAXBElement<String>(_PresentationsCOtherHDRAuthorsC_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = PresentationsC.class)
    public JAXBElement<String> createPresentationsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = PresentationsC.class)
    public JAXBElement<XMLGregorianCalendar> createPresentationsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, PresentationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = AwardOrganizationC.class)
    public JAXBElement<Long> createAwardOrganizationCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = AwardOrganizationC.class)
    public JAXBElement<XMLGregorianCalendar> createAwardOrganizationCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = AwardOrganizationC.class, defaultValue = "AwardOrganization_c")
    public JAXBElement<String> createAwardOrganizationCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_ProjectsCAttachmentEntityName_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackEndOrganizationName_c", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCBackEndOrganizationNameC(String value) {
        return new JAXBElement<String>(_AwardOrganizationCBackEndOrganizationNameC_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = AwardOrganizationC.class)
    public JAXBElement<Integer> createAwardOrganizationCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCPKProxy(String value) {
        return new JAXBElement<String>(_ProjectsCPKProxy_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = AwardOrganizationC.class)
    public JAXBElement<Integer> createAwardOrganizationCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = AwardOrganizationC.class, defaultValue = "AwardOrganization_c")
    public JAXBElement<String> createAwardOrganizationCSourceType(String value) {
        return new JAXBElement<String>(_ProjectsCSourceType_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationName_c", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCOrganizationNameC(String value) {
        return new JAXBElement<String>(_AwardOrganizationCOrganizationNameC_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = AwardOrganizationC.class)
    public JAXBElement<BigDecimal> createAwardOrganizationCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = AwardOrganizationC.class)
    public JAXBElement<String> createAwardOrganizationCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, AwardOrganizationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationAbbreviation_Id_c", scope = ProjectAwardNewC.class)
    public JAXBElement<BigDecimal> createProjectAwardNewCOrganizationAbbreviationIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardNewCOrganizationAbbreviationIdC_QNAME, BigDecimal.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Level_c", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCLevelC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLevelC_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ProjectAwardNewC.class)
    public JAXBElement<Long> createProjectAwardNewCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ProjectAwardNewC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectAwardNewCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Category_c", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCCategoryC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCategoryC_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Comments_c", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCCommentsC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCommentsC_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ProjectAwardNewC.class)
    public JAXBElement<Integer> createProjectAwardNewCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationAbbreviation_c", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCOrganizationAbbreviationC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCOrganizationAbbreviationC_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ProjectAwardNewC.class)
    public JAXBElement<Integer> createProjectAwardNewCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AwardName_c", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCAwardNameC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCAwardNameC_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OrganizationAbbreviation1_c", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCOrganizationAbbreviation1C(String value) {
        return new JAXBElement<String>(_ProjectAwardNewCOrganizationAbbreviation1C_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ProjectAwardNewC.class)
    public JAXBElement<BigDecimal> createProjectAwardNewCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = ProjectAwardNewC.class)
    public JAXBElement<BigDecimal> createProjectAwardNewCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ProjectAwardNewC.class)
    public JAXBElement<String> createProjectAwardNewCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ProjectAwardNewC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ProposalDevelopmentsC.class)
    public JAXBElement<String> createProposalDevelopmentsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ProposalDevelopmentsC.class)
    public JAXBElement<Long> createProposalDevelopmentsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ProposalDevelopmentsC.class)
    public JAXBElement<XMLGregorianCalendar> createProposalDevelopmentsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = ProposalDevelopmentsC.class, defaultValue = "ProposalDevelopments_c")
    public JAXBElement<String> createProposalDevelopmentsCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_ProjectsCAttachmentEntityName_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ProposalDevelopmentsC.class)
    public JAXBElement<String> createProposalDevelopmentsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ProposalDevelopmentsC.class)
    public JAXBElement<String> createProposalDevelopmentsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ProposalDevelopmentsC.class)
    public JAXBElement<String> createProposalDevelopmentsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ProposalDevelopmentsC.class)
    public JAXBElement<Integer> createProposalDevelopmentsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = ProposalDevelopmentsC.class)
    public JAXBElement<String> createProposalDevelopmentsCPKProxy(String value) {
        return new JAXBElement<String>(_ProjectsCPKProxy_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ProposalDevelopmentsC.class)
    public JAXBElement<String> createProposalDevelopmentsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ProposalDevelopmentsC.class)
    public JAXBElement<Integer> createProposalDevelopmentsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ProposalDevelopmentsC.class)
    public JAXBElement<String> createProposalDevelopmentsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = ProposalDevelopmentsC.class, defaultValue = "ProposalDevelopments_c")
    public JAXBElement<String> createProposalDevelopmentsCSourceType(String value) {
        return new JAXBElement<String>(_ProjectsCSourceType_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ProposalDevelopmentsC.class)
    public JAXBElement<String> createProposalDevelopmentsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ProposalDevelopmentsC.class)
    public JAXBElement<BigDecimal> createProposalDevelopmentsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ProposalDevelopmentsC.class)
    public JAXBElement<String> createProposalDevelopmentsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ProposalDevelopmentsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = OptyProjectC.class)
    public JAXBElement<String> createOptyProjectCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = OptyProjectC.class)
    public JAXBElement<Long> createOptyProjectCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = OptyProjectC.class)
    public JAXBElement<XMLGregorianCalendar> createOptyProjectCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = OptyProjectC.class)
    public JAXBElement<String> createOptyProjectCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_Tgt_Projects_cToOpty_Project_c", scope = OptyProjectC.class)
    public JAXBElement<BigDecimal> createOptyProjectCProjectsIdTgtProjectsCToOptyProjectC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OptyProjectCProjectsIdTgtProjectsCToOptyProjectC_QNAME, BigDecimal.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = OptyProjectC.class)
    public JAXBElement<String> createOptyProjectCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = OptyProjectC.class)
    public JAXBElement<String> createOptyProjectCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = OptyProjectC.class)
    public JAXBElement<Integer> createOptyProjectCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = OptyProjectC.class)
    public JAXBElement<String> createOptyProjectCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = OptyProjectC.class)
    public JAXBElement<Integer> createOptyProjectCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = OptyProjectC.class)
    public JAXBElement<String> createOptyProjectCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = OptyProjectC.class)
    public JAXBElement<String> createOptyProjectCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = OptyProjectC.class)
    public JAXBElement<BigDecimal> createOptyProjectCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Opportunity_Id_Src_OpportunityToOpty_Project_c", scope = OptyProjectC.class)
    public JAXBElement<BigDecimal> createOptyProjectCOpportunityIdSrcOpportunityToOptyProjectC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OptyProjectCOpportunityIdSrcOpportunityToOptyProjectC_QNAME, BigDecimal.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = OptyProjectC.class)
    public JAXBElement<String> createOptyProjectCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, OptyProjectC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = OwnerC.class)
    public JAXBElement<XMLGregorianCalendar> createOwnerCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Customer_Id_c", scope = OwnerC.class)
    public JAXBElement<BigDecimal> createOwnerCCustomerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OwnerCCustomerIdC_QNAME, BigDecimal.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = OwnerC.class)
    public JAXBElement<Integer> createOwnerCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "City_c", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCCityC(String value) {
        return new JAXBElement<String>(_ProjectsCCityC_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OwnerId_c", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCOwnerIdC(String value) {
        return new JAXBElement<String>(_ProjectsCOwnerIdC_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Address1_c", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCAddress1C(String value) {
        return new JAXBElement<String>(_OwnerCAddress1C_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Customer_c", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCCustomerC(String value) {
        return new JAXBElement<String>(_ProjectsCCustomerC_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = OwnerC.class)
    public JAXBElement<BigDecimal> createOwnerCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Address3_c", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCAddress3C(String value) {
        return new JAXBElement<String>(_OwnerCAddress3C_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = OwnerC.class)
    public JAXBElement<Long> createOwnerCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = OwnerC.class)
    public JAXBElement<XMLGregorianCalendar> createOwnerCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCContractIdC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCContractIdC_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = OwnerC.class)
    public JAXBElement<Integer> createOwnerCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Address2_c", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCAddress2C(String value) {
        return new JAXBElement<String>(_OwnerCAddress2C_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = OwnerC.class)
    public JAXBElement<byte[]> createOwnerCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, OwnerC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PostalCode_c", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCPostalCodeC(String value) {
        return new JAXBElement<String>(_ProjectsCPostalCodeC_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AddressSequenceNumber_c", scope = OwnerC.class)
    public JAXBElement<BigDecimal> createOwnerCAddressSequenceNumberC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCAddressSequenceNumberC_QNAME, BigDecimal.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "State_c", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCStateC(String value) {
        return new JAXBElement<String>(_ProjectsCStateC_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = OwnerC.class)
    public JAXBElement<BigDecimal> createOwnerCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = OwnerC.class)
    public JAXBElement<String> createOwnerCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = OwnerC.class)
    public JAXBElement<XMLGregorianCalendar> createOwnerCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, OwnerC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = SubconsultantC.class)
    public JAXBElement<XMLGregorianCalendar> createSubconsultantCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualCostUSD_c", scope = SubconsultantC.class)
    public JAXBElement<AmountType> createSubconsultantCActualCostUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualCostUSDC_QNAME, AmountType.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubconsultantServicess_cMeaning", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCSubconsultantServicessCMeaning(String value) {
        return new JAXBElement<String>(_SubconsultantCSubconsultantServicessCMeaning_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CompanyClassification_cMeaning", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCCompanyClassificationCMeaning(String value) {
        return new JAXBElement<String>(_SubconsultantCCompanyClassificationCMeaning_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CompanyClassification_c", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCCompanyClassificationC(String value) {
        return new JAXBElement<String>(_SubconsultantCCompanyClassificationC_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Subconsultant_c", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCSubconsultantC(String value) {
        return new JAXBElement<String>(_ProjectsCSubconsultantC_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = SubconsultantC.class)
    public JAXBElement<Integer> createSubconsultantCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceProvided_c", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCServiceProvidedC(String value) {
        return new JAXBElement<String>(_ProjectsCServiceProvidedC_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "VendorId_c", scope = SubconsultantC.class)
    public JAXBElement<BigDecimal> createSubconsultantCVendorIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCVendorIdC_QNAME, BigDecimal.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Fees_c", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCFeesC(String value) {
        return new JAXBElement<String>(_SubconsultantCFeesC_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = SubconsultantC.class)
    public JAXBElement<BigDecimal> createSubconsultantCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EnterpriseType_c", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCEnterpriseTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCEnterpriseTypeC_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CompanyClassificationss_cMeaning", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCCompanyClassificationssCMeaning(String value) {
        return new JAXBElement<String>(_SubconsultantCCompanyClassificationssCMeaning_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = SubconsultantC.class)
    public JAXBElement<Long> createSubconsultantCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = SubconsultantC.class)
    public JAXBElement<XMLGregorianCalendar> createSubconsultantCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubconsultantId_c", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCSubconsultantIdC(String value) {
        return new JAXBElement<String>(_SubconsultantCSubconsultantIdC_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = SubconsultantC.class)
    public JAXBElement<Integer> createSubconsultantCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CompanyClassificationss_c", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCCompanyClassificationssC(String value) {
        return new JAXBElement<String>(_SubconsultantCCompanyClassificationssC_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = SubconsultantC.class)
    public JAXBElement<byte[]> createSubconsultantCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, SubconsultantC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EnterpriseType_cMeaning", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCEnterpriseTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCEnterpriseTypeCMeaning_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = SubconsultantC.class)
    public JAXBElement<BigDecimal> createSubconsultantCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CompanyClassifications_c", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCCompanyClassificationsC(String value) {
        return new JAXBElement<String>(_SubconsultantCCompanyClassificationsC_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = SubconsultantC.class)
    public JAXBElement<XMLGregorianCalendar> createSubconsultantCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubconsultantServicess_c", scope = SubconsultantC.class)
    public JAXBElement<String> createSubconsultantCSubconsultantServicessC(String value) {
        return new JAXBElement<String>(_SubconsultantCSubconsultantServicessC_QNAME, String.class, SubconsultantC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2IsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = GSACodesC2 .class)
    public JAXBElement<Long> createGSACodesC2RequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = GSACodesC2 .class)
    public JAXBElement<XMLGregorianCalendar> createGSACodesC2UserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2JobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACodess_c", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2GSACodessC(String value) {
        return new JAXBElement<String>(_GSACodesC2GSACodessC_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2CorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2JobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = GSACodesC2 .class)
    public JAXBElement<Integer> createGSACodesC2CpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2CurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = GSACodesC2 .class)
    public JAXBElement<Integer> createGSACodesC2CpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACode_c", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2GSACodeC(String value) {
        return new JAXBElement<String>(_ProjectsCGSACodeC_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2LastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SF330_c", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2SF330C(String value) {
        return new JAXBElement<String>(_GSACodesC2SF330C_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2CurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NetFee_c", scope = GSACodesC2 .class)
    public JAXBElement<AmountType> createGSACodesC2NetFeeC(AmountType value) {
        return new JAXBElement<AmountType>(_GSACodesC2NetFeeC_QNAME, AmountType.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = GSACodesC2 .class)
    public JAXBElement<BigDecimal> createGSACodesC2ObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = GSACodesC2 .class)
    public JAXBElement<BigDecimal> createGSACodesC2ProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = GSACodesC2 .class)
    public JAXBElement<String> createGSACodesC2CpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, GSACodesC2 .class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PotentialSNBUSD_cCurcyConvRate", scope = RelatedOpportunitiesC.class)
    public JAXBElement<BigDecimal> createRelatedOpportunitiesCPotentialSNBUSDCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCPotentialSNBUSDCCurcyConvRate_QNAME, BigDecimal.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = RelatedOpportunitiesC.class)
    public JAXBElement<XMLGregorianCalendar> createRelatedOpportunitiesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCLastUpdateDate_QNAME, XMLGregorianCalendar.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectLocationCIsOwner_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionName_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurcyConvRateType_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = RelatedOpportunitiesC.class)
    public JAXBElement<Integer> createRelatedOpportunitiesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerSor_QNAME, Integer.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FeeChgANTPUSD_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<AmountType> createRelatedOpportunitiesCFeeChgANTPUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_RelatedOpportunitiesCFeeChgANTPUSDC_QNAME, AmountType.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<BigDecimal> createRelatedOpportunitiesCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCOpportunityVOIdC_QNAME, BigDecimal.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MasterOpportunity_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCMasterOpportunityC(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCMasterOpportunityC_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FeeChgANTPUSD_cCurcyConvRate", scope = RelatedOpportunitiesC.class)
    public JAXBElement<BigDecimal> createRelatedOpportunitiesCFeeChgANTPUSDCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCFeeChgANTPUSDCCurcyConvRate_QNAME, BigDecimal.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Transfer_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCTransferC(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCTransferC_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessClass_cMeaning", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCBusinessClassCMeaning(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessClassCMeaning_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessGroup_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCBusinessGroupC(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessGroupC_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MasterOpportunity_Id_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<BigDecimal> createRelatedOpportunitiesCMasterOpportunityIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCMasterOpportunityIdC_QNAME, BigDecimal.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PotentialSNBUSD_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<AmountType> createRelatedOpportunitiesCPotentialSNBUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_RelatedOpportunitiesCPotentialSNBUSDC_QNAME, AmountType.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = RelatedOpportunitiesC.class)
    public JAXBElement<Long> createRelatedOpportunitiesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectLocationCRequestId_QNAME, Long.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PotentialSNBUSD_cCurrencyCode", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCPotentialSNBUSDCCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCPotentialSNBUSDCCurrencyCode_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = RelatedOpportunitiesC.class)
    public JAXBElement<XMLGregorianCalendar> createRelatedOpportunitiesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionPackage_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContractNumber_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<BigDecimal> createRelatedOpportunitiesCContractNumberC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCContractNumberC_QNAME, BigDecimal.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FeeChgANTPUSD_cCurrencyCode", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCFeeChgANTPUSDCCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCFeeChgANTPUSDCCurrencyCode_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCorpCurrencyCode_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = RelatedOpportunitiesC.class)
    public JAXBElement<Integer> createRelatedOpportunitiesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerPillar_QNAME, Integer.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCCreatedBy_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCBusinessUnitC(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessUnitC_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdateLogin_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_cMeaning", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessUnitCMeaning_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessClass_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCBusinessClassC(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessClassC_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessGroup_cMeaning", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCBusinessGroupCMeaning(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessGroupCMeaning_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdatedBy_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = RelatedOpportunitiesC.class)
    public JAXBElement<BigDecimal> createRelatedOpportunitiesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCObjectVersionNumber_QNAME, BigDecimal.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurrencyCode_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = RelatedOpportunitiesC.class)
    public JAXBElement<XMLGregorianCalendar> createRelatedOpportunitiesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCCreationDate_QNAME, XMLGregorianCalendar.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectLocationCCpdrfLastUpd_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = PursuitMilestonesC.class)
    public JAXBElement<Long> createPursuitMilestonesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectLocationCRequestId_QNAME, Long.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectLocationCIsOwner_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = PursuitMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createPursuitMilestonesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionName_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = PursuitMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createPursuitMilestonesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments_c", scope = PursuitMilestonesC.class)
    public JAXBElement<byte[]> createPursuitMilestonesCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_ApproversCCommentsC_QNAME, byte[].class, PursuitMilestonesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionPackage_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCorpCurrencyCode_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Date_c", scope = PursuitMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createPursuitMilestonesCDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PursuitMilestonesCDateC_QNAME, XMLGregorianCalendar.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurcyConvRateType_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCCreatedBy_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = PursuitMilestonesC.class)
    public JAXBElement<Integer> createPursuitMilestonesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerPillar_QNAME, Integer.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdateLogin_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = PursuitMilestonesC.class)
    public JAXBElement<Integer> createPursuitMilestonesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerSor_QNAME, Integer.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Type_cMeaning", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCTypeCMeaning(String value) {
        return new JAXBElement<String>(_PartnersJointBidsCTypeCMeaning_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MilestoneType_c", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCMilestoneTypeC(String value) {
        return new JAXBElement<String>(_PursuitMilestonesCMilestoneTypeC_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdatedBy_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = PursuitMilestonesC.class)
    public JAXBElement<BigDecimal> createPursuitMilestonesCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCOpportunityVOIdC_QNAME, BigDecimal.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = PursuitMilestonesC.class)
    public JAXBElement<BigDecimal> createPursuitMilestonesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCObjectVersionNumber_QNAME, BigDecimal.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurrencyCode_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = PursuitMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createPursuitMilestonesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCCreationDate_QNAME, XMLGregorianCalendar.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MilestoneType_cMeaning", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCMilestoneTypeCMeaning(String value) {
        return new JAXBElement<String>(_PursuitMilestonesCMilestoneTypeCMeaning_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DoNotUse_c", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCDoNotUseC(String value) {
        return new JAXBElement<String>(_PartnersJointBidsCDoNotUseC_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectLocationCCpdrfLastUpd_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = EducationC.class)
    public JAXBElement<XMLGregorianCalendar> createEducationCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = EducationC.class)
    public JAXBElement<String> createEducationCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = EducationC.class)
    public JAXBElement<String> createEducationCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StateProvince_c", scope = EducationC.class)
    public JAXBElement<String> createEducationCStateProvinceC(String value) {
        return new JAXBElement<String>(_EducationCStateProvinceC_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Degree_c", scope = EducationC.class)
    public JAXBElement<String> createEducationCDegreeC(String value) {
        return new JAXBElement<String>(_EducationCDegreeC_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = EducationC.class)
    public JAXBElement<String> createEducationCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = EducationC.class)
    public JAXBElement<Integer> createEducationCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Country_cMeaning", scope = EducationC.class)
    public JAXBElement<String> createEducationCCountryCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCCountryCMeaning_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = EducationC.class)
    public JAXBElement<Long> createEducationCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Institution_c", scope = EducationC.class)
    public JAXBElement<String> createEducationCInstitutionC(String value) {
        return new JAXBElement<String>(_EducationCInstitutionC_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Country_c", scope = EducationC.class)
    public JAXBElement<String> createEducationCCountryC(String value) {
        return new JAXBElement<String>(_ProjectsCCountryC_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = EducationC.class)
    public JAXBElement<XMLGregorianCalendar> createEducationCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Major_c", scope = EducationC.class)
    public JAXBElement<String> createEducationCMajorC(String value) {
        return new JAXBElement<String>(_EducationCMajorC_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = EducationC.class)
    public JAXBElement<BigDecimal> createEducationCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Concentration_c", scope = EducationC.class)
    public JAXBElement<String> createEducationCConcentrationC(String value) {
        return new JAXBElement<String>(_EducationCConcentrationC_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = EducationC.class)
    public JAXBElement<String> createEducationCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = EducationC.class)
    public JAXBElement<String> createEducationCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = EducationC.class)
    public JAXBElement<Integer> createEducationCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = EducationC.class)
    public JAXBElement<String> createEducationCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Years_c", scope = EducationC.class)
    public JAXBElement<String> createEducationCYearsC(String value) {
        return new JAXBElement<String>(_EducationCYearsC_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Year_c", scope = EducationC.class)
    public JAXBElement<String> createEducationCYearC(String value) {
        return new JAXBElement<String>(_PublicationsCYearC_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = EducationC.class)
    public JAXBElement<String> createEducationCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StatesProvinces_c", scope = EducationC.class)
    public JAXBElement<String> createEducationCStatesProvincesC(String value) {
        return new JAXBElement<String>(_EducationCStatesProvincesC_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Year_cMeaning", scope = EducationC.class)
    public JAXBElement<String> createEducationCYearCMeaning(String value) {
        return new JAXBElement<String>(_PresentationsCYearCMeaning_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = EducationC.class)
    public JAXBElement<String> createEducationCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = EducationC.class)
    public JAXBElement<String> createEducationCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EducationTypeCode_c", scope = EducationC.class)
    public JAXBElement<String> createEducationCEducationTypeCodeC(String value) {
        return new JAXBElement<String>(_EducationCEducationTypeCodeC_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = EducationC.class)
    public JAXBElement<BigDecimal> createEducationCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = EducationC.class)
    public JAXBElement<String> createEducationCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = EducationC.class)
    public JAXBElement<XMLGregorianCalendar> createEducationCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, EducationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = EmployeesC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = EmployeesC.class, defaultValue = "Employees_c")
    public JAXBElement<String> createEmployeesCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_ProjectsCAttachmentEntityName_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSEmployeeNumber_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCEBSEmployeeNumberC(String value) {
        return new JAXBElement<String>(_EmployeesCEBSEmployeeNumberC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Section_cMeaning", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCSectionCMeaning(String value) {
        return new JAXBElement<String>(_EmployeesCSectionCMeaning_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IndustryTenure_c", scope = EmployeesC.class)
    public JAXBElement<BigDecimal> createEmployeesCIndustryTenureC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeesCIndustryTenureC_QNAME, BigDecimal.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Activity_Id_c", scope = EmployeesC.class)
    public JAXBElement<BigDecimal> createEmployeesCActivityIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeesCActivityIdC_QNAME, BigDecimal.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = EmployeesC.class)
    public JAXBElement<Integer> createEmployeesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Activity_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCActivityC(String value) {
        return new JAXBElement<String>(_EmployeesCActivityC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FirstName_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCFirstNameC(String value) {
        return new JAXBElement<String>(_EmployeesCFirstNameC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackendIntegrationDate_c", scope = EmployeesC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeesCBackendIntegrationDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmployeesCBackendIntegrationDateC_QNAME, XMLGregorianCalendar.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = EmployeesC.class)
    public JAXBElement<Long> createEmployeesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackEndLastUpdatedDate_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCBackEndLastUpdatedDateC(String value) {
        return new JAXBElement<String>(_ProjectsCBackEndLastUpdatedDateC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Country_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCCountryC(String value) {
        return new JAXBElement<String>(_ProjectsCCountryC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EmployeeLegacySystemID_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCEmployeeLegacySystemIDC(String value) {
        return new JAXBElement<String>(_EmployeesCEmployeeLegacySystemIDC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Language_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCLanguageC(String value) {
        return new JAXBElement<String>(_LanguageCLanguageC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = EmployeesC.class)
    public JAXBElement<Integer> createEmployeesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCPKProxy(String value) {
        return new JAXBElement<String>(_ProjectsCPKProxy_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EmployeeID_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCEmployeeIDC(String value) {
        return new JAXBElement<String>(_EmployeesCEmployeeIDC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Department_cMeaning", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCDepartmentCMeaning(String value) {
        return new JAXBElement<String>(_EmployeesCDepartmentCMeaning_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessGroup_cMeaning", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCBusinessGroupCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessGroupCMeaning_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessUnit_cMeaning", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessUnitCMeaning_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = EmployeesC.class)
    public JAXBElement<BigDecimal> createEmployeesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSector_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCMarketSectorC(String value) {
        return new JAXBElement<String>(_ProjectsCMarketSectorC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Language_cMeaning", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCLanguageCMeaning(String value) {
        return new JAXBElement<String>(_LanguageCLanguageCMeaning_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ExperienceOverview_c", scope = EmployeesC.class)
    public JAXBElement<byte[]> createEmployeesCExperienceOverviewC(byte[] value) {
        return new JAXBElement<byte[]>(_EmployeesCExperienceOverviewC_QNAME, byte[].class, EmployeesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UpdateDate_c", scope = EmployeesC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeesCUpdateDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmployeesCUpdateDateC_QNAME, XMLGregorianCalendar.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCStatusC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Credentials_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCCredentialsC(String value) {
        return new JAXBElement<String>(_EmployeesCCredentialsC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ResumeDataContacts_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCResumeDataContactsC(String value) {
        return new JAXBElement<String>(_EmployeesCResumeDataContactsC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "City_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCCityC(String value) {
        return new JAXBElement<String>(_ProjectsCCityC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClasses_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCBusinessClassesC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassesC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "WorkPhone_c", scope = EmployeesC.class)
    public JAXBElement<BigDecimal> createEmployeesCWorkPhoneC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeesCWorkPhoneC_QNAME, BigDecimal.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCLastUpdatedByC(String value) {
        return new JAXBElement<String>(_AdditionalOverviewsBiosCLastUpdatedByC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Address1_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCAddress1C(String value) {
        return new JAXBElement<String>(_OwnerCAddress1C_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Department_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCDepartmentC(String value) {
        return new JAXBElement<String>(_ProjectsCDepartmentC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Country_cMeaning", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCCountryCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCCountryCMeaning_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastName_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCLastNameC(String value) {
        return new JAXBElement<String>(_EmployeesCLastNameC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HireDate_c", scope = EmployeesC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeesCHireDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmployeesCHireDateC_QNAME, XMLGregorianCalendar.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessGroup_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCBusinessGroupC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessGroupC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PreferredName_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCPreferredNameC(String value) {
        return new JAXBElement<String>(_EmployeesCPreferredNameC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = EmployeesC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ExperienceLastUpdated_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCExperienceLastUpdatedC(String value) {
        return new JAXBElement<String>(_EmployeesCExperienceLastUpdatedC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDRTenure_c", scope = EmployeesC.class)
    public JAXBElement<BigDecimal> createEmployeesCHDRTenureC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeesCHDRTenureC_QNAME, BigDecimal.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ResumeDataContact_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCResumeDataContactC(String value) {
        return new JAXBElement<String>(_EmployeesCResumeDataContactC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Office_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCOfficeC(String value) {
        return new JAXBElement<String>(_EmployeesCOfficeC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSector_cMeaning", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCMarketSectorCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCMarketSectorCMeaning_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClasses_cMeaning", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCBusinessClassesCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassesCMeaning_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessTitle_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCBusinessTitleC(String value) {
        return new JAXBElement<String>(_EmployeesCBusinessTitleC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Address2_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCAddress2C(String value) {
        return new JAXBElement<String>(_OwnerCAddress2C_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "WorkAddress_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCWorkAddressC(String value) {
        return new JAXBElement<String>(_EmployeesCWorkAddressC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessUnit_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCBusinessUnitC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessUnitC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ExperienceGroupName_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCExperienceGroupNameC(String value) {
        return new JAXBElement<String>(_EmployeesCExperienceGroupNameC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = EmployeesC.class, defaultValue = "Employees_c")
    public JAXBElement<String> createEmployeesCSourceType(String value) {
        return new JAXBElement<String>(_ProjectsCSourceType_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Section_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCSectionC(String value) {
        return new JAXBElement<String>(_EmployeesCSectionC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Languages_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCLanguagesC(String value) {
        return new JAXBElement<String>(_EmployeesCLanguagesC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClass_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCBusinessClassC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "State_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCStateC(String value) {
        return new JAXBElement<String>(_ProjectsCStateC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MiddleInitials_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCMiddleInitialsC(String value) {
        return new JAXBElement<String>(_EmployeesCMiddleInitialsC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EmailAddress_c", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCEmailAddressC(String value) {
        return new JAXBElement<String>(_EmployeesCEmailAddressC_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Languages_cMeaning", scope = EmployeesC.class)
    public JAXBElement<String> createEmployeesCLanguagesCMeaning(String value) {
        return new JAXBElement<String>(_EmployeesCLanguagesCMeaning_QNAME, String.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = EmployeesC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ResumeDataContacts_Id_c", scope = EmployeesC.class)
    public JAXBElement<BigDecimal> createEmployeesCResumeDataContactsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeesCResumeDataContactsIdC_QNAME, BigDecimal.class, EmployeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = GSACodeC.class)
    public JAXBElement<Long> createGSACodeCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = GSACodeC.class)
    public JAXBElement<XMLGregorianCalendar> createGSACodeCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = GSACodeC.class, defaultValue = "GSACode_c")
    public JAXBElement<String> createGSACodeCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_ProjectsCAttachmentEntityName_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = GSACodeC.class)
    public JAXBElement<Integer> createGSACodeCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCPKProxy(String value) {
        return new JAXBElement<String>(_ProjectsCPKProxy_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = GSACodeC.class)
    public JAXBElement<Integer> createGSACodeCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GSACode_c", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCGSACodeC(String value) {
        return new JAXBElement<String>(_ProjectsCGSACodeC_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = GSACodeC.class, defaultValue = "GSACode_c")
    public JAXBElement<String> createGSACodeCSourceType(String value) {
        return new JAXBElement<String>(_ProjectsCSourceType_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SF330_c", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCSF330C(String value) {
        return new JAXBElement<String>(_GSACodesC2SF330C_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = GSACodeC.class)
    public JAXBElement<BigDecimal> createGSACodeCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = GSACodeC.class)
    public JAXBElement<String> createGSACodeCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, GSACodeC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ProjectTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectTeamCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectRole_c", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCProjectRoleC(String value) {
        return new JAXBElement<String>(_ProjectTeamCProjectRoleC_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ResumeProjectRole_c", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCResumeProjectRoleC(String value) {
        return new JAXBElement<String>(_ProjectTeamCResumeProjectRoleC_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ProjectTeamC.class)
    public JAXBElement<Integer> createProjectTeamCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HoursCharged_c", scope = ProjectTeamC.class)
    public JAXBElement<BigDecimal> createProjectTeamCHoursChargedC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectTeamCHoursChargedC_QNAME, BigDecimal.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastName_c", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCLastNameC(String value) {
        return new JAXBElement<String>(_EmployeesCLastNameC_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = ProjectTeamC.class)
    public JAXBElement<BigDecimal> createProjectTeamCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ResumeSummary_c", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCResumeSummaryC(String value) {
        return new JAXBElement<String>(_ProjectTeamCResumeSummaryC_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ProjectTeamC.class)
    public JAXBElement<Long> createProjectTeamCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ProjectTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectTeamCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DefaultResumeSummary_c", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCDefaultResumeSummaryC(String value) {
        return new JAXBElement<String>(_ProjectTeamCDefaultResumeSummaryC_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ProjectTeamC.class)
    public JAXBElement<Integer> createProjectTeamCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubConsultantType_cMeaning", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCSubConsultantTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectTeamCSubConsultantTypeCMeaning_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ProjectTeamC.class)
    public JAXBElement<BigDecimal> createProjectTeamCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubConsultantType_c", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCSubConsultantTypeC(String value) {
        return new JAXBElement<String>(_ProjectTeamCSubConsultantTypeC_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ProjectTeamC.class)
    public JAXBElement<String> createProjectTeamCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ProjectTeamC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectTeamCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ProjectTeamC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = NotesResumeReferencesC.class)
    public JAXBElement<XMLGregorianCalendar> createNotesResumeReferencesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SavedBy_c", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCSavedByC(String value) {
        return new JAXBElement<String>(_NotesResumeReferencesCSavedByC_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = NotesResumeReferencesC.class)
    public JAXBElement<Integer> createNotesResumeReferencesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TypeOfResume_c", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCTypeOfResumeC(String value) {
        return new JAXBElement<String>(_NotesResumeReferencesCTypeOfResumeC_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_cMeaning", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCTypeCMeaning_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SavedSearch_c", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCSavedSearchC(String value) {
        return new JAXBElement<String>(_NotesResumeReferencesCSavedSearchC_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = NotesResumeReferencesC.class)
    public JAXBElement<Long> createNotesResumeReferencesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = NotesResumeReferencesC.class)
    public JAXBElement<XMLGregorianCalendar> createNotesResumeReferencesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = NotesResumeReferencesC.class)
    public JAXBElement<BigDecimal> createNotesResumeReferencesCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = NotesResumeReferencesC.class)
    public JAXBElement<Integer> createNotesResumeReferencesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = NotesResumeReferencesC.class)
    public JAXBElement<byte[]> createNotesResumeReferencesCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, NotesResumeReferencesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DateModified_c", scope = NotesResumeReferencesC.class)
    public JAXBElement<XMLGregorianCalendar> createNotesResumeReferencesCDateModifiedC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NotesResumeReferencesCDateModifiedC_QNAME, XMLGregorianCalendar.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Company_c", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCCompanyC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCompanyC_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RemoveSavedSearchFromOSC_c", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCRemoveSavedSearchFromOSCC(String value) {
        return new JAXBElement<String>(_NotesResumeReferencesCRemoveSavedSearchFromOSCC_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = NotesResumeReferencesC.class)
    public JAXBElement<BigDecimal> createNotesResumeReferencesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = NotesResumeReferencesC.class)
    public JAXBElement<XMLGregorianCalendar> createNotesResumeReferencesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_c", scope = NotesResumeReferencesC.class)
    public JAXBElement<String> createNotesResumeReferencesCTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCTypeC_QNAME, String.class, NotesResumeReferencesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = EmployeeProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeProjectsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MasterContractNames_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCMasterContractNamesC(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCMasterContractNamesC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectRole_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCProjectRoleC(String value) {
        return new JAXBElement<String>(_ProjectTeamCProjectRoleC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = EmployeeProjectsC.class)
    public JAXBElement<Integer> createEmployeeProjectsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractName_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCContractNameC(String value) {
        return new JAXBElement<String>(_ProjectsCContractNameC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ResumeSummary_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCResumeSummaryC(String value) {
        return new JAXBElement<String>(_ProjectTeamCResumeSummaryC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectExperienceType_cMeaning", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCProjectExperienceTypeCMeaning(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCProjectExperienceTypeCMeaning_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = EmployeeProjectsC.class)
    public JAXBElement<Long> createEmployeeProjectsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = EmployeeProjectsC.class)
    public JAXBElement<BigDecimal> createEmployeeProjectsCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Responsibilities_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCResponsibilitiesC(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCResponsibilitiesC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = EmployeeProjectsC.class)
    public JAXBElement<Integer> createEmployeeProjectsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MasterContractName_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCMasterContractNameC(String value) {
        return new JAXBElement<String>(_ProjectsCMasterContractNameC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Roles_cMeaning", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCRolesCMeaning(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCRolesCMeaning_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Duration_c", scope = EmployeeProjectsC.class)
    public JAXBElement<BigDecimal> createEmployeeProjectsCDurationC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProfessionalMembershipsCDurationC_QNAME, BigDecimal.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndDate_c", scope = EmployeeProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeProjectsCEndDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCEndDateC_QNAME, XMLGregorianCalendar.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_cMeaning", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCStatusCMeaning(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusCMeaning_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = EmployeeProjectsC.class)
    public JAXBElement<BigDecimal> createEmployeeProjectsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HoursChargeds_c", scope = EmployeeProjectsC.class)
    public JAXBElement<BigDecimal> createEmployeeProjectsCHoursChargedsC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeProjectsCHoursChargedsC_QNAME, BigDecimal.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Role_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCRoleC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCRoleC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectLastActivityDate_c", scope = EmployeeProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeProjectsCProjectLastActivityDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmployeeProjectsCProjectLastActivityDateC_QNAME, XMLGregorianCalendar.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalProjectRole_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCAdditionalProjectRoleC(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCAdditionalProjectRoleC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectName_Id_c", scope = EmployeeProjectsC.class)
    public JAXBElement<BigDecimal> createEmployeeProjectsCProjectNameIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeProjectsCProjectNameIdC_QNAME, BigDecimal.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSProjectID_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCEBSProjectIDC(String value) {
        return new JAXBElement<String>(_ProjectsCEBSProjectIDC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCStatusC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalProjectRoles_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCAdditionalProjectRolesC(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCAdditionalProjectRolesC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketingProjectName_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCMarketingProjectNameC(String value) {
        return new JAXBElement<String>(_ProjectsCMarketingProjectNameC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectExperienceType_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCProjectExperienceTypeC(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCProjectExperienceTypeC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StartDate_c", scope = EmployeeProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeProjectsCStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCStartDateC_QNAME, XMLGregorianCalendar.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = EmployeeProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeProjectsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectLocation_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCProjectLocationC(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCProjectLocationC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ExperienceLastUpdated_c", scope = EmployeeProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeProjectsCExperienceLastUpdatedC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_EmployeesCExperienceLastUpdatedC_QNAME, XMLGregorianCalendar.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MasterContractName_Id_c", scope = EmployeeProjectsC.class)
    public JAXBElement<BigDecimal> createEmployeeProjectsCMasterContractNameIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeProjectsCMasterContractNameIdC_QNAME, BigDecimal.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSProjectID_Id_c", scope = EmployeeProjectsC.class)
    public JAXBElement<BigDecimal> createEmployeeProjectsCEBSProjectIDIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeeProjectsCEBSProjectIDIdC_QNAME, BigDecimal.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectName_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCProjectNameC(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCProjectNameC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSNumber_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCEBSNumberC(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCEBSNumberC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ClientName_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCClientNameC(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCClientNameC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = EmployeeProjectsC.class)
    public JAXBElement<byte[]> createEmployeeProjectsCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, EmployeeProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalDescription_c", scope = EmployeeProjectsC.class)
    public JAXBElement<byte[]> createEmployeeProjectsCAdditionalDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCAdditionalDescriptionC_QNAME, byte[].class, EmployeeProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "State_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCStateC(String value) {
        return new JAXBElement<String>(_ProjectsCStateC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastActivityDate_c", scope = EmployeeProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeProjectsCLastActivityDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCLastActivityDateC_QNAME, XMLGregorianCalendar.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Roles_c", scope = EmployeeProjectsC.class)
    public JAXBElement<String> createEmployeeProjectsCRolesC(String value) {
        return new JAXBElement<String>(_EmployeeProjectsCRolesC_QNAME, String.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = EmployeeProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeeProjectsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, EmployeeProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = CompetitorC.class)
    public JAXBElement<Long> createCompetitorCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectLocationCRequestId_QNAME, Long.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectLocationCIsOwner_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = CompetitorC.class)
    public JAXBElement<XMLGregorianCalendar> createCompetitorCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCLastUpdateDate_QNAME, XMLGregorianCalendar.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionName_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = CompetitorC.class)
    public JAXBElement<XMLGregorianCalendar> createCompetitorCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments_c", scope = CompetitorC.class)
    public JAXBElement<byte[]> createCompetitorCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_ApproversCCommentsC_QNAME, byte[].class, CompetitorC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionPackage_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCorpCurrencyCode_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurcyConvRateType_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCCreatedBy_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = CompetitorC.class)
    public JAXBElement<Integer> createCompetitorCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerPillar_QNAME, Integer.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdateLogin_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = CompetitorC.class)
    public JAXBElement<Integer> createCompetitorCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerSor_QNAME, Integer.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdatedBy_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = CompetitorC.class)
    public JAXBElement<BigDecimal> createCompetitorCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCOpportunityVOIdC_QNAME, BigDecimal.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = CompetitorC.class)
    public JAXBElement<BigDecimal> createCompetitorCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCObjectVersionNumber_QNAME, BigDecimal.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurrencyCode_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = CompetitorC.class)
    public JAXBElement<XMLGregorianCalendar> createCompetitorCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCCreationDate_QNAME, XMLGregorianCalendar.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectLocationCCpdrfLastUpd_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ContactsC.class)
    public JAXBElement<XMLGregorianCalendar> createContactsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ContactsC.class)
    public JAXBElement<String> createContactsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ContactsC.class)
    public JAXBElement<String> createContactsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Names_c", scope = ContactsC.class)
    public JAXBElement<String> createContactsCNamesC(String value) {
        return new JAXBElement<String>(_ContactsCNamesC_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ReferenceChangedDate_c", scope = ContactsC.class)
    public JAXBElement<String> createContactsCReferenceChangedDateC(String value) {
        return new JAXBElement<String>(_ContactsCReferenceChangedDateC_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ContactsC.class)
    public JAXBElement<String> createContactsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ContactsC.class)
    public JAXBElement<Integer> createContactsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Reference_c", scope = ContactsC.class)
    public JAXBElement<String> createContactsCReferenceC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCReferenceC_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RefChangedBy_c", scope = ContactsC.class)
    public JAXBElement<String> createContactsCRefChangedByC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCRefChangedByC_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Department_c", scope = ContactsC.class)
    public JAXBElement<String> createContactsCDepartmentC(String value) {
        return new JAXBElement<String>(_ProjectsCDepartmentC_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Email_c", scope = ContactsC.class)
    public JAXBElement<String> createContactsCEmailC(String value) {
        return new JAXBElement<String>(_ContactsCEmailC_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = ContactsC.class)
    public JAXBElement<BigDecimal> createContactsCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ContactsC.class)
    public JAXBElement<Long> createContactsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ContactsC.class)
    public JAXBElement<XMLGregorianCalendar> createContactsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Names_Id_c", scope = ContactsC.class)
    public JAXBElement<BigDecimal> createContactsCNamesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContactsCNamesIdC_QNAME, BigDecimal.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ContactsC.class)
    public JAXBElement<String> createContactsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ContactsC.class)
    public JAXBElement<String> createContactsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Phone_c", scope = ContactsC.class)
    public JAXBElement<String> createContactsCPhoneC(String value) {
        return new JAXBElement<String>(_ContactsCPhoneC_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ContactsC.class)
    public JAXBElement<Integer> createContactsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ContactsC.class)
    public JAXBElement<String> createContactsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Department_cMeaning", scope = ContactsC.class)
    public JAXBElement<String> createContactsCDepartmentCMeaning(String value) {
        return new JAXBElement<String>(_EmployeesCDepartmentCMeaning_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ContactsC.class)
    public JAXBElement<String> createContactsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessUnit_c", scope = ContactsC.class)
    public JAXBElement<String> createContactsCBusinessUnitC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessUnitC_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ContactsC.class)
    public JAXBElement<String> createContactsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessUnit_cMeaning", scope = ContactsC.class)
    public JAXBElement<String> createContactsCBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessUnitCMeaning_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ContactsC.class)
    public JAXBElement<String> createContactsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobTitle_c", scope = ContactsC.class)
    public JAXBElement<String> createContactsCJobTitleC(String value) {
        return new JAXBElement<String>(_ContactsCJobTitleC_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ContactsC.class)
    public JAXBElement<BigDecimal> createContactsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Reference_cMeaning", scope = ContactsC.class)
    public JAXBElement<String> createContactsCReferenceCMeaning(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCReferenceCMeaning_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ContactsC.class)
    public JAXBElement<String> createContactsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ContactsC.class)
    public JAXBElement<XMLGregorianCalendar> createContactsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ContactsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ProjectDescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectDescriptionCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ProjectDescriptionC.class)
    public JAXBElement<Long> createProjectDescriptionCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ProjectDescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectDescriptionCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCContractIdC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCContractIdC_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "KeyComparativeFeaturesBenefits_c", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCKeyComparativeFeaturesBenefitsC(String value) {
        return new JAXBElement<String>(_ProjectsCKeyComparativeFeaturesBenefitsC_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ProjectDescriptionC.class)
    public JAXBElement<Integer> createProjectDescriptionCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ProjectDescriptionC.class)
    public JAXBElement<Integer> createProjectDescriptionCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = ProjectDescriptionC.class)
    public JAXBElement<byte[]> createProjectDescriptionCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, ProjectDescriptionC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectDescriptionGeneralOverv_c", scope = ProjectDescriptionC.class)
    public JAXBElement<byte[]> createProjectDescriptionCProjectDescriptionGeneralOvervC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCProjectDescriptionGeneralOvervC_QNAME, byte[].class, ProjectDescriptionC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ProjectDescriptionC.class)
    public JAXBElement<BigDecimal> createProjectDescriptionCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = ProjectDescriptionC.class)
    public JAXBElement<BigDecimal> createProjectDescriptionCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DescriptionType_cMeaning", scope = ProjectDescriptionC.class)
    public JAXBElement<String> createProjectDescriptionCDescriptionTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectDescriptionCDescriptionTypeCMeaning_QNAME, String.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ProjectDescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectDescriptionCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ProjectDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<String> createNotesAdditionalDescriptionCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createNotesAdditionalDescriptionCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<Long> createNotesAdditionalDescriptionCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createNotesAdditionalDescriptionCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<String> createNotesAdditionalDescriptionCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<String> createNotesAdditionalDescriptionCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<String> createNotesAdditionalDescriptionCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<String> createNotesAdditionalDescriptionCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<Integer> createNotesAdditionalDescriptionCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<String> createNotesAdditionalDescriptionCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<Integer> createNotesAdditionalDescriptionCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<String> createNotesAdditionalDescriptionCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<String> createNotesAdditionalDescriptionCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<String> createNotesAdditionalDescriptionCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<BigDecimal> createNotesAdditionalDescriptionCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<BigDecimal> createNotesAdditionalDescriptionCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<String> createNotesAdditionalDescriptionCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = NotesAdditionalDescriptionC.class)
    public JAXBElement<XMLGregorianCalendar> createNotesAdditionalDescriptionCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, NotesAdditionalDescriptionC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ProjectNamesC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectNamesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ProjectNamesC.class)
    public JAXBElement<Long> createProjectNamesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ProjectNamesC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectNamesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectName4_c", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCProjectName4C(String value) {
        return new JAXBElement<String>(_ProjectNamesCProjectName4C_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectName3_c", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCProjectName3C(String value) {
        return new JAXBElement<String>(_ProjectNamesCProjectName3C_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ProjectNamesC.class)
    public JAXBElement<Integer> createProjectNamesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ProjectNamesC.class)
    public JAXBElement<Integer> createProjectNamesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectNames_c", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCProjectNamesC(String value) {
        return new JAXBElement<String>(_ProjectNamesCProjectNamesC_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectName2_c", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCProjectName2C(String value) {
        return new JAXBElement<String>(_ProjectNamesCProjectName2C_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectName5_c", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCProjectName5C(String value) {
        return new JAXBElement<String>(_ProjectNamesCProjectName5C_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ProjectNamesC.class)
    public JAXBElement<BigDecimal> createProjectNamesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = ProjectNamesC.class)
    public JAXBElement<BigDecimal> createProjectNamesCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ProjectNamesC.class)
    public JAXBElement<String> createProjectNamesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ProjectNamesC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectNamesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ProjectNamesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = TasksC.class)
    public JAXBElement<XMLGregorianCalendar> createTasksCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = TasksC.class)
    public JAXBElement<String> createTasksCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = TasksC.class)
    public JAXBElement<String> createTasksCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = TasksC.class, defaultValue = "Tasks_c")
    public JAXBElement<String> createTasksCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_ProjectsCAttachmentEntityName_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_c", scope = TasksC.class)
    public JAXBElement<String> createTasksCStatusC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusC_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = TasksC.class)
    public JAXBElement<String> createTasksCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = TasksC.class)
    public JAXBElement<Integer> createTasksCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_c", scope = TasksC.class)
    public JAXBElement<String> createTasksCProjectsC(String value) {
        return new JAXBElement<String>(_TasksCProjectsC_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TaskOwner_Id_c", scope = TasksC.class)
    public JAXBElement<BigDecimal> createTasksCTaskOwnerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TasksCTaskOwnerIdC_QNAME, BigDecimal.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = TasksC.class)
    public JAXBElement<BigDecimal> createTasksCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StartDate_c", scope = TasksC.class)
    public JAXBElement<XMLGregorianCalendar> createTasksCStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCStartDateC_QNAME, XMLGregorianCalendar.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = TasksC.class)
    public JAXBElement<Long> createTasksCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = TasksC.class)
    public JAXBElement<XMLGregorianCalendar> createTasksCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = TasksC.class)
    public JAXBElement<String> createTasksCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = TasksC.class)
    public JAXBElement<String> createTasksCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = TasksC.class)
    public JAXBElement<Integer> createTasksCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = TasksC.class)
    public JAXBElement<String> createTasksCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = TasksC.class)
    public JAXBElement<String> createTasksCPKProxy(String value) {
        return new JAXBElement<String>(_ProjectsCPKProxy_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = TasksC.class)
    public JAXBElement<byte[]> createTasksCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, TasksC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = TasksC.class)
    public JAXBElement<String> createTasksCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = TasksC.class, defaultValue = "Tasks_c")
    public JAXBElement<String> createTasksCSourceType(String value) {
        return new JAXBElement<String>(_ProjectsCSourceType_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TaskId_c", scope = TasksC.class)
    public JAXBElement<BigDecimal> createTasksCTaskIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TasksCTaskIdC_QNAME, BigDecimal.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndDate_c", scope = TasksC.class)
    public JAXBElement<XMLGregorianCalendar> createTasksCEndDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCEndDateC_QNAME, XMLGregorianCalendar.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = TasksC.class)
    public JAXBElement<String> createTasksCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_cMeaning", scope = TasksC.class)
    public JAXBElement<String> createTasksCStatusCMeaning(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusCMeaning_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = TasksC.class)
    public JAXBElement<String> createTasksCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = TasksC.class)
    public JAXBElement<BigDecimal> createTasksCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TaskOwner_c", scope = TasksC.class)
    public JAXBElement<String> createTasksCTaskOwnerC(String value) {
        return new JAXBElement<String>(_TasksCTaskOwnerC_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = TasksC.class)
    public JAXBElement<String> createTasksCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = TasksC.class)
    public JAXBElement<XMLGregorianCalendar> createTasksCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, TasksC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = MeasuresC.class)
    public JAXBElement<XMLGregorianCalendar> createMeasuresCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Descriptions_c", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCDescriptionsC(String value) {
        return new JAXBElement<String>(_MeasuresCDescriptionsC_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Amount_c", scope = MeasuresC.class)
    public JAXBElement<AmountType> createMeasuresCAmountC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCAmountC_QNAME, AmountType.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = MeasuresC.class)
    public JAXBElement<Integer> createMeasuresCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSectorDescription_c", scope = MeasuresC.class)
    public JAXBElement<byte[]> createMeasuresCMarketSectorDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCMarketSectorDescriptionC_QNAME, byte[].class, MeasuresC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Measures_cMeaning", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCMeasuresCMeaning(String value) {
        return new JAXBElement<String>(_MeasuresCMeasuresCMeaning_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_cMeaning", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCTypeCMeaning_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Measuress_cMeaning", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCMeasuressCMeaning(String value) {
        return new JAXBElement<String>(_MeasuresCMeasuressCMeaning_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = MeasuresC.class)
    public JAXBElement<BigDecimal> createMeasuresCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Measures_c", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCMeasuresC(String value) {
        return new JAXBElement<String>(_MeasuresCMeasuresC_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = MeasuresC.class)
    public JAXBElement<Long> createMeasuresCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = MeasuresC.class)
    public JAXBElement<XMLGregorianCalendar> createMeasuresCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Company_cMeaning", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCCompanyCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCCompanyCMeaning_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Measure_c", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCMeasureC(String value) {
        return new JAXBElement<String>(_MeasuresCMeasureC_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCContractIdC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCContractIdC_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractIds_c", scope = MeasuresC.class)
    public JAXBElement<BigDecimal> createMeasuresCContractIdsC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCContractIdsC_QNAME, BigDecimal.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = MeasuresC.class)
    public JAXBElement<Integer> createMeasuresCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MeasureDescription_c", scope = MeasuresC.class)
    public JAXBElement<byte[]> createMeasuresCMeasureDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_MeasuresCMeasureDescriptionC_QNAME, byte[].class, MeasuresC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = MeasuresC.class)
    public JAXBElement<byte[]> createMeasuresCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, MeasuresC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Company_c", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCCompanyC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCompanyC_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = MeasuresC.class)
    public JAXBElement<BigDecimal> createMeasuresCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = MeasuresC.class)
    public JAXBElement<XMLGregorianCalendar> createMeasuresCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Unit_c", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCUnitC(String value) {
        return new JAXBElement<String>(_MeasuresCUnitC_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_c", scope = MeasuresC.class)
    public JAXBElement<String> createMeasuresCTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCTypeC_QNAME, String.class, MeasuresC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = PrimaryCompanyC.class)
    public JAXBElement<XMLGregorianCalendar> createPrimaryCompanyCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Customer_Id_c", scope = PrimaryCompanyC.class)
    public JAXBElement<BigDecimal> createPrimaryCompanyCCustomerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OwnerCCustomerIdC_QNAME, BigDecimal.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_c", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCStatusC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusC_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = PrimaryCompanyC.class)
    public JAXBElement<Integer> createPrimaryCompanyCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "City_c", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCCityC(String value) {
        return new JAXBElement<String>(_ProjectsCCityC_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastCheked_c", scope = PrimaryCompanyC.class)
    public JAXBElement<XMLGregorianCalendar> createPrimaryCompanyCLastChekedC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrimaryCompanyCLastChekedC_QNAME, XMLGregorianCalendar.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Customer_c", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCCustomerC(String value) {
        return new JAXBElement<String>(_ProjectsCCustomerC_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = PrimaryCompanyC.class)
    public JAXBElement<BigDecimal> createPrimaryCompanyCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AddressNumber_c", scope = PrimaryCompanyC.class)
    public JAXBElement<BigDecimal> createPrimaryCompanyCAddressNumberC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PrimaryCompanyCAddressNumberC_QNAME, BigDecimal.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = PrimaryCompanyC.class)
    public JAXBElement<Long> createPrimaryCompanyCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = PrimaryCompanyC.class)
    public JAXBElement<XMLGregorianCalendar> createPrimaryCompanyCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Notes_c", scope = PrimaryCompanyC.class)
    public JAXBElement<byte[]> createPrimaryCompanyCNotesC(byte[] value) {
        return new JAXBElement<byte[]>(_ClientOwnerReferencesCNotesC_QNAME, byte[].class, PrimaryCompanyC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCContractIdC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCContractIdC_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = PrimaryCompanyC.class)
    public JAXBElement<Integer> createPrimaryCompanyCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryCompanyId_c", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCPrimaryCompanyIdC(String value) {
        return new JAXBElement<String>(_PrimaryCompanyCPrimaryCompanyIdC_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CheckedBy_c", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCCheckedByC(String value) {
        return new JAXBElement<String>(_PrimaryCompanyCCheckedByC_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = PrimaryCompanyC.class)
    public JAXBElement<byte[]> createPrimaryCompanyCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, PrimaryCompanyC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PostalCode_c", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCPostalCodeC(String value) {
        return new JAXBElement<String>(_ProjectsCPostalCodeC_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "State_c", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCStateC(String value) {
        return new JAXBElement<String>(_ProjectsCStateC_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_cMeaning", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCStatusCMeaning(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusCMeaning_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = PrimaryCompanyC.class)
    public JAXBElement<BigDecimal> createPrimaryCompanyCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = PrimaryCompanyC.class)
    public JAXBElement<String> createPrimaryCompanyCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Address_c", scope = PrimaryCompanyC.class)
    public JAXBElement<byte[]> createPrimaryCompanyCAddressC(byte[] value) {
        return new JAXBElement<byte[]>(_PrimaryCompanyCAddressC_QNAME, byte[].class, PrimaryCompanyC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = PrimaryCompanyC.class)
    public JAXBElement<XMLGregorianCalendar> createPrimaryCompanyCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, PrimaryCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AddressNumberDescripton_c", scope = PrimaryCompanyC.class)
    public JAXBElement<byte[]> createPrimaryCompanyCAddressNumberDescriptonC(byte[] value) {
        return new JAXBElement<byte[]>(_PrimaryCompanyCAddressNumberDescriptonC_QNAME, byte[].class, PrimaryCompanyC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Confidences_c", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCConfidencesC(String value) {
        return new JAXBElement<String>(_OpportunityForecastCConfidencesC_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = OpportunityForecastC.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityForecastCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectLocationCIsOwner_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionName_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Confidence_c", scope = OpportunityForecastC.class)
    public JAXBElement<BigDecimal> createOpportunityForecastCConfidenceC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityForecastCConfidenceC_QNAME, BigDecimal.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ForecastDate_c", scope = OpportunityForecastC.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityForecastCForecastDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityForecastCForecastDateC_QNAME, XMLGregorianCalendar.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Confidences_cMeaning", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCConfidencesCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityForecastCConfidencesCMeaning_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalGrossForecast_c", scope = OpportunityForecastC.class)
    public JAXBElement<AmountType> createOpportunityForecastCTotalGrossForecastC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityForecastCTotalGrossForecastC_QNAME, AmountType.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurcyConvRateType_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalNetForecast_c", scope = OpportunityForecastC.class)
    public JAXBElement<AmountType> createOpportunityForecastCTotalNetForecastC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityForecastCTotalNetForecastC_QNAME, AmountType.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = OpportunityForecastC.class)
    public JAXBElement<Integer> createOpportunityForecastCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerSor_QNAME, Integer.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "NetForecast_c", scope = OpportunityForecastC.class)
    public JAXBElement<AmountType> createOpportunityForecastCNetForecastC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityForecastCNetForecastC_QNAME, AmountType.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = OpportunityForecastC.class)
    public JAXBElement<BigDecimal> createOpportunityForecastCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCOpportunityVOIdC_QNAME, BigDecimal.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessClass_cMeaning", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCBusinessClassCMeaning(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessClassCMeaning_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "GrossForecast_c", scope = OpportunityForecastC.class)
    public JAXBElement<AmountType> createOpportunityForecastCGrossForecastC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityForecastCGrossForecastC_QNAME, AmountType.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessGroup_c", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCBusinessGroupC(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessGroupC_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = OpportunityForecastC.class)
    public JAXBElement<Long> createOpportunityForecastCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectLocationCRequestId_QNAME, Long.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityForecastC.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityForecastCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments_c", scope = OpportunityForecastC.class)
    public JAXBElement<byte[]> createOpportunityForecastCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_ApproversCCommentsC_QNAME, byte[].class, OpportunityForecastC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionPackage_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCorpCurrencyCode_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = OpportunityForecastC.class)
    public JAXBElement<Integer> createOpportunityForecastCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerPillar_QNAME, Integer.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCCreatedBy_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdateLogin_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_cMeaning", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessUnitCMeaning_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessClass_c", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCBusinessClassC(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessClassC_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdatedBy_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessGroup_cMeaning", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCBusinessGroupCMeaning(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessGroupCMeaning_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = OpportunityForecastC.class)
    public JAXBElement<BigDecimal> createOpportunityForecastCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCObjectVersionNumber_QNAME, BigDecimal.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurrencyCode_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = OpportunityForecastC.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityForecastCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCCreationDate_QNAME, XMLGregorianCalendar.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectLocationCCpdrfLastUpd_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = CostsFeesC.class)
    public JAXBElement<XMLGregorianCalendar> createCostsFeesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Currency_c", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCCurrencyC(String value) {
        return new JAXBElement<String>(_ProjectsCCurrencyC_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Descriptions_cMeaning", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCDescriptionsCMeaning(String value) {
        return new JAXBElement<String>(_CostsFeesCDescriptionsCMeaning_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedTotalProjectCostUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCEstimatedTotalProjectCostUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCEstimatedTotalProjectCostUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Amount_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCAmountC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCAmountC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Currency_cMeaning", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCCurrencyCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCCurrencyCMeaning_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedNetFeeUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCEstimatedNetFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCEstimatedNetFeeUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedSubConsultantFeeUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCEstimatedSubConsultantFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCEstimatedSubConsultantFeeUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = CostsFeesC.class)
    public JAXBElement<Integer> createCostsFeesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Descriptionss_c", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCDescriptionssC(String value) {
        return new JAXBElement<String>(_CostsFeesCDescriptionssC_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualConstructionCostUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCActualConstructionCostUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualConstructionCostUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractDescription_c", scope = CostsFeesC.class)
    public JAXBElement<byte[]> createCostsFeesCContractDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCContractDescriptionC_QNAME, byte[].class, CostsFeesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Currencys_c", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCCurrencysC(String value) {
        return new JAXBElement<String>(_CostsFeesCCurrencysC_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = CostsFeesC.class)
    public JAXBElement<BigDecimal> createCostsFeesCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedGrossFeeUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCEstimatedGrossFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCEstimatedGrossFeeUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ConstructionBidUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCConstructionBidUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCConstructionBidUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualNetFeeUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCActualNetFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualNetFeeUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = CostsFeesC.class)
    public JAXBElement<Long> createCostsFeesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = CostsFeesC.class)
    public JAXBElement<XMLGregorianCalendar> createCostsFeesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCContractIdC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCContractIdC_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualSubConsultantFeeUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCActualSubConsultantFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualSubConsultantFeeUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Comments_c", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCCommentsC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCommentsC_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = CostsFeesC.class)
    public JAXBElement<Integer> createCostsFeesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EstimatedConstructionCostUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCEstimatedConstructionCostUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCEstimatedConstructionCostUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualTotalProjectCostUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCActualTotalProjectCostUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualTotalProjectCostUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = CostsFeesC.class)
    public JAXBElement<byte[]> createCostsFeesCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, CostsFeesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualGrossFeeUSD_c", scope = CostsFeesC.class)
    public JAXBElement<AmountType> createCostsFeesCActualGrossFeeUSDC(AmountType value) {
        return new JAXBElement<AmountType>(_ProjectsCActualGrossFeeUSDC_QNAME, AmountType.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = CostsFeesC.class)
    public JAXBElement<BigDecimal> createCostsFeesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = CostsFeesC.class)
    public JAXBElement<XMLGregorianCalendar> createCostsFeesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CostFeeId_c", scope = CostsFeesC.class)
    public JAXBElement<String> createCostsFeesCCostFeeIdC(String value) {
        return new JAXBElement<String>(_CostsFeesCCostFeeIdC_QNAME, String.class, CostsFeesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = EmployeessC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeessCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCLastUpdateDate_QNAME, XMLGregorianCalendar.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectLocationCIsOwner_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionName_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BackEndCountForEmail_c", scope = EmployeessC.class)
    public JAXBElement<BigDecimal> createEmployeessCBackEndCountForEmailC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_EmployeessCBackEndCountForEmailC_QNAME, BigDecimal.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurcyConvRateType_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = EmployeessC.class)
    public JAXBElement<Integer> createEmployeessCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerSor_QNAME, Integer.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Title_c", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCTitleC(String value) {
        return new JAXBElement<String>(_ApproversCTitleC_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = EmployeessC.class)
    public JAXBElement<BigDecimal> createEmployeessCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCOpportunityVOIdC_QNAME, BigDecimal.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Department_c", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCDepartmentC(String value) {
        return new JAXBElement<String>(_EmployeessCDepartmentC_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastName_c", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCLastNameC(String value) {
        return new JAXBElement<String>(_EmployeessCLastNameC_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = EmployeessC.class)
    public JAXBElement<Long> createEmployeessCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectLocationCRequestId_QNAME, Long.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = EmployeessC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeessCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectLocationCJobDefinitionPackage_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCorpCurrencyCode_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = EmployeessC.class)
    public JAXBElement<Integer> createEmployeessCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectLocationCCpdrfVerPillar_QNAME, Integer.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCCreatedBy_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_c", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCBusinessUnitC(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessUnitC_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Role_cMeaning", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCRoleCMeaning(String value) {
        return new JAXBElement<String>(_PartnersJointBidsCRoleCMeaning_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdateLogin_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Department_cMeaning", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCDepartmentCMeaning(String value) {
        return new JAXBElement<String>(_EmployeessCDepartmentCMeaning_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_cMeaning", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessUnitCMeaning_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectLocationCLastUpdatedBy_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = EmployeessC.class)
    public JAXBElement<BigDecimal> createEmployeessCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectLocationCObjectVersionNumber_QNAME, BigDecimal.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress_c", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCEmailAddressC(String value) {
        return new JAXBElement<String>(_EmployeessCEmailAddressC_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectLocationCCurrencyCode_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = EmployeessC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeessCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectLocationCCreationDate_QNAME, XMLGregorianCalendar.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectLocationCCpdrfLastUpd_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ContractC.class)
    public JAXBElement<XMLGregorianCalendar> createContractCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractProject_c", scope = ContractC.class)
    public JAXBElement<String> createContractCContractProjectC(String value) {
        return new JAXBElement<String>(_ProjectsCContractProjectC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MasterContract_c", scope = ContractC.class)
    public JAXBElement<String> createContractCMasterContractC(String value) {
        return new JAXBElement<String>(_ContractCMasterContractC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = ContractC.class, defaultValue = "Contract_c")
    public JAXBElement<String> createContractCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_ProjectsCAttachmentEntityName_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ContractC.class)
    public JAXBElement<String> createContractCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NAICSS_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCNAICSSC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContractCNAICSSC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectManager_c", scope = ContractC.class)
    public JAXBElement<String> createContractCProjectManagerC(String value) {
        return new JAXBElement<String>(_ContractCProjectManagerC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ContractC.class)
    public JAXBElement<String> createContractCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MasterContract_Id_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCMasterContractIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContractCMasterContractIdC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDRCompanies_Id_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCHDRCompaniesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContractCHDRCompaniesIdC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EBSIDContract_c", scope = ContractC.class)
    public JAXBElement<String> createContractCEBSIDContractC(String value) {
        return new JAXBElement<String>(_ContractCEBSIDContractC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Opportunity_Id_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCOpportunityIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContractCOpportunityIdC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryCompany_c", scope = ContractC.class)
    public JAXBElement<String> createContractCPrimaryCompanyC(String value) {
        return new JAXBElement<String>(_ProjectsCPrimaryCompanyC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ContractC.class)
    public JAXBElement<Integer> createContractCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractStatus_c", scope = ContractC.class)
    public JAXBElement<String> createContractCContractStatusC(String value) {
        return new JAXBElement<String>(_ProjectsCContractStatusC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TotalValueOfAllOpenOpportuniti_c", scope = ContractC.class)
    public JAXBElement<AmountType> createContractCTotalValueOfAllOpenOpportunitiC(AmountType value) {
        return new JAXBElement<AmountType>(_ContractCTotalValueOfAllOpenOpportunitiC_QNAME, AmountType.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TotalContractCapacity_c", scope = ContractC.class)
    public JAXBElement<AmountType> createContractCTotalContractCapacityC(AmountType value) {
        return new JAXBElement<AmountType>(_ContractCTotalContractCapacityC_QNAME, AmountType.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractName_c", scope = ContractC.class)
    public JAXBElement<String> createContractCContractNameC(String value) {
        return new JAXBElement<String>(_ProjectsCContractNameC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ParentCompany_c", scope = ContractC.class)
    public JAXBElement<String> createContractCParentCompanyC(String value) {
        return new JAXBElement<String>(_ContractCParentCompanyC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractProject_Id_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCContractProjectIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCContractProjectIdC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ParentAccount_c", scope = ContractC.class)
    public JAXBElement<String> createContractCParentAccountC(String value) {
        return new JAXBElement<String>(_ContractCParentAccountC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDRRole_c", scope = ContractC.class)
    public JAXBElement<String> createContractCHDRRoleC(String value) {
        return new JAXBElement<String>(_ProjectsCHDRRoleC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AreaOfReach_c", scope = ContractC.class)
    public JAXBElement<String> createContractCAreaOfReachC(String value) {
        return new JAXBElement<String>(_ContractCAreaOfReachC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDRPotentialCapacityGross_c", scope = ContractC.class)
    public JAXBElement<AmountType> createContractCHDRPotentialCapacityGrossC(AmountType value) {
        return new JAXBElement<AmountType>(_ContractCHDRPotentialCapacityGrossC_QNAME, AmountType.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ReportingMasterContract_c", scope = ContractC.class)
    public JAXBElement<String> createContractCReportingMasterContractC(String value) {
        return new JAXBElement<String>(_ContractCReportingMasterContractC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FirmsAwarded_c", scope = ContractC.class)
    public JAXBElement<String> createContractCFirmsAwardedC(String value) {
        return new JAXBElement<String>(_ContractCFirmsAwardedC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ParentCompany_Id_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCParentCompanyIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContractCParentCompanyIdC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CustomerDetails_c", scope = ContractC.class)
    public JAXBElement<byte[]> createContractCCustomerDetailsC(byte[] value) {
        return new JAXBElement<byte[]>(_ContractCCustomerDetailsC_QNAME, byte[].class, ContractC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDRCompany_c", scope = ContractC.class)
    public JAXBElement<String> createContractCHDRCompanyC(String value) {
        return new JAXBElement<String>(_ContractCHDRCompanyC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ContractC.class)
    public JAXBElement<Long> createContractCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCContractIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCContractIdC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TotalRemainingPotentialCapacit_c", scope = ContractC.class)
    public JAXBElement<AmountType> createContractCTotalRemainingPotentialCapacitC(AmountType value) {
        return new JAXBElement<AmountType>(_ContractCTotalRemainingPotentialCapacitC_QNAME, AmountType.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TotalContractValueToDateGross_c", scope = ContractC.class)
    public JAXBElement<AmountType> createContractCTotalContractValueToDateGrossC(AmountType value) {
        return new JAXBElement<AmountType>(_ContractCTotalContractValueToDateGrossC_QNAME, AmountType.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ContractC.class)
    public JAXBElement<Integer> createContractCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDRPotentialCapacityNet_c", scope = ContractC.class)
    public JAXBElement<AmountType> createContractCHDRPotentialCapacityNetC(AmountType value) {
        return new JAXBElement<AmountType>(_ContractCHDRPotentialCapacityNetC_QNAME, AmountType.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = ContractC.class)
    public JAXBElement<String> createContractCPKProxy(String value) {
        return new JAXBElement<String>(_ProjectsCPKProxy_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MasterOpportunityID_c", scope = ContractC.class)
    public JAXBElement<String> createContractCMasterOpportunityIDC(String value) {
        return new JAXBElement<String>(_ContractCMasterOpportunityIDC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FederalContractNumber_c", scope = ContractC.class)
    public JAXBElement<String> createContractCFederalContractNumberC(String value) {
        return new JAXBElement<String>(_ProjectsCFederalContractNumberC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSectos_c", scope = ContractC.class)
    public JAXBElement<String> createContractCMarketSectosC(String value) {
        return new JAXBElement<String>(_ContractCMarketSectosC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractType_c", scope = ContractC.class)
    public JAXBElement<String> createContractCContractTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCContractTypeC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndDate_c", scope = ContractC.class)
    public JAXBElement<XMLGregorianCalendar> createContractCEndDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCEndDateC_QNAME, XMLGregorianCalendar.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ContractC.class)
    public JAXBElement<String> createContractCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FirmsAwardeds_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCFirmsAwardedsC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContractCFirmsAwardedsC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "GeographicReach_c", scope = ContractC.class)
    public JAXBElement<String> createContractCGeographicReachC(String value) {
        return new JAXBElement<String>(_ContractCGeographicReachC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillableCompany_c", scope = ContractC.class)
    public JAXBElement<String> createContractCBillableCompanyC(String value) {
        return new JAXBElement<String>(_ProjectsCBillableCompanyC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSector_c", scope = ContractC.class)
    public JAXBElement<String> createContractCMarketSectorC(String value) {
        return new JAXBElement<String>(_ProjectsCMarketSectorC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ContractC.class)
    public JAXBElement<String> createContractCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Currency1_c", scope = ContractC.class)
    public JAXBElement<String> createContractCCurrency1C(String value) {
        return new JAXBElement<String>(_ProjectsCCurrency1C_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_c", scope = ContractC.class)
    public JAXBElement<String> createContractCStatusC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDR_c", scope = ContractC.class)
    public JAXBElement<String> createContractCHDRC(String value) {
        return new JAXBElement<String>(_ContractCHDRC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractIDS_c", scope = ContractC.class)
    public JAXBElement<String> createContractCContractIDSC(String value) {
        return new JAXBElement<String>(_ContractCContractIDSC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackendEmail_c", scope = ContractC.class)
    public JAXBElement<String> createContractCBackendEmailC(String value) {
        return new JAXBElement<String>(_ClientOwnerReferencesCBackendEmailC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "EndDated_c", scope = ContractC.class)
    public JAXBElement<XMLGregorianCalendar> createContractCEndDatedC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ContractCEndDatedC_QNAME, XMLGregorianCalendar.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClasses_c", scope = ContractC.class)
    public JAXBElement<String> createContractCBusinessClassesC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassesC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillableAccountForReporting_c", scope = ContractC.class)
    public JAXBElement<String> createContractCBillableAccountForReportingC(String value) {
        return new JAXBElement<String>(_ContractCBillableAccountForReportingC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectManager_Id_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCProjectManagerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContractCProjectManagerIdC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NAICS_c", scope = ContractC.class)
    public JAXBElement<String> createContractCNAICSC(String value) {
        return new JAXBElement<String>(_ContractCNAICSC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ParentCompanies_c", scope = ContractC.class)
    public JAXBElement<String> createContractCParentCompaniesC(String value) {
        return new JAXBElement<String>(_ContractCParentCompaniesC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StartDate_c", scope = ContractC.class)
    public JAXBElement<XMLGregorianCalendar> createContractCStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCStartDateC_QNAME, XMLGregorianCalendar.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Probability_c", scope = ContractC.class)
    public JAXBElement<String> createContractCProbabilityC(String value) {
        return new JAXBElement<String>(_ContractCProbabilityC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NAICSCode_c", scope = ContractC.class)
    public JAXBElement<String> createContractCNAICSCodeC(String value) {
        return new JAXBElement<String>(_ContractCNAICSCodeC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryAccountForReporting_c", scope = ContractC.class)
    public JAXBElement<String> createContractCPrimaryAccountForReportingC(String value) {
        return new JAXBElement<String>(_ContractCPrimaryAccountForReportingC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ContractC.class)
    public JAXBElement<XMLGregorianCalendar> createContractCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Stage_c", scope = ContractC.class)
    public JAXBElement<String> createContractCStageC(String value) {
        return new JAXBElement<String>(_ContractCStageC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractManager_c", scope = ContractC.class)
    public JAXBElement<String> createContractCContractManagerC(String value) {
        return new JAXBElement<String>(_ContractCContractManagerC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Fee_c", scope = ContractC.class)
    public JAXBElement<AmountType> createContractCFeeC(AmountType value) {
        return new JAXBElement<AmountType>(_ContractCFeeC_QNAME, AmountType.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "OpportunityNameForReporting_c", scope = ContractC.class)
    public JAXBElement<String> createContractCOpportunityNameForReportingC(String value) {
        return new JAXBElement<String>(_ContractCOpportunityNameForReportingC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ContractC.class)
    public JAXBElement<String> createContractCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractNumber_c", scope = ContractC.class)
    public JAXBElement<String> createContractCContractNumberC(String value) {
        return new JAXBElement<String>(_ContractCContractNumberC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ContractC.class)
    public JAXBElement<String> createContractCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Comments_c", scope = ContractC.class)
    public JAXBElement<byte[]> createContractCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCCommentsC_QNAME, byte[].class, ContractC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ContractC.class)
    public JAXBElement<String> createContractCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractAwardTypes_c", scope = ContractC.class)
    public JAXBElement<String> createContractCContractAwardTypesC(String value) {
        return new JAXBElement<String>(_ContractCContractAwardTypesC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillableCompany_Id_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCBillableCompanyIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCBillableCompanyIdC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackendContractManagerEmailAdd_c", scope = ContractC.class)
    public JAXBElement<String> createContractCBackendContractManagerEmailAddC(String value) {
        return new JAXBElement<String>(_ContractCBackendContractManagerEmailAddC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NAICSDescription_c", scope = ContractC.class)
    public JAXBElement<byte[]> createContractCNAICSDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ContractCNAICSDescriptionC_QNAME, byte[].class, ContractC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TotalRemainingCapacity_c", scope = ContractC.class)
    public JAXBElement<AmountType> createContractCTotalRemainingCapacityC(AmountType value) {
        return new JAXBElement<AmountType>(_ContractCTotalRemainingCapacityC_QNAME, AmountType.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ContractC.class)
    public JAXBElement<String> createContractCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "X_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCXC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ContractCXC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractAwardType_c", scope = ContractC.class)
    public JAXBElement<String> createContractCContractAwardTypeC(String value) {
        return new JAXBElement<String>(_ContractCContractAwardTypeC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = ContractC.class, defaultValue = "Contract_c")
    public JAXBElement<String> createContractCSourceType(String value) {
        return new JAXBElement<String>(_ProjectsCSourceType_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HDRCompanies_c", scope = ContractC.class)
    public JAXBElement<String> createContractCHDRCompaniesC(String value) {
        return new JAXBElement<String>(_ContractCHDRCompaniesC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClass_c", scope = ContractC.class)
    public JAXBElement<String> createContractCBusinessClassC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractLegacySystemID_c", scope = ContractC.class)
    public JAXBElement<String> createContractCContractLegacySystemIDC(String value) {
        return new JAXBElement<String>(_ContractCContractLegacySystemIDC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryCompany_Id_c", scope = ContractC.class)
    public JAXBElement<BigDecimal> createContractCPrimaryCompanyIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCPrimaryCompanyIdC_QNAME, BigDecimal.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ContractC.class)
    public JAXBElement<String> createContractCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Opportunity_c", scope = ContractC.class)
    public JAXBElement<String> createContractCOpportunityC(String value) {
        return new JAXBElement<String>(_ContractCOpportunityC_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ContractC.class)
    public JAXBElement<String> createContractCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ContractC.class)
    public JAXBElement<XMLGregorianCalendar> createContractCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ContractC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = IndustryAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createIndustryAwardsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Organizations_c", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCOrganizationsC(String value) {
        return new JAXBElement<String>(_IndustryAwardsCOrganizationsC_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = IndustryAwardsC.class)
    public JAXBElement<Integer> createIndustryAwardsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Organization_c", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCOrganizationC(String value) {
        return new JAXBElement<String>(_IndustryAwardsCOrganizationC_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DateYear_c", scope = IndustryAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createIndustryAwardsCDateYearC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivitiesCDateYearC_QNAME, XMLGregorianCalendar.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Organization_Id_c", scope = IndustryAwardsC.class)
    public JAXBElement<BigDecimal> createIndustryAwardsCOrganizationIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IndustryAwardsCOrganizationIdC_QNAME, BigDecimal.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Sponsor_c", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCSponsorC(String value) {
        return new JAXBElement<String>(_IndustryAwardsCSponsorC_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Project_c", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCProjectC(String value) {
        return new JAXBElement<String>(_IndustryAwardsCProjectC_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StartDate_c", scope = IndustryAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createIndustryAwardsCStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PastEmploymentCStartDateC_QNAME, XMLGregorianCalendar.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Project_Id_c", scope = IndustryAwardsC.class)
    public JAXBElement<BigDecimal> createIndustryAwardsCProjectIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_IndustryAwardsCProjectIdC_QNAME, BigDecimal.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = IndustryAwardsC.class)
    public JAXBElement<Long> createIndustryAwardsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = IndustryAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createIndustryAwardsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = IndustryAwardsC.class)
    public JAXBElement<BigDecimal> createIndustryAwardsCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Comments_c", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCCommentsC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCommentsC_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = IndustryAwardsC.class)
    public JAXBElement<Integer> createIndustryAwardsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Year_c", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCYearC(String value) {
        return new JAXBElement<String>(_PublicationsCYearC_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Year_cMeaning", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCYearCMeaning(String value) {
        return new JAXBElement<String>(_PresentationsCYearCMeaning_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = IndustryAwardsC.class)
    public JAXBElement<BigDecimal> createIndustryAwardsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = IndustryAwardsC.class)
    public JAXBElement<String> createIndustryAwardsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = IndustryAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createIndustryAwardsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, IndustryAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = BillableCompanyC.class)
    public JAXBElement<XMLGregorianCalendar> createBillableCompanyCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Customer_Id_c", scope = BillableCompanyC.class)
    public JAXBElement<BigDecimal> createBillableCompanyCCustomerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OwnerCCustomerIdC_QNAME, BigDecimal.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_c", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCStatusC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusC_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "City_c", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCCityC(String value) {
        return new JAXBElement<String>(_ProjectsCCityC_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = BillableCompanyC.class)
    public JAXBElement<Integer> createBillableCompanyCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Customers_c", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCCustomersC(String value) {
        return new JAXBElement<String>(_BillableCompanyCCustomersC_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastCheked_c", scope = BillableCompanyC.class)
    public JAXBElement<XMLGregorianCalendar> createBillableCompanyCLastChekedC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_PrimaryCompanyCLastChekedC_QNAME, XMLGregorianCalendar.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CompanyId_c", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCCompanyIdC(String value) {
        return new JAXBElement<String>(_BillableCompanyCCompanyIdC_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Customer_c", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCCustomerC(String value) {
        return new JAXBElement<String>(_ProjectsCCustomerC_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = BillableCompanyC.class)
    public JAXBElement<BigDecimal> createBillableCompanyCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AddressNumber_c", scope = BillableCompanyC.class)
    public JAXBElement<BigDecimal> createBillableCompanyCAddressNumberC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PrimaryCompanyCAddressNumberC_QNAME, BigDecimal.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = BillableCompanyC.class)
    public JAXBElement<Long> createBillableCompanyCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = BillableCompanyC.class)
    public JAXBElement<XMLGregorianCalendar> createBillableCompanyCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Notes_c", scope = BillableCompanyC.class)
    public JAXBElement<byte[]> createBillableCompanyCNotesC(byte[] value) {
        return new JAXBElement<byte[]>(_ClientOwnerReferencesCNotesC_QNAME, byte[].class, BillableCompanyC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCContractIdC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCContractIdC_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = BillableCompanyC.class)
    public JAXBElement<Integer> createBillableCompanyCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillableCompany_Id_c", scope = BillableCompanyC.class)
    public JAXBElement<BigDecimal> createBillableCompanyCBillableCompanyIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectsCBillableCompanyIdC_QNAME, BigDecimal.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CheckedBy_c", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCCheckedByC(String value) {
        return new JAXBElement<String>(_PrimaryCompanyCCheckedByC_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = BillableCompanyC.class)
    public JAXBElement<byte[]> createBillableCompanyCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, BillableCompanyC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PostalCode_c", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCPostalCodeC(String value) {
        return new JAXBElement<String>(_ProjectsCPostalCodeC_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "State_c", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCStateC(String value) {
        return new JAXBElement<String>(_ProjectsCStateC_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Status_cMeaning", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCStatusCMeaning(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCStatusCMeaning_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = BillableCompanyC.class)
    public JAXBElement<BigDecimal> createBillableCompanyCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BillableCompany_c", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCBillableCompanyC(String value) {
        return new JAXBElement<String>(_ProjectsCBillableCompanyC_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = BillableCompanyC.class)
    public JAXBElement<String> createBillableCompanyCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Address_c", scope = BillableCompanyC.class)
    public JAXBElement<byte[]> createBillableCompanyCAddressC(byte[] value) {
        return new JAXBElement<byte[]>(_PrimaryCompanyCAddressC_QNAME, byte[].class, BillableCompanyC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = BillableCompanyC.class)
    public JAXBElement<XMLGregorianCalendar> createBillableCompanyCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, BillableCompanyC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = ProjectServicesC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectServicesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubComponents_c", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCSubComponentsC(String value) {
        return new JAXBElement<String>(_ProjectsCSubComponentsC_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Components_cMeaning", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCComponentsCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCComponentsCMeaning_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = ProjectServicesC.class)
    public JAXBElement<Integer> createProjectServicesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = ProjectServicesC.class)
    public JAXBElement<BigDecimal> createProjectServicesCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessGroup_c", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCBusinessGroupC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessGroupC_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClass_cMeaning", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCBusinessClassCMeaning(String value) {
        return new JAXBElement<String>(_ProjectServicesCBusinessClassCMeaning_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = ProjectServicesC.class)
    public JAXBElement<Long> createProjectServicesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = ProjectServicesC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectServicesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = ProjectServicesC.class)
    public JAXBElement<Integer> createProjectServicesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSector_cMeaning", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCMarketSectorCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCMarketSectorCMeaning_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Components_c", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCComponentsC(String value) {
        return new JAXBElement<String>(_ProjectsCComponentsC_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceTypes_c", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCServiceTypesC(String value) {
        return new JAXBElement<String>(_ProjectServicesCServiceTypesC_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessGroup_cMeaning", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCBusinessGroupCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessGroupCMeaning_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BusinessClass_c", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCBusinessClassC(String value) {
        return new JAXBElement<String>(_ProjectsCBusinessClassC_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = ProjectServicesC.class)
    public JAXBElement<BigDecimal> createProjectServicesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSector_c", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCMarketSectorC(String value) {
        return new JAXBElement<String>(_ProjectsCMarketSectorC_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = ProjectServicesC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectServicesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceTypes_cMeaning", scope = ProjectServicesC.class)
    public JAXBElement<String> createProjectServicesCServiceTypesCMeaning(String value) {
        return new JAXBElement<String>(_ProjectServicesCServiceTypesCMeaning_QNAME, String.class, ProjectServicesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = AdditionalProjectsC.class)
    public JAXBElement<Long> createAdditionalProjectsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Country_c", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCCountryC(String value) {
        return new JAXBElement<String>(_ProjectsCCountryC_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = AdditionalProjectsC.class)
    public JAXBElement<XMLGregorianCalendar> createAdditionalProjectsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Descriptions_c", scope = AdditionalProjectsC.class)
    public JAXBElement<byte[]> createAdditionalProjectsCDescriptionsC(byte[] value) {
        return new JAXBElement<byte[]>(_MeasuresCDescriptionsC_QNAME, byte[].class, AdditionalProjectsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = AdditionalProjectsC.class)
    public JAXBElement<BigDecimal> createAdditionalProjectsCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectRole_c", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCProjectRoleC(String value) {
        return new JAXBElement<String>(_ProjectTeamCProjectRoleC_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = AdditionalProjectsC.class)
    public JAXBElement<Integer> createAdditionalProjectsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = AdditionalProjectsC.class)
    public JAXBElement<Integer> createAdditionalProjectsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCDescriptionC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCDescriptionC_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = AdditionalProjectsC.class)
    public JAXBElement<BigDecimal> createAdditionalProjectsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Location_c", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCLocationC(String value) {
        return new JAXBElement<String>(_ProjectsCLocationC_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = AdditionalProjectsC.class)
    public JAXBElement<String> createAdditionalProjectsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, AdditionalProjectsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = DatesMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createDatesMilestonesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualCompletionDate_c", scope = DatesMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createDatesMilestonesCActualCompletionDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatesMilestonesCActualCompletionDateC_QNAME, XMLGregorianCalendar.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FirstActivityDate_c", scope = DatesMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createDatesMilestonesCFirstActivityDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCFirstActivityDateC_QNAME, XMLGregorianCalendar.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Descriptions_c", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCDescriptionsC(String value) {
        return new JAXBElement<String>(_MeasuresCDescriptionsC_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Currencu_c", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCCurrencuC(String value) {
        return new JAXBElement<String>(_DatesMilestonesCCurrencuC_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = DatesMilestonesC.class)
    public JAXBElement<Integer> createDatesMilestonesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Contract_c", scope = DatesMilestonesC.class)
    public JAXBElement<BigDecimal> createDatesMilestonesCContractC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_DatesMilestonesCContractC_QNAME, BigDecimal.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ActualStartDate_c", scope = DatesMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createDatesMilestonesCActualStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCActualStartDateC_QNAME, XMLGregorianCalendar.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = DatesMilestonesC.class)
    public JAXBElement<BigDecimal> createDatesMilestonesCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = DatesMilestonesC.class)
    public JAXBElement<Long> createDatesMilestonesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = DatesMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createDatesMilestonesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCContractIdC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCContractIdC_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Datesmmyyyy_c", scope = DatesMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createDatesMilestonesCDatesmmyyyyC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DatesMilestonesCDatesmmyyyyC_QNAME, XMLGregorianCalendar.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Milestones_c", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCMilestonesC(String value) {
        return new JAXBElement<String>(_DatesMilestonesCMilestonesC_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Comments_c", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCCommentsC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCommentsC_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = DatesMilestonesC.class)
    public JAXBElement<Integer> createDatesMilestonesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Date_c", scope = DatesMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createDatesMilestonesCDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcademicHonorsAndResearchCDateC_QNAME, XMLGregorianCalendar.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Currencu_cMeaning", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCCurrencuCMeaning(String value) {
        return new JAXBElement<String>(_DatesMilestonesCCurrencuCMeaning_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = DatesMilestonesC.class)
    public JAXBElement<byte[]> createDatesMilestonesCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, DatesMilestonesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastActivityDate_c", scope = DatesMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createDatesMilestonesCLastActivityDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCLastActivityDateC_QNAME, XMLGregorianCalendar.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Additional_Description_cMeaning", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCAdditionalDescriptionCMeaning(String value) {
        return new JAXBElement<String>(_DatesMilestonesCAdditionalDescriptionCMeaning_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = DatesMilestonesC.class)
    public JAXBElement<BigDecimal> createDatesMilestonesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DoNotUse_c", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCDoNotUseC(String value) {
        return new JAXBElement<String>(_LocationCDoNotUseC_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = DatesMilestonesC.class)
    public JAXBElement<String> createDatesMilestonesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NoticeToProceed_c", scope = DatesMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createDatesMilestonesCNoticeToProceedC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectsCNoticeToProceedC_QNAME, XMLGregorianCalendar.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = DatesMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createDatesMilestonesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, DatesMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MilestoneDescription_c", scope = DatesMilestonesC.class)
    public JAXBElement<byte[]> createDatesMilestonesCMilestoneDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_DatesMilestonesCMilestoneDescriptionC_QNAME, byte[].class, DatesMilestonesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = TrainingC.class)
    public JAXBElement<XMLGregorianCalendar> createTrainingCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ExpirationDate_c", scope = TrainingC.class)
    public JAXBElement<XMLGregorianCalendar> createTrainingCExpirationDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TrainingCExpirationDateC_QNAME, XMLGregorianCalendar.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = TrainingC.class)
    public JAXBElement<Long> createTrainingCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = TrainingC.class)
    public JAXBElement<XMLGregorianCalendar> createTrainingCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = TrainingC.class)
    public JAXBElement<BigDecimal> createTrainingCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TrainingTypeCode_c", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCTrainingTypeCodeC(String value) {
        return new JAXBElement<String>(_TrainingCTrainingTypeCodeC_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = TrainingC.class)
    public JAXBElement<Integer> createTrainingCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Date_c", scope = TrainingC.class)
    public JAXBElement<XMLGregorianCalendar> createTrainingCDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcademicHonorsAndResearchCDateC_QNAME, XMLGregorianCalendar.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TrainingDescription_c", scope = TrainingC.class)
    public JAXBElement<byte[]> createTrainingCTrainingDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_TrainingCTrainingDescriptionC_QNAME, byte[].class, TrainingC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = TrainingC.class)
    public JAXBElement<Integer> createTrainingCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = TrainingC.class)
    public JAXBElement<BigDecimal> createTrainingCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Provider_c", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCProviderC(String value) {
        return new JAXBElement<String>(_TrainingCProviderC_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = TrainingC.class)
    public JAXBElement<String> createTrainingCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = TrainingC.class)
    public JAXBElement<XMLGregorianCalendar> createTrainingCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, TrainingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = FacilityTypesC.class)
    public JAXBElement<XMLGregorianCalendar> createFacilityTypesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SpaceComponents1_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCSpaceComponents1C(String value) {
        return new JAXBElement<String>(_FacilityTypesCSpaceComponents1C_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalBusinessClasse_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCAdditionalBusinessClasseC(String value) {
        return new JAXBElement<String>(_FacilityTypesCAdditionalBusinessClasseC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FacilityType_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCFacilityTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCFacilityTypeCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SustainableComponents_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCSustainableComponentsC(String value) {
        return new JAXBElement<String>(_FacilityTypesCSustainableComponentsC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Component_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCComponentC(String value) {
        return new JAXBElement<String>(_ProjectsCComponentC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = FacilityTypesC.class)
    public JAXBElement<Integer> createFacilityTypesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Component_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCComponentCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCComponentCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "MarketSectorDescription_c", scope = FacilityTypesC.class)
    public JAXBElement<byte[]> createFacilityTypesCMarketSectorDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectsCMarketSectorDescriptionC_QNAME, byte[].class, FacilityTypesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceAreaFacilityType_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCServiceAreaFacilityTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCServiceAreaFacilityTypeCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubComponent_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCSubComponentCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSubComponentCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectType_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCProjectTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCProjectTypeCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ResearchType_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCResearchTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCResearchTypeCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ResearchType_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCResearchTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCResearchTypeC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = FacilityTypesC.class)
    public JAXBElement<Long> createFacilityTypesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProfessionalServices_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCProfessionalServicesCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCProfessionalServicesCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryBusinessGroupFromContra_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCPrimaryBusinessGroupFromContraCMeaning(String value) {
        return new JAXBElement<String>(_FacilityTypesCPrimaryBusinessGroupFromContraCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ContractId_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCContractIdC(String value) {
        return new JAXBElement<String>(_ProjectAwardsCContractIdC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FacilityTypes_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCFacilityTypesCMeaning(String value) {
        return new JAXBElement<String>(_FacilityTypesCFacilityTypesCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SpaceComponents_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCSpaceComponentsC(String value) {
        return new JAXBElement<String>(_ProjectsCSpaceComponentsC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SustainableComponents_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCSustainableComponentsCMeaning(String value) {
        return new JAXBElement<String>(_FacilityTypesCSustainableComponentsCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = FacilityTypesC.class)
    public JAXBElement<Integer> createFacilityTypesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryBusinessGroupFromContra_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCPrimaryBusinessGroupFromContraC(String value) {
        return new JAXBElement<String>(_ProjectsCPrimaryBusinessGroupFromContraC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ServiceAreaFacilityType_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCServiceAreaFacilityTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCServiceAreaFacilityTypeC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HoldingRoomType_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCHoldingRoomTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCHoldingRoomTypeCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SubComponent_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCSubComponentC(String value) {
        return new JAXBElement<String>(_ProjectsCSubComponentC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = FacilityTypesC.class)
    public JAXBElement<BigDecimal> createFacilityTypesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SpaceComponents1_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCSpaceComponents1CMeaning(String value) {
        return new JAXBElement<String>(_FacilityTypesCSpaceComponents1CMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalBusinessGroups_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCAdditionalBusinessGroupsC(String value) {
        return new JAXBElement<String>(_ProjectsCAdditionalBusinessGroupsC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProfessionalServices_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCProfessionalServicesC(String value) {
        return new JAXBElement<String>(_ProjectsCProfessionalServicesC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalBusinessGroups_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCAdditionalBusinessGroupsCMeaning(String value) {
        return new JAXBElement<String>(_FacilityTypesCAdditionalBusinessGroupsCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryBusinessGroupFromContr_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCPrimaryBusinessGroupFromContrCMeaning(String value) {
        return new JAXBElement<String>(_FacilityTypesCPrimaryBusinessGroupFromContrCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCTypeCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FacilityTypes_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCFacilityTypesC(String value) {
        return new JAXBElement<String>(_FacilityTypesCFacilityTypesC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = FacilityTypesC.class)
    public JAXBElement<BigDecimal> createFacilityTypesCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryBusinessGroupFromContr_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCPrimaryBusinessGroupFromContrC(String value) {
        return new JAXBElement<String>(_FacilityTypesCPrimaryBusinessGroupFromContrC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryBusinessClassFromContra_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCPrimaryBusinessClassFromContraCMeaning(String value) {
        return new JAXBElement<String>(_FacilityTypesCPrimaryBusinessClassFromContraCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = FacilityTypesC.class)
    public JAXBElement<XMLGregorianCalendar> createFacilityTypesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalBusinessClasse_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCAdditionalBusinessClasseCMeaning(String value) {
        return new JAXBElement<String>(_FacilityTypesCAdditionalBusinessClasseCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ProjectType_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCProjectTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCProjectTypeC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalBusinessClasses_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCAdditionalBusinessClassesC(String value) {
        return new JAXBElement<String>(_ProjectsCAdditionalBusinessClassesC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SpaceComponents_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCSpaceComponentsCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSpaceComponentsCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryBusinessClassFromContra_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCPrimaryBusinessClassFromContraC(String value) {
        return new JAXBElement<String>(_ProjectsCPrimaryBusinessClassFromContraC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = FacilityTypesC.class)
    public JAXBElement<byte[]> createFacilityTypesCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, FacilityTypesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "HoldingRoomType_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCHoldingRoomTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCHoldingRoomTypeC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryBusinessClassFromContr_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCPrimaryBusinessClassFromContrCMeaning(String value) {
        return new JAXBElement<String>(_FacilityTypesCPrimaryBusinessClassFromContrCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FacilityType_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCFacilityTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCFacilityTypeC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = FacilityTypesC.class)
    public JAXBElement<XMLGregorianCalendar> createFacilityTypesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AdditionalBusinessClasses_cMeaning", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCAdditionalBusinessClassesCMeaning(String value) {
        return new JAXBElement<String>(_FacilityTypesCAdditionalBusinessClassesCMeaning_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PrimaryBusinessClassFromContr_c", scope = FacilityTypesC.class)
    public JAXBElement<String> createFacilityTypesCPrimaryBusinessClassFromContrC(String value) {
        return new JAXBElement<String>(_FacilityTypesCPrimaryBusinessClassFromContrC_QNAME, String.class, FacilityTypesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = LicensesCertificationsC.class)
    public JAXBElement<XMLGregorianCalendar> createLicensesCertificationsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Expires_c", scope = LicensesCertificationsC.class)
    public JAXBElement<XMLGregorianCalendar> createLicensesCertificationsCExpiresC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LicensesCertificationsCExpiresC_QNAME, XMLGregorianCalendar.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = LicensesCertificationsC.class)
    public JAXBElement<Integer> createLicensesCertificationsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Issued_c", scope = LicensesCertificationsC.class)
    public JAXBElement<XMLGregorianCalendar> createLicensesCertificationsCIssuedC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_LicensesCertificationsCIssuedC_QNAME, XMLGregorianCalendar.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DonNotUse_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCDonNotUseC(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCDonNotUseC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Acronym_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCAcronymC(String value) {
        return new JAXBElement<String>(_ProfessionalMembershipsCAcronymC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NationalRegistration_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCNationalRegistrationC(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCNationalRegistrationC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_cMeaning", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCTypeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCTypeCMeaning_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Country_cMeaning", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCCountryCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCCountryCMeaning_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LicenseCertificationTypes_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCLicenseCertificationTypesC(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCLicenseCertificationTypesC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "WillNotRenew_cMeaning", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCWillNotRenewCMeaning(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCWillNotRenewCMeaning_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "BackEndField_c", scope = LicensesCertificationsC.class)
    public JAXBElement<byte[]> createLicensesCertificationsCBackEndFieldC(byte[] value) {
        return new JAXBElement<byte[]>(_LicensesCertificationsCBackEndFieldC_QNAME, byte[].class, LicensesCertificationsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RegnNo_c", scope = LicensesCertificationsC.class)
    public JAXBElement<BigDecimal> createLicensesCertificationsCRegnNoC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_LicensesCertificationsCRegnNoC_QNAME, BigDecimal.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = LicensesCertificationsC.class)
    public JAXBElement<Long> createLicensesCertificationsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = LicensesCertificationsC.class)
    public JAXBElement<XMLGregorianCalendar> createLicensesCertificationsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Country_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCCountryC(String value) {
        return new JAXBElement<String>(_ProjectsCCountryC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LicenseCertificationType_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCLicenseCertificationTypeC(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCLicenseCertificationTypeC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = LicensesCertificationsC.class)
    public JAXBElement<BigDecimal> createLicensesCertificationsCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LicenseCertNumber_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCLicenseCertNumberC(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCLicenseCertNumberC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LicenceCertNumber_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCLicenceCertNumberC(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCLicenceCertNumberC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "WillNotRenew_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCWillNotRenewC(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCWillNotRenewC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = LicensesCertificationsC.class)
    public JAXBElement<Integer> createLicensesCertificationsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "State_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCStateC(String value) {
        return new JAXBElement<String>(_ProjectsCStateC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "NationalRegistration_cMeaning", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCNationalRegistrationCMeaning(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCNationalRegistrationCMeaning_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "No_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCNoC(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCNoC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = LicensesCertificationsC.class)
    public JAXBElement<BigDecimal> createLicensesCertificationsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "StateUSA_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCStateUSAC(String value) {
        return new JAXBElement<String>(_LicensesCertificationsCStateUSAC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = LicensesCertificationsC.class)
    public JAXBElement<XMLGregorianCalendar> createLicensesCertificationsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Type_c", scope = LicensesCertificationsC.class)
    public JAXBElement<String> createLicensesCertificationsCTypeC(String value) {
        return new JAXBElement<String>(_ProjectsCTypeC_QNAME, String.class, LicensesCertificationsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "TO_CURRENCY_c", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCTOCURRENCYC(String value) {
        return new JAXBElement<String>(_CurrencyDailyRateCTOCURRENCYC_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = CurrencyDailyRateC.class)
    public JAXBElement<Long> createCurrencyDailyRateCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = CurrencyDailyRateC.class)
    public JAXBElement<XMLGregorianCalendar> createCurrencyDailyRateCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ConversionDate_c", scope = CurrencyDailyRateC.class)
    public JAXBElement<XMLGregorianCalendar> createCurrencyDailyRateCConversionDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CurrencyDailyRateCConversionDateC_QNAME, XMLGregorianCalendar.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = CurrencyDailyRateC.class, defaultValue = "CurrencyDailyRate_c")
    public JAXBElement<String> createCurrencyDailyRateCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_ProjectsCAttachmentEntityName_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ConversionDates_c", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCConversionDatesC(String value) {
        return new JAXBElement<String>(_CurrencyDailyRateCConversionDatesC_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = CurrencyDailyRateC.class)
    public JAXBElement<Integer> createCurrencyDailyRateCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ConversionRate_c", scope = CurrencyDailyRateC.class)
    public JAXBElement<AmountType> createCurrencyDailyRateCConversionRateC(AmountType value) {
        return new JAXBElement<AmountType>(_CurrencyDailyRateCConversionRateC_QNAME, AmountType.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCPKProxy(String value) {
        return new JAXBElement<String>(_ProjectsCPKProxy_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = CurrencyDailyRateC.class)
    public JAXBElement<Integer> createCurrencyDailyRateCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "InverseRate_c", scope = CurrencyDailyRateC.class)
    public JAXBElement<AmountType> createCurrencyDailyRateCInverseRateC(AmountType value) {
        return new JAXBElement<AmountType>(_CurrencyDailyRateCInverseRateC_QNAME, AmountType.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = CurrencyDailyRateC.class, defaultValue = "CurrencyDailyRate_c")
    public JAXBElement<String> createCurrencyDailyRateCSourceType(String value) {
        return new JAXBElement<String>(_ProjectsCSourceType_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ConversionRates_c", scope = CurrencyDailyRateC.class)
    public JAXBElement<BigDecimal> createCurrencyDailyRateCConversionRatesC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CurrencyDailyRateCConversionRatesC_QNAME, BigDecimal.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = CurrencyDailyRateC.class)
    public JAXBElement<BigDecimal> createCurrencyDailyRateCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FROM_CURRENCY_c", scope = CurrencyDailyRateC.class)
    public JAXBElement<String> createCurrencyDailyRateCFROMCURRENCYC(String value) {
        return new JAXBElement<String>(_CurrencyDailyRateCFROMCURRENCYC_QNAME, String.class, CurrencyDailyRateC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = GSACodesC.class)
    public JAXBElement<XMLGregorianCalendar> createGSACodesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = GSACodesC.class)
    public JAXBElement<Long> createGSACodesCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = GSACodesC.class)
    public JAXBElement<XMLGregorianCalendar> createGSACodesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Descriptions_c", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCDescriptionsC(String value) {
        return new JAXBElement<String>(_MeasuresCDescriptionsC_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SF330Code_cMeaning", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCSF330CodeCMeaning(String value) {
        return new JAXBElement<String>(_ProjectsCSF330CodeCMeaning_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SF330Code_c", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCSF330CodeC(String value) {
        return new JAXBElement<String>(_ProjectsCSF330CodeC_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = GSACodesC.class)
    public JAXBElement<Integer> createGSACodesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_cMeaning", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCDescriptionCMeaning(String value) {
        return new JAXBElement<String>(_GSACodesCDescriptionCMeaning_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = GSACodesC.class)
    public JAXBElement<Integer> createGSACodesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Fees_c", scope = GSACodesC.class)
    public JAXBElement<BigDecimal> createGSACodesCFeesC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SubconsultantCFeesC_QNAME, BigDecimal.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = GSACodesC.class)
    public JAXBElement<BigDecimal> createGSACodesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = GSACodesC.class)
    public JAXBElement<BigDecimal> createGSACodesCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = GSACodesC.class)
    public JAXBElement<String> createGSACodesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = GSACodesC.class)
    public JAXBElement<XMLGregorianCalendar> createGSACodesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, GSACodesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = HDRHonorsAwardsC.class)
    public JAXBElement<String> createHDRHonorsAwardsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = HDRHonorsAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createHDRHonorsAwardsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = HDRHonorsAwardsC.class)
    public JAXBElement<Long> createHDRHonorsAwardsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = HDRHonorsAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createHDRHonorsAwardsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = HDRHonorsAwardsC.class)
    public JAXBElement<String> createHDRHonorsAwardsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Employees_Id_c", scope = HDRHonorsAwardsC.class)
    public JAXBElement<BigDecimal> createHDRHonorsAwardsCEmployeesIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_PastEmploymentCEmployeesIdC_QNAME, BigDecimal.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = HDRHonorsAwardsC.class)
    public JAXBElement<String> createHDRHonorsAwardsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = HDRHonorsAwardsC.class)
    public JAXBElement<String> createHDRHonorsAwardsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = HDRHonorsAwardsC.class)
    public JAXBElement<String> createHDRHonorsAwardsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = HDRHonorsAwardsC.class)
    public JAXBElement<Integer> createHDRHonorsAwardsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = HDRHonorsAwardsC.class)
    public JAXBElement<String> createHDRHonorsAwardsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = HDRHonorsAwardsC.class)
    public JAXBElement<Integer> createHDRHonorsAwardsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = HDRHonorsAwardsC.class)
    public JAXBElement<String> createHDRHonorsAwardsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "DateYear_c", scope = HDRHonorsAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createHDRHonorsAwardsCDateYearC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ActivitiesCDateYearC_QNAME, XMLGregorianCalendar.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = HDRHonorsAwardsC.class)
    public JAXBElement<String> createHDRHonorsAwardsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = HDRHonorsAwardsC.class)
    public JAXBElement<String> createHDRHonorsAwardsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = HDRHonorsAwardsC.class)
    public JAXBElement<BigDecimal> createHDRHonorsAwardsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = HDRHonorsAwardsC.class)
    public JAXBElement<String> createHDRHonorsAwardsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = HDRHonorsAwardsC.class)
    public JAXBElement<XMLGregorianCalendar> createHDRHonorsAwardsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, HDRHonorsAwardsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = DeepLinkingC.class)
    public JAXBElement<Long> createDeepLinkingCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = DeepLinkingC.class)
    public JAXBElement<XMLGregorianCalendar> createDeepLinkingCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "AttachmentEntityName", scope = DeepLinkingC.class, defaultValue = "DeepLinking_c")
    public JAXBElement<String> createDeepLinkingCAttachmentEntityName(String value) {
        return new JAXBElement<String>(_ProjectsCAttachmentEntityName_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = DeepLinkingC.class)
    public JAXBElement<Integer> createDeepLinkingCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "PKProxy", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCPKProxy(String value) {
        return new JAXBElement<String>(_ProjectsCPKProxy_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = DeepLinkingC.class)
    public JAXBElement<Integer> createDeepLinkingCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "SourceType", scope = DeepLinkingC.class, defaultValue = "DeepLinking_c")
    public JAXBElement<String> createDeepLinkingCSourceType(String value) {
        return new JAXBElement<String>(_ProjectsCSourceType_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "FirstName_c", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCFirstNameC(String value) {
        return new JAXBElement<String>(_EmployeesCFirstNameC_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = DeepLinkingC.class)
    public JAXBElement<BigDecimal> createDeepLinkingCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastName_c", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCLastNameC(String value) {
        return new JAXBElement<String>(_EmployeesCLastNameC_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = DeepLinkingC.class)
    public JAXBElement<String> createDeepLinkingCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, DeepLinkingC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "IsOwner", scope = TestimonialsC.class)
    public JAXBElement<String> createTestimonialsCIsOwner(String value) {
        return new JAXBElement<String>(_ProjectAwardsCIsOwner_QNAME, String.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateDate", scope = TestimonialsC.class)
    public JAXBElement<XMLGregorianCalendar> createTestimonialsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCLastUpdateDate_QNAME, XMLGregorianCalendar.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "RequestId", scope = TestimonialsC.class)
    public JAXBElement<Long> createTestimonialsCRequestId(Long value) {
        return new JAXBElement<Long>(_ProjectAwardsCRequestId_QNAME, Long.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "UserLastUpdateDate", scope = TestimonialsC.class)
    public JAXBElement<XMLGregorianCalendar> createTestimonialsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionName", scope = TestimonialsC.class)
    public JAXBElement<String> createTestimonialsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionName_QNAME, String.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CorpCurrencyCode", scope = TestimonialsC.class)
    public JAXBElement<String> createTestimonialsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCorpCurrencyCode_QNAME, String.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "JobDefinitionPackage", scope = TestimonialsC.class)
    public JAXBElement<String> createTestimonialsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_ProjectAwardsCJobDefinitionPackage_QNAME, String.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreatedBy", scope = TestimonialsC.class)
    public JAXBElement<String> createTestimonialsCCreatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCreatedBy_QNAME, String.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerPillar", scope = TestimonialsC.class)
    public JAXBElement<Integer> createTestimonialsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerPillar_QNAME, Integer.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Date_c", scope = TestimonialsC.class)
    public JAXBElement<XMLGregorianCalendar> createTestimonialsCDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_AcademicHonorsAndResearchCDateC_QNAME, XMLGregorianCalendar.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurcyConvRateType", scope = TestimonialsC.class)
    public JAXBElement<String> createTestimonialsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurcyConvRateType_QNAME, String.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfVerSor", scope = TestimonialsC.class)
    public JAXBElement<Integer> createTestimonialsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_ProjectAwardsCCpdrfVerSor_QNAME, Integer.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Description_c", scope = TestimonialsC.class)
    public JAXBElement<byte[]> createTestimonialsCDescriptionC(byte[] value) {
        return new JAXBElement<byte[]>(_ProjectAwardsCDescriptionC_QNAME, byte[].class, TestimonialsC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdateLogin", scope = TestimonialsC.class)
    public JAXBElement<String> createTestimonialsCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdateLogin_QNAME, String.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "LastUpdatedBy", scope = TestimonialsC.class)
    public JAXBElement<String> createTestimonialsCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_ProjectAwardsCLastUpdatedBy_QNAME, String.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CurrencyCode", scope = TestimonialsC.class)
    public JAXBElement<String> createTestimonialsCCurrencyCode(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCurrencyCode_QNAME, String.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "ObjectVersionNumber", scope = TestimonialsC.class)
    public JAXBElement<BigDecimal> createTestimonialsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCObjectVersionNumber_QNAME, BigDecimal.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "Projects_Id_c", scope = TestimonialsC.class)
    public JAXBElement<BigDecimal> createTestimonialsCProjectsIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ProjectAwardsCProjectsIdC_QNAME, BigDecimal.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CpdrfLastUpd", scope = TestimonialsC.class)
    public JAXBElement<String> createTestimonialsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_ProjectAwardsCCpdrfLastUpd_QNAME, String.class, TestimonialsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "/oracle/apps/sales/custExtn/views/common/", name = "CreationDate", scope = TestimonialsC.class)
    public JAXBElement<XMLGregorianCalendar> createTestimonialsCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ProjectAwardsCCreationDate_QNAME, XMLGregorianCalendar.class, TestimonialsC.class, value);
    }

}
