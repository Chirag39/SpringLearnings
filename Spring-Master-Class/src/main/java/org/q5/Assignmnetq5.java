package org.q5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Assignmnetq5 {

	public static void main(String[] args) {


		ApplicationContext context=new ClassPathXmlApplicationContext("spring5.xml");
		Customer customer=(Customer) context.getBean("customer");
		
		//customer.toString();
		System.out.println("Customer Deatils:");
		customer.getDetails();
	}
}
