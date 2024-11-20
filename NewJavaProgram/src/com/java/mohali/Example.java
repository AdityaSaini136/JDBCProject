package com.java.mohali;

import java.util.Arrays;
import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Weight1");
		double userInput1 = sc.nextDouble();
		System.out.println("Enter Weight2");
		double userInput2 = sc.nextDouble();
		System.out.println("Enter Weight3");
		double userInput3 = sc.nextDouble();
		System.out.println("Enter Weight4");
		double userInput4 = sc.nextDouble();
		System.out.println("Enter Weight5");
		double userInput5 = sc.nextDouble();
		int []arraylist = {(int)userInput1,(int)userInput2,(int)userInput3,(int) userInput4,
				(int)userInput5};
		System.out.println("Show All Weight");
		for(int i=0;i<arraylist.length;i++) {
			System.out.print(arraylist[i]+" ");
		}
		System.out.println();
		int counter =0;
		for(int i=0;i<arraylist.length;i++) {
			counter = counter + arraylist[i];
		}
		System.out.println("Sum of all Weight "+counter);
		int avrg = counter/arraylist.length;
		System.out.println("Avrage : >>>"+avrg);
//		Arrays.sort(arraylist);
//		System.out.print("Highest Weight:>>"+(arraylist[4]));
		int firstNumber  = 0;
		int secondNumber = 0;
		int firstlargestNumber = arraylist[0];
		int secondlargestNumber = arraylist[1];
		if(firstNumber>secondNumber ) {
			firstlargestNumber =firstNumber;
			secondlargestNumber = secondNumber;
		}else {
			firstlargestNumber =secondNumber;
			secondlargestNumber = firstNumber;
		}
			for(int i=2;i<arraylist.length;i++) {
				if(arraylist[i]>firstlargestNumber);
				secondlargestNumber = firstlargestNumber;
				firstlargestNumber = arraylist[i];
			}
			System.out.println("Highest Weight:>>"+firstlargestNumber);
	}
}