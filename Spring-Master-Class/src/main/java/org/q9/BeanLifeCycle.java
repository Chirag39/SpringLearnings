package org.q9;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String args[]) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("points.xml");
		context.registerShutdownHook();
		TrianglesPoint triangle=(TrianglesPoint) context.getBean("triangle");
		triangle.draw();
	}
}
