package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;





@SpringBootApplication
@ComponentScan("com")
@PropertySource("classpath:data.properties")
public class FirstBootAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(FirstBootAppApplication.class, args);
		HelloWorld h=ctx.getBean(HelloWorld.class);
		System.out.println(h.SayHello());
		
		Employee e=ctx.getBean(Employee.class);
		System.out.println(e.employeeDetails());
		
	}

}
