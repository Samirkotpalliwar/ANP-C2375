package com.anudip.jpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{
	

	@ExceptionHandler(UserNotFoundException.class)
	public ResponseEntity<ErrorMessage> handlePassengerException
	(UserNotFoundException ex, WebRequest request) {
	ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleBookingException
	(ProductNotFoundException ex, WebRequest request) {
	ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	@ExceptionHandler(MyCartNotFoundException.class)
	public ResponseEntity<ErrorMessage> handlePassengerException
	(MyCartNotFoundException ex, WebRequest request) {
	ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
	
	@ExceptionHandler(CartItemNotFoundException.class)
	public ResponseEntity<ErrorMessage> handleBookingException
	(CartItemNotFoundException ex, WebRequest request) {
	ErrorMessage em = new ErrorMessage(HttpStatus.NOT_FOUND, ex.getMessage());	
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(em);
	}
}
