package com.hdr.exception;

import org.apache.log4j.Logger;

public class FusionWSBeanCreationException extends Exception {

	private static final long serialVersionUID = 1L;

	private static final Logger log = Logger.getLogger(FusionWSBeanCreationException.class);

	public FusionWSBeanCreationException(Throwable cause) {
		super(cause);
	}

	public FusionWSBeanCreationException(String message) {
		super(message);
	}

	public FusionWSBeanCreationException(String message, Throwable cause) {
		super(message, cause);
	}

}
