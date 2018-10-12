package com.hdr.util;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class FCRMODWSProcessorMap {
	
	private Map<String, String> wsProcessorMap;

	public Map<String, String> getWsProcessorMap() {
		return wsProcessorMap;
	}

	public void setWsProcessorMap(Map<String, String> wsProcessorMap) {
		this.wsProcessorMap = wsProcessorMap;
	}
	
	public String getWSProcessor(String objectName) {
		return wsProcessorMap.get(objectName);
	}
	
	public String toString() {
		return "WS Processor Map : " + wsProcessorMap.toString();
	}

}
