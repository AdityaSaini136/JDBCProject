package com.hcl.buld.basic.OOPS;

public class Person extends Person2ClientCode {
	private String name;
	private String surname;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String address;
	private int id;
	public Person(String name, String surname, String address, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.id = id;
	}
//	public Person() {
//		System.out.println("Person default constructor called...");
//	}
	public Person(String name,String surname) {
		System.out.println("Person paramterized constructor called...");
		this.name = name;
		this.surname = surname;
	}
	public String getMessage() {
		return "Person [name=" + name + ", surname=" + surname + ", address=" + address 
				+ ", id=" + id + "]";
	}
}
