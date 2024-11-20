package com.java.mohali;

import java.util.Scanner;
public class A {
	public static void main(String[] args) {
		String wantToPlayAgain = "Yes";
		int count =1;
		int min = 1;
		int max = 10;
		Scanner sc = new Scanner(System.in);
		int screatNumber = (int) (Math.random()*10+1);
		do {
		System.out.printf("Enter a number to guess between %d - %d" ,min,max);  
		int userNum =  Integer.parseInt(sc.nextLine());
		while(userNum>10 || userNum <1) {
			System.out.printf("Invalid input, Please Enter a number to guess between %d - %d" , min , max);
			userNum =  Integer.parseInt(sc.nextLine());
		} 
		if(userNum == screatNumber) {
			System.out.println("Congratulations...!!"+count+" you won");
			count = 1;
			min = 1;
			max=10;
			screatNumber  = (int)(Math.random()*10+1);
			System.out.println("Do you want to play again, enter yes to play or no to exit");
		    wantToPlayAgain = sc.nextLine();
			while(!(wantToPlayAgain.equalsIgnoreCase("Yes")||wantToPlayAgain.equalsIgnoreCase("No"))) {
				System.out.println("Invaild input, Please enter Yes or No");
				wantToPlayAgain = sc.nextLine();
			}
		}else if(userNum<screatNumber) {
			System.out.println("user number is gratest");
			max = userNum;
			count++;
			{
			while(!(wantToPlayAgain.equalsIgnoreCase("yes")||wantToPlayAgain.equalsIgnoreCase("no"))){
				System.out.println("Invalid input, Please enter yes or no:");
				wantToPlayAgain = sc.nextLine();
			}
		}
		}else {
		System.out.println("userNumber is Smallest...");
		min	= userNum;
		count++;
		}while(!(wantToPlayAgain.equalsIgnoreCase("yes")||wantToPlayAgain.equalsIgnoreCase("no"))){
			System.out.println("Invalid input, Please enter yes or no:");
			wantToPlayAgain = sc.nextLine();
		}
		}while(wantToPlayAgain.equalsIgnoreCase("Yes"));
    }
  }