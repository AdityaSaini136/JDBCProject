package com.java.mohali;

import java.sql.Array;
import java.util.Scanner;

public class Examle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight 1: ");
		double userInput1 = Integer.parseInt(sc.nextLine());
		System.out.println(userInput1);
		System.out.println("Enter weight 2: ");
		double userInput2 = sc.nextDouble();
		System.out.println(userInput2);
		System.out.println("Enter weight 3: ");
		double userInput3 = sc.nextDouble();
		System.out.println(userInput3);
		System.out.println("Enter weight 4: ");
		double userInput4 = sc.nextDouble();
		System.out.println(userInput4);
		System.out.println("Enter weight 5: ");
		double userInput5 = sc.nextDouble();
		System.out.println(userInput5);
		int [] arraylist = {(int) userInput1,(int) userInput2, (int) userInput3,(int) 
				userInput4,(int) userInput5};
		System.out.println("You Entered :>>> ");
		for(int j=0;j<arraylist.length;j++) {
			System.out.print(arraylist[j]+" ");
		}
		System.out.println();
		int counter = 0;
		for(int i=0; i<arraylist.length;i++) {
			counter = counter +arraylist[i];
		}
		System.out.println( "Total weigth:>>> "+counter);
		int result;
		result = counter/arraylist.length;
		System.out.println( "Average weigth :=>>>"+result);	
		int firstLargestNumber = 0;
		int secondLargestNumber = 0;
		int firstNumber = arraylist[0];
		int secondNumber = arraylist[1];
		if(firstNumber>secondNumber) {
			firstLargestNumber = firstNumber;
			secondLargestNumber = secondNumber;
		}else {
			firstLargestNumber = secondNumber;
			secondLargestNumber = firstNumber;
		}
		for(int k=2; k<arraylist.length;k++) {
			if(arraylist[k]>firstLargestNumber) {
				firstLargestNumber =secondLargestNumber;
				firstLargestNumber = arraylist[k];
			}
		}
		System.out.println("Max Weight:>>>"+firstLargestNumber );
	}
}