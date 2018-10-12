
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
 * <p>Java class for PersonProfile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PersonProfile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PersonProfileId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RequestId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PersonPreNameAdjunct" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonAcademicTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonPreviousLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonInitials" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JgzzFiscalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfBirth" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PlaceOfBirth" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateOfDeath" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeclaredEthnicity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MaritalStatusEffectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PersonalIncomeAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="RentOwnInd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastKnownGPS" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveStartDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EffectiveEndDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="InternalFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreatedByModule" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeceasedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonLastNamePrefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonSecondLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredFunctionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OrigSystemReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EffectiveSequence" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="HeadOfHouseholdFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HouseholdIncomeAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="HouseholdSize" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EffectiveLatestChange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SuffixOverriddenFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UniqueNameSuffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CorpCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurcyConvRateType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Salutation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertReasonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CertificationLevel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactPersonId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
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
 *         &lt;element name="PrimaryLanguage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PreferredContactURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
 *         &lt;element name="PrimaryAddressState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ValidatedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrimaryAddressLocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FavoriteContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Distance" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesAffinityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesBuyingRoleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Department" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DoNotCallFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DoNotContactFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DoNotEmailFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DoNotMailFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastContactDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="PrimaryCustomerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryCustomerRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryCustomerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastSourceUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdateSourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataCloudStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastEnrichmentDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PersonInformation" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/flex/person/}PersonInformation" minOccurs="0"/>
 *         &lt;element name="EmployeeID_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Language_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Language_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="Department_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Languages_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Languages_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ChineseName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GermanName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MailType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallTypes_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CallTypes_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Retired_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Referenceable_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Deceased_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SourceOfContact_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactTypes_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactTypes_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSID_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LastUpdated_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerEmailID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactLegacySystemID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackEndLastUpdatedDate_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Disclaimer_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptoutDisclaimer_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="BackendContactActivityCount_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="AlternateNamesCollection_c" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}AlternateNames_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactProjectsCollection_c" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}ContactProjects_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactsDistributionListCollection_c" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}ContactsDistributionList_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ContactTeamCollection_c" type="{http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/}ContactTeam_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonProfile", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", propOrder = {
    "personProfileId",
    "partyId",
    "personName",
    "lastUpdateDate",
    "lastUpdatedBy",
    "creationDate",
    "createdBy",
    "lastUpdateLogin",
    "requestId",
    "personPreNameAdjunct",
    "personFirstName",
    "personMiddleName",
    "personLastName",
    "personNameSuffix",
    "personTitle",
    "personAcademicTitle",
    "personPreviousLastName",
    "personInitials",
    "jgzzFiscalCode",
    "dateOfBirth",
    "placeOfBirth",
    "dateOfDeath",
    "gender",
    "declaredEthnicity",
    "maritalStatus",
    "maritalStatusEffectiveDate",
    "personalIncomeAmount",
    "rentOwnInd",
    "lastKnownGPS",
    "effectiveStartDate",
    "effectiveEndDate",
    "internalFlag",
    "status",
    "createdByModule",
    "deceasedFlag",
    "comments",
    "personLastNamePrefix",
    "personSecondLastName",
    "preferredFunctionalCurrency",
    "origSystem",
    "origSystemReference",
    "effectiveSequence",
    "headOfHouseholdFlag",
    "householdIncomeAmount",
    "householdSize",
    "effectiveLatestChange",
    "suffixOverriddenFlag",
    "uniqueNameSuffix",
    "corpCurrencyCode",
    "curcyConvRateType",
    "currencyCode",
    "partyNumber",
    "salutation",
    "certReasonCode",
    "certificationLevel",
    "preferredContactMethod",
    "preferredContactPersonId",
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
    "primaryLanguage",
    "partyUniqueName",
    "primaryAddressPostalCode",
    "preferredContactEmail",
    "preferredContactName",
    "preferredContactPhone",
    "preferredContactURL",
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
    "primaryAddressState",
    "primaryURL",
    "validatedFlag",
    "primaryAddressLatitude",
    "primaryAddressLongitude",
    "primaryAddressLocationId",
    "favoriteContactFlag",
    "distance",
    "salesAffinityCode",
    "salesBuyingRoleCode",
    "departmentCode",
    "department",
    "jobTitleCode",
    "jobTitle",
    "doNotCallFlag",
    "doNotContactFlag",
    "doNotEmailFlag",
    "doNotMailFlag",
    "lastContactDate",
    "primaryCustomerId",
    "primaryCustomerRelationshipId",
    "primaryCustomerName",
    "lastSourceUpdateDate",
    "lastUpdateSourceSystem",
    "dataCloudStatus",
    "lastEnrichmentDate",
    "personInformation",
    "employeeIDC",
    "languageC",
    "languageCMeaning",
    "descriptionC",
    "departmentC",
    "languagesC",
    "languagesCMeaning",
    "chineseNameC",
    "germanNameC",
    "emailTypeC",
    "emailTypeCMeaning",
    "callTypeC",
    "callTypeCMeaning",
    "mailTypeC",
    "mailTypeCMeaning",
    "callTypesC",
    "callTypesCMeaning",
    "retiredC",
    "referenceableC",
    "deceasedC",
    "sourceOfContactC",
    "contactTypeC",
    "contactTypeCMeaning",
    "contactTypesC",
    "contactTypesCMeaning",
    "contactIDC",
    "ebsidc",
    "lastUpdatedC",
    "ownerEmailIDC",
    "contactLegacySystemIDC",
    "backEndLastUpdatedDateC",
    "disclaimerC",
    "optoutDisclaimerC",
    "backendContactActivityCountC",
    "alternateNamesCollectionC",
    "contactProjectsCollectionC",
    "contactsDistributionListCollectionC",
    "contactTeamCollectionC"
})
public class PersonProfile {

    @XmlElement(name = "PersonProfileId")
    protected Long personProfileId;
    @XmlElement(name = "PartyId")
    protected Long partyId;
    @XmlElementRef(name = "PersonName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personName;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElementRef(name = "RequestId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> requestId;
    @XmlElementRef(name = "PersonPreNameAdjunct", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personPreNameAdjunct;
    @XmlElementRef(name = "PersonFirstName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personFirstName;
    @XmlElementRef(name = "PersonMiddleName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personMiddleName;
    @XmlElementRef(name = "PersonLastName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personLastName;
    @XmlElementRef(name = "PersonNameSuffix", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personNameSuffix;
    @XmlElementRef(name = "PersonTitle", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personTitle;
    @XmlElementRef(name = "PersonAcademicTitle", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personAcademicTitle;
    @XmlElementRef(name = "PersonPreviousLastName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personPreviousLastName;
    @XmlElementRef(name = "PersonInitials", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personInitials;
    @XmlElementRef(name = "JgzzFiscalCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jgzzFiscalCode;
    @XmlElementRef(name = "DateOfBirth", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfBirth;
    @XmlElementRef(name = "PlaceOfBirth", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> placeOfBirth;
    @XmlElementRef(name = "DateOfDeath", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> dateOfDeath;
    @XmlElementRef(name = "Gender", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gender;
    @XmlElementRef(name = "DeclaredEthnicity", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> declaredEthnicity;
    @XmlElementRef(name = "MaritalStatus", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> maritalStatus;
    @XmlElementRef(name = "MaritalStatusEffectiveDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> maritalStatusEffectiveDate;
    @XmlElementRef(name = "PersonalIncomeAmount", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> personalIncomeAmount;
    @XmlElementRef(name = "RentOwnInd", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rentOwnInd;
    @XmlElementRef(name = "LastKnownGPS", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastKnownGPS;
    @XmlElement(name = "EffectiveStartDate")
    protected XMLGregorianCalendar effectiveStartDate;
    @XmlElement(name = "EffectiveEndDate")
    protected XMLGregorianCalendar effectiveEndDate;
    @XmlElementRef(name = "InternalFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> internalFlag;
    @XmlElementRef(name = "Status", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> status;
    @XmlElement(name = "CreatedByModule")
    protected String createdByModule;
    @XmlElement(name = "DeceasedFlag")
    protected Boolean deceasedFlag;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "PersonLastNamePrefix", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personLastNamePrefix;
    @XmlElementRef(name = "PersonSecondLastName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> personSecondLastName;
    @XmlElementRef(name = "PreferredFunctionalCurrency", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredFunctionalCurrency;
    @XmlElementRef(name = "OrigSystem", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origSystem;
    @XmlElementRef(name = "OrigSystemReference", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> origSystemReference;
    @XmlElement(name = "EffectiveSequence")
    protected Integer effectiveSequence;
    @XmlElementRef(name = "HeadOfHouseholdFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> headOfHouseholdFlag;
    @XmlElementRef(name = "HouseholdIncomeAmount", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> householdIncomeAmount;
    @XmlElementRef(name = "HouseholdSize", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> householdSize;
    @XmlElement(name = "EffectiveLatestChange")
    protected String effectiveLatestChange;
    @XmlElementRef(name = "SuffixOverriddenFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> suffixOverriddenFlag;
    @XmlElementRef(name = "UniqueNameSuffix", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> uniqueNameSuffix;
    @XmlElementRef(name = "CorpCurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> corpCurrencyCode;
    @XmlElementRef(name = "CurcyConvRateType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> curcyConvRateType;
    @XmlElementRef(name = "CurrencyCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> currencyCode;
    @XmlElement(name = "PartyNumber")
    protected String partyNumber;
    @XmlElementRef(name = "Salutation", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salutation;
    @XmlElementRef(name = "CertReasonCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certReasonCode;
    @XmlElementRef(name = "CertificationLevel", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> certificationLevel;
    @XmlElementRef(name = "PreferredContactMethod", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactMethod;
    @XmlElementRef(name = "PreferredContactPersonId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> preferredContactPersonId;
    @XmlElementRef(name = "PrimaryAddressLine1", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressLine1;
    @XmlElementRef(name = "PrimaryAddressLine2", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressLine2;
    @XmlElementRef(name = "PrimaryAddressLine3", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressLine3;
    @XmlElementRef(name = "PrimaryAddressLine4", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressLine4;
    @XmlElementRef(name = "Alias", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> alias;
    @XmlElementRef(name = "PrimaryAddressCity", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressCity;
    @XmlElementRef(name = "PrimaryAddressCountry", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressCountry;
    @XmlElementRef(name = "PrimaryAddressCounty", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressCounty;
    @XmlElementRef(name = "PrimaryEmailAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryEmailAddress;
    @XmlElementRef(name = "PrimaryFormattedAddress", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryFormattedAddress;
    @XmlElementRef(name = "PrimaryFormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryFormattedPhoneNumber;
    @XmlElementRef(name = "PrimaryLanguage", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryLanguage;
    @XmlElement(name = "PartyUniqueName")
    protected String partyUniqueName;
    @XmlElementRef(name = "PrimaryAddressPostalCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressPostalCode;
    @XmlElementRef(name = "PreferredContactEmail", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactEmail;
    @XmlElementRef(name = "PreferredContactName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactName;
    @XmlElementRef(name = "PreferredContactPhone", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactPhone;
    @XmlElementRef(name = "PreferredContactURL", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredContactURL;
    @XmlElementRef(name = "PreferredName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredName;
    @XmlElementRef(name = "PreferredNameId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> preferredNameId;
    @XmlElementRef(name = "PrimaryEmailId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryEmailId;
    @XmlElementRef(name = "PrimaryPhoneAreaCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhoneAreaCode;
    @XmlElementRef(name = "PrimaryPhoneId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryPhoneId;
    @XmlElementRef(name = "PrimaryPhoneCountryCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhoneCountryCode;
    @XmlElementRef(name = "PrimaryPhoneExtension", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhoneExtension;
    @XmlElementRef(name = "PrimaryPhoneLineType", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhoneLineType;
    @XmlElementRef(name = "PrimaryPhoneNumber", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhoneNumber;
    @XmlElementRef(name = "PrimaryPhonePurpose", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryPhonePurpose;
    @XmlElementRef(name = "PrimaryWebId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryWebId;
    @XmlElementRef(name = "Pronunciation", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> pronunciation;
    @XmlElementRef(name = "PrimaryAddressProvince", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressProvince;
    @XmlElementRef(name = "PrimaryAddressState", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAddressState;
    @XmlElementRef(name = "PrimaryURL", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryURL;
    @XmlElementRef(name = "ValidatedFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> validatedFlag;
    @XmlElementRef(name = "PrimaryAddressLatitude", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> primaryAddressLatitude;
    @XmlElementRef(name = "PrimaryAddressLongitude", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> primaryAddressLongitude;
    @XmlElement(name = "PrimaryAddressLocationId")
    protected Long primaryAddressLocationId;
    @XmlElementRef(name = "FavoriteContactFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> favoriteContactFlag;
    @XmlElementRef(name = "Distance", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> distance;
    @XmlElementRef(name = "SalesAffinityCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAffinityCode;
    @XmlElementRef(name = "SalesBuyingRoleCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesBuyingRoleCode;
    @XmlElementRef(name = "DepartmentCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentCode;
    @XmlElementRef(name = "Department", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> department;
    @XmlElementRef(name = "JobTitleCode", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobTitleCode;
    @XmlElementRef(name = "JobTitle", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> jobTitle;
    @XmlElementRef(name = "DoNotCallFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> doNotCallFlag;
    @XmlElementRef(name = "DoNotContactFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> doNotContactFlag;
    @XmlElementRef(name = "DoNotEmailFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> doNotEmailFlag;
    @XmlElementRef(name = "DoNotMailFlag", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> doNotMailFlag;
    @XmlElementRef(name = "LastContactDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastContactDate;
    @XmlElementRef(name = "PrimaryCustomerId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryCustomerId;
    @XmlElementRef(name = "PrimaryCustomerRelationshipId", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryCustomerRelationshipId;
    @XmlElementRef(name = "PrimaryCustomerName", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryCustomerName;
    @XmlElementRef(name = "LastSourceUpdateDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastSourceUpdateDate;
    @XmlElementRef(name = "LastUpdateSourceSystem", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateSourceSystem;
    @XmlElementRef(name = "DataCloudStatus", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dataCloudStatus;
    @XmlElementRef(name = "LastEnrichmentDate", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastEnrichmentDate;
    @XmlElement(name = "PersonInformation")
    protected PersonInformation personInformation;
    @XmlElementRef(name = "EmployeeID_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> employeeIDC;
    @XmlElementRef(name = "Language_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languageC;
    @XmlElementRef(name = "Language_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languageCMeaning;
    @XmlElementRef(name = "Description_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> descriptionC;
    @XmlElementRef(name = "Department_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> departmentC;
    @XmlElementRef(name = "Languages_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languagesC;
    @XmlElementRef(name = "Languages_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> languagesCMeaning;
    @XmlElementRef(name = "ChineseName_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> chineseNameC;
    @XmlElementRef(name = "GermanName_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> germanNameC;
    @XmlElementRef(name = "EmailType_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailTypeC;
    @XmlElementRef(name = "EmailType_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailTypeCMeaning;
    @XmlElementRef(name = "CallType_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callTypeC;
    @XmlElementRef(name = "CallType_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callTypeCMeaning;
    @XmlElementRef(name = "MailType_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailTypeC;
    @XmlElementRef(name = "MailType_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mailTypeCMeaning;
    @XmlElementRef(name = "CallTypes_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callTypesC;
    @XmlElementRef(name = "CallTypes_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> callTypesCMeaning;
    @XmlElement(name = "Retired_c")
    protected Boolean retiredC;
    @XmlElement(name = "Referenceable_c")
    protected Boolean referenceableC;
    @XmlElement(name = "Deceased_c")
    protected Boolean deceasedC;
    @XmlElementRef(name = "SourceOfContact_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sourceOfContactC;
    @XmlElementRef(name = "ContactType_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactTypeC;
    @XmlElementRef(name = "ContactType_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactTypeCMeaning;
    @XmlElementRef(name = "ContactTypes_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactTypesC;
    @XmlElementRef(name = "ContactTypes_cMeaning", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactTypesCMeaning;
    @XmlElementRef(name = "ContactID_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactIDC;
    @XmlElementRef(name = "EBSID_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ebsidc;
    @XmlElementRef(name = "LastUpdated_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdatedC;
    @XmlElementRef(name = "OwnerEmailID_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ownerEmailIDC;
    @XmlElementRef(name = "ContactLegacySystemID_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactLegacySystemIDC;
    @XmlElementRef(name = "BackEndLastUpdatedDate_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backEndLastUpdatedDateC;
    @XmlElementRef(name = "Disclaimer_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> disclaimerC;
    @XmlElementRef(name = "OptoutDisclaimer_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> optoutDisclaimerC;
    @XmlElementRef(name = "BackendContactActivityCount_c", namespace = "http://xmlns.oracle.com/apps/cdm/foundation/parties/personService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> backendContactActivityCountC;
    @XmlElement(name = "AlternateNamesCollection_c")
    protected List<AlternateNamesC> alternateNamesCollectionC;
    @XmlElement(name = "ContactProjectsCollection_c")
    protected List<ContactProjectsC> contactProjectsCollectionC;
    @XmlElement(name = "ContactsDistributionListCollection_c")
    protected List<ContactsDistributionListC> contactsDistributionListCollectionC;
    @XmlElement(name = "ContactTeamCollection_c")
    protected List<ContactTeamC> contactTeamCollectionC;

    /**
     * Gets the value of the personProfileId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPersonProfileId() {
        return personProfileId;
    }

    /**
     * Sets the value of the personProfileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPersonProfileId(Long value) {
        this.personProfileId = value;
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
     * Gets the value of the personName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonName() {
        return personName;
    }

    /**
     * Sets the value of the personName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonName(JAXBElement<String> value) {
        this.personName = value;
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
     * Gets the value of the personPreNameAdjunct property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonPreNameAdjunct() {
        return personPreNameAdjunct;
    }

    /**
     * Sets the value of the personPreNameAdjunct property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonPreNameAdjunct(JAXBElement<String> value) {
        this.personPreNameAdjunct = value;
    }

    /**
     * Gets the value of the personFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonFirstName() {
        return personFirstName;
    }

    /**
     * Sets the value of the personFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonFirstName(JAXBElement<String> value) {
        this.personFirstName = value;
    }

    /**
     * Gets the value of the personMiddleName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonMiddleName() {
        return personMiddleName;
    }

    /**
     * Sets the value of the personMiddleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonMiddleName(JAXBElement<String> value) {
        this.personMiddleName = value;
    }

    /**
     * Gets the value of the personLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonLastName() {
        return personLastName;
    }

    /**
     * Sets the value of the personLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonLastName(JAXBElement<String> value) {
        this.personLastName = value;
    }

    /**
     * Gets the value of the personNameSuffix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonNameSuffix() {
        return personNameSuffix;
    }

    /**
     * Sets the value of the personNameSuffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonNameSuffix(JAXBElement<String> value) {
        this.personNameSuffix = value;
    }

    /**
     * Gets the value of the personTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonTitle() {
        return personTitle;
    }

    /**
     * Sets the value of the personTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonTitle(JAXBElement<String> value) {
        this.personTitle = value;
    }

    /**
     * Gets the value of the personAcademicTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonAcademicTitle() {
        return personAcademicTitle;
    }

    /**
     * Sets the value of the personAcademicTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonAcademicTitle(JAXBElement<String> value) {
        this.personAcademicTitle = value;
    }

    /**
     * Gets the value of the personPreviousLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonPreviousLastName() {
        return personPreviousLastName;
    }

    /**
     * Sets the value of the personPreviousLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonPreviousLastName(JAXBElement<String> value) {
        this.personPreviousLastName = value;
    }

    /**
     * Gets the value of the personInitials property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonInitials() {
        return personInitials;
    }

    /**
     * Sets the value of the personInitials property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonInitials(JAXBElement<String> value) {
        this.personInitials = value;
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
     * Gets the value of the dateOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Sets the value of the dateOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfBirth(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfBirth = value;
    }

    /**
     * Gets the value of the placeOfBirth property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * Sets the value of the placeOfBirth property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPlaceOfBirth(JAXBElement<String> value) {
        this.placeOfBirth = value;
    }

    /**
     * Gets the value of the dateOfDeath property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getDateOfDeath() {
        return dateOfDeath;
    }

    /**
     * Sets the value of the dateOfDeath property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setDateOfDeath(JAXBElement<XMLGregorianCalendar> value) {
        this.dateOfDeath = value;
    }

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGender() {
        return gender;
    }

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGender(JAXBElement<String> value) {
        this.gender = value;
    }

    /**
     * Gets the value of the declaredEthnicity property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeclaredEthnicity() {
        return declaredEthnicity;
    }

    /**
     * Sets the value of the declaredEthnicity property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeclaredEthnicity(JAXBElement<String> value) {
        this.declaredEthnicity = value;
    }

    /**
     * Gets the value of the maritalStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Sets the value of the maritalStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMaritalStatus(JAXBElement<String> value) {
        this.maritalStatus = value;
    }

    /**
     * Gets the value of the maritalStatusEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getMaritalStatusEffectiveDate() {
        return maritalStatusEffectiveDate;
    }

    /**
     * Sets the value of the maritalStatusEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setMaritalStatusEffectiveDate(JAXBElement<XMLGregorianCalendar> value) {
        this.maritalStatusEffectiveDate = value;
    }

    /**
     * Gets the value of the personalIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getPersonalIncomeAmount() {
        return personalIncomeAmount;
    }

    /**
     * Sets the value of the personalIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setPersonalIncomeAmount(JAXBElement<AmountType> value) {
        this.personalIncomeAmount = value;
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
     * Gets the value of the lastKnownGPS property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastKnownGPS() {
        return lastKnownGPS;
    }

    /**
     * Sets the value of the lastKnownGPS property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastKnownGPS(JAXBElement<String> value) {
        this.lastKnownGPS = value;
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
     * Gets the value of the deceasedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeceasedFlag() {
        return deceasedFlag;
    }

    /**
     * Sets the value of the deceasedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeceasedFlag(Boolean value) {
        this.deceasedFlag = value;
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
     * Gets the value of the personLastNamePrefix property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonLastNamePrefix() {
        return personLastNamePrefix;
    }

    /**
     * Sets the value of the personLastNamePrefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonLastNamePrefix(JAXBElement<String> value) {
        this.personLastNamePrefix = value;
    }

    /**
     * Gets the value of the personSecondLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPersonSecondLastName() {
        return personSecondLastName;
    }

    /**
     * Sets the value of the personSecondLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPersonSecondLastName(JAXBElement<String> value) {
        this.personSecondLastName = value;
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
     * Gets the value of the headOfHouseholdFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getHeadOfHouseholdFlag() {
        return headOfHouseholdFlag;
    }

    /**
     * Sets the value of the headOfHouseholdFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setHeadOfHouseholdFlag(JAXBElement<Boolean> value) {
        this.headOfHouseholdFlag = value;
    }

    /**
     * Gets the value of the householdIncomeAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getHouseholdIncomeAmount() {
        return householdIncomeAmount;
    }

    /**
     * Sets the value of the householdIncomeAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setHouseholdIncomeAmount(JAXBElement<AmountType> value) {
        this.householdIncomeAmount = value;
    }

    /**
     * Gets the value of the householdSize property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHouseholdSize() {
        return householdSize;
    }

    /**
     * Sets the value of the householdSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHouseholdSize(JAXBElement<BigDecimal> value) {
        this.householdSize = value;
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
     * Gets the value of the salutation property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalutation() {
        return salutation;
    }

    /**
     * Sets the value of the salutation property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalutation(JAXBElement<String> value) {
        this.salutation = value;
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
     * Gets the value of the preferredContactEmail property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactEmail() {
        return preferredContactEmail;
    }

    /**
     * Sets the value of the preferredContactEmail property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactEmail(JAXBElement<String> value) {
        this.preferredContactEmail = value;
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
     * Gets the value of the preferredContactPhone property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactPhone() {
        return preferredContactPhone;
    }

    /**
     * Sets the value of the preferredContactPhone property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactPhone(JAXBElement<String> value) {
        this.preferredContactPhone = value;
    }

    /**
     * Gets the value of the preferredContactURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPreferredContactURL() {
        return preferredContactURL;
    }

    /**
     * Sets the value of the preferredContactURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPreferredContactURL(JAXBElement<String> value) {
        this.preferredContactURL = value;
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
     * Gets the value of the primaryAddressLatitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrimaryAddressLatitude() {
        return primaryAddressLatitude;
    }

    /**
     * Sets the value of the primaryAddressLatitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrimaryAddressLatitude(JAXBElement<BigDecimal> value) {
        this.primaryAddressLatitude = value;
    }

    /**
     * Gets the value of the primaryAddressLongitude property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrimaryAddressLongitude() {
        return primaryAddressLongitude;
    }

    /**
     * Sets the value of the primaryAddressLongitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrimaryAddressLongitude(JAXBElement<BigDecimal> value) {
        this.primaryAddressLongitude = value;
    }

    /**
     * Gets the value of the primaryAddressLocationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryAddressLocationId() {
        return primaryAddressLocationId;
    }

    /**
     * Sets the value of the primaryAddressLocationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryAddressLocationId(Long value) {
        this.primaryAddressLocationId = value;
    }

    /**
     * Gets the value of the favoriteContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getFavoriteContactFlag() {
        return favoriteContactFlag;
    }

    /**
     * Sets the value of the favoriteContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setFavoriteContactFlag(JAXBElement<Boolean> value) {
        this.favoriteContactFlag = value;
    }

    /**
     * Gets the value of the distance property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getDistance() {
        return distance;
    }

    /**
     * Sets the value of the distance property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setDistance(JAXBElement<BigDecimal> value) {
        this.distance = value;
    }

    /**
     * Gets the value of the salesAffinityCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAffinityCode() {
        return salesAffinityCode;
    }

    /**
     * Sets the value of the salesAffinityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAffinityCode(JAXBElement<String> value) {
        this.salesAffinityCode = value;
    }

    /**
     * Gets the value of the salesBuyingRoleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesBuyingRoleCode() {
        return salesBuyingRoleCode;
    }

    /**
     * Sets the value of the salesBuyingRoleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesBuyingRoleCode(JAXBElement<String> value) {
        this.salesBuyingRoleCode = value;
    }

    /**
     * Gets the value of the departmentCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartmentCode() {
        return departmentCode;
    }

    /**
     * Sets the value of the departmentCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartmentCode(JAXBElement<String> value) {
        this.departmentCode = value;
    }

    /**
     * Gets the value of the department property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDepartment() {
        return department;
    }

    /**
     * Sets the value of the department property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDepartment(JAXBElement<String> value) {
        this.department = value;
    }

    /**
     * Gets the value of the jobTitleCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobTitleCode() {
        return jobTitleCode;
    }

    /**
     * Sets the value of the jobTitleCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobTitleCode(JAXBElement<String> value) {
        this.jobTitleCode = value;
    }

    /**
     * Gets the value of the jobTitle property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the value of the jobTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setJobTitle(JAXBElement<String> value) {
        this.jobTitle = value;
    }

    /**
     * Gets the value of the doNotCallFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDoNotCallFlag() {
        return doNotCallFlag;
    }

    /**
     * Sets the value of the doNotCallFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDoNotCallFlag(JAXBElement<Boolean> value) {
        this.doNotCallFlag = value;
    }

    /**
     * Gets the value of the doNotContactFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDoNotContactFlag() {
        return doNotContactFlag;
    }

    /**
     * Sets the value of the doNotContactFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDoNotContactFlag(JAXBElement<Boolean> value) {
        this.doNotContactFlag = value;
    }

    /**
     * Gets the value of the doNotEmailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDoNotEmailFlag() {
        return doNotEmailFlag;
    }

    /**
     * Sets the value of the doNotEmailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDoNotEmailFlag(JAXBElement<Boolean> value) {
        this.doNotEmailFlag = value;
    }

    /**
     * Gets the value of the doNotMailFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDoNotMailFlag() {
        return doNotMailFlag;
    }

    /**
     * Sets the value of the doNotMailFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDoNotMailFlag(JAXBElement<Boolean> value) {
        this.doNotMailFlag = value;
    }

    /**
     * Gets the value of the lastContactDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastContactDate() {
        return lastContactDate;
    }

    /**
     * Sets the value of the lastContactDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastContactDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastContactDate = value;
    }

    /**
     * Gets the value of the primaryCustomerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryCustomerId() {
        return primaryCustomerId;
    }

    /**
     * Sets the value of the primaryCustomerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryCustomerId(JAXBElement<Long> value) {
        this.primaryCustomerId = value;
    }

    /**
     * Gets the value of the primaryCustomerRelationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryCustomerRelationshipId() {
        return primaryCustomerRelationshipId;
    }

    /**
     * Sets the value of the primaryCustomerRelationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryCustomerRelationshipId(JAXBElement<Long> value) {
        this.primaryCustomerRelationshipId = value;
    }

    /**
     * Gets the value of the primaryCustomerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryCustomerName() {
        return primaryCustomerName;
    }

    /**
     * Sets the value of the primaryCustomerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryCustomerName(JAXBElement<String> value) {
        this.primaryCustomerName = value;
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
     * Gets the value of the personInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PersonInformation }
     *     
     */
    public PersonInformation getPersonInformation() {
        return personInformation;
    }

    /**
     * Sets the value of the personInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonInformation }
     *     
     */
    public void setPersonInformation(PersonInformation value) {
        this.personInformation = value;
    }

    /**
     * Gets the value of the employeeIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEmployeeIDC() {
        return employeeIDC;
    }

    /**
     * Sets the value of the employeeIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEmployeeIDC(JAXBElement<BigDecimal> value) {
        this.employeeIDC = value;
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
     * Gets the value of the descriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getDescriptionC() {
        return descriptionC;
    }

    /**
     * Sets the value of the descriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setDescriptionC(JAXBElement<byte[]> value) {
        this.descriptionC = value;
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
     * Gets the value of the chineseNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getChineseNameC() {
        return chineseNameC;
    }

    /**
     * Sets the value of the chineseNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setChineseNameC(JAXBElement<String> value) {
        this.chineseNameC = value;
    }

    /**
     * Gets the value of the germanNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGermanNameC() {
        return germanNameC;
    }

    /**
     * Sets the value of the germanNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGermanNameC(JAXBElement<String> value) {
        this.germanNameC = value;
    }

    /**
     * Gets the value of the emailTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailTypeC() {
        return emailTypeC;
    }

    /**
     * Sets the value of the emailTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailTypeC(JAXBElement<String> value) {
        this.emailTypeC = value;
    }

    /**
     * Gets the value of the emailTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailTypeCMeaning() {
        return emailTypeCMeaning;
    }

    /**
     * Sets the value of the emailTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailTypeCMeaning(JAXBElement<String> value) {
        this.emailTypeCMeaning = value;
    }

    /**
     * Gets the value of the callTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallTypeC() {
        return callTypeC;
    }

    /**
     * Sets the value of the callTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallTypeC(JAXBElement<String> value) {
        this.callTypeC = value;
    }

    /**
     * Gets the value of the callTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallTypeCMeaning() {
        return callTypeCMeaning;
    }

    /**
     * Sets the value of the callTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallTypeCMeaning(JAXBElement<String> value) {
        this.callTypeCMeaning = value;
    }

    /**
     * Gets the value of the mailTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailTypeC() {
        return mailTypeC;
    }

    /**
     * Sets the value of the mailTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailTypeC(JAXBElement<String> value) {
        this.mailTypeC = value;
    }

    /**
     * Gets the value of the mailTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMailTypeCMeaning() {
        return mailTypeCMeaning;
    }

    /**
     * Sets the value of the mailTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMailTypeCMeaning(JAXBElement<String> value) {
        this.mailTypeCMeaning = value;
    }

    /**
     * Gets the value of the callTypesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallTypesC() {
        return callTypesC;
    }

    /**
     * Sets the value of the callTypesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallTypesC(JAXBElement<String> value) {
        this.callTypesC = value;
    }

    /**
     * Gets the value of the callTypesCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCallTypesCMeaning() {
        return callTypesCMeaning;
    }

    /**
     * Sets the value of the callTypesCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCallTypesCMeaning(JAXBElement<String> value) {
        this.callTypesCMeaning = value;
    }

    /**
     * Gets the value of the retiredC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRetiredC() {
        return retiredC;
    }

    /**
     * Sets the value of the retiredC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRetiredC(Boolean value) {
        this.retiredC = value;
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
     * Gets the value of the sourceOfContactC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSourceOfContactC() {
        return sourceOfContactC;
    }

    /**
     * Sets the value of the sourceOfContactC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSourceOfContactC(JAXBElement<String> value) {
        this.sourceOfContactC = value;
    }

    /**
     * Gets the value of the contactTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactTypeC() {
        return contactTypeC;
    }

    /**
     * Sets the value of the contactTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactTypeC(JAXBElement<String> value) {
        this.contactTypeC = value;
    }

    /**
     * Gets the value of the contactTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactTypeCMeaning() {
        return contactTypeCMeaning;
    }

    /**
     * Sets the value of the contactTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactTypeCMeaning(JAXBElement<String> value) {
        this.contactTypeCMeaning = value;
    }

    /**
     * Gets the value of the contactTypesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactTypesC() {
        return contactTypesC;
    }

    /**
     * Sets the value of the contactTypesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactTypesC(JAXBElement<String> value) {
        this.contactTypesC = value;
    }

    /**
     * Gets the value of the contactTypesCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactTypesCMeaning() {
        return contactTypesCMeaning;
    }

    /**
     * Sets the value of the contactTypesCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactTypesCMeaning(JAXBElement<String> value) {
        this.contactTypesCMeaning = value;
    }

    /**
     * Gets the value of the contactIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactIDC() {
        return contactIDC;
    }

    /**
     * Sets the value of the contactIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactIDC(JAXBElement<String> value) {
        this.contactIDC = value;
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
     * Gets the value of the lastUpdatedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLastUpdatedC() {
        return lastUpdatedC;
    }

    /**
     * Sets the value of the lastUpdatedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLastUpdatedC(JAXBElement<String> value) {
        this.lastUpdatedC = value;
    }

    /**
     * Gets the value of the ownerEmailIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOwnerEmailIDC() {
        return ownerEmailIDC;
    }

    /**
     * Sets the value of the ownerEmailIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOwnerEmailIDC(JAXBElement<String> value) {
        this.ownerEmailIDC = value;
    }

    /**
     * Gets the value of the contactLegacySystemIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContactLegacySystemIDC() {
        return contactLegacySystemIDC;
    }

    /**
     * Sets the value of the contactLegacySystemIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContactLegacySystemIDC(JAXBElement<String> value) {
        this.contactLegacySystemIDC = value;
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
     * Gets the value of the disclaimerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDisclaimerC() {
        return disclaimerC;
    }

    /**
     * Sets the value of the disclaimerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDisclaimerC(JAXBElement<String> value) {
        this.disclaimerC = value;
    }

    /**
     * Gets the value of the optoutDisclaimerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getOptoutDisclaimerC() {
        return optoutDisclaimerC;
    }

    /**
     * Sets the value of the optoutDisclaimerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setOptoutDisclaimerC(JAXBElement<byte[]> value) {
        this.optoutDisclaimerC = value;
    }

    /**
     * Gets the value of the backendContactActivityCountC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBackendContactActivityCountC() {
        return backendContactActivityCountC;
    }

    /**
     * Sets the value of the backendContactActivityCountC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBackendContactActivityCountC(JAXBElement<BigDecimal> value) {
        this.backendContactActivityCountC = value;
    }

    /**
     * Gets the value of the alternateNamesCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternateNamesCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternateNamesCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternateNamesC }
     * 
     * 
     */
    public List<AlternateNamesC> getAlternateNamesCollectionC() {
        if (alternateNamesCollectionC == null) {
            alternateNamesCollectionC = new ArrayList<AlternateNamesC>();
        }
        return this.alternateNamesCollectionC;
    }

    /**
     * Gets the value of the contactProjectsCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactProjectsCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactProjectsCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactProjectsC }
     * 
     * 
     */
    public List<ContactProjectsC> getContactProjectsCollectionC() {
        if (contactProjectsCollectionC == null) {
            contactProjectsCollectionC = new ArrayList<ContactProjectsC>();
        }
        return this.contactProjectsCollectionC;
    }

    /**
     * Gets the value of the contactsDistributionListCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactsDistributionListCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactsDistributionListCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactsDistributionListC }
     * 
     * 
     */
    public List<ContactsDistributionListC> getContactsDistributionListCollectionC() {
        if (contactsDistributionListCollectionC == null) {
            contactsDistributionListCollectionC = new ArrayList<ContactsDistributionListC>();
        }
        return this.contactsDistributionListCollectionC;
    }

    /**
     * Gets the value of the contactTeamCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contactTeamCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContactTeamCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactTeamC }
     * 
     * 
     */
    public List<ContactTeamC> getContactTeamCollectionC() {
        if (contactTeamCollectionC == null) {
            contactTeamCollectionC = new ArrayList<ContactTeamC>();
        }
        return this.contactTeamCollectionC;
    }

}
