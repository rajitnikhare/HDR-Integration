package com.hdr.exception;

import org.apache.log4j.Logger;

public class ObjectMappingException extends Exception {

	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(ObjectMappingException.class);

	public ObjectMappingException(Throwable cause) {
		super(cause);
	}

	public ObjectMappingException(String message) {
		super(message);
	}

	public ObjectMappingException(String message, Throwable cause) {
		super(message, cause);
	}

}
