package com.java.mohali;

import java.util.Scanner;

public class DaysProgramm { 
	public static void main(String[] args) {
		Scanner scrn = new Scanner(System.in);
		while(true) {
			printMenu();// method call
			int choice = scrn.nextInt();
			switch(choice) {
			case 1: 
				System.out.println("Monday");
				break;
			case 2: 
				System.out.println("Tuesday");
				break;
			case 3: 
				System.out.println("Wednesday");
				break;
			case 4: 
				System.out.println("Thrusday");
				break;
			case 5: 
				System.out.println("Friday");
				break;
			case 6: 
				System.out.println("Saturday");
				break;
			case 7: 
				System.out.println("Sunday");
				break;
			case 8: 
				System.out.println("Quiting....");
				System.exit(0);
				
			default:
				System.out.println("Plese Select Between 1 to 8 number Only");
			}
		}
	}
	// merhod definition/body
	private static void printMenu() {
		System.out.println("Press 1 to print Monday :");
		System.out.println("Press 2 to print Tuesday :");
		System.out.println("Press 3 to print Wed : ");
		System.out.println("Press 4 to print Thu : ");
		System.out.println("Press 5 to print Fri : ");
		System.out.println("Press 6 to print Sat : ");
		System.out.println("Press 7 to print Sun : ");
		System.out.println("Press 8 to Exit/Quit : ");
	}
}
