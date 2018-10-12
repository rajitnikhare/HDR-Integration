/*
package com.crmod.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.jboss.logging.Logger;
import org.junit.Test;

import com.crmod.exception.FCRMODException;
import com.crmod.model.Agency;
import com.crmod.model.Agent;
import com.crmod.model.BaseObject;
import com.crmod.model.FloorPlanElevation;
import com.crmod.service.impl.FloorPlanElevationDao;
import com.crmod.util.Constants;
import com.crmod.util.IOrganizationPartyConstants;
import com.crmod.util.PropFileUtil;
import com.crmod.util.SOAPLoggingHandler;
import com.crmod.ws.stubs.salesparty.FindSalesParty;
import com.crmod.ws.stubs.salesparty.OrganizationProfile;
import com.crmod.ws.stubs.salesparty.Conjunction;
import com.crmod.ws.stubs.salesparty.FindControl;
import com.crmod.ws.stubs.salesparty.FindCriteria;
import com.crmod.ws.stubs.salesparty.ObjectFactory;
import com.crmod.ws.stubs.salesparty.OrganizationParty;
import com.crmod.ws.stubs.salesparty.PersonResult;
import com.crmod.ws.stubs.salesparty.SalesAccount;
import com.crmod.ws.stubs.salesparty.ServiceException;
import com.crmod.ws.stubs.salesparty.SortAttribute;
import com.crmod.ws.stubs.salesparty.SortOrder;
import com.crmod.ws.stubs.salesparty.ViewCriteria;
import com.crmod.ws.stubs.salesparty.ViewCriteriaItem;
import com.crmod.ws.stubs.salesparty.ViewCriteriaRow;
import com.crmod.ws.stubs.salesparty.SalesParty;
import com.crmod.ws.stubs.salesparty.SalesPartyService;
import com.crmod.ws.stubs.salesparty.SalesPartyService_Service;
import com.fusion.util.PersonFusionUtil;


import java.util.ArrayList;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class UpdatedSalesParty {

	private Logger log = Logger.getLogger(UpdatedSalesParty.class);
	 private static final String fileName="c:\\Prod_RealEstate_Customers_IDs.csv";
	
	@Test 
	public void readCSV()
	{
		String prodpartyID= "100000000589014";
		
		//String stagepartyID= "300000000742549";
		
		//updateFusion(stagepartyID);
		updateFusion(prodpartyID);
		
		  ArrayList <String> alstPropEUIDS =
			        readCSVValuesInArrayList();
			       
			         
			        displayArrayList(alstPropEUIDS);
			       
			        for(String partyID: alstPropEUIDS)
			        {
			        	updateFusion(partyID);
			        }

	}
	public void updateFusion(String partyID)
	{
		
			try 
			{
				doitMain(partyID);
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Exception for "+partyID);
			}
		 
		
	}
	public void doitMain(String partyID) throws Exception {
			try {
				
				PropFileUtil.load();
				
				
				SalesPartyService_Service service = new SalesPartyService_Service();
				SalesPartyService publicService = service.getSalesPartyServiceSoapHttpPort();
				setWSBindingProvider(publicService
						,PropFileUtil.getValue(Constants.FCRMOD_SALESPARTY_URL)
						);
				
				FindCriteria findCriteria = new FindCriteria();
			    findCriteria.setFetchSize(100);
			    findCriteria.setFetchStart(0);
				   
				
			
				ViewCriteria viewCriteria_Root = new ViewCriteria();
				ViewCriteriaRow viewCriteriaRow_Root = new ViewCriteriaRow();			

				
				
				  //PartyType
                ViewCriteriaItem viewCriteriaItem_PartyType = new ViewCriteriaItem();
                viewCriteriaItem_PartyType.setConjunction(Conjunction.AND);
                viewCriteriaItem_PartyType.setUpperCaseCompare(false);
                viewCriteriaItem_PartyType.setAttribute("PartyId");
                viewCriteriaItem_PartyType.setOperator("=");
                viewCriteriaItem_PartyType.getValue().add(partyID);
                //>>>>add to root
                viewCriteriaRow_Root.getItem().add(viewCriteriaItem_PartyType);
                //PartyType
                ArrayList<String> findAttributeList = new ArrayList<String>();
                findAttributeList.add("PartyId");
                findAttributeList.add("PartyName");
               // findAttributeList.add("SalesAccount");
                findAttributeList.add("OrganizationParty");
        		
        		

                
                
                
				viewCriteria_Root.getGroup().add(viewCriteriaRow_Root);
				
                //finally add the filter
                findCriteria.setFilter(viewCriteria_Root);
                
                

                sort order
        		SortAttribute so = new SortAttribute();
        		so.setDescending(false);
        		so.setName("LastUpdateDate");
        		SortOrder s = new SortOrder();
        		s.getSortAttribute().add(so);
        		findCriteria.setSortOrder(s);
        	    sort order
				
				findCriteria.setExcludeAttribute(false);
				FindControl findControl = new FindControl();
				
				findCriteria.getFindAttribute().addAll(findAttributeList);
				
				findControl.setRetrieveAllTranslations(true);

				try {
					List<SalesParty>  lst = publicService
						.findSalesParty(findCriteria, findControl);

					if(lst!=null&&lst.size()>0)
					{
						System.out.println("Name:"+lst.get(0).getPartyName());
						ObjectFactory factory = new ObjectFactory();
						
						
						
						SalesParty spOriginal = lst.get(0);
						
						SalesParty spNew = new SalesParty();
						spNew.setPartyId(spOriginal.getPartyId());
						
						//Account Type
						updateAccountNow(spOriginal,spNew);
						
						//Status_c FIELD
						spOriginal.getOrganizationParty().get(0)
						  .getOrganizationProfile().get(0).setStatusC(factory.createOrganizationProfileStatusC("Active"));
						
						
						publicService.updateSalesParty(spOriginal);
						
						
						//III
						
						//spOriginal.getSalesAccount().get(0).setStatus(factory.createSalesAccountStatus("ACTIVE"));
						
						//spOriginal.getSalesAccount().get(0).setStatus1("INACTIVE");
						
						//spOriginal.setStatus("Active");

						
						//II
						//publicService.updateSalesAccount(spOriginal.getSalesAccount().get(0));
						
						//publicService.updateSalesAccount(spNew.getSalesAccount().get(0));
						
					}
					else
						System.out.println("Record Not Found partyID:"+partyID);
				}
				 catch (Exception e) {
					
					throw new FCRMODException(e);
				}
				 
			} catch (Exception e) {
				throw e;
			}
	}
	
	
	private void updateAccountNow(SalesParty spOriginal, SalesParty spNew) {
		
		//III.Update Account Type to Real Estate Agency. This is on Accounts Object.
		updateAccountType_CFieldUnderOrganizationProfile(spOriginal,spNew);
		
		//II.Update Account Type Report to Real Estate Agency. This is on Sales Account Object and is a Custom Pick list
		//updateAccountType_CFieldUnderSalesAccount(spOriginal,spNew);
		
		
		
		
	}
	private void updateAccountType_CFieldUnderSalesAccount(
			SalesParty spOriginal, SalesParty spNew) {
		
		
		if(spOriginal.getSalesAccount()!=null&&spOriginal.getSalesAccount().size()>0)
		{
			ObjectFactory factory = new ObjectFactory();
			spOriginal.getSalesAccount().get(0).setAccountTypeC(factory.createSalesAccountAccountTypeC(IOrganizationPartyConstants
                    .FUSION_ACC_TYPE_REAL_ESTATE_AGENCY));
			
			SalesAccount sa = new SalesAccount();
			sa.setPartyId(spOriginal.getPartyId());
			sa.setAccountDirectorId(spOriginal.getSalesAccount().get(0).getAccountDirectorId());
			sa.setSalesAccountId(spOriginal.getSalesAccount().get(0).getSalesAccountId());
			sa.setAccountTypeC(spOriginal.getSalesAccount().get(0).getAccountTypeC());
			
			spNew.getSalesAccount().add(sa);
			
		}
	}
	private void updateAccountType_CFieldUnderOrganizationProfile(SalesParty spOriginal, SalesParty spNew) {
		
		if(spOriginal.getOrganizationParty()!=null
				&&spOriginal.getOrganizationParty().size()>0		
				)
				{
					System.out.println("Found OrganizationParty");
					for(OrganizationParty op:spOriginal.getOrganizationParty())
					{
						if(op.getOrganizationProfile()!=null
								&&op.getOrganizationProfile().size()>0		
								)
						{
							System.out.println("Found OrganizationProfile");
							for(OrganizationProfile opf
									:op.getOrganizationProfile())
							{
								ObjectFactory factory = new ObjectFactory();
								
								opf.setAccountTypeC(factory.createOrganizationProfileAccountTypeC(IOrganizationPartyConstants
			                                     .FUSION_ACC_TYPE_REAL_ESTATE_AGENCY));
							}
						}
						
					}
					
					spNew.getOrganizationParty().add(spOriginal.getOrganizationParty().get(0));
					
				}
		
	}
	public void setWSBindingProvider(Object publicService, String endPointAddress) {
		 BindingProvider wsbp = (BindingProvider)publicService;
	     Map<String, Object> reqContext = ((BindingProvider) wsbp).getRequestContext();
	     log.info("Got the end point address : " + endPointAddress);
	     reqContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endPointAddress);
	     
	     String crmuser=PropFileUtil.getValue(Constants.FCRMOD_USERNAME);
	     String crmpwd=PropFileUtil.getValue(Constants.FCRMOD_PASSWORD);
	     System.out.println(crmuser);
	     System.out.println(crmpwd);
	     //System.out.println("crmuser:"+crmuser);
	     //PropFileUtil.getValue(Constants.FCRMOD_PASSWORD);
	     
	     reqContext.put(BindingProvider.USERNAME_PROPERTY, crmuser);
	     reqContext.put(BindingProvider.PASSWORD_PROPERTY, crmpwd);
	     
	     List handlerList = wsbp.getBinding().getHandlerChain();
		 if (handlerList == null)
			handlerList = new ArrayList();
			SOAPLoggingHandler loggingHandler = new SOAPLoggingHandler();
			handlerList.add(loggingHandler);
			wsbp.getBinding().setHandlerChain(handlerList);
	}
	
	public static ArrayList <String> readCSVValuesInArrayList() {
        ArrayList <String>storeValues = new ArrayList<String>();
       
        try {
            // storeValues.clear();//just in case this is the second call of the
            // ReadFile Method./
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            StringTokenizer st = null;
            String strline;
            int lineNumber = 0, tokenNumber = 0;
            while ((strline=br.readLine()) != null) {
                lineNumber++;
                // break comma separated line using ","
                st = new StringTokenizer(strline, ",");
                while (st.hasMoreTokens()) {
                    System.out.println("Line # " + lineNumber + ", Token # "
                            + tokenNumber + ", Token : " + st.nextToken());
                    storeValues.add(st.nextToken().trim());
                }
                // reset token number
                tokenNumber = 0;
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
       
        return storeValues;
    }

	public static void displayArrayList(ArrayList <String>storeValues)
    {
        for(int x=0;x<storeValues.size();x++)
        {
        System.out.println(storeValues.get(x));
        }
    }
	
}
*/