package com.java.mohali;
import java.util.Scanner;
public class GameGassNum1 {
   public static void main(String[] args) {
 	String wantToPlayAgain = "Yes";
 	Scanner keyboard = new Scanner(System.in);
 	int count = 1;
 	int secretNumber = (int) (Math.random() * 10 + 1);
 	do {
 		System.out.println("Enter a number to guess between 1-10:");
 		int userNum = Integer.parseInt(keyboard.nextLine());
 		while(userNum>10 || userNum < 1) {
 		System.out.println("Invalid input, Please Enter a number to guess between 1-10:");
 		userNum = Integer.parseInt(keyboard.nextLine());
 		}  
 		if(userNum ==  secretNumber) {
 			System.out.println("Congratulations!! you won in "+count+ "  attempt.");
 			count=1;
 			secretNumber = (int) (Math.random() * 10 + 1);
 			System.out.println("Do you want to play again, enter yes to play or no to exit");
 			wantToPlayAgain = keyboard.nextLine();
 		while(!(wantToPlayAgain.equalsIgnoreCase("yes")||wantToPlayAgain.equalsIgnoreCase("no"))){
 				System.out.println("Invalid input, Please enter yes or no:");
 				wantToPlayAgain = keyboard.nextLine();
 			}
 		}else {
 			if (count==3) {
 				System.out.println("Tumse nai ho payega!!");
 				System.exit(0);
 			}
 			count++;
 			System.out.println("Sorry Its not correct Guess! "
 					+ "Do you want to guess again, enter yes to play or no to exit");
 			wantToPlayAgain = keyboard.nextLine();
 			while(!(wantToPlayAgain.equalsIgnoreCase("yes")||wantToPlayAgain.equalsIgnoreCase("no"))) {
 				System.out.println("Invalid input, Please enter yes or no:");
 				wantToPlayAgain = keyboard.nextLine();
 			}
			}
		}while(wantToPlayAgain.equalsIgnoreCase("Yes"));
	}
}