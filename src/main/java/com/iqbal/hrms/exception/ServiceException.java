package com.iqbal.hrms.exception;

@SuppressWarnings("serial")
public class ServiceException extends Exception{
	
	private String message;
	private Throwable cause;
	
	public ServiceException(String message, Throwable cause) {
		super();
		this.message = message;
		this.cause = cause;
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
