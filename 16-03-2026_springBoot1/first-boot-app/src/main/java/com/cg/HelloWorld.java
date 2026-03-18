package com.cg;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
	public HelloWorld() {
		// TODO Auto-generated constructor stub
		System.out.println("Hello world");
	}
	
	public String SayHello() {
		return "Hello";
	}
}
