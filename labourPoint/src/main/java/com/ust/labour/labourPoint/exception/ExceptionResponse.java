package com.ust.labour.labourPoint.exception;

import java.time.LocalDateTime;

public class ExceptionResponse {
	
	private LocalDateTime timestamp;
	private String message;
	private String description;
	
	public ExceptionResponse() {
		
	}
	
	public ExceptionResponse(LocalDateTime timestamp, String message, String description) {
		this.timestamp = timestamp;
		this.message = message;
		this.description = description;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
