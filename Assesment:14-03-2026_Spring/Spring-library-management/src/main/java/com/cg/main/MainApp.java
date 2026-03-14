package com.cg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.bean.Librarian;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext ctx= new  ClassPathXmlApplicationContext("bean.xml");
		Librarian lib=(Librarian) ctx.getBean("librarian");
		System.out.println(lib.issueBook());
	}
}
