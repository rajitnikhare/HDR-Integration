
package com.hdr.ws.stubs.opportunity;

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
 * <p>Java class for Opportunity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Opportunity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BudgetAvailableDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="BudgetedFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ChampionFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConflictId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesMethodId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesStageId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="CustomerAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DealHorizonCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DealHorizonCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="DecisionLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DecisionLevelCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="LastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastUpdateLogin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OptyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OwnerResourcePartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryCompetitorId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="KeyContactId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReasonWonLostCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReasonWonLostCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RiskLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskLevelCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StatusCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="StrategicLevelCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StrategicLevelCodeSetId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryRevenueId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="TargetPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="UserLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="TargetPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DUNSNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesMethodEOObjVerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SalesStage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DescriptionText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AverageDaysAtStage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="MaximumDaysInStage" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PhaseCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QuotaFactor" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RcmndWinProb" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StageStatusCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StgOrder" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SalesStageEOObjVerNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="EffectiveDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="Revenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RevenueType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RevnId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="EmployeesTotal" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CurrentFyPotentialRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WinProb" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ObjectVersionNumber1" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactPartyId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="PrimaryContactFormattedPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LocationId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="FormattedAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BdgtAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrSrcNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DownsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="UpsideAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastAssignedDate" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="LookupCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LookupValuesId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyCreationDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ExpectAmount" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PreferredFunctionalCurrency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrConRelationshipId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="OptyCreatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrmConversionRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CrmRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RevnLineSetEnabledFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OptyLastUpdateDate" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="OptyLastUpdatedBy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesChannelCd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LineOfBusinessCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhonePreferenceExistsFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartyUniqueName1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryOrganizationName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesAccountId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="SalesAccountUniqueName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConsumerLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryContactLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPartnerOrgPartyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryPartnerId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="RegistrationStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RegistrationType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Registered" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="UpdateFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DeleteFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OpportunityContact" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityContact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ChildRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}Revenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Note" type="{http://xmlns.oracle.com/apps/crmCommon/notes/noteService}Note" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityReference" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityReference" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityCompetitor2" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityCompetitor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityCompetitor3" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityCompetitor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityResource" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityResource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunitySource1" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunitySource" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityLead" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityLead" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityResponse" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityResponse" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenueTerritory" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RevenueTerritory" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenuePartnerPrimary" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RevenuePartner" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RevenueLineSet" type="{http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/}RevenueLineSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CategorySummaryRevenue" type="{http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/}CategorySummaryRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Appointment" type="{http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/}TransientAppointment" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="SplitRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}SplitRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RecurringRevenue" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/}RecurringRevenue" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityDeal" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityDeal" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PrimaryClient_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrimaryClient_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryModel_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryModel_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Confidential_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Description_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="BusinessUnit_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessUnit_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectCountry_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectCountry_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClass_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessClass_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HDRRole_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HDRRole_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectLocation_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContractType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timing_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Timing_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PursuitBdgtNo_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MarketSector_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSector_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportLevel_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportRole_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AwardType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OfFirmsAwarded_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SolicitationNumber_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ARRAFunded_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARRAFunded_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAICSCode_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="StartDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EndDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="NoTermLimit_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="TotalContractCapacity_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NoCapacityLimit_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HDRPotentialCapacitynet_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="UnableToPredict_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="HDRPotentialCapacitygross_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="GrossForecast_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetForecast_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ConstructionCost_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ContractNumber_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MasterContract_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Contract_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Booked_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalAwaitNTP_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalFeeChange_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Involvement_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Awardee_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Descriptions_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillableCompanyAddress_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="PrimaryCompanyAddress_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="RFQDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RFPReleaseDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RFPDueDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="RFPOwner_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Confidence_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="SupportType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectionProcess_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SelectionProcess_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RiskCommitteeSignOffDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="GrossForecasts_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="GrossForecasts_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GrossForecasts_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="NetForecasts_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="NetForecasts_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NetForecasts_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HDRPotentialCapacityGrosss_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="HDRPotentialCapacityGrosss_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HDRPotentialCapacityGrosss_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="HDRPotentialCapacityNets_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="HDRPotentialCapacityNets_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HDRPotentialCapacityNets_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ConstructionCosts_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ConstructionCosts_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConstructionCosts_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Contracts_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="Contracts_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contracts_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Bookeds_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="Bookeds_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Bookeds_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalAwaitNTPs_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalAwaitNTPs_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalAwaitNTPs_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TotalFeeChanges_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalFeeChanges_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalFeeChanges_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Forecast_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SectorBusinessGroup_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectorBusinessGroup_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalContractCapacitys_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="TotalContractCapacitys_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TotalContractCapacitys_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="WinLossReason_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillableCompanyId_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrimaryCompanyId_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DebriefComments_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="ActualCloseDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ForecastDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="HDRDivision_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FalloutReason_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FalloutReason_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectorType_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectorType_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectorBusinessGroups_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectorBusinessGroups_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSectors_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketSectors_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubMarkets_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SubMarkets_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WinProbability_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="WinProbability_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SectorTypes_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Competitor_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Competitor_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectManager_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectManager_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingChargeNumber_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EstimatedProjectStartDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="EstimatedProjectEndDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PotentialFee_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="PotentialFee_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PotentialFee_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FirmsAwardedMasterContract_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Federal_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Master_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AwardTypes_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AwardTypes_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateProvince_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StateProvince_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Masterfederal_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ConfidenceS_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConfidenceS_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectManagers_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ProjectManagers_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportLevels_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SupportLevels_cMeaning" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ARRAFundeds_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Amount_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="Amount_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Amount_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="DesignCompetition_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ProjectConstructionCost_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="ProjectConstructionCost_cCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectConstructionCost_cCurcyConvRate" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ContractNumbers_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SolicitationNumbers_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cities_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSOpportunityID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DeliveryMethod_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityLegacySystemID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackEndLastUpdatedDate_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Notes_c" type="{http://xmlns.oracle.com/adf/svc/types/}base64Binary-DataHandler" minOccurs="0"/>
 *         &lt;element name="ContractName_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ContractName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAICSCodes_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NAICSDescription_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AreaOfReach_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MSA_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BackendOptyCreationCount_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="BackendActivityName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MasterOpportunity_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MasterOpportunity_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackEndStatusCheck_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstimatedNetFees_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="EstimatedGrossFees_c" type="{http://xmlns.oracle.com/adf/svc/types/}AmountType" minOccurs="0"/>
 *         &lt;element name="GoNoGo_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OperatingUnit_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectManagerforReporting_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Integration_c" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="BusinessGroup_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSProjectID_Id_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="EBSProjectID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectName_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BackendEmailFromProjectManager_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EstBookingDate_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="ProjectManagerEffectiveStartDa_c" type="{http://xmlns.oracle.com/adf/svc/types/}dateTime-Timestamp" minOccurs="0"/>
 *         &lt;element name="ProjectManagerEffectiveStart_c" type="{http://xmlns.oracle.com/adf/svc/types/}date-Date" minOccurs="0"/>
 *         &lt;element name="PursuitProjectNumber_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountForReporting_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Currency_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="USDRateforReporting_c" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="OpportunityId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MarketingChargeNumbers_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EBSPursuitProjectId_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryAccountID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BillableAccountID_c" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedOpportunitiesCollection_c" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}RelatedOpportunities_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CompetitorCollection_c" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}Competitor_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PartnersJointBidsCollection_c" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}PartnersJointBids_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="OpportunityForecastCollection_c" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}OpportunityForecast_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ProjectLocationCollection_c" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}ProjectLocation_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ApproversCollection_c" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}Approvers_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PursuitMilestonesCollection_c" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}PursuitMilestones_c" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="EmployeeCollection_c" type="{http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/}Employeess_c" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Opportunity", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", propOrder = {
    "budgetAvailableDate",
    "budgetedFlag",
    "primaryOrganizationId",
    "championFlag",
    "conflictId",
    "createdBy",
    "creationDate",
    "currencyCode",
    "salesMethodId",
    "salesStageId",
    "customerAccountId",
    "dealHorizonCode",
    "dealHorizonCodeSetId",
    "decisionLevelCode",
    "decisionLevelCodeSetId",
    "description",
    "lastUpdateDate",
    "lastUpdatedBy",
    "lastUpdateLogin",
    "name",
    "objectVersionNumber",
    "optyId",
    "optyNumber",
    "ownerResourcePartyId",
    "primaryCompetitorId",
    "keyContactId",
    "reasonWonLostCode",
    "reasonWonLostCodeSetId",
    "riskLevelCode",
    "riskLevelCodeSetId",
    "statusCode",
    "statusCodeSetId",
    "strategicLevelCode",
    "strategicLevelCodeSetId",
    "primaryRevenueId",
    "targetPartyId",
    "userLastUpdateDate",
    "targetPartyName",
    "dunsNumber",
    "salesMethod",
    "salesMethodEOObjVerNumber",
    "salesStage",
    "descriptionText",
    "averageDaysAtStage",
    "maximumDaysInStage",
    "phaseCd",
    "quotaFactor",
    "rcmndWinProb",
    "stageStatusCd",
    "stgOrder",
    "salesStageEOObjVerNumber",
    "effectiveDate",
    "revenue",
    "revenueType",
    "revnId",
    "employeesTotal",
    "currentFyPotentialRevenue",
    "winProb",
    "objectVersionNumber1",
    "primaryContactPartyName",
    "primaryContactPartyId",
    "primaryContactFormattedPhoneNumber",
    "primaryContactEmailAddress",
    "accountNumber",
    "partyName",
    "locationId",
    "formattedAddress",
    "city",
    "country",
    "postalCode",
    "state",
    "bdgtAmount",
    "comments",
    "partyName1",
    "prSrcNumber",
    "downsideAmount",
    "upsideAmount",
    "emailAddress",
    "lastAssignedDate",
    "lookupCategory",
    "lookupValuesId",
    "optyCreationDate",
    "expectAmount",
    "preferredFunctionalCurrency",
    "partyUniqueName",
    "prConRelationshipId",
    "optyCreatedBy",
    "crmConversionRate",
    "crmRevenue",
    "revnLineSetEnabledFlag",
    "partyType",
    "optyLastUpdateDate",
    "optyLastUpdatedBy",
    "salesChannelCd",
    "lineOfBusinessCode",
    "phonePreferenceExistsFlag",
    "partyUniqueName1",
    "primaryOrganizationName",
    "salesAccountId",
    "salesAccountUniqueName",
    "consumerFirstName",
    "consumerLastName",
    "primaryContactFirstName",
    "primaryContactLastName",
    "primaryPartnerOrgPartyName",
    "primaryPartnerId",
    "registrationStatus",
    "registrationType",
    "registered",
    "updateFlag",
    "deleteFlag",
    "opportunityContact",
    "childRevenue",
    "note",
    "opportunityReference",
    "opportunityCompetitor2",
    "opportunityCompetitor3",
    "opportunityResource",
    "opportunitySource1",
    "opportunityLead",
    "opportunityResponse",
    "revenueTerritory",
    "revenuePartnerPrimary",
    "revenueLineSet",
    "categorySummaryRevenue",
    "appointment",
    "splitRevenue",
    "recurringRevenue",
    "opportunityDeal",
    "primaryClientIdC",
    "primaryClientC",
    "deliveryModelC",
    "deliveryModelCMeaning",
    "confidentialC",
    "descriptionC",
    "businessUnitC",
    "businessUnitCMeaning",
    "projectCountryC",
    "projectCountryCMeaning",
    "businessClassC",
    "businessClassCMeaning",
    "hdrRoleC",
    "hdrRoleCMeaning",
    "projectLocationC",
    "contractTypeC",
    "contractTypeCMeaning",
    "companyC",
    "timingC",
    "timingCMeaning",
    "pursuitBdgtNoC",
    "marketSectorC",
    "marketSectorCMeaning",
    "supportLevelC",
    "supportRoleC",
    "awardTypeC",
    "ofFirmsAwardedC",
    "solicitationNumberC",
    "arraFundedC",
    "arraFundedCMeaning",
    "naicsCodeC",
    "startDateC",
    "endDateC",
    "noTermLimitC",
    "totalContractCapacityC",
    "noCapacityLimitC",
    "hdrPotentialCapacitynetC",
    "unableToPredictC",
    "hdrPotentialCapacitygrossC",
    "grossForecastC",
    "netForecastC",
    "constructionCostC",
    "contractNumberC",
    "masterContractC",
    "contractC",
    "bookedC",
    "totalAwaitNTPC",
    "totalFeeChangeC",
    "involvementC",
    "awardeeC",
    "descriptionsC",
    "billableCompanyAddressC",
    "primaryCompanyAddressC",
    "rfqDateC",
    "rfpReleaseDateC",
    "rfpDueDateC",
    "rfpOwnerC",
    "confidenceC",
    "supportTypeC",
    "selectionProcessC",
    "selectionProcessCMeaning",
    "riskCommitteeSignOffDateC",
    "grossForecastsC",
    "grossForecastsCCurrencyCode",
    "grossForecastsCCurcyConvRate",
    "netForecastsC",
    "netForecastsCCurrencyCode",
    "netForecastsCCurcyConvRate",
    "hdrPotentialCapacityGrosssC",
    "hdrPotentialCapacityGrosssCCurrencyCode",
    "hdrPotentialCapacityGrosssCCurcyConvRate",
    "hdrPotentialCapacityNetsC",
    "hdrPotentialCapacityNetsCCurrencyCode",
    "hdrPotentialCapacityNetsCCurcyConvRate",
    "constructionCostsC",
    "constructionCostsCCurrencyCode",
    "constructionCostsCCurcyConvRate",
    "contractsC",
    "contractsCCurrencyCode",
    "contractsCCurcyConvRate",
    "bookedsC",
    "bookedsCCurrencyCode",
    "bookedsCCurcyConvRate",
    "totalAwaitNTPsC",
    "totalAwaitNTPsCCurrencyCode",
    "totalAwaitNTPsCCurcyConvRate",
    "totalFeeChangesC",
    "totalFeeChangesCCurrencyCode",
    "totalFeeChangesCCurcyConvRate",
    "forecastC",
    "sectorBusinessGroupC",
    "sectorBusinessGroupCMeaning",
    "totalContractCapacitysC",
    "totalContractCapacitysCCurrencyCode",
    "totalContractCapacitysCCurcyConvRate",
    "winLossReasonC",
    "billableCompanyIdC",
    "primaryCompanyIdC",
    "debriefCommentsC",
    "actualCloseDateC",
    "forecastDateC",
    "hdrDivisionC",
    "falloutReasonC",
    "falloutReasonCMeaning",
    "sectorTypeC",
    "sectorTypeCMeaning",
    "sectorBusinessGroupsC",
    "sectorBusinessGroupsCMeaning",
    "marketSectorsC",
    "marketSectorsCMeaning",
    "subMarketsC",
    "subMarketsCMeaning",
    "winProbabilityC",
    "winProbabilityCMeaning",
    "sectorTypesC",
    "competitorIdC",
    "competitorC",
    "projectManagerIdC",
    "projectManagerC",
    "marketingChargeNumberC",
    "estimatedProjectStartDateC",
    "estimatedProjectEndDateC",
    "potentialFeeC",
    "potentialFeeCCurrencyCode",
    "potentialFeeCCurcyConvRate",
    "firmsAwardedMasterContractC",
    "federalC",
    "masterC",
    "awardTypesC",
    "awardTypesCMeaning",
    "stateProvinceC",
    "stateProvinceCMeaning",
    "cityC",
    "cityCMeaning",
    "masterfederalC",
    "confidenceSC",
    "confidenceSCMeaning",
    "projectManagersIdC",
    "projectManagersC",
    "supportLevelsC",
    "supportLevelsCMeaning",
    "arraFundedsC",
    "amountC",
    "amountCCurrencyCode",
    "amountCCurcyConvRate",
    "designCompetitionC",
    "projectConstructionCostC",
    "projectConstructionCostCCurrencyCode",
    "projectConstructionCostCCurcyConvRate",
    "contractNumbersC",
    "solicitationNumbersC",
    "citiesC",
    "ebsOpportunityIDC",
    "countyC",
    "deliveryMethodC",
    "latitudeC",
    "longitudeC",
    "opportunityLegacySystemIDC",
    "backEndLastUpdatedDateC",
    "notesC",
    "contractNameIdC",
    "contractNameC",
    "naicsCodesC",
    "naicsDescriptionC",
    "areaOfReachC",
    "msac",
    "backendOptyCreationCountC",
    "backendActivityNameC",
    "masterOpportunityIdC",
    "masterOpportunityC",
    "backEndStatusCheckC",
    "estimatedNetFeesC",
    "estimatedGrossFeesC",
    "goNoGoC",
    "operatingUnitC",
    "projectManagerforReportingC",
    "integrationC",
    "businessGroupC",
    "ebsProjectIDIdC",
    "ebsProjectIDC",
    "projectNameC",
    "backendEmailFromProjectManagerC",
    "estBookingDateC",
    "projectManagerEffectiveStartDaC",
    "projectManagerEffectiveStartC",
    "pursuitProjectNumberC",
    "primaryAccountForReportingC",
    "currencyC",
    "usdRateforReportingC",
    "opportunityIdC",
    "marketingChargeNumbersC",
    "ebsPursuitProjectIdC",
    "primaryAccountIDC",
    "billableAccountIDC",
    "relatedOpportunitiesCollectionC",
    "competitorCollectionC",
    "partnersJointBidsCollectionC",
    "opportunityForecastCollectionC",
    "projectLocationCollectionC",
    "approversCollectionC",
    "pursuitMilestonesCollectionC",
    "employeeCollectionC"
})
public class Opportunity {

    @XmlElementRef(name = "BudgetAvailableDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> budgetAvailableDate;
    @XmlElementRef(name = "BudgetedFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> budgetedFlag;
    @XmlElement(name = "PrimaryOrganizationId")
    protected Long primaryOrganizationId;
    @XmlElement(name = "ChampionFlag")
    protected Boolean championFlag;
    @XmlElement(name = "ConflictId")
    protected Long conflictId;
    @XmlElement(name = "CreatedBy")
    protected String createdBy;
    @XmlElement(name = "CreationDate")
    protected XMLGregorianCalendar creationDate;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElementRef(name = "SalesMethodId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> salesMethodId;
    @XmlElementRef(name = "SalesStageId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> salesStageId;
    @XmlElementRef(name = "CustomerAccountId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> customerAccountId;
    @XmlElementRef(name = "DealHorizonCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dealHorizonCode;
    @XmlElementRef(name = "DealHorizonCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> dealHorizonCodeSetId;
    @XmlElementRef(name = "DecisionLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> decisionLevelCode;
    @XmlElementRef(name = "DecisionLevelCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> decisionLevelCodeSetId;
    @XmlElementRef(name = "Description", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElement(name = "LastUpdateDate")
    protected XMLGregorianCalendar lastUpdateDate;
    @XmlElement(name = "LastUpdatedBy")
    protected String lastUpdatedBy;
    @XmlElementRef(name = "LastUpdateLogin", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastUpdateLogin;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "ObjectVersionNumber")
    protected Integer objectVersionNumber;
    @XmlElement(name = "OptyId")
    protected Long optyId;
    @XmlElement(name = "OptyNumber")
    protected String optyNumber;
    @XmlElement(name = "OwnerResourcePartyId")
    protected Long ownerResourcePartyId;
    @XmlElementRef(name = "PrimaryCompetitorId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryCompetitorId;
    @XmlElementRef(name = "KeyContactId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> keyContactId;
    @XmlElementRef(name = "ReasonWonLostCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> reasonWonLostCode;
    @XmlElementRef(name = "ReasonWonLostCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> reasonWonLostCodeSetId;
    @XmlElementRef(name = "RiskLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> riskLevelCode;
    @XmlElementRef(name = "RiskLevelCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> riskLevelCodeSetId;
    @XmlElementRef(name = "StatusCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusCode;
    @XmlElementRef(name = "StatusCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> statusCodeSetId;
    @XmlElementRef(name = "StrategicLevelCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> strategicLevelCode;
    @XmlElementRef(name = "StrategicLevelCodeSetId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> strategicLevelCodeSetId;
    @XmlElementRef(name = "PrimaryRevenueId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryRevenueId;
    @XmlElementRef(name = "TargetPartyId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> targetPartyId;
    @XmlElementRef(name = "UserLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> userLastUpdateDate;
    @XmlElement(name = "TargetPartyName")
    protected String targetPartyName;
    @XmlElementRef(name = "DUNSNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dunsNumber;
    @XmlElementRef(name = "SalesMethod", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesMethod;
    @XmlElement(name = "SalesMethodEOObjVerNumber")
    protected Integer salesMethodEOObjVerNumber;
    @XmlElement(name = "SalesStage")
    protected String salesStage;
    @XmlElementRef(name = "DescriptionText", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionText;
    @XmlElementRef(name = "AverageDaysAtStage", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> averageDaysAtStage;
    @XmlElementRef(name = "MaximumDaysInStage", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> maximumDaysInStage;
    @XmlElement(name = "PhaseCd")
    protected String phaseCd;
    @XmlElement(name = "QuotaFactor")
    protected BigDecimal quotaFactor;
    @XmlElementRef(name = "RcmndWinProb", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> rcmndWinProb;
    @XmlElementRef(name = "StageStatusCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stageStatusCd;
    @XmlElement(name = "StgOrder")
    protected BigDecimal stgOrder;
    @XmlElement(name = "SalesStageEOObjVerNumber")
    protected Integer salesStageEOObjVerNumber;
    @XmlElementRef(name = "EffectiveDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> effectiveDate;
    @XmlElementRef(name = "Revenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> revenue;
    @XmlElementRef(name = "RevenueType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> revenueType;
    @XmlElement(name = "RevnId")
    protected Long revnId;
    @XmlElementRef(name = "EmployeesTotal", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> employeesTotal;
    @XmlElementRef(name = "CurrentFyPotentialRevenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> currentFyPotentialRevenue;
    @XmlElementRef(name = "WinProb", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> winProb;
    @XmlElement(name = "ObjectVersionNumber1")
    protected Integer objectVersionNumber1;
    @XmlElement(name = "PrimaryContactPartyName")
    protected String primaryContactPartyName;
    @XmlElement(name = "PrimaryContactPartyId")
    protected Long primaryContactPartyId;
    @XmlElementRef(name = "PrimaryContactFormattedPhoneNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactFormattedPhoneNumber;
    @XmlElementRef(name = "PrimaryContactEmailAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactEmailAddress;
    @XmlElementRef(name = "AccountNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountNumber;
    @XmlElement(name = "PartyName")
    protected String partyName;
    @XmlElement(name = "LocationId")
    protected Long locationId;
    @XmlElementRef(name = "FormattedAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> formattedAddress;
    @XmlElementRef(name = "City", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElementRef(name = "PostalCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "State", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "BdgtAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> bdgtAmount;
    @XmlElementRef(name = "Comments", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElement(name = "PartyName1")
    protected String partyName1;
    @XmlElementRef(name = "PrSrcNumber", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prSrcNumber;
    @XmlElementRef(name = "DownsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> downsideAmount;
    @XmlElementRef(name = "UpsideAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> upsideAmount;
    @XmlElementRef(name = "EmailAddress", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> emailAddress;
    @XmlElementRef(name = "LastAssignedDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastAssignedDate;
    @XmlElementRef(name = "LookupCategory", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lookupCategory;
    @XmlElementRef(name = "LookupValuesId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> lookupValuesId;
    @XmlElementRef(name = "OptyCreationDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> optyCreationDate;
    @XmlElementRef(name = "ExpectAmount", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> expectAmount;
    @XmlElementRef(name = "PreferredFunctionalCurrency", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> preferredFunctionalCurrency;
    @XmlElementRef(name = "PartyUniqueName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyUniqueName;
    @XmlElementRef(name = "PrConRelationshipId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> prConRelationshipId;
    @XmlElementRef(name = "OptyCreatedBy", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> optyCreatedBy;
    @XmlElementRef(name = "CrmConversionRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> crmConversionRate;
    @XmlElementRef(name = "CrmRevenue", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> crmRevenue;
    @XmlElementRef(name = "RevnLineSetEnabledFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> revnLineSetEnabledFlag;
    @XmlElement(name = "PartyType")
    protected String partyType;
    @XmlElementRef(name = "OptyLastUpdateDate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> optyLastUpdateDate;
    @XmlElementRef(name = "OptyLastUpdatedBy", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> optyLastUpdatedBy;
    @XmlElementRef(name = "SalesChannelCd", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesChannelCd;
    @XmlElementRef(name = "LineOfBusinessCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lineOfBusinessCode;
    @XmlElementRef(name = "PhonePreferenceExistsFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> phonePreferenceExistsFlag;
    @XmlElementRef(name = "PartyUniqueName1", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> partyUniqueName1;
    @XmlElement(name = "PrimaryOrganizationName")
    protected String primaryOrganizationName;
    @XmlElementRef(name = "SalesAccountId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> salesAccountId;
    @XmlElementRef(name = "SalesAccountUniqueName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> salesAccountUniqueName;
    @XmlElementRef(name = "ConsumerFirstName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerFirstName;
    @XmlElementRef(name = "ConsumerLastName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> consumerLastName;
    @XmlElementRef(name = "PrimaryContactFirstName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactFirstName;
    @XmlElementRef(name = "PrimaryContactLastName", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryContactLastName;
    @XmlElement(name = "PrimaryPartnerOrgPartyName")
    protected String primaryPartnerOrgPartyName;
    @XmlElementRef(name = "PrimaryPartnerId", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Long> primaryPartnerId;
    @XmlElementRef(name = "RegistrationStatus", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationStatus;
    @XmlElementRef(name = "RegistrationType", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registrationType;
    @XmlElementRef(name = "Registered", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> registered;
    @XmlElementRef(name = "UpdateFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> updateFlag;
    @XmlElementRef(name = "DeleteFlag", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> deleteFlag;
    @XmlElement(name = "OpportunityContact")
    protected List<OpportunityContact> opportunityContact;
    @XmlElement(name = "ChildRevenue")
    protected List<Revenue> childRevenue;
    @XmlElement(name = "Note")
    protected List<Note> note;
    @XmlElement(name = "OpportunityReference")
    protected List<OpportunityReference> opportunityReference;
    @XmlElement(name = "OpportunityCompetitor2")
    protected List<OpportunityCompetitor> opportunityCompetitor2;
    @XmlElement(name = "OpportunityCompetitor3")
    protected List<OpportunityCompetitor> opportunityCompetitor3;
    @XmlElement(name = "OpportunityResource")
    protected List<OpportunityResource> opportunityResource;
    @XmlElement(name = "OpportunitySource1")
    protected List<OpportunitySource> opportunitySource1;
    @XmlElement(name = "OpportunityLead")
    protected List<OpportunityLead> opportunityLead;
    @XmlElement(name = "OpportunityResponse")
    protected List<OpportunityResponse> opportunityResponse;
    @XmlElement(name = "RevenueTerritory")
    protected List<RevenueTerritory> revenueTerritory;
    @XmlElement(name = "RevenuePartnerPrimary")
    protected List<RevenuePartner> revenuePartnerPrimary;
    @XmlElement(name = "RevenueLineSet")
    protected List<RevenueLineSet> revenueLineSet;
    @XmlElement(name = "CategorySummaryRevenue")
    protected List<CategorySummaryRevenue> categorySummaryRevenue;
    @XmlElement(name = "Appointment")
    protected List<TransientAppointment> appointment;
    @XmlElement(name = "SplitRevenue")
    protected List<SplitRevenue> splitRevenue;
    @XmlElement(name = "RecurringRevenue")
    protected List<RecurringRevenue> recurringRevenue;
    @XmlElement(name = "OpportunityDeal")
    protected List<OpportunityDeal> opportunityDeal;
    @XmlElementRef(name = "PrimaryClient_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> primaryClientIdC;
    @XmlElementRef(name = "PrimaryClient_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryClientC;
    @XmlElementRef(name = "DeliveryModel_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryModelC;
    @XmlElementRef(name = "DeliveryModel_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> deliveryModelCMeaning;
    @XmlElement(name = "Confidential_c")
    protected Boolean confidentialC;
    @XmlElement(name = "Description_c")
    protected byte[] descriptionC;
    @XmlElement(name = "BusinessUnit_c")
    protected String businessUnitC;
    @XmlElementRef(name = "BusinessUnit_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessUnitCMeaning;
    @XmlElement(name = "ProjectCountry_c")
    protected String projectCountryC;
    @XmlElementRef(name = "ProjectCountry_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectCountryCMeaning;
    @XmlElement(name = "BusinessClass_c")
    protected String businessClassC;
    @XmlElementRef(name = "BusinessClass_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessClassCMeaning;
    @XmlElement(name = "HDRRole_c")
    protected String hdrRoleC;
    @XmlElementRef(name = "HDRRole_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hdrRoleCMeaning;
    @XmlElementRef(name = "ProjectLocation_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectLocationC;
    @XmlElement(name = "ContractType_c")
    protected String contractTypeC;
    @XmlElementRef(name = "ContractType_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractTypeCMeaning;
    @XmlElementRef(name = "Company_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyC;
    @XmlElementRef(name = "Timing_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timingC;
    @XmlElementRef(name = "Timing_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> timingCMeaning;
    @XmlElementRef(name = "PursuitBdgtNo_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pursuitBdgtNoC;
    @XmlElementRef(name = "MarketSector_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorC;
    @XmlElementRef(name = "MarketSector_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorCMeaning;
    @XmlElementRef(name = "SupportLevel_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportLevelC;
    @XmlElementRef(name = "SupportRole_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportRoleC;
    @XmlElement(name = "AwardType_c")
    protected String awardTypeC;
    @XmlElementRef(name = "OfFirmsAwarded_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ofFirmsAwardedC;
    @XmlElementRef(name = "SolicitationNumber_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> solicitationNumberC;
    @XmlElementRef(name = "ARRAFunded_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arraFundedC;
    @XmlElementRef(name = "ARRAFunded_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> arraFundedCMeaning;
    @XmlElementRef(name = "NAICSCode_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> naicsCodeC;
    @XmlElementRef(name = "StartDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> startDateC;
    @XmlElementRef(name = "EndDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> endDateC;
    @XmlElement(name = "NoTermLimit_c")
    protected Boolean noTermLimitC;
    @XmlElementRef(name = "TotalContractCapacity_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalContractCapacityC;
    @XmlElement(name = "NoCapacityLimit_c")
    protected Boolean noCapacityLimitC;
    @XmlElementRef(name = "HDRPotentialCapacitynet_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hdrPotentialCapacitynetC;
    @XmlElement(name = "UnableToPredict_c")
    protected Boolean unableToPredictC;
    @XmlElementRef(name = "HDRPotentialCapacitygross_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hdrPotentialCapacitygrossC;
    @XmlElementRef(name = "GrossForecast_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> grossForecastC;
    @XmlElementRef(name = "NetForecast_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> netForecastC;
    @XmlElementRef(name = "ConstructionCost_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> constructionCostC;
    @XmlElementRef(name = "ContractNumber_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> contractNumberC;
    @XmlElementRef(name = "MasterContract_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> masterContractC;
    @XmlElementRef(name = "Contract_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> contractC;
    @XmlElementRef(name = "Booked_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> bookedC;
    @XmlElementRef(name = "TotalAwaitNTP_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalAwaitNTPC;
    @XmlElementRef(name = "TotalFeeChange_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalFeeChangeC;
    @XmlElementRef(name = "Involvement_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> involvementC;
    @XmlElement(name = "Awardee_c")
    protected Boolean awardeeC;
    @XmlElementRef(name = "Descriptions_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionsC;
    @XmlElementRef(name = "BillableCompanyAddress_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> billableCompanyAddressC;
    @XmlElementRef(name = "PrimaryCompanyAddress_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> primaryCompanyAddressC;
    @XmlElementRef(name = "RFQDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> rfqDateC;
    @XmlElementRef(name = "RFPReleaseDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> rfpReleaseDateC;
    @XmlElementRef(name = "RFPDueDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> rfpDueDateC;
    @XmlElementRef(name = "RFPOwner_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> rfpOwnerC;
    @XmlElementRef(name = "Confidence_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> confidenceC;
    @XmlElementRef(name = "SupportType_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportTypeC;
    @XmlElement(name = "SelectionProcess_c")
    protected String selectionProcessC;
    @XmlElementRef(name = "SelectionProcess_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> selectionProcessCMeaning;
    @XmlElementRef(name = "RiskCommitteeSignOffDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> riskCommitteeSignOffDateC;
    @XmlElementRef(name = "GrossForecasts_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> grossForecastsC;
    @XmlElementRef(name = "GrossForecasts_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> grossForecastsCCurrencyCode;
    @XmlElementRef(name = "GrossForecasts_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> grossForecastsCCurcyConvRate;
    @XmlElementRef(name = "NetForecasts_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> netForecastsC;
    @XmlElementRef(name = "NetForecasts_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> netForecastsCCurrencyCode;
    @XmlElementRef(name = "NetForecasts_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> netForecastsCCurcyConvRate;
    @XmlElement(name = "HDRPotentialCapacityGrosss_c")
    protected AmountType hdrPotentialCapacityGrosssC;
    @XmlElementRef(name = "HDRPotentialCapacityGrosss_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hdrPotentialCapacityGrosssCCurrencyCode;
    @XmlElementRef(name = "HDRPotentialCapacityGrosss_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hdrPotentialCapacityGrosssCCurcyConvRate;
    @XmlElement(name = "HDRPotentialCapacityNets_c")
    protected AmountType hdrPotentialCapacityNetsC;
    @XmlElementRef(name = "HDRPotentialCapacityNets_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> hdrPotentialCapacityNetsCCurrencyCode;
    @XmlElementRef(name = "HDRPotentialCapacityNets_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> hdrPotentialCapacityNetsCCurcyConvRate;
    @XmlElementRef(name = "ConstructionCosts_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> constructionCostsC;
    @XmlElementRef(name = "ConstructionCosts_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> constructionCostsCCurrencyCode;
    @XmlElementRef(name = "ConstructionCosts_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> constructionCostsCCurcyConvRate;
    @XmlElementRef(name = "Contracts_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> contractsC;
    @XmlElementRef(name = "Contracts_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractsCCurrencyCode;
    @XmlElementRef(name = "Contracts_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> contractsCCurcyConvRate;
    @XmlElementRef(name = "Bookeds_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> bookedsC;
    @XmlElementRef(name = "Bookeds_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> bookedsCCurrencyCode;
    @XmlElementRef(name = "Bookeds_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> bookedsCCurcyConvRate;
    @XmlElementRef(name = "TotalAwaitNTPs_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalAwaitNTPsC;
    @XmlElementRef(name = "TotalAwaitNTPs_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalAwaitNTPsCCurrencyCode;
    @XmlElementRef(name = "TotalAwaitNTPs_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalAwaitNTPsCCurcyConvRate;
    @XmlElementRef(name = "TotalFeeChanges_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> totalFeeChangesC;
    @XmlElementRef(name = "TotalFeeChanges_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalFeeChangesCCurrencyCode;
    @XmlElementRef(name = "TotalFeeChanges_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalFeeChangesCCurcyConvRate;
    @XmlElement(name = "Forecast_c")
    protected Boolean forecastC;
    @XmlElementRef(name = "SectorBusinessGroup_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectorBusinessGroupC;
    @XmlElementRef(name = "SectorBusinessGroup_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectorBusinessGroupCMeaning;
    @XmlElement(name = "TotalContractCapacitys_c")
    protected AmountType totalContractCapacitysC;
    @XmlElementRef(name = "TotalContractCapacitys_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> totalContractCapacitysCCurrencyCode;
    @XmlElementRef(name = "TotalContractCapacitys_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalContractCapacitysCCurcyConvRate;
    @XmlElementRef(name = "WinLossReason_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> winLossReasonC;
    @XmlElementRef(name = "BillableCompanyId_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> billableCompanyIdC;
    @XmlElementRef(name = "PrimaryCompanyId_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> primaryCompanyIdC;
    @XmlElementRef(name = "DebriefComments_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> debriefCommentsC;
    @XmlElementRef(name = "ActualCloseDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> actualCloseDateC;
    @XmlElementRef(name = "ForecastDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> forecastDateC;
    @XmlElement(name = "HDRDivision_c")
    protected String hdrDivisionC;
    @XmlElementRef(name = "FalloutReason_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> falloutReasonC;
    @XmlElementRef(name = "FalloutReason_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> falloutReasonCMeaning;
    @XmlElementRef(name = "SectorType_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectorTypeC;
    @XmlElementRef(name = "SectorType_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectorTypeCMeaning;
    @XmlElementRef(name = "SectorBusinessGroups_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectorBusinessGroupsC;
    @XmlElementRef(name = "SectorBusinessGroups_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectorBusinessGroupsCMeaning;
    @XmlElement(name = "MarketSectors_c")
    protected String marketSectorsC;
    @XmlElementRef(name = "MarketSectors_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketSectorsCMeaning;
    @XmlElementRef(name = "SubMarkets_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subMarketsC;
    @XmlElementRef(name = "SubMarkets_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> subMarketsCMeaning;
    @XmlElement(name = "WinProbability_c")
    protected String winProbabilityC;
    @XmlElementRef(name = "WinProbability_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> winProbabilityCMeaning;
    @XmlElementRef(name = "SectorTypes_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sectorTypesC;
    @XmlElementRef(name = "Competitor_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> competitorIdC;
    @XmlElementRef(name = "Competitor_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> competitorC;
    @XmlElementRef(name = "ProjectManager_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectManagerIdC;
    @XmlElementRef(name = "ProjectManager_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectManagerC;
    @XmlElementRef(name = "MarketingChargeNumber_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> marketingChargeNumberC;
    @XmlElement(name = "EstimatedProjectStartDate_c")
    protected XMLGregorianCalendar estimatedProjectStartDateC;
    @XmlElement(name = "EstimatedProjectEndDate_c")
    protected XMLGregorianCalendar estimatedProjectEndDateC;
    @XmlElementRef(name = "PotentialFee_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> potentialFeeC;
    @XmlElementRef(name = "PotentialFee_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> potentialFeeCCurrencyCode;
    @XmlElementRef(name = "PotentialFee_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> potentialFeeCCurcyConvRate;
    @XmlElement(name = "FirmsAwardedMasterContract_c")
    protected String firmsAwardedMasterContractC;
    @XmlElement(name = "Federal_c")
    protected Boolean federalC;
    @XmlElement(name = "Master_c")
    protected Boolean masterC;
    @XmlElementRef(name = "AwardTypes_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> awardTypesC;
    @XmlElementRef(name = "AwardTypes_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> awardTypesCMeaning;
    @XmlElement(name = "StateProvince_c")
    protected String stateProvinceC;
    @XmlElementRef(name = "StateProvince_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> stateProvinceCMeaning;
    @XmlElementRef(name = "City_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityC;
    @XmlElementRef(name = "City_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cityCMeaning;
    @XmlElement(name = "Masterfederal_c")
    protected Boolean masterfederalC;
    @XmlElementRef(name = "ConfidenceS_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> confidenceSC;
    @XmlElementRef(name = "ConfidenceS_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> confidenceSCMeaning;
    @XmlElementRef(name = "ProjectManagers_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectManagersIdC;
    @XmlElementRef(name = "ProjectManagers_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectManagersC;
    @XmlElement(name = "SupportLevels_c")
    protected String supportLevelsC;
    @XmlElementRef(name = "SupportLevels_cMeaning", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> supportLevelsCMeaning;
    @XmlElement(name = "ARRAFundeds_c")
    protected Boolean arraFundedsC;
    @XmlElementRef(name = "Amount_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> amountC;
    @XmlElementRef(name = "Amount_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> amountCCurrencyCode;
    @XmlElementRef(name = "Amount_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> amountCCurcyConvRate;
    @XmlElement(name = "DesignCompetition_c")
    protected Boolean designCompetitionC;
    @XmlElementRef(name = "ProjectConstructionCost_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<AmountType> projectConstructionCostC;
    @XmlElementRef(name = "ProjectConstructionCost_cCurrencyCode", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectConstructionCostCCurrencyCode;
    @XmlElementRef(name = "ProjectConstructionCost_cCurcyConvRate", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> projectConstructionCostCCurcyConvRate;
    @XmlElementRef(name = "ContractNumbers_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractNumbersC;
    @XmlElement(name = "SolicitationNumbers_c")
    protected String solicitationNumbersC;
    @XmlElement(name = "Cities_c")
    protected String citiesC;
    @XmlElementRef(name = "EBSOpportunityID_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsOpportunityIDC;
    @XmlElementRef(name = "County_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> countyC;
    @XmlElement(name = "DeliveryMethod_c")
    protected String deliveryMethodC;
    @XmlElementRef(name = "Latitude_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latitudeC;
    @XmlElementRef(name = "Longitude_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longitudeC;
    @XmlElementRef(name = "OpportunityLegacySystemID_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityLegacySystemIDC;
    @XmlElementRef(name = "BackEndLastUpdatedDate_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backEndLastUpdatedDateC;
    @XmlElementRef(name = "Notes_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> notesC;
    @XmlElementRef(name = "ContractName_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> contractNameIdC;
    @XmlElementRef(name = "ContractName_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contractNameC;
    @XmlElementRef(name = "NAICSCodes_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naicsCodesC;
    @XmlElementRef(name = "NAICSDescription_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> naicsDescriptionC;
    @XmlElementRef(name = "AreaOfReach_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> areaOfReachC;
    @XmlElement(name = "MSA_c")
    protected Boolean msac;
    @XmlElementRef(name = "BackendOptyCreationCount_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> backendOptyCreationCountC;
    @XmlElementRef(name = "BackendActivityName_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backendActivityNameC;
    @XmlElementRef(name = "MasterOpportunity_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> masterOpportunityIdC;
    @XmlElementRef(name = "MasterOpportunity_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> masterOpportunityC;
    @XmlElementRef(name = "BackEndStatusCheck_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backEndStatusCheckC;
    @XmlElement(name = "EstimatedNetFees_c")
    protected AmountType estimatedNetFeesC;
    @XmlElement(name = "EstimatedGrossFees_c")
    protected AmountType estimatedGrossFeesC;
    @XmlElement(name = "GoNoGo_c")
    protected Boolean goNoGoC;
    @XmlElementRef(name = "OperatingUnit_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operatingUnitC;
    @XmlElementRef(name = "ProjectManagerforReporting_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectManagerforReportingC;
    @XmlElement(name = "Integration_c")
    protected Boolean integrationC;
    @XmlElement(name = "BusinessGroup_c")
    protected String businessGroupC;
    @XmlElementRef(name = "EBSProjectID_Id_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> ebsProjectIDIdC;
    @XmlElementRef(name = "EBSProjectID_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsProjectIDC;
    @XmlElementRef(name = "ProjectName_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectNameC;
    @XmlElementRef(name = "BackendEmailFromProjectManager_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> backendEmailFromProjectManagerC;
    @XmlElement(name = "EstBookingDate_c")
    protected XMLGregorianCalendar estBookingDateC;
    @XmlElementRef(name = "ProjectManagerEffectiveStartDa_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> projectManagerEffectiveStartDaC;
    @XmlElementRef(name = "ProjectManagerEffectiveStart_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> projectManagerEffectiveStartC;
    @XmlElementRef(name = "PursuitProjectNumber_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> pursuitProjectNumberC;
    @XmlElementRef(name = "PrimaryAccountForReporting_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAccountForReportingC;
    @XmlElement(name = "Currency_c")
    protected String currencyC;
    @XmlElementRef(name = "USDRateforReporting_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> usdRateforReportingC;
    @XmlElementRef(name = "OpportunityId_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityIdC;
    @XmlElementRef(name = "MarketingChargeNumbers_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> marketingChargeNumbersC;
    @XmlElementRef(name = "EBSPursuitProjectId_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ebsPursuitProjectIdC;
    @XmlElementRef(name = "PrimaryAccountID_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryAccountIDC;
    @XmlElementRef(name = "BillableAccountID_c", namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> billableAccountIDC;
    @XmlElement(name = "RelatedOpportunitiesCollection_c")
    protected List<RelatedOpportunitiesC> relatedOpportunitiesCollectionC;
    @XmlElement(name = "CompetitorCollection_c")
    protected List<CompetitorC> competitorCollectionC;
    @XmlElement(name = "PartnersJointBidsCollection_c")
    protected List<PartnersJointBidsC> partnersJointBidsCollectionC;
    @XmlElement(name = "OpportunityForecastCollection_c")
    protected List<OpportunityForecastC> opportunityForecastCollectionC;
    @XmlElement(name = "ProjectLocationCollection_c")
    protected List<ProjectLocationC> projectLocationCollectionC;
    @XmlElement(name = "ApproversCollection_c")
    protected List<ApproversC> approversCollectionC;
    @XmlElement(name = "PursuitMilestonesCollection_c")
    protected List<PursuitMilestonesC> pursuitMilestonesCollectionC;
    @XmlElement(name = "EmployeeCollection_c")
    protected List<EmployeessC> employeeCollectionC;

    /**
     * Gets the value of the budgetAvailableDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getBudgetAvailableDate() {
        return budgetAvailableDate;
    }

    /**
     * Sets the value of the budgetAvailableDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setBudgetAvailableDate(JAXBElement<XMLGregorianCalendar> value) {
        this.budgetAvailableDate = value;
    }

    /**
     * Gets the value of the budgetedFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getBudgetedFlag() {
        return budgetedFlag;
    }

    /**
     * Sets the value of the budgetedFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setBudgetedFlag(JAXBElement<Boolean> value) {
        this.budgetedFlag = value;
    }

    /**
     * Gets the value of the primaryOrganizationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryOrganizationId() {
        return primaryOrganizationId;
    }

    /**
     * Sets the value of the primaryOrganizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryOrganizationId(Long value) {
        this.primaryOrganizationId = value;
    }

    /**
     * Gets the value of the championFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChampionFlag() {
        return championFlag;
    }

    /**
     * Sets the value of the championFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setChampionFlag(Boolean value) {
        this.championFlag = value;
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
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the salesMethodId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSalesMethodId() {
        return salesMethodId;
    }

    /**
     * Sets the value of the salesMethodId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSalesMethodId(JAXBElement<Long> value) {
        this.salesMethodId = value;
    }

    /**
     * Gets the value of the salesStageId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSalesStageId() {
        return salesStageId;
    }

    /**
     * Sets the value of the salesStageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSalesStageId(JAXBElement<Long> value) {
        this.salesStageId = value;
    }

    /**
     * Gets the value of the customerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getCustomerAccountId() {
        return customerAccountId;
    }

    /**
     * Sets the value of the customerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setCustomerAccountId(JAXBElement<Long> value) {
        this.customerAccountId = value;
    }

    /**
     * Gets the value of the dealHorizonCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDealHorizonCode() {
        return dealHorizonCode;
    }

    /**
     * Sets the value of the dealHorizonCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDealHorizonCode(JAXBElement<String> value) {
        this.dealHorizonCode = value;
    }

    /**
     * Gets the value of the dealHorizonCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDealHorizonCodeSetId() {
        return dealHorizonCodeSetId;
    }

    /**
     * Sets the value of the dealHorizonCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDealHorizonCodeSetId(JAXBElement<Long> value) {
        this.dealHorizonCodeSetId = value;
    }

    /**
     * Gets the value of the decisionLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDecisionLevelCode() {
        return decisionLevelCode;
    }

    /**
     * Sets the value of the decisionLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDecisionLevelCode(JAXBElement<String> value) {
        this.decisionLevelCode = value;
    }

    /**
     * Gets the value of the decisionLevelCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getDecisionLevelCodeSetId() {
        return decisionLevelCodeSetId;
    }

    /**
     * Sets the value of the decisionLevelCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setDecisionLevelCodeSetId(JAXBElement<Long> value) {
        this.decisionLevelCodeSetId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the objectVersionNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber() {
        return objectVersionNumber;
    }

    /**
     * Sets the value of the objectVersionNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber(Integer value) {
        this.objectVersionNumber = value;
    }

    /**
     * Gets the value of the optyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOptyId() {
        return optyId;
    }

    /**
     * Sets the value of the optyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOptyId(Long value) {
        this.optyId = value;
    }

    /**
     * Gets the value of the optyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptyNumber() {
        return optyNumber;
    }

    /**
     * Sets the value of the optyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptyNumber(String value) {
        this.optyNumber = value;
    }

    /**
     * Gets the value of the ownerResourcePartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOwnerResourcePartyId() {
        return ownerResourcePartyId;
    }

    /**
     * Sets the value of the ownerResourcePartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOwnerResourcePartyId(Long value) {
        this.ownerResourcePartyId = value;
    }

    /**
     * Gets the value of the primaryCompetitorId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryCompetitorId() {
        return primaryCompetitorId;
    }

    /**
     * Sets the value of the primaryCompetitorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryCompetitorId(JAXBElement<Long> value) {
        this.primaryCompetitorId = value;
    }

    /**
     * Gets the value of the keyContactId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getKeyContactId() {
        return keyContactId;
    }

    /**
     * Sets the value of the keyContactId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setKeyContactId(JAXBElement<Long> value) {
        this.keyContactId = value;
    }

    /**
     * Gets the value of the reasonWonLostCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReasonWonLostCode() {
        return reasonWonLostCode;
    }

    /**
     * Sets the value of the reasonWonLostCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReasonWonLostCode(JAXBElement<String> value) {
        this.reasonWonLostCode = value;
    }

    /**
     * Gets the value of the reasonWonLostCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getReasonWonLostCodeSetId() {
        return reasonWonLostCodeSetId;
    }

    /**
     * Sets the value of the reasonWonLostCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setReasonWonLostCodeSetId(JAXBElement<Long> value) {
        this.reasonWonLostCodeSetId = value;
    }

    /**
     * Gets the value of the riskLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRiskLevelCode() {
        return riskLevelCode;
    }

    /**
     * Sets the value of the riskLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRiskLevelCode(JAXBElement<String> value) {
        this.riskLevelCode = value;
    }

    /**
     * Gets the value of the riskLevelCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getRiskLevelCodeSetId() {
        return riskLevelCodeSetId;
    }

    /**
     * Sets the value of the riskLevelCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setRiskLevelCodeSetId(JAXBElement<Long> value) {
        this.riskLevelCodeSetId = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusCode(JAXBElement<String> value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the statusCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStatusCodeSetId() {
        return statusCodeSetId;
    }

    /**
     * Sets the value of the statusCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStatusCodeSetId(JAXBElement<Long> value) {
        this.statusCodeSetId = value;
    }

    /**
     * Gets the value of the strategicLevelCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStrategicLevelCode() {
        return strategicLevelCode;
    }

    /**
     * Sets the value of the strategicLevelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStrategicLevelCode(JAXBElement<String> value) {
        this.strategicLevelCode = value;
    }

    /**
     * Gets the value of the strategicLevelCodeSetId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getStrategicLevelCodeSetId() {
        return strategicLevelCodeSetId;
    }

    /**
     * Sets the value of the strategicLevelCodeSetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setStrategicLevelCodeSetId(JAXBElement<Long> value) {
        this.strategicLevelCodeSetId = value;
    }

    /**
     * Gets the value of the primaryRevenueId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryRevenueId() {
        return primaryRevenueId;
    }

    /**
     * Sets the value of the primaryRevenueId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryRevenueId(JAXBElement<Long> value) {
        this.primaryRevenueId = value;
    }

    /**
     * Gets the value of the targetPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getTargetPartyId() {
        return targetPartyId;
    }

    /**
     * Sets the value of the targetPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setTargetPartyId(JAXBElement<Long> value) {
        this.targetPartyId = value;
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
     * Gets the value of the targetPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetPartyName() {
        return targetPartyName;
    }

    /**
     * Sets the value of the targetPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetPartyName(String value) {
        this.targetPartyName = value;
    }

    /**
     * Gets the value of the dunsNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDUNSNumber() {
        return dunsNumber;
    }

    /**
     * Sets the value of the dunsNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDUNSNumber(JAXBElement<String> value) {
        this.dunsNumber = value;
    }

    /**
     * Gets the value of the salesMethod property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesMethod() {
        return salesMethod;
    }

    /**
     * Sets the value of the salesMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesMethod(JAXBElement<String> value) {
        this.salesMethod = value;
    }

    /**
     * Gets the value of the salesMethodEOObjVerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesMethodEOObjVerNumber() {
        return salesMethodEOObjVerNumber;
    }

    /**
     * Sets the value of the salesMethodEOObjVerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesMethodEOObjVerNumber(Integer value) {
        this.salesMethodEOObjVerNumber = value;
    }

    /**
     * Gets the value of the salesStage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesStage() {
        return salesStage;
    }

    /**
     * Sets the value of the salesStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesStage(String value) {
        this.salesStage = value;
    }

    /**
     * Gets the value of the descriptionText property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptionText() {
        return descriptionText;
    }

    /**
     * Sets the value of the descriptionText property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptionText(JAXBElement<String> value) {
        this.descriptionText = value;
    }

    /**
     * Gets the value of the averageDaysAtStage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getAverageDaysAtStage() {
        return averageDaysAtStage;
    }

    /**
     * Sets the value of the averageDaysAtStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setAverageDaysAtStage(JAXBElement<Long> value) {
        this.averageDaysAtStage = value;
    }

    /**
     * Gets the value of the maximumDaysInStage property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getMaximumDaysInStage() {
        return maximumDaysInStage;
    }

    /**
     * Sets the value of the maximumDaysInStage property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setMaximumDaysInStage(JAXBElement<Long> value) {
        this.maximumDaysInStage = value;
    }

    /**
     * Gets the value of the phaseCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhaseCd() {
        return phaseCd;
    }

    /**
     * Sets the value of the phaseCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhaseCd(String value) {
        this.phaseCd = value;
    }

    /**
     * Gets the value of the quotaFactor property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuotaFactor() {
        return quotaFactor;
    }

    /**
     * Sets the value of the quotaFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuotaFactor(BigDecimal value) {
        this.quotaFactor = value;
    }

    /**
     * Gets the value of the rcmndWinProb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRcmndWinProb() {
        return rcmndWinProb;
    }

    /**
     * Sets the value of the rcmndWinProb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRcmndWinProb(JAXBElement<BigDecimal> value) {
        this.rcmndWinProb = value;
    }

    /**
     * Gets the value of the stageStatusCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStageStatusCd() {
        return stageStatusCd;
    }

    /**
     * Sets the value of the stageStatusCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStageStatusCd(JAXBElement<String> value) {
        this.stageStatusCd = value;
    }

    /**
     * Gets the value of the stgOrder property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getStgOrder() {
        return stgOrder;
    }

    /**
     * Sets the value of the stgOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setStgOrder(BigDecimal value) {
        this.stgOrder = value;
    }

    /**
     * Gets the value of the salesStageEOObjVerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSalesStageEOObjVerNumber() {
        return salesStageEOObjVerNumber;
    }

    /**
     * Sets the value of the salesStageEOObjVerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSalesStageEOObjVerNumber(Integer value) {
        this.salesStageEOObjVerNumber = value;
    }

    /**
     * Gets the value of the effectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * Sets the value of the effectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEffectiveDate(JAXBElement<XMLGregorianCalendar> value) {
        this.effectiveDate = value;
    }

    /**
     * Gets the value of the revenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getRevenue() {
        return revenue;
    }

    /**
     * Sets the value of the revenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setRevenue(JAXBElement<BigDecimal> value) {
        this.revenue = value;
    }

    /**
     * Gets the value of the revenueType property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRevenueType() {
        return revenueType;
    }

    /**
     * Sets the value of the revenueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRevenueType(JAXBElement<String> value) {
        this.revenueType = value;
    }

    /**
     * Gets the value of the revnId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getRevnId() {
        return revnId;
    }

    /**
     * Sets the value of the revnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setRevnId(Long value) {
        this.revnId = value;
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
     * Gets the value of the currentFyPotentialRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCurrentFyPotentialRevenue() {
        return currentFyPotentialRevenue;
    }

    /**
     * Sets the value of the currentFyPotentialRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCurrentFyPotentialRevenue(JAXBElement<BigDecimal> value) {
        this.currentFyPotentialRevenue = value;
    }

    /**
     * Gets the value of the winProb property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getWinProb() {
        return winProb;
    }

    /**
     * Sets the value of the winProb property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setWinProb(JAXBElement<BigDecimal> value) {
        this.winProb = value;
    }

    /**
     * Gets the value of the objectVersionNumber1 property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getObjectVersionNumber1() {
        return objectVersionNumber1;
    }

    /**
     * Sets the value of the objectVersionNumber1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setObjectVersionNumber1(Integer value) {
        this.objectVersionNumber1 = value;
    }

    /**
     * Gets the value of the primaryContactPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryContactPartyName() {
        return primaryContactPartyName;
    }

    /**
     * Sets the value of the primaryContactPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryContactPartyName(String value) {
        this.primaryContactPartyName = value;
    }

    /**
     * Gets the value of the primaryContactPartyId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPrimaryContactPartyId() {
        return primaryContactPartyId;
    }

    /**
     * Sets the value of the primaryContactPartyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPrimaryContactPartyId(Long value) {
        this.primaryContactPartyId = value;
    }

    /**
     * Gets the value of the primaryContactFormattedPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactFormattedPhoneNumber() {
        return primaryContactFormattedPhoneNumber;
    }

    /**
     * Sets the value of the primaryContactFormattedPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactFormattedPhoneNumber(JAXBElement<String> value) {
        this.primaryContactFormattedPhoneNumber = value;
    }

    /**
     * Gets the value of the primaryContactEmailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactEmailAddress() {
        return primaryContactEmailAddress;
    }

    /**
     * Sets the value of the primaryContactEmailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactEmailAddress(JAXBElement<String> value) {
        this.primaryContactEmailAddress = value;
    }

    /**
     * Gets the value of the accountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAccountNumber() {
        return accountNumber;
    }

    /**
     * Sets the value of the accountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAccountNumber(JAXBElement<String> value) {
        this.accountNumber = value;
    }

    /**
     * Gets the value of the partyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName() {
        return partyName;
    }

    /**
     * Sets the value of the partyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName(String value) {
        this.partyName = value;
    }

    /**
     * Gets the value of the locationId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * Sets the value of the locationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLocationId(Long value) {
        this.locationId = value;
    }

    /**
     * Gets the value of the formattedAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFormattedAddress() {
        return formattedAddress;
    }

    /**
     * Sets the value of the formattedAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFormattedAddress(JAXBElement<String> value) {
        this.formattedAddress = value;
    }

    /**
     * Gets the value of the city property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the bdgtAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBdgtAmount() {
        return bdgtAmount;
    }

    /**
     * Sets the value of the bdgtAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBdgtAmount(JAXBElement<AmountType> value) {
        this.bdgtAmount = value;
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
     * Gets the value of the partyName1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyName1() {
        return partyName1;
    }

    /**
     * Sets the value of the partyName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyName1(String value) {
        this.partyName1 = value;
    }

    /**
     * Gets the value of the prSrcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrSrcNumber() {
        return prSrcNumber;
    }

    /**
     * Sets the value of the prSrcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrSrcNumber(JAXBElement<String> value) {
        this.prSrcNumber = value;
    }

    /**
     * Gets the value of the downsideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getDownsideAmount() {
        return downsideAmount;
    }

    /**
     * Sets the value of the downsideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setDownsideAmount(JAXBElement<AmountType> value) {
        this.downsideAmount = value;
    }

    /**
     * Gets the value of the upsideAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getUpsideAmount() {
        return upsideAmount;
    }

    /**
     * Sets the value of the upsideAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setUpsideAmount(JAXBElement<AmountType> value) {
        this.upsideAmount = value;
    }

    /**
     * Gets the value of the emailAddress property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmailAddress(JAXBElement<String> value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the lastAssignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getLastAssignedDate() {
        return lastAssignedDate;
    }

    /**
     * Sets the value of the lastAssignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setLastAssignedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastAssignedDate = value;
    }

    /**
     * Gets the value of the lookupCategory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLookupCategory() {
        return lookupCategory;
    }

    /**
     * Sets the value of the lookupCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLookupCategory(JAXBElement<String> value) {
        this.lookupCategory = value;
    }

    /**
     * Gets the value of the lookupValuesId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getLookupValuesId() {
        return lookupValuesId;
    }

    /**
     * Sets the value of the lookupValuesId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setLookupValuesId(JAXBElement<Long> value) {
        this.lookupValuesId = value;
    }

    /**
     * Gets the value of the optyCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOptyCreationDate() {
        return optyCreationDate;
    }

    /**
     * Sets the value of the optyCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOptyCreationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.optyCreationDate = value;
    }

    /**
     * Gets the value of the expectAmount property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getExpectAmount() {
        return expectAmount;
    }

    /**
     * Sets the value of the expectAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setExpectAmount(JAXBElement<AmountType> value) {
        this.expectAmount = value;
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
     * Gets the value of the partyUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyUniqueName() {
        return partyUniqueName;
    }

    /**
     * Sets the value of the partyUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyUniqueName(JAXBElement<String> value) {
        this.partyUniqueName = value;
    }

    /**
     * Gets the value of the prConRelationshipId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrConRelationshipId() {
        return prConRelationshipId;
    }

    /**
     * Sets the value of the prConRelationshipId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrConRelationshipId(JAXBElement<Long> value) {
        this.prConRelationshipId = value;
    }

    /**
     * Gets the value of the optyCreatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOptyCreatedBy() {
        return optyCreatedBy;
    }

    /**
     * Sets the value of the optyCreatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOptyCreatedBy(JAXBElement<String> value) {
        this.optyCreatedBy = value;
    }

    /**
     * Gets the value of the crmConversionRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCrmConversionRate() {
        return crmConversionRate;
    }

    /**
     * Sets the value of the crmConversionRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCrmConversionRate(JAXBElement<BigDecimal> value) {
        this.crmConversionRate = value;
    }

    /**
     * Gets the value of the crmRevenue property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCrmRevenue() {
        return crmRevenue;
    }

    /**
     * Sets the value of the crmRevenue property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCrmRevenue(JAXBElement<BigDecimal> value) {
        this.crmRevenue = value;
    }

    /**
     * Gets the value of the revnLineSetEnabledFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getRevnLineSetEnabledFlag() {
        return revnLineSetEnabledFlag;
    }

    /**
     * Sets the value of the revnLineSetEnabledFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setRevnLineSetEnabledFlag(JAXBElement<Boolean> value) {
        this.revnLineSetEnabledFlag = value;
    }

    /**
     * Gets the value of the partyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyType() {
        return partyType;
    }

    /**
     * Sets the value of the partyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyType(String value) {
        this.partyType = value;
    }

    /**
     * Gets the value of the optyLastUpdateDate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getOptyLastUpdateDate() {
        return optyLastUpdateDate;
    }

    /**
     * Sets the value of the optyLastUpdateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setOptyLastUpdateDate(JAXBElement<XMLGregorianCalendar> value) {
        this.optyLastUpdateDate = value;
    }

    /**
     * Gets the value of the optyLastUpdatedBy property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOptyLastUpdatedBy() {
        return optyLastUpdatedBy;
    }

    /**
     * Sets the value of the optyLastUpdatedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOptyLastUpdatedBy(JAXBElement<String> value) {
        this.optyLastUpdatedBy = value;
    }

    /**
     * Gets the value of the salesChannelCd property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesChannelCd() {
        return salesChannelCd;
    }

    /**
     * Sets the value of the salesChannelCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesChannelCd(JAXBElement<String> value) {
        this.salesChannelCd = value;
    }

    /**
     * Gets the value of the lineOfBusinessCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLineOfBusinessCode() {
        return lineOfBusinessCode;
    }

    /**
     * Sets the value of the lineOfBusinessCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLineOfBusinessCode(JAXBElement<String> value) {
        this.lineOfBusinessCode = value;
    }

    /**
     * Gets the value of the phonePreferenceExistsFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getPhonePreferenceExistsFlag() {
        return phonePreferenceExistsFlag;
    }

    /**
     * Sets the value of the phonePreferenceExistsFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setPhonePreferenceExistsFlag(JAXBElement<Boolean> value) {
        this.phonePreferenceExistsFlag = value;
    }

    /**
     * Gets the value of the partyUniqueName1 property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPartyUniqueName1() {
        return partyUniqueName1;
    }

    /**
     * Sets the value of the partyUniqueName1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPartyUniqueName1(JAXBElement<String> value) {
        this.partyUniqueName1 = value;
    }

    /**
     * Gets the value of the primaryOrganizationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryOrganizationName() {
        return primaryOrganizationName;
    }

    /**
     * Sets the value of the primaryOrganizationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryOrganizationName(String value) {
        this.primaryOrganizationName = value;
    }

    /**
     * Gets the value of the salesAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getSalesAccountId() {
        return salesAccountId;
    }

    /**
     * Sets the value of the salesAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setSalesAccountId(JAXBElement<Long> value) {
        this.salesAccountId = value;
    }

    /**
     * Gets the value of the salesAccountUniqueName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSalesAccountUniqueName() {
        return salesAccountUniqueName;
    }

    /**
     * Sets the value of the salesAccountUniqueName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSalesAccountUniqueName(JAXBElement<String> value) {
        this.salesAccountUniqueName = value;
    }

    /**
     * Gets the value of the consumerFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerFirstName() {
        return consumerFirstName;
    }

    /**
     * Sets the value of the consumerFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerFirstName(JAXBElement<String> value) {
        this.consumerFirstName = value;
    }

    /**
     * Gets the value of the consumerLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConsumerLastName() {
        return consumerLastName;
    }

    /**
     * Sets the value of the consumerLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConsumerLastName(JAXBElement<String> value) {
        this.consumerLastName = value;
    }

    /**
     * Gets the value of the primaryContactFirstName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactFirstName() {
        return primaryContactFirstName;
    }

    /**
     * Sets the value of the primaryContactFirstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactFirstName(JAXBElement<String> value) {
        this.primaryContactFirstName = value;
    }

    /**
     * Gets the value of the primaryContactLastName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryContactLastName() {
        return primaryContactLastName;
    }

    /**
     * Sets the value of the primaryContactLastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryContactLastName(JAXBElement<String> value) {
        this.primaryContactLastName = value;
    }

    /**
     * Gets the value of the primaryPartnerOrgPartyName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryPartnerOrgPartyName() {
        return primaryPartnerOrgPartyName;
    }

    /**
     * Sets the value of the primaryPartnerOrgPartyName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryPartnerOrgPartyName(String value) {
        this.primaryPartnerOrgPartyName = value;
    }

    /**
     * Gets the value of the primaryPartnerId property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public JAXBElement<Long> getPrimaryPartnerId() {
        return primaryPartnerId;
    }

    /**
     * Sets the value of the primaryPartnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Long }{@code >}
     *     
     */
    public void setPrimaryPartnerId(JAXBElement<Long> value) {
        this.primaryPartnerId = value;
    }

    /**
     * Gets the value of the registrationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistrationStatus() {
        return registrationStatus;
    }

    /**
     * Sets the value of the registrationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistrationStatus(JAXBElement<String> value) {
        this.registrationStatus = value;
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
     * Gets the value of the registered property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRegistered() {
        return registered;
    }

    /**
     * Sets the value of the registered property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRegistered(JAXBElement<String> value) {
        this.registered = value;
    }

    /**
     * Gets the value of the updateFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getUpdateFlag() {
        return updateFlag;
    }

    /**
     * Sets the value of the updateFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setUpdateFlag(JAXBElement<Boolean> value) {
        this.updateFlag = value;
    }

    /**
     * Gets the value of the deleteFlag property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public JAXBElement<Boolean> getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * Sets the value of the deleteFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     *     
     */
    public void setDeleteFlag(JAXBElement<Boolean> value) {
        this.deleteFlag = value;
    }

    /**
     * Gets the value of the opportunityContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityContact }
     * 
     * 
     */
    public List<OpportunityContact> getOpportunityContact() {
        if (opportunityContact == null) {
            opportunityContact = new ArrayList<OpportunityContact>();
        }
        return this.opportunityContact;
    }

    /**
     * Gets the value of the childRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Revenue }
     * 
     * 
     */
    public List<Revenue> getChildRevenue() {
        if (childRevenue == null) {
            childRevenue = new ArrayList<Revenue>();
        }
        return this.childRevenue;
    }

    /**
     * Gets the value of the note property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the note property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNote().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Note }
     * 
     * 
     */
    public List<Note> getNote() {
        if (note == null) {
            note = new ArrayList<Note>();
        }
        return this.note;
    }

    /**
     * Gets the value of the opportunityReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityReference }
     * 
     * 
     */
    public List<OpportunityReference> getOpportunityReference() {
        if (opportunityReference == null) {
            opportunityReference = new ArrayList<OpportunityReference>();
        }
        return this.opportunityReference;
    }

    /**
     * Gets the value of the opportunityCompetitor2 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityCompetitor2 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityCompetitor2().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityCompetitor }
     * 
     * 
     */
    public List<OpportunityCompetitor> getOpportunityCompetitor2() {
        if (opportunityCompetitor2 == null) {
            opportunityCompetitor2 = new ArrayList<OpportunityCompetitor>();
        }
        return this.opportunityCompetitor2;
    }

    /**
     * Gets the value of the opportunityCompetitor3 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityCompetitor3 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityCompetitor3().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityCompetitor }
     * 
     * 
     */
    public List<OpportunityCompetitor> getOpportunityCompetitor3() {
        if (opportunityCompetitor3 == null) {
            opportunityCompetitor3 = new ArrayList<OpportunityCompetitor>();
        }
        return this.opportunityCompetitor3;
    }

    /**
     * Gets the value of the opportunityResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityResource }
     * 
     * 
     */
    public List<OpportunityResource> getOpportunityResource() {
        if (opportunityResource == null) {
            opportunityResource = new ArrayList<OpportunityResource>();
        }
        return this.opportunityResource;
    }

    /**
     * Gets the value of the opportunitySource1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunitySource1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunitySource1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunitySource }
     * 
     * 
     */
    public List<OpportunitySource> getOpportunitySource1() {
        if (opportunitySource1 == null) {
            opportunitySource1 = new ArrayList<OpportunitySource>();
        }
        return this.opportunitySource1;
    }

    /**
     * Gets the value of the opportunityLead property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityLead property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityLead().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityLead }
     * 
     * 
     */
    public List<OpportunityLead> getOpportunityLead() {
        if (opportunityLead == null) {
            opportunityLead = new ArrayList<OpportunityLead>();
        }
        return this.opportunityLead;
    }

    /**
     * Gets the value of the opportunityResponse property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityResponse property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityResponse }
     * 
     * 
     */
    public List<OpportunityResponse> getOpportunityResponse() {
        if (opportunityResponse == null) {
            opportunityResponse = new ArrayList<OpportunityResponse>();
        }
        return this.opportunityResponse;
    }

    /**
     * Gets the value of the revenueTerritory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenueTerritory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenueTerritory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenueTerritory }
     * 
     * 
     */
    public List<RevenueTerritory> getRevenueTerritory() {
        if (revenueTerritory == null) {
            revenueTerritory = new ArrayList<RevenueTerritory>();
        }
        return this.revenueTerritory;
    }

    /**
     * Gets the value of the revenuePartnerPrimary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenuePartnerPrimary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenuePartnerPrimary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenuePartner }
     * 
     * 
     */
    public List<RevenuePartner> getRevenuePartnerPrimary() {
        if (revenuePartnerPrimary == null) {
            revenuePartnerPrimary = new ArrayList<RevenuePartner>();
        }
        return this.revenuePartnerPrimary;
    }

    /**
     * Gets the value of the revenueLineSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revenueLineSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevenueLineSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevenueLineSet }
     * 
     * 
     */
    public List<RevenueLineSet> getRevenueLineSet() {
        if (revenueLineSet == null) {
            revenueLineSet = new ArrayList<RevenueLineSet>();
        }
        return this.revenueLineSet;
    }

    /**
     * Gets the value of the categorySummaryRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categorySummaryRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategorySummaryRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategorySummaryRevenue }
     * 
     * 
     */
    public List<CategorySummaryRevenue> getCategorySummaryRevenue() {
        if (categorySummaryRevenue == null) {
            categorySummaryRevenue = new ArrayList<CategorySummaryRevenue>();
        }
        return this.categorySummaryRevenue;
    }

    /**
     * Gets the value of the appointment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the appointment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAppointment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransientAppointment }
     * 
     * 
     */
    public List<TransientAppointment> getAppointment() {
        if (appointment == null) {
            appointment = new ArrayList<TransientAppointment>();
        }
        return this.appointment;
    }

    /**
     * Gets the value of the splitRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splitRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplitRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SplitRevenue }
     * 
     * 
     */
    public List<SplitRevenue> getSplitRevenue() {
        if (splitRevenue == null) {
            splitRevenue = new ArrayList<SplitRevenue>();
        }
        return this.splitRevenue;
    }

    /**
     * Gets the value of the recurringRevenue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the recurringRevenue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRecurringRevenue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecurringRevenue }
     * 
     * 
     */
    public List<RecurringRevenue> getRecurringRevenue() {
        if (recurringRevenue == null) {
            recurringRevenue = new ArrayList<RecurringRevenue>();
        }
        return this.recurringRevenue;
    }

    /**
     * Gets the value of the opportunityDeal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityDeal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityDeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityDeal }
     * 
     * 
     */
    public List<OpportunityDeal> getOpportunityDeal() {
        if (opportunityDeal == null) {
            opportunityDeal = new ArrayList<OpportunityDeal>();
        }
        return this.opportunityDeal;
    }

    /**
     * Gets the value of the primaryClientIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPrimaryClientIdC() {
        return primaryClientIdC;
    }

    /**
     * Sets the value of the primaryClientIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPrimaryClientIdC(JAXBElement<BigDecimal> value) {
        this.primaryClientIdC = value;
    }

    /**
     * Gets the value of the primaryClientC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryClientC() {
        return primaryClientC;
    }

    /**
     * Sets the value of the primaryClientC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryClientC(JAXBElement<String> value) {
        this.primaryClientC = value;
    }

    /**
     * Gets the value of the deliveryModelC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryModelC() {
        return deliveryModelC;
    }

    /**
     * Sets the value of the deliveryModelC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryModelC(JAXBElement<String> value) {
        this.deliveryModelC = value;
    }

    /**
     * Gets the value of the deliveryModelCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDeliveryModelCMeaning() {
        return deliveryModelCMeaning;
    }

    /**
     * Sets the value of the deliveryModelCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDeliveryModelCMeaning(JAXBElement<String> value) {
        this.deliveryModelCMeaning = value;
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
     * Gets the value of the descriptionC property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getDescriptionC() {
        return descriptionC;
    }

    /**
     * Sets the value of the descriptionC property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setDescriptionC(byte[] value) {
        this.descriptionC = value;
    }

    /**
     * Gets the value of the businessUnitC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessUnitC() {
        return businessUnitC;
    }

    /**
     * Sets the value of the businessUnitC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessUnitC(String value) {
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
     * Gets the value of the projectCountryC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProjectCountryC() {
        return projectCountryC;
    }

    /**
     * Sets the value of the projectCountryC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProjectCountryC(String value) {
        this.projectCountryC = value;
    }

    /**
     * Gets the value of the projectCountryCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectCountryCMeaning() {
        return projectCountryCMeaning;
    }

    /**
     * Sets the value of the projectCountryCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectCountryCMeaning(JAXBElement<String> value) {
        this.projectCountryCMeaning = value;
    }

    /**
     * Gets the value of the businessClassC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessClassC() {
        return businessClassC;
    }

    /**
     * Sets the value of the businessClassC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessClassC(String value) {
        this.businessClassC = value;
    }

    /**
     * Gets the value of the businessClassCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBusinessClassCMeaning() {
        return businessClassCMeaning;
    }

    /**
     * Sets the value of the businessClassCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBusinessClassCMeaning(JAXBElement<String> value) {
        this.businessClassCMeaning = value;
    }

    /**
     * Gets the value of the hdrRoleC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHDRRoleC() {
        return hdrRoleC;
    }

    /**
     * Sets the value of the hdrRoleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHDRRoleC(String value) {
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
     * Gets the value of the projectLocationC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectLocationC() {
        return projectLocationC;
    }

    /**
     * Sets the value of the projectLocationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectLocationC(JAXBElement<String> value) {
        this.projectLocationC = value;
    }

    /**
     * Gets the value of the contractTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContractTypeC() {
        return contractTypeC;
    }

    /**
     * Sets the value of the contractTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContractTypeC(String value) {
        this.contractTypeC = value;
    }

    /**
     * Gets the value of the contractTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractTypeCMeaning() {
        return contractTypeCMeaning;
    }

    /**
     * Sets the value of the contractTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractTypeCMeaning(JAXBElement<String> value) {
        this.contractTypeCMeaning = value;
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
     * Gets the value of the timingC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimingC() {
        return timingC;
    }

    /**
     * Sets the value of the timingC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimingC(JAXBElement<String> value) {
        this.timingC = value;
    }

    /**
     * Gets the value of the timingCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTimingCMeaning() {
        return timingCMeaning;
    }

    /**
     * Sets the value of the timingCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTimingCMeaning(JAXBElement<String> value) {
        this.timingCMeaning = value;
    }

    /**
     * Gets the value of the pursuitBdgtNoC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPursuitBdgtNoC() {
        return pursuitBdgtNoC;
    }

    /**
     * Sets the value of the pursuitBdgtNoC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPursuitBdgtNoC(JAXBElement<BigDecimal> value) {
        this.pursuitBdgtNoC = value;
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
     * Gets the value of the supportLevelC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupportLevelC() {
        return supportLevelC;
    }

    /**
     * Sets the value of the supportLevelC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupportLevelC(JAXBElement<String> value) {
        this.supportLevelC = value;
    }

    /**
     * Gets the value of the supportRoleC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupportRoleC() {
        return supportRoleC;
    }

    /**
     * Sets the value of the supportRoleC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupportRoleC(JAXBElement<String> value) {
        this.supportRoleC = value;
    }

    /**
     * Gets the value of the awardTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAwardTypeC() {
        return awardTypeC;
    }

    /**
     * Sets the value of the awardTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAwardTypeC(String value) {
        this.awardTypeC = value;
    }

    /**
     * Gets the value of the ofFirmsAwardedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getOfFirmsAwardedC() {
        return ofFirmsAwardedC;
    }

    /**
     * Sets the value of the ofFirmsAwardedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setOfFirmsAwardedC(JAXBElement<BigDecimal> value) {
        this.ofFirmsAwardedC = value;
    }

    /**
     * Gets the value of the solicitationNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getSolicitationNumberC() {
        return solicitationNumberC;
    }

    /**
     * Sets the value of the solicitationNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setSolicitationNumberC(JAXBElement<BigDecimal> value) {
        this.solicitationNumberC = value;
    }

    /**
     * Gets the value of the arraFundedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getARRAFundedC() {
        return arraFundedC;
    }

    /**
     * Sets the value of the arraFundedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setARRAFundedC(JAXBElement<String> value) {
        this.arraFundedC = value;
    }

    /**
     * Gets the value of the arraFundedCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getARRAFundedCMeaning() {
        return arraFundedCMeaning;
    }

    /**
     * Sets the value of the arraFundedCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setARRAFundedCMeaning(JAXBElement<String> value) {
        this.arraFundedCMeaning = value;
    }

    /**
     * Gets the value of the naicsCodeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNAICSCodeC() {
        return naicsCodeC;
    }

    /**
     * Sets the value of the naicsCodeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNAICSCodeC(JAXBElement<BigDecimal> value) {
        this.naicsCodeC = value;
    }

    /**
     * Gets the value of the startDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getStartDateC() {
        return startDateC;
    }

    /**
     * Sets the value of the startDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setStartDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.startDateC = value;
    }

    /**
     * Gets the value of the endDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getEndDateC() {
        return endDateC;
    }

    /**
     * Sets the value of the endDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setEndDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.endDateC = value;
    }

    /**
     * Gets the value of the noTermLimitC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoTermLimitC() {
        return noTermLimitC;
    }

    /**
     * Sets the value of the noTermLimitC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoTermLimitC(Boolean value) {
        this.noTermLimitC = value;
    }

    /**
     * Gets the value of the totalContractCapacityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalContractCapacityC() {
        return totalContractCapacityC;
    }

    /**
     * Sets the value of the totalContractCapacityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalContractCapacityC(JAXBElement<BigDecimal> value) {
        this.totalContractCapacityC = value;
    }

    /**
     * Gets the value of the noCapacityLimitC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNoCapacityLimitC() {
        return noCapacityLimitC;
    }

    /**
     * Sets the value of the noCapacityLimitC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setNoCapacityLimitC(Boolean value) {
        this.noCapacityLimitC = value;
    }

    /**
     * Gets the value of the hdrPotentialCapacitynetC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHDRPotentialCapacitynetC() {
        return hdrPotentialCapacitynetC;
    }

    /**
     * Sets the value of the hdrPotentialCapacitynetC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHDRPotentialCapacitynetC(JAXBElement<BigDecimal> value) {
        this.hdrPotentialCapacitynetC = value;
    }

    /**
     * Gets the value of the unableToPredictC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUnableToPredictC() {
        return unableToPredictC;
    }

    /**
     * Sets the value of the unableToPredictC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUnableToPredictC(Boolean value) {
        this.unableToPredictC = value;
    }

    /**
     * Gets the value of the hdrPotentialCapacitygrossC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHDRPotentialCapacitygrossC() {
        return hdrPotentialCapacitygrossC;
    }

    /**
     * Sets the value of the hdrPotentialCapacitygrossC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHDRPotentialCapacitygrossC(JAXBElement<BigDecimal> value) {
        this.hdrPotentialCapacitygrossC = value;
    }

    /**
     * Gets the value of the grossForecastC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGrossForecastC() {
        return grossForecastC;
    }

    /**
     * Sets the value of the grossForecastC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGrossForecastC(JAXBElement<BigDecimal> value) {
        this.grossForecastC = value;
    }

    /**
     * Gets the value of the netForecastC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNetForecastC() {
        return netForecastC;
    }

    /**
     * Sets the value of the netForecastC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNetForecastC(JAXBElement<BigDecimal> value) {
        this.netForecastC = value;
    }

    /**
     * Gets the value of the constructionCostC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getConstructionCostC() {
        return constructionCostC;
    }

    /**
     * Sets the value of the constructionCostC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setConstructionCostC(JAXBElement<BigDecimal> value) {
        this.constructionCostC = value;
    }

    /**
     * Gets the value of the contractNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getContractNumberC() {
        return contractNumberC;
    }

    /**
     * Sets the value of the contractNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setContractNumberC(JAXBElement<BigDecimal> value) {
        this.contractNumberC = value;
    }

    /**
     * Gets the value of the masterContractC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMasterContractC() {
        return masterContractC;
    }

    /**
     * Sets the value of the masterContractC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMasterContractC(JAXBElement<BigDecimal> value) {
        this.masterContractC = value;
    }

    /**
     * Gets the value of the contractC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getContractC() {
        return contractC;
    }

    /**
     * Sets the value of the contractC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setContractC(JAXBElement<BigDecimal> value) {
        this.contractC = value;
    }

    /**
     * Gets the value of the bookedC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBookedC() {
        return bookedC;
    }

    /**
     * Sets the value of the bookedC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBookedC(JAXBElement<BigDecimal> value) {
        this.bookedC = value;
    }

    /**
     * Gets the value of the totalAwaitNTPC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalAwaitNTPC() {
        return totalAwaitNTPC;
    }

    /**
     * Sets the value of the totalAwaitNTPC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalAwaitNTPC(JAXBElement<BigDecimal> value) {
        this.totalAwaitNTPC = value;
    }

    /**
     * Gets the value of the totalFeeChangeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalFeeChangeC() {
        return totalFeeChangeC;
    }

    /**
     * Sets the value of the totalFeeChangeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalFeeChangeC(JAXBElement<BigDecimal> value) {
        this.totalFeeChangeC = value;
    }

    /**
     * Gets the value of the involvementC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInvolvementC() {
        return involvementC;
    }

    /**
     * Sets the value of the involvementC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInvolvementC(JAXBElement<String> value) {
        this.involvementC = value;
    }

    /**
     * Gets the value of the awardeeC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAwardeeC() {
        return awardeeC;
    }

    /**
     * Sets the value of the awardeeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAwardeeC(Boolean value) {
        this.awardeeC = value;
    }

    /**
     * Gets the value of the descriptionsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptionsC() {
        return descriptionsC;
    }

    /**
     * Sets the value of the descriptionsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptionsC(JAXBElement<String> value) {
        this.descriptionsC = value;
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
     * Gets the value of the rfqDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRFQDateC() {
        return rfqDateC;
    }

    /**
     * Sets the value of the rfqDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRFQDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.rfqDateC = value;
    }

    /**
     * Gets the value of the rfpReleaseDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRFPReleaseDateC() {
        return rfpReleaseDateC;
    }

    /**
     * Sets the value of the rfpReleaseDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRFPReleaseDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.rfpReleaseDateC = value;
    }

    /**
     * Gets the value of the rfpDueDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRFPDueDateC() {
        return rfpDueDateC;
    }

    /**
     * Sets the value of the rfpDueDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRFPDueDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.rfpDueDateC = value;
    }

    /**
     * Gets the value of the rfpOwnerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getRFPOwnerC() {
        return rfpOwnerC;
    }

    /**
     * Sets the value of the rfpOwnerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setRFPOwnerC(JAXBElement<String> value) {
        this.rfpOwnerC = value;
    }

    /**
     * Gets the value of the confidenceC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getConfidenceC() {
        return confidenceC;
    }

    /**
     * Sets the value of the confidenceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setConfidenceC(JAXBElement<BigDecimal> value) {
        this.confidenceC = value;
    }

    /**
     * Gets the value of the supportTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupportTypeC() {
        return supportTypeC;
    }

    /**
     * Sets the value of the supportTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupportTypeC(JAXBElement<String> value) {
        this.supportTypeC = value;
    }

    /**
     * Gets the value of the selectionProcessC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionProcessC() {
        return selectionProcessC;
    }

    /**
     * Sets the value of the selectionProcessC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionProcessC(String value) {
        this.selectionProcessC = value;
    }

    /**
     * Gets the value of the selectionProcessCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSelectionProcessCMeaning() {
        return selectionProcessCMeaning;
    }

    /**
     * Sets the value of the selectionProcessCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSelectionProcessCMeaning(JAXBElement<String> value) {
        this.selectionProcessCMeaning = value;
    }

    /**
     * Gets the value of the riskCommitteeSignOffDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getRiskCommitteeSignOffDateC() {
        return riskCommitteeSignOffDateC;
    }

    /**
     * Sets the value of the riskCommitteeSignOffDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setRiskCommitteeSignOffDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.riskCommitteeSignOffDateC = value;
    }

    /**
     * Gets the value of the grossForecastsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getGrossForecastsC() {
        return grossForecastsC;
    }

    /**
     * Sets the value of the grossForecastsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setGrossForecastsC(JAXBElement<AmountType> value) {
        this.grossForecastsC = value;
    }

    /**
     * Gets the value of the grossForecastsCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGrossForecastsCCurrencyCode() {
        return grossForecastsCCurrencyCode;
    }

    /**
     * Sets the value of the grossForecastsCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGrossForecastsCCurrencyCode(JAXBElement<String> value) {
        this.grossForecastsCCurrencyCode = value;
    }

    /**
     * Gets the value of the grossForecastsCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getGrossForecastsCCurcyConvRate() {
        return grossForecastsCCurcyConvRate;
    }

    /**
     * Sets the value of the grossForecastsCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setGrossForecastsCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.grossForecastsCCurcyConvRate = value;
    }

    /**
     * Gets the value of the netForecastsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getNetForecastsC() {
        return netForecastsC;
    }

    /**
     * Sets the value of the netForecastsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setNetForecastsC(JAXBElement<AmountType> value) {
        this.netForecastsC = value;
    }

    /**
     * Gets the value of the netForecastsCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNetForecastsCCurrencyCode() {
        return netForecastsCCurrencyCode;
    }

    /**
     * Sets the value of the netForecastsCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNetForecastsCCurrencyCode(JAXBElement<String> value) {
        this.netForecastsCCurrencyCode = value;
    }

    /**
     * Gets the value of the netForecastsCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNetForecastsCCurcyConvRate() {
        return netForecastsCCurcyConvRate;
    }

    /**
     * Sets the value of the netForecastsCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNetForecastsCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.netForecastsCCurcyConvRate = value;
    }

    /**
     * Gets the value of the hdrPotentialCapacityGrosssC property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHDRPotentialCapacityGrosssC() {
        return hdrPotentialCapacityGrosssC;
    }

    /**
     * Sets the value of the hdrPotentialCapacityGrosssC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHDRPotentialCapacityGrosssC(AmountType value) {
        this.hdrPotentialCapacityGrosssC = value;
    }

    /**
     * Gets the value of the hdrPotentialCapacityGrosssCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHDRPotentialCapacityGrosssCCurrencyCode() {
        return hdrPotentialCapacityGrosssCCurrencyCode;
    }

    /**
     * Sets the value of the hdrPotentialCapacityGrosssCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHDRPotentialCapacityGrosssCCurrencyCode(JAXBElement<String> value) {
        this.hdrPotentialCapacityGrosssCCurrencyCode = value;
    }

    /**
     * Gets the value of the hdrPotentialCapacityGrosssCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHDRPotentialCapacityGrosssCCurcyConvRate() {
        return hdrPotentialCapacityGrosssCCurcyConvRate;
    }

    /**
     * Sets the value of the hdrPotentialCapacityGrosssCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHDRPotentialCapacityGrosssCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.hdrPotentialCapacityGrosssCCurcyConvRate = value;
    }

    /**
     * Gets the value of the hdrPotentialCapacityNetsC property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getHDRPotentialCapacityNetsC() {
        return hdrPotentialCapacityNetsC;
    }

    /**
     * Sets the value of the hdrPotentialCapacityNetsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setHDRPotentialCapacityNetsC(AmountType value) {
        this.hdrPotentialCapacityNetsC = value;
    }

    /**
     * Gets the value of the hdrPotentialCapacityNetsCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getHDRPotentialCapacityNetsCCurrencyCode() {
        return hdrPotentialCapacityNetsCCurrencyCode;
    }

    /**
     * Sets the value of the hdrPotentialCapacityNetsCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setHDRPotentialCapacityNetsCCurrencyCode(JAXBElement<String> value) {
        this.hdrPotentialCapacityNetsCCurrencyCode = value;
    }

    /**
     * Gets the value of the hdrPotentialCapacityNetsCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getHDRPotentialCapacityNetsCCurcyConvRate() {
        return hdrPotentialCapacityNetsCCurcyConvRate;
    }

    /**
     * Sets the value of the hdrPotentialCapacityNetsCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setHDRPotentialCapacityNetsCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.hdrPotentialCapacityNetsCCurcyConvRate = value;
    }

    /**
     * Gets the value of the constructionCostsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getConstructionCostsC() {
        return constructionCostsC;
    }

    /**
     * Sets the value of the constructionCostsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setConstructionCostsC(JAXBElement<AmountType> value) {
        this.constructionCostsC = value;
    }

    /**
     * Gets the value of the constructionCostsCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConstructionCostsCCurrencyCode() {
        return constructionCostsCCurrencyCode;
    }

    /**
     * Sets the value of the constructionCostsCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConstructionCostsCCurrencyCode(JAXBElement<String> value) {
        this.constructionCostsCCurrencyCode = value;
    }

    /**
     * Gets the value of the constructionCostsCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getConstructionCostsCCurcyConvRate() {
        return constructionCostsCCurcyConvRate;
    }

    /**
     * Sets the value of the constructionCostsCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setConstructionCostsCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.constructionCostsCCurcyConvRate = value;
    }

    /**
     * Gets the value of the contractsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getContractsC() {
        return contractsC;
    }

    /**
     * Sets the value of the contractsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setContractsC(JAXBElement<AmountType> value) {
        this.contractsC = value;
    }

    /**
     * Gets the value of the contractsCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractsCCurrencyCode() {
        return contractsCCurrencyCode;
    }

    /**
     * Sets the value of the contractsCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractsCCurrencyCode(JAXBElement<String> value) {
        this.contractsCCurrencyCode = value;
    }

    /**
     * Gets the value of the contractsCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getContractsCCurcyConvRate() {
        return contractsCCurcyConvRate;
    }

    /**
     * Sets the value of the contractsCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setContractsCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.contractsCCurcyConvRate = value;
    }

    /**
     * Gets the value of the bookedsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getBookedsC() {
        return bookedsC;
    }

    /**
     * Sets the value of the bookedsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setBookedsC(JAXBElement<AmountType> value) {
        this.bookedsC = value;
    }

    /**
     * Gets the value of the bookedsCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBookedsCCurrencyCode() {
        return bookedsCCurrencyCode;
    }

    /**
     * Sets the value of the bookedsCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBookedsCCurrencyCode(JAXBElement<String> value) {
        this.bookedsCCurrencyCode = value;
    }

    /**
     * Gets the value of the bookedsCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBookedsCCurcyConvRate() {
        return bookedsCCurcyConvRate;
    }

    /**
     * Sets the value of the bookedsCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBookedsCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.bookedsCCurcyConvRate = value;
    }

    /**
     * Gets the value of the totalAwaitNTPsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalAwaitNTPsC() {
        return totalAwaitNTPsC;
    }

    /**
     * Sets the value of the totalAwaitNTPsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalAwaitNTPsC(JAXBElement<AmountType> value) {
        this.totalAwaitNTPsC = value;
    }

    /**
     * Gets the value of the totalAwaitNTPsCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalAwaitNTPsCCurrencyCode() {
        return totalAwaitNTPsCCurrencyCode;
    }

    /**
     * Sets the value of the totalAwaitNTPsCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalAwaitNTPsCCurrencyCode(JAXBElement<String> value) {
        this.totalAwaitNTPsCCurrencyCode = value;
    }

    /**
     * Gets the value of the totalAwaitNTPsCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalAwaitNTPsCCurcyConvRate() {
        return totalAwaitNTPsCCurcyConvRate;
    }

    /**
     * Sets the value of the totalAwaitNTPsCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalAwaitNTPsCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.totalAwaitNTPsCCurcyConvRate = value;
    }

    /**
     * Gets the value of the totalFeeChangesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getTotalFeeChangesC() {
        return totalFeeChangesC;
    }

    /**
     * Sets the value of the totalFeeChangesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setTotalFeeChangesC(JAXBElement<AmountType> value) {
        this.totalFeeChangesC = value;
    }

    /**
     * Gets the value of the totalFeeChangesCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalFeeChangesCCurrencyCode() {
        return totalFeeChangesCCurrencyCode;
    }

    /**
     * Sets the value of the totalFeeChangesCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalFeeChangesCCurrencyCode(JAXBElement<String> value) {
        this.totalFeeChangesCCurrencyCode = value;
    }

    /**
     * Gets the value of the totalFeeChangesCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalFeeChangesCCurcyConvRate() {
        return totalFeeChangesCCurcyConvRate;
    }

    /**
     * Sets the value of the totalFeeChangesCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalFeeChangesCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.totalFeeChangesCCurcyConvRate = value;
    }

    /**
     * Gets the value of the forecastC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isForecastC() {
        return forecastC;
    }

    /**
     * Sets the value of the forecastC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setForecastC(Boolean value) {
        this.forecastC = value;
    }

    /**
     * Gets the value of the sectorBusinessGroupC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectorBusinessGroupC() {
        return sectorBusinessGroupC;
    }

    /**
     * Sets the value of the sectorBusinessGroupC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectorBusinessGroupC(JAXBElement<String> value) {
        this.sectorBusinessGroupC = value;
    }

    /**
     * Gets the value of the sectorBusinessGroupCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectorBusinessGroupCMeaning() {
        return sectorBusinessGroupCMeaning;
    }

    /**
     * Sets the value of the sectorBusinessGroupCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectorBusinessGroupCMeaning(JAXBElement<String> value) {
        this.sectorBusinessGroupCMeaning = value;
    }

    /**
     * Gets the value of the totalContractCapacitysC property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getTotalContractCapacitysC() {
        return totalContractCapacitysC;
    }

    /**
     * Sets the value of the totalContractCapacitysC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setTotalContractCapacitysC(AmountType value) {
        this.totalContractCapacitysC = value;
    }

    /**
     * Gets the value of the totalContractCapacitysCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTotalContractCapacitysCCurrencyCode() {
        return totalContractCapacitysCCurrencyCode;
    }

    /**
     * Sets the value of the totalContractCapacitysCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTotalContractCapacitysCCurrencyCode(JAXBElement<String> value) {
        this.totalContractCapacitysCCurrencyCode = value;
    }

    /**
     * Gets the value of the totalContractCapacitysCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getTotalContractCapacitysCCurcyConvRate() {
        return totalContractCapacitysCCurcyConvRate;
    }

    /**
     * Sets the value of the totalContractCapacitysCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setTotalContractCapacitysCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.totalContractCapacitysCCurcyConvRate = value;
    }

    /**
     * Gets the value of the winLossReasonC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWinLossReasonC() {
        return winLossReasonC;
    }

    /**
     * Sets the value of the winLossReasonC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWinLossReasonC(JAXBElement<String> value) {
        this.winLossReasonC = value;
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
     * Gets the value of the debriefCommentsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getDebriefCommentsC() {
        return debriefCommentsC;
    }

    /**
     * Sets the value of the debriefCommentsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setDebriefCommentsC(JAXBElement<byte[]> value) {
        this.debriefCommentsC = value;
    }

    /**
     * Gets the value of the actualCloseDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getActualCloseDateC() {
        return actualCloseDateC;
    }

    /**
     * Sets the value of the actualCloseDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setActualCloseDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.actualCloseDateC = value;
    }

    /**
     * Gets the value of the forecastDateC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getForecastDateC() {
        return forecastDateC;
    }

    /**
     * Sets the value of the forecastDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setForecastDateC(JAXBElement<XMLGregorianCalendar> value) {
        this.forecastDateC = value;
    }

    /**
     * Gets the value of the hdrDivisionC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHDRDivisionC() {
        return hdrDivisionC;
    }

    /**
     * Sets the value of the hdrDivisionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHDRDivisionC(String value) {
        this.hdrDivisionC = value;
    }

    /**
     * Gets the value of the falloutReasonC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFalloutReasonC() {
        return falloutReasonC;
    }

    /**
     * Sets the value of the falloutReasonC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFalloutReasonC(JAXBElement<String> value) {
        this.falloutReasonC = value;
    }

    /**
     * Gets the value of the falloutReasonCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFalloutReasonCMeaning() {
        return falloutReasonCMeaning;
    }

    /**
     * Sets the value of the falloutReasonCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFalloutReasonCMeaning(JAXBElement<String> value) {
        this.falloutReasonCMeaning = value;
    }

    /**
     * Gets the value of the sectorTypeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectorTypeC() {
        return sectorTypeC;
    }

    /**
     * Sets the value of the sectorTypeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectorTypeC(JAXBElement<String> value) {
        this.sectorTypeC = value;
    }

    /**
     * Gets the value of the sectorTypeCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectorTypeCMeaning() {
        return sectorTypeCMeaning;
    }

    /**
     * Sets the value of the sectorTypeCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectorTypeCMeaning(JAXBElement<String> value) {
        this.sectorTypeCMeaning = value;
    }

    /**
     * Gets the value of the sectorBusinessGroupsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectorBusinessGroupsC() {
        return sectorBusinessGroupsC;
    }

    /**
     * Sets the value of the sectorBusinessGroupsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectorBusinessGroupsC(JAXBElement<String> value) {
        this.sectorBusinessGroupsC = value;
    }

    /**
     * Gets the value of the sectorBusinessGroupsCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectorBusinessGroupsCMeaning() {
        return sectorBusinessGroupsCMeaning;
    }

    /**
     * Sets the value of the sectorBusinessGroupsCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectorBusinessGroupsCMeaning(JAXBElement<String> value) {
        this.sectorBusinessGroupsCMeaning = value;
    }

    /**
     * Gets the value of the marketSectorsC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketSectorsC() {
        return marketSectorsC;
    }

    /**
     * Sets the value of the marketSectorsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketSectorsC(String value) {
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
     * Gets the value of the subMarketsC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubMarketsC() {
        return subMarketsC;
    }

    /**
     * Sets the value of the subMarketsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubMarketsC(JAXBElement<String> value) {
        this.subMarketsC = value;
    }

    /**
     * Gets the value of the subMarketsCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSubMarketsCMeaning() {
        return subMarketsCMeaning;
    }

    /**
     * Sets the value of the subMarketsCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSubMarketsCMeaning(JAXBElement<String> value) {
        this.subMarketsCMeaning = value;
    }

    /**
     * Gets the value of the winProbabilityC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWinProbabilityC() {
        return winProbabilityC;
    }

    /**
     * Sets the value of the winProbabilityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWinProbabilityC(String value) {
        this.winProbabilityC = value;
    }

    /**
     * Gets the value of the winProbabilityCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWinProbabilityCMeaning() {
        return winProbabilityCMeaning;
    }

    /**
     * Sets the value of the winProbabilityCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWinProbabilityCMeaning(JAXBElement<String> value) {
        this.winProbabilityCMeaning = value;
    }

    /**
     * Gets the value of the sectorTypesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSectorTypesC() {
        return sectorTypesC;
    }

    /**
     * Sets the value of the sectorTypesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSectorTypesC(JAXBElement<String> value) {
        this.sectorTypesC = value;
    }

    /**
     * Gets the value of the competitorIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getCompetitorIdC() {
        return competitorIdC;
    }

    /**
     * Sets the value of the competitorIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setCompetitorIdC(JAXBElement<BigDecimal> value) {
        this.competitorIdC = value;
    }

    /**
     * Gets the value of the competitorC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCompetitorC() {
        return competitorC;
    }

    /**
     * Sets the value of the competitorC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCompetitorC(JAXBElement<String> value) {
        this.competitorC = value;
    }

    /**
     * Gets the value of the projectManagerIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectManagerIdC() {
        return projectManagerIdC;
    }

    /**
     * Sets the value of the projectManagerIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectManagerIdC(JAXBElement<BigDecimal> value) {
        this.projectManagerIdC = value;
    }

    /**
     * Gets the value of the projectManagerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectManagerC() {
        return projectManagerC;
    }

    /**
     * Sets the value of the projectManagerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectManagerC(JAXBElement<String> value) {
        this.projectManagerC = value;
    }

    /**
     * Gets the value of the marketingChargeNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMarketingChargeNumberC() {
        return marketingChargeNumberC;
    }

    /**
     * Sets the value of the marketingChargeNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMarketingChargeNumberC(JAXBElement<BigDecimal> value) {
        this.marketingChargeNumberC = value;
    }

    /**
     * Gets the value of the estimatedProjectStartDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedProjectStartDateC() {
        return estimatedProjectStartDateC;
    }

    /**
     * Sets the value of the estimatedProjectStartDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedProjectStartDateC(XMLGregorianCalendar value) {
        this.estimatedProjectStartDateC = value;
    }

    /**
     * Gets the value of the estimatedProjectEndDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstimatedProjectEndDateC() {
        return estimatedProjectEndDateC;
    }

    /**
     * Sets the value of the estimatedProjectEndDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstimatedProjectEndDateC(XMLGregorianCalendar value) {
        this.estimatedProjectEndDateC = value;
    }

    /**
     * Gets the value of the potentialFeeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getPotentialFeeC() {
        return potentialFeeC;
    }

    /**
     * Sets the value of the potentialFeeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setPotentialFeeC(JAXBElement<AmountType> value) {
        this.potentialFeeC = value;
    }

    /**
     * Gets the value of the potentialFeeCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPotentialFeeCCurrencyCode() {
        return potentialFeeCCurrencyCode;
    }

    /**
     * Sets the value of the potentialFeeCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPotentialFeeCCurrencyCode(JAXBElement<String> value) {
        this.potentialFeeCCurrencyCode = value;
    }

    /**
     * Gets the value of the potentialFeeCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPotentialFeeCCurcyConvRate() {
        return potentialFeeCCurcyConvRate;
    }

    /**
     * Sets the value of the potentialFeeCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPotentialFeeCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.potentialFeeCCurcyConvRate = value;
    }

    /**
     * Gets the value of the firmsAwardedMasterContractC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirmsAwardedMasterContractC() {
        return firmsAwardedMasterContractC;
    }

    /**
     * Sets the value of the firmsAwardedMasterContractC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirmsAwardedMasterContractC(String value) {
        this.firmsAwardedMasterContractC = value;
    }

    /**
     * Gets the value of the federalC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFederalC() {
        return federalC;
    }

    /**
     * Sets the value of the federalC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFederalC(Boolean value) {
        this.federalC = value;
    }

    /**
     * Gets the value of the masterC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMasterC() {
        return masterC;
    }

    /**
     * Sets the value of the masterC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMasterC(Boolean value) {
        this.masterC = value;
    }

    /**
     * Gets the value of the awardTypesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAwardTypesC() {
        return awardTypesC;
    }

    /**
     * Sets the value of the awardTypesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAwardTypesC(JAXBElement<String> value) {
        this.awardTypesC = value;
    }

    /**
     * Gets the value of the awardTypesCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAwardTypesCMeaning() {
        return awardTypesCMeaning;
    }

    /**
     * Sets the value of the awardTypesCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAwardTypesCMeaning(JAXBElement<String> value) {
        this.awardTypesCMeaning = value;
    }

    /**
     * Gets the value of the stateProvinceC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateProvinceC() {
        return stateProvinceC;
    }

    /**
     * Sets the value of the stateProvinceC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateProvinceC(String value) {
        this.stateProvinceC = value;
    }

    /**
     * Gets the value of the stateProvinceCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStateProvinceCMeaning() {
        return stateProvinceCMeaning;
    }

    /**
     * Sets the value of the stateProvinceCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStateProvinceCMeaning(JAXBElement<String> value) {
        this.stateProvinceCMeaning = value;
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
     * Gets the value of the cityCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCityCMeaning() {
        return cityCMeaning;
    }

    /**
     * Sets the value of the cityCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCityCMeaning(JAXBElement<String> value) {
        this.cityCMeaning = value;
    }

    /**
     * Gets the value of the masterfederalC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMasterfederalC() {
        return masterfederalC;
    }

    /**
     * Sets the value of the masterfederalC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMasterfederalC(Boolean value) {
        this.masterfederalC = value;
    }

    /**
     * Gets the value of the confidenceSC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConfidenceSC() {
        return confidenceSC;
    }

    /**
     * Sets the value of the confidenceSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConfidenceSC(JAXBElement<String> value) {
        this.confidenceSC = value;
    }

    /**
     * Gets the value of the confidenceSCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getConfidenceSCMeaning() {
        return confidenceSCMeaning;
    }

    /**
     * Sets the value of the confidenceSCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setConfidenceSCMeaning(JAXBElement<String> value) {
        this.confidenceSCMeaning = value;
    }

    /**
     * Gets the value of the projectManagersIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectManagersIdC() {
        return projectManagersIdC;
    }

    /**
     * Sets the value of the projectManagersIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectManagersIdC(JAXBElement<BigDecimal> value) {
        this.projectManagersIdC = value;
    }

    /**
     * Gets the value of the projectManagersC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectManagersC() {
        return projectManagersC;
    }

    /**
     * Sets the value of the projectManagersC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectManagersC(JAXBElement<String> value) {
        this.projectManagersC = value;
    }

    /**
     * Gets the value of the supportLevelsC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupportLevelsC() {
        return supportLevelsC;
    }

    /**
     * Sets the value of the supportLevelsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupportLevelsC(String value) {
        this.supportLevelsC = value;
    }

    /**
     * Gets the value of the supportLevelsCMeaning property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSupportLevelsCMeaning() {
        return supportLevelsCMeaning;
    }

    /**
     * Sets the value of the supportLevelsCMeaning property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSupportLevelsCMeaning(JAXBElement<String> value) {
        this.supportLevelsCMeaning = value;
    }

    /**
     * Gets the value of the arraFundedsC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isARRAFundedsC() {
        return arraFundedsC;
    }

    /**
     * Sets the value of the arraFundedsC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setARRAFundedsC(Boolean value) {
        this.arraFundedsC = value;
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
     * Gets the value of the amountCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAmountCCurrencyCode() {
        return amountCCurrencyCode;
    }

    /**
     * Sets the value of the amountCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAmountCCurrencyCode(JAXBElement<String> value) {
        this.amountCCurrencyCode = value;
    }

    /**
     * Gets the value of the amountCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getAmountCCurcyConvRate() {
        return amountCCurcyConvRate;
    }

    /**
     * Sets the value of the amountCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setAmountCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.amountCCurcyConvRate = value;
    }

    /**
     * Gets the value of the designCompetitionC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDesignCompetitionC() {
        return designCompetitionC;
    }

    /**
     * Sets the value of the designCompetitionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDesignCompetitionC(Boolean value) {
        this.designCompetitionC = value;
    }

    /**
     * Gets the value of the projectConstructionCostC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public JAXBElement<AmountType> getProjectConstructionCostC() {
        return projectConstructionCostC;
    }

    /**
     * Sets the value of the projectConstructionCostC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AmountType }{@code >}
     *     
     */
    public void setProjectConstructionCostC(JAXBElement<AmountType> value) {
        this.projectConstructionCostC = value;
    }

    /**
     * Gets the value of the projectConstructionCostCCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectConstructionCostCCurrencyCode() {
        return projectConstructionCostCCurrencyCode;
    }

    /**
     * Sets the value of the projectConstructionCostCCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectConstructionCostCCurrencyCode(JAXBElement<String> value) {
        this.projectConstructionCostCCurrencyCode = value;
    }

    /**
     * Gets the value of the projectConstructionCostCCurcyConvRate property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getProjectConstructionCostCCurcyConvRate() {
        return projectConstructionCostCCurcyConvRate;
    }

    /**
     * Sets the value of the projectConstructionCostCCurcyConvRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setProjectConstructionCostCCurcyConvRate(JAXBElement<BigDecimal> value) {
        this.projectConstructionCostCCurcyConvRate = value;
    }

    /**
     * Gets the value of the contractNumbersC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getContractNumbersC() {
        return contractNumbersC;
    }

    /**
     * Sets the value of the contractNumbersC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setContractNumbersC(JAXBElement<String> value) {
        this.contractNumbersC = value;
    }

    /**
     * Gets the value of the solicitationNumbersC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSolicitationNumbersC() {
        return solicitationNumbersC;
    }

    /**
     * Sets the value of the solicitationNumbersC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSolicitationNumbersC(String value) {
        this.solicitationNumbersC = value;
    }

    /**
     * Gets the value of the citiesC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCitiesC() {
        return citiesC;
    }

    /**
     * Sets the value of the citiesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCitiesC(String value) {
        this.citiesC = value;
    }

    /**
     * Gets the value of the ebsOpportunityIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSOpportunityIDC() {
        return ebsOpportunityIDC;
    }

    /**
     * Sets the value of the ebsOpportunityIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSOpportunityIDC(JAXBElement<String> value) {
        this.ebsOpportunityIDC = value;
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
     * Gets the value of the deliveryMethodC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethodC() {
        return deliveryMethodC;
    }

    /**
     * Sets the value of the deliveryMethodC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethodC(String value) {
        this.deliveryMethodC = value;
    }

    /**
     * Gets the value of the latitudeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLatitudeC() {
        return latitudeC;
    }

    /**
     * Sets the value of the latitudeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLatitudeC(JAXBElement<String> value) {
        this.latitudeC = value;
    }

    /**
     * Gets the value of the longitudeC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getLongitudeC() {
        return longitudeC;
    }

    /**
     * Sets the value of the longitudeC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setLongitudeC(JAXBElement<String> value) {
        this.longitudeC = value;
    }

    /**
     * Gets the value of the opportunityLegacySystemIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOpportunityLegacySystemIDC() {
        return opportunityLegacySystemIDC;
    }

    /**
     * Sets the value of the opportunityLegacySystemIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOpportunityLegacySystemIDC(JAXBElement<String> value) {
        this.opportunityLegacySystemIDC = value;
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
     * Gets the value of the notesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getNotesC() {
        return notesC;
    }

    /**
     * Sets the value of the notesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setNotesC(JAXBElement<byte[]> value) {
        this.notesC = value;
    }

    /**
     * Gets the value of the contractNameIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getContractNameIdC() {
        return contractNameIdC;
    }

    /**
     * Sets the value of the contractNameIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setContractNameIdC(JAXBElement<BigDecimal> value) {
        this.contractNameIdC = value;
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
     * Gets the value of the naicsCodesC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICSCodesC() {
        return naicsCodesC;
    }

    /**
     * Sets the value of the naicsCodesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICSCodesC(JAXBElement<String> value) {
        this.naicsCodesC = value;
    }

    /**
     * Gets the value of the naicsDescriptionC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNAICSDescriptionC() {
        return naicsDescriptionC;
    }

    /**
     * Sets the value of the naicsDescriptionC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNAICSDescriptionC(JAXBElement<String> value) {
        this.naicsDescriptionC = value;
    }

    /**
     * Gets the value of the areaOfReachC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAreaOfReachC() {
        return areaOfReachC;
    }

    /**
     * Sets the value of the areaOfReachC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAreaOfReachC(JAXBElement<String> value) {
        this.areaOfReachC = value;
    }

    /**
     * Gets the value of the msac property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMSAC() {
        return msac;
    }

    /**
     * Sets the value of the msac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMSAC(Boolean value) {
        this.msac = value;
    }

    /**
     * Gets the value of the backendOptyCreationCountC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getBackendOptyCreationCountC() {
        return backendOptyCreationCountC;
    }

    /**
     * Sets the value of the backendOptyCreationCountC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setBackendOptyCreationCountC(JAXBElement<BigDecimal> value) {
        this.backendOptyCreationCountC = value;
    }

    /**
     * Gets the value of the backendActivityNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBackendActivityNameC() {
        return backendActivityNameC;
    }

    /**
     * Sets the value of the backendActivityNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBackendActivityNameC(JAXBElement<String> value) {
        this.backendActivityNameC = value;
    }

    /**
     * Gets the value of the masterOpportunityIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getMasterOpportunityIdC() {
        return masterOpportunityIdC;
    }

    /**
     * Sets the value of the masterOpportunityIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setMasterOpportunityIdC(JAXBElement<BigDecimal> value) {
        this.masterOpportunityIdC = value;
    }

    /**
     * Gets the value of the masterOpportunityC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMasterOpportunityC() {
        return masterOpportunityC;
    }

    /**
     * Sets the value of the masterOpportunityC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMasterOpportunityC(JAXBElement<String> value) {
        this.masterOpportunityC = value;
    }

    /**
     * Gets the value of the backEndStatusCheckC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBackEndStatusCheckC() {
        return backEndStatusCheckC;
    }

    /**
     * Sets the value of the backEndStatusCheckC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBackEndStatusCheckC(JAXBElement<String> value) {
        this.backEndStatusCheckC = value;
    }

    /**
     * Gets the value of the estimatedNetFeesC property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEstimatedNetFeesC() {
        return estimatedNetFeesC;
    }

    /**
     * Sets the value of the estimatedNetFeesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEstimatedNetFeesC(AmountType value) {
        this.estimatedNetFeesC = value;
    }

    /**
     * Gets the value of the estimatedGrossFeesC property.
     * 
     * @return
     *     possible object is
     *     {@link AmountType }
     *     
     */
    public AmountType getEstimatedGrossFeesC() {
        return estimatedGrossFeesC;
    }

    /**
     * Sets the value of the estimatedGrossFeesC property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *     
     */
    public void setEstimatedGrossFeesC(AmountType value) {
        this.estimatedGrossFeesC = value;
    }

    /**
     * Gets the value of the goNoGoC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isGoNoGoC() {
        return goNoGoC;
    }

    /**
     * Sets the value of the goNoGoC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setGoNoGoC(Boolean value) {
        this.goNoGoC = value;
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
     * Gets the value of the projectManagerforReportingC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectManagerforReportingC() {
        return projectManagerforReportingC;
    }

    /**
     * Sets the value of the projectManagerforReportingC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectManagerforReportingC(JAXBElement<String> value) {
        this.projectManagerforReportingC = value;
    }

    /**
     * Gets the value of the integrationC property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIntegrationC() {
        return integrationC;
    }

    /**
     * Sets the value of the integrationC property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIntegrationC(Boolean value) {
        this.integrationC = value;
    }

    /**
     * Gets the value of the businessGroupC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessGroupC() {
        return businessGroupC;
    }

    /**
     * Sets the value of the businessGroupC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessGroupC(String value) {
        this.businessGroupC = value;
    }

    /**
     * Gets the value of the ebsProjectIDIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getEBSProjectIDIdC() {
        return ebsProjectIDIdC;
    }

    /**
     * Sets the value of the ebsProjectIDIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setEBSProjectIDIdC(JAXBElement<BigDecimal> value) {
        this.ebsProjectIDIdC = value;
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
     * Gets the value of the projectNameC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectNameC() {
        return projectNameC;
    }

    /**
     * Sets the value of the projectNameC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectNameC(JAXBElement<String> value) {
        this.projectNameC = value;
    }

    /**
     * Gets the value of the backendEmailFromProjectManagerC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBackendEmailFromProjectManagerC() {
        return backendEmailFromProjectManagerC;
    }

    /**
     * Sets the value of the backendEmailFromProjectManagerC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBackendEmailFromProjectManagerC(JAXBElement<String> value) {
        this.backendEmailFromProjectManagerC = value;
    }

    /**
     * Gets the value of the estBookingDateC property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEstBookingDateC() {
        return estBookingDateC;
    }

    /**
     * Sets the value of the estBookingDateC property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEstBookingDateC(XMLGregorianCalendar value) {
        this.estBookingDateC = value;
    }

    /**
     * Gets the value of the projectManagerEffectiveStartDaC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProjectManagerEffectiveStartDaC() {
        return projectManagerEffectiveStartDaC;
    }

    /**
     * Sets the value of the projectManagerEffectiveStartDaC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProjectManagerEffectiveStartDaC(JAXBElement<XMLGregorianCalendar> value) {
        this.projectManagerEffectiveStartDaC = value;
    }

    /**
     * Gets the value of the projectManagerEffectiveStartC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public JAXBElement<XMLGregorianCalendar> getProjectManagerEffectiveStartC() {
        return projectManagerEffectiveStartC;
    }

    /**
     * Sets the value of the projectManagerEffectiveStartC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     *     
     */
    public void setProjectManagerEffectiveStartC(JAXBElement<XMLGregorianCalendar> value) {
        this.projectManagerEffectiveStartC = value;
    }

    /**
     * Gets the value of the pursuitProjectNumberC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getPursuitProjectNumberC() {
        return pursuitProjectNumberC;
    }

    /**
     * Sets the value of the pursuitProjectNumberC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setPursuitProjectNumberC(JAXBElement<BigDecimal> value) {
        this.pursuitProjectNumberC = value;
    }

    /**
     * Gets the value of the primaryAccountForReportingC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAccountForReportingC() {
        return primaryAccountForReportingC;
    }

    /**
     * Sets the value of the primaryAccountForReportingC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAccountForReportingC(JAXBElement<String> value) {
        this.primaryAccountForReportingC = value;
    }

    /**
     * Gets the value of the currencyC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyC() {
        return currencyC;
    }

    /**
     * Sets the value of the currencyC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyC(String value) {
        this.currencyC = value;
    }

    /**
     * Gets the value of the usdRateforReportingC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getUSDRateforReportingC() {
        return usdRateforReportingC;
    }

    /**
     * Sets the value of the usdRateforReportingC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setUSDRateforReportingC(JAXBElement<BigDecimal> value) {
        this.usdRateforReportingC = value;
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
     * Gets the value of the marketingChargeNumbersC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMarketingChargeNumbersC() {
        return marketingChargeNumbersC;
    }

    /**
     * Sets the value of the marketingChargeNumbersC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMarketingChargeNumbersC(JAXBElement<String> value) {
        this.marketingChargeNumbersC = value;
    }

    /**
     * Gets the value of the ebsPursuitProjectIdC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEBSPursuitProjectIdC() {
        return ebsPursuitProjectIdC;
    }

    /**
     * Sets the value of the ebsPursuitProjectIdC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEBSPursuitProjectIdC(JAXBElement<String> value) {
        this.ebsPursuitProjectIdC = value;
    }

    /**
     * Gets the value of the primaryAccountIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrimaryAccountIDC() {
        return primaryAccountIDC;
    }

    /**
     * Sets the value of the primaryAccountIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrimaryAccountIDC(JAXBElement<String> value) {
        this.primaryAccountIDC = value;
    }

    /**
     * Gets the value of the billableAccountIDC property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getBillableAccountIDC() {
        return billableAccountIDC;
    }

    /**
     * Sets the value of the billableAccountIDC property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setBillableAccountIDC(JAXBElement<String> value) {
        this.billableAccountIDC = value;
    }

    /**
     * Gets the value of the relatedOpportunitiesCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedOpportunitiesCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedOpportunitiesCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RelatedOpportunitiesC }
     * 
     * 
     */
    public List<RelatedOpportunitiesC> getRelatedOpportunitiesCollectionC() {
        if (relatedOpportunitiesCollectionC == null) {
            relatedOpportunitiesCollectionC = new ArrayList<RelatedOpportunitiesC>();
        }
        return this.relatedOpportunitiesCollectionC;
    }

    /**
     * Gets the value of the competitorCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the competitorCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompetitorCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompetitorC }
     * 
     * 
     */
    public List<CompetitorC> getCompetitorCollectionC() {
        if (competitorCollectionC == null) {
            competitorCollectionC = new ArrayList<CompetitorC>();
        }
        return this.competitorCollectionC;
    }

    /**
     * Gets the value of the partnersJointBidsCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partnersJointBidsCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartnersJointBidsCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartnersJointBidsC }
     * 
     * 
     */
    public List<PartnersJointBidsC> getPartnersJointBidsCollectionC() {
        if (partnersJointBidsCollectionC == null) {
            partnersJointBidsCollectionC = new ArrayList<PartnersJointBidsC>();
        }
        return this.partnersJointBidsCollectionC;
    }

    /**
     * Gets the value of the opportunityForecastCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opportunityForecastCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpportunityForecastCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OpportunityForecastC }
     * 
     * 
     */
    public List<OpportunityForecastC> getOpportunityForecastCollectionC() {
        if (opportunityForecastCollectionC == null) {
            opportunityForecastCollectionC = new ArrayList<OpportunityForecastC>();
        }
        return this.opportunityForecastCollectionC;
    }

    /**
     * Gets the value of the projectLocationCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the projectLocationCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProjectLocationCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProjectLocationC }
     * 
     * 
     */
    public List<ProjectLocationC> getProjectLocationCollectionC() {
        if (projectLocationCollectionC == null) {
            projectLocationCollectionC = new ArrayList<ProjectLocationC>();
        }
        return this.projectLocationCollectionC;
    }

    /**
     * Gets the value of the approversCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the approversCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getApproversCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ApproversC }
     * 
     * 
     */
    public List<ApproversC> getApproversCollectionC() {
        if (approversCollectionC == null) {
            approversCollectionC = new ArrayList<ApproversC>();
        }
        return this.approversCollectionC;
    }

    /**
     * Gets the value of the pursuitMilestonesCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pursuitMilestonesCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPursuitMilestonesCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PursuitMilestonesC }
     * 
     * 
     */
    public List<PursuitMilestonesC> getPursuitMilestonesCollectionC() {
        if (pursuitMilestonesCollectionC == null) {
            pursuitMilestonesCollectionC = new ArrayList<PursuitMilestonesC>();
        }
        return this.pursuitMilestonesCollectionC;
    }

    /**
     * Gets the value of the employeeCollectionC property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the employeeCollectionC property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmployeeCollectionC().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmployeessC }
     * 
     * 
     */
    public List<EmployeessC> getEmployeeCollectionC() {
        if (employeeCollectionC == null) {
            employeeCollectionC = new ArrayList<EmployeessC>();
        }
        return this.employeeCollectionC;
    }

}
