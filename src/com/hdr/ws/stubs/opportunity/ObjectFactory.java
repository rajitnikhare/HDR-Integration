
package com.hdr.ws.stubs.opportunity;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.hdr.ws.stubs.opportunity package. 
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

    private final static QName _OpportunityReference_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityReference");
    private final static QName _RevenueTerritory_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "revenueTerritory");
    private final static QName _RecurringRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "recurringRevenue");
    private final static QName _Fault_QNAME = new QName("http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", "Fault");
    private final static QName _PursuitMilestonesC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "pursuitMilestones_c");
    private final static QName _ServiceErrorMessage_QNAME = new QName("http://xmlns.oracle.com/adf/svc/errors/", "ServiceErrorMessage");
    private final static QName _CompetitorC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "competitor_c");
    private final static QName _OpportunitySource_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunitySource");
    private final static QName _Note_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "note");
    private final static QName _Datagraph_QNAME = new QName("commonj.sdo", "datagraph");
    private final static QName _OpportunityLead_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityLead");
    private final static QName _OpportunityForecastC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityForecast_c");
    private final static QName _EmployeessC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "employeess_c");
    private final static QName _OpportunityDeal_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityDeal");
    private final static QName _DeleteError_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "deleteError");
    private final static QName _FindCriteria_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findCriteria");
    private final static QName _PartnersJointBidsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "partnersJointBids_c");
    private final static QName _OpportunityResponse_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityResponse");
    private final static QName _OpportunityCompetitor_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityCompetitor");
    private final static QName _FindControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "findControl");
    private final static QName _RevenueLineSet_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "revenueLineSet");
    private final static QName _SplitRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "splitRevenue");
    private final static QName _DeleteEntity_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "deleteEntity");
    private final static QName _NoteDFF_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "noteDFF");
    private final static QName _Opportunity_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunity");
    private final static QName _TransientAppointment_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientAppointment");
    private final static QName _OpportunityContact_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityContact");
    private final static QName _Revenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "revenue");
    private final static QName _Types_QNAME = new QName("commonj.sdo", "types");
    private final static QName _CategorySummaryRevenue_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "categorySummaryRevenue");
    private final static QName _DataObject_QNAME = new QName("commonj.sdo", "dataObject");
    private final static QName _CommonAttachments_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "commonAttachments");
    private final static QName _TransientCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientCategory");
    private final static QName _ApproversC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "approvers_c");
    private final static QName _TransientContact_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientContact");
    private final static QName _ProjectLocationC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "projectLocation_c");
    private final static QName _ProcessData_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "processData");
    private final static QName _TransientAssignee_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientAssignee");
    private final static QName _OpportunityResource_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "opportunityResource");
    private final static QName _RelatedOpportunitiesC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "relatedOpportunities_c");
    private final static QName _RevenuePartner_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "revenuePartner");
    private final static QName _Type_QNAME = new QName("commonj.sdo", "type");
    private final static QName _TransientNote_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "transientNote");
    private final static QName _ProcessControl_QNAME = new QName("http://xmlns.oracle.com/adf/svc/types/", "processControl");
    private final static QName _OpportunityResourcePersonFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PersonFirstName");
    private final static QName _OpportunityResourcePartnerOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartnerOrgId");
    private final static QName _OpportunityResourceDealProtected_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealProtected");
    private final static QName _OpportunityResourceEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmailAddress");
    private final static QName _OpportunityResourceTitleC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Title_c");
    private final static QName _OpportunityResourceAccessLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AccessLevelCode");
    private final static QName _OpportunityResourceMgrResourceId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MgrResourceId");
    private final static QName _OpportunityResourceLockAssignmentFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LockAssignmentFlag");
    private final static QName _OpportunityResourceAssignmentType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AssignmentType");
    private final static QName _OpportunityResourceDealProtectedDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealProtectedDate");
    private final static QName _OpportunityResourceFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FormattedPhoneNumber");
    private final static QName _OpportunityResourceDepartmentC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Department_c");
    private final static QName _OpportunityResourcePersonLastName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PersonLastName");
    private final static QName _OpportunityResourceOwnerFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OwnerFlag");
    private final static QName _OpportunityResourceAsgnTerritoryVersionId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AsgnTerritoryVersionId");
    private final static QName _OpportunityResourceUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "UserLastUpdateDate");
    private final static QName _OpportunityResourceBusinessUnitsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessUnits_c");
    private final static QName _OpportunityResourceOrgTreeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OrgTreeCode");
    private final static QName _OpportunityResourceMemberFunctionCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MemberFunctionCode");
    private final static QName _OpportunityResourceDealExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealExpirationDate");
    private final static QName _OpportunityResourceBusinessUnitC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessUnit_c");
    private final static QName _OpportunityResourceLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastUpdateLogin");
    private final static QName _OpportunityResourceTitlesC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Titles_c");
    private final static QName _OpportunityResourceOrgTreeStructureCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OrgTreeStructureCode");
    private final static QName _OpportunityResourceDepartmentCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Department_cMeaning");
    private final static QName _OpportunityResourceBusinessUnitCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessUnit_cMeaning");
    private final static QName _DeleteErrorErrorMessage_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "ErrorMessage");
    private final static QName _DeleteErrorProgramName_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "ProgramName");
    private final static QName _DeleteErrorErrorCode_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "ErrorCode");
    private final static QName _DeleteErrorDeleteErrorType_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteErrorType");
    private final static QName _OpportunityReferenceRevnAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RevnAmount");
    private final static QName _OpportunityReferenceCustomerContactRelationId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CustomerContactRelationId");
    private final static QName _OpportunityReferencePartyUniqueName1_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartyUniqueName1");
    private final static QName _OpportunityReferenceComments1_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Comments1");
    private final static QName _OpportunityReferenceSalesAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesAccountId");
    private final static QName _OpportunityReferenceWinProb_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "WinProb");
    private final static QName _OpportunityReferenceDUNSNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DUNSNumberC");
    private final static QName _OpportunityReferenceSalesAccountUniqueName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesAccountUniqueName");
    private final static QName _OpportunityReferencePartyUniqueName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartyUniqueName");
    private final static QName _OpportunityReferenceIntContactPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "IntContactPartyId");
    private final static QName _OpportunityReferenceReferenceRankNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ReferenceRankNumber");
    private final static QName _OpportunityReferenceComments_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Comments");
    private final static QName _OpportunityReferenceEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EffectiveDate");
    private final static QName _DeleteEntityDeleteDate_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteDate");
    private final static QName _DeleteEntityEntitySequenceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "EntitySequenceNumber");
    private final static QName _DeleteEntityPk2Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk2Value");
    private final static QName _DeleteEntityPk1Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk1Value");
    private final static QName _DeleteEntityPk5Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk5Value");
    private final static QName _DeleteEntityDeleteStatusType_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteStatusType");
    private final static QName _DeleteEntityDeleteEntityType_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "DeleteEntityType");
    private final static QName _DeleteEntityPk4Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk4Value");
    private final static QName _DeleteEntityPk3Value_QNAME = new QName("http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", "Pk3Value");
    private final static QName _TransientContactActivityContactId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityContactId");
    private final static QName _TransientContactPersonTitle_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonTitle");
    private final static QName _TransientContactPersonLastName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonLastName");
    private final static QName _TransientContactContactId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ContactId");
    private final static QName _TransientContactPartyName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyName");
    private final static QName _TransientContactPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyId");
    private final static QName _TransientContactActivityId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityId");
    private final static QName _TransientContactPersonFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonFirstName");
    private final static QName _TransientContactContactRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ContactRelationshipId");
    private final static QName _TransientContactPartyType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyType");
    private final static QName _TransientContactPersonMiddleName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PersonMiddleName");
    private final static QName _OpportunityLeadPrDealPartOrgPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrDealPartOrgPartyId");
    private final static QName _OpportunityLeadRegistrationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RegistrationNumber");
    private final static QName _OpportunityLeadPartnerTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartnerTypeCd");
    private final static QName _OpportunityLeadDealPartProgramId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealPartProgramId");
    private final static QName _OpportunityLeadPrDealPartResourcePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrDealPartResourcePartyId");
    private final static QName _OpportunityLeadDealEstimatedCloseDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealEstimatedCloseDate");
    private final static QName _OpportunityLeadDealType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealType");
    private final static QName _TransientNoteNoteTxt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "NoteTxt");
    private final static QName _TransientNoteNoteTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "NoteTypeCode");
    private final static QName _TransientNoteNoteId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "NoteId");
    private final static QName _TransientNoteSourceObjectCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "SourceObjectCode");
    private final static QName _TransientNoteVisibilityCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "VisibilityCode");
    private final static QName _TransientNoteSourceObjectId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "SourceObjectId");
    private final static QName _RevenueLineSetRevnLineTypeCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnLineTypeCode");
    private final static QName _RevenueLineSetRevnAmountCurcyCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnAmountCurcyCode");
    private final static QName _RevenueLineSetOptyId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "OptyId");
    private final static QName _RevenueLineSetBUOrgId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "BUOrgId");
    private final static QName _RevenueLineSetLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "LastUpdateLogin");
    private final static QName _RevenueLineSetStatusCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "StatusCode");
    private final static QName _RevenueLineSetCustomerAccountId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CustomerAccountId");
    private final static QName _RevenueLineSetOwnerResourceId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerResourceId");
    private final static QName _RevenueLineSetOwnerOrgTreeStructCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerOrgTreeStructCode");
    private final static QName _RevenueLineSetEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "EffectiveDate");
    private final static QName _RevenueLineSetCustomerPartyId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CustomerPartyId");
    private final static QName _RevenueLineSetProdGroupId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "ProdGroupId");
    private final static QName _RevenueLineSetRevnAmount_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnAmount");
    private final static QName _RevenueLineSetUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "UserLastUpdateDate");
    private final static QName _RevenueLineSetOwnerResourceOrgId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerResourceOrgId");
    private final static QName _RevenueLineSetRevnSequenceNumber_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnSequenceNumber");
    private final static QName _RevenueLineSetOwnerOrgTreeCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerOrgTreeCode");
    private final static QName _RevenueLineSetSalesAccountId_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "SalesAccountId");
    private final static QName _CategorySummaryRevenuePrimaryFlag_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "PrimaryFlag");
    private final static QName _CategorySummaryRevenueCrmCategorySummaryRevenue_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmCategorySummaryRevenue");
    private final static QName _CategorySummaryRevenueCrmConversionRate_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmConversionRate");
    private final static QName _CategorySummaryRevenueCrmConversionRateType_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmConversionRateType");
    private final static QName _CategorySummaryRevenueRevnCategoryCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "RevnCategoryCode");
    private final static QName _CategorySummaryRevenueCrmCurcyCode_QNAME = new QName("http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", "CrmCurcyCode");
    private final static QName _RelatedOpportunitiesCPotentialSNBUSDCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PotentialSNBUSD_cCurcyConvRate");
    private final static QName _RelatedOpportunitiesCLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastUpdateDate");
    private final static QName _RelatedOpportunitiesCIsOwner_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "IsOwner");
    private final static QName _RelatedOpportunitiesCJobDefinitionName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "JobDefinitionName");
    private final static QName _RelatedOpportunitiesCCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CurcyConvRateType");
    private final static QName _RelatedOpportunitiesCCpdrfVerSor_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CpdrfVerSor");
    private final static QName _RelatedOpportunitiesCFeeChgANTPUSDC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FeeChgANTPUSD_c");
    private final static QName _RelatedOpportunitiesCOpportunityVOIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityVO_Id_c");
    private final static QName _RelatedOpportunitiesCMasterOpportunityC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MasterOpportunity_c");
    private final static QName _RelatedOpportunitiesCFeeChgANTPUSDCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FeeChgANTPUSD_cCurcyConvRate");
    private final static QName _RelatedOpportunitiesCTransferC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Transfer_c");
    private final static QName _RelatedOpportunitiesCBusinessClassCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessClass_cMeaning");
    private final static QName _RelatedOpportunitiesCBusinessGroupC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessGroup_c");
    private final static QName _RelatedOpportunitiesCMasterOpportunityIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MasterOpportunity_Id_c");
    private final static QName _RelatedOpportunitiesCPotentialSNBUSDC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PotentialSNBUSD_c");
    private final static QName _RelatedOpportunitiesCRequestId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RequestId");
    private final static QName _RelatedOpportunitiesCPotentialSNBUSDCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PotentialSNBUSD_cCurrencyCode");
    private final static QName _RelatedOpportunitiesCJobDefinitionPackage_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "JobDefinitionPackage");
    private final static QName _RelatedOpportunitiesCContractNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContractNumber_c");
    private final static QName _RelatedOpportunitiesCFeeChgANTPUSDCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FeeChgANTPUSD_cCurrencyCode");
    private final static QName _RelatedOpportunitiesCCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CorpCurrencyCode");
    private final static QName _RelatedOpportunitiesCCpdrfVerPillar_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CpdrfVerPillar");
    private final static QName _RelatedOpportunitiesCCreatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CreatedBy");
    private final static QName _RelatedOpportunitiesCBusinessClassC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessClass_c");
    private final static QName _RelatedOpportunitiesCBusinessGroupCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BusinessGroup_cMeaning");
    private final static QName _RelatedOpportunitiesCLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastUpdatedBy");
    private final static QName _RelatedOpportunitiesCObjectVersionNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ObjectVersionNumber");
    private final static QName _RelatedOpportunitiesCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CurrencyCode");
    private final static QName _RelatedOpportunitiesCCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CreationDate");
    private final static QName _RelatedOpportunitiesCCpdrfLastUpd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CpdrfLastUpd");
    private final static QName _SplitRevenueSalesAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SalesAccountId");
    private final static QName _SplitRevenueOwnerLockAsgnFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerLockAsgnFlag");
    private final static QName _SplitRevenueUOMCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "UOMCode");
    private final static QName _SplitRevenueUserLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "UserLastUpdateDate");
    private final static QName _SplitRevenueConversionRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ConversionRate");
    private final static QName _SplitRevenueCommitFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CommitFlag");
    private final static QName _SplitRevenueRecurFrequencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurFrequencyCode");
    private final static QName _SplitRevenueRecurTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurTypeCode");
    private final static QName _SplitRevenueOwnerDealProtectedDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerDealProtectedDate");
    private final static QName _SplitRevenueDownsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DownsideAmount");
    private final static QName _SplitRevenueExpectAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ExpectAmount");
    private final static QName _SplitRevenueQuantity_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "Quantity");
    private final static QName _SplitRevenueResourcePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ResourcePartyId");
    private final static QName _SplitRevenueLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "LastUpdateLogin");
    private final static QName _SplitRevenueOwnerOrgTreeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerOrgTreeCode");
    private final static QName _SplitRevenueConversionRateType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ConversionRateType");
    private final static QName _SplitRevenueExpectDlvryDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ExpectDlvryDate");
    private final static QName _SplitRevenueOwnerDealExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerDealExpirationDate");
    private final static QName _SplitRevenueSplitTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SplitTypeCode");
    private final static QName _SplitRevenueProdGroupId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ProdGroupId");
    private final static QName _SplitRevenueStatusCodeSetId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "StatusCodeSetId");
    private final static QName _SplitRevenueRecurParentRevnId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurParentRevnId");
    private final static QName _SplitRevenueInventoryOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "InventoryOrgId");
    private final static QName _SplitRevenueSplitPercent_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SplitPercent");
    private final static QName _SplitRevenueCloseReasonCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CloseReasonCode");
    private final static QName _SplitRevenueRecurQuantity_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurQuantity");
    private final static QName _SplitRevenueWinProb_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "WinProb");
    private final static QName _SplitRevenueTypeCodeSetId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "TypeCodeSetId");
    private final static QName _SplitRevenuePrTerritoryUpdatedById_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrTerritoryUpdatedById");
    private final static QName _SplitRevenueForecastOverrideCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ForecastOverrideCode");
    private final static QName _SplitRevenueOwnerOrgTreeStructCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerOrgTreeStructCode");
    private final static QName _SplitRevenueUpsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "UpsideAmount");
    private final static QName _SplitRevenueUnitPrice_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "UnitPrice");
    private final static QName _SplitRevenueTargetPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "TargetPartyId");
    private final static QName _SplitRevenueComments_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "Comments");
    private final static QName _SplitRevenuePrCmptPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrCmptPartyId");
    private final static QName _SplitRevenueInventoryItemId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "InventoryItemId");
    private final static QName _SplitRevenueCustomerAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CustomerAccountId");
    private final static QName _SplitRevenueRecurRevnAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurRevnAmount");
    private final static QName _SplitRevenueOptyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OptyId");
    private final static QName _SplitRevenueRecurEndDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurEndDate");
    private final static QName _SplitRevenuePrTerritoryVersionId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrTerritoryVersionId");
    private final static QName _SplitRevenueMarginAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "MarginAmount");
    private final static QName _SplitRevenueRecurNumberPeriods_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurNumberPeriods");
    private final static QName _SplitRevenueOwnerResourceOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OwnerResourceOrgId");
    private final static QName _SplitRevenueTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "TypeCode");
    private final static QName _SplitRevenueRevnAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnAmount");
    private final static QName _SplitRevenueEffectiveDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "EffectiveDate");
    private final static QName _SplitRevenueRecurStartDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurStartDate");
    private final static QName _SplitRevenueCloseReasonCodeSetId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CloseReasonCodeSetId");
    private final static QName _SplitRevenueCostAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CostAmount");
    private final static QName _SplitRevenueAssignmentType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "AssignmentType");
    private final static QName _SplitRevenueCreditRcptPartOrgPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CreditRcptPartOrgPartyId");
    private final static QName _SplitRevenueSplitParentRevnId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SplitParentRevnId");
    private final static QName _SplitRevenueStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "StatusCode");
    private final static QName _SplitRevenuePrimaryFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrimaryFlag");
    private final static QName _SplitRevenueSalesCreditTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SalesCreditTypeCode");
    private final static QName _SplitRevenueRevnAmountCurcyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnAmountCurcyCode");
    private final static QName _SplitRevenueBUOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "BUOrgId");
    private final static QName _PursuitMilestonesCCommentsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Comments_c");
    private final static QName _PursuitMilestonesCDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Date_c");
    private final static QName _PursuitMilestonesCTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Type_cMeaning");
    private final static QName _PursuitMilestonesCMilestoneTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MilestoneType_c");
    private final static QName _PursuitMilestonesCMilestoneTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MilestoneType_cMeaning");
    private final static QName _PursuitMilestonesCDoNotUseC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DoNotUse_c");
    private final static QName _TransientAppointmentPartyName1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyName1");
    private final static QName _TransientAppointmentRecurExceptionFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurExceptionFlag");
    private final static QName _TransientAppointmentPlannedDurationUOMCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedDurationUOMCd");
    private final static QName _TransientAppointmentOwnerId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OwnerId");
    private final static QName _TransientAppointmentActivityLocationTxt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityLocationTxt");
    private final static QName _TransientAppointmentRecurOrigInstDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurOrigInstDt");
    private final static QName _TransientAppointmentRecurFreqNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurFreqNumber");
    private final static QName _TransientAppointmentAllDayFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AllDayFlag");
    private final static QName _TransientAppointmentAsgnDenormFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnDenormFlag");
    private final static QName _TransientAppointmentRecurSunFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurSunFlag");
    private final static QName _TransientAppointmentRecurMonth_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurMonth");
    private final static QName _TransientAppointmentRecurApptId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurApptId");
    private final static QName _TransientAppointmentAsgnSystemFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnSystemFlag");
    private final static QName _TransientAppointmentPlannedEndDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedEndDt");
    private final static QName _TransientAppointmentRecurSatFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurSatFlag");
    private final static QName _TransientAppointmentConflictId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ConflictId");
    private final static QName _TransientAppointmentCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CreationDate");
    private final static QName _TransientAppointmentResponse_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "Response");
    private final static QName _TransientAppointmentLastUpdateLogin_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LastUpdateLogin");
    private final static QName _TransientAppointmentActivityDescription_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityDescription");
    private final static QName _TransientAppointmentShowTimeAs_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ShowTimeAs");
    private final static QName _TransientAppointmentOwner_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "Owner");
    private final static QName _TransientAppointmentRecurWeekDayCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurWeekDayCd");
    private final static QName _TransientAppointmentRecurPattern_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurPattern");
    private final static QName _TransientAppointmentVisibilityCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "VisibilityCd");
    private final static QName _TransientAppointmentCreatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CreatedBy");
    private final static QName _TransientAppointmentRecurTueFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurTueFlag");
    private final static QName _TransientAppointmentRecurThuFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurThuFlag");
    private final static QName _TransientAppointmentRecurEndDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurEndDt");
    private final static QName _TransientAppointmentAlarmFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AlarmFlag");
    private final static QName _TransientAppointmentRecurTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurTypeCd");
    private final static QName _TransientAppointmentAsgnManualFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AsgnManualFlag");
    private final static QName _TransientAppointmentRecurFriFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurFriFlag");
    private final static QName _TransientAppointmentRecurWedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurWedFlag");
    private final static QName _TransientAppointmentRecurReplaceCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurReplaceCd");
    private final static QName _TransientAppointmentRecurMonFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurMonFlag");
    private final static QName _TransientAppointmentCategoryCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CategoryCd");
    private final static QName _TransientAppointmentLockAsgnFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LockAsgnFlag");
    private final static QName _TransientAppointmentLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LastUpdateDate");
    private final static QName _TransientAppointmentCustomerId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CustomerId");
    private final static QName _TransientAppointmentApptAlarmTmMinimumNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ApptAlarmTmMinimumNumber");
    private final static QName _TransientAppointmentTemplateFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "TemplateFlag");
    private final static QName _TransientAppointmentPlannedDurationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedDurationNumber");
    private final static QName _TransientAppointmentRecurOccursNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurOccursNumber");
    private final static QName _TransientAppointmentRecurFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurFlag");
    private final static QName _TransientAppointmentObjectVersionNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ObjectVersionNumber");
    private final static QName _TransientAppointmentTemplateId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "TemplateId");
    private final static QName _TransientAppointmentDoNotRouteFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "DoNotRouteFlag");
    private final static QName _TransientAppointmentCustomerName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CustomerName");
    private final static QName _TransientAppointmentPlannedStartDt_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PlannedStartDt");
    private final static QName _TransientAppointmentLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "LastUpdatedBy");
    private final static QName _TransientAppointmentReferenceCustomerName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ReferenceCustomerName");
    private final static QName _TransientAppointmentPartyId1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "PartyId1");
    private final static QName _TransientAppointmentActivityName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityName");
    private final static QName _TransientAppointmentSourceObjectCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "SourceObjectCd");
    private final static QName _TransientAppointmentReferenceCustomerId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ReferenceCustomerId");
    private final static QName _TransientAppointmentRecurDay_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "RecurDay");
    private final static QName _TransientAppointmentEditMode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "EditMode");
    private final static QName _TransientAppointmentCategoryCodeTransient_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "CategoryCodeTransient");
    private final static QName _TransientAppointmentOwnerRsrcOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OwnerRsrcOrgId");
    private final static QName _ProjectLocationCLongitudeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Longitude_c");
    private final static QName _ProjectLocationCLocationCodeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LocationCode_c");
    private final static QName _ProjectLocationCLatitudeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Latitude_c");
    private final static QName _ProjectLocationCAddressC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Address_c");
    private final static QName _OpportunityContractsCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Contracts_cCurrencyCode");
    private final static QName _OpportunityGrossForecastsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "GrossForecasts_c");
    private final static QName _OpportunityConsumerLastName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConsumerLastName");
    private final static QName _OpportunityNAICSCodesC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "NAICSCodes_c");
    private final static QName _OpportunityProjectManagerC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectManager_c");
    private final static QName _OpportunityTotalAwaitNTPC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalAwaitNTP_c");
    private final static QName _OpportunitySalesMethod_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesMethod");
    private final static QName _OpportunityStatusCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StatusCode");
    private final static QName _OpportunitySupportLevelC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SupportLevel_c");
    private final static QName _OpportunityHDRPotentialCapacitygrossC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "HDRPotentialCapacitygross_c");
    private final static QName _OpportunityRevenueType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RevenueType");
    private final static QName _OpportunityBackEndLastUpdatedDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BackEndLastUpdatedDate_c");
    private final static QName _OpportunitySectorBusinessGroupCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SectorBusinessGroup_cMeaning");
    private final static QName _OpportunityProjectManagerforReportingC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectManagerforReporting_c");
    private final static QName _OpportunityARRAFundedC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ARRAFunded_c");
    private final static QName _OpportunityAccountNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AccountNumber");
    private final static QName _OpportunityHDRPotentialCapacitynetC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "HDRPotentialCapacitynet_c");
    private final static QName _OpportunityUSDRateforReportingC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "USDRateforReporting_c");
    private final static QName _OpportunityTargetPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TargetPartyId");
    private final static QName _OpportunityFalloutReasonC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FalloutReason_c");
    private final static QName _OpportunityUpsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "UpsideAmount");
    private final static QName _OpportunitySelectionProcessCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SelectionProcess_cMeaning");
    private final static QName _OpportunityOfFirmsAwardedC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OfFirmsAwarded_c");
    private final static QName _OpportunityProjectConstructionCostCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectConstructionCost_cCurcyConvRate");
    private final static QName _OpportunityAmountCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Amount_cCurcyConvRate");
    private final static QName _OpportunityARRAFundedCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ARRAFunded_cMeaning");
    private final static QName _OpportunityOpportunityLegacySystemIDC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityLegacySystemID_c");
    private final static QName _OpportunityTotalAwaitNTPsCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalAwaitNTPs_cCurrencyCode");
    private final static QName _OpportunityCityC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "City_c");
    private final static QName _OpportunityProjectConstructionCostC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectConstructionCost_c");
    private final static QName _OpportunitySubMarketsCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SubMarkets_cMeaning");
    private final static QName _OpportunitySectorTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SectorType_cMeaning");
    private final static QName _OpportunityConfidenceSC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConfidenceS_c");
    private final static QName _OpportunityStartDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StartDate_c");
    private final static QName _OpportunityEBSOpportunityIDC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EBSOpportunityID_c");
    private final static QName _OpportunityRegistered_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Registered");
    private final static QName _OpportunityNAICSCodeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "NAICSCode_c");
    private final static QName _OpportunityState_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "State");
    private final static QName _OpportunityProjectLocationC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectLocation_c");
    private final static QName _OpportunityPursuitProjectNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PursuitProjectNumber_c");
    private final static QName _OpportunityPrimaryAccountForReportingC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryAccountForReporting_c");
    private final static QName _OpportunityPotentialFeeCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PotentialFee_cCurcyConvRate");
    private final static QName _OpportunityGrossForecastsCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "GrossForecasts_cCurrencyCode");
    private final static QName _OpportunityDescription_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Description");
    private final static QName _OpportunityContractTypeCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContractType_cMeaning");
    private final static QName _OpportunityPrimaryCompanyAddressC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryCompanyAddress_c");
    private final static QName _OpportunityPrimaryContactLastName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactLastName");
    private final static QName _OpportunityEBSPursuitProjectIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EBSPursuitProjectId_c");
    private final static QName _OpportunityRFQDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RFQDate_c");
    private final static QName _OpportunityTotalAwaitNTPsCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalAwaitNTPs_cCurcyConvRate");
    private final static QName _OpportunityRegistrationStatus_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RegistrationStatus");
    private final static QName _OpportunityTimingCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Timing_cMeaning");
    private final static QName _OpportunityNetForecastsCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "NetForecasts_cCurrencyCode");
    private final static QName _OpportunityContractNameC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContractName_c");
    private final static QName _OpportunityContractC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Contract_c");
    private final static QName _OpportunityProjectCountryCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectCountry_cMeaning");
    private final static QName _OpportunityBookedsCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Bookeds_cCurcyConvRate");
    private final static QName _OpportunityCompetitorIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Competitor_Id_c");
    private final static QName _OpportunityAmountCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Amount_cCurrencyCode");
    private final static QName _OpportunityPrimaryRevenueId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryRevenueId");
    private final static QName _OpportunityNotesC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Notes_c");
    private final static QName _OpportunityPrimaryContactEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactEmailAddress");
    private final static QName _OpportunityBdgtAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BdgtAmount");
    private final static QName _OpportunityMarketingChargeNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MarketingChargeNumber_c");
    private final static QName _OpportunityPrimaryContactFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactFirstName");
    private final static QName _OpportunityOptyCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyCreationDate");
    private final static QName _OpportunityStrategicLevelCodeSetId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StrategicLevelCodeSetId");
    private final static QName _OpportunityCompanyC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Company_c");
    private final static QName _OpportunityBackEndStatusCheckC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BackEndStatusCheck_c");
    private final static QName _OpportunityCustomerAccountId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CustomerAccountId");
    private final static QName _OpportunitySupportTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SupportType_c");
    private final static QName _OpportunityMarketSectorsCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MarketSectors_cMeaning");
    private final static QName _OpportunityCityCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "City_cMeaning");
    private final static QName _OpportunityFormattedAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FormattedAddress");
    private final static QName _OpportunityTotalContractCapacitysCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalContractCapacitys_cCurcyConvRate");
    private final static QName _OpportunityCrmConversionRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CrmConversionRate");
    private final static QName _OpportunityAverageDaysAtStage_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AverageDaysAtStage");
    private final static QName _OpportunityPrConRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrConRelationshipId");
    private final static QName _OpportunityNetForecastsCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "NetForecasts_cCurcyConvRate");
    private final static QName _OpportunityDeliveryModelCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DeliveryModel_cMeaning");
    private final static QName _OpportunityRiskLevelCodeSetId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RiskLevelCodeSetId");
    private final static QName _OpportunityEBSProjectIDC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EBSProjectID_c");
    private final static QName _OpportunityTotalAwaitNTPsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalAwaitNTPs_c");
    private final static QName _OpportunityTotalFeeChangesCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalFeeChanges_cCurcyConvRate");
    private final static QName _OpportunityLookupCategory_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LookupCategory");
    private final static QName _OpportunityConfidenceSCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConfidenceS_cMeaning");
    private final static QName _OpportunityConsumerFirstName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConsumerFirstName");
    private final static QName _OpportunityStatusCodeSetId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StatusCodeSetId");
    private final static QName _OpportunityNetForecastC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "NetForecast_c");
    private final static QName _OpportunityOptyLastUpdateDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyLastUpdateDate");
    private final static QName _OpportunityPrSrcNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrSrcNumber");
    private final static QName _OpportunityGrossForecastsCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "GrossForecasts_cCurcyConvRate");
    private final static QName _OpportunityDecisionLevelCodeSetId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DecisionLevelCodeSetId");
    private final static QName _OpportunitySalesMethodId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesMethodId");
    private final static QName _OpportunityCurrentFyPotentialRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CurrentFyPotentialRevenue");
    private final static QName _OpportunitySectorBusinessGroupsCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SectorBusinessGroups_cMeaning");
    private final static QName _OpportunityProjectManagerEffectiveStartC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectManagerEffectiveStart_c");
    private final static QName _OpportunityDealHorizonCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealHorizonCode");
    private final static QName _OpportunityWinProbabilityCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "WinProbability_cMeaning");
    private final static QName _OpportunitySalesChannelCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesChannelCd");
    private final static QName _OpportunityLookupValuesId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LookupValuesId");
    private final static QName _OpportunitySubMarketsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SubMarkets_c");
    private final static QName _OpportunityPotentialFeeCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PotentialFee_cCurrencyCode");
    private final static QName _OpportunityTotalFeeChangesCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalFeeChanges_cCurrencyCode");
    private final static QName _OpportunityUpdateFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "UpdateFlag");
    private final static QName _OpportunityStageStatusCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StageStatusCd");
    private final static QName _OpportunityDownsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DownsideAmount");
    private final static QName _OpportunityOptyCreatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyCreatedBy");
    private final static QName _OpportunityMasterContractC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MasterContract_c");
    private final static QName _OpportunityForecastDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ForecastDate_c");
    private final static QName _OpportunityDUNSNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DUNSNumber");
    private final static QName _OpportunitySupportLevelsCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SupportLevels_cMeaning");
    private final static QName _OpportunityPursuitBdgtNoC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PursuitBdgtNo_c");
    private final static QName _OpportunityDescriptionText_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DescriptionText");
    private final static QName _OpportunityTotalContractCapacityC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalContractCapacity_c");
    private final static QName _OpportunityProjectManagersC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectManagers_c");
    private final static QName _OpportunityCrmRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "CrmRevenue");
    private final static QName _OpportunityBookedsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Bookeds_c");
    private final static QName _OpportunityRFPDueDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RFPDueDate_c");
    private final static QName _OpportunityContractsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Contracts_c");
    private final static QName _OpportunityGrossForecastC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "GrossForecast_c");
    private final static QName _OpportunityBackendOptyCreationCountC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BackendOptyCreationCount_c");
    private final static QName _OpportunitySalesStageId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesStageId");
    private final static QName _OpportunityTotalFeeChangeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalFeeChange_c");
    private final static QName _OpportunityAreaOfReachC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AreaOfReach_c");
    private final static QName _OpportunityContractsCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Contracts_cCurcyConvRate");
    private final static QName _OpportunityAwardTypesCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AwardTypes_cMeaning");
    private final static QName _OpportunityPrimaryClientIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryClient_Id_c");
    private final static QName _OpportunityPrimaryCompanyIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryCompanyId_c");
    private final static QName _OpportunityBudgetedFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BudgetedFlag");
    private final static QName _OpportunityRiskCommitteeSignOffDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RiskCommitteeSignOffDate_c");
    private final static QName _OpportunityProjectManagerEffectiveStartDaC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectManagerEffectiveStartDa_c");
    private final static QName _OpportunityEndDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EndDate_c");
    private final static QName _OpportunitySectorTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SectorType_c");
    private final static QName _OpportunityConstructionCostsCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConstructionCosts_cCurrencyCode");
    private final static QName _OpportunityStrategicLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StrategicLevelCode");
    private final static QName _OpportunityRFPReleaseDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RFPReleaseDate_c");
    private final static QName _OpportunityCompetitorC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Competitor_c");
    private final static QName _OpportunityNetForecastsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "NetForecasts_c");
    private final static QName _OpportunityAmountC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Amount_c");
    private final static QName _OpportunityBillableCompanyAddressC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BillableCompanyAddress_c");
    private final static QName _OpportunityContractNameIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContractName_Id_c");
    private final static QName _OpportunityActualCloseDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ActualCloseDate_c");
    private final static QName _OpportunityBackendEmailFromProjectManagerC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BackendEmailFromProjectManager_c");
    private final static QName _OpportunitySectorBusinessGroupsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SectorBusinessGroups_c");
    private final static QName _OpportunityProjectManagerIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectManager_Id_c");
    private final static QName _OpportunityPrimaryAccountIDC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryAccountID_c");
    private final static QName _OpportunityKeyContactId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "KeyContactId");
    private final static QName _OpportunityReasonWonLostCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ReasonWonLostCode");
    private final static QName _OpportunityConstructionCostsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConstructionCosts_c");
    private final static QName _OpportunityOpportunityIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OpportunityId_c");
    private final static QName _OpportunityPostalCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PostalCode");
    private final static QName _OpportunityFalloutReasonCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FalloutReason_cMeaning");
    private final static QName _OpportunityRcmndWinProb_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RcmndWinProb");
    private final static QName _OpportunitySolicitationNumberC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SolicitationNumber_c");
    private final static QName _OpportunityEBSProjectIDIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EBSProjectID_Id_c");
    private final static QName _OpportunityPotentialFeeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PotentialFee_c");
    private final static QName _OpportunityMarketSectorCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MarketSector_cMeaning");
    private final static QName _OpportunityNAICSDescriptionC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "NAICSDescription_c");
    private final static QName _OpportunityTimingC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Timing_c");
    private final static QName _OpportunityMaximumDaysInStage_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MaximumDaysInStage");
    private final static QName _OpportunityBudgetAvailableDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BudgetAvailableDate");
    private final static QName _OpportunitySupportRoleC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SupportRole_c");
    private final static QName _OpportunityOperatingUnitC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OperatingUnit_c");
    private final static QName _OpportunitySectorBusinessGroupC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SectorBusinessGroup_c");
    private final static QName _OpportunityPhonePreferenceExistsFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PhonePreferenceExistsFlag");
    private final static QName _OpportunityRevnLineSetEnabledFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RevnLineSetEnabledFlag");
    private final static QName _OpportunityRegistrationType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RegistrationType");
    private final static QName _OpportunityConstructionCostsCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConstructionCosts_cCurcyConvRate");
    private final static QName _OpportunityHDRRoleCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "HDRRole_cMeaning");
    private final static QName _OpportunityDecisionLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DecisionLevelCode");
    private final static QName _OpportunityPrimaryClientC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryClient_c");
    private final static QName _OpportunityConstructionCostC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ConstructionCost_c");
    private final static QName _OpportunityPrimaryCompetitorId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryCompetitorId");
    private final static QName _OpportunityDeleteFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DeleteFlag");
    private final static QName _OpportunityPreferredFunctionalCurrency_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PreferredFunctionalCurrency");
    private final static QName _OpportunityHDRPotentialCapacityGrosssCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "HDRPotentialCapacityGrosss_cCurcyConvRate");
    private final static QName _OpportunityDebriefCommentsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DebriefComments_c");
    private final static QName _OpportunityRevenue_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Revenue");
    private final static QName _OpportunityProjectManagersIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectManagers_Id_c");
    private final static QName _OpportunityRFPOwnerC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RFPOwner_c");
    private final static QName _OpportunityRiskLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RiskLevelCode");
    private final static QName _OpportunityBillableCompanyIdC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BillableCompanyId_c");
    private final static QName _OpportunityHDRPotentialCapacityNetsCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "HDRPotentialCapacityNets_cCurrencyCode");
    private final static QName _OpportunityBillableAccountIDC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BillableAccountID_c");
    private final static QName _OpportunityMarketSectorC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MarketSector_c");
    private final static QName _OpportunityBookedsCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Bookeds_cCurrencyCode");
    private final static QName _OpportunityTotalContractCapacitysCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalContractCapacitys_cCurrencyCode");
    private final static QName _OpportunityLastAssignedDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastAssignedDate");
    private final static QName _OpportunityReasonWonLostCodeSetId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ReasonWonLostCodeSetId");
    private final static QName _OpportunityDescriptionsC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Descriptions_c");
    private final static QName _OpportunityConfidenceC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Confidence_c");
    private final static QName _OpportunityCountyC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "County_c");
    private final static QName _OpportunityPrimaryContactFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryContactFormattedPhoneNumber");
    private final static QName _OpportunityEmployeesTotal_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmployeesTotal");
    private final static QName _OpportunityTotalFeeChangesC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalFeeChanges_c");
    private final static QName _OpportunityWinLossReasonC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "WinLossReason_c");
    private final static QName _OpportunitySectorTypesC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SectorTypes_c");
    private final static QName _OpportunityBackendActivityNameC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BackendActivityName_c");
    private final static QName _OpportunityAwardTypesC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AwardTypes_c");
    private final static QName _OpportunityStateProvinceCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "StateProvince_cMeaning");
    private final static QName _OpportunityContractNumbersC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContractNumbers_c");
    private final static QName _OpportunityDealHorizonCodeSetId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealHorizonCodeSetId");
    private final static QName _OpportunityPrimaryPartnerId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryPartnerId");
    private final static QName _OpportunityProjectConstructionCostCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectConstructionCost_cCurrencyCode");
    private final static QName _OpportunityBookedC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Booked_c");
    private final static QName _OpportunityProjectNameC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ProjectName_c");
    private final static QName _OpportunityInvolvementC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Involvement_c");
    private final static QName _OpportunityLineOfBusinessCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LineOfBusinessCode");
    private final static QName _OpportunityOptyLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "OptyLastUpdatedBy");
    private final static QName _OpportunityHDRPotentialCapacityGrosssCCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "HDRPotentialCapacityGrosss_cCurrencyCode");
    private final static QName _OpportunityExpectAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ExpectAmount");
    private final static QName _OpportunityHDRPotentialCapacityNetsCCurcyConvRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "HDRPotentialCapacityNets_cCurcyConvRate");
    private final static QName _OpportunityDeliveryModelC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DeliveryModel_c");
    private final static QName _OpportunityCity_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "City");
    private final static QName _OpportunityMarketingChargeNumbersC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "MarketingChargeNumbers_c");
    private final static QName _NoteDFFFLEXNumOfSegments_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "_FLEX_NumOfSegments");
    private final static QName _NoteDFFFLEXContext_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", "__FLEX_Context");
    private final static QName _OpportunityForecastCConfidencesC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Confidences_c");
    private final static QName _OpportunityForecastCConfidencesCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Confidences_cMeaning");
    private final static QName _OpportunityForecastCTotalGrossForecastC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalGrossForecast_c");
    private final static QName _OpportunityForecastCTotalNetForecastC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "TotalNetForecast_c");
    private final static QName _RevenueTerritoryForecastParticipationCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ForecastParticipationCode");
    private final static QName _RevenueTerritoryTerritoryVersionId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "TerritoryVersionId");
    private final static QName _RevenuePartnerDealType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DealType");
    private final static QName _RevenuePartnerRegistrationStatus_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RegistrationStatus");
    private final static QName _RevenuePartnerPartTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartTypeCd");
    private final static QName _RevenuePartnerDealExpirationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DealExpirationDate");
    private final static QName _RevenuePartnerPartOrgEmailAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartOrgEmailAddress");
    private final static QName _RevenuePartnerPreferredContactPhone_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PreferredContactPhone");
    private final static QName _RevenuePartnerPrPartResourcePartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrPartResourcePartyId");
    private final static QName _RevenuePartnerPreferredContactName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PreferredContactName");
    private final static QName _RevenuePartnerRevnPartnerNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnPartnerNumber");
    private final static QName _RevenuePartnerPartOrgFormattedPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartOrgFormattedPhoneNumber");
    private final static QName _RevenuePartnerDealEstCloseDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "DealEstCloseDate");
    private final static QName _RevenuePartnerPartProgramId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartProgramId");
    private final static QName _RevenuePartnerLastUpdatedBy_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "LastUpdatedBy");
    private final static QName _RevenuePartnerRegistrationNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RegistrationNumber");
    private final static QName _RevenuePartnerPreferredContactEmail_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PreferredContactEmail");
    private final static QName _OpportunityDealDealName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DealName");
    private final static QName _OpportunityDealApprovedDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ApprovedDate");
    private final static QName _OpportunityDealPartnerId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PartnerId");
    private final static QName _PartnersJointBidsCRoleCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Role_cMeaning");
    private final static QName _PartnersJointBidsCCommentC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Comment_c");
    private final static QName _PartnersJointBidsCRoleC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Role_c");
    private final static QName _PartnersJointBidsCTypeC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Type_c");
    private final static QName _EmployeessCBackEndCountForEmailC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "BackEndCountForEmail_c");
    private final static QName _EmployeessCLastNameC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LastName_c");
    private final static QName _EmployeessCEmailAddressC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmailAddress_c");
    private final static QName _ApproversCApproverDesignationC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ApproverDesignation_c");
    private final static QName _ApproversCGoNoGoFormC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "GoNoGoForm_c");
    private final static QName _ApproversCGoNoGoFormCMeaning_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "GoNoGoForm_cMeaning");
    private final static QName _ApproversCApprovalDateC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ApprovalDate_c");
    private final static QName _TransientAssigneeAssigneeId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AssigneeId");
    private final static QName _TransientAssigneeActivityAssigneeId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityAssigneeId");
    private final static QName _TransientAssigneeShowTimeAsCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ShowTimeAsCd");
    private final static QName _TransientAssigneeOwnerFlag_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "OwnerFlag");
    private final static QName _TransientAssigneeAppointmentResponseCd_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AppointmentResponseCd");
    private final static QName _TransientAssigneeAssigneeRsrcOrgId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "AssigneeRsrcOrgId");
    private final static QName _CommonAttachmentsUploadedFile_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "UploadedFile");
    private final static QName _CommonAttachmentsDmVersionNumber_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "DmVersionNumber");
    private final static QName _CommonAttachmentsFileName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "FileName");
    private final static QName _CommonAttachmentsDocumentEntityId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "DocumentEntityId");
    private final static QName _CommonAttachmentsTableName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "TableName");
    private final static QName _CommonAttachmentsDownloadStatus_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "DownloadStatus");
    private final static QName _CommonAttachmentsAttachedDocumentId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "AttachedDocumentId");
    private final static QName _CommonAttachmentsCategoryName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "CategoryName");
    private final static QName _CommonAttachmentsUploadedFileName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "UploadedFileName");
    private final static QName _CommonAttachmentsDescription_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "Description");
    private final static QName _CommonAttachmentsDmFolderPath_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "DmFolderPath");
    private final static QName _CommonAttachmentsDmNode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "DmNode");
    private final static QName _CommonAttachmentsDmRepository_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "DmRepository");
    private final static QName _CommonAttachmentsPk4Value_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "Pk4Value");
    private final static QName _CommonAttachmentsUsageType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "UsageType");
    private final static QName _CommonAttachmentsTitle_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "Title");
    private final static QName _CommonAttachmentsDocumentAttributes_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "DocumentAttributes");
    private final static QName _CommonAttachmentsPk2Value_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "Pk2Value");
    private final static QName _CommonAttachmentsPk5Value_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "Pk5Value");
    private final static QName _CommonAttachmentsUploadedFileContentType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "UploadedFileContentType");
    private final static QName _CommonAttachmentsEntityAttributes_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "EntityAttributes");
    private final static QName _CommonAttachmentsDatatypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "DatatypeCode");
    private final static QName _CommonAttachmentsDmType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "DmType");
    private final static QName _CommonAttachmentsURL_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "URL");
    private final static QName _CommonAttachmentsVersionControlIcon_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "VersionControlIcon");
    private final static QName _CommonAttachmentsFileURL_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "FileURL");
    private final static QName _CommonAttachmentsAttachment_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "Attachment");
    private final static QName _CommonAttachmentsPk1Value_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "Pk1Value");
    private final static QName _CommonAttachmentsPk3Value_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "Pk3Value");
    private final static QName _CommonAttachmentsEntityName_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "EntityName");
    private final static QName _CommonAttachmentsUploadedFileLength_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "UploadedFileLength");
    private final static QName _CommonAttachmentsUploadedText_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", "UploadedText");
    private final static QName _RevenueItemNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ItemNumber");
    private final static QName _RevenueSalesChannelCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SalesChannelCd");
    private final static QName _RevenueCrmCurcyCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CrmCurcyCode");
    private final static QName _RevenueRecurAdditionalAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurAdditionalAmount");
    private final static QName _RevenuePrPartOrgPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PrPartOrgPartyId");
    private final static QName _RevenueRevnCategoryCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnCategoryCode");
    private final static QName _RevenueAdditionalText2_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "AdditionalText2");
    private final static QName _RevenueAdditionalText1_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "AdditionalText1");
    private final static QName _RevenueParentRevnId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ParentRevnId");
    private final static QName _RevenueRevnCreationDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnCreationDate");
    private final static QName _RevenueDescription_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "Description");
    private final static QName _RevenueActualCloseDate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ActualCloseDate");
    private final static QName _RevenueCrmConversionRateType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CrmConversionRateType");
    private final static QName _RevenueRecurAdditionalNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurAdditionalNumber");
    private final static QName _RevenueNqSplitAllocTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "NqSplitAllocTypeCode");
    private final static QName _RevenueAdditionalAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "AdditionalAmount");
    private final static QName _RevenueRevnLineTypeCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnLineTypeCode");
    private final static QName _RevenuePartEngagementTypeCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartEngagementTypeCd");
    private final static QName _RevenueRecurExpectAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurExpectAmount");
    private final static QName _RevenueScheduleAction_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ScheduleAction");
    private final static QName _RevenuePartyUniqueName1_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "PartyUniqueName1");
    private final static QName _RevenueViewCriteriaIdentifier_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ViewCriteriaIdentifier");
    private final static QName _RevenueRecurUpsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurUpsideAmount");
    private final static QName _RevenueRecurUnitPrice_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurUnitPrice");
    private final static QName _RevenueCrmConversionRate_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "CrmConversionRate");
    private final static QName _RevenueRecurDownsideAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurDownsideAmount");
    private final static QName _RevenueAdditionalNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "AdditionalNumber");
    private final static QName _RevenueSalesAccountUniqueName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "SalesAccountUniqueName");
    private final static QName _RevenueDiscount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "Discount");
    private final static QName _RevenueOptyLeadId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "OptyLeadId");
    private final static QName _RevenueRevnSequenceNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RevnSequenceNumber");
    private final static QName _RevenueAttachmentEntityName_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "AttachmentEntityName");
    private final static QName _RevenueProductType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "ProductType");
    private final static QName _RevenueRecurPeriodOrEndDateCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", "RecurPeriodOrEndDateCode");
    private final static QName _OpportunityCompetitorThreatLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ThreatLevelCode");
    private final static QName _OpportunityCompetitorPrimaryFlg_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PrimaryFlg");
    private final static QName _OpportunityCompetitorAnnualRevenueAmount_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AnnualRevenueAmount");
    private final static QName _OpportunityContactContactedFlg_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContactedFlg");
    private final static QName _OpportunityContactAffinityLvlCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "AffinityLvlCd");
    private final static QName _OpportunityContactSalesBuyingRoleCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesBuyingRoleCode");
    private final static QName _OpportunityContactEmailPreferenceExistsFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "EmailPreferenceExistsFlag");
    private final static QName _OpportunityContactEmailC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Email_c");
    private final static QName _OpportunityContactSalesInfluenceLevelCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesInfluenceLevelCode");
    private final static QName _OpportunityContactContactPointType_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContactPointType");
    private final static QName _OpportunityContactFormattedMultilineAddress_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "FormattedMultilineAddress");
    private final static QName _OpportunityContactLocationId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "LocationId");
    private final static QName _OpportunityContactPhoneC_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "Phone_c");
    private final static QName _OpportunityContactPersonCentricJobTitle_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PersonCentricJobTitle");
    private final static QName _OpportunityContactSalesAffinityCode_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "SalesAffinityCode");
    private final static QName _OpportunityContactJobTitle_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "JobTitle");
    private final static QName _OpportunityContactPreferredContactMethod_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "PreferredContactMethod");
    private final static QName _OpportunityContactContactPointType1_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "ContactPointType1");
    private final static QName _OpportunityContactRawPhoneNumber_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RawPhoneNumber");
    private final static QName _OpportunityContactInfluenceLvlCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "InfluenceLvlCd");
    private final static QName _OpportunityContactRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RelationshipId");
    private final static QName _OpportunityContactRoleCd_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "RoleCd");
    private final static QName _OpportunityContactDoNotContactFlag_QNAME = new QName("http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", "DoNotContactFlag");
    private final static QName _NoteCreatorPartyId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CreatorPartyId");
    private final static QName _NoteCurcyConvRateType_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CurcyConvRateType");
    private final static QName _NoteStartDatesC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "StartDates_c");
    private final static QName _NoteCorpCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CorpCurrencyCode");
    private final static QName _NoteNoteAttributeUid2_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid2");
    private final static QName _NoteNoteAttributeUid3_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid3");
    private final static QName _NoteNoteAttributeUid4_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid4");
    private final static QName _NoteEndDateC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "EndDate_c");
    private final static QName _NoteNoteAttributeUid5_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid5");
    private final static QName _NoteNoteAttributeCategory_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeCategory");
    private final static QName _NoteContactRelationshipId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "ContactRelationshipId");
    private final static QName _NoteNoteAttributeUid1_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "NoteAttributeUid1");
    private final static QName _NoteStartDateC_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "StartDate_c");
    private final static QName _NoteCurrencyCode_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/notes/noteService", "CurrencyCode");
    private final static QName _TransientCategoryActivityCategoryId_QNAME = new QName("http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", "ActivityCategoryId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.hdr.ws.stubs.opportunity
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultType }
     * 
     */
    public FaultType createFaultType() {
        return new FaultType();
    }

    /**
     * Create an instance of {@link Detail }
     * 
     */
    public Detail createDetail() {
        return new Detail();
    }

    /**
     * Create an instance of {@link DeleteOpportunityMktResponseAsync }
     * 
     */
    public DeleteOpportunityMktResponseAsync createDeleteOpportunityMktResponseAsync() {
        return new DeleteOpportunityMktResponseAsync();
    }

    /**
     * Create an instance of {@link OpportunityResponse }
     * 
     */
    public OpportunityResponse createOpportunityResponse() {
        return new OpportunityResponse();
    }

    /**
     * Create an instance of {@link GetOpportunityResponse }
     * 
     */
    public GetOpportunityResponse createGetOpportunityResponse() {
        return new GetOpportunityResponse();
    }

    /**
     * Create an instance of {@link Opportunity }
     * 
     */
    public Opportunity createOpportunity() {
        return new Opportunity();
    }

    /**
     * Create an instance of {@link FindOpportunity }
     * 
     */
    public FindOpportunity createFindOpportunity() {
        return new FindOpportunity();
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
     * Create an instance of {@link CheckConstraintAsync }
     * 
     */
    public CheckConstraintAsync createCheckConstraintAsync() {
        return new CheckConstraintAsync();
    }

    /**
     * Create an instance of {@link DeleteEntity }
     * 
     */
    public DeleteEntity createDeleteEntity() {
        return new DeleteEntity();
    }

    /**
     * Create an instance of {@link CopyAttachmentAsync }
     * 
     */
    public CopyAttachmentAsync createCopyAttachmentAsync() {
        return new CopyAttachmentAsync();
    }

    /**
     * Create an instance of {@link CommonAttachments }
     * 
     */
    public CommonAttachments createCommonAttachments() {
        return new CommonAttachments();
    }

    /**
     * Create an instance of {@link DeleteAllRevenuesInOpportunityAsync }
     * 
     */
    public DeleteAllRevenuesInOpportunityAsync createDeleteAllRevenuesInOpportunityAsync() {
        return new DeleteAllRevenuesInOpportunityAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityContact }
     * 
     */
    public DeleteOpportunityContact createDeleteOpportunityContact() {
        return new DeleteOpportunityContact();
    }

    /**
     * Create an instance of {@link OpportunityContact }
     * 
     */
    public OpportunityContact createOpportunityContact() {
        return new OpportunityContact();
    }

    /**
     * Create an instance of {@link DoAutoAssignmentAsynchronouslyResponse }
     * 
     */
    public DoAutoAssignmentAsynchronouslyResponse createDoAutoAssignmentAsynchronouslyResponse() {
        return new DoAutoAssignmentAsynchronouslyResponse();
    }

    /**
     * Create an instance of {@link FindOpportunityAsyncResponse }
     * 
     */
    public FindOpportunityAsyncResponse createFindOpportunityAsyncResponse() {
        return new FindOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link IsSalesAccountUsedInOpportunityAsyncResponse }
     * 
     */
    public IsSalesAccountUsedInOpportunityAsyncResponse createIsSalesAccountUsedInOpportunityAsyncResponse() {
        return new IsSalesAccountUsedInOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityRevenueAsyncResponse }
     * 
     */
    public DeleteOpportunityRevenueAsyncResponse createDeleteOpportunityRevenueAsyncResponse() {
        return new DeleteOpportunityRevenueAsyncResponse();
    }

    /**
     * Create an instance of {@link ProcessCSOpportunityAsync }
     * 
     */
    public ProcessCSOpportunityAsync createProcessCSOpportunityAsync() {
        return new ProcessCSOpportunityAsync();
    }

    /**
     * Create an instance of {@link ProcessData }
     * 
     */
    public ProcessData createProcessData() {
        return new ProcessData();
    }

    /**
     * Create an instance of {@link ProcessControl }
     * 
     */
    public ProcessControl createProcessControl() {
        return new ProcessControl();
    }

    /**
     * Create an instance of {@link CheckConstraint }
     * 
     */
    public CheckConstraint createCheckConstraint() {
        return new CheckConstraint();
    }

    /**
     * Create an instance of {@link GetOpportunity }
     * 
     */
    public GetOpportunity createGetOpportunity() {
        return new GetOpportunity();
    }

    /**
     * Create an instance of {@link DeleteOpportunityLeadAsync }
     * 
     */
    public DeleteOpportunityLeadAsync createDeleteOpportunityLeadAsync() {
        return new DeleteOpportunityLeadAsync();
    }

    /**
     * Create an instance of {@link OpportunityLead }
     * 
     */
    public OpportunityLead createOpportunityLead() {
        return new OpportunityLead();
    }

    /**
     * Create an instance of {@link DeleteOpportunityMktResponseAsyncResponse }
     * 
     */
    public DeleteOpportunityMktResponseAsyncResponse createDeleteOpportunityMktResponseAsyncResponse() {
        return new DeleteOpportunityMktResponseAsyncResponse();
    }

    /**
     * Create an instance of {@link ProcessOpportunityAsyncResponse }
     * 
     */
    public ProcessOpportunityAsyncResponse createProcessOpportunityAsyncResponse() {
        return new ProcessOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link CheckConstraintResponse }
     * 
     */
    public CheckConstraintResponse createCheckConstraintResponse() {
        return new CheckConstraintResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityAsync }
     * 
     */
    public DeleteOpportunityAsync createDeleteOpportunityAsync() {
        return new DeleteOpportunityAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityCompetitorResponse }
     * 
     */
    public DeleteOpportunityCompetitorResponse createDeleteOpportunityCompetitorResponse() {
        return new DeleteOpportunityCompetitorResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunity }
     * 
     */
    public DeleteOpportunity createDeleteOpportunity() {
        return new DeleteOpportunity();
    }

    /**
     * Create an instance of {@link DeleteOpportunityCompetitorAsyncResponse }
     * 
     */
    public DeleteOpportunityCompetitorAsyncResponse createDeleteOpportunityCompetitorAsyncResponse() {
        return new DeleteOpportunityCompetitorAsyncResponse();
    }

    /**
     * Create an instance of {@link MergeOpportunity }
     * 
     */
    public MergeOpportunity createMergeOpportunity() {
        return new MergeOpportunity();
    }

    /**
     * Create an instance of {@link DeleteOpportunityMktResponse }
     * 
     */
    public DeleteOpportunityMktResponse createDeleteOpportunityMktResponse() {
        return new DeleteOpportunityMktResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityCompetitor }
     * 
     */
    public DeleteOpportunityCompetitor createDeleteOpportunityCompetitor() {
        return new DeleteOpportunityCompetitor();
    }

    /**
     * Create an instance of {@link OpportunityCompetitor }
     * 
     */
    public OpportunityCompetitor createOpportunityCompetitor() {
        return new OpportunityCompetitor();
    }

    /**
     * Create an instance of {@link UpdateOpportunityAsync }
     * 
     */
    public UpdateOpportunityAsync createUpdateOpportunityAsync() {
        return new UpdateOpportunityAsync();
    }

    /**
     * Create an instance of {@link DeleteAllRevenuesInOpportunityResponse }
     * 
     */
    public DeleteAllRevenuesInOpportunityResponse createDeleteAllRevenuesInOpportunityResponse() {
        return new DeleteAllRevenuesInOpportunityResponse();
    }

    /**
     * Create an instance of {@link UpdateOpportunityAsyncResponse }
     * 
     */
    public UpdateOpportunityAsyncResponse createUpdateOpportunityAsyncResponse() {
        return new UpdateOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityAsyncResponse }
     * 
     */
    public DeleteOpportunityAsyncResponse createDeleteOpportunityAsyncResponse() {
        return new DeleteOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunitySourceAsyncResponse }
     * 
     */
    public DeleteOpportunitySourceAsyncResponse createDeleteOpportunitySourceAsyncResponse() {
        return new DeleteOpportunitySourceAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityReferenceResponse }
     * 
     */
    public DeleteOpportunityReferenceResponse createDeleteOpportunityReferenceResponse() {
        return new DeleteOpportunityReferenceResponse();
    }

    /**
     * Create an instance of {@link GetAttachmentsListWithoutContentAsyncResponse }
     * 
     */
    public GetAttachmentsListWithoutContentAsyncResponse createGetAttachmentsListWithoutContentAsyncResponse() {
        return new GetAttachmentsListWithoutContentAsyncResponse();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeAsync }
     * 
     */
    public GetServiceLastUpdateTimeAsync createGetServiceLastUpdateTimeAsync() {
        return new GetServiceLastUpdateTimeAsync();
    }

    /**
     * Create an instance of {@link CreateAttachmentResponse }
     * 
     */
    public CreateAttachmentResponse createCreateAttachmentResponse() {
        return new CreateAttachmentResponse();
    }

    /**
     * Create an instance of {@link CreateAttachmentAsync }
     * 
     */
    public CreateAttachmentAsync createCreateAttachmentAsync() {
        return new CreateAttachmentAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityResourceResponse }
     * 
     */
    public DeleteOpportunityResourceResponse createDeleteOpportunityResourceResponse() {
        return new DeleteOpportunityResourceResponse();
    }

    /**
     * Create an instance of {@link ProcessCSOpportunityAsyncResponse }
     * 
     */
    public ProcessCSOpportunityAsyncResponse createProcessCSOpportunityAsyncResponse() {
        return new ProcessCSOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link DoAutoAssignmentAsynchronouslyAsync }
     * 
     */
    public DoAutoAssignmentAsynchronouslyAsync createDoAutoAssignmentAsynchronouslyAsync() {
        return new DoAutoAssignmentAsynchronouslyAsync();
    }

    /**
     * Create an instance of {@link UpdateOpportunity }
     * 
     */
    public UpdateOpportunity createUpdateOpportunity() {
        return new UpdateOpportunity();
    }

    /**
     * Create an instance of {@link DeleteOpportunityCompetitorAsync }
     * 
     */
    public DeleteOpportunityCompetitorAsync createDeleteOpportunityCompetitorAsync() {
        return new DeleteOpportunityCompetitorAsync();
    }

    /**
     * Create an instance of {@link FindOpportunityAsync }
     * 
     */
    public FindOpportunityAsync createFindOpportunityAsync() {
        return new FindOpportunityAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityRevenueAsync }
     * 
     */
    public DeleteOpportunityRevenueAsync createDeleteOpportunityRevenueAsync() {
        return new DeleteOpportunityRevenueAsync();
    }

    /**
     * Create an instance of {@link Revenue }
     * 
     */
    public Revenue createRevenue() {
        return new Revenue();
    }

    /**
     * Create an instance of {@link GetAttachmentContentAsync }
     * 
     */
    public GetAttachmentContentAsync createGetAttachmentContentAsync() {
        return new GetAttachmentContentAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityResponse }
     * 
     */
    public DeleteOpportunityResponse createDeleteOpportunityResponse() {
        return new DeleteOpportunityResponse();
    }

    /**
     * Create an instance of {@link CreateOpportunityAsync }
     * 
     */
    public CreateOpportunityAsync createCreateOpportunityAsync() {
        return new CreateOpportunityAsync();
    }

    /**
     * Create an instance of {@link ProcessOpportunity }
     * 
     */
    public ProcessOpportunity createProcessOpportunity() {
        return new ProcessOpportunity();
    }

    /**
     * Create an instance of {@link IsSalesAccountUsedInOpportunity }
     * 
     */
    public IsSalesAccountUsedInOpportunity createIsSalesAccountUsedInOpportunity() {
        return new IsSalesAccountUsedInOpportunity();
    }

    /**
     * Create an instance of {@link GetEntityList }
     * 
     */
    public GetEntityList createGetEntityList() {
        return new GetEntityList();
    }

    /**
     * Create an instance of {@link DeleteOpportunitySourceAsync }
     * 
     */
    public DeleteOpportunitySourceAsync createDeleteOpportunitySourceAsync() {
        return new DeleteOpportunitySourceAsync();
    }

    /**
     * Create an instance of {@link OpportunitySource }
     * 
     */
    public OpportunitySource createOpportunitySource() {
        return new OpportunitySource();
    }

    /**
     * Create an instance of {@link UpdateOpportunityResponse }
     * 
     */
    public UpdateOpportunityResponse createUpdateOpportunityResponse() {
        return new UpdateOpportunityResponse();
    }

    /**
     * Create an instance of {@link GetOpportunityAsyncResponse }
     * 
     */
    public GetOpportunityAsyncResponse createGetOpportunityAsyncResponse() {
        return new GetOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityReferenceAsyncResponse }
     * 
     */
    public DeleteOpportunityReferenceAsyncResponse createDeleteOpportunityReferenceAsyncResponse() {
        return new DeleteOpportunityReferenceAsyncResponse();
    }

    /**
     * Create an instance of {@link GetAttachmentsListWithoutContent }
     * 
     */
    public GetAttachmentsListWithoutContent createGetAttachmentsListWithoutContent() {
        return new GetAttachmentsListWithoutContent();
    }

    /**
     * Create an instance of {@link CheckConstraintAsyncResponse }
     * 
     */
    public CheckConstraintAsyncResponse createCheckConstraintAsyncResponse() {
        return new CheckConstraintAsyncResponse();
    }

    /**
     * Create an instance of {@link ProcessCSOpportunityResponse }
     * 
     */
    public ProcessCSOpportunityResponse createProcessCSOpportunityResponse() {
        return new ProcessCSOpportunityResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityReferenceAsync }
     * 
     */
    public DeleteOpportunityReferenceAsync createDeleteOpportunityReferenceAsync() {
        return new DeleteOpportunityReferenceAsync();
    }

    /**
     * Create an instance of {@link OpportunityReference }
     * 
     */
    public OpportunityReference createOpportunityReference() {
        return new OpportunityReference();
    }

    /**
     * Create an instance of {@link GetAttachmentContentAsyncResponse }
     * 
     */
    public GetAttachmentContentAsyncResponse createGetAttachmentContentAsyncResponse() {
        return new GetAttachmentContentAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityContactAsyncResponse }
     * 
     */
    public DeleteOpportunityContactAsyncResponse createDeleteOpportunityContactAsyncResponse() {
        return new DeleteOpportunityContactAsyncResponse();
    }

    /**
     * Create an instance of {@link GetOpportunityAsync }
     * 
     */
    public GetOpportunityAsync createGetOpportunityAsync() {
        return new GetOpportunityAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityContactAsync }
     * 
     */
    public DeleteOpportunityContactAsync createDeleteOpportunityContactAsync() {
        return new DeleteOpportunityContactAsync();
    }

    /**
     * Create an instance of {@link IsSalesAccountUsedInOpportunityAsync }
     * 
     */
    public IsSalesAccountUsedInOpportunityAsync createIsSalesAccountUsedInOpportunityAsync() {
        return new IsSalesAccountUsedInOpportunityAsync();
    }

    /**
     * Create an instance of {@link DeleteOpportunityLead }
     * 
     */
    public DeleteOpportunityLead createDeleteOpportunityLead() {
        return new DeleteOpportunityLead();
    }

    /**
     * Create an instance of {@link DeleteOpportunityRevenueResponse }
     * 
     */
    public DeleteOpportunityRevenueResponse createDeleteOpportunityRevenueResponse() {
        return new DeleteOpportunityRevenueResponse();
    }

    /**
     * Create an instance of {@link MergeOpportunityAsync }
     * 
     */
    public MergeOpportunityAsync createMergeOpportunityAsync() {
        return new MergeOpportunityAsync();
    }

    /**
     * Create an instance of {@link CreateOpportunityAsyncResponse }
     * 
     */
    public CreateOpportunityAsyncResponse createCreateOpportunityAsyncResponse() {
        return new CreateOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityReference }
     * 
     */
    public DeleteOpportunityReference createDeleteOpportunityReference() {
        return new DeleteOpportunityReference();
    }

    /**
     * Create an instance of {@link DeleteAttachment }
     * 
     */
    public DeleteAttachment createDeleteAttachment() {
        return new DeleteAttachment();
    }

    /**
     * Create an instance of {@link DeleteOpportunityMktResponseResponse }
     * 
     */
    public DeleteOpportunityMktResponseResponse createDeleteOpportunityMktResponseResponse() {
        return new DeleteOpportunityMktResponseResponse();
    }

    /**
     * Create an instance of {@link GetAttachmentsListWithoutContentAsync }
     * 
     */
    public GetAttachmentsListWithoutContentAsync createGetAttachmentsListWithoutContentAsync() {
        return new GetAttachmentsListWithoutContentAsync();
    }

    /**
     * Create an instance of {@link GetEntityListAsync }
     * 
     */
    public GetEntityListAsync createGetEntityListAsync() {
        return new GetEntityListAsync();
    }

    /**
     * Create an instance of {@link GetAttachmentContentResponse }
     * 
     */
    public GetAttachmentContentResponse createGetAttachmentContentResponse() {
        return new GetAttachmentContentResponse();
    }

    /**
     * Create an instance of {@link FindOpportunityResponse }
     * 
     */
    public FindOpportunityResponse createFindOpportunityResponse() {
        return new FindOpportunityResponse();
    }

    /**
     * Create an instance of {@link CopyAttachmentAsyncResponse }
     * 
     */
    public CopyAttachmentAsyncResponse createCopyAttachmentAsyncResponse() {
        return new CopyAttachmentAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityLeadAsyncResponse }
     * 
     */
    public DeleteOpportunityLeadAsyncResponse createDeleteOpportunityLeadAsyncResponse() {
        return new DeleteOpportunityLeadAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteAttachmentAsync }
     * 
     */
    public DeleteAttachmentAsync createDeleteAttachmentAsync() {
        return new DeleteAttachmentAsync();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsAsync }
     * 
     */
    public GetDfltObjAttrHintsAsync createGetDfltObjAttrHintsAsync() {
        return new GetDfltObjAttrHintsAsync();
    }

    /**
     * Create an instance of {@link CopyAttachment }
     * 
     */
    public CopyAttachment createCopyAttachment() {
        return new CopyAttachment();
    }

    /**
     * Create an instance of {@link DeleteOpportunitySourceResponse }
     * 
     */
    public DeleteOpportunitySourceResponse createDeleteOpportunitySourceResponse() {
        return new DeleteOpportunitySourceResponse();
    }

    /**
     * Create an instance of {@link ProcessCSOpportunity }
     * 
     */
    public ProcessCSOpportunity createProcessCSOpportunity() {
        return new ProcessCSOpportunity();
    }

    /**
     * Create an instance of {@link DeleteOpportunitySource }
     * 
     */
    public DeleteOpportunitySource createDeleteOpportunitySource() {
        return new DeleteOpportunitySource();
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
     * Create an instance of {@link CreateOpportunity }
     * 
     */
    public CreateOpportunity createCreateOpportunity() {
        return new CreateOpportunity();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeAsyncResponse }
     * 
     */
    public GetServiceLastUpdateTimeAsyncResponse createGetServiceLastUpdateTimeAsyncResponse() {
        return new GetServiceLastUpdateTimeAsyncResponse();
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
     * Create an instance of {@link GetServiceLastUpdateTime }
     * 
     */
    public GetServiceLastUpdateTime createGetServiceLastUpdateTime() {
        return new GetServiceLastUpdateTime();
    }

    /**
     * Create an instance of {@link DeleteOpportunityResource }
     * 
     */
    public DeleteOpportunityResource createDeleteOpportunityResource() {
        return new DeleteOpportunityResource();
    }

    /**
     * Create an instance of {@link OpportunityResource }
     * 
     */
    public OpportunityResource createOpportunityResource() {
        return new OpportunityResource();
    }

    /**
     * Create an instance of {@link GetAttachmentsListWithoutContentResponse }
     * 
     */
    public GetAttachmentsListWithoutContentResponse createGetAttachmentsListWithoutContentResponse() {
        return new GetAttachmentsListWithoutContentResponse();
    }

    /**
     * Create an instance of {@link DoAutoAssignmentAsynchronouslyAsyncResponse }
     * 
     */
    public DoAutoAssignmentAsynchronouslyAsyncResponse createDoAutoAssignmentAsynchronouslyAsyncResponse() {
        return new DoAutoAssignmentAsynchronouslyAsyncResponse();
    }

    /**
     * Create an instance of {@link IsSalesAccountUsedInOpportunityResponse }
     * 
     */
    public IsSalesAccountUsedInOpportunityResponse createIsSalesAccountUsedInOpportunityResponse() {
        return new IsSalesAccountUsedInOpportunityResponse();
    }

    /**
     * Create an instance of {@link GetEntityListAsyncResponse }
     * 
     */
    public GetEntityListAsyncResponse createGetEntityListAsyncResponse() {
        return new GetEntityListAsyncResponse();
    }

    /**
     * Create an instance of {@link CopyAttachmentResponse }
     * 
     */
    public CopyAttachmentResponse createCopyAttachmentResponse() {
        return new CopyAttachmentResponse();
    }

    /**
     * Create an instance of {@link MergeOpportunityAsyncResponse }
     * 
     */
    public MergeOpportunityAsyncResponse createMergeOpportunityAsyncResponse() {
        return new MergeOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteAllRevenuesInOpportunityAsyncResponse }
     * 
     */
    public DeleteAllRevenuesInOpportunityAsyncResponse createDeleteAllRevenuesInOpportunityAsyncResponse() {
        return new DeleteAllRevenuesInOpportunityAsyncResponse();
    }

    /**
     * Create an instance of {@link CreateOpportunityResponse }
     * 
     */
    public CreateOpportunityResponse createCreateOpportunityResponse() {
        return new CreateOpportunityResponse();
    }

    /**
     * Create an instance of {@link CreateAttachmentAsyncResponse }
     * 
     */
    public CreateAttachmentAsyncResponse createCreateAttachmentAsyncResponse() {
        return new CreateAttachmentAsyncResponse();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHints }
     * 
     */
    public GetDfltObjAttrHints createGetDfltObjAttrHints() {
        return new GetDfltObjAttrHints();
    }

    /**
     * Create an instance of {@link DeleteOpportunityLeadResponse }
     * 
     */
    public DeleteOpportunityLeadResponse createDeleteOpportunityLeadResponse() {
        return new DeleteOpportunityLeadResponse();
    }

    /**
     * Create an instance of {@link GetDfltObjAttrHintsAsyncResponse }
     * 
     */
    public GetDfltObjAttrHintsAsyncResponse createGetDfltObjAttrHintsAsyncResponse() {
        return new GetDfltObjAttrHintsAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityResourceAsync }
     * 
     */
    public DeleteOpportunityResourceAsync createDeleteOpportunityResourceAsync() {
        return new DeleteOpportunityResourceAsync();
    }

    /**
     * Create an instance of {@link CreateAttachment }
     * 
     */
    public CreateAttachment createCreateAttachment() {
        return new CreateAttachment();
    }

    /**
     * Create an instance of {@link DeleteOpportunityRevenue }
     * 
     */
    public DeleteOpportunityRevenue createDeleteOpportunityRevenue() {
        return new DeleteOpportunityRevenue();
    }

    /**
     * Create an instance of {@link DoAutoAssignmentAsynchronously }
     * 
     */
    public DoAutoAssignmentAsynchronously createDoAutoAssignmentAsynchronously() {
        return new DoAutoAssignmentAsynchronously();
    }

    /**
     * Create an instance of {@link ProcessOpportunityAsync }
     * 
     */
    public ProcessOpportunityAsync createProcessOpportunityAsync() {
        return new ProcessOpportunityAsync();
    }

    /**
     * Create an instance of {@link DeleteAttachmentResponse }
     * 
     */
    public DeleteAttachmentResponse createDeleteAttachmentResponse() {
        return new DeleteAttachmentResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityResourceAsyncResponse }
     * 
     */
    public DeleteOpportunityResourceAsyncResponse createDeleteOpportunityResourceAsyncResponse() {
        return new DeleteOpportunityResourceAsyncResponse();
    }

    /**
     * Create an instance of {@link ProcessOpportunityResponse }
     * 
     */
    public ProcessOpportunityResponse createProcessOpportunityResponse() {
        return new ProcessOpportunityResponse();
    }

    /**
     * Create an instance of {@link GetAttachmentContent }
     * 
     */
    public GetAttachmentContent createGetAttachmentContent() {
        return new GetAttachmentContent();
    }

    /**
     * Create an instance of {@link MergeOpportunityResponse }
     * 
     */
    public MergeOpportunityResponse createMergeOpportunityResponse() {
        return new MergeOpportunityResponse();
    }

    /**
     * Create an instance of {@link DeleteAllRevenuesInOpportunity }
     * 
     */
    public DeleteAllRevenuesInOpportunity createDeleteAllRevenuesInOpportunity() {
        return new DeleteAllRevenuesInOpportunity();
    }

    /**
     * Create an instance of {@link GetServiceLastUpdateTimeResponse }
     * 
     */
    public GetServiceLastUpdateTimeResponse createGetServiceLastUpdateTimeResponse() {
        return new GetServiceLastUpdateTimeResponse();
    }

    /**
     * Create an instance of {@link DeleteAttachmentAsyncResponse }
     * 
     */
    public DeleteAttachmentAsyncResponse createDeleteAttachmentAsyncResponse() {
        return new DeleteAttachmentAsyncResponse();
    }

    /**
     * Create an instance of {@link DeleteOpportunityContactResponse }
     * 
     */
    public DeleteOpportunityContactResponse createDeleteOpportunityContactResponse() {
        return new DeleteOpportunityContactResponse();
    }

    /**
     * Create an instance of {@link RevenueTerritory }
     * 
     */
    public RevenueTerritory createRevenueTerritory() {
        return new RevenueTerritory();
    }

    /**
     * Create an instance of {@link SplitRevenue }
     * 
     */
    public SplitRevenue createSplitRevenue() {
        return new SplitRevenue();
    }

    /**
     * Create an instance of {@link RecurringRevenue }
     * 
     */
    public RecurringRevenue createRecurringRevenue() {
        return new RecurringRevenue();
    }

    /**
     * Create an instance of {@link RevenuePartner }
     * 
     */
    public RevenuePartner createRevenuePartner() {
        return new RevenuePartner();
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
     * Create an instance of {@link AmountType }
     * 
     */
    public AmountType createAmountType() {
        return new AmountType();
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
     * Create an instance of {@link DataGraphType }
     * 
     */
    public DataGraphType createDataGraphType() {
        return new DataGraphType();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link Types }
     * 
     */
    public Types createTypes() {
        return new Types();
    }

    /**
     * Create an instance of {@link ModelsType }
     * 
     */
    public ModelsType createModelsType() {
        return new ModelsType();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
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
     * Create an instance of {@link OpportunityDeal }
     * 
     */
    public OpportunityDeal createOpportunityDeal() {
        return new OpportunityDeal();
    }

    /**
     * Create an instance of {@link EmployeessC }
     * 
     */
    public EmployeessC createEmployeessC() {
        return new EmployeessC();
    }

    /**
     * Create an instance of {@link RelatedOpportunitiesC }
     * 
     */
    public RelatedOpportunitiesC createRelatedOpportunitiesC() {
        return new RelatedOpportunitiesC();
    }

    /**
     * Create an instance of {@link ProjectLocationC }
     * 
     */
    public ProjectLocationC createProjectLocationC() {
        return new ProjectLocationC();
    }

    /**
     * Create an instance of {@link OpportunityForecastC }
     * 
     */
    public OpportunityForecastC createOpportunityForecastC() {
        return new OpportunityForecastC();
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
     * Create an instance of {@link DeleteError }
     * 
     */
    public DeleteError createDeleteError() {
        return new DeleteError();
    }

    /**
     * Create an instance of {@link Note }
     * 
     */
    public Note createNote() {
        return new Note();
    }

    /**
     * Create an instance of {@link NoteDFF }
     * 
     */
    public NoteDFF createNoteDFF() {
        return new NoteDFF();
    }

    /**
     * Create an instance of {@link RevenueLineSet }
     * 
     */
    public RevenueLineSet createRevenueLineSet() {
        return new RevenueLineSet();
    }

    /**
     * Create an instance of {@link CategorySummaryRevenue }
     * 
     */
    public CategorySummaryRevenue createCategorySummaryRevenue() {
        return new CategorySummaryRevenue();
    }

    /**
     * Create an instance of {@link TransientCategory }
     * 
     */
    public TransientCategory createTransientCategory() {
        return new TransientCategory();
    }

    /**
     * Create an instance of {@link TransientNote }
     * 
     */
    public TransientNote createTransientNote() {
        return new TransientNote();
    }

    /**
     * Create an instance of {@link TransientAppointment }
     * 
     */
    public TransientAppointment createTransientAppointment() {
        return new TransientAppointment();
    }

    /**
     * Create an instance of {@link TransientAssignee }
     * 
     */
    public TransientAssignee createTransientAssignee() {
        return new TransientAssignee();
    }

    /**
     * Create an instance of {@link TransientContact }
     * 
     */
    public TransientContact createTransientContact() {
        return new TransientContact();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityReference }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityReference")
    public JAXBElement<OpportunityReference> createOpportunityReference(OpportunityReference value) {
        return new JAXBElement<OpportunityReference>(_OpportunityReference_QNAME, OpportunityReference.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenueTerritory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenueTerritory")
    public JAXBElement<RevenueTerritory> createRevenueTerritory(RevenueTerritory value) {
        return new JAXBElement<RevenueTerritory>(_RevenueTerritory_QNAME, RevenueTerritory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RecurringRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "recurringRevenue")
    public JAXBElement<RecurringRevenue> createRecurringRevenue(RecurringRevenue value) {
        return new JAXBElement<RecurringRevenue>(_RecurringRevenue_QNAME, RecurringRevenue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracleas/schema/oracle-fault-11_0", name = "Fault")
    public JAXBElement<FaultType> createFault(FaultType value) {
        return new JAXBElement<FaultType>(_Fault_QNAME, FaultType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PursuitMilestonesC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "pursuitMilestones_c")
    public JAXBElement<PursuitMilestonesC> createPursuitMilestonesC(PursuitMilestonesC value) {
        return new JAXBElement<PursuitMilestonesC>(_PursuitMilestonesC_QNAME, PursuitMilestonesC.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CompetitorC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "competitor_c")
    public JAXBElement<CompetitorC> createCompetitorC(CompetitorC value) {
        return new JAXBElement<CompetitorC>(_CompetitorC_QNAME, CompetitorC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunitySource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunitySource")
    public JAXBElement<OpportunitySource> createOpportunitySource(OpportunitySource value) {
        return new JAXBElement<OpportunitySource>(_OpportunitySource_QNAME, OpportunitySource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Note }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "note")
    public JAXBElement<Note> createNote(Note value) {
        return new JAXBElement<Note>(_Note_QNAME, Note.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DataGraphType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "datagraph")
    public JAXBElement<DataGraphType> createDatagraph(DataGraphType value) {
        return new JAXBElement<DataGraphType>(_Datagraph_QNAME, DataGraphType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityLead }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityLead")
    public JAXBElement<OpportunityLead> createOpportunityLead(OpportunityLead value) {
        return new JAXBElement<OpportunityLead>(_OpportunityLead_QNAME, OpportunityLead.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityForecastC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityForecast_c")
    public JAXBElement<OpportunityForecastC> createOpportunityForecastC(OpportunityForecastC value) {
        return new JAXBElement<OpportunityForecastC>(_OpportunityForecastC_QNAME, OpportunityForecastC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmployeessC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "employeess_c")
    public JAXBElement<EmployeessC> createEmployeessC(EmployeessC value) {
        return new JAXBElement<EmployeessC>(_EmployeessC_QNAME, EmployeessC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityDeal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityDeal")
    public JAXBElement<OpportunityDeal> createOpportunityDeal(OpportunityDeal value) {
        return new JAXBElement<OpportunityDeal>(_OpportunityDeal_QNAME, OpportunityDeal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteError }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "deleteError")
    public JAXBElement<DeleteError> createDeleteError(DeleteError value) {
        return new JAXBElement<DeleteError>(_DeleteError_QNAME, DeleteError.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link PartnersJointBidsC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "partnersJointBids_c")
    public JAXBElement<PartnersJointBidsC> createPartnersJointBidsC(PartnersJointBidsC value) {
        return new JAXBElement<PartnersJointBidsC>(_PartnersJointBidsC_QNAME, PartnersJointBidsC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityResponse")
    public JAXBElement<OpportunityResponse> createOpportunityResponse(OpportunityResponse value) {
        return new JAXBElement<OpportunityResponse>(_OpportunityResponse_QNAME, OpportunityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityCompetitor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityCompetitor")
    public JAXBElement<OpportunityCompetitor> createOpportunityCompetitor(OpportunityCompetitor value) {
        return new JAXBElement<OpportunityCompetitor>(_OpportunityCompetitor_QNAME, OpportunityCompetitor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "findControl")
    public JAXBElement<FindControl> createFindControl(FindControl value) {
        return new JAXBElement<FindControl>(_FindControl_QNAME, FindControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenueLineSet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenueLineSet")
    public JAXBElement<RevenueLineSet> createRevenueLineSet(RevenueLineSet value) {
        return new JAXBElement<RevenueLineSet>(_RevenueLineSet_QNAME, RevenueLineSet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SplitRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "splitRevenue")
    public JAXBElement<SplitRevenue> createSplitRevenue(SplitRevenue value) {
        return new JAXBElement<SplitRevenue>(_SplitRevenue_QNAME, SplitRevenue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "deleteEntity")
    public JAXBElement<DeleteEntity> createDeleteEntity(DeleteEntity value) {
        return new JAXBElement<DeleteEntity>(_DeleteEntity_QNAME, DeleteEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NoteDFF }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", name = "noteDFF")
    public JAXBElement<NoteDFF> createNoteDFF(NoteDFF value) {
        return new JAXBElement<NoteDFF>(_NoteDFF_QNAME, NoteDFF.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Opportunity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunity")
    public JAXBElement<Opportunity> createOpportunity(Opportunity value) {
        return new JAXBElement<Opportunity>(_Opportunity_QNAME, Opportunity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientAppointment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientAppointment")
    public JAXBElement<TransientAppointment> createTransientAppointment(TransientAppointment value) {
        return new JAXBElement<TransientAppointment>(_TransientAppointment_QNAME, TransientAppointment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityContact")
    public JAXBElement<OpportunityContact> createOpportunityContact(OpportunityContact value) {
        return new JAXBElement<OpportunityContact>(_OpportunityContact_QNAME, OpportunityContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Revenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenue")
    public JAXBElement<Revenue> createRevenue(Revenue value) {
        return new JAXBElement<Revenue>(_Revenue_QNAME, Revenue.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Types }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "types")
    public JAXBElement<Types> createTypes(Types value) {
        return new JAXBElement<Types>(_Types_QNAME, Types.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CategorySummaryRevenue }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "categorySummaryRevenue")
    public JAXBElement<CategorySummaryRevenue> createCategorySummaryRevenue(CategorySummaryRevenue value) {
        return new JAXBElement<CategorySummaryRevenue>(_CategorySummaryRevenue_QNAME, CategorySummaryRevenue.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link CommonAttachments }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "commonAttachments")
    public JAXBElement<CommonAttachments> createCommonAttachments(CommonAttachments value) {
        return new JAXBElement<CommonAttachments>(_CommonAttachments_QNAME, CommonAttachments.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientCategory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientCategory")
    public JAXBElement<TransientCategory> createTransientCategory(TransientCategory value) {
        return new JAXBElement<TransientCategory>(_TransientCategory_QNAME, TransientCategory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApproversC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "approvers_c")
    public JAXBElement<ApproversC> createApproversC(ApproversC value) {
        return new JAXBElement<ApproversC>(_ApproversC_QNAME, ApproversC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientContact }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientContact")
    public JAXBElement<TransientContact> createTransientContact(TransientContact value) {
        return new JAXBElement<TransientContact>(_TransientContact_QNAME, TransientContact.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProjectLocationC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "projectLocation_c")
    public JAXBElement<ProjectLocationC> createProjectLocationC(ProjectLocationC value) {
        return new JAXBElement<ProjectLocationC>(_ProjectLocationC_QNAME, ProjectLocationC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "processData")
    public JAXBElement<ProcessData> createProcessData(ProcessData value) {
        return new JAXBElement<ProcessData>(_ProcessData_QNAME, ProcessData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientAssignee }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientAssignee")
    public JAXBElement<TransientAssignee> createTransientAssignee(TransientAssignee value) {
        return new JAXBElement<TransientAssignee>(_TransientAssignee_QNAME, TransientAssignee.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OpportunityResource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "opportunityResource")
    public JAXBElement<OpportunityResource> createOpportunityResource(OpportunityResource value) {
        return new JAXBElement<OpportunityResource>(_OpportunityResource_QNAME, OpportunityResource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RelatedOpportunitiesC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "relatedOpportunities_c")
    public JAXBElement<RelatedOpportunitiesC> createRelatedOpportunitiesC(RelatedOpportunitiesC value) {
        return new JAXBElement<RelatedOpportunitiesC>(_RelatedOpportunitiesC_QNAME, RelatedOpportunitiesC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RevenuePartner }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "revenuePartner")
    public JAXBElement<RevenuePartner> createRevenuePartner(RevenuePartner value) {
        return new JAXBElement<RevenuePartner>(_RevenuePartner_QNAME, RevenuePartner.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "commonj.sdo", name = "type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransientNote }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "transientNote")
    public JAXBElement<TransientNote> createTransientNote(TransientNote value) {
        return new JAXBElement<TransientNote>(_TransientNote_QNAME, TransientNote.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProcessControl }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/adf/svc/types/", name = "processControl")
    public JAXBElement<ProcessControl> createProcessControl(ProcessControl value) {
        return new JAXBElement<ProcessControl>(_ProcessControl_QNAME, ProcessControl.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PersonFirstName", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourcePersonFirstName(String value) {
        return new JAXBElement<String>(_OpportunityResourcePersonFirstName_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartnerOrgId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourcePartnerOrgId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourcePartnerOrgId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealProtected", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceDealProtected(String value) {
        return new JAXBElement<String>(_OpportunityResourceDealProtected_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Title_c", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceTitleC(String value) {
        return new JAXBElement<String>(_OpportunityResourceTitleC_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AccessLevelCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceAccessLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceAccessLevelCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MgrResourceId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourceMgrResourceId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourceMgrResourceId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LockAssignmentFlag", scope = OpportunityResource.class)
    public JAXBElement<Boolean> createOpportunityResourceLockAssignmentFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityResourceLockAssignmentFlag_QNAME, Boolean.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AssignmentType", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceAssignmentType(String value) {
        return new JAXBElement<String>(_OpportunityResourceAssignmentType_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealProtectedDate", scope = OpportunityResource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResourceDealProtectedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceDealProtectedDate_QNAME, XMLGregorianCalendar.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedPhoneNumber", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityResourceFormattedPhoneNumber_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Department_c", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceDepartmentC(String value) {
        return new JAXBElement<String>(_OpportunityResourceDepartmentC_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PersonLastName", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourcePersonLastName(String value) {
        return new JAXBElement<String>(_OpportunityResourcePersonLastName_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OwnerFlag", scope = OpportunityResource.class)
    public JAXBElement<Boolean> createOpportunityResourceOwnerFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityResourceOwnerFlag_QNAME, Boolean.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AsgnTerritoryVersionId", scope = OpportunityResource.class)
    public JAXBElement<Long> createOpportunityResourceAsgnTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_OpportunityResourceAsgnTerritoryVersionId_QNAME, Long.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityResource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResourceUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnits_c", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceBusinessUnitsC(String value) {
        return new JAXBElement<String>(_OpportunityResourceBusinessUnitsC_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OrgTreeCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceOrgTreeCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceOrgTreeCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MemberFunctionCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceMemberFunctionCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceMemberFunctionCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealExpirationDate", scope = OpportunityResource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResourceDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceDealExpirationDate_QNAME, XMLGregorianCalendar.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_c", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceBusinessUnitC(String value) {
        return new JAXBElement<String>(_OpportunityResourceBusinessUnitC_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Titles_c", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceTitlesC(String value) {
        return new JAXBElement<String>(_OpportunityResourceTitlesC_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OrgTreeStructureCode", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceOrgTreeStructureCode(String value) {
        return new JAXBElement<String>(_OpportunityResourceOrgTreeStructureCode_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Department_cMeaning", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceDepartmentCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityResourceDepartmentCMeaning_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_cMeaning", scope = OpportunityResource.class)
    public JAXBElement<String> createOpportunityResourceBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityResourceBusinessUnitCMeaning_QNAME, String.class, OpportunityResource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "ErrorMessage", scope = DeleteError.class)
    public JAXBElement<String> createDeleteErrorErrorMessage(String value) {
        return new JAXBElement<String>(_DeleteErrorErrorMessage_QNAME, String.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "ProgramName", scope = DeleteError.class)
    public JAXBElement<String> createDeleteErrorProgramName(String value) {
        return new JAXBElement<String>(_DeleteErrorProgramName_QNAME, String.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "ErrorCode", scope = DeleteError.class)
    public JAXBElement<String> createDeleteErrorErrorCode(String value) {
        return new JAXBElement<String>(_DeleteErrorErrorCode_QNAME, String.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteErrorType", scope = DeleteError.class)
    public JAXBElement<Integer> createDeleteErrorDeleteErrorType(Integer value) {
        return new JAXBElement<Integer>(_DeleteErrorDeleteErrorType_QNAME, Integer.class, DeleteError.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevnAmount", scope = OpportunityReference.class)
    public JAXBElement<AmountType> createOpportunityReferenceRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityReferenceRevnAmount_QNAME, AmountType.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CustomerContactRelationId", scope = OpportunityReference.class)
    public JAXBElement<Long> createOpportunityReferenceCustomerContactRelationId(Long value) {
        return new JAXBElement<Long>(_OpportunityReferenceCustomerContactRelationId_QNAME, Long.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName1", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferencePartyUniqueName1(String value) {
        return new JAXBElement<String>(_OpportunityReferencePartyUniqueName1_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments1", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceComments1(String value) {
        return new JAXBElement<String>(_OpportunityReferenceComments1_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityReference.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityReferenceUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountId", scope = OpportunityReference.class)
    public JAXBElement<Long> createOpportunityReferenceSalesAccountId(Long value) {
        return new JAXBElement<Long>(_OpportunityReferenceSalesAccountId_QNAME, Long.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinProb", scope = OpportunityReference.class)
    public JAXBElement<BigDecimal> createOpportunityReferenceWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityReferenceWinProb_QNAME, BigDecimal.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DUNSNumberC", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceDUNSNumberC(String value) {
        return new JAXBElement<String>(_OpportunityReferenceDUNSNumberC_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountUniqueName", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceSalesAccountUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityReferenceSalesAccountUniqueName_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferencePartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityReferencePartyUniqueName_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IntContactPartyId", scope = OpportunityReference.class)
    public JAXBElement<Long> createOpportunityReferenceIntContactPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityReferenceIntContactPartyId_QNAME, Long.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ReferenceRankNumber", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceReferenceRankNumber(String value) {
        return new JAXBElement<String>(_OpportunityReferenceReferenceRankNumber_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = OpportunityReference.class)
    public JAXBElement<String> createOpportunityReferenceComments(String value) {
        return new JAXBElement<String>(_OpportunityReferenceComments_QNAME, String.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EffectiveDate", scope = OpportunityReference.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityReferenceEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityReferenceEffectiveDate_QNAME, XMLGregorianCalendar.class, OpportunityReference.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteDate", scope = DeleteEntity.class)
    public JAXBElement<XMLGregorianCalendar> createDeleteEntityDeleteDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DeleteEntityDeleteDate_QNAME, XMLGregorianCalendar.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "EntitySequenceNumber", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityEntitySequenceNumber(Long value) {
        return new JAXBElement<Long>(_DeleteEntityEntitySequenceNumber_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk2Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk2Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk2Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk1Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk1Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk1Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk5Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk5Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk5Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteStatusType", scope = DeleteEntity.class)
    public JAXBElement<Integer> createDeleteEntityDeleteStatusType(Integer value) {
        return new JAXBElement<Integer>(_DeleteEntityDeleteStatusType_QNAME, Integer.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "DeleteEntityType", scope = DeleteEntity.class)
    public JAXBElement<Integer> createDeleteEntityDeleteEntityType(Integer value) {
        return new JAXBElement<Integer>(_DeleteEntityDeleteEntityType_QNAME, Integer.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk4Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk4Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk4Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/scm/productModel/deleteGroups/publicModel/", name = "Pk3Value", scope = DeleteEntity.class)
    public JAXBElement<Long> createDeleteEntityPk3Value(Long value) {
        return new JAXBElement<Long>(_DeleteEntityPk3Value_QNAME, Long.class, DeleteEntity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityContactId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactActivityContactId(Long value) {
        return new JAXBElement<Long>(_TransientContactActivityContactId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonTitle", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonTitle(String value) {
        return new JAXBElement<String>(_TransientContactPersonTitle_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonLastName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonLastName(String value) {
        return new JAXBElement<String>(_TransientContactPersonLastName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ContactId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactContactId(Long value) {
        return new JAXBElement<Long>(_TransientContactContactId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPartyName(String value) {
        return new JAXBElement<String>(_TransientContactPartyName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactPartyId(Long value) {
        return new JAXBElement<Long>(_TransientContactPartyId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactActivityId(Long value) {
        return new JAXBElement<Long>(_TransientContactActivityId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonFirstName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonFirstName(String value) {
        return new JAXBElement<String>(_TransientContactPersonFirstName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ContactRelationshipId", scope = TransientContact.class)
    public JAXBElement<Long> createTransientContactContactRelationshipId(Long value) {
        return new JAXBElement<Long>(_TransientContactContactRelationshipId_QNAME, Long.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyType", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPartyType(String value) {
        return new JAXBElement<String>(_TransientContactPartyType_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PersonMiddleName", scope = TransientContact.class)
    public JAXBElement<String> createTransientContactPersonMiddleName(String value) {
        return new JAXBElement<String>(_TransientContactPersonMiddleName_QNAME, String.class, TransientContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrDealPartOrgPartyId", scope = OpportunityLead.class)
    public JAXBElement<Long> createOpportunityLeadPrDealPartOrgPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityLeadPrDealPartOrgPartyId_QNAME, Long.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RegistrationNumber", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadRegistrationNumber(String value) {
        return new JAXBElement<String>(_OpportunityLeadRegistrationNumber_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartnerTypeCd", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadPartnerTypeCd(String value) {
        return new JAXBElement<String>(_OpportunityLeadPartnerTypeCd_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealPartProgramId", scope = OpportunityLead.class)
    public JAXBElement<Long> createOpportunityLeadDealPartProgramId(Long value) {
        return new JAXBElement<Long>(_OpportunityLeadDealPartProgramId_QNAME, Long.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityLead.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLeadUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealExpirationDate", scope = OpportunityLead.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLeadDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceDealExpirationDate_QNAME, XMLGregorianCalendar.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrDealPartResourcePartyId", scope = OpportunityLead.class)
    public JAXBElement<Long> createOpportunityLeadPrDealPartResourcePartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityLeadPrDealPartResourcePartyId_QNAME, Long.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealEstimatedCloseDate", scope = OpportunityLead.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLeadDealEstimatedCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLeadDealEstimatedCloseDate_QNAME, XMLGregorianCalendar.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealType", scope = OpportunityLead.class)
    public JAXBElement<String> createOpportunityLeadDealType(String value) {
        return new JAXBElement<String>(_OpportunityLeadDealType_QNAME, String.class, OpportunityLead.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "NoteTxt", scope = TransientNote.class)
    public JAXBElement<byte[]> createTransientNoteNoteTxt(byte[] value) {
        return new JAXBElement<byte[]>(_TransientNoteNoteTxt_QNAME, byte[].class, TransientNote.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "NoteTypeCode", scope = TransientNote.class)
    public JAXBElement<String> createTransientNoteNoteTypeCode(String value) {
        return new JAXBElement<String>(_TransientNoteNoteTypeCode_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "NoteId", scope = TransientNote.class)
    public JAXBElement<Long> createTransientNoteNoteId(Long value) {
        return new JAXBElement<Long>(_TransientNoteNoteId_QNAME, Long.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientNote.class)
    public JAXBElement<String> createTransientNotePartyName(String value) {
        return new JAXBElement<String>(_TransientContactPartyName_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientNote.class)
    public JAXBElement<String> createTransientNotePartyId(String value) {
        return new JAXBElement<String>(_TransientContactPartyId_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectCode", scope = TransientNote.class)
    public JAXBElement<String> createTransientNoteSourceObjectCode(String value) {
        return new JAXBElement<String>(_TransientNoteSourceObjectCode_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "VisibilityCode", scope = TransientNote.class)
    public JAXBElement<String> createTransientNoteVisibilityCode(String value) {
        return new JAXBElement<String>(_TransientNoteVisibilityCode_QNAME, String.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectId", scope = TransientNote.class)
    public JAXBElement<Long> createTransientNoteSourceObjectId(Long value) {
        return new JAXBElement<Long>(_TransientNoteSourceObjectId_QNAME, Long.class, TransientNote.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnLineTypeCode", scope = RevenueLineSet.class, defaultValue = "LINE_SET_REVN")
    public JAXBElement<String> createRevenueLineSetRevnLineTypeCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetRevnLineTypeCode_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmountCurcyCode", scope = RevenueLineSet.class)
    public JAXBElement<String> createRevenueLineSetRevnAmountCurcyCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetRevnAmountCurcyCode_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetOptyId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetOptyId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "BUOrgId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetBUOrgId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetBUOrgId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = RevenueLineSet.class)
    public JAXBElement<String> createRevenueLineSetLastUpdateLogin(String value) {
        return new JAXBElement<String>(_RevenueLineSetLastUpdateLogin_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCode", scope = RevenueLineSet.class)
    public JAXBElement<String> createRevenueLineSetStatusCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetStatusCode_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CustomerAccountId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetCustomerAccountId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerResourceId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetOwnerResourceId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetOwnerResourceId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeStructCode", scope = RevenueLineSet.class)
    public JAXBElement<String> createRevenueLineSetOwnerOrgTreeStructCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetOwnerOrgTreeStructCode_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = RevenueLineSet.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueLineSetEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueLineSetEffectiveDate_QNAME, XMLGregorianCalendar.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CustomerPartyId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetCustomerPartyId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetCustomerPartyId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "ProdGroupId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetProdGroupId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetProdGroupId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmount", scope = RevenueLineSet.class)
    public JAXBElement<AmountType> createRevenueLineSetRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueLineSetRevnAmount_QNAME, AmountType.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = RevenueLineSet.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueLineSetUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueLineSetUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerResourceOrgId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetOwnerResourceOrgId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetOwnerResourceOrgId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnSequenceNumber", scope = RevenueLineSet.class)
    public JAXBElement<Integer> createRevenueLineSetRevnSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_RevenueLineSetRevnSequenceNumber_QNAME, Integer.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeCode", scope = RevenueLineSet.class)
    public JAXBElement<String> createRevenueLineSetOwnerOrgTreeCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetOwnerOrgTreeCode_QNAME, String.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesAccountId", scope = RevenueLineSet.class)
    public JAXBElement<Long> createRevenueLineSetSalesAccountId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetSalesAccountId_QNAME, Long.class, RevenueLineSet.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnLineTypeCode", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueRevnLineTypeCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetRevnLineTypeCode_QNAME, String.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrimaryFlag", scope = CategorySummaryRevenue.class)
    public JAXBElement<Boolean> createCategorySummaryRevenuePrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_CategorySummaryRevenuePrimaryFlag_QNAME, Boolean.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyId", scope = CategorySummaryRevenue.class)
    public JAXBElement<Long> createCategorySummaryRevenueOptyId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetOptyId_QNAME, Long.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "BUOrgId", scope = CategorySummaryRevenue.class)
    public JAXBElement<Long> createCategorySummaryRevenueBUOrgId(Long value) {
        return new JAXBElement<Long>(_RevenueLineSetBUOrgId_QNAME, Long.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmountCurcyCode", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueRevnAmountCurcyCode(String value) {
        return new JAXBElement<String>(_RevenueLineSetRevnAmountCurcyCode_QNAME, String.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmCategorySummaryRevenue", scope = CategorySummaryRevenue.class)
    public JAXBElement<BigDecimal> createCategorySummaryRevenueCrmCategorySummaryRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CategorySummaryRevenueCrmCategorySummaryRevenue_QNAME, BigDecimal.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueLastUpdateLogin(String value) {
        return new JAXBElement<String>(_RevenueLineSetLastUpdateLogin_QNAME, String.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmConversionRate", scope = CategorySummaryRevenue.class)
    public JAXBElement<BigDecimal> createCategorySummaryRevenueCrmConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CategorySummaryRevenueCrmConversionRate_QNAME, BigDecimal.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = CategorySummaryRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createCategorySummaryRevenueEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueLineSetEffectiveDate_QNAME, XMLGregorianCalendar.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmConversionRateType", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueCrmConversionRateType(String value) {
        return new JAXBElement<String>(_CategorySummaryRevenueCrmConversionRateType_QNAME, String.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmount", scope = CategorySummaryRevenue.class)
    public JAXBElement<AmountType> createCategorySummaryRevenueRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueLineSetRevnAmount_QNAME, AmountType.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = CategorySummaryRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createCategorySummaryRevenueUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueLineSetUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnCategoryCode", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueRevnCategoryCode(String value) {
        return new JAXBElement<String>(_CategorySummaryRevenueRevnCategoryCode_QNAME, String.class, CategorySummaryRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/oracle/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmCurcyCode", scope = CategorySummaryRevenue.class)
    public JAXBElement<String> createCategorySummaryRevenueCrmCurcyCode(String value) {
        return new JAXBElement<String>(_CategorySummaryRevenueCrmCurcyCode_QNAME, String.class, CategorySummaryRevenue.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCLastUpdateDate_QNAME, XMLGregorianCalendar.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCIsOwner(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCIsOwner_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionName_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurcyConvRateType_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = RelatedOpportunitiesC.class)
    public JAXBElement<Integer> createRelatedOpportunitiesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerSor_QNAME, Integer.class, RelatedOpportunitiesC.class, value);
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
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCOpportunityVOIdC_QNAME, BigDecimal.class, RelatedOpportunitiesC.class, value);
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
        return new JAXBElement<Long>(_RelatedOpportunitiesCRequestId_QNAME, Long.class, RelatedOpportunitiesC.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionPackage_QNAME, String.class, RelatedOpportunitiesC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCCorpCurrencyCode_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = RelatedOpportunitiesC.class)
    public JAXBElement<Integer> createRelatedOpportunitiesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerPillar_QNAME, Integer.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCCreatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCreatedBy_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_c", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCBusinessUnitC(String value) {
        return new JAXBElement<String>(_OpportunityResourceBusinessUnitC_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_cMeaning", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityResourceBusinessUnitCMeaning_QNAME, String.class, RelatedOpportunitiesC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCLastUpdatedBy_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = RelatedOpportunitiesC.class)
    public JAXBElement<BigDecimal> createRelatedOpportunitiesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCObjectVersionNumber_QNAME, BigDecimal.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurrencyCode_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = RelatedOpportunitiesC.class)
    public JAXBElement<XMLGregorianCalendar> createRelatedOpportunitiesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCCreationDate_QNAME, XMLGregorianCalendar.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = RelatedOpportunitiesC.class)
    public JAXBElement<String> createRelatedOpportunitiesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCpdrfLastUpd_QNAME, String.class, RelatedOpportunitiesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesAccountId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueSalesAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSalesAccountId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerLockAsgnFlag", scope = SplitRevenue.class)
    public JAXBElement<Boolean> createSplitRevenueOwnerLockAsgnFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenueOwnerLockAsgnFlag_QNAME, Boolean.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UOMCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueUOMCode(String value) {
        return new JAXBElement<String>(_SplitRevenueUOMCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRate", scope = SplitRevenue.class)
    public JAXBElement<BigDecimal> createSplitRevenueConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueConversionRate_QNAME, BigDecimal.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CommitFlag", scope = SplitRevenue.class)
    public JAXBElement<Boolean> createSplitRevenueCommitFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenueCommitFlag_QNAME, Boolean.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurFrequencyCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueRecurFrequencyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurFrequencyCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurTypeCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueRecurTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurTypeCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerDealProtectedDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueOwnerDealProtectedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueOwnerDealProtectedDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DownsideAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueDownsideAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueExpectAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueExpectAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Quantity", scope = SplitRevenue.class)
    public JAXBElement<MeasureType> createSplitRevenueQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueQuantity_QNAME, MeasureType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ResourcePartyId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueResourcePartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueResourcePartyId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SplitRevenueLastUpdateLogin_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueOwnerOrgTreeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueOwnerOrgTreeCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRateType", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueConversionRateType(String value) {
        return new JAXBElement<String>(_SplitRevenueConversionRateType_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectDlvryDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueExpectDlvryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueExpectDlvryDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerDealExpirationDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueOwnerDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueOwnerDealExpirationDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitTypeCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueSplitTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSplitTypeCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ProdGroupId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueProdGroupId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueProdGroupId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCodeSetId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueStatusCodeSetId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueStatusCodeSetId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurParentRevnId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueRecurParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueRecurParentRevnId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryOrgId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueInventoryOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryOrgId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitPercent", scope = SplitRevenue.class)
    public JAXBElement<BigDecimal> createSplitRevenueSplitPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueSplitPercent_QNAME, BigDecimal.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CloseReasonCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueCloseReasonCode(String value) {
        return new JAXBElement<String>(_SplitRevenueCloseReasonCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurQuantity", scope = SplitRevenue.class)
    public JAXBElement<MeasureType> createSplitRevenueRecurQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueRecurQuantity_QNAME, MeasureType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "WinProb", scope = SplitRevenue.class)
    public JAXBElement<BigDecimal> createSplitRevenueWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueWinProb_QNAME, BigDecimal.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCodeSetId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueTypeCodeSetId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueTypeCodeSetId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrTerritoryUpdatedById", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenuePrTerritoryUpdatedById(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrTerritoryUpdatedById_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ForecastOverrideCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueForecastOverrideCode(String value) {
        return new JAXBElement<String>(_SplitRevenueForecastOverrideCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeStructCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueOwnerOrgTreeStructCode(String value) {
        return new JAXBElement<String>(_SplitRevenueOwnerOrgTreeStructCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UpsideAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUpsideAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UnitPrice", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueUnitPrice(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUnitPrice_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TargetPartyId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueTargetPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueTargetPartyId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Comments", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueComments(String value) {
        return new JAXBElement<String>(_SplitRevenueComments_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrCmptPartyId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenuePrCmptPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrCmptPartyId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryItemId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueInventoryItemId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryItemId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CustomerAccountId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCustomerAccountId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurRevnAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueRecurRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRecurRevnAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueOptyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOptyId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurEndDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueRecurEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurEndDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrTerritoryVersionId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenuePrTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrTerritoryVersionId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "MarginAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueMarginAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueMarginAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurNumberPeriods", scope = SplitRevenue.class)
    public JAXBElement<Integer> createSplitRevenueRecurNumberPeriods(Integer value) {
        return new JAXBElement<Integer>(_SplitRevenueRecurNumberPeriods_QNAME, Integer.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerResourceOrgId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueOwnerResourceOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOwnerResourceOrgId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueTypeCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRevnAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueEffectiveDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurStartDate", scope = SplitRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createSplitRevenueRecurStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurStartDate_QNAME, XMLGregorianCalendar.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CloseReasonCodeSetId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueCloseReasonCodeSetId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCloseReasonCodeSetId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CostAmount", scope = SplitRevenue.class)
    public JAXBElement<AmountType> createSplitRevenueCostAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueCostAmount_QNAME, AmountType.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AssignmentType", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueAssignmentType(String value) {
        return new JAXBElement<String>(_SplitRevenueAssignmentType_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CreditRcptPartOrgPartyId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueCreditRcptPartOrgPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCreditRcptPartOrgPartyId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitParentRevnId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueSplitParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSplitParentRevnId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueStatusCode(String value) {
        return new JAXBElement<String>(_SplitRevenueStatusCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrimaryFlag", scope = SplitRevenue.class)
    public JAXBElement<Boolean> createSplitRevenuePrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenuePrimaryFlag_QNAME, Boolean.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesCreditTypeCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueSalesCreditTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSalesCreditTypeCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmountCurcyCode", scope = SplitRevenue.class)
    public JAXBElement<String> createSplitRevenueRevnAmountCurcyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRevnAmountCurcyCode_QNAME, String.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "BUOrgId", scope = SplitRevenue.class)
    public JAXBElement<Long> createSplitRevenueBUOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueBUOrgId_QNAME, Long.class, SplitRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = PursuitMilestonesC.class)
    public JAXBElement<Long> createPursuitMilestonesCRequestId(Long value) {
        return new JAXBElement<Long>(_RelatedOpportunitiesCRequestId_QNAME, Long.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCIsOwner(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCIsOwner_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = PursuitMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createPursuitMilestonesCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCJobDefinitionName(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionName_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = PursuitMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createPursuitMilestonesCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments_c", scope = PursuitMilestonesC.class)
    public JAXBElement<byte[]> createPursuitMilestonesCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_PursuitMilestonesCCommentsC_QNAME, byte[].class, PursuitMilestonesC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionPackage_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCorpCurrencyCode_QNAME, String.class, PursuitMilestonesC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCCurcyConvRateType_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCCreatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCreatedBy_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = PursuitMilestonesC.class)
    public JAXBElement<Integer> createPursuitMilestonesCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerPillar_QNAME, Integer.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = PursuitMilestonesC.class)
    public JAXBElement<Integer> createPursuitMilestonesCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerSor_QNAME, Integer.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Type_cMeaning", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCTypeCMeaning(String value) {
        return new JAXBElement<String>(_PursuitMilestonesCTypeCMeaning_QNAME, String.class, PursuitMilestonesC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCLastUpdatedBy_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = PursuitMilestonesC.class)
    public JAXBElement<BigDecimal> createPursuitMilestonesCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCOpportunityVOIdC_QNAME, BigDecimal.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = PursuitMilestonesC.class)
    public JAXBElement<BigDecimal> createPursuitMilestonesCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCObjectVersionNumber_QNAME, BigDecimal.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurrencyCode_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = PursuitMilestonesC.class)
    public JAXBElement<XMLGregorianCalendar> createPursuitMilestonesCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCCreationDate_QNAME, XMLGregorianCalendar.class, PursuitMilestonesC.class, value);
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
        return new JAXBElement<String>(_PursuitMilestonesCDoNotUseC_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = PursuitMilestonesC.class)
    public JAXBElement<String> createPursuitMilestonesCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCpdrfLastUpd_QNAME, String.class, PursuitMilestonesC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityResponse.class)
    public JAXBElement<String> createOpportunityResponseLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityResponse.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityResponseUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName1", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentPartyName1(String value) {
        return new JAXBElement<String>(_TransientAppointmentPartyName1_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurExceptionFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurExceptionFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurExceptionFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedDurationUOMCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentPlannedDurationUOMCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentPlannedDurationUOMCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OwnerId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentOwnerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentOwnerId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentPartyId(Long value) {
        return new JAXBElement<Long>(_TransientContactPartyId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentActivityId(Long value) {
        return new JAXBElement<Long>(_TransientContactActivityId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityLocationTxt", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentActivityLocationTxt(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityLocationTxt_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurOrigInstDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentRecurOrigInstDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentRecurOrigInstDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFreqNumber", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurFreqNumber(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurFreqNumber_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AllDayFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAllDayFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAllDayFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnDenormFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAsgnDenormFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAsgnDenormFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentSourceObjectId(Long value) {
        return new JAXBElement<Long>(_TransientNoteSourceObjectId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurSunFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurSunFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurSunFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurMonth", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurMonth(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurMonth_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurApptId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurApptId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurApptId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnSystemFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAsgnSystemFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAsgnSystemFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedEndDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentPlannedEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentPlannedEndDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurSatFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurSatFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurSatFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ConflictId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentConflictId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentConflictId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CreationDate", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentCreationDate_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "Response", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentResponse(String value) {
        return new JAXBElement<String>(_TransientAppointmentResponse_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdateLogin", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentLastUpdateLogin(String value) {
        return new JAXBElement<String>(_TransientAppointmentLastUpdateLogin_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityDescription", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentActivityDescription(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityDescription_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ShowTimeAs", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentShowTimeAs(String value) {
        return new JAXBElement<String>(_TransientAppointmentShowTimeAs_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "Owner", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentOwner(String value) {
        return new JAXBElement<String>(_TransientAppointmentOwner_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurWeekDayCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurWeekDayCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurWeekDayCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurPattern", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurPattern(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurPattern_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "VisibilityCd", scope = TransientAppointment.class, defaultValue = "INTERNAL PARTICIPANT ONLY")
    public JAXBElement<String> createTransientAppointmentVisibilityCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentVisibilityCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CreatedBy", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCreatedBy(String value) {
        return new JAXBElement<String>(_TransientAppointmentCreatedBy_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurTueFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurTueFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurTueFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurThuFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurThuFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurThuFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurEndDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentRecurEndDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentRecurEndDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AlarmFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAlarmFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAlarmFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurTypeCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurTypeCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurTypeCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AsgnManualFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentAsgnManualFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentAsgnManualFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentPartyName(String value) {
        return new JAXBElement<String>(_TransientContactPartyName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFriFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurFriFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurFriFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurWedFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurWedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurWedFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurReplaceCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentRecurReplaceCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentRecurReplaceCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurMonFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurMonFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurMonFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CategoryCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCategoryCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentCategoryCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LockAsgnFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentLockAsgnFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentLockAsgnFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdateDate", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentLastUpdateDate_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CustomerId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentCustomerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentCustomerId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ApptAlarmTmMinimumNumber", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentApptAlarmTmMinimumNumber(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentApptAlarmTmMinimumNumber_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "TemplateFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentTemplateFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentTemplateFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedDurationNumber", scope = TransientAppointment.class)
    public JAXBElement<BigDecimal> createTransientAppointmentPlannedDurationNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_TransientAppointmentPlannedDurationNumber_QNAME, BigDecimal.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurOccursNumber", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurOccursNumber(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurOccursNumber_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentRecurFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentRecurFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ObjectVersionNumber", scope = TransientAppointment.class)
    public JAXBElement<Integer> createTransientAppointmentObjectVersionNumber(Integer value) {
        return new JAXBElement<Integer>(_TransientAppointmentObjectVersionNumber_QNAME, Integer.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "TemplateId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentTemplateId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentTemplateId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "DoNotRouteFlag", scope = TransientAppointment.class)
    public JAXBElement<Boolean> createTransientAppointmentDoNotRouteFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAppointmentDoNotRouteFlag_QNAME, Boolean.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CustomerName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCustomerName(String value) {
        return new JAXBElement<String>(_TransientAppointmentCustomerName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PlannedStartDt", scope = TransientAppointment.class)
    public JAXBElement<XMLGregorianCalendar> createTransientAppointmentPlannedStartDt(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_TransientAppointmentPlannedStartDt_QNAME, XMLGregorianCalendar.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "LastUpdatedBy", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentLastUpdatedBy(String value) {
        return new JAXBElement<String>(_TransientAppointmentLastUpdatedBy_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ReferenceCustomerName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentReferenceCustomerName(String value) {
        return new JAXBElement<String>(_TransientAppointmentReferenceCustomerName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId1", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentPartyId1(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentPartyId1_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityName", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentActivityName(String value) {
        return new JAXBElement<String>(_TransientAppointmentActivityName_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "SourceObjectCd", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentSourceObjectCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentSourceObjectCd_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ReferenceCustomerId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentReferenceCustomerId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentReferenceCustomerId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "RecurDay", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentRecurDay(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentRecurDay_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "EditMode", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentEditMode(String value) {
        return new JAXBElement<String>(_TransientAppointmentEditMode_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CategoryCodeTransient", scope = TransientAppointment.class)
    public JAXBElement<String> createTransientAppointmentCategoryCodeTransient(String value) {
        return new JAXBElement<String>(_TransientAppointmentCategoryCodeTransient_QNAME, String.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OwnerRsrcOrgId", scope = TransientAppointment.class)
    public JAXBElement<Long> createTransientAppointmentOwnerRsrcOrgId(Long value) {
        return new JAXBElement<Long>(_TransientAppointmentOwnerRsrcOrgId_QNAME, Long.class, TransientAppointment.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = ProjectLocationC.class)
    public JAXBElement<Long> createProjectLocationCRequestId(Long value) {
        return new JAXBElement<Long>(_RelatedOpportunitiesCRequestId_QNAME, Long.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCIsOwner(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCIsOwner_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = ProjectLocationC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectLocationCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCJobDefinitionName(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionName_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = ProjectLocationC.class)
    public JAXBElement<XMLGregorianCalendar> createProjectLocationCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionPackage_QNAME, String.class, ProjectLocationC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCCorpCurrencyCode_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurcyConvRateType_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCCreatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCreatedBy_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = ProjectLocationC.class)
    public JAXBElement<Integer> createProjectLocationCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerPillar_QNAME, Integer.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, ProjectLocationC.class, value);
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
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerSor_QNAME, Integer.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCLastUpdatedBy_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = ProjectLocationC.class)
    public JAXBElement<BigDecimal> createProjectLocationCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCOpportunityVOIdC_QNAME, BigDecimal.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = ProjectLocationC.class)
    public JAXBElement<BigDecimal> createProjectLocationCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCObjectVersionNumber_QNAME, BigDecimal.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = ProjectLocationC.class)
    public JAXBElement<String> createProjectLocationCCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurrencyCode_QNAME, String.class, ProjectLocationC.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCCreationDate_QNAME, XMLGregorianCalendar.class, ProjectLocationC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCCpdrfLastUpd_QNAME, String.class, ProjectLocationC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Contracts_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityContractsCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityContractsCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "GrossForecasts_c", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityGrossForecastsC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityGrossForecastsC_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConsumerLastName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityConsumerLastName(String value) {
        return new JAXBElement<String>(_OpportunityConsumerLastName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "NAICSCodes_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityNAICSCodesC(String value) {
        return new JAXBElement<String>(_OpportunityNAICSCodesC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectManager_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityProjectManagerC(String value) {
        return new JAXBElement<String>(_OpportunityProjectManagerC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalAwaitNTP_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityTotalAwaitNTPC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityTotalAwaitNTPC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesMethod", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySalesMethod(String value) {
        return new JAXBElement<String>(_OpportunitySalesMethod_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StatusCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityStatusCode(String value) {
        return new JAXBElement<String>(_OpportunityStatusCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SupportLevel_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySupportLevelC(String value) {
        return new JAXBElement<String>(_OpportunitySupportLevelC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "HDRPotentialCapacitygross_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityHDRPotentialCapacitygrossC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityHDRPotentialCapacitygrossC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevenueType", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityRevenueType(String value) {
        return new JAXBElement<String>(_OpportunityRevenueType_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BackEndLastUpdatedDate_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityBackEndLastUpdatedDateC(String value) {
        return new JAXBElement<String>(_OpportunityBackEndLastUpdatedDateC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SectorBusinessGroup_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySectorBusinessGroupCMeaning(String value) {
        return new JAXBElement<String>(_OpportunitySectorBusinessGroupCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectManagerforReporting_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityProjectManagerforReportingC(String value) {
        return new JAXBElement<String>(_OpportunityProjectManagerforReportingC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ARRAFunded_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityARRAFundedC(String value) {
        return new JAXBElement<String>(_OpportunityARRAFundedC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AccountNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityAccountNumber(String value) {
        return new JAXBElement<String>(_OpportunityAccountNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "HDRPotentialCapacitynet_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityHDRPotentialCapacitynetC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityHDRPotentialCapacitynetC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityResourceBusinessUnitCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityComments(String value) {
        return new JAXBElement<String>(_OpportunityReferenceComments_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "USDRateforReporting_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityUSDRateforReportingC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityUSDRateforReportingC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TargetPartyId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityTargetPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityTargetPartyId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FalloutReason_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityFalloutReasonC(String value) {
        return new JAXBElement<String>(_OpportunityFalloutReasonC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UpsideAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityUpsideAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SelectionProcess_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySelectionProcessCMeaning(String value) {
        return new JAXBElement<String>(_OpportunitySelectionProcessCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OfFirmsAwarded_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityOfFirmsAwardedC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityOfFirmsAwardedC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectConstructionCost_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityProjectConstructionCostCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityProjectConstructionCostCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Amount_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityAmountCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityAmountCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ARRAFunded_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityARRAFundedCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityARRAFundedCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityLegacySystemID_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOpportunityLegacySystemIDC(String value) {
        return new JAXBElement<String>(_OpportunityOpportunityLegacySystemIDC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityReferencePartyUniqueName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalAwaitNTPs_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityTotalAwaitNTPsCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityTotalAwaitNTPsCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "City_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityCityC(String value) {
        return new JAXBElement<String>(_OpportunityCityC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectConstructionCost_c", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityProjectConstructionCostC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityProjectConstructionCostC_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SubMarkets_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySubMarketsCMeaning(String value) {
        return new JAXBElement<String>(_OpportunitySubMarketsCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SectorType_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySectorTypeCMeaning(String value) {
        return new JAXBElement<String>(_OpportunitySectorTypeCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConfidenceS_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityConfidenceSC(String value) {
        return new JAXBElement<String>(_OpportunityConfidenceSC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StartDate_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityStartDateC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EBSOpportunityID_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityEBSOpportunityIDC(String value) {
        return new JAXBElement<String>(_OpportunityEBSOpportunityIDC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Registered", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityRegistered(String value) {
        return new JAXBElement<String>(_OpportunityRegistered_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "NAICSCode_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityNAICSCodeC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityNAICSCodeC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "State", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityState(String value) {
        return new JAXBElement<String>(_OpportunityState_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectLocation_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityProjectLocationC(String value) {
        return new JAXBElement<String>(_OpportunityProjectLocationC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PursuitProjectNumber_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityPursuitProjectNumberC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityPursuitProjectNumberC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryAccountForReporting_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryAccountForReportingC(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryAccountForReportingC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunitySalesAccountId(Long value) {
        return new JAXBElement<Long>(_OpportunityReferenceSalesAccountId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PotentialFee_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityPotentialFeeCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityPotentialFeeCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "GrossForecasts_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityGrossForecastsCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityGrossForecastsCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Description", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDescription(String value) {
        return new JAXBElement<String>(_OpportunityDescription_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContractType_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityContractTypeCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityContractTypeCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryCompanyAddress_c", scope = Opportunity.class)
    public JAXBElement<byte[]> createOpportunityPrimaryCompanyAddressC(byte[] value) {
        return new JAXBElement<byte[]>(_OpportunityPrimaryCompanyAddressC_QNAME, byte[].class, Opportunity.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactLastName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactLastName(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactLastName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EBSPursuitProjectId_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityEBSPursuitProjectIdC(String value) {
        return new JAXBElement<String>(_OpportunityEBSPursuitProjectIdC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RFQDate_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityRFQDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityRFQDateC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalAwaitNTPs_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityTotalAwaitNTPsCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityTotalAwaitNTPsCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RegistrationStatus", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityRegistrationStatus(String value) {
        return new JAXBElement<String>(_OpportunityRegistrationStatus_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountUniqueName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySalesAccountUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityReferenceSalesAccountUniqueName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Timing_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityTimingCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityTimingCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "NetForecasts_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityNetForecastsCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityNetForecastsCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContractName_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityContractNameC(String value) {
        return new JAXBElement<String>(_OpportunityContractNameC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Contract_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityContractC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityContractC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectCountry_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityProjectCountryCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityProjectCountryCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Bookeds_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityBookedsCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityBookedsCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Competitor_Id_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityCompetitorIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCompetitorIdC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Amount_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityAmountCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityAmountCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryRevenueId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrimaryRevenueId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrimaryRevenueId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Notes_c", scope = Opportunity.class)
    public JAXBElement<byte[]> createOpportunityNotesC(byte[] value) {
        return new JAXBElement<byte[]>(_OpportunityNotesC_QNAME, byte[].class, Opportunity.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactEmailAddress", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactEmailAddress_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BdgtAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityBdgtAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityBdgtAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MarketingChargeNumber_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityMarketingChargeNumberC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityMarketingChargeNumberC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactFirstName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactFirstName(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactFirstName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyCreationDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityOptyCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityOptyCreationDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinProb", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityReferenceWinProb_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StrategicLevelCodeSetId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityStrategicLevelCodeSetId(Long value) {
        return new JAXBElement<Long>(_OpportunityStrategicLevelCodeSetId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Company_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityCompanyC(String value) {
        return new JAXBElement<String>(_OpportunityCompanyC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BackEndStatusCheck_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityBackEndStatusCheckC(String value) {
        return new JAXBElement<String>(_OpportunityBackEndStatusCheckC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CustomerAccountId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_OpportunityCustomerAccountId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SupportType_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySupportTypeC(String value) {
        return new JAXBElement<String>(_OpportunitySupportTypeC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MarketSectors_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityMarketSectorsCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityMarketSectorsCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "City_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityCityCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityCityCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedAddress", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityFormattedAddress(String value) {
        return new JAXBElement<String>(_OpportunityFormattedAddress_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalContractCapacitys_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityTotalContractCapacitysCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityTotalContractCapacitysCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CrmConversionRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityCrmConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCrmConversionRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AverageDaysAtStage", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityAverageDaysAtStage(Long value) {
        return new JAXBElement<Long>(_OpportunityAverageDaysAtStage_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrConRelationshipId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrConRelationshipId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrConRelationshipId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "NetForecasts_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityNetForecastsCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityNetForecastsCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DeliveryModel_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDeliveryModelCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityDeliveryModelCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RiskLevelCodeSetId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityRiskLevelCodeSetId(Long value) {
        return new JAXBElement<Long>(_OpportunityRiskLevelCodeSetId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EBSProjectID_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityEBSProjectIDC(String value) {
        return new JAXBElement<String>(_OpportunityEBSProjectIDC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalAwaitNTPs_c", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityTotalAwaitNTPsC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityTotalAwaitNTPsC_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalFeeChanges_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityTotalFeeChangesCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityTotalFeeChangesCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LookupCategory", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLookupCategory(String value) {
        return new JAXBElement<String>(_OpportunityLookupCategory_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConfidenceS_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityConfidenceSCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityConfidenceSCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConsumerFirstName", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityConsumerFirstName(String value) {
        return new JAXBElement<String>(_OpportunityConsumerFirstName_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StatusCodeSetId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityStatusCodeSetId(Long value) {
        return new JAXBElement<Long>(_OpportunityStatusCodeSetId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "NetForecast_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityNetForecastC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityNetForecastC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyLastUpdateDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityOptyLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityOptyLastUpdateDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrSrcNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrSrcNumber(String value) {
        return new JAXBElement<String>(_OpportunityPrSrcNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "GrossForecasts_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityGrossForecastsCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityGrossForecastsCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessClass_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityBusinessClassCMeaning(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCBusinessClassCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DecisionLevelCodeSetId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityDecisionLevelCodeSetId(Long value) {
        return new JAXBElement<Long>(_OpportunityDecisionLevelCodeSetId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesMethodId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunitySalesMethodId(Long value) {
        return new JAXBElement<Long>(_OpportunitySalesMethodId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrentFyPotentialRevenue", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityCurrentFyPotentialRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCurrentFyPotentialRevenue_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SectorBusinessGroups_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySectorBusinessGroupsCMeaning(String value) {
        return new JAXBElement<String>(_OpportunitySectorBusinessGroupsCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectManagerEffectiveStart_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityProjectManagerEffectiveStartC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityProjectManagerEffectiveStartC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealHorizonCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDealHorizonCode(String value) {
        return new JAXBElement<String>(_OpportunityDealHorizonCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinProbability_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityWinProbabilityCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityWinProbabilityCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesChannelCd", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySalesChannelCd(String value) {
        return new JAXBElement<String>(_OpportunitySalesChannelCd_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LookupValuesId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityLookupValuesId(Long value) {
        return new JAXBElement<Long>(_OpportunityLookupValuesId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SubMarkets_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySubMarketsC(String value) {
        return new JAXBElement<String>(_OpportunitySubMarketsC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PotentialFee_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPotentialFeeCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityPotentialFeeCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalFeeChanges_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityTotalFeeChangesCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityTotalFeeChangesCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UpdateFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityUpdateFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityUpdateFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StageStatusCd", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityStageStatusCd(String value) {
        return new JAXBElement<String>(_OpportunityStageStatusCd_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DownsideAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityDownsideAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyCreatedBy", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOptyCreatedBy(String value) {
        return new JAXBElement<String>(_OpportunityOptyCreatedBy_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MasterContract_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityMasterContractC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityMasterContractC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ForecastDate_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityForecastDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityForecastDateC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DUNSNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDUNSNumber(String value) {
        return new JAXBElement<String>(_OpportunityDUNSNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SupportLevels_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySupportLevelsCMeaning(String value) {
        return new JAXBElement<String>(_OpportunitySupportLevelsCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PursuitBdgtNo_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityPursuitBdgtNoC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityPursuitBdgtNoC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DescriptionText", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDescriptionText(String value) {
        return new JAXBElement<String>(_OpportunityDescriptionText_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalContractCapacity_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityTotalContractCapacityC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityTotalContractCapacityC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectManagers_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityProjectManagersC(String value) {
        return new JAXBElement<String>(_OpportunityProjectManagersC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CrmRevenue", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityCrmRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityCrmRevenue_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Bookeds_c", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityBookedsC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityBookedsC_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RFPDueDate_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityRFPDueDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityRFPDueDateC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Contracts_c", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityContractsC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityContractsC_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "GrossForecast_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityGrossForecastC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityGrossForecastC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BackendOptyCreationCount_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityBackendOptyCreationCountC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityBackendOptyCreationCountC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesStageId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunitySalesStageId(Long value) {
        return new JAXBElement<Long>(_OpportunitySalesStageId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalFeeChange_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityTotalFeeChangeC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityTotalFeeChangeC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AreaOfReach_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityAreaOfReachC(String value) {
        return new JAXBElement<String>(_OpportunityAreaOfReachC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Contracts_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityContractsCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityContractsCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AwardTypes_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityAwardTypesCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityAwardTypesCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryClient_Id_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityPrimaryClientIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityPrimaryClientIdC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryCompanyId_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityPrimaryCompanyIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityPrimaryCompanyIdC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BudgetedFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityBudgetedFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityBudgetedFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RiskCommitteeSignOffDate_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityRiskCommitteeSignOffDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityRiskCommitteeSignOffDateC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectManagerEffectiveStartDa_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityProjectManagerEffectiveStartDaC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityProjectManagerEffectiveStartDaC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EndDate_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityEndDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityEndDateC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SectorType_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySectorTypeC(String value) {
        return new JAXBElement<String>(_OpportunitySectorTypeC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Latitude_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLatitudeC(String value) {
        return new JAXBElement<String>(_ProjectLocationCLatitudeC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConstructionCosts_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityConstructionCostsCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityConstructionCostsCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StrategicLevelCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityStrategicLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityStrategicLevelCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RFPReleaseDate_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityRFPReleaseDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityRFPReleaseDateC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Competitor_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityCompetitorC(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "NetForecasts_c", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityNetForecastsC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityNetForecastsC_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Amount_c", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityAmountC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityAmountC_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BillableCompanyAddress_c", scope = Opportunity.class)
    public JAXBElement<byte[]> createOpportunityBillableCompanyAddressC(byte[] value) {
        return new JAXBElement<byte[]>(_OpportunityBillableCompanyAddressC_QNAME, byte[].class, Opportunity.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContractName_Id_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityContractNameIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityContractNameIdC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ActualCloseDate_c", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityActualCloseDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityActualCloseDateC_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BackendEmailFromProjectManager_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityBackendEmailFromProjectManagerC(String value) {
        return new JAXBElement<String>(_OpportunityBackendEmailFromProjectManagerC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SectorBusinessGroups_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySectorBusinessGroupsC(String value) {
        return new JAXBElement<String>(_OpportunitySectorBusinessGroupsC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectManager_Id_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityProjectManagerIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityProjectManagerIdC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MasterOpportunity_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityMasterOpportunityC(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCMasterOpportunityC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryAccountID_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryAccountIDC(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryAccountIDC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "KeyContactId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityKeyContactId(Long value) {
        return new JAXBElement<Long>(_OpportunityKeyContactId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ReasonWonLostCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityReasonWonLostCode(String value) {
        return new JAXBElement<String>(_OpportunityReasonWonLostCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConstructionCosts_c", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityConstructionCostsC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityConstructionCostsC_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityId_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOpportunityIdC(String value) {
        return new JAXBElement<String>(_OpportunityOpportunityIdC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PostalCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPostalCode(String value) {
        return new JAXBElement<String>(_OpportunityPostalCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FalloutReason_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityFalloutReasonCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityFalloutReasonCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RcmndWinProb", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityRcmndWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityRcmndWinProb_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SolicitationNumber_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunitySolicitationNumberC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunitySolicitationNumberC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EBSProjectID_Id_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityEBSProjectIDIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityEBSProjectIDIdC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PotentialFee_c", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityPotentialFeeC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityPotentialFeeC_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MarketSector_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityMarketSectorCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityMarketSectorCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "NAICSDescription_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityNAICSDescriptionC(String value) {
        return new JAXBElement<String>(_OpportunityNAICSDescriptionC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Timing_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityTimingC(String value) {
        return new JAXBElement<String>(_OpportunityTimingC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MaximumDaysInStage", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityMaximumDaysInStage(Long value) {
        return new JAXBElement<Long>(_OpportunityMaximumDaysInStage_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BudgetAvailableDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityBudgetAvailableDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityBudgetAvailableDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SupportRole_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySupportRoleC(String value) {
        return new JAXBElement<String>(_OpportunitySupportRoleC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OperatingUnit_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOperatingUnitC(String value) {
        return new JAXBElement<String>(_OpportunityOperatingUnitC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SectorBusinessGroup_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySectorBusinessGroupC(String value) {
        return new JAXBElement<String>(_OpportunitySectorBusinessGroupC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PhonePreferenceExistsFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityPhonePreferenceExistsFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityPhonePreferenceExistsFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevnLineSetEnabledFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityRevnLineSetEnabledFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityRevnLineSetEnabledFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RegistrationType", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityRegistrationType(String value) {
        return new JAXBElement<String>(_OpportunityRegistrationType_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConstructionCosts_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityConstructionCostsCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityConstructionCostsCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "HDRRole_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityHDRRoleCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityHDRRoleCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DecisionLevelCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDecisionLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityDecisionLevelCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryClient_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryClientC(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryClientC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ConstructionCost_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityConstructionCostC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityConstructionCostC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryCompetitorId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrimaryCompetitorId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrimaryCompetitorId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DeleteFlag", scope = Opportunity.class)
    public JAXBElement<Boolean> createOpportunityDeleteFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityDeleteFlag_QNAME, Boolean.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PreferredFunctionalCurrency", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPreferredFunctionalCurrency(String value) {
        return new JAXBElement<String>(_OpportunityPreferredFunctionalCurrency_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EffectiveDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityReferenceEffectiveDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "HDRPotentialCapacityGrosss_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityHDRPotentialCapacityGrosssCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityHDRPotentialCapacityGrosssCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName1", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPartyUniqueName1(String value) {
        return new JAXBElement<String>(_OpportunityReferencePartyUniqueName1_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DebriefComments_c", scope = Opportunity.class)
    public JAXBElement<byte[]> createOpportunityDebriefCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_OpportunityDebriefCommentsC_QNAME, byte[].class, Opportunity.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Longitude_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLongitudeC(String value) {
        return new JAXBElement<String>(_ProjectLocationCLongitudeC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Revenue", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityRevenue(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityRevenue_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectManagers_Id_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityProjectManagersIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityProjectManagersIdC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RFPOwner_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityRFPOwnerC(String value) {
        return new JAXBElement<String>(_OpportunityRFPOwnerC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RiskLevelCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityRiskLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityRiskLevelCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BillableCompanyId_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityBillableCompanyIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityBillableCompanyIdC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "HDRPotentialCapacityNets_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityHDRPotentialCapacityNetsCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityHDRPotentialCapacityNetsCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BillableAccountID_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityBillableAccountIDC(String value) {
        return new JAXBElement<String>(_OpportunityBillableAccountIDC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MarketSector_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityMarketSectorC(String value) {
        return new JAXBElement<String>(_OpportunityMarketSectorC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Bookeds_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityBookedsCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityBookedsCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalContractCapacitys_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityTotalContractCapacitysCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityTotalContractCapacitysCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastAssignedDate", scope = Opportunity.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityLastAssignedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityLastAssignedDate_QNAME, XMLGregorianCalendar.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ReasonWonLostCodeSetId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityReasonWonLostCodeSetId(Long value) {
        return new JAXBElement<Long>(_OpportunityReasonWonLostCodeSetId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Descriptions_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDescriptionsC(String value) {
        return new JAXBElement<String>(_OpportunityDescriptionsC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Confidence_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityConfidenceC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityConfidenceC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "County_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityCountyC(String value) {
        return new JAXBElement<String>(_OpportunityCountyC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryContactFormattedPhoneNumber", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityPrimaryContactFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityPrimaryContactFormattedPhoneNumber_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmployeesTotal", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityEmployeesTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityEmployeesTotal_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TotalFeeChanges_c", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityTotalFeeChangesC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityTotalFeeChangesC_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinLossReason_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityWinLossReasonC(String value) {
        return new JAXBElement<String>(_OpportunityWinLossReasonC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SectorTypes_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunitySectorTypesC(String value) {
        return new JAXBElement<String>(_OpportunitySectorTypesC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BackendActivityName_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityBackendActivityNameC(String value) {
        return new JAXBElement<String>(_OpportunityBackendActivityNameC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AwardTypes_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityAwardTypesC(String value) {
        return new JAXBElement<String>(_OpportunityAwardTypesC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StateProvince_cMeaning", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityStateProvinceCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityStateProvinceCMeaning_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContractNumbers_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityContractNumbersC(String value) {
        return new JAXBElement<String>(_OpportunityContractNumbersC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealHorizonCodeSetId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityDealHorizonCodeSetId(Long value) {
        return new JAXBElement<Long>(_OpportunityDealHorizonCodeSetId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryPartnerId", scope = Opportunity.class)
    public JAXBElement<Long> createOpportunityPrimaryPartnerId(Long value) {
        return new JAXBElement<Long>(_OpportunityPrimaryPartnerId_QNAME, Long.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MasterOpportunity_Id_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityMasterOpportunityIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCMasterOpportunityIdC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectConstructionCost_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityProjectConstructionCostCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityProjectConstructionCostCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Booked_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityBookedC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityBookedC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ProjectName_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityProjectNameC(String value) {
        return new JAXBElement<String>(_OpportunityProjectNameC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContractNumber_c", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityContractNumberC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCContractNumberC_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Involvement_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityInvolvementC(String value) {
        return new JAXBElement<String>(_OpportunityInvolvementC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LineOfBusinessCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLineOfBusinessCode(String value) {
        return new JAXBElement<String>(_OpportunityLineOfBusinessCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OptyLastUpdatedBy", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityOptyLastUpdatedBy(String value) {
        return new JAXBElement<String>(_OpportunityOptyLastUpdatedBy_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "HDRPotentialCapacityGrosss_cCurrencyCode", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityHDRPotentialCapacityGrosssCCurrencyCode(String value) {
        return new JAXBElement<String>(_OpportunityHDRPotentialCapacityGrosssCCurrencyCode_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ExpectAmount", scope = Opportunity.class)
    public JAXBElement<AmountType> createOpportunityExpectAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityExpectAmount_QNAME, AmountType.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "HDRPotentialCapacityNets_cCurcyConvRate", scope = Opportunity.class)
    public JAXBElement<BigDecimal> createOpportunityHDRPotentialCapacityNetsCCurcyConvRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityHDRPotentialCapacityNetsCCurcyConvRate_QNAME, BigDecimal.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DeliveryModel_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityDeliveryModelC(String value) {
        return new JAXBElement<String>(_OpportunityDeliveryModelC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "City", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityCity(String value) {
        return new JAXBElement<String>(_OpportunityCity_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "MarketingChargeNumbers_c", scope = Opportunity.class)
    public JAXBElement<String> createOpportunityMarketingChargeNumbersC(String value) {
        return new JAXBElement<String>(_OpportunityMarketingChargeNumbersC_QNAME, String.class, Opportunity.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", name = "_FLEX_NumOfSegments", scope = NoteDFF.class)
    public JAXBElement<Integer> createNoteDFFFLEXNumOfSegments(Integer value) {
        return new JAXBElement<Integer>(_NoteDFFFLEXNumOfSegments_QNAME, Integer.class, NoteDFF.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/flex/noteDff/", name = "__FLEX_Context", scope = NoteDFF.class)
    public JAXBElement<String> createNoteDFFFLEXContext(String value) {
        return new JAXBElement<String>(_NoteDFFFLEXContext_QNAME, String.class, NoteDFF.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCIsOwner(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCIsOwner_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCJobDefinitionName(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionName_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Confidence_c", scope = OpportunityForecastC.class)
    public JAXBElement<BigDecimal> createOpportunityForecastCConfidenceC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityConfidenceC_QNAME, BigDecimal.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ForecastDate_c", scope = OpportunityForecastC.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityForecastCForecastDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityForecastDateC_QNAME, XMLGregorianCalendar.class, OpportunityForecastC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCCurcyConvRateType_QNAME, String.class, OpportunityForecastC.class, value);
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
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerSor_QNAME, Integer.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "NetForecast_c", scope = OpportunityForecastC.class)
    public JAXBElement<AmountType> createOpportunityForecastCNetForecastC(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityNetForecastC_QNAME, AmountType.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = OpportunityForecastC.class)
    public JAXBElement<BigDecimal> createOpportunityForecastCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCOpportunityVOIdC_QNAME, BigDecimal.class, OpportunityForecastC.class, value);
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
        return new JAXBElement<AmountType>(_OpportunityGrossForecastC_QNAME, AmountType.class, OpportunityForecastC.class, value);
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
        return new JAXBElement<Long>(_RelatedOpportunitiesCRequestId_QNAME, Long.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityForecastC.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityForecastCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments_c", scope = OpportunityForecastC.class)
    public JAXBElement<byte[]> createOpportunityForecastCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_PursuitMilestonesCCommentsC_QNAME, byte[].class, OpportunityForecastC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionPackage_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCorpCurrencyCode_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = OpportunityForecastC.class)
    public JAXBElement<Integer> createOpportunityForecastCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerPillar_QNAME, Integer.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCCreatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCreatedBy_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_cMeaning", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityResourceBusinessUnitCMeaning_QNAME, String.class, OpportunityForecastC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCLastUpdatedBy_QNAME, String.class, OpportunityForecastC.class, value);
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
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCObjectVersionNumber_QNAME, BigDecimal.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurrencyCode_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = OpportunityForecastC.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityForecastCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCCreationDate_QNAME, XMLGregorianCalendar.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = OpportunityForecastC.class)
    public JAXBElement<String> createOpportunityForecastCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCpdrfLastUpd_QNAME, String.class, OpportunityForecastC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ForecastParticipationCode", scope = RevenueTerritory.class)
    public JAXBElement<String> createRevenueTerritoryForecastParticipationCode(String value) {
        return new JAXBElement<String>(_RevenueTerritoryForecastParticipationCode_QNAME, String.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AssignmentType", scope = RevenueTerritory.class)
    public JAXBElement<String> createRevenueTerritoryAssignmentType(String value) {
        return new JAXBElement<String>(_SplitRevenueAssignmentType_QNAME, String.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = RevenueTerritory.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueTerritoryUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCode", scope = RevenueTerritory.class)
    public JAXBElement<String> createRevenueTerritoryTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueTypeCode_QNAME, String.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = RevenueTerritory.class)
    public JAXBElement<String> createRevenueTerritoryLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SplitRevenueLastUpdateLogin_QNAME, String.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TerritoryVersionId", scope = RevenueTerritory.class)
    public JAXBElement<Long> createRevenueTerritoryTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_RevenueTerritoryTerritoryVersionId_QNAME, Long.class, RevenueTerritory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DealType", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerDealType(String value) {
        return new JAXBElement<String>(_RevenuePartnerDealType_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RegistrationStatus", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerRegistrationStatus(String value) {
        return new JAXBElement<String>(_RevenuePartnerRegistrationStatus_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PartTypeCd", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerPartTypeCd(String value) {
        return new JAXBElement<String>(_RevenuePartnerPartTypeCd_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DealExpirationDate", scope = RevenuePartner.class)
    public JAXBElement<XMLGregorianCalendar> createRevenuePartnerDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenuePartnerDealExpirationDate_QNAME, XMLGregorianCalendar.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PartOrgEmailAddress", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerPartOrgEmailAddress(String value) {
        return new JAXBElement<String>(_RevenuePartnerPartOrgEmailAddress_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PreferredContactPhone", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerPreferredContactPhone(String value) {
        return new JAXBElement<String>(_RevenuePartnerPreferredContactPhone_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrPartResourcePartyId", scope = RevenuePartner.class)
    public JAXBElement<Long> createRevenuePartnerPrPartResourcePartyId(Long value) {
        return new JAXBElement<Long>(_RevenuePartnerPrPartResourcePartyId_QNAME, Long.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PreferredContactName", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerPreferredContactName(String value) {
        return new JAXBElement<String>(_RevenuePartnerPreferredContactName_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnPartnerNumber", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerRevnPartnerNumber(String value) {
        return new JAXBElement<String>(_RevenuePartnerRevnPartnerNumber_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PartOrgFormattedPhoneNumber", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerPartOrgFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_RevenuePartnerPartOrgFormattedPhoneNumber_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DealEstCloseDate", scope = RevenuePartner.class)
    public JAXBElement<XMLGregorianCalendar> createRevenuePartnerDealEstCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenuePartnerDealEstCloseDate_QNAME, XMLGregorianCalendar.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PartProgramId", scope = RevenuePartner.class)
    public JAXBElement<Long> createRevenuePartnerPartProgramId(Long value) {
        return new JAXBElement<Long>(_RevenuePartnerPartProgramId_QNAME, Long.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdatedBy", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerLastUpdatedBy(String value) {
        return new JAXBElement<String>(_RevenuePartnerLastUpdatedBy_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RegistrationNumber", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerRegistrationNumber(String value) {
        return new JAXBElement<String>(_RevenuePartnerRegistrationNumber_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SplitRevenueLastUpdateLogin_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PreferredContactEmail", scope = RevenuePartner.class)
    public JAXBElement<String> createRevenuePartnerPreferredContactEmail(String value) {
        return new JAXBElement<String>(_RevenuePartnerPreferredContactEmail_QNAME, String.class, RevenuePartner.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityDeal.class)
    public JAXBElement<String> createOpportunityDealLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "StatusCode", scope = OpportunityDeal.class)
    public JAXBElement<String> createOpportunityDealStatusCode(String value) {
        return new JAXBElement<String>(_OpportunityStatusCode_QNAME, String.class, OpportunityDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityDeal.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityDealUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealName", scope = OpportunityDeal.class)
    public JAXBElement<String> createOpportunityDealDealName(String value) {
        return new JAXBElement<String>(_OpportunityDealDealName_QNAME, String.class, OpportunityDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DealExpirationDate", scope = OpportunityDeal.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityDealDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceDealExpirationDate_QNAME, XMLGregorianCalendar.class, OpportunityDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ApprovedDate", scope = OpportunityDeal.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityDealApprovedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityDealApprovedDate_QNAME, XMLGregorianCalendar.class, OpportunityDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartnerId", scope = OpportunityDeal.class)
    public JAXBElement<Long> createOpportunityDealPartnerId(Long value) {
        return new JAXBElement<Long>(_OpportunityDealPartnerId_QNAME, Long.class, OpportunityDeal.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunitySource.class)
    public JAXBElement<String> createOpportunitySourceLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunitySource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunitySource.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunitySourceUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunitySource.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = PartnersJointBidsC.class)
    public JAXBElement<Long> createPartnersJointBidsCRequestId(Long value) {
        return new JAXBElement<Long>(_RelatedOpportunitiesCRequestId_QNAME, Long.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCIsOwner(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCIsOwner_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = PartnersJointBidsC.class)
    public JAXBElement<XMLGregorianCalendar> createPartnersJointBidsCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCLastUpdateDate_QNAME, XMLGregorianCalendar.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCJobDefinitionName(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionName_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = PartnersJointBidsC.class)
    public JAXBElement<XMLGregorianCalendar> createPartnersJointBidsCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionPackage_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCorpCurrencyCode_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurcyConvRateType_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCCreatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCreatedBy_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = PartnersJointBidsC.class)
    public JAXBElement<Integer> createPartnersJointBidsCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerPillar_QNAME, Integer.class, PartnersJointBidsC.class, value);
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
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = PartnersJointBidsC.class)
    public JAXBElement<Integer> createPartnersJointBidsCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerSor_QNAME, Integer.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Type_cMeaning", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCTypeCMeaning(String value) {
        return new JAXBElement<String>(_PursuitMilestonesCTypeCMeaning_QNAME, String.class, PartnersJointBidsC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCLastUpdatedBy_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = PartnersJointBidsC.class)
    public JAXBElement<BigDecimal> createPartnersJointBidsCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCOpportunityVOIdC_QNAME, BigDecimal.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = PartnersJointBidsC.class)
    public JAXBElement<BigDecimal> createPartnersJointBidsCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCObjectVersionNumber_QNAME, BigDecimal.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurrencyCode_QNAME, String.class, PartnersJointBidsC.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCCreationDate_QNAME, XMLGregorianCalendar.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DoNotUse_c", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCDoNotUseC(String value) {
        return new JAXBElement<String>(_PursuitMilestonesCDoNotUseC_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = PartnersJointBidsC.class)
    public JAXBElement<String> createPartnersJointBidsCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCpdrfLastUpd_QNAME, String.class, PartnersJointBidsC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = EmployeessC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeessCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCLastUpdateDate_QNAME, XMLGregorianCalendar.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCIsOwner(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCIsOwner_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCJobDefinitionName(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionName_QNAME, String.class, EmployeessC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCCurcyConvRateType_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = EmployeessC.class)
    public JAXBElement<Integer> createEmployeessCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerSor_QNAME, Integer.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Title_c", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCTitleC(String value) {
        return new JAXBElement<String>(_OpportunityResourceTitleC_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = EmployeessC.class)
    public JAXBElement<BigDecimal> createEmployeessCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCOpportunityVOIdC_QNAME, BigDecimal.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Department_c", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCDepartmentC(String value) {
        return new JAXBElement<String>(_OpportunityResourceDepartmentC_QNAME, String.class, EmployeessC.class, value);
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
        return new JAXBElement<Long>(_RelatedOpportunitiesCRequestId_QNAME, Long.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = EmployeessC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeessCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionPackage_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCorpCurrencyCode_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = EmployeessC.class)
    public JAXBElement<Integer> createEmployeessCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerPillar_QNAME, Integer.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCCreatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCreatedBy_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_c", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCBusinessUnitC(String value) {
        return new JAXBElement<String>(_OpportunityResourceBusinessUnitC_QNAME, String.class, EmployeessC.class, value);
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
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Department_cMeaning", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCDepartmentCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityResourceDepartmentCMeaning_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "BusinessUnit_cMeaning", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCBusinessUnitCMeaning(String value) {
        return new JAXBElement<String>(_OpportunityResourceBusinessUnitCMeaning_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCLastUpdatedBy_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = EmployeessC.class)
    public JAXBElement<BigDecimal> createEmployeessCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCObjectVersionNumber_QNAME, BigDecimal.class, EmployeessC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCCurrencyCode_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = EmployeessC.class)
    public JAXBElement<XMLGregorianCalendar> createEmployeessCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCCreationDate_QNAME, XMLGregorianCalendar.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = EmployeessC.class)
    public JAXBElement<String> createEmployeessCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCpdrfLastUpd_QNAME, String.class, EmployeessC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RequestId", scope = CompetitorC.class)
    public JAXBElement<Long> createCompetitorCRequestId(Long value) {
        return new JAXBElement<Long>(_RelatedOpportunitiesCRequestId_QNAME, Long.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCIsOwner(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCIsOwner_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = CompetitorC.class)
    public JAXBElement<XMLGregorianCalendar> createCompetitorCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCLastUpdateDate_QNAME, XMLGregorianCalendar.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionName", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCJobDefinitionName(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionName_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = CompetitorC.class)
    public JAXBElement<XMLGregorianCalendar> createCompetitorCUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments_c", scope = CompetitorC.class)
    public JAXBElement<byte[]> createCompetitorCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_PursuitMilestonesCCommentsC_QNAME, byte[].class, CompetitorC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionPackage_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCorpCurrencyCode_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurcyConvRateType_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCCreatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCreatedBy_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = CompetitorC.class)
    public JAXBElement<Integer> createCompetitorCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerPillar_QNAME, Integer.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = CompetitorC.class)
    public JAXBElement<Integer> createCompetitorCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerSor_QNAME, Integer.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCLastUpdatedBy_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = CompetitorC.class)
    public JAXBElement<BigDecimal> createCompetitorCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCOpportunityVOIdC_QNAME, BigDecimal.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = CompetitorC.class)
    public JAXBElement<BigDecimal> createCompetitorCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCObjectVersionNumber_QNAME, BigDecimal.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurrencyCode_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = CompetitorC.class)
    public JAXBElement<XMLGregorianCalendar> createCompetitorCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCCreationDate_QNAME, XMLGregorianCalendar.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = CompetitorC.class)
    public JAXBElement<String> createCompetitorCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCpdrfLastUpd_QNAME, String.class, CompetitorC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateDate", scope = ApproversC.class)
    public JAXBElement<XMLGregorianCalendar> createApproversCLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCLastUpdateDate_QNAME, XMLGregorianCalendar.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "IsOwner", scope = ApproversC.class)
    public JAXBElement<String> createApproversCIsOwner(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCIsOwner_QNAME, String.class, ApproversC.class, value);
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
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionName_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurcyConvRateType", scope = ApproversC.class)
    public JAXBElement<String> createApproversCCurcyConvRateType(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurcyConvRateType_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerSor", scope = ApproversC.class)
    public JAXBElement<Integer> createApproversCCpdrfVerSor(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerSor_QNAME, Integer.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Title_c", scope = ApproversC.class)
    public JAXBElement<String> createApproversCTitleC(String value) {
        return new JAXBElement<String>(_OpportunityResourceTitleC_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "OpportunityVO_Id_c", scope = ApproversC.class)
    public JAXBElement<BigDecimal> createApproversCOpportunityVOIdC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCOpportunityVOIdC_QNAME, BigDecimal.class, ApproversC.class, value);
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
        return new JAXBElement<Long>(_RelatedOpportunitiesCRequestId_QNAME, Long.class, ApproversC.class, value);
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
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobDefinitionPackage", scope = ApproversC.class)
    public JAXBElement<String> createApproversCJobDefinitionPackage(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCJobDefinitionPackage_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments_c", scope = ApproversC.class)
    public JAXBElement<byte[]> createApproversCCommentsC(byte[] value) {
        return new JAXBElement<byte[]>(_PursuitMilestonesCCommentsC_QNAME, byte[].class, ApproversC.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CorpCurrencyCode", scope = ApproversC.class)
    public JAXBElement<String> createApproversCCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCorpCurrencyCode_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfVerPillar", scope = ApproversC.class)
    public JAXBElement<Integer> createApproversCCpdrfVerPillar(Integer value) {
        return new JAXBElement<Integer>(_RelatedOpportunitiesCCpdrfVerPillar_QNAME, Integer.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreatedBy", scope = ApproversC.class)
    public JAXBElement<String> createApproversCCreatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCreatedBy_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = ApproversC.class)
    public JAXBElement<String> createApproversCLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdatedBy", scope = ApproversC.class)
    public JAXBElement<String> createApproversCLastUpdatedBy(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCLastUpdatedBy_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ObjectVersionNumber", scope = ApproversC.class)
    public JAXBElement<BigDecimal> createApproversCObjectVersionNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RelatedOpportunitiesCObjectVersionNumber_QNAME, BigDecimal.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CurrencyCode", scope = ApproversC.class)
    public JAXBElement<String> createApproversCCurrencyCode(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCurrencyCode_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CreationDate", scope = ApproversC.class)
    public JAXBElement<XMLGregorianCalendar> createApproversCCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RelatedOpportunitiesCCreationDate_QNAME, XMLGregorianCalendar.class, ApproversC.class, value);
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
        return new JAXBElement<String>(_PursuitMilestonesCDoNotUseC_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "CpdrfLastUpd", scope = ApproversC.class)
    public JAXBElement<String> createApproversCCpdrfLastUpd(String value) {
        return new JAXBElement<String>(_RelatedOpportunitiesCCpdrfLastUpd_QNAME, String.class, ApproversC.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AssigneeId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeAssigneeId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeAssigneeId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityAssigneeId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeActivityAssigneeId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeActivityAssigneeId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyName", scope = TransientAssignee.class)
    public JAXBElement<String> createTransientAssigneePartyName(String value) {
        return new JAXBElement<String>(_TransientContactPartyName_QNAME, String.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ShowTimeAsCd", scope = TransientAssignee.class)
    public JAXBElement<String> createTransientAssigneeShowTimeAsCd(String value) {
        return new JAXBElement<String>(_TransientAssigneeShowTimeAsCd_QNAME, String.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "OwnerFlag", scope = TransientAssignee.class)
    public JAXBElement<Boolean> createTransientAssigneeOwnerFlag(Boolean value) {
        return new JAXBElement<Boolean>(_TransientAssigneeOwnerFlag_QNAME, Boolean.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "PartyId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneePartyId(Long value) {
        return new JAXBElement<Long>(_TransientContactPartyId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeActivityId(Long value) {
        return new JAXBElement<Long>(_TransientContactActivityId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AppointmentResponseCd", scope = TransientAssignee.class, defaultValue = "NOT_RESPONDED")
    public JAXBElement<String> createTransientAssigneeAppointmentResponseCd(String value) {
        return new JAXBElement<String>(_TransientAssigneeAppointmentResponseCd_QNAME, String.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "AssigneeRsrcOrgId", scope = TransientAssignee.class)
    public JAXBElement<Long> createTransientAssigneeAssigneeRsrcOrgId(Long value) {
        return new JAXBElement<Long>(_TransientAssigneeAssigneeRsrcOrgId_QNAME, Long.class, TransientAssignee.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "UploadedFile", scope = CommonAttachments.class)
    public JAXBElement<byte[]> createCommonAttachmentsUploadedFile(byte[] value) {
        return new JAXBElement<byte[]>(_CommonAttachmentsUploadedFile_QNAME, byte[].class, CommonAttachments.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "DmVersionNumber", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsDmVersionNumber(String value) {
        return new JAXBElement<String>(_CommonAttachmentsDmVersionNumber_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "FileName", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsFileName(String value) {
        return new JAXBElement<String>(_CommonAttachmentsFileName_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "DocumentEntityId", scope = CommonAttachments.class)
    public JAXBElement<Long> createCommonAttachmentsDocumentEntityId(Long value) {
        return new JAXBElement<Long>(_CommonAttachmentsDocumentEntityId_QNAME, Long.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "TableName", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsTableName(String value) {
        return new JAXBElement<String>(_CommonAttachmentsTableName_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "DownloadStatus", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsDownloadStatus(String value) {
        return new JAXBElement<String>(_CommonAttachmentsDownloadStatus_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "AttachedDocumentId", scope = CommonAttachments.class)
    public JAXBElement<Long> createCommonAttachmentsAttachedDocumentId(Long value) {
        return new JAXBElement<Long>(_CommonAttachmentsAttachedDocumentId_QNAME, Long.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "CategoryName", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsCategoryName(String value) {
        return new JAXBElement<String>(_CommonAttachmentsCategoryName_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "UploadedFileName", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsUploadedFileName(String value) {
        return new JAXBElement<String>(_CommonAttachmentsUploadedFileName_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "Description", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsDescription(String value) {
        return new JAXBElement<String>(_CommonAttachmentsDescription_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "DmFolderPath", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsDmFolderPath(String value) {
        return new JAXBElement<String>(_CommonAttachmentsDmFolderPath_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "DmNode", scope = CommonAttachments.class)
    public JAXBElement<BigDecimal> createCommonAttachmentsDmNode(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CommonAttachmentsDmNode_QNAME, BigDecimal.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "DmRepository", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsDmRepository(String value) {
        return new JAXBElement<String>(_CommonAttachmentsDmRepository_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "Pk4Value", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsPk4Value(String value) {
        return new JAXBElement<String>(_CommonAttachmentsPk4Value_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "UsageType", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsUsageType(String value) {
        return new JAXBElement<String>(_CommonAttachmentsUsageType_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "Title", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsTitle(String value) {
        return new JAXBElement<String>(_CommonAttachmentsTitle_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "DocumentAttributes", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsDocumentAttributes(String value) {
        return new JAXBElement<String>(_CommonAttachmentsDocumentAttributes_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "Pk2Value", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsPk2Value(String value) {
        return new JAXBElement<String>(_CommonAttachmentsPk2Value_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "Pk5Value", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsPk5Value(String value) {
        return new JAXBElement<String>(_CommonAttachmentsPk5Value_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "UploadedFileContentType", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsUploadedFileContentType(String value) {
        return new JAXBElement<String>(_CommonAttachmentsUploadedFileContentType_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "EntityAttributes", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsEntityAttributes(String value) {
        return new JAXBElement<String>(_CommonAttachmentsEntityAttributes_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "DatatypeCode", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsDatatypeCode(String value) {
        return new JAXBElement<String>(_CommonAttachmentsDatatypeCode_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "DmType", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsDmType(String value) {
        return new JAXBElement<String>(_CommonAttachmentsDmType_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "URL", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsURL(String value) {
        return new JAXBElement<String>(_CommonAttachmentsURL_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "VersionControlIcon", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsVersionControlIcon(String value) {
        return new JAXBElement<String>(_CommonAttachmentsVersionControlIcon_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "FileURL", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsFileURL(String value) {
        return new JAXBElement<String>(_CommonAttachmentsFileURL_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "Attachment", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsAttachment(String value) {
        return new JAXBElement<String>(_CommonAttachmentsAttachment_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "Pk1Value", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsPk1Value(String value) {
        return new JAXBElement<String>(_CommonAttachmentsPk1Value_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "Pk3Value", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsPk3Value(String value) {
        return new JAXBElement<String>(_CommonAttachmentsPk3Value_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "EntityName", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsEntityName(String value) {
        return new JAXBElement<String>(_CommonAttachmentsEntityName_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "UploadedFileLength", scope = CommonAttachments.class)
    public JAXBElement<Long> createCommonAttachmentsUploadedFileLength(Long value) {
        return new JAXBElement<Long>(_CommonAttachmentsUploadedFileLength_QNAME, Long.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/objects/objectsService/", name = "UploadedText", scope = CommonAttachments.class)
    public JAXBElement<String> createCommonAttachmentsUploadedText(String value) {
        return new JAXBElement<String>(_CommonAttachmentsUploadedText_QNAME, String.class, CommonAttachments.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ItemNumber", scope = Revenue.class)
    public JAXBElement<String> createRevenueItemNumber(String value) {
        return new JAXBElement<String>(_RevenueItemNumber_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesAccountId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueSalesAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSalesAccountId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerLockAsgnFlag", scope = Revenue.class)
    public JAXBElement<Boolean> createRevenueOwnerLockAsgnFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenueOwnerLockAsgnFlag_QNAME, Boolean.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesChannelCd", scope = Revenue.class)
    public JAXBElement<String> createRevenueSalesChannelCd(String value) {
        return new JAXBElement<String>(_RevenueSalesChannelCd_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmCurcyCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueCrmCurcyCode(String value) {
        return new JAXBElement<String>(_RevenueCrmCurcyCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UOMCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueUOMCode(String value) {
        return new JAXBElement<String>(_SplitRevenueUOMCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurAdditionalAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRecurAdditionalAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueRecurAdditionalAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrPartOrgPartyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenuePrPartOrgPartyId(Long value) {
        return new JAXBElement<Long>(_RevenuePrPartOrgPartyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRate", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueConversionRate_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnCategoryCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRevnCategoryCode(String value) {
        return new JAXBElement<String>(_RevenueRevnCategoryCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AdditionalText2", scope = Revenue.class)
    public JAXBElement<String> createRevenueAdditionalText2(String value) {
        return new JAXBElement<String>(_RevenueAdditionalText2_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AdditionalText1", scope = Revenue.class)
    public JAXBElement<String> createRevenueAdditionalText1(String value) {
        return new JAXBElement<String>(_RevenueAdditionalText1_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ParentRevnId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueParentRevnId(Long value) {
        return new JAXBElement<Long>(_RevenueParentRevnId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnCreationDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueRevnCreationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueRevnCreationDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CommitFlag", scope = Revenue.class)
    public JAXBElement<Boolean> createRevenueCommitFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenueCommitFlag_QNAME, Boolean.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurFrequencyCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRecurFrequencyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurFrequencyCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurTypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRecurTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerDealProtectedDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueOwnerDealProtectedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueOwnerDealProtectedDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DownsideAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueDownsideAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueExpectAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueExpectAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Description", scope = Revenue.class)
    public JAXBElement<String> createRevenueDescription(String value) {
        return new JAXBElement<String>(_RevenueDescription_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ActualCloseDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueActualCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_RevenueActualCloseDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Quantity", scope = Revenue.class)
    public JAXBElement<MeasureType> createRevenueQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueQuantity_QNAME, MeasureType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ResourcePartyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueResourcePartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueResourcePartyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = Revenue.class)
    public JAXBElement<String> createRevenueLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SplitRevenueLastUpdateLogin_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueOwnerOrgTreeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueOwnerOrgTreeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRateType", scope = Revenue.class)
    public JAXBElement<String> createRevenueConversionRateType(String value) {
        return new JAXBElement<String>(_SplitRevenueConversionRateType_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectDlvryDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueExpectDlvryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueExpectDlvryDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerDealExpirationDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueOwnerDealExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueOwnerDealExpirationDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitTypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueSplitTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSplitTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmConversionRateType", scope = Revenue.class)
    public JAXBElement<String> createRevenueCrmConversionRateType(String value) {
        return new JAXBElement<String>(_RevenueCrmConversionRateType_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ProdGroupId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueProdGroupId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueProdGroupId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurAdditionalNumber", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueRecurAdditionalNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RevenueRecurAdditionalNumber_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "NqSplitAllocTypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueNqSplitAllocTypeCode(String value) {
        return new JAXBElement<String>(_RevenueNqSplitAllocTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AdditionalAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueAdditionalAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueAdditionalAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCodeSetId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueStatusCodeSetId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueStatusCodeSetId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurParentRevnId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueRecurParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueRecurParentRevnId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnLineTypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRevnLineTypeCode(String value) {
        return new JAXBElement<String>(_RevenueRevnLineTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PartEngagementTypeCd", scope = Revenue.class)
    public JAXBElement<String> createRevenuePartEngagementTypeCd(String value) {
        return new JAXBElement<String>(_RevenuePartEngagementTypeCd_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryOrgId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueInventoryOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryOrgId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitPercent", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueSplitPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueSplitPercent_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CloseReasonCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueCloseReasonCode(String value) {
        return new JAXBElement<String>(_SplitRevenueCloseReasonCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurQuantity", scope = Revenue.class)
    public JAXBElement<MeasureType> createRevenueRecurQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueRecurQuantity_QNAME, MeasureType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurExpectAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRecurExpectAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueRecurExpectAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "WinProb", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueWinProb_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ScheduleAction", scope = Revenue.class)
    public JAXBElement<String> createRevenueScheduleAction(String value) {
        return new JAXBElement<String>(_RevenueScheduleAction_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCodeSetId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueTypeCodeSetId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueTypeCodeSetId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrTerritoryUpdatedById", scope = Revenue.class)
    public JAXBElement<Long> createRevenuePrTerritoryUpdatedById(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrTerritoryUpdatedById_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PartyUniqueName1", scope = Revenue.class)
    public JAXBElement<String> createRevenuePartyUniqueName1(String value) {
        return new JAXBElement<String>(_RevenuePartyUniqueName1_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ViewCriteriaIdentifier", scope = Revenue.class)
    public JAXBElement<String> createRevenueViewCriteriaIdentifier(String value) {
        return new JAXBElement<String>(_RevenueViewCriteriaIdentifier_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ForecastOverrideCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueForecastOverrideCode(String value) {
        return new JAXBElement<String>(_SplitRevenueForecastOverrideCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerOrgTreeStructCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueOwnerOrgTreeStructCode(String value) {
        return new JAXBElement<String>(_SplitRevenueOwnerOrgTreeStructCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UpsideAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUpsideAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurUpsideAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRecurUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueRecurUpsideAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UnitPrice", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueUnitPrice(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUnitPrice_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurUnitPrice", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRecurUnitPrice(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueRecurUnitPrice_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CrmConversionRate", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueCrmConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RevenueCrmConversionRate_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TargetPartyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueTargetPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueTargetPartyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurDownsideAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRecurDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueRecurDownsideAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Comments", scope = Revenue.class)
    public JAXBElement<String> createRevenueComments(String value) {
        return new JAXBElement<String>(_SplitRevenueComments_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrCmptPartyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenuePrCmptPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrCmptPartyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryItemId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueInventoryItemId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryItemId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CustomerAccountId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCustomerAccountId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AdditionalNumber", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueAdditionalNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RevenueAdditionalNumber_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurRevnAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRecurRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRecurRevnAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueOptyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOptyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurEndDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueRecurEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurEndDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrTerritoryVersionId", scope = Revenue.class)
    public JAXBElement<Long> createRevenuePrTerritoryVersionId(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrTerritoryVersionId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesAccountUniqueName", scope = Revenue.class)
    public JAXBElement<String> createRevenueSalesAccountUniqueName(String value) {
        return new JAXBElement<String>(_RevenueSalesAccountUniqueName_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Discount", scope = Revenue.class)
    public JAXBElement<BigDecimal> createRevenueDiscount(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RevenueDiscount_QNAME, BigDecimal.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "MarginAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueMarginAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueMarginAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyLeadId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueOptyLeadId(Long value) {
        return new JAXBElement<Long>(_RevenueOptyLeadId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnSequenceNumber", scope = Revenue.class)
    public JAXBElement<Integer> createRevenueRevnSequenceNumber(Integer value) {
        return new JAXBElement<Integer>(_RevenueRevnSequenceNumber_QNAME, Integer.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurNumberPeriods", scope = Revenue.class)
    public JAXBElement<Integer> createRevenueRecurNumberPeriods(Integer value) {
        return new JAXBElement<Integer>(_SplitRevenueRecurNumberPeriods_QNAME, Integer.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AttachmentEntityName", scope = Revenue.class, defaultValue = "EGP_SYSTEM_ITEMS")
    public JAXBElement<String> createRevenueAttachmentEntityName(String value) {
        return new JAXBElement<String>(_RevenueAttachmentEntityName_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerResourceOrgId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueOwnerResourceOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOwnerResourceOrgId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRevnAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ProductType", scope = Revenue.class)
    public JAXBElement<String> createRevenueProductType(String value) {
        return new JAXBElement<String>(_RevenueProductType_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurStartDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueRecurStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurStartDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = Revenue.class)
    public JAXBElement<XMLGregorianCalendar> createRevenueEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueEffectiveDate_QNAME, XMLGregorianCalendar.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CloseReasonCodeSetId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueCloseReasonCodeSetId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCloseReasonCodeSetId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurPeriodOrEndDateCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRecurPeriodOrEndDateCode(String value) {
        return new JAXBElement<String>(_RevenueRecurPeriodOrEndDateCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CostAmount", scope = Revenue.class)
    public JAXBElement<AmountType> createRevenueCostAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueCostAmount_QNAME, AmountType.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CreditRcptPartOrgPartyId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueCreditRcptPartOrgPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCreditRcptPartOrgPartyId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitParentRevnId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueSplitParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSplitParentRevnId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueStatusCode(String value) {
        return new JAXBElement<String>(_SplitRevenueStatusCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrimaryFlag", scope = Revenue.class)
    public JAXBElement<Boolean> createRevenuePrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenuePrimaryFlag_QNAME, Boolean.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesCreditTypeCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueSalesCreditTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSalesCreditTypeCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmountCurcyCode", scope = Revenue.class)
    public JAXBElement<String> createRevenueRevnAmountCurcyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRevnAmountCurcyCode_QNAME, String.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "BUOrgId", scope = Revenue.class)
    public JAXBElement<Long> createRevenueBUOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueBUOrgId_QNAME, Long.class, Revenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesAccountId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueSalesAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSalesAccountId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UOMCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueUOMCode(String value) {
        return new JAXBElement<String>(_SplitRevenueUOMCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UserLastUpdateDate", scope = RecurringRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createRecurringRevenueUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRate", scope = RecurringRevenue.class)
    public JAXBElement<BigDecimal> createRecurringRevenueConversionRate(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueConversionRate_QNAME, BigDecimal.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AdditionalText2", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueAdditionalText2(String value) {
        return new JAXBElement<String>(_RevenueAdditionalText2_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AdditionalText1", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueAdditionalText1(String value) {
        return new JAXBElement<String>(_RevenueAdditionalText1_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CommitFlag", scope = RecurringRevenue.class)
    public JAXBElement<Boolean> createRecurringRevenueCommitFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenueCommitFlag_QNAME, Boolean.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurFrequencyCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueRecurFrequencyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurFrequencyCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurTypeCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueRecurTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRecurTypeCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "DownsideAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueDownsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueDownsideAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueExpectAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueExpectAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Quantity", scope = RecurringRevenue.class)
    public JAXBElement<MeasureType> createRecurringRevenueQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueQuantity_QNAME, MeasureType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ResourcePartyId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueResourcePartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueResourcePartyId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "LastUpdateLogin", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueLastUpdateLogin(String value) {
        return new JAXBElement<String>(_SplitRevenueLastUpdateLogin_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ConversionRateType", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueConversionRateType(String value) {
        return new JAXBElement<String>(_SplitRevenueConversionRateType_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ExpectDlvryDate", scope = RecurringRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createRecurringRevenueExpectDlvryDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueExpectDlvryDate_QNAME, XMLGregorianCalendar.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitTypeCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueSplitTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSplitTypeCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ProdGroupId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueProdGroupId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueProdGroupId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AdditionalAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueAdditionalAmount(AmountType value) {
        return new JAXBElement<AmountType>(_RevenueAdditionalAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCodeSetId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueStatusCodeSetId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueStatusCodeSetId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurParentRevnId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueRecurParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueRecurParentRevnId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryOrgId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueInventoryOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryOrgId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitPercent", scope = RecurringRevenue.class)
    public JAXBElement<BigDecimal> createRecurringRevenueSplitPercent(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueSplitPercent_QNAME, BigDecimal.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MeasureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurQuantity", scope = RecurringRevenue.class)
    public JAXBElement<MeasureType> createRecurringRevenueRecurQuantity(MeasureType value) {
        return new JAXBElement<MeasureType>(_SplitRevenueRecurQuantity_QNAME, MeasureType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "WinProb", scope = RecurringRevenue.class)
    public JAXBElement<BigDecimal> createRecurringRevenueWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SplitRevenueWinProb_QNAME, BigDecimal.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCodeSetId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueTypeCodeSetId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueTypeCodeSetId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "ForecastOverrideCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueForecastOverrideCode(String value) {
        return new JAXBElement<String>(_SplitRevenueForecastOverrideCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UpsideAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueUpsideAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUpsideAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "UnitPrice", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueUnitPrice(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueUnitPrice_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TargetPartyId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueTargetPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueTargetPartyId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "Comments", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueComments(String value) {
        return new JAXBElement<String>(_SplitRevenueComments_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrCmptPartyId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenuePrCmptPartyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenuePrCmptPartyId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "InventoryItemId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueInventoryItemId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueInventoryItemId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CustomerAccountId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueCustomerAccountId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueCustomerAccountId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "AdditionalNumber", scope = RecurringRevenue.class)
    public JAXBElement<BigDecimal> createRecurringRevenueAdditionalNumber(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_RevenueAdditionalNumber_QNAME, BigDecimal.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurRevnAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueRecurRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRecurRevnAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OptyId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueOptyId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOptyId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurEndDate", scope = RecurringRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createRecurringRevenueRecurEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurEndDate_QNAME, XMLGregorianCalendar.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "MarginAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueMarginAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueMarginAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurNumberPeriods", scope = RecurringRevenue.class)
    public JAXBElement<Integer> createRecurringRevenueRecurNumberPeriods(Integer value) {
        return new JAXBElement<Integer>(_SplitRevenueRecurNumberPeriods_QNAME, Integer.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "OwnerResourceOrgId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueOwnerResourceOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueOwnerResourceOrgId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "TypeCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueTypeCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueRevnAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "EffectiveDate", scope = RecurringRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createRecurringRevenueEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueEffectiveDate_QNAME, XMLGregorianCalendar.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RecurStartDate", scope = RecurringRevenue.class)
    public JAXBElement<XMLGregorianCalendar> createRecurringRevenueRecurStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SplitRevenueRecurStartDate_QNAME, XMLGregorianCalendar.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "CostAmount", scope = RecurringRevenue.class)
    public JAXBElement<AmountType> createRecurringRevenueCostAmount(AmountType value) {
        return new JAXBElement<AmountType>(_SplitRevenueCostAmount_QNAME, AmountType.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SplitParentRevnId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueSplitParentRevnId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueSplitParentRevnId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "StatusCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueStatusCode(String value) {
        return new JAXBElement<String>(_SplitRevenueStatusCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "PrimaryFlag", scope = RecurringRevenue.class)
    public JAXBElement<Boolean> createRecurringRevenuePrimaryFlag(Boolean value) {
        return new JAXBElement<Boolean>(_SplitRevenuePrimaryFlag_QNAME, Boolean.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "SalesCreditTypeCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueSalesCreditTypeCode(String value) {
        return new JAXBElement<String>(_SplitRevenueSalesCreditTypeCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "RevnAmountCurcyCode", scope = RecurringRevenue.class)
    public JAXBElement<String> createRecurringRevenueRevnAmountCurcyCode(String value) {
        return new JAXBElement<String>(_SplitRevenueRevnAmountCurcyCode_QNAME, String.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/revenues/revenueService/", name = "BUOrgId", scope = RecurringRevenue.class)
    public JAXBElement<Long> createRecurringRevenueBUOrgId(Long value) {
        return new JAXBElement<Long>(_SplitRevenueBUOrgId_QNAME, Long.class, RecurringRevenue.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorPartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityReferencePartyUniqueName_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ThreatLevelCode", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorThreatLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorThreatLevelCode_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RevnAmount", scope = OpportunityCompetitor.class)
    public JAXBElement<AmountType> createOpportunityCompetitorRevnAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityReferenceRevnAmount_QNAME, AmountType.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryFlg", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorPrimaryFlg(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPrimaryFlg_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName1", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorPartyUniqueName1(String value) {
        return new JAXBElement<String>(_OpportunityReferencePartyUniqueName1_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorComments(String value) {
        return new JAXBElement<String>(_OpportunityReferenceComments_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AmountType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AnnualRevenueAmount", scope = OpportunityCompetitor.class)
    public JAXBElement<AmountType> createOpportunityCompetitorAnnualRevenueAmount(AmountType value) {
        return new JAXBElement<AmountType>(_OpportunityCompetitorAnnualRevenueAmount_QNAME, AmountType.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountId", scope = OpportunityCompetitor.class)
    public JAXBElement<Long> createOpportunityCompetitorSalesAccountId(Long value) {
        return new JAXBElement<Long>(_OpportunityReferenceSalesAccountId_QNAME, Long.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "WinProb", scope = OpportunityCompetitor.class)
    public JAXBElement<BigDecimal> createOpportunityCompetitorWinProb(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityReferenceWinProb_QNAME, BigDecimal.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAccountUniqueName", scope = OpportunityCompetitor.class)
    public JAXBElement<String> createOpportunityCompetitorSalesAccountUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityReferenceSalesAccountUniqueName_QNAME, String.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EffectiveDate", scope = OpportunityCompetitor.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityCompetitorEffectiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityReferenceEffectiveDate_QNAME, XMLGregorianCalendar.class, OpportunityCompetitor.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContactedFlg", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactContactedFlg(String value) {
        return new JAXBElement<String>(_OpportunityContactContactedFlg_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "AffinityLvlCd", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactAffinityLvlCd(String value) {
        return new JAXBElement<String>(_OpportunityContactAffinityLvlCd_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailAddress", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactEmailAddress(String value) {
        return new JAXBElement<String>(_OpportunityResourceEmailAddress_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesBuyingRoleCode", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactSalesBuyingRoleCode(String value) {
        return new JAXBElement<String>(_OpportunityContactSalesBuyingRoleCode_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PartyUniqueName", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPartyUniqueName(String value) {
        return new JAXBElement<String>(_OpportunityReferencePartyUniqueName_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "EmailPreferenceExistsFlag", scope = OpportunityContact.class)
    public JAXBElement<Boolean> createOpportunityContactEmailPreferenceExistsFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityContactEmailPreferenceExistsFlag_QNAME, Boolean.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Title_c", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactTitleC(String value) {
        return new JAXBElement<String>(_OpportunityResourceTitleC_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedPhoneNumber", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactFormattedPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityResourceFormattedPhoneNumber_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Email_c", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactEmailC(String value) {
        return new JAXBElement<String>(_OpportunityContactEmailC_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesInfluenceLevelCode", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactSalesInfluenceLevelCode(String value) {
        return new JAXBElement<String>(_OpportunityContactSalesInfluenceLevelCode_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContactPointType", scope = OpportunityContact.class, defaultValue = "EMAIL")
    public JAXBElement<String> createOpportunityContactContactPointType(String value) {
        return new JAXBElement<String>(_OpportunityContactContactPointType_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PrimaryFlg", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPrimaryFlg(String value) {
        return new JAXBElement<String>(_OpportunityCompetitorPrimaryFlg_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedMultilineAddress", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactFormattedMultilineAddress(String value) {
        return new JAXBElement<String>(_OpportunityContactFormattedMultilineAddress_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LocationId", scope = OpportunityContact.class)
    public JAXBElement<Long> createOpportunityContactLocationId(Long value) {
        return new JAXBElement<Long>(_OpportunityContactLocationId_QNAME, Long.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "UserLastUpdateDate", scope = OpportunityContact.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityContactUserLastUpdateDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityResourceUserLastUpdateDate_QNAME, XMLGregorianCalendar.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Phone_c", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPhoneC(String value) {
        return new JAXBElement<String>(_OpportunityContactPhoneC_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PersonCentricJobTitle", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPersonCentricJobTitle(String value) {
        return new JAXBElement<String>(_OpportunityContactPersonCentricJobTitle_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "SalesAffinityCode", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactSalesAffinityCode(String value) {
        return new JAXBElement<String>(_OpportunityContactSalesAffinityCode_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "JobTitle", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactJobTitle(String value) {
        return new JAXBElement<String>(_OpportunityContactJobTitle_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "LastUpdateLogin", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactLastUpdateLogin(String value) {
        return new JAXBElement<String>(_OpportunityResourceLastUpdateLogin_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Titles_c", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactTitlesC(String value) {
        return new JAXBElement<String>(_OpportunityResourceTitlesC_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PreferredContactMethod", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactPreferredContactMethod(String value) {
        return new JAXBElement<String>(_OpportunityContactPreferredContactMethod_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "ContactPointType1", scope = OpportunityContact.class, defaultValue = "PHONE")
    public JAXBElement<String> createOpportunityContactContactPointType1(String value) {
        return new JAXBElement<String>(_OpportunityContactContactPointType1_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "Comments", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactComments(String value) {
        return new JAXBElement<String>(_OpportunityReferenceComments_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RawPhoneNumber", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactRawPhoneNumber(String value) {
        return new JAXBElement<String>(_OpportunityContactRawPhoneNumber_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "InfluenceLvlCd", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactInfluenceLvlCd(String value) {
        return new JAXBElement<String>(_OpportunityContactInfluenceLvlCd_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "TargetPartyId", scope = OpportunityContact.class)
    public JAXBElement<Long> createOpportunityContactTargetPartyId(Long value) {
        return new JAXBElement<Long>(_OpportunityTargetPartyId_QNAME, Long.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "FormattedAddress", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactFormattedAddress(String value) {
        return new JAXBElement<String>(_OpportunityFormattedAddress_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RelationshipId", scope = OpportunityContact.class)
    public JAXBElement<Long> createOpportunityContactRelationshipId(Long value) {
        return new JAXBElement<Long>(_OpportunityContactRelationshipId_QNAME, Long.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "RoleCd", scope = OpportunityContact.class)
    public JAXBElement<String> createOpportunityContactRoleCd(String value) {
        return new JAXBElement<String>(_OpportunityContactRoleCd_QNAME, String.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "PhonePreferenceExistsFlag", scope = OpportunityContact.class)
    public JAXBElement<Boolean> createOpportunityContactPhonePreferenceExistsFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityPhonePreferenceExistsFlag_QNAME, Boolean.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/sales/opptyMgmt/opportunities/opportunityService/", name = "DoNotContactFlag", scope = OpportunityContact.class)
    public JAXBElement<Boolean> createOpportunityContactDoNotContactFlag(Boolean value) {
        return new JAXBElement<Boolean>(_OpportunityContactDoNotContactFlag_QNAME, Boolean.class, OpportunityContact.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CreatorPartyId", scope = Note.class)
    public JAXBElement<Long> createNoteCreatorPartyId(Long value) {
        return new JAXBElement<Long>(_NoteCreatorPartyId_QNAME, Long.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CurcyConvRateType", scope = Note.class)
    public JAXBElement<String> createNoteCurcyConvRateType(String value) {
        return new JAXBElement<String>(_NoteCurcyConvRateType_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "StartDates_c", scope = Note.class)
    public JAXBElement<XMLGregorianCalendar> createNoteStartDatesC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NoteStartDatesC_QNAME, XMLGregorianCalendar.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CorpCurrencyCode", scope = Note.class)
    public JAXBElement<String> createNoteCorpCurrencyCode(String value) {
        return new JAXBElement<String>(_NoteCorpCurrencyCode_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid2", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid2(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid2_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid3", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid3(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid3_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid4", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid4(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid4_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "EndDate_c", scope = Note.class)
    public JAXBElement<XMLGregorianCalendar> createNoteEndDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NoteEndDateC_QNAME, XMLGregorianCalendar.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid5", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid5(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid5_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeCategory", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeCategory(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeCategory_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "ContactRelationshipId", scope = Note.class)
    public JAXBElement<Long> createNoteContactRelationshipId(Long value) {
        return new JAXBElement<Long>(_NoteContactRelationshipId_QNAME, Long.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "NoteAttributeUid1", scope = Note.class)
    public JAXBElement<String> createNoteNoteAttributeUid1(String value) {
        return new JAXBElement<String>(_NoteNoteAttributeUid1_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "StartDate_c", scope = Note.class)
    public JAXBElement<XMLGregorianCalendar> createNoteStartDateC(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_NoteStartDateC_QNAME, XMLGregorianCalendar.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/notes/noteService", name = "CurrencyCode", scope = Note.class)
    public JAXBElement<String> createNoteCurrencyCode(String value) {
        return new JAXBElement<String>(_NoteCurrencyCode_QNAME, String.class, Note.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityCategoryId", scope = TransientCategory.class)
    public JAXBElement<Long> createTransientCategoryActivityCategoryId(Long value) {
        return new JAXBElement<Long>(_TransientCategoryActivityCategoryId_QNAME, Long.class, TransientCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "CategoryCd", scope = TransientCategory.class)
    public JAXBElement<String> createTransientCategoryCategoryCd(String value) {
        return new JAXBElement<String>(_TransientAppointmentCategoryCd_QNAME, String.class, TransientCategory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xmlns.oracle.com/apps/crmCommon/activities/activitiesService/", name = "ActivityId", scope = TransientCategory.class)
    public JAXBElement<Long> createTransientCategoryActivityId(Long value) {
        return new JAXBElement<Long>(_TransientContactActivityId_QNAME, Long.class, TransientCategory.class, value);
    }

}
