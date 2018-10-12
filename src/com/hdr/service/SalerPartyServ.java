package com.hdr.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.serene.pdms.ws.stubs.company.SalesParty;

@Service
public interface SalerPartyServ {
	public List<SalesParty> find(Object o) throws Exception;
}
