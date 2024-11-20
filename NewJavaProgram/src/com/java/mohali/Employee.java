package com.java.mohali;

public class Employee {
   
	private String firstName;
	private String lastName;
	private String city;
	private int age;
	private int id;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", age=" + age
				+ ", Id=" + id + "]";
	}
	public Employee(String firstName, String lastName, String city, int age, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.age = age;
		this.id = id;
	}
	public Employee() {
		// TODO Auto-generated constructor stub
	}
}
