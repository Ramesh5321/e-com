package com.app.LoginRegistration2.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
	private String resName;
	private String fieldName;
	private String fieldValue;
	public ResourceNotFoundException(String resName, String fieldName, String fieldValue) {
		super();
		this.resName = resName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	public ResourceNotFoundException(String resName2, String fieldName2, Long id) {
		// TODO Auto-generated constructor stub
	}
	public String getResName() {
		return resName;
	}
	public String getFieldName() {
		return fieldName;
	}
	public String getFieldValue() {
		return fieldValue;
	}
	

}
