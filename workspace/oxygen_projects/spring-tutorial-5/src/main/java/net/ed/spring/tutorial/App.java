package net.ed.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// Spring bean container
		// Change FileSystemXmlApplicationContext to ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("net/ed/spring/tutorial/beans/beans.xml");

		Person person = (Person)context.getBean("person");
		person.speak();
		
		// Prevents resource leaks
		((ClassPathXmlApplicationContext)context).close();
	}

}
