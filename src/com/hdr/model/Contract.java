package com.hdr.model;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity(name = "XXHDR_IN_CONTRACT_STG")
public class Contract{

	@Id
	@Column(name = "EBS_CONTRACT_ID")
	private Long ebsContractId;
	
	@Column(name="CONTRACT_NUMBER", length= 30) 
	private String contractNumber;
	
	@Column(name = "CONTRACT_NAME",length=240)
	private String contractName;

	@Column(name = "FEDERAL_MASTER_CONTRACT_NO")
	private Long federalMasterContractNo;

	
	@Column(name="MASTER_CONTRACT_NAME", length= 240)
    private String masterContractName;	    
	  
    @Column(name = "EBS_MASTER_CONTRACT_ID")
    private Long ebsMasterContractId;
    
    @Column(name = "EBS_BILLABLE_ACCOUNT_ID")
    private Long ebsBillableAccountId;
    
    @Column(name = "EBS_BILLABLE_CUSTOMER_NO")
    private Long ebsBillableCustomerNumber;

    @Column(name = "EBS_PURSUIT_PROJECT_ID")
    private Long ebsPursuitProjectId;
	                
	@Column(name="BILLABLE_ACCOUNT_NAME", length= 240)
    private String billableAccountname;	 
	
	@Column(name="PROCESS_STATE",length= 30)
	private String processState;
	
	@Column(name="RETRY_COUNT")
	private Long retryCount;
	
	@Column(name="ERROR_MESSAGE", length=4000)
	private String errorMessage;
	
	@Column(name = "CONTRACT_AWARD_TYPE", length=80)
	private String contractAwardType;


	@Column(name = "HDR_ACCOUNT")
	private Long hdrAccount;

	@Column(name = "OSC_OPPORTUNITY_ID")
	private String oscOpportunityId;

	@Column(name = "OPPORTUNITY_NAME")
	private String opportunityName;

	@Column(name = "START_DATE")
	private Date startDate;

	@Column(name = "END_DATE")
	private Date endDate;
	    
	@Column(name="TOTAL_CONTRACT_VAL_TO_DT_GROSS", scale=26, precision=5)
	private BigDecimal totalContractValToDtGross;
	 
	@Column(name="TOTAL_REMAINING_CAPACITY", scale=26, precision=5)
	private BigDecimal totalRemainingCapacity;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATED_TIMESTAMP")
	private Date createdTimeStamp;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "MODIFIED_TIMESTAMP")
	private Date modifiedTimeStamp;

	@Column(name="EBS_PARTY_ID")
	private Long ebsPartyId;

	@Transient
	private String operation;

	@Transient
	private BigDecimal contractOscId;

	public Long getEbsContractId() {
		return ebsContractId;
	}

	public void setEbsContractId(Long ebsContractId) {
		this.ebsContractId = ebsContractId;
	}

	public String getContractNumber() {
		return contractNumber;
	}

	public void setContractNumber(String contractNumber) {
		this.contractNumber = contractNumber;
	}

	public String getContractName() {
		return contractName;
	}

	public void setContractName(String contractName) {
		this.contractName = contractName;
	}

	public Long getFederalMasterContractNo() {
		return federalMasterContractNo;
	}

	public void setFederalMasterContractNo(Long federalMasterContractNo) {
		this.federalMasterContractNo = federalMasterContractNo;
	}

	public String getMasterContractName() {
		return masterContractName;
	}

	public void setMasterContractName(String masterContractName) {
		this.masterContractName = masterContractName;
	}

	public Long getEbsMasterContractId() {
		return ebsMasterContractId;
	}

	public void setEbsMasterContractId(Long ebsMasterContractId) {
		this.ebsMasterContractId = ebsMasterContractId;
	}

	public Long getEbsBillableAccountId() {
		return ebsBillableAccountId;
	}

	public void setEbsBillableAccountId(Long ebsBillableAccountId) {
		this.ebsBillableAccountId = ebsBillableAccountId;
	}

	public Long getEbsBillableCustomerNumber() {
		return ebsBillableCustomerNumber;
	}

	public void setEbsBillableCustomerNumber(Long ebsBillableCustomerNumber) {
		this.ebsBillableCustomerNumber = ebsBillableCustomerNumber;
	}

	public Long getEbsPursuitProjectId() {
		return ebsPursuitProjectId;
	}

	public void setEbsPursuitProjectId(Long ebsPursuitProjectId) {
		this.ebsPursuitProjectId = ebsPursuitProjectId;
	}

	public String getBillableAccountname() {
		return billableAccountname;
	}

	public void setBillableAccountname(String billableAccountname) {
		this.billableAccountname = billableAccountname;
	}

	public String getProcessState() {
		return processState;
	}

	public void setProcessState(String processState) {
		this.processState = processState;
	}

	public Long getRetryCount() {
		return retryCount;
	}

	public void setRetryCount(Long retryCount) {
		this.retryCount = retryCount;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getContractAwardType() {
		return contractAwardType;
	}

	public void setContractAwardType(String contractAwardType) {
		this.contractAwardType = contractAwardType;
	}

	public Long getHdrAccount() {
		return hdrAccount;
	}

	public void setHdrAccount(Long hdrAccount) {
		this.hdrAccount = hdrAccount;
	}

	public String getOscOpportunityId() {
		return oscOpportunityId;
	}

	public void setOscOpportunityId(String oscOpportunityId) {
		this.oscOpportunityId = oscOpportunityId;
	}

	public String getOpportunityName() {
		return opportunityName;
	}

	public void setOpportunityName(String opportunityName) {
		this.opportunityName = opportunityName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}



	public BigDecimal getTotalContractValToDtGross() {
		return totalContractValToDtGross;
	}

	public void setTotalContractValToDtGross(BigDecimal totalContractValToDtGross) {
		this.totalContractValToDtGross = totalContractValToDtGross;
	}

	public BigDecimal getTotalRemainingCapacity() {
		return totalRemainingCapacity;
	}

	public void setTotalRemainingCapacity(BigDecimal totalRemainingCapacity) {
		this.totalRemainingCapacity = totalRemainingCapacity;
	}

	public Date getCreatedTimeStamp() {
		return createdTimeStamp;
	}

	public void setCreatedTimeStamp(Date createdTimeStamp) {
		this.createdTimeStamp = createdTimeStamp;
	}

	public Date getModifiedTimeStamp() {
		return modifiedTimeStamp;
	}

	public void setModifiedTimeStamp(Date modifiedTimeStamp) {
		this.modifiedTimeStamp = modifiedTimeStamp;
	}

	public Long getEbsPartyId() {
		return ebsPartyId;
	}

	public void setEbsPartyId(Long ebsPartyId) {
		this.ebsPartyId = ebsPartyId;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}

	public BigDecimal getContractOscId() {
		return contractOscId;
	}

	public void setContractOscId(BigDecimal contractOscId) {
		this.contractOscId = contractOscId;
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
}


