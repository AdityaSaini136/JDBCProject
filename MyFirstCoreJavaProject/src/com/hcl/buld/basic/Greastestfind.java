package com.hcl.buld.basic;

import java.util.Scanner;

public class Greastestfind {
	public static void main(String[] args) {
		
//		Scanner Scanner = new Scanner(System.in);
//		System.out.println("enter the first number" ); 
//		int a = Scanner.nextInt();
//		System.out.println("enter the second number" );
//		 int b = Scanner.nextInt();
//		System.out.println("enter the third number"); 
//		int c = Scanner. nextInt();
//		 if	(a>b && a>c ) 
//		{ System.out.println("a");
//		 }else if (b>c) {
//		System.out.println("b"); 
//		}else { System.out.println("c");
//		 }
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number....");
		int num1, num2 , num3, result;
		num1 = sc.nextInt();
		System.out.println("enter the second number....");
		num2 = sc.nextInt();
		System.out.println("enter the third number...");
        num3 = sc.nextInt();
        if
        (num1>num2 && num1>num3)
        { System.out.println("num1 is biggest");
        }
        else if (num2>num3) {
        	System.out.println("num2 is biggest");
        }else {
        	System.out.println("num3 is biggest");
        }
	}
}

