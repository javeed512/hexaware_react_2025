package com.hexaware.exceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
		
				@ExceptionHandler(ArithmeticException.class)
				@ResponseStatus(reason = "zero divide exception occur" , code = HttpStatus.BAD_REQUEST)
				public void  handler() {
					
					
					  
					
					
				}
	

}
