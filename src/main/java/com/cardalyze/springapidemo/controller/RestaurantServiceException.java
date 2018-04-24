package com.cardalyze.springapidemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class RestaurantServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RestaurantServiceException() {
		super();
	}

	public RestaurantServiceException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public RestaurantServiceException(String message, Throwable cause) {
		super(message, cause);
	}

	public RestaurantServiceException(String message) {
		super(message);
	}

	public RestaurantServiceException(Throwable cause) {
		super(cause);
	}
	
	

}
