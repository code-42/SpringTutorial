package net.ed.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// Spring bean container
		// Change FileSystemXmlApplicationContext to ClassPathXmlApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("net/ed/spring/tutorial/beans/beans.xml");

		Person person1 = (Person)context.getBean("person1");
		person1.setId(1);
		person1.setName("Ed1");
		Address address = new Address();
		address.setStreet("1 Main St");
		address.setZipcode("90210");
		person1.setAddress(address);
		System.out.println("Hello, my name is " + person1.getName() +
				" and my address is " + person1.getAddress().getStreet() + " " + 
				person1.getAddress().getZipcode() +
				" and I was created with PoJo constructor");
		
		Person person2 = (Person)context.getBean("person2");
		person2.setId(2);
		person2.setName("Edd2");
		Address address2 = new Address();
		address2.setStreet("2 Main St");
		address2.setZipcode("90222");
		person2.setAddress(address2);
		
		System.out.println("Hello, my name is " + person2.getName() +
				" and my address is " + person2.getAddress().getStreet() + " " + 
				person2.getAddress().getZipcode() +
				" and I was created with PoJo constructor");
		
		// Prevents resource leaks
		((ClassPathXmlApplicationContext)context).close();
		
		
	}

}
