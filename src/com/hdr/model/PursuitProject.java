package com.hdr.model;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


/**
 * Model class for  PursuitProject (Sales Cloud Opportunity)
 * @author Romesh Soni  
 */
@Entity
@Table(name="XXHDR_PJM_OSC_PRSUT_PROJ_STG")
public class PursuitProject implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "etailerRaw_seq")
	@SequenceGenerator(name = "etailerRaw_seq", sequenceName = "XXHDR_PJM_OSC_PRSUT_PROJ_STG_S", allocationSize = 1)
	@Column(name = "RECORD_ID")
	private long recordId;

	//sales cloud last update date 
	@Transient
	private Timestamp   oscLastUpdateDate;
	
	

	@Column(name="AWARD_TYPE")
	private String awardType;

	@Column(name="BATCH_KEY")
	private String batchKey;

	@Column(name="BUSINESS_CLASS")
	private String businessClass;

	
	@Column(name="COST_CENTER")
	private String businessUnit;
	
	@Column(name="DELIVERY_METHOD")
	private String deliveryMethod;
	

	@Column(name="CONTRACT_TYPE")
	private String contractType;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATION_DATE")
	private Date creationDate;

	private String currency;

	@Column(name="DATA_SOURCE")
	private String dataSource;

	@Column(name="DATA_TARGET")
	private String dataTarget;

	//EBSID_c
	@Column(name="EBS_CUST_ACCT_ID")
	private BigDecimal ebsCustAcctId;

	@Column(name="EBS_CUST_ACCT_NUM")
	private String ebsCustAcctNum;
	
	@Column(name="EBS_PARTY_ID")
	private String ebsPartyId;

	@Column(name="REGISTRY_ID")
	private String registryId;
	
	/**
	 * @author jeevan
	 * DATED: 17-DEC-2015
	 * TIMED:3:06 AM
	 * NEW COLUMN ADDED
	 */
	@Column(name="PROJECT_NUMBER", length=255)
	private String projectNumber;
	
	//You will get ProjectManagers_Id_c from osc, use a transient field so that you can find employee details later.
	@Transient
	BigDecimal projectManagerOSCId;
	
	//IN OSC ITS NOT NUMERIC
	@Column(name="EBS_PROJ_MGR_EMP_ID")
	private String ebsProjMgrEmpId;

	@Column(name="EBS_PROJECT_ID")
	private BigDecimal ebsProjectId;

	@Temporal(TemporalType.DATE)
	@Column(name="EXPECT_APPROVAL_DATE")
	private Date expectApprovalDate;

	@Column(name="GNG_CHECKBOX")
	private String gngCheckbox;

	@Column(name="HDR_POTENTIAL_CAPACITY_GROSS")
	private BigDecimal hdrPotentialCapacityGross;

	@Column(name="HDR_POTENTIAL_CAPACITY_NET")
	private BigDecimal hdrPotentialCapacityNet;

	@Temporal(TemporalType.DATE)
	@Column(name="LAST_UPDATE_DATE")
	private Date lastUpdateDate;

	@Column(name="MARKET_SECTOR")
	private String marketSector;

	@Column(name="NO_CAPACITY_LIMIT")
	private String noCapacityLimit;


	/*@Column(name="OPPORTUNITY_VALUE")
	private String opportunityValue;*/

	@Column(name="OSC_MSA_ID")
	private String oscMsaId;

	@Column(name="OSC_OPPORTUNITY_ID")
	private String oscOpportunityId;

	@Temporal(TemporalType.DATE)
	@Column(name="PM_EFFECTIVE_FROM_DATE")
	private Date pmEffectiveFromDate;

	@Column(name="PROPOSED_FEE")
	private BigDecimal proposedFee;
		
	
	@Column(name="PROBABILITY_PERCENTAGE")
	private BigDecimal probability;

	@Column(name="PROJECT_DESCRIPTION")
	private String projectDescription;

	@Temporal(TemporalType.DATE)
	@Column(name="PROJECT_FINISH_DATE")
	private Date projectFinishDate;

	@Column(name="PROJECT_MANAGER")
	private String projectManager;

	@Column(name="PROJECT_NAME")
	private String projectName;

	@Temporal(TemporalType.DATE)
	@Column(name="PROJECT_START_DATE")
	private Date projectStartDate;

	@Column(name="OPPORTUNITY_STATUS")
	private String opportunityStatus;

	@Column(name="PURSUIT_TYPE")
	private String pursuitType;


	@Column(name="TOTAL_CONTRACT_CAPACITY")
	private BigDecimal totalContractCapacity;

	@Column(name="UNABLE_TO_PREDICT")
	private String unableToPredict;
	
	@Column(name="ADDRESS1")
	private String address1;
	
	@Column(name="ADDRESS2")
	private String address2;
	
	@Column(name="ADDRESS3")
	private String address3;
	
	@Column(name="ADDRESS4")
	private String address4;

	@Column(name="COUNTRY")
	private String country;


	public String getProjectNumber() {
		return projectNumber;
	}

	public void setProjectNumber(String projectNumber) {
		this.projectNumber = projectNumber;
	}

	@Column(name="CITY")
	private String city	;

	@Column(name="PROVINCE")
	private String province	;

	@Column(name="COUNTY")
	private String county	;

	@Column(name="STATE")
	private String state;
	
	@Column(name="POSTAL")
	private String postal;

	@Column(name="OSC_PARTY_ID")
	private String billableCompanyOscPartyId;


	public long getRecordId() {
		return recordId;
	}

	public void setRecordId(long recordId) {
		this.recordId = recordId;
	}

	public String getAwardType() {
		return awardType;
	}

	public void setAwardType(String awardType) {
		this.awardType = awardType;
	}

	public String getBatchKey() {
		return batchKey;
	}

	public void setBatchKey(String batchKey) {
		this.batchKey = batchKey;
	}

	public String getBusinessClass() {
		return businessClass;
	}

	public void setBusinessClass(String businessClass) {
		this.businessClass = businessClass;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getDataTarget() {
		return dataTarget;
	}

	public void setDataTarget(String dataTarget) {
		this.dataTarget = dataTarget;
	}

	public BigDecimal getEbsCustAcctId() {
		return ebsCustAcctId;
	}

	public void setEbsCustAcctId(BigDecimal ebsCustAcctId) {
		this.ebsCustAcctId = ebsCustAcctId;
	}

	public String getEbsCustAcctNum() {
		return ebsCustAcctNum;
	}

	public void setEbsCustAcctNum(String ebsCustAcctNum) {
		this.ebsCustAcctNum = ebsCustAcctNum;
	}

	public String getEbsProjMgrEmpId() {
		return ebsProjMgrEmpId;
	}

	public void setEbsProjMgrEmpId(String ebsProjMgrEmpId) {
		this.ebsProjMgrEmpId = ebsProjMgrEmpId;
	}

	public BigDecimal getEbsProjectId() {
		return ebsProjectId;
	}

	public void setEbsProjectId(BigDecimal ebsProjectId) {
		this.ebsProjectId = ebsProjectId;
	}

	public Date getExpectApprovalDate() {
		return expectApprovalDate;
	}

	public void setExpectApprovalDate(Date expectApprovalDate) {
		this.expectApprovalDate = expectApprovalDate;
	}

	public String getGngCheckbox() {
		return gngCheckbox;
	}

	public void setGngCheckbox(String gngCheckbox) {
		this.gngCheckbox = gngCheckbox;
	}

	public BigDecimal getHdrPotentialCapacityGross() {
		return hdrPotentialCapacityGross;
	}

	public void setHdrPotentialCapacityGross(BigDecimal hdrPotentialCapacityGross) {
		this.hdrPotentialCapacityGross = hdrPotentialCapacityGross;
	}

	public BigDecimal getHdrPotentialCapacityNet() {
		return hdrPotentialCapacityNet;
	}

	public void setHdrPotentialCapacityNet(BigDecimal hdrPotentialCapacityNet) {
		this.hdrPotentialCapacityNet = hdrPotentialCapacityNet;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}

	public String getMarketSector() {
		return marketSector;
	}

	public void setMarketSector(String marketSector) {
		this.marketSector = marketSector;
	}

	public String getNoCapacityLimit() {
		return noCapacityLimit;
	}

	public void setNoCapacityLimit(String noCapacityLimit) {
		this.noCapacityLimit = noCapacityLimit;
	}

	/*public String getOpportunityValue() {
		return opportunityValue;
	}

	public void setOpportunityValue(String opportunityValue) {
		this.opportunityValue = opportunityValue;
	}*/

	public String getOscMsaId() {
		return oscMsaId;
	}

	public void setOscMsaId(String oscMsaId) {
		this.oscMsaId = oscMsaId;
	}

	public String getOscOpportunityId() {
		return oscOpportunityId;
	}

	public void setOscOpportunityId(String oscOpportunityId) {
		this.oscOpportunityId = oscOpportunityId;
	}

	public Date getPmEffectiveFromDate() {
		return pmEffectiveFromDate;
	}

	public void setPmEffectiveFromDate(Date pmEffectiveFromDate) {
		this.pmEffectiveFromDate = pmEffectiveFromDate;
	}

	public BigDecimal getProbability() {
		return probability;
	}

	public void setProbability(BigDecimal probability) {
		this.probability = probability;
	}

	public String getProjectDescription() {
		return projectDescription;
	}

	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}

	public Date getProjectFinishDate() {
		return projectFinishDate;
	}

	public void setProjectFinishDate(Date projectFinishDate) {
		this.projectFinishDate = projectFinishDate;
	}

	public String getProjectManager() {
		return projectManager;
	}

	public void setProjectManager(String projectManager) {
		this.projectManager = projectManager;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public Date getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(Date projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	

	public String getPursuitType() {
		return pursuitType;
	}

	public void setPursuitType(String pursuitType) {
		this.pursuitType = pursuitType;
	}

	public BigDecimal getTotalContractCapacity() {
		return totalContractCapacity;
	}

	public void setTotalContractCapacity(BigDecimal totalContractCapacity) {
		this.totalContractCapacity = totalContractCapacity;
	}

	public String getUnableToPredict() {
		return unableToPredict;
	}

	public void setUnableToPredict(String unableToPredict) {
		this.unableToPredict = unableToPredict;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BigDecimal getProjectManagerOSCId() {
		return projectManagerOSCId;
	}

	public void setProjectManagerOSCId(BigDecimal projectManagerOSCId) {
		this.projectManagerOSCId = projectManagerOSCId;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAddress4() {
		return address4;
	}

	public void setAddress4(String address4) {
		this.address4 = address4;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getBillableCompanyOscPartyId() {
		return billableCompanyOscPartyId;
	}

	public void setBillableCompanyOscPartyId(String billableCompanyOscPartyId) {
		this.billableCompanyOscPartyId = billableCompanyOscPartyId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPostal() {
		return postal;
	}

	public void setPostal(String postal) {
		this.postal = postal;
	}

	

	public String getOpportunityStatus() {
		return opportunityStatus;
	}

	public void setOpportunityStatus(String opportunityStatus) {
		this.opportunityStatus = opportunityStatus;
	}

	public String getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(String deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public String getEbsPartyId() {
		return ebsPartyId;
	}

	public void setEbsPartyId(String ebsPartyId) {
		this.ebsPartyId = ebsPartyId;
	}

	public String getRegistryId() {
		return registryId;
	}

	public void setRegistryId(String registryId) {
		this.registryId = registryId;
	}

	


    public BigDecimal getProposedFee() {
		return proposedFee;
	}

	public void setProposedFee(BigDecimal proposedFee) {
		this.proposedFee = proposedFee;
	}

	public String toString() {
      StringBuilder result = new StringBuilder();
      String newLine = System.getProperty("line.separator");

      result.append( this.getClass().getName() );
      result.append( " Object {" );
      result.append(newLine);

      //determine fields declared in this class only (no fields of superclass)
      Field[] fields = this.getClass().getDeclaredFields();

      //print field names paired with their values
      for ( Field field : fields  ) {
        result.append("  ");
        try {
          result.append( field.getName() );
          result.append(": ");
          //requires access to private field:
          result.append( field.get(this) );
        } catch ( IllegalAccessException ex ) {
          System.out.println(ex);
        }
        result.append(newLine);
      }
      result.append("}");

      return result.toString();
    }

	public Timestamp getOscLastUpdateDate() {
		return oscLastUpdateDate;
	}

	public void setOscLastUpdateDate(Timestamp oscLastUpdateDate) {
		this.oscLastUpdateDate = oscLastUpdateDate;
	}


    
		
}