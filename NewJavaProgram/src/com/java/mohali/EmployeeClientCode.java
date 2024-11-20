package com.java.mohali;
//Employee Data Collection..........
import java.util.Scanner;

public class EmployeeClientCode {
  public static void main(String[] args) {
	  Employee emp = new Employee();
	  emp.getFirstName();
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter The firstName");
	  String firstName = sc.next();
	  System.out.println("Enter The lastName");
	  String lastName = sc.next();
	  System.out.println("Enter The City");
	  String City = sc.next();
	  System.out.println("Enter The Age");
	  int Age = sc.nextInt();
	  System.out.println("Enter The I'd");
	  int Id = sc.nextInt();
	  Employee emp2 = new Employee(firstName,lastName,City,Age,Id);
	  System.out.println(emp2);
  }
}