package diceapp;

public class DiceObj {
	private int diceMax;
	private int[] lastDiceRolled;
	
	//have a constructor that receives the dice type, d20, d12, d4 etc
	public DiceObj(int diceMax) {
		this.diceMax = diceMax;
		System.out.println("Congratualations, your dice was created it is a " + this.getDiceType());
	}
	
	//have a roll method that receives the amount of dice to roll as input
	//and an optional int value to sum that value
		
	public int rollDice(int diceAmount) {
		int[] diceRolled = new int[diceAmount];
		int sum = 0;
		for(int i=0; i<diceAmount;i++) {
			int diceRoll = (int) (Math.random() * this.diceMax);
			sum += diceRoll;
			diceRolled[i] = diceRoll;
		}
		this.lastDiceRolled = diceRolled;
		return sum;
		
	}
	
	public int rollDice(int diceAmount, int addValue) {
		int[] diceRolled = new int[diceAmount];
		int sum = 0;
		for(int i=0; i<diceAmount;i++) {
			int diceRoll = (int) (Math.random() * this.diceMax);
			sum += diceRoll;
			diceRolled[i] = diceRoll;
		}
		this.lastDiceRolled = diceRolled;
		return sum + addValue;
	}

	public String getDiceType() {
		return "d" + this.diceMax;
	}

	public String getLastDiceRolled() {
		String lastDiceString = "[";
		for(int i=0; i < this.lastDiceRolled.length ; i++) {
			lastDiceString = lastDiceString + this.lastDiceRolled[i];
			if((i+1) == this.lastDiceRolled.length) {
				lastDiceString = lastDiceString + "]";
			}
			else {
				lastDiceString = lastDiceString +  ",";
			}
		}
		return lastDiceString;
	}
}
