package com.hdr.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.hdr.util.Constants;
import com.hdr.util.PropFileUtil;
import com.hdr.util.SOAPLoggingHandler;


@Service
public abstract class AbstractFCRMODWebService implements FCRMODWebService {
	
	private static final Logger log = Logger.getLogger(AbstractFCRMODWebService.class);

	@Override
	public void setWSBindingProvider(Object publicService, String endPointAddress) {
		 
		 BindingProvider wsbp = (BindingProvider)publicService;
	     Map<String, Object> reqContext = ((BindingProvider) wsbp).getRequestContext();
	     reqContext.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, endPointAddress);
	     reqContext.put(BindingProvider.USERNAME_PROPERTY, PropFileUtil.getValue(Constants.FCRMOD_USERNAME));
	     reqContext.put(BindingProvider.PASSWORD_PROPERTY, PropFileUtil.getValue(Constants.FCRMOD_PASSWORD));
	    // reqContext.put(BindingProviderProperties.REQUEST_TIMEOUT, 1000);
	     //reqContext.put(BindingProviderProperties.CONNECT_TIMEOUT, 1000);
	     //int connectTimeout = 4000;
	    // reqContext.put( com.sun.xml.ws.developer.JAXWSProperties.CONNECT_TIMEOUT, connectTimeout );
	  // setReadTimeout()
	    // int readTimeout = 1000;
	  	//reqContext.put( "com.sun.xml.ws.request.timeout", readTimeout );
	     //reqContext.put("com.sun.xml.ws.connect.timeout", 1000);
	     //reqContext.put("com.sun.xml.ws.request.timeout", 1000);
	     //reqContext.put("javax.xml.ws.client.connectionTimeout", 100000);
	     //reqContext.put("javax.xml.ws.client.receiveTimeout", 100);
	     
	    /**
	     * This is for SOAP Logging
	     */
	     List handlerList = wsbp.getBinding().getHandlerChain();
		 if (handlerList == null)
			handlerList = new ArrayList();
			SOAPLoggingHandler loggingHandler = new SOAPLoggingHandler();
			handlerList.add(loggingHandler);
			wsbp.getBinding().setHandlerChain(handlerList);
	     
	     
	}
	

}
