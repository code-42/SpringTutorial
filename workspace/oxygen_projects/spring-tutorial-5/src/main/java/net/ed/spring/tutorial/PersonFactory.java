package net.ed.spring.tutorial;

public class PersonFactory {
	
	public Person createPerson(int id, String name) {
		System.out.println("Using PersonFactory to create new person " + name + " " + id);
		return new Person(id, name);
	}

}
