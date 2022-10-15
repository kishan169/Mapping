package com.example.demo.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<MyErrorDetails> employeeExceptionhandler(EmployeeException ee, WebRequest req){
		MyErrorDetails err= new MyErrorDetails(LocalDate.now(), ee.getMessage(), req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	
	@ExceptionHandler(TaskException.class)
	public ResponseEntity<MyErrorDetails> taskExceptionhandler(TaskException ee, WebRequest req){
		MyErrorDetails err= new MyErrorDetails(LocalDate.now(), ee.getMessage(), req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptionhandler(Exception ee, WebRequest req){
		MyErrorDetails err= new MyErrorDetails(LocalDate.now(), ee.getMessage(), req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.BAD_REQUEST);
	}
	
	
	
}
