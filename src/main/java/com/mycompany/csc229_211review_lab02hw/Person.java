package com.mycompany.csc229_211review_lab02hw;

public abstract class Person {
    
	//declaring  varibles name, address, and age
	private String name;
	private String address;
	private short age;
	
	// constructor that takes only two parameters
	public Person(String name, short age) {
            	// super is used to call the constructor of the parent class
		super();
		this.name = name;
		this.age = age;
	}
	//getter method for name
	public String getName() {
		return name;
	}
	//setter method for name
	public void setName(String name) {
		this.name = name;
	}
	// Abstract method for address
	public abstract String getAddress() ;
        
	// Abstract method for address
	public abstract void setAddress(String address);
	
	// Getter method for age
	public short getAge() {
		return age;
	}
	// Setter method for age
	public void setAge(short age) {
		this.age = age;
	}
	
}
