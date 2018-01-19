package net.ed.spring.tutorial;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		// Spring bean container
		ApplicationContext context = new FileSystemXmlApplicationContext("beans.xml");

		Person person = (Person)context.getBean("person");
		person.speak();
	}

}
