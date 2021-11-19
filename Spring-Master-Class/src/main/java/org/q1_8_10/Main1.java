package org.q1_8_10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {

//	private static ApplicationContext context;
	public static void main(String[] args) {
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("details.xml");
		context.registerShutdownHook();
		
		Customer customer=(Customer) context.getBean("customer");
		customer.draw();
		

	}
}
