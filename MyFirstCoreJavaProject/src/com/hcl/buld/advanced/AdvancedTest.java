package com.hcl.buld.advanced;

import java.util.Scanner;

public class AdvancedTest {
	public static void main(String[] args) {
		int num1,num2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println( "Enter first Number: ");
		num1= sc.nextInt();

		System.out.println( "Enter second number: ");
		num2 =sc.nextInt();
		sc.close();
		sum = num1+num2; 
		System.out.println(" Sum of these number: "+sum);



	}
}
