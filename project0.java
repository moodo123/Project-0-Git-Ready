/*
// AUTHOR: MEGAN DO
// FILENAME: Assignment2.java
// SPECIFICATION: Rock, Paper, Scissors Game
// FOR: CS 1400 - ASSIGNMENT #2
// TIME SPENT: HOW LONG IT TOOK YOU TO FINISH THIS ASSIGNMENT
//*/

import java.util.Scanner;

public class project0 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Let's Play!");
		// Prompt for Player 1 & 2
		System.out.println("Player 1: Choose rock, scissors, or paper: ");
		String player1Choice = scan.nextLine().toLowerCase();
			
		System.out.println("Player 2: Choose rock, scissors, or paper: ");
		String player2Choice = scan.nextLine().toLowerCase();
			
			// Making choices are valid
		if (isValidChoice(player1Choice)&& isValidChoice (player2Choice)) {
			
			//Determine the winner
			String result = determineWinner(player1Choice,player2Choice);
			System.out.println(result);
		} else {
			System.out.println("Wrong choice!");
		}
		// close scanner
		scan.close();
	}
	
		// Check if choices are valid
	private static boolean isValidChoice(String choice) {
		return choice.equals("rock") || choice.equals("scissors")||choice.equals("paper");
	}
		//Determine the winner
	private static String determineWinner(String choice1,String choice2) {
		if (choice1.equals(choice2)) {
			return "It is a tie."; 
		} else if ((choice1.equals("rock") && choice2.equals("scissors")) ||
				(choice1.equals("scissors") && choice2.equals("paper"))||
				(choice1.equals("paper") && choice2.equals("rock"))) {
			return "Player 1 wins.";
		} else {
			return "Player 2 wins.";
		}
		
		}
}

