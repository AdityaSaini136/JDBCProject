package com.hcl.buld.advanced;

import java.util.Scanner;

public class CalClient {
	public static void main(String[]args) {
		double calRessult=0.0;
		Calculator calculator = new Calculatorlmp();


		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the first value:= ");
		double a = scanner.nextDouble();

		System.out.println("enter the second value:= ");
		double b = scanner.nextDouble();


		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Divsion");

		System.out.println("Enter your choice");
		int choice = scanner.nextInt();
		if(choice==1) {
			calRessult = calculator.addDigits( a,b);
		}
		else if (choice==2) {
			calRessult = calculator.subDigits( a,b);

		}
		else if (choice==3) {
			calRessult = calculator.mulDigits( a,b);
		}
		else if (choice==4) {
			calRessult = calculator.divDigits( a,b);
		}
		{
			System.out.println("you have entered wrong value");
		}
		System.out.println("Calculatorlmp result :"+ calRessult);
	}



}