package com.hdr.exception;

import org.apache.log4j.Logger;

public class SyncRecordFromDbToOscException extends Exception {

	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(SyncRecordFromDbToOscException.class);

	public SyncRecordFromDbToOscException(Throwable cause) {
		super(cause);
	}

	public SyncRecordFromDbToOscException(String message) {
		super(message);
	}

	public SyncRecordFromDbToOscException(String message, Throwable cause) {
		super(message, cause);
	}

}
