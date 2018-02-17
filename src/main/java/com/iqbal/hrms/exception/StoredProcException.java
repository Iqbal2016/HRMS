package com.iqbal.hrms.exception;


@SuppressWarnings("serial")
public class StoredProcException extends Exception{
	
	private String message;
	private Throwable cause;
	
	public StoredProcException(String message, Throwable cause) {
		super(message,cause);
		this.setMessage(message);
		this.setCause(cause);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Throwable getCause() {
		return cause;
	}

	public void setCause(Throwable cause) {
		this.cause = cause;
	}
	
	
}
