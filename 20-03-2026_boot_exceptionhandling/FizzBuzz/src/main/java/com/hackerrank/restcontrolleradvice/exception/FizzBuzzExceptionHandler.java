package com.hackerrank.restcontrolleradvice.exception;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cg.dto.ErrorDTO;
import com.cg.exception.EmployeNotFoundException;
import com.hackerrank.restcontrolleradvice.dto.BuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzBuzzException;
import com.hackerrank.restcontrolleradvice.dto.FizzBuzzResponse;
import com.hackerrank.restcontrolleradvice.dto.FizzException;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class FizzBuzzExceptionHandler extends ResponseEntityExceptionHandler {

	// TODO:: implement handler methods for FizzException, BuzzException and
	// FizzBuzzException

	@ExceptionHandler(FizzException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public FizzBuzzResponse handleFizzException(FizzException ex) {

		FizzBuzzResponse response = new FizzBuzzResponse("Fizz Exception has been thrown", 500);
		response.setErrorReason("Internal Server Error");
		return response;
	}

	@ExceptionHandler(BuzzException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public FizzBuzzResponse handleBuzzException(BuzzException ex) {

		FizzBuzzResponse response = new FizzBuzzResponse("Buzz Exception has been thrown", 400);
		response.setErrorReason("Bad Request");
		return response;
	}

	@ExceptionHandler(FizzBuzzException.class)
	@ResponseStatus(HttpStatus.INSUFFICIENT_STORAGE)
	public FizzBuzzResponse handleFizzBuzzException(FizzBuzzException ex) {

		FizzBuzzResponse response = new FizzBuzzResponse("FizzBuzz Exception has been thrown", 507);
		response.setErrorReason("Insufficient Storage");
		return response;
	}
}
