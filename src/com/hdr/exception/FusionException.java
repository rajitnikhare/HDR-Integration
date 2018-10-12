package com.hdr.exception;

import org.apache.log4j.Logger;

public class FusionException extends Exception {

	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(FusionException.class);

	public FusionException(Throwable cause) {
		super(cause);
	}

	public FusionException(String message) {
		super(message);
	}

	public FusionException(String message, Throwable cause) {
		super(message, cause);
	}

}
