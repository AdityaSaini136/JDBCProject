package com.hcl.buld.basic.OOPS;

import java.util.Arrays;

public class Person2 extends Person {

	public Person2(String name, String surname) {
		super(name, surname);
		// TODO Auto-generated constructor stub
	}
	private String Coursename;
	private String subjects[];
	private double marks[];
	public String getCoursename() {
		return Coursename;
	}
	public void setCoursename(String coursename) {
		Coursename = coursename;
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
	@Override
	public String toString() {
		return "Person2 [Coursename=" + Coursename + ", subjects=" + Arrays.toString(subjects) + ", marks="
				+ Arrays.toString(marks) + "]"+super.toString();
	}
	
}