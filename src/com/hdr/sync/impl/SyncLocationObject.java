package com.hdr.sync.impl;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hdr.sync.SyncObject;

@Repository("syncLocationObject")
@Service
public class SyncLocationObject implements SyncObject {

	@Override
	public void syncObject() throws Exception {
		System.out.println("Hi I am from Location");
	}

}
