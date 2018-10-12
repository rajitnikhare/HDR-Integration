package com.hdr.service.impl;




import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.constants.IConversionRateConstants;
import com.hdr.exception.FusionException;
import com.hdr.model.BaseModel;
import com.hdr.model.ConversionRate;
import com.hdr.service.ConversionServ;
import com.hdr.util.DateUtils;
import com.hdr.ws.stubs.customeObject.Conjunction;
import com.hdr.ws.stubs.customeObject.CurrencyDailyRateC;
import com.hdr.ws.stubs.customeObject.FindControl;
import com.hdr.ws.stubs.customeObject.FindCriteria;
import com.hdr.ws.stubs.customeObject.ObjectFactory;
import com.hdr.ws.stubs.customeObject.SalesCustomObjectService;
import com.hdr.ws.stubs.customeObject.SalesCustomObjectService_Service;
import com.hdr.ws.stubs.customeObject.ViewCriteria;
import com.hdr.ws.stubs.customeObject.ViewCriteriaItem;
import com.hdr.ws.stubs.customeObject.ViewCriteriaRow;

import weblogic.wsee.jws.jaxws.owsm.SecurityPoliciesFeature;



@Service
@Repository("conversionServImpl")
public class ConversionServImpl extends AbstractFCRMODWebService implements ConversionServ {
	
	
	private static final Logger log = Logger.getLogger(ConversionServImpl.class);

	private static final ObjectFactory factory = new ObjectFactory();


	
	
	@Override
	public Object find(Object o) throws FusionException {
		if(o!=null){
			BaseModel bo =  (BaseModel) o;
			try {
				SalesCustomObjectService service = getService();
				FindCriteria findCriteria = new FindCriteria();
				FindControl findControl = new FindControl();
				findCriteria.setFetchSize(bo.getFetchSize());
				findCriteria.setFetchStart(bo.getFetchStart());
				
				
				
				ViewCriteriaItem criteriaItemA = new ViewCriteriaItem();
				criteriaItemA.setConjunction(Conjunction.AND);
				criteriaItemA.setUpperCaseCompare(false);
				criteriaItemA.setAttribute(bo.getViewCriteriaAttributeName());
				criteriaItemA.setOperator(bo.getOperator());
				criteriaItemA.getValues().add(bo.getViewCriteriaAttributeValue());
				

				ViewCriteriaItem criteriaItemB= new ViewCriteriaItem();
				criteriaItemB.setConjunction(Conjunction.AND);
				criteriaItemB.setUpperCaseCompare(false);
				criteriaItemB.setAttribute(bo.getViewCriteriaAttributeName2());
				criteriaItemB.setOperator(bo.getOperator());
				criteriaItemB.getValues().add(bo.getViewCriteriaAttributeValue2());
				
				

				ViewCriteriaItem criteriaItemC = new ViewCriteriaItem();
				criteriaItemC.setConjunction(Conjunction.AND);
				criteriaItemC.setUpperCaseCompare(false);
				criteriaItemC.setAttribute(bo.getViewCriteriaAttributeNameInner());
				criteriaItemC.setOperator(bo.getOperator());
				criteriaItemC.getValues().add(bo.getViewCriteriaAttributeValueInner());
				
				ViewCriteriaRow viewCriteriaRowA = new ViewCriteriaRow();
				viewCriteriaRowA.setConjunction(Conjunction.AND);
				viewCriteriaRowA.setUpperCaseCompare(false);
				viewCriteriaRowA.getItems().add(criteriaItemA);
				
				ViewCriteriaRow viewCriteriaRowB = new ViewCriteriaRow();
				viewCriteriaRowB.setConjunction(Conjunction.AND);
				viewCriteriaRowB.setUpperCaseCompare(false);
				viewCriteriaRowB.getItems().add(criteriaItemB);
				
				
				ViewCriteriaRow viewCriteriaRowC = new ViewCriteriaRow();
				viewCriteriaRowC.setConjunction(Conjunction.AND);
				viewCriteriaRowC.setUpperCaseCompare(false);
				viewCriteriaRowC.getItems().add(criteriaItemC);
				
				ViewCriteria criteria = new ViewCriteria();
				criteria.setConjunction(Conjunction.AND);
				criteria.getGroups().add(viewCriteriaRowA);
				criteria.getGroups().add(viewCriteriaRowB);
				criteria.getGroups().add(viewCriteriaRowC);
				
				findCriteria.setFilter(criteria);
				findControl.setRetrieveAllTranslations(true);
				findCriteria.getFindAttributes().addAll(bo.getListOfAttribute());
				
				
			List<Object> out=service.findEntity(findCriteria, findControl,IConversionRateConstants.CURRENCYDAILYRATES_CUSTOM_OBJECT_NAME);
			 if(out!=null && out.size()>0){
				 return out.get(0);
			 }
			
			log.info("<<findContract");

		}catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}
			
	@Override
	public Object create(Object o) throws FusionException {
		if(o!=null){
			ConversionRate c = (ConversionRate) o;
			try {
				log.info(">>createCurrencyDailyRates");
				SalesCustomObjectService service = getService();
				CurrencyDailyRateC converionOSC = factory.createCurrencyDailyRateC();
				setConversionRateField(c,converionOSC);
				service.createEntity(converionOSC, IConversionRateConstants.CURRENCYDAILYRATES_CUSTOM_OBJECT_NAME);
				log.info("<<createCurrencyDailyRates");
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}
	
		

	@Override
	public Object update(Object o) throws FusionException {
		if(o!=null){
		ConversionRate c = (ConversionRate) o;
			try {
				log.info(">>updateCurrencyDailyRates");
				SalesCustomObjectService service = getService();
				CurrencyDailyRateC converionOSC = factory.createCurrencyDailyRateC();
				setConversionRateField(c,converionOSC);
				service.updateEntity(converionOSC,IConversionRateConstants.CURRENCYDAILYRATES_CUSTOM_OBJECT_NAME);
				log.info("<<updatedCurrencyDailyRates");
			} catch (Exception e) {
				throw new FusionException(e);
			}
		}
		return null;
	}
	
	private void setConversionRateField(ConversionRate cFromDb, CurrencyDailyRateC converionOSC) throws Exception {
		if(cFromDb!=null){
			try {
				/**
				 * These three field forms the primary key
				 */
				converionOSC.setFROMCURRENCYC(factory.createCurrencyDailyRateCFROMCURRENCYC(cFromDb.getFromCurrency()));
				converionOSC.setTOCURRENCYC(factory.createCurrencyDailyRateCTOCURRENCYC(cFromDb.getToCurrency()));
				converionOSC.setConversionDateC(factory.createCurrencyDailyRateCConversionDateC(DateUtils.getXMLGregorianCalendarByUtilDate(cFromDb.getConversionDate())));
				converionOSC.setConversionRatesC(factory.createCurrencyDailyRateCConversionRatesC(cFromDb.getConversionRate()));
				converionOSC.setRecordName("From "+cFromDb.getFromCurrency()+" To "+ cFromDb.getToCurrency()+" For " + cFromDb.getConversionDate());
					
				//TODO: MAPPING NOT SURE
				//converionOSC.setCurcyConvRateType(factory.createCurrencyDailyRateCCurcyConvRateType(c.getConversioType()));
				if(cFromDb.getOscId()!=null)converionOSC.setId(cFromDb.getOscId());
			} catch (Exception e) {
				log.error("Error occired while mapping EBS conversion Object to OSC conversion Object",e);
				throw e;
			}
		}
	}







	
			public SalesCustomObjectService getService() throws Exception{	
				SalesCustomObjectService_Service objectService_Service = new SalesCustomObjectService_Service();
				SecurityPoliciesFeature securityFeatures = new SecurityPoliciesFeature(new String[] { "oracle/wss_username_token_over_ssl_client_policy" });
				SalesCustomObjectService service = objectService_Service.getSalesCustomObjectServiceSoapHttpPort(securityFeatures);
				setWSBindingProvider(service,"https://caye-test.crm.us2.oraclecloud.com:443/opptyMgmtExtensibility/SalesCustomObjectService");
				return service;
			}


	
	}
