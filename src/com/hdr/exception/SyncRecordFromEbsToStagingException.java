package com.hdr.exception;

import org.apache.log4j.Logger;

public class SyncRecordFromEbsToStagingException extends Exception {

	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(SyncRecordFromEbsToStagingException.class);

	public SyncRecordFromEbsToStagingException(Throwable cause) {
		super(cause);
	}

	public SyncRecordFromEbsToStagingException(String message) {
		super(message);
	}

	public SyncRecordFromEbsToStagingException(String message, Throwable cause) {
		super(message, cause);
	}

}
