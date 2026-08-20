package com.zepto.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.zepto.order.response.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(OrderDoesNotExistsException.class)
	public ResponseEntity<ErrorResponse> handleOrderDoesNotExistsException(OrderDoesNotExistsException e) {
		ErrorResponse response = new ErrorResponse();

		response.setErrorCode("ER-001");
		response.setMessage(e.getMessage());

		e.printStackTrace();

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorResponse> handleException(Exception e) {
		ErrorResponse response = new ErrorResponse();

		response.setErrorCode("ER-001");
		response.setMessage(e.getMessage());

		e.printStackTrace();

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);

	}

}
