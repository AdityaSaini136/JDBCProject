package com.hcl.buld.basic;

import java.util.Scanner;

public class Addnumber {
	public static void main(String[] args) {
		/*
		 * float num1 = 1.1234567f; float num2 =6.6456657f; int num3 = 10; int num4 =
		 * 20; float sum = (num1+num2+num3+num4);
		 * System.out.println("sum of these number: "+sum);
		 */
		/*
		 * Scanner scnr = new Scanner(System.in); //int nextInt = scnr.nextInt();
		 * System.out.println(" enter the first number.. "); int num1 , num2 ,sum; num1
		 * = scnr.nextInt(); num2 = scnr.nextInt(); sum = num1+num2;
		 * System.out.println(sum);
		 */
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("enter the first number"); //int nextInt = sc.nextInt();
		 * int num1 , num2 ; num1 =sc.nextInt();
		 * System.out.println("enter the second number"); num2 = sc.nextInt(); int sum =
		 * num1+num2; System.out.println("result.. "+sum);
		 */
		Scanner sc = new Scanner(System.in);
		int num1 , num2, sum;
		System.out.println("enter the first number.......");
		num1 = sc.nextInt();
		System.out.println("enter the second number....");
		num2 = sc.nextInt();
		sum = num1+num2;
		System.out.println("result.." +sum);
	}
}
