package com.springboot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName;
	private String fildName;
	private Object fildValue;
	
	public ResourceNotFoundException(String resourceName, String fildName, Object fildValue) {
		super(String.format("%s not found with %s : %s",resourceName,fildName,fildValue));
		this.resourceName = resourceName;
		this.fildName = fildName;
		this.fildValue = fildValue;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	
	
	public String getFildName() {
		return fildName;
	}
	
	public Object getFildValue() {
		return fildValue;
	}
	

}
