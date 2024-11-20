package com.java.mohali;

import java.util.Scanner;

public class GameGassNum {
	public static void main(String[] args) {
		String wantToPlayAgain = "Yes";
		Scanner keyboard = new Scanner(System.in);
		int count = 1;
		int min = 1;
		int max = 100;
		int secretNumber = (int) (Math.random() * 100 + 1);
		do {
	System.out.printf("Enter a number to guess between %d - %d : ",min,max);
	int userNum = Integer.parseInt(keyboard.nextLine());
	while(userNum>100 || userNum < 1) {
		System.out.printf("Invalid input, Enter a number to guess between %d - %d : ",min, max);
		userNum = Integer.parseInt(keyboard.nextLine());
	}
	if(userNum ==  secretNumber) {
		System.out.println("Congratulations!! you won in "+count+ "  attempt.");
		count=1;
		min = 1;
		max = 100;
		secretNumber = (int) (Math.random() * 100 + 1);
		System.out.println("Do you want to play again, enter yes to play or no to exit");
		wantToPlayAgain = keyboard.nextLine();
		while(!(wantToPlayAgain.equalsIgnoreCase("yes") || wantToPlayAgain.equalsIgnoreCase("no"))){
			System.out.println("Invalid input, Please enter yes or no:");
			wantToPlayAgain = keyboard.nextLine();
		}
	}else if (userNum < secretNumber) {
		System.out.println("user num is smaller");
		min = userNum;
		count++;
		while(!(wantToPlayAgain.equalsIgnoreCase("yes") || wantToPlayAgain.equalsIgnoreCase("no"))){
			System.out.println("Invalid input, Please enter yes or no:");
			wantToPlayAgain = keyboard.nextLine();
		}
	}else {
		System.out.println("user num is greatest");
		max = userNum;
		count++;
	}
	while(!(wantToPlayAgain.equalsIgnoreCase("yes") || wantToPlayAgain.equalsIgnoreCase("no"))){
		System.out.println("Invalid input, Please enter yes or no:");
		wantToPlayAgain = keyboard.nextLine();
	}
		}while(wantToPlayAgain.equalsIgnoreCase("Yes"));
	}
}
