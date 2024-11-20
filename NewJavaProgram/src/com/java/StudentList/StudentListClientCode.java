package com.java.StudentList;

import java.util.ArrayList;
import java.util.Scanner;
public class StudentListClientCode {
	private static ArrayList<Students> students =new  ArrayList<>();
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		while(true) {
			showMenu();
			String userChoice = kbd.nextLine();
			boolean isValid = isValidChoice(userChoice);
			while(!isValid) {
				System.out.println("Invalid Choice, Please choose from below options: ");
				showMenu();
				userChoice = kbd.nextLine();
				isValid = isValidChoice(userChoice);
			}
			switch (userChoice) {
			case "1":
				addStudent(kbd);
				break;
			case "2":
				removeStudent(kbd);
				break;
			case "3":
				sortByFirstName();
				break;
			case "4":
				sortByLastName();
				break;
			case "5":
				showAllStudent();
				break;
			case "6":
				showOnlyAdults();
				break;
			case "7":
				System.exit(0);
			default:
				break;
			}
			//System.out.println("this time is was a valid choice");
		}
		//kbd.close();
	}
	private static void showOnlyAdults() {
		for (Students student : students) {
			if(student.getId()<18 ) {
				System.out.println(student);	
			}
		}
	}
	private static void sortByLastName() {
		System.out.println("sortByLastName");
		students.sort(new  ArrayListLastName());
	} 
	private static void sortByFirstName() {
		System.out.println("sortByFirstName");
		students.sort(new  ArrayListFirstName());
	}
	private static void showAllStudent() {
		System.out.println("Dispalying all student-----");
		for (Students students2 : students) {
			System.out.println(students2);
		}
		// iterate students list and print each student 
	}
	private static void removeStudent(Scanner keyboard) {
		System.out.println("Removing student---");
		System.out.println("Enter student id: ");
		int id = Integer.parseInt( keyboard.nextLine());
		for (Students student : students) {
			if(student.getId() == id) {
				students.remove(student);
				System.out.println("Student Removed Successfully!");
				return;
			}
		}
	}
	//System.out.println("Unable to remove Student!");
	private static void addStudent(Scanner keyboard) {
		System.out.println("Adding student------");
		Students stuData = new Students();
		System.out.println("Enter FirstName...");
		String userfirstName = keyboard.nextLine();
		System.out.println("Enter SecondName..");
		String userlastName = keyboard.nextLine();
		System.out.println("Enter Student ID: ");
		int userId = keyboard.nextInt();
		System.out.println("Enter Student Age: ");
		int userAge = keyboard.nextInt();
		keyboard.nextLine();
		stuData.setAge(userAge);
		stuData.setFirstName(userfirstName);
		stuData.setId(userId);
		stuData.setLastName(userlastName);
		//ASk for data for student, like id, name etc and validate
		// create Student object with the above data
		// add that object into students list
		students.add(stuData);
		System.out.println("Student added successfully");
	}
	public static void showMenu() {
		System.out.println("Select any one of the following : ");
		System.out.println("1. Add Student : ");
		System.out.println("2. Remove Student : ");
		System.out.println("3. Sort Student by first name : ");
		System.out.println("4. Sort Student by last name : ");
		System.out.println("5. Print all students : ");
		System.out.println("6. Print all adults : ");
		System.out.println("7. Exit : ");
	}
	public static boolean isValidChoice(String userChoice) {
		try {
			int choice = Integer.parseInt(userChoice);
			if(choice<=7 && choice>=1) {
				return true;
			}
		} catch (NumberFormatException e) {
			return false;
		}
		return false;
	}
}
