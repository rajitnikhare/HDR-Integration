
package com.serene.pdms.ws.stubs.company;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OrganizationProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrganizationProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OrganizationProfileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EnquiryDUNS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CeoName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CeoTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrincipalTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ControlYr" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EmployeesTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HQBranchIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OobInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusiness" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CongDistCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ImportInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExportInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LaborSurplusInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinorityOwnedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinorityOwnedType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WomanOwnedInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disadv8aInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SmallBusInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RentOwnInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DbRating" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GSAIndicatorFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="JgzzFiscalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnalysisFy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FiscalYearendMonth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrentFiscalYearPotentialRevenueAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="NextFyPotentialRevenueAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="YearEstablished" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MissionStatement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessScope" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorporationClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalBusIdenType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalBusIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredFunctionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesEstimatedIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalEmployeesMinimumIndicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentSubInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IncorpYear" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ContentSourceNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PublicPrivateOwnershipFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalActivityCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocalActivityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddressText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddressEstimation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeesAtPrimaryAddressMinimum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InternalFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalPaymentAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="DisplayedDUNSPartyIdentifier" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessReport" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="DUNSNumberC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankOrBranchNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BranchCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotConfuseWith" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HomeCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrowthStrategyDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SeblUserKeyLoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StockSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TradingPartnerIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveLatestChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrganizationSize" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuffixOverriddenFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UniqueNameAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UniqueNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DomesticUltimateDUNSNumberC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GlobalUltimateDUNSNumberC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParentDUNSNumberC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactPersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PreferredContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactFormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressCounty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryFormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryFormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IdenAddrLocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="IdenAddrPartySiteId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredNameId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryEmailId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneAreaCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneExtension" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneLineType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPhonePurpose" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryWebId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Pronunciation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressProvince" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SICCodeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidatedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ThirdPartyFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateSourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastSourceUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="DataCloudStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastEnrichmentDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="OrgInformation" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/organization/}OrganizationInformation" minOccurs="0"/>
 *         &lt;element name="SetID_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LegalStructure_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LegalStructure_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MinorityOwned_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="CustomerSince_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="StatusDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ACASS_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EBSID_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CompanyOverview_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdatedDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CompanySubType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanySubType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyClassification_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyClassification_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIC_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Favorable_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MarketSector_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSector_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Referenceable_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Deceased_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Alias_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyStatus_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Category_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSectors_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSectors_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classification_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Classification_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Location_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnershipType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnershipType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingCompanyName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CompanyLegacySystemID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingClientName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackEndLastUpdatedDate_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackendOfActivity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OperatingUnit_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSIntegrationStatus_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSREGISTRYID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSCUSTACCTNUM_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSPartyId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSAccountId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSAccountNumber_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSRegId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelationshipHistoryCollection_c" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}RelationshipHistory_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenueHistoryCollection_c" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}RevenueHistory_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TeamCollection_c" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}Team_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="HistoryCollection_c" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/}History_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrganizationProfile", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", propOrder = {
    "organizationProfileId",
    "partyId",
    "organizationName",
    "enquiryDUNS",
    "ceoName",
    "ceoTitle",
    "principalName",
    "principalTitle",
    "legalStatus",
    "controlYr",
    "employeesTotal",
    "hqBranchIndicator",
    "branchFlag",
    "oobInd",
    "lineOfBusiness",
    "congDistCode",
    "importInd",
    "exportInd",
    "laborSurplusInd",
    "minorityOwnedInd",
    "minorityOwnedType",
    "womanOwnedInd",
    "disadv8AInd",
    "smallBusInd",
    "rentOwnInd",
    "dbRating",
    "gsaIndicatorFlag",
    "jgzzFiscalCode",
    "analysisFy",
    "fiscalYearendMonth",
    "currentFiscalYearPotentialRevenueAmount",
    "nextFyPotentialRevenueAmount",
    "yearEstablished",
    "missionStatement",
    "organizationType",
    "businessScope",
    "corporationClass",
    "localBusIdenType",
    "localBusIdentifier",
    "preferredFunctionalCurrency",
    "registrationType",
    "totalEmployeesText",
    "totalEmployeesInd",
    "totalEmployeesEstimatedIndicator",
    "totalEmployeesMinimumIndicator",
    "parentSubInd",
    "incorpYear",
    "lastUpdateDate",
    "lastUpdatedBy",
    "creationDate",
    "createdBy",
    "lastUpdateLogin",
    "requestId",
    "contentSourceNumber",
    "effectiveStartDate",
    "effectiveEndDate",
    "publicPrivateOwnershipFlag",
    "localActivityCodeType",
    "localActivityCode",
    "employeesAtPrimaryAddress",
    "employeesAtPrimaryAddressText",
    "employeesAtPrimaryAddressEstimation",
    "employeesAtPrimaryAddressMinimum",
    "internalFlag",
    "totalPaymentAmount",
    "displayedDUNSPartyIdentifier",
    "status",
    "businessReport",
    "dunsNumberC",
    "createdByModule",
    "bankOrBranchNumber",
    "bankCode",
    "branchCode",
    "doNotConfuseWith",
    "homeCountry",
    "growthStrategyDescription",
    "seblUserKeyLoc",
    "stockSymbol",
    "tradingPartnerIdentifier",
    "origSystem",
    "origSystemReference",
    "effectiveSequence",
    "comments",
    "effectiveLatestChange",
    "organizationSize",
    "suffixOverriddenFlag",
    "uniqueNameAlias",
    "uniqueNameSuffix",
    "domesticUltimateDUNSNumberC",
    "globalUltimateDUNSNumberC",
    "parentDUNSNumberC",
    "corpCurrencyCode",
    "curcyConvRateType",
    "currencyCode",
    "partyNumber",
    "certificationLevel",
    "certReasonCode",
    "preferredContactMethod",
    "preferredContactPersonId",
    "preferredContactName",
    "preferredContactEmailAddress",
    "preferredContactFormattedPhoneNumber",
    "primaryAddressLine1",
    "primaryAddressLine2",
    "primaryAddressLine3",
    "primaryAddressLine4",
    "alias",
    "primaryAddressCity",
    "primaryAddressCountry",
    "primaryAddressCounty",
    "primaryEmailAddress",
    "primaryFormattedAddress",
    "primaryFormattedPhoneNumber",
    "idenAddrLocationId",
    "idenAddrPartySiteId",
    "primaryLanguage",
    "partyUniqueName",
    "primaryAddressPostalCode",
    "preferredName",
    "preferredNameId",
    "primaryEmailId",
    "primaryPhoneAreaCode",
    "primaryPhoneId",
    "primaryPhoneCountryCode",
    "primaryPhoneExtension",
    "primaryPhoneLineType",
    "primaryPhoneNumber",
    "primaryPhonePurpose",
    "primaryWebId",
    "pronunciation",
    "primaryAddressProvince",
    "sicCode",
    "sicCodeType",
    "primaryAddressState",
    "primaryURL",
    "validatedFlag",
    "thirdPartyFlag",
    "lastUpdateSourceSystem",
    "lastSourceUpdateDate",
    "dataCloudStatus",
    "lastEnrichmentDate",
    "orgInformation",
    "setIDC",
    "legalStructureC",
    "legalStructureCMeaning",
    "minorityOwnedC",
    "customerSinceC",
    "statusDateC",
    "acassc",
    "ebsidc",
    "companyOverviewC",
    "lastUpdatedByC",
    "lastUpdatedDateC",
    "companySubTypeC",
    "companySubTypeCMeaning",
    "companyClassificationC",
    "companyClassificationCMeaning",
    "sicc",
    "favorableC",
    "marketSectorC",
    "marketSectorCMeaning",
    "referenceableC",
    "deceasedC",
    "aliasC",
    "companyStatusC",
    "companyStatusCMeaning",
    "urlc",
    "businessUnitC",
    "businessUnitCMeaning",
    "categoryC",
    "categoryCMeaning",
    "marketSectorsC",
    "marketSectorsCMeaning",
    "classificationC",
    "classificationCMeaning",
    "locationC",
    "ownershipTypeC",
    "ownershipTypeCMeaning",
    "marketingCompanyNameC",
    "companyLegacySystemIDC",
    "marketingClientNameC",
    "backEndLastUpdatedDateC",
    "backendOfActivityC",
    "operatingUnitC",
    "ebsIntegrationStatusC",
    "ebsregistryidc",
    "ebscustacctnumc",
    "ebsPartyIdC",
    "ebsAccountIdC",
    "ebsAccountNumberC",
    "ebsRegIdC",
    "relationshipHistoryCollectionC",
    "revenueHistoryCollectionC",
    "teamCollectionC",
    "historyCollectionC"
})
public class OrganizationProfile {

    @XmlElement(name = "OrganizationProfileId")
    protected Long organizationProfileId;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElement(name = "OrganizationName")
    protected String organizationName;
    @XmlElementRef(name = "EnquiryDUNS", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> enquiryDUNS;
    @XmlElementRef(name = "CeoName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ceoName;
    @XmlElementRef(name = "CeoTitle", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ceoTitle;
    @XmlElementRef(name = "PrincipalName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> principalName;
    @XmlElementRef(name = "PrincipalTitle", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> principalTitle;
    @XmlElementRef(name = "LegalStatus", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalStatus;
    @XmlElementRef(name = "ControlYr", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> controlYr;
    @XmlElementRef(name = "EmployeesTotal", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> employeesTotal;
    @XmlElementRef(name = "HQBranchIndicator", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hqBranchIndicator;
    @XmlElementRef(name = "BranchFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> branchFlag;
    @XmlElementRef(name = "OobInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> oobInd;
    @XmlElementRef(name = "LineOfBusiness", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineOfBusiness;
    @XmlElementRef(name = "CongDistCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> congDistCode;
    @XmlElementRef(name = "ImportInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> importInd;
    @XmlElementRef(name = "ExportInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> exportInd;
    @XmlElementRef(name = "LaborSurplusInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> laborSurplusInd;
    @XmlElementRef(name = "MinorityOwnedInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minorityOwnedInd;
    @XmlElementRef(name = "MinorityOwnedType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> minorityOwnedType;
    @XmlElementRef(name = "WomanOwnedInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> womanOwnedInd;
    @XmlElementRef(name = "Disadv8aInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disadv8AInd;
    @XmlElementRef(name = "SmallBusInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> smallBusInd;
    @XmlElementRef(name = "RentOwnInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rentOwnInd;
    @XmlElementRef(name = "DbRating", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dbRating;
    @XmlElementRef(name = "GSAIndicatorFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> gsaIndicatorFlag;
    @XmlElementRef(name = "JgzzFiscalCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jgzzFiscalCode;
    @XmlElementRef(name = "AnalysisFy", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> analysisFy;
    @XmlElementRef(name = "FiscalYearendMonth", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fiscalYearendMonth;
    @XmlElementRef(name = "CurrentFiscalYearPotentialRevenueAmount", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> currentFiscalYearPotentialRevenueAmount;
    @XmlElementRef(name = "NextFyPotentialRevenueAmount", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> nextFyPotentialRevenueAmount;
    @XmlElementRef(name = "YearEstablished", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> yearEstablished;
    @XmlElementRef(name = "MissionStatement", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> missionStatement;
    @XmlElementRef(name = "OrganizationType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationType;
    @XmlElementRef(name = "BusinessScope", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessScope;
    @XmlElementRef(name = "CorporationClass", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corporationClass;
    @XmlElementRef(name = "LocalBusIdenType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localBusIdenType;
    @XmlElementRef(name = "LocalBusIdentifier", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localBusIdentifier;
    @XmlElementRef(name = "PreferredFunctionalCurrency", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredFunctionalCurrency;
    @XmlElementRef(name = "RegistrationType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationType;
    @XmlElementRef(name = "TotalEmployeesText", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEmployeesText;
    @XmlElementRef(name = "TotalEmployeesInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEmployeesInd;
    @XmlElementRef(name = "TotalEmployeesEstimatedIndicator", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEmployeesEstimatedIndicator;
    @XmlElementRef(name = "TotalEmployeesMinimumIndicator", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalEmployeesMinimumIndicator;
    @XmlElementRef(name = "ParentSubInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentSubInd;
    @XmlElementRef(name = "IncorpYear", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Integer> incorpYear;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "ContentSourceNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contentSourceNumber;
    @XmlElement(name = "EffectiveStartDate")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElementRef(name = "PublicPrivateOwnershipFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> publicPrivateOwnershipFlag;
    @XmlElementRef(name = "LocalActivityCodeType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localActivityCodeType;
    @XmlElementRef(name = "LocalActivityCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> localActivityCode;
    @XmlElementRef(name = "EmployeesAtPrimaryAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeesAtPrimaryAddress;
    @XmlElementRef(name = "EmployeesAtPrimaryAddressText", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeesAtPrimaryAddressText;
    @XmlElementRef(name = "EmployeesAtPrimaryAddressEstimation", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeesAtPrimaryAddressEstimation;
    @XmlElementRef(name = "EmployeesAtPrimaryAddressMinimum", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> employeesAtPrimaryAddressMinimum;
    @XmlElementRef(name = "InternalFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> internalFlag;
    @XmlElementRef(name = "TotalPaymentAmount", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalPaymentAmount;
    @XmlElementRef(name = "DisplayedDUNSPartyIdentifier", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> displayedDUNSPartyIdentifier;
    @XmlElementRef(name = "Status", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElementRef(name = "BusinessReport", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> businessReport;
    @XmlElementRef(name = "DUNSNumberC", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunsNumberC;
    @XmlElement(name = "CreatedByModule")
    protected String createdByModule;
    @XmlElementRef(name = "BankOrBranchNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankOrBranchNumber;
    @XmlElementRef(name = "BankCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bankCode;
    @XmlElementRef(name = "BranchCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> branchCode;
    @XmlElementRef(name = "DoNotConfuseWith", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> doNotConfuseWith;
    @XmlElementRef(name = "HomeCountry", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> homeCountry;
    @XmlElementRef(name = "GrowthStrategyDescription", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> growthStrategyDescription;
    @XmlElementRef(name = "SeblUserKeyLoc", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> seblUserKeyLoc;
    @XmlElementRef(name = "StockSymbol", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stockSymbol;
    @XmlElementRef(name = "TradingPartnerIdentifier", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tradingPartnerIdentifier;
    @XmlElementRef(name = "OrigSystem", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origSystem;
    @XmlElementRef(name = "OrigSystemReference", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origSystemReference;
    @XmlElement(name = "EffectiveSequence")
    protected Integer effectiveSequence;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElement(name = "EffectiveLatestChange")
    protected String effectiveLatestChange;
    @XmlElementRef(name = "OrganizationSize", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> organizationSize;
    @XmlElementRef(name = "SuffixOverriddenFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> suffixOverriddenFlag;
    @XmlElement(name = "UniqueNameAlias")
    protected String uniqueNameAlias;
    @XmlElementRef(name = "UniqueNameSuffix", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniqueNameSuffix;
    @XmlElementRef(name = "DomesticUltimateDUNSNumberC", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> domesticUltimateDUNSNumberC;
    @XmlElementRef(name = "GlobalUltimateDUNSNumberC", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> globalUltimateDUNSNumberC;
    @XmlElementRef(name = "ParentDUNSNumberC", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> parentDUNSNumberC;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElement(name = "PartyNumber")
    protected String partyNumber;
    @XmlElementRef(name = "CertificationLevel", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificationLevel;
    @XmlElementRef(name = "CertReasonCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certReasonCode;
    @XmlElementRef(name = "PreferredContactMethod", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactMethod;
    @XmlElementRef(name = "PreferredContactPersonId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> preferredContactPersonId;
    @XmlElementRef(name = "PreferredContactName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactName;
    @XmlElementRef(name = "PreferredContactEmailAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactEmailAddress;
    @XmlElementRef(name = "PreferredContactFormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactFormattedPhoneNumber;
    @XmlElementRef(name = "PrimaryAddressLine1", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressLine1;
    @XmlElementRef(name = "PrimaryAddressLine2", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressLine2;
    @XmlElementRef(name = "PrimaryAddressLine3", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressLine3;
    @XmlElementRef(name = "PrimaryAddressLine4", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressLine4;
    @XmlElementRef(name = "Alias", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alias;
    @XmlElementRef(name = "PrimaryAddressCity", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressCity;
    @XmlElementRef(name = "PrimaryAddressCountry", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressCountry;
    @XmlElementRef(name = "PrimaryAddressCounty", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressCounty;
    @XmlElementRef(name = "PrimaryEmailAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryEmailAddress;
    @XmlElementRef(name = "PrimaryFormattedAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryFormattedAddress;
    @XmlElementRef(name = "PrimaryFormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryFormattedPhoneNumber;
    @XmlElementRef(name = "IdenAddrLocationId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idenAddrLocationId;
    @XmlElementRef(name = "IdenAddrPartySiteId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> idenAddrPartySiteId;
    @XmlElementRef(name = "PrimaryLanguage", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryLanguage;
    @XmlElement(name = "PartyUniqueName")
    protected String partyUniqueName;
    @XmlElementRef(name = "PrimaryAddressPostalCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressPostalCode;
    @XmlElementRef(name = "PreferredName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredName;
    @XmlElementRef(name = "PreferredNameId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> preferredNameId;
    @XmlElementRef(name = "PrimaryEmailId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryEmailId;
    @XmlElementRef(name = "PrimaryPhoneAreaCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhoneAreaCode;
    @XmlElementRef(name = "PrimaryPhoneId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryPhoneId;
    @XmlElementRef(name = "PrimaryPhoneCountryCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhoneCountryCode;
    @XmlElementRef(name = "PrimaryPhoneExtension", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhoneExtension;
    @XmlElementRef(name = "PrimaryPhoneLineType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhoneLineType;
    @XmlElementRef(name = "PrimaryPhoneNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhoneNumber;
    @XmlElementRef(name = "PrimaryPhonePurpose", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhonePurpose;
    @XmlElementRef(name = "PrimaryWebId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryWebId;
    @XmlElementRef(name = "Pronunciation", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pronunciation;
    @XmlElementRef(name = "PrimaryAddressProvince", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressProvince;
    @XmlElementRef(name = "SICCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sicCode;
    @XmlElementRef(name = "SICCodeType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sicCodeType;
    @XmlElementRef(name = "PrimaryAddressState", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressState;
    @XmlElementRef(name = "PrimaryURL", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryURL;
    @XmlElementRef(name = "ValidatedFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> validatedFlag;
    @XmlElementRef(name = "ThirdPartyFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> thirdPartyFlag;
    @XmlElementRef(name = "LastUpdateSourceSystem", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateSourceSystem;
    @XmlElementRef(name = "LastSourceUpdateDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastSourceUpdateDate;
    @XmlElementRef(name = "DataCloudStatus", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCloudStatus;
    @XmlElementRef(name = "LastEnrichmentDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastEnrichmentDate;
    @XmlElement(name = "OrgInformation")
    protected OrganizationInformation orgInformation;
    @XmlElementRef(name = "SetID_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> setIDC;
    @XmlElementRef(name = "LegalStructure_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalStructureC;
    @XmlElementRef(name = "LegalStructure_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> legalStructureCMeaning;
    @XmlElement(name = "MinorityOwned_c")
    protected Boolean minorityOwnedC;
    @XmlElementRef(name = "CustomerSince_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> customerSinceC;
    @XmlElementRef(name = "StatusDate_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> statusDateC;
    @XmlElementRef(name = "ACASS_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> acassc;
    @XmlElementRef(name = "EBSID_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ebsidc;
    @XmlElementRef(name = "CompanyOverview_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> companyOverviewC;
    @XmlElementRef(name = "LastUpdatedBy_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdatedByC;
    @XmlElementRef(name = "LastUpdatedDate_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastUpdatedDateC;
    @XmlElementRef(name = "CompanySubType_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companySubTypeC;
    @XmlElementRef(name = "CompanySubType_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companySubTypeCMeaning;
    @XmlElementRef(name = "CompanyClassification_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyClassificationC;
    @XmlElementRef(name = "CompanyClassification_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyClassificationCMeaning;
    @XmlElementRef(name = "SIC_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sicc;
    @XmlElement(name = "Favorable_c")
    protected Boolean favorableC;
    @XmlElement(name = "MarketSector_c")
    protected String marketSectorC;
    @XmlElementRef(name = "MarketSector_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorCMeaning;
    @XmlElement(name = "Referenceable_c")
    protected Boolean referenceableC;
    @XmlElement(name = "Deceased_c")
    protected Boolean deceasedC;
    @XmlElementRef(name = "Alias_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aliasC;
    @XmlElementRef(name = "CompanyStatus_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyStatusC;
    @XmlElementRef(name = "CompanyStatus_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyStatusCMeaning;
    @XmlElementRef(name = "URL_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> urlc;
    @XmlElementRef(name = "BusinessUnit_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitC;
    @XmlElementRef(name = "BusinessUnit_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitCMeaning;
    @XmlElementRef(name = "Category_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoryC;
    @XmlElementRef(name = "Category_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoryCMeaning;
    @XmlElementRef(name = "MarketSectors_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorsC;
    @XmlElementRef(name = "MarketSectors_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorsCMeaning;
    @XmlElementRef(name = "Classification_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classificationC;
    @XmlElementRef(name = "Classification_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> classificationCMeaning;
    @XmlElementRef(name = "Location_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> locationC;
    @XmlElementRef(name = "OwnershipType_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownershipTypeC;
    @XmlElementRef(name = "OwnershipType_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownershipTypeCMeaning;
    @XmlElementRef(name = "MarketingCompanyName_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingCompanyNameC;
    @XmlElementRef(name = "CompanyLegacySystemID_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyLegacySystemIDC;
    @XmlElementRef(name = "MarketingClientName_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingClientNameC;
    @XmlElementRef(name = "BackEndLastUpdatedDate_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backEndLastUpdatedDateC;
    @XmlElementRef(name = "BackendOfActivity_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> backendOfActivityC;
    @XmlElementRef(name = "OperatingUnit_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatingUnitC;
    @XmlElementRef(name = "EBSIntegrationStatus_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsIntegrationStatusC;
    @XmlElementRef(name = "EBSREGISTRYID_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsregistryidc;
    @XmlElementRef(name = "EBSCUSTACCTNUM_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebscustacctnumc;
    @XmlElementRef(name = "EBSPartyId_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsPartyIdC;
    @XmlElementRef(name = "EBSAccountId_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsAccountIdC;
    @XmlElementRef(name = "EBSAccountNumber_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsAccountNumberC;
    @XmlElementRef(name = "EBSRegId_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/organizationService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsRegIdC;
    @XmlElement(name = "RelationshipHistoryCollection_c")
    protected List<RelationshipHistoryC> relationshipHistoryCollectionC;
    @XmlElement(name = "RevenueHistoryCollection_c")
    protected List<RevenueHistoryC> revenueHistoryCollectionC;
    @XmlElement(name = "TeamCollection_c")
    protected List<TeamC> teamCollectionC;
    @XmlElement(name = "HistoryCollection_c")
    protected List<HistoryC> historyCollectionC;

    /**
     * Gets the value of the organizationProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOrganizationProfileId() {
        return organizationProfileId;
    }

    /**
     * Sets the value of the organizationProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOrganizationProfileId(Long value) {
        this.organizationProfileId = value;
    }

    /**
     * Gets the value of the partyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPartyId() {
        return partyId;
    }

    /**
     * Sets the value of the partyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPartyId(Long value) {
        this.partyId = value;
    }

    /**
     * Gets the value of the organizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the value of the organizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationName(String value) {
        this.organizationName = value;
    }

    /**
     * Gets the value of the enquiryDUNS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEnquiryDUNS() {
        return enquiryDUNS;
    }

    /**
     * Sets the value of the enquiryDUNS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEnquiryDUNS(JAXBElement<String> value) {
        this.enquiryDUNS = value;
    }

    /**
     * Gets the value of the ceoName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCeoName() {
        return ceoName;
    }

    /**
     * Sets the value of the ceoName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCeoName(JAXBElement<String> value) {
        this.ceoName = value;
    }

    /**
     * Gets the value of the ceoTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCeoTitle() {
        return ceoTitle;
    }

    /**
     * Sets the value of the ceoTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCeoTitle(JAXBElement<String> value) {
        this.ceoTitle = value;
    }

    /**
     * Gets the value of the principalName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrincipalName() {
        return principalName;
    }

    /**
     * Sets the value of the principalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrincipalName(JAXBElement<String> value) {
        this.principalName = value;
    }

    /**
     * Gets the value of the principalTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrincipalTitle() {
        return principalTitle;
    }

    /**
     * Sets the value of the principalTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrincipalTitle(JAXBElement<String> value) {
        this.principalTitle = value;
    }

    /**
     * Gets the value of the legalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalStatus() {
        return legalStatus;
    }

    /**
     * Sets the value of the legalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalStatus(JAXBElement<String> value) {
        this.legalStatus = value;
    }

    /**
     * Gets the value of the controlYr property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getControlYr() {
        return controlYr;
    }

    /**
     * Sets the value of the controlYr property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setControlYr(JAXBElement<BigDecimal> value) {
        this.controlYr = value;
    }

    /**
     * Gets the value of the employeesTotal property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEmployeesTotal() {
        return employeesTotal;
    }

    /**
     * Sets the value of the employeesTotal property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEmployeesTotal(JAXBElement<BigDecimal> value) {
        this.employeesTotal = value;
    }

    /**
     * Gets the value of the hqBranchIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHQBranchIndicator() {
        return hqBranchIndicator;
    }

    /**
     * Sets the value of the hqBranchIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHQBranchIndicator(JAXBElement<String> value) {
        this.hqBranchIndicator = value;
    }

    /**
     * Gets the value of the branchFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBranchFlag() {
        return branchFlag;
    }

    /**
     * Sets the value of the branchFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBranchFlag(JAXBElement<Boolean> value) {
        this.branchFlag = value;
    }

    /**
     * Gets the value of the oobInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOobInd() {
        return oobInd;
    }

    /**
     * Sets the value of the oobInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOobInd(JAXBElement<String> value) {
        this.oobInd = value;
    }

    /**
     * Gets the value of the lineOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineOfBusiness() {
        return lineOfBusiness;
    }

    /**
     * Sets the value of the lineOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineOfBusiness(JAXBElement<String> value) {
        this.lineOfBusiness = value;
    }

    /**
     * Gets the value of the congDistCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCongDistCode() {
        return congDistCode;
    }

    /**
     * Sets the value of the congDistCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCongDistCode(JAXBElement<String> value) {
        this.congDistCode = value;
    }

    /**
     * Gets the value of the importInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getImportInd() {
        return importInd;
    }

    /**
     * Sets the value of the importInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setImportInd(JAXBElement<String> value) {
        this.importInd = value;
    }

    /**
     * Gets the value of the exportInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExportInd() {
        return exportInd;
    }

    /**
     * Sets the value of the exportInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExportInd(JAXBElement<String> value) {
        this.exportInd = value;
    }

    /**
     * Gets the value of the laborSurplusInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLaborSurplusInd() {
        return laborSurplusInd;
    }

    /**
     * Sets the value of the laborSurplusInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLaborSurplusInd(JAXBElement<String> value) {
        this.laborSurplusInd = value;
    }

    /**
     * Gets the value of the minorityOwnedInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinorityOwnedInd() {
        return minorityOwnedInd;
    }

    /**
     * Sets the value of the minorityOwnedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinorityOwnedInd(JAXBElement<String> value) {
        this.minorityOwnedInd = value;
    }

    /**
     * Gets the value of the minorityOwnedType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMinorityOwnedType() {
        return minorityOwnedType;
    }

    /**
     * Sets the value of the minorityOwnedType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMinorityOwnedType(JAXBElement<String> value) {
        this.minorityOwnedType = value;
    }

    /**
     * Gets the value of the womanOwnedInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWomanOwnedInd() {
        return womanOwnedInd;
    }

    /**
     * Sets the value of the womanOwnedInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWomanOwnedInd(JAXBElement<String> value) {
        this.womanOwnedInd = value;
    }

    /**
     * Gets the value of the disadv8AInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisadv8AInd() {
        return disadv8AInd;
    }

    /**
     * Sets the value of the disadv8AInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisadv8AInd(JAXBElement<String> value) {
        this.disadv8AInd = value;
    }

    /**
     * Gets the value of the smallBusInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSmallBusInd() {
        return smallBusInd;
    }

    /**
     * Sets the value of the smallBusInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSmallBusInd(JAXBElement<String> value) {
        this.smallBusInd = value;
    }

    /**
     * Gets the value of the rentOwnInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRentOwnInd() {
        return rentOwnInd;
    }

    /**
     * Sets the value of the rentOwnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRentOwnInd(JAXBElement<String> value) {
        this.rentOwnInd = value;
    }

    /**
     * Gets the value of the dbRating property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDbRating() {
        return dbRating;
    }

    /**
     * Sets the value of the dbRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDbRating(JAXBElement<String> value) {
        this.dbRating = value;
    }

    /**
     * Gets the value of the gsaIndicatorFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getGSAIndicatorFlag() {
        return gsaIndicatorFlag;
    }

    /**
     * Sets the value of the gsaIndicatorFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setGSAIndicatorFlag(JAXBElement<Boolean> value) {
        this.gsaIndicatorFlag = value;
    }

    /**
     * Gets the value of the jgzzFiscalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJgzzFiscalCode() {
        return jgzzFiscalCode;
    }

    /**
     * Sets the value of the jgzzFiscalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJgzzFiscalCode(JAXBElement<String> value) {
        this.jgzzFiscalCode = value;
    }

    /**
     * Gets the value of the analysisFy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnalysisFy() {
        return analysisFy;
    }

    /**
     * Sets the value of the analysisFy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnalysisFy(JAXBElement<String> value) {
        this.analysisFy = value;
    }

    /**
     * Gets the value of the fiscalYearendMonth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFiscalYearendMonth() {
        return fiscalYearendMonth;
    }

    /**
     * Sets the value of the fiscalYearendMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFiscalYearendMonth(JAXBElement<String> value) {
        this.fiscalYearendMonth = value;
    }

    /**
     * Gets the value of the currentFiscalYearPotentialRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getCurrentFiscalYearPotentialRevenueAmount() {
        return currentFiscalYearPotentialRevenueAmount;
    }

    /**
     * Sets the value of the currentFiscalYearPotentialRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setCurrentFiscalYearPotentialRevenueAmount(JAXBElement<AmountType> value) {
        this.currentFiscalYearPotentialRevenueAmount = value;
    }

    /**
     * Gets the value of the nextFyPotentialRevenueAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getNextFyPotentialRevenueAmount() {
        return nextFyPotentialRevenueAmount;
    }

    /**
     * Sets the value of the nextFyPotentialRevenueAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setNextFyPotentialRevenueAmount(JAXBElement<AmountType> value) {
        this.nextFyPotentialRevenueAmount = value;
    }

    /**
     * Gets the value of the yearEstablished property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getYearEstablished() {
        return yearEstablished;
    }

    /**
     * Sets the value of the yearEstablished property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setYearEstablished(JAXBElement<Integer> value) {
        this.yearEstablished = value;
    }

    /**
     * Gets the value of the missionStatement property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMissionStatement() {
        return missionStatement;
    }

    /**
     * Sets the value of the missionStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMissionStatement(JAXBElement<String> value) {
        this.missionStatement = value;
    }

    /**
     * Gets the value of the organizationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationType() {
        return organizationType;
    }

    /**
     * Sets the value of the organizationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationType(JAXBElement<String> value) {
        this.organizationType = value;
    }

    /**
     * Gets the value of the businessScope property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessScope() {
        return businessScope;
    }

    /**
     * Sets the value of the businessScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessScope(JAXBElement<String> value) {
        this.businessScope = value;
    }

    /**
     * Gets the value of the corporationClass property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCorporationClass() {
        return corporationClass;
    }

    /**
     * Sets the value of the corporationClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCorporationClass(JAXBElement<String> value) {
        this.corporationClass = value;
    }

    /**
     * Gets the value of the localBusIdenType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalBusIdenType() {
        return localBusIdenType;
    }

    /**
     * Sets the value of the localBusIdenType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalBusIdenType(JAXBElement<String> value) {
        this.localBusIdenType = value;
    }

    /**
     * Gets the value of the localBusIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalBusIdentifier() {
        return localBusIdentifier;
    }

    /**
     * Sets the value of the localBusIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalBusIdentifier(JAXBElement<String> value) {
        this.localBusIdentifier = value;
    }

    /**
     * Gets the value of the preferredFunctionalCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredFunctionalCurrency() {
        return preferredFunctionalCurrency;
    }

    /**
     * Sets the value of the preferredFunctionalCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredFunctionalCurrency(JAXBElement<String> value) {
        this.preferredFunctionalCurrency = value;
    }

    /**
     * Gets the value of the registrationType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationType() {
        return registrationType;
    }

    /**
     * Sets the value of the registrationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationType(JAXBElement<String> value) {
        this.registrationType = value;
    }

    /**
     * Gets the value of the totalEmployeesText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesText() {
        return totalEmployeesText;
    }

    /**
     * Sets the value of the totalEmployeesText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesText(JAXBElement<String> value) {
        this.totalEmployeesText = value;
    }

    /**
     * Gets the value of the totalEmployeesInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesInd() {
        return totalEmployeesInd;
    }

    /**
     * Sets the value of the totalEmployeesInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesInd(JAXBElement<String> value) {
        this.totalEmployeesInd = value;
    }

    /**
     * Gets the value of the totalEmployeesEstimatedIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesEstimatedIndicator() {
        return totalEmployeesEstimatedIndicator;
    }

    /**
     * Sets the value of the totalEmployeesEstimatedIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesEstimatedIndicator(JAXBElement<String> value) {
        this.totalEmployeesEstimatedIndicator = value;
    }

    /**
     * Gets the value of the totalEmployeesMinimumIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalEmployeesMinimumIndicator() {
        return totalEmployeesMinimumIndicator;
    }

    /**
     * Sets the value of the totalEmployeesMinimumIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalEmployeesMinimumIndicator(JAXBElement<String> value) {
        this.totalEmployeesMinimumIndicator = value;
    }

    /**
     * Gets the value of the parentSubInd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentSubInd() {
        return parentSubInd;
    }

    /**
     * Sets the value of the parentSubInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentSubInd(JAXBElement<String> value) {
        this.parentSubInd = value;
    }

    /**
     * Gets the value of the incorpYear property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public JAXBElement<Integer> getIncorpYear() {
        return incorpYear;
    }

    /**
     * Sets the value of the incorpYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
     *     
     */
    public void setIncorpYear(JAXBElement<Integer> value) {
        this.incorpYear = value;
    }

    /**
     * Gets the value of the lastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdateDate() {
        return lastUpdateDate;
    }

    /**
     * Sets the value of the lastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdateDate(XMLGregorianCalendar value) {
        this.lastUpdateDate = value;
    }

    /**
     * Gets the value of the lastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    /**
     * Sets the value of the lastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedBy(String value) {
        this.lastUpdatedBy = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(XMLGregorianCalendar value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the createdBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * Sets the value of the createdBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedBy(String value) {
        this.createdBy = value;
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
     * Gets the value of the contentSourceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContentSourceNumber() {
        return contentSourceNumber;
    }

    /**
     * Sets the value of the contentSourceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContentSourceNumber(JAXBElement<String> value) {
        this.contentSourceNumber = value;
    }

    /**
     * Gets the value of the effectiveStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveStartDate() {
        return effectiveStartDate;
    }

    /**
     * Sets the value of the effectiveStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveStartDate(XMLGregorianCalendar value) {
        this.effectiveStartDate = value;
    }

    /**
     * Gets the value of the effectiveEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEffectiveEndDate() {
        return effectiveEndDate;
    }

    /**
     * Sets the value of the effectiveEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEffectiveEndDate(XMLGregorianCalendar value) {
        this.effectiveEndDate = value;
    }

    /**
     * Gets the value of the publicPrivateOwnershipFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPublicPrivateOwnershipFlag() {
        return publicPrivateOwnershipFlag;
    }

    /**
     * Sets the value of the publicPrivateOwnershipFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPublicPrivateOwnershipFlag(JAXBElement<Boolean> value) {
        this.publicPrivateOwnershipFlag = value;
    }

    /**
     * Gets the value of the localActivityCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalActivityCodeType() {
        return localActivityCodeType;
    }

    /**
     * Sets the value of the localActivityCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalActivityCodeType(JAXBElement<String> value) {
        this.localActivityCodeType = value;
    }

    /**
     * Gets the value of the localActivityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLocalActivityCode() {
        return localActivityCode;
    }

    /**
     * Sets the value of the localActivityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLocalActivityCode(JAXBElement<String> value) {
        this.localActivityCode = value;
    }

    /**
     * Gets the value of the employeesAtPrimaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddress() {
        return employeesAtPrimaryAddress;
    }

    /**
     * Sets the value of the employeesAtPrimaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddress(JAXBElement<String> value) {
        this.employeesAtPrimaryAddress = value;
    }

    /**
     * Gets the value of the employeesAtPrimaryAddressText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddressText() {
        return employeesAtPrimaryAddressText;
    }

    /**
     * Sets the value of the employeesAtPrimaryAddressText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddressText(JAXBElement<String> value) {
        this.employeesAtPrimaryAddressText = value;
    }

    /**
     * Gets the value of the employeesAtPrimaryAddressEstimation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddressEstimation() {
        return employeesAtPrimaryAddressEstimation;
    }

    /**
     * Sets the value of the employeesAtPrimaryAddressEstimation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddressEstimation(JAXBElement<String> value) {
        this.employeesAtPrimaryAddressEstimation = value;
    }

    /**
     * Gets the value of the employeesAtPrimaryAddressMinimum property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmployeesAtPrimaryAddressMinimum() {
        return employeesAtPrimaryAddressMinimum;
    }

    /**
     * Sets the value of the employeesAtPrimaryAddressMinimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmployeesAtPrimaryAddressMinimum(JAXBElement<String> value) {
        this.employeesAtPrimaryAddressMinimum = value;
    }

    /**
     * Gets the value of the internalFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getInternalFlag() {
        return internalFlag;
    }

    /**
     * Sets the value of the internalFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setInternalFlag(JAXBElement<Boolean> value) {
        this.internalFlag = value;
    }

    /**
     * Gets the value of the totalPaymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalPaymentAmount() {
        return totalPaymentAmount;
    }

    /**
     * Sets the value of the totalPaymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalPaymentAmount(JAXBElement<AmountType> value) {
        this.totalPaymentAmount = value;
    }

    /**
     * Gets the value of the displayedDUNSPartyIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDisplayedDUNSPartyIdentifier() {
        return displayedDUNSPartyIdentifier;
    }

    /**
     * Sets the value of the displayedDUNSPartyIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDisplayedDUNSPartyIdentifier(JAXBElement<Long> value) {
        this.displayedDUNSPartyIdentifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatus(JAXBElement<String> value) {
        this.status = value;
    }

    /**
     * Gets the value of the businessReport property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getBusinessReport() {
        return businessReport;
    }

    /**
     * Sets the value of the businessReport property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setBusinessReport(JAXBElement<byte[]> value) {
        this.businessReport = value;
    }

    /**
     * Gets the value of the dunsNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNumberC() {
        return dunsNumberC;
    }

    /**
     * Sets the value of the dunsNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNumberC(JAXBElement<String> value) {
        this.dunsNumberC = value;
    }

    /**
     * Gets the value of the createdByModule property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByModule() {
        return createdByModule;
    }

    /**
     * Sets the value of the createdByModule property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByModule(String value) {
        this.createdByModule = value;
    }

    /**
     * Gets the value of the bankOrBranchNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankOrBranchNumber() {
        return bankOrBranchNumber;
    }

    /**
     * Sets the value of the bankOrBranchNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankOrBranchNumber(JAXBElement<String> value) {
        this.bankOrBranchNumber = value;
    }

    /**
     * Gets the value of the bankCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBankCode() {
        return bankCode;
    }

    /**
     * Sets the value of the bankCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBankCode(JAXBElement<String> value) {
        this.bankCode = value;
    }

    /**
     * Gets the value of the branchCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBranchCode() {
        return branchCode;
    }

    /**
     * Sets the value of the branchCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBranchCode(JAXBElement<String> value) {
        this.branchCode = value;
    }

    /**
     * Gets the value of the doNotConfuseWith property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDoNotConfuseWith() {
        return doNotConfuseWith;
    }

    /**
     * Sets the value of the doNotConfuseWith property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDoNotConfuseWith(JAXBElement<String> value) {
        this.doNotConfuseWith = value;
    }

    /**
     * Gets the value of the homeCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHomeCountry() {
        return homeCountry;
    }

    /**
     * Sets the value of the homeCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHomeCountry(JAXBElement<String> value) {
        this.homeCountry = value;
    }

    /**
     * Gets the value of the growthStrategyDescription property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrowthStrategyDescription() {
        return growthStrategyDescription;
    }

    /**
     * Sets the value of the growthStrategyDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrowthStrategyDescription(JAXBElement<String> value) {
        this.growthStrategyDescription = value;
    }

    /**
     * Gets the value of the seblUserKeyLoc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSeblUserKeyLoc() {
        return seblUserKeyLoc;
    }

    /**
     * Sets the value of the seblUserKeyLoc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSeblUserKeyLoc(JAXBElement<String> value) {
        this.seblUserKeyLoc = value;
    }

    /**
     * Gets the value of the stockSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStockSymbol() {
        return stockSymbol;
    }

    /**
     * Sets the value of the stockSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStockSymbol(JAXBElement<String> value) {
        this.stockSymbol = value;
    }

    /**
     * Gets the value of the tradingPartnerIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTradingPartnerIdentifier() {
        return tradingPartnerIdentifier;
    }

    /**
     * Sets the value of the tradingPartnerIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTradingPartnerIdentifier(JAXBElement<String> value) {
        this.tradingPartnerIdentifier = value;
    }

    /**
     * Gets the value of the origSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigSystem() {
        return origSystem;
    }

    /**
     * Sets the value of the origSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigSystem(JAXBElement<String> value) {
        this.origSystem = value;
    }

    /**
     * Gets the value of the origSystemReference property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrigSystemReference() {
        return origSystemReference;
    }

    /**
     * Sets the value of the origSystemReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrigSystemReference(JAXBElement<String> value) {
        this.origSystemReference = value;
    }

    /**
     * Gets the value of the effectiveSequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getEffectiveSequence() {
        return effectiveSequence;
    }

    /**
     * Sets the value of the effectiveSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setEffectiveSequence(Integer value) {
        this.effectiveSequence = value;
    }

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = value;
    }

    /**
     * Gets the value of the effectiveLatestChange property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveLatestChange() {
        return effectiveLatestChange;
    }

    /**
     * Sets the value of the effectiveLatestChange property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveLatestChange(String value) {
        this.effectiveLatestChange = value;
    }

    /**
     * Gets the value of the organizationSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOrganizationSize() {
        return organizationSize;
    }

    /**
     * Sets the value of the organizationSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOrganizationSize(JAXBElement<String> value) {
        this.organizationSize = value;
    }

    /**
     * Gets the value of the suffixOverriddenFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getSuffixOverriddenFlag() {
        return suffixOverriddenFlag;
    }

    /**
     * Sets the value of the suffixOverriddenFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setSuffixOverriddenFlag(JAXBElement<Boolean> value) {
        this.suffixOverriddenFlag = value;
    }

    /**
     * Gets the value of the uniqueNameAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueNameAlias() {
        return uniqueNameAlias;
    }

    /**
     * Sets the value of the uniqueNameAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueNameAlias(String value) {
        this.uniqueNameAlias = value;
    }

    /**
     * Gets the value of the uniqueNameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUniqueNameSuffix() {
        return uniqueNameSuffix;
    }

    /**
     * Sets the value of the uniqueNameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUniqueNameSuffix(JAXBElement<String> value) {
        this.uniqueNameSuffix = value;
    }

    /**
     * Gets the value of the domesticUltimateDUNSNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDomesticUltimateDUNSNumberC() {
        return domesticUltimateDUNSNumberC;
    }

    /**
     * Sets the value of the domesticUltimateDUNSNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDomesticUltimateDUNSNumberC(JAXBElement<String> value) {
        this.domesticUltimateDUNSNumberC = value;
    }

    /**
     * Gets the value of the globalUltimateDUNSNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGlobalUltimateDUNSNumberC() {
        return globalUltimateDUNSNumberC;
    }

    /**
     * Sets the value of the globalUltimateDUNSNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGlobalUltimateDUNSNumberC(JAXBElement<String> value) {
        this.globalUltimateDUNSNumberC = value;
    }

    /**
     * Gets the value of the parentDUNSNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getParentDUNSNumberC() {
        return parentDUNSNumberC;
    }

    /**
     * Sets the value of the parentDUNSNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setParentDUNSNumberC(JAXBElement<String> value) {
        this.parentDUNSNumberC = value;
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
     * Gets the value of the partyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyNumber() {
        return partyNumber;
    }

    /**
     * Sets the value of the partyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyNumber(String value) {
        this.partyNumber = value;
    }

    /**
     * Gets the value of the certificationLevel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertificationLevel() {
        return certificationLevel;
    }

    /**
     * Sets the value of the certificationLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertificationLevel(JAXBElement<String> value) {
        this.certificationLevel = value;
    }

    /**
     * Gets the value of the certReasonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCertReasonCode() {
        return certReasonCode;
    }

    /**
     * Sets the value of the certReasonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCertReasonCode(JAXBElement<String> value) {
        this.certReasonCode = value;
    }

    /**
     * Gets the value of the preferredContactMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactMethod() {
        return preferredContactMethod;
    }

    /**
     * Sets the value of the preferredContactMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactMethod(JAXBElement<String> value) {
        this.preferredContactMethod = value;
    }

    /**
     * Gets the value of the preferredContactPersonId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPreferredContactPersonId() {
        return preferredContactPersonId;
    }

    /**
     * Sets the value of the preferredContactPersonId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPreferredContactPersonId(JAXBElement<Long> value) {
        this.preferredContactPersonId = value;
    }

    /**
     * Gets the value of the preferredContactName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactName() {
        return preferredContactName;
    }

    /**
     * Sets the value of the preferredContactName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactName(JAXBElement<String> value) {
        this.preferredContactName = value;
    }

    /**
     * Gets the value of the preferredContactEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactEmailAddress() {
        return preferredContactEmailAddress;
    }

    /**
     * Sets the value of the preferredContactEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactEmailAddress(JAXBElement<String> value) {
        this.preferredContactEmailAddress = value;
    }

    /**
     * Gets the value of the preferredContactFormattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactFormattedPhoneNumber() {
        return preferredContactFormattedPhoneNumber;
    }

    /**
     * Sets the value of the preferredContactFormattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactFormattedPhoneNumber(JAXBElement<String> value) {
        this.preferredContactFormattedPhoneNumber = value;
    }

    /**
     * Gets the value of the primaryAddressLine1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressLine1() {
        return primaryAddressLine1;
    }

    /**
     * Sets the value of the primaryAddressLine1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressLine1(JAXBElement<String> value) {
        this.primaryAddressLine1 = value;
    }

    /**
     * Gets the value of the primaryAddressLine2 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressLine2() {
        return primaryAddressLine2;
    }

    /**
     * Sets the value of the primaryAddressLine2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressLine2(JAXBElement<String> value) {
        this.primaryAddressLine2 = value;
    }

    /**
     * Gets the value of the primaryAddressLine3 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressLine3() {
        return primaryAddressLine3;
    }

    /**
     * Sets the value of the primaryAddressLine3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressLine3(JAXBElement<String> value) {
        this.primaryAddressLine3 = value;
    }

    /**
     * Gets the value of the primaryAddressLine4 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressLine4() {
        return primaryAddressLine4;
    }

    /**
     * Sets the value of the primaryAddressLine4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressLine4(JAXBElement<String> value) {
        this.primaryAddressLine4 = value;
    }

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAlias(JAXBElement<String> value) {
        this.alias = value;
    }

    /**
     * Gets the value of the primaryAddressCity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressCity() {
        return primaryAddressCity;
    }

    /**
     * Sets the value of the primaryAddressCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressCity(JAXBElement<String> value) {
        this.primaryAddressCity = value;
    }

    /**
     * Gets the value of the primaryAddressCountry property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressCountry() {
        return primaryAddressCountry;
    }

    /**
     * Sets the value of the primaryAddressCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressCountry(JAXBElement<String> value) {
        this.primaryAddressCountry = value;
    }

    /**
     * Gets the value of the primaryAddressCounty property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressCounty() {
        return primaryAddressCounty;
    }

    /**
     * Sets the value of the primaryAddressCounty property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressCounty(JAXBElement<String> value) {
        this.primaryAddressCounty = value;
    }

    /**
     * Gets the value of the primaryEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryEmailAddress() {
        return primaryEmailAddress;
    }

    /**
     * Sets the value of the primaryEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryEmailAddress(JAXBElement<String> value) {
        this.primaryEmailAddress = value;
    }

    /**
     * Gets the value of the primaryFormattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryFormattedAddress() {
        return primaryFormattedAddress;
    }

    /**
     * Sets the value of the primaryFormattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryFormattedAddress(JAXBElement<String> value) {
        this.primaryFormattedAddress = value;
    }

    /**
     * Gets the value of the primaryFormattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryFormattedPhoneNumber() {
        return primaryFormattedPhoneNumber;
    }

    /**
     * Sets the value of the primaryFormattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryFormattedPhoneNumber(JAXBElement<String> value) {
        this.primaryFormattedPhoneNumber = value;
    }

    /**
     * Gets the value of the idenAddrLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdenAddrLocationId() {
        return idenAddrLocationId;
    }

    /**
     * Sets the value of the idenAddrLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdenAddrLocationId(JAXBElement<Long> value) {
        this.idenAddrLocationId = value;
    }

    /**
     * Gets the value of the idenAddrPartySiteId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getIdenAddrPartySiteId() {
        return idenAddrPartySiteId;
    }

    /**
     * Sets the value of the idenAddrPartySiteId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setIdenAddrPartySiteId(JAXBElement<Long> value) {
        this.idenAddrPartySiteId = value;
    }

    /**
     * Gets the value of the primaryLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryLanguage() {
        return primaryLanguage;
    }

    /**
     * Sets the value of the primaryLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryLanguage(JAXBElement<String> value) {
        this.primaryLanguage = value;
    }

    /**
     * Gets the value of the partyUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyUniqueName() {
        return partyUniqueName;
    }

    /**
     * Sets the value of the partyUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyUniqueName(String value) {
        this.partyUniqueName = value;
    }

    /**
     * Gets the value of the primaryAddressPostalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressPostalCode() {
        return primaryAddressPostalCode;
    }

    /**
     * Sets the value of the primaryAddressPostalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressPostalCode(JAXBElement<String> value) {
        this.primaryAddressPostalCode = value;
    }

    /**
     * Gets the value of the preferredName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredName() {
        return preferredName;
    }

    /**
     * Sets the value of the preferredName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredName(JAXBElement<String> value) {
        this.preferredName = value;
    }

    /**
     * Gets the value of the preferredNameId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPreferredNameId() {
        return preferredNameId;
    }

    /**
     * Sets the value of the preferredNameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPreferredNameId(JAXBElement<Long> value) {
        this.preferredNameId = value;
    }

    /**
     * Gets the value of the primaryEmailId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryEmailId() {
        return primaryEmailId;
    }

    /**
     * Sets the value of the primaryEmailId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryEmailId(JAXBElement<Long> value) {
        this.primaryEmailId = value;
    }

    /**
     * Gets the value of the primaryPhoneAreaCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhoneAreaCode() {
        return primaryPhoneAreaCode;
    }

    /**
     * Sets the value of the primaryPhoneAreaCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhoneAreaCode(JAXBElement<String> value) {
        this.primaryPhoneAreaCode = value;
    }

    /**
     * Gets the value of the primaryPhoneId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryPhoneId() {
        return primaryPhoneId;
    }

    /**
     * Sets the value of the primaryPhoneId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryPhoneId(JAXBElement<Long> value) {
        this.primaryPhoneId = value;
    }

    /**
     * Gets the value of the primaryPhoneCountryCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhoneCountryCode() {
        return primaryPhoneCountryCode;
    }

    /**
     * Sets the value of the primaryPhoneCountryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhoneCountryCode(JAXBElement<String> value) {
        this.primaryPhoneCountryCode = value;
    }

    /**
     * Gets the value of the primaryPhoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhoneExtension() {
        return primaryPhoneExtension;
    }

    /**
     * Sets the value of the primaryPhoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhoneExtension(JAXBElement<String> value) {
        this.primaryPhoneExtension = value;
    }

    /**
     * Gets the value of the primaryPhoneLineType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhoneLineType() {
        return primaryPhoneLineType;
    }

    /**
     * Sets the value of the primaryPhoneLineType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhoneLineType(JAXBElement<String> value) {
        this.primaryPhoneLineType = value;
    }

    /**
     * Gets the value of the primaryPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhoneNumber() {
        return primaryPhoneNumber;
    }

    /**
     * Sets the value of the primaryPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhoneNumber(JAXBElement<String> value) {
        this.primaryPhoneNumber = value;
    }

    /**
     * Gets the value of the primaryPhonePurpose property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryPhonePurpose() {
        return primaryPhonePurpose;
    }

    /**
     * Sets the value of the primaryPhonePurpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryPhonePurpose(JAXBElement<String> value) {
        this.primaryPhonePurpose = value;
    }

    /**
     * Gets the value of the primaryWebId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryWebId() {
        return primaryWebId;
    }

    /**
     * Sets the value of the primaryWebId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryWebId(JAXBElement<Long> value) {
        this.primaryWebId = value;
    }

    /**
     * Gets the value of the pronunciation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPronunciation() {
        return pronunciation;
    }

    /**
     * Sets the value of the pronunciation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPronunciation(JAXBElement<String> value) {
        this.pronunciation = value;
    }

    /**
     * Gets the value of the primaryAddressProvince property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressProvince() {
        return primaryAddressProvince;
    }

    /**
     * Sets the value of the primaryAddressProvince property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressProvince(JAXBElement<String> value) {
        this.primaryAddressProvince = value;
    }

    /**
     * Gets the value of the sicCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSICCode() {
        return sicCode;
    }

    /**
     * Sets the value of the sicCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSICCode(JAXBElement<String> value) {
        this.sicCode = value;
    }

    /**
     * Gets the value of the sicCodeType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSICCodeType() {
        return sicCodeType;
    }

    /**
     * Sets the value of the sicCodeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSICCodeType(JAXBElement<String> value) {
        this.sicCodeType = value;
    }

    /**
     * Gets the value of the primaryAddressState property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAddressState() {
        return primaryAddressState;
    }

    /**
     * Sets the value of the primaryAddressState property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAddressState(JAXBElement<String> value) {
        this.primaryAddressState = value;
    }

    /**
     * Gets the value of the primaryURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryURL() {
        return primaryURL;
    }

    /**
     * Sets the value of the primaryURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryURL(JAXBElement<String> value) {
        this.primaryURL = value;
    }

    /**
     * Gets the value of the validatedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getValidatedFlag() {
        return validatedFlag;
    }

    /**
     * Sets the value of the validatedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setValidatedFlag(JAXBElement<Boolean> value) {
        this.validatedFlag = value;
    }

    /**
     * Gets the value of the thirdPartyFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getThirdPartyFlag() {
        return thirdPartyFlag;
    }

    /**
     * Sets the value of the thirdPartyFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setThirdPartyFlag(JAXBElement<Boolean> value) {
        this.thirdPartyFlag = value;
    }

    /**
     * Gets the value of the lastUpdateSourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdateSourceSystem() {
        return lastUpdateSourceSystem;
    }

    /**
     * Sets the value of the lastUpdateSourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdateSourceSystem(JAXBElement<String> value) {
        this.lastUpdateSourceSystem = value;
    }

    /**
     * Gets the value of the lastSourceUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastSourceUpdateDate() {
        return lastSourceUpdateDate;
    }

    /**
     * Sets the value of the lastSourceUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastSourceUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastSourceUpdateDate = value;
    }

    /**
     * Gets the value of the dataCloudStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDataCloudStatus() {
        return dataCloudStatus;
    }

    /**
     * Sets the value of the dataCloudStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDataCloudStatus(JAXBElement<String> value) {
        this.dataCloudStatus = value;
    }

    /**
     * Gets the value of the lastEnrichmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastEnrichmentDate() {
        return lastEnrichmentDate;
    }

    /**
     * Sets the value of the lastEnrichmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastEnrichmentDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastEnrichmentDate = value;
    }

    /**
     * Gets the value of the orgInformation property.
     * 
     * @return
     *     possible object is
     *     {@link OrganizationInformation }
     *     
     */
    public OrganizationInformation getOrgInformation() {
        return orgInformation;
    }

    /**
     * Sets the value of the orgInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrganizationInformation }
     *     
     */
    public void setOrgInformation(OrganizationInformation value) {
        this.orgInformation = value;
    }

    /**
     * Gets the value of the setIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSetIDC() {
        return setIDC;
    }

    /**
     * Sets the value of the setIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSetIDC(JAXBElement<BigDecimal> value) {
        this.setIDC = value;
    }

    /**
     * Gets the value of the legalStructureC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalStructureC() {
        return legalStructureC;
    }

    /**
     * Sets the value of the legalStructureC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalStructureC(JAXBElement<String> value) {
        this.legalStructureC = value;
    }

    /**
     * Gets the value of the legalStructureCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLegalStructureCMeaning() {
        return legalStructureCMeaning;
    }

    /**
     * Sets the value of the legalStructureCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLegalStructureCMeaning(JAXBElement<String> value) {
        this.legalStructureCMeaning = value;
    }

    /**
     * Gets the value of the minorityOwnedC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMinorityOwnedC() {
        return minorityOwnedC;
    }

    /**
     * Sets the value of the minorityOwnedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMinorityOwnedC(Boolean value) {
        this.minorityOwnedC = value;
    }

    /**
     * Gets the value of the customerSinceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getCustomerSinceC() {
        return customerSinceC;
    }

    /**
     * Sets the value of the customerSinceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setCustomerSinceC(JAXBElement<XMLGregorianCalendar> value) {
        this.customerSinceC = value;
    }

    /**
     * Gets the value of the statusDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStatusDateC() {
        return statusDateC;
    }

    /**
     * Sets the value of the statusDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStatusDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.statusDateC = value;
    }

    /**
     * Gets the value of the acassc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getACASSC() {
        return acassc;
    }

    /**
     * Sets the value of the acassc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setACASSC(JAXBElement<BigDecimal> value) {
        this.acassc = value;
    }

    /**
     * Gets the value of the ebsidc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEBSIDC() {
        return ebsidc;
    }

    /**
     * Sets the value of the ebsidc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEBSIDC(JAXBElement<BigDecimal> value) {
        this.ebsidc = value;
    }

    /**
     * Gets the value of the companyOverviewC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getCompanyOverviewC() {
        return companyOverviewC;
    }

    /**
     * Sets the value of the companyOverviewC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setCompanyOverviewC(JAXBElement<byte[]> value) {
        this.companyOverviewC = value;
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
     * Gets the value of the lastUpdatedDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastUpdatedDateC() {
        return lastUpdatedDateC;
    }

    /**
     * Sets the value of the lastUpdatedDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastUpdatedDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.lastUpdatedDateC = value;
    }

    /**
     * Gets the value of the companySubTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanySubTypeC() {
        return companySubTypeC;
    }

    /**
     * Sets the value of the companySubTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanySubTypeC(JAXBElement<String> value) {
        this.companySubTypeC = value;
    }

    /**
     * Gets the value of the companySubTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanySubTypeCMeaning() {
        return companySubTypeCMeaning;
    }

    /**
     * Sets the value of the companySubTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanySubTypeCMeaning(JAXBElement<String> value) {
        this.companySubTypeCMeaning = value;
    }

    /**
     * Gets the value of the companyClassificationC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyClassificationC() {
        return companyClassificationC;
    }

    /**
     * Sets the value of the companyClassificationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyClassificationC(JAXBElement<String> value) {
        this.companyClassificationC = value;
    }

    /**
     * Gets the value of the companyClassificationCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyClassificationCMeaning() {
        return companyClassificationCMeaning;
    }

    /**
     * Sets the value of the companyClassificationCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyClassificationCMeaning(JAXBElement<String> value) {
        this.companyClassificationCMeaning = value;
    }

    /**
     * Gets the value of the sicc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSICC() {
        return sicc;
    }

    /**
     * Sets the value of the sicc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSICC(JAXBElement<String> value) {
        this.sicc = value;
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
     * Gets the value of the marketSectorC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketSectorC() {
        return marketSectorC;
    }

    /**
     * Sets the value of the marketSectorC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketSectorC(String value) {
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
     * Gets the value of the referenceableC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isReferenceableC() {
        return referenceableC;
    }

    /**
     * Sets the value of the referenceableC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setReferenceableC(Boolean value) {
        this.referenceableC = value;
    }

    /**
     * Gets the value of the deceasedC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeceasedC() {
        return deceasedC;
    }

    /**
     * Sets the value of the deceasedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeceasedC(Boolean value) {
        this.deceasedC = value;
    }

    /**
     * Gets the value of the aliasC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAliasC() {
        return aliasC;
    }

    /**
     * Sets the value of the aliasC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAliasC(JAXBElement<String> value) {
        this.aliasC = value;
    }

    /**
     * Gets the value of the companyStatusC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyStatusC() {
        return companyStatusC;
    }

    /**
     * Sets the value of the companyStatusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyStatusC(JAXBElement<String> value) {
        this.companyStatusC = value;
    }

    /**
     * Gets the value of the companyStatusCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyStatusCMeaning() {
        return companyStatusCMeaning;
    }

    /**
     * Sets the value of the companyStatusCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyStatusCMeaning(JAXBElement<String> value) {
        this.companyStatusCMeaning = value;
    }

    /**
     * Gets the value of the urlc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getURLC() {
        return urlc;
    }

    /**
     * Sets the value of the urlc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setURLC(JAXBElement<String> value) {
        this.urlc = value;
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
     * Gets the value of the categoryC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryC() {
        return categoryC;
    }

    /**
     * Sets the value of the categoryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryC(JAXBElement<String> value) {
        this.categoryC = value;
    }

    /**
     * Gets the value of the categoryCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryCMeaning() {
        return categoryCMeaning;
    }

    /**
     * Sets the value of the categoryCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryCMeaning(JAXBElement<String> value) {
        this.categoryCMeaning = value;
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
     * Gets the value of the marketSectorsCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketSectorsCMeaning() {
        return marketSectorsCMeaning;
    }

    /**
     * Sets the value of the marketSectorsCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketSectorsCMeaning(JAXBElement<String> value) {
        this.marketSectorsCMeaning = value;
    }

    /**
     * Gets the value of the classificationC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassificationC() {
        return classificationC;
    }

    /**
     * Sets the value of the classificationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassificationC(JAXBElement<String> value) {
        this.classificationC = value;
    }

    /**
     * Gets the value of the classificationCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getClassificationCMeaning() {
        return classificationCMeaning;
    }

    /**
     * Sets the value of the classificationCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setClassificationCMeaning(JAXBElement<String> value) {
        this.classificationCMeaning = value;
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
     * Gets the value of the ownershipTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnershipTypeC() {
        return ownershipTypeC;
    }

    /**
     * Sets the value of the ownershipTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnershipTypeC(JAXBElement<String> value) {
        this.ownershipTypeC = value;
    }

    /**
     * Gets the value of the ownershipTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnershipTypeCMeaning() {
        return ownershipTypeCMeaning;
    }

    /**
     * Sets the value of the ownershipTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnershipTypeCMeaning(JAXBElement<String> value) {
        this.ownershipTypeCMeaning = value;
    }

    /**
     * Gets the value of the marketingCompanyNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingCompanyNameC() {
        return marketingCompanyNameC;
    }

    /**
     * Sets the value of the marketingCompanyNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingCompanyNameC(JAXBElement<String> value) {
        this.marketingCompanyNameC = value;
    }

    /**
     * Gets the value of the companyLegacySystemIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompanyLegacySystemIDC() {
        return companyLegacySystemIDC;
    }

    /**
     * Sets the value of the companyLegacySystemIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompanyLegacySystemIDC(JAXBElement<String> value) {
        this.companyLegacySystemIDC = value;
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
     * Gets the value of the backendOfActivityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBackendOfActivityC() {
        return backendOfActivityC;
    }

    /**
     * Sets the value of the backendOfActivityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBackendOfActivityC(JAXBElement<BigDecimal> value) {
        this.backendOfActivityC = value;
    }

    /**
     * Gets the value of the operatingUnitC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperatingUnitC() {
        return operatingUnitC;
    }

    /**
     * Sets the value of the operatingUnitC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperatingUnitC(JAXBElement<String> value) {
        this.operatingUnitC = value;
    }

    /**
     * Gets the value of the ebsIntegrationStatusC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSIntegrationStatusC() {
        return ebsIntegrationStatusC;
    }

    /**
     * Sets the value of the ebsIntegrationStatusC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSIntegrationStatusC(JAXBElement<String> value) {
        this.ebsIntegrationStatusC = value;
    }

    /**
     * Gets the value of the ebsregistryidc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSREGISTRYIDC() {
        return ebsregistryidc;
    }

    /**
     * Sets the value of the ebsregistryidc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSREGISTRYIDC(JAXBElement<String> value) {
        this.ebsregistryidc = value;
    }

    /**
     * Gets the value of the ebscustacctnumc property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSCUSTACCTNUMC() {
        return ebscustacctnumc;
    }

    /**
     * Sets the value of the ebscustacctnumc property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSCUSTACCTNUMC(JAXBElement<String> value) {
        this.ebscustacctnumc = value;
    }

    /**
     * Gets the value of the ebsPartyIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSPartyIdC() {
        return ebsPartyIdC;
    }

    /**
     * Sets the value of the ebsPartyIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSPartyIdC(JAXBElement<String> value) {
        this.ebsPartyIdC = value;
    }

    /**
     * Gets the value of the ebsAccountIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSAccountIdC() {
        return ebsAccountIdC;
    }

    /**
     * Sets the value of the ebsAccountIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSAccountIdC(JAXBElement<String> value) {
        this.ebsAccountIdC = value;
    }

    /**
     * Gets the value of the ebsAccountNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSAccountNumberC() {
        return ebsAccountNumberC;
    }

    /**
     * Sets the value of the ebsAccountNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSAccountNumberC(JAXBElement<String> value) {
        this.ebsAccountNumberC = value;
    }

    /**
     * Gets the value of the ebsRegIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSRegIdC() {
        return ebsRegIdC;
    }

    /**
     * Sets the value of the ebsRegIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSRegIdC(JAXBElement<String> value) {
        this.ebsRegIdC = value;
    }

    /**
     * Gets the value of the relationshipHistoryCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationshipHistoryCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationshipHistoryCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelationshipHistoryC }
     * 
     * 
     */
    public List<RelationshipHistoryC> getRelationshipHistoryCollectionC() {
        if (relationshipHistoryCollectionC == null) {
            relationshipHistoryCollectionC = new ArrayList<RelationshipHistoryC>();
        }
        return this.relationshipHistoryCollectionC;
    }

    /**
     * Gets the value of the revenueHistoryCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenueHistoryCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenueHistoryCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenueHistoryC }
     * 
     * 
     */
    public List<RevenueHistoryC> getRevenueHistoryCollectionC() {
        if (revenueHistoryCollectionC == null) {
            revenueHistoryCollectionC = new ArrayList<RevenueHistoryC>();
        }
        return this.revenueHistoryCollectionC;
    }

    /**
     * Gets the value of the teamCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the teamCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTeamCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TeamC }
     * 
     * 
     */
    public List<TeamC> getTeamCollectionC() {
        if (teamCollectionC == null) {
            teamCollectionC = new ArrayList<TeamC>();
        }
        return this.teamCollectionC;
    }

    /**
     * Gets the value of the historyCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the historyCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHistoryCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HistoryC }
     * 
     * 
     */
    public List<HistoryC> getHistoryCollectionC() {
        if (historyCollectionC == null) {
            historyCollectionC = new ArrayList<HistoryC>();
        }
        return this.historyCollectionC;
    }

}
