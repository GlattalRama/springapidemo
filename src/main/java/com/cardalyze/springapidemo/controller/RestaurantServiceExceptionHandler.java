package com.cardalyze.springapidemo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestaurantServiceExceptionHandler {
	
	@ExceptionHandler(RestaurantServiceException.class) public ResponseEntity<ErrorResponse> handleServiceException(RestaurantServiceException e) throws Exception
	{
		ErrorResponse eR = new ErrorResponse();
		eR.setCode(HttpStatus.BAD_REQUEST.value());
		eR.setMessage(e.getMessage());
		return new ResponseEntity<ErrorResponse>(eR, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(RuntimeException.class) public ResponseEntity<ErrorResponse> handleGeneralException(RuntimeException e) throws Exception
	{
		ErrorResponse eR = new ErrorResponse();
		eR.setCode(HttpStatus.SERVICE_UNAVAILABLE.value());
		eR.setMessage(e.getMessage());
		return new ResponseEntity<ErrorResponse>(eR, HttpStatus.SERVICE_UNAVAILABLE);
	}

}
