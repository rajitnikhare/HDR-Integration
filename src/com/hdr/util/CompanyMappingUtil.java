package com.hdr.util;

import java.util.Date;

import com.hdr.constants.ICompanyConstants;
import com.hdr.exception.ObjectMappingException;
import com.hdr.model.Company;
import com.hdr.ws.stubs.accountService.Account;

public class CompanyMappingUtil extends DataUtil {

	public static Company companyObjectMapper(Object o, String batchKey, Account parentAccount) throws ObjectMappingException {
		if (o != null && batchKey != null) {
			try {
				Account a = (Account) o;
				Company c = new Company();
				/**batch_key
				 * -- 'BD-INT-001'||TO_CHAR(SYSDATE,'MMDDYYYYHHMISS');	
				 */
				c.setBatchKey(batchKey);
				/**
				 * osc_parent_id
				 *  -- OSC Child Party ID. Change the data type to varchar2(30)
				 * 
				 */
				if (a.getParentAccountPartyId() != null && a.getParentAccountPartyId().getValue() != null){
					c.setOscParentId(a.getParentAccountPartyId().getValue());
				}
					
				/**
				 * organization_name
				 * -- Parent record name
				 *
				 */
				if (parentAccount != null && parentAccount.getOrganizationName()!=null){
					c.setOrganizationName(parentAccount.getOrganizationName());
				}
					

				/**
				 * osc_party_id
				 * -- OSC Child Party ID. Change the data type to varchar2(30)
				 */
				c.setOscPartyId(a.getPartyId());
				/**
				 * account_description
				 * -- Account (child) name
				 */
				c.setAccountDescription(a.getOrganizationName());
				/**
				 * classification
				 * -- "HDR Marketing"
				 */
				c.setClassification(ICompanyConstants.ACCOUNT_FIELD_CLASSIFICATION_HDR_MARKETTING);
				/**
				 *  ebs_party_id
				 *  -- EBS Party Id (Parent)
				 * 
				 */
				if (parentAccount != null && parentAccount.getOrganizationDEOEBSPartyIdC() != null && parentAccount.getOrganizationDEOEBSPartyIdC().getValue()!=null) {
					c.setEbsPartyId(Long.valueOf(parentAccount.getOrganizationDEOEBSPartyIdC().getValue()));
				}
				/**
				 * profile_class
				 * -- Default it to 'Prospect'
				 */
				c.setProfileClass(ICompanyConstants.ACCOUNT_FIELD_PROFILE_CLASS_PROSPECT);
				/**
				 * account_type
				 * -- Default it to 'External'
				 */
				c.setAccountType(ICompanyConstants.ACCOUNT_FIELD_ACCOUNT_TYPE_EXTERNAL);
				/**
				 * account_number
				 * -- EBS Customer/Account No.
				 */
				if (a.getOrganizationDEOEBSAccountNumberC()!= null && a.getOrganizationDEOEBSAccountNumberC().getValue()!=null) {
					c.setAccountNumber(a.getOrganizationDEOEBSAccountNumberC().getValue());
				}
				/**
				 * organization_type
				 *  -- Default it to 'ORGANIZATION'
				 */
				c.setOrganizationType(ICompanyConstants.ACCOUNT_FIELD_ORGANIZATION_TYPE_ORGANIZATION);
				/**
				 * ebs_account_id
				 * -- Account id of Child
				 *
				 */
				if (a.getOrganizationDEOEBSAccountIdC()!= null && a.getOrganizationDEOEBSAccountIdC().getValue()!=null) {
					c.setEbsAccountId(Long.valueOf(a.getOrganizationDEOEBSAccountIdC().getValue()));
				}
				/**
				 * data_source
				 * -- Default to 'OSC'  (by integration)
				 */
				c.setData_source(Constants.SOURCE_TARGET.OSC.toString());
				/**
				 * data_target
				 * -- Default to 'EBS'  (by integration)
				 */
				c.setData_target(Constants.SOURCE_TARGET.EBS.toString());
				/**
				 * status_code
				 * -- Default to N   (by integration)
				 */
				c.setStatusCode(Constants.HDR_INT_STATUS_CODE);
				/**
				 * creation_date
				 * -- system date (record creation date - in table)
				 */
				c.setCreatedDate(new Date());
				/**
				 * last_update_date
				 * -- system date (record creation date - in table)
				 */
				/**
				 * Registry Id
				 */
				if(parentAccount!=null && parentAccount.getOrganizationDEOEBSRegIdC()!=null &&  parentAccount.getOrganizationDEOEBSRegIdC().getValue()!=null){
					c.setRegistryId( parentAccount.getOrganizationDEOEBSRegIdC().getValue());
				}
				
				c.setLastUpdatedDate(new Date());
				return c;
			} catch (Exception e) {
				throw new ObjectMappingException(e);
			}

		}

		return null;

	}

}