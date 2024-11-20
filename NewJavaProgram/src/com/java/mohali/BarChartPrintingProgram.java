package com.java.mohali;
import java.util.Scanner;
public class BarChartPrintingProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number (1-30)...! ");
		int userInp = sc.nextInt();
		System.out.println("Enter The Number (1-30)...! ");
		int userInp1 = sc.nextInt();
		System.out.println("Enter The Number (1-30)...! ");
		int userInp2 = sc.nextInt();
		System.out.println("Enter The Number(1-30)...! ");
		int userInp3 = sc.nextInt();
		System.out.println("Enter The Number(1-30)...! ");
		int userInp4 = sc.nextInt();
		for(int i=1;i<=userInp; i++) {
			System.out.print("*");
		}System.out.println();
		for(int i=1;i<=userInp1; i++) {
			System.out.print("*");
		}System.out.println();
		for(int i=1;i<=userInp2; i++) {
			System.out.print("*");
		}System.out.println();
		for(int i=1;i<=userInp3; i++) {
			System.out.print("*");
		}System.out.println();
		for(int i=1;i<=userInp4; i++) {
			System.out.print("*");
		}
	}
}
//int num1, num2, num3,num4, num5;
//Scanner input = new Scanner(System.in);
//while(true) {
//System.out.println("Enter an integer (1-30): ");
//num1 = input.nextInt();
//boolean isValid = isValidChoice(num1);
//while(!isValid) {
//	System.out.println("Invalid Choice, Please choose from below options (1-30): ");
//	num1 = input.nextInt();
//	isValid = isValidChoice(num1);
//}
//while(true) {
//	System.out.println("Enter an integer (1-30): ");
//	num2 = input.nextInt();
//	boolean isValid1 = isValidChoice(num2);
//	while(!isValid1) {
//		System.out.println("Invalid Choice, Please choose from below options (1-30): ");
//		num2 = input.nextInt();
//		isValid = isValidChoice(num2);
//	}
////System.out.println("Enter an integer (1-30):");
////num2= input.nextInt();
//System.out.println("Enter an integer (1-30):");
//num3= input.nextInt();
//System.out.println("Enter an integer (1-30):");
//num4= input.nextInt();
//System.out.println("Enter an integer (1-30):");
//num5= input.nextInt();
//for(int j=1;j<=num1; j++){
// System.out.print("*");
//}
//System.out.println();
//for(int j=1;j<=num2; j++)
//{
//	System.out.print("*");
//}
//System.out.println();
//for(int j=1;j<=num3; j++)
//{
//	System.out.print("*");
//}
//System.out.println();
//for(int j=1;j<=num4; j++)
//{
//	System.out.print("*");
//}
//System.out.println();
//for(int j=1;j<=num5; j++)
//{
//	System.out.print("*");
//}break;
//} 
//}
//}
//private static boolean isValidChoice(int num1) {
//int choice = num1;
//if(choice <= 30 && choice >= 1) {
//	return true;
//}
//int num2 = 0;
//int choice2 = num2;
//if(choice2 <= 30 && choice2 >= 1) {
//	return true;
//}
//return false;
