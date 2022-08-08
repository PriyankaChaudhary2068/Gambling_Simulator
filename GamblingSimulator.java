package com.bridgelabz.gamblingSimulator;


public class GamblingSimulator {
	
	
	static int INITIAL_STAKE = 100;
    static int STAKE_BET = 1;
    public static int stake = 0;

	public static void winOrLose() {

		if (Math.random() < 0.5) {
			INITIAL_STAKE++;
			System.out.println("Player Win");
			
		} 
		else {
			INITIAL_STAKE--;
			System.out.println("Player Loose");

		}
	}

	
    public static void main(String[] args) {
		
		 System.out.println(" Welcome To The Gambling Simulation Problem");
		 System.out.println("...................");

		 System.out.println("Amount of stake is : " + INITIAL_STAKE );
		 System.out.println("Amount to Bet after every game : " + STAKE_BET);
		 winOrLose();
		 System.out.println("\nAvailable Amount of Stake :" + INITIAL_STAKE );

	}

}

	