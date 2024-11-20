package com.hcl.buld.advanced;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[]args) {
		int year;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any Year:");
		year = scan.nextInt();
		scan.close();
		boolean  isLeap = false;
		if(year % 4 ==0){
			isLeap = true;}
		else
		{isLeap = false;}
		if (year% 100 ==0)
			{isLeap =true;}
		else
		{
			isLeap = false;
		}   	

		if (year % 400 == 0)
		{
			isLeap = true ;
		}
		else
		{
			isLeap = false;
		}

		if(isLeap==true)
			System.out.println(year + "is a leap year.");
		else
			System.out.print(year + "is not a leap year.");
	}
}
