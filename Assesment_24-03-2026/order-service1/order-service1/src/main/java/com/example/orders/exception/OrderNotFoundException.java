package com.example.orders.exception;

public class OrderNotFoundException extends RuntimeException {

	public OrderNotFoundException() {
		super();
	}

	public OrderNotFoundException(String msg) {
		super(msg);
	}
}
