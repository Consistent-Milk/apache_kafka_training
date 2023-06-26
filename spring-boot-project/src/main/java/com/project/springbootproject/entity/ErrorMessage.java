package com.project.springbootproject.entity;

import org.springframework.http.HttpStatus;

public class ErrorMessage {

	private HttpStatus status;
	private String message;

	public ErrorMessage() {
	}

	public ErrorMessage(HttpStatus status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ErrorMessage [status=" + status + ", message=" + message + "]";
	}

}
