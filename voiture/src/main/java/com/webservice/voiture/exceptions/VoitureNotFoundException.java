package com.webservice.voiture.exceptions;

public class VoitureNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	public VoitureNotFoundException() {
		super("CAR_NOT_FOUND_EXCEPTION");
	}

	public VoitureNotFoundException(String message) {
		super(message);
	}

	public VoitureNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public VoitureNotFoundException(Throwable cause) {
		super(cause);
	}

	public VoitureNotFoundException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
