package org.q6;

import org.q1_8_10.Customer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@ComponentScan
// 
@PropertySource("classpath:app.properties")
public class Main6 {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				Main6.class)) {

			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			System.out.println(service.returnServiceURL());
		}
		
	}
}
