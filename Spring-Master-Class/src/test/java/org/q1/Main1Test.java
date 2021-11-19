package org.q1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.q1_8_10.Customer;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main1Test {

	@Test
	public void test() {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("details.xml");
		context.registerShutdownHook();
		
		Customer customer=(Customer) context.getBean("customer");
		
		String expected="Name:Chirag id:01 Contact:987654321 Street:CH-road City:Mumbai State:Maharashtra Zipcode:400002 Country:India";
		
		assertEquals(expected,customer.testAddress());
	}

}
