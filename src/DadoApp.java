package diceapp;

import java.util.Scanner;

public class DadoApp {

	public static void main(String[] args) {
		// ask the user for a new dice type
		System.out.println("Input the int for the dice type below: (e.g 20 -> d20, 4 -> d4, etc)");
		Scanner scanner = new Scanner(System.in);
		int diceMax = scanner.nextInt();
		DiceObj dice = new DiceObj(diceMax);
		do {
			clearConsole();
			//ask the user how many of those dice have to be rolled
			System.out.println("\n\nHow many throws would you like to make?");
			int rollAmount = scanner.nextInt();
			
			System.out.println("\n\nWould you like to add a value after the roll?\n1 for Yes\n2 for No ");
			int rollType = scanner.nextInt();
			
			if(rollType == 1) {
				System.out.println("\n\nInput the value you would like to sum to your roll:");
				int valueToSumToRoll = scanner.nextInt();
				System.out.println("Your roll was: "+ dice.rollDice(rollAmount, valueToSumToRoll));
				System.out.println("With dice "+ dice.getLastDiceRolled());
			}
			else if(rollType == 2) {
				System.out.println("Your roll was: "+ dice.rollDice(rollAmount));
				System.out.println("With dice "+ dice.getLastDiceRolled());
			}
			System.out.println("Would you like to keep throwing your dice?\n Input True or False");
		}while(scanner.nextBoolean());
		clearConsole();
		System.out.println("Thanks for playing!");
		
		// show the user both the dice rolls and the total sum of the rolls
	}
	
	private static void clearConsole() {
		System.out.println(new String(new char[50]).replace("\0", "\r\n"));
	}

}
