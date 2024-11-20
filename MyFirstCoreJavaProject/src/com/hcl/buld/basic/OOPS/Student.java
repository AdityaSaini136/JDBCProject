package com.hcl.buld.basic.OOPS;

import java.util.Arrays;

public class Student {
	private String name;
	private String surname;
	private String Coursename;
	private String subjects[];
	private double marks[];

	public String getCoursename() {
		return Coursename;
	}
	public void setCoursename(String coursename) {
		this.Coursename = coursename;
	}
	public String[] getSubjects() {
		return subjects;
	}
	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}
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
	public Student(String name, String surname, String address, int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.id = id;
	}
	public Student() {
	}
	public Student(String[] subjects, double[] marks, String address) {
		super();
		this.subjects = subjects;
		this.marks = marks;
		setAddress(address);
		
	}
	public Student(String name, String surname, String coursename, String[] subjects,
			double[] marks, String address,
			int id) {
		super();
		this.name = name;
		this.surname = surname;
		this.Coursename = coursename;
		this.subjects = subjects;
		this.marks = marks;
		this.address = address;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", Coursename=" + Coursename + ", subjects="
				+ Arrays.toString(subjects) + ", marks=" + Arrays.toString(marks) + ", address=" + address + ", id="
				+ id + "]";
	}
	
}
