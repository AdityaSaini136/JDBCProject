package com.java.StudentList;

public class Students {
	private String firstName;
	private String lastName;
	private int age;
	private int Id;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	@Override
	public String toString() {
		return "Students [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", Id=" + Id + "]";
	}
	public Students(String firstName, String lastName, int age, int id) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		Id = id;
	}
	public Students() {
		// TODO Auto-generated constructor stub
	}
}
