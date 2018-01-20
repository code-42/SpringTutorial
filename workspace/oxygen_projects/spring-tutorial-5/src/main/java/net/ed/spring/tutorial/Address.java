package net.ed.spring.tutorial;

public class Address {
	
	private String street;
	private String zipcode;
	
	// Default constructor
	public Address() {
	}	
	
	public Address(String street, String zipcode) {
		this.street = street;
		this.zipcode = zipcode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", zipcode=" + zipcode + "]";
	}
	
	public void init() {
		System.out.println("Address bean created on init()");
	}

	public void destroy() {
		System.out.println("Address bean destroyed on context.close()");
	}
	
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	

}
