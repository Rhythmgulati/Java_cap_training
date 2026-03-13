package com.bg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bg.beans.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext ctx  = new ClassPathXmlApplicationContext("bean.xml");
		Employee e=(Employee) ctx.getBean("employee");
		System.out.println(e.employeeDetails());
	}
}
