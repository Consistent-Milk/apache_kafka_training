package com.project.springbootproject.error;

public class DepartmentNotFoundException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5380585205790000014L;

	public DepartmentNotFoundException() {
		super();
	}
	
	public DepartmentNotFoundException(String message) {
		super(message);
	}
	
	public DepartmentNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public DepartmentNotFoundException(Throwable cause) {
		super(cause);
	}
	
	protected DepartmentNotFoundException(String message, Throwable cause, boolean enableSuppresion, boolean writableStackTrace) {
		super(message, cause, enableSuppresion, writableStackTrace);
	}
}
