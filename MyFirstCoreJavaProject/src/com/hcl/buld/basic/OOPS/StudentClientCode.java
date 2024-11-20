package com.hcl.buld.basic.OOPS;

public class StudentClientCode {
	public static void main(String[] args) {
		//Student student = new Student("RAjnish","Saini", "Poly", args, 0.0, "Askot", 10);
		Student student = new Student("Rajnish","Saini","Askot", 110);
		student.setSubjects(new String[]{"Java","Python","HTML"});
		student.setMarks(new double[] {60,79,89});
		student.setCoursename("B.tech");
		System.out.println(student);
		
	}
}
