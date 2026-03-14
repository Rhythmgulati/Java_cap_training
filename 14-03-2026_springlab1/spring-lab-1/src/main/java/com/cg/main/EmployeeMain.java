package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Employee;

public class EmployeeMain {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		Employee e=(Employee)ctx.getBean("employee");
		Employee e1=(Employee)ctx.getBean("employee1");
		System.out.println(e.getDetails());
		System.out.println(e.getSBUDetails());
		System.out.println(e1.getDetails());
		System.out.println(e1.getSBUDetails());
//		System.out.println(e.);
	}
}
