package com.bg.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bg.beans.HelloWorld;

public class Main {	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("bean.xml");
		HelloWorld h=(HelloWorld) ctx.getBean("hello");
//		HelloWorld g=(HelloWorld) ctx.getBean("hello");
//		h.setName("rag");
		System.out.println(h.sayHello());
		System.out.println(h.getLanguage());
//		System.out.println(g.sayHello("aarav"));
//		System.out.println(h==g);
		
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
