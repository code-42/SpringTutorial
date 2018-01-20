package net.ed.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// Spring bean container
		// Change FileSystemXmlApplicationContext to ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("net/ed/spring/tutorial/beans/beans.xml");

		Person person = (Person)context.getBean("person");
		person.setId(1);
		person.setName("Ed");
		Address address = new Address();
		address.setStreet("1 Main St");
		address.setZipcode("90210");
		person.setAddress(address);
		
		System.out.println("Hello, my name is " + person.getName() +
				" and my address is " + person.getAddress().getStreet() + " " + 
				person.getAddress().getZipcode());
		
		// Prevents resource leaks
		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
