package com.example.orders.exception;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(OrderNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleOrderNotFound(OrderNotFoundException ex) {

		Map<String, Object> response = new HashMap<>();
		response.put("timestamp", LocalDate.now());
		response.put("message", ex.getMessage());
		response.put("status", HttpStatus.NOT_FOUND.value());

		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<Map<String, Object>> handleValidation(MethodArgumentNotValidException ex) {

		List<String> errors = new ArrayList<>();

		ex.getBindingResult().getFieldErrors().forEach(error -> {
			errors.add(error.getDefaultMessage());
		});

		Map<String, Object> response = new HashMap<>();
		response.put("timestamp", LocalDate.now());
		response.put("errors", errors);

		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

}
