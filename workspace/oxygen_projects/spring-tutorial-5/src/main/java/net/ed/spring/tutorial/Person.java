package net.ed.spring.tutorial;

public class Person {
	
	private int id;
	private String name;
	private Address address;
		
	public Person() {
	}

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public void setAddress(Address address) {
		this.address = address;
	}

	
	public Address getAddress() {
		return address;
	}

	public void speak() {
		System.out.println("Hello I'm a default constructor person!");
		
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}


}
