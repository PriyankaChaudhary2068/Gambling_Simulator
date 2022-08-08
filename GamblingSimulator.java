package com.bridgelabz.gamblingSimulator;


public class GamblingSimulator {
	
	public static final double INITIAL_STAKE = 100;
	public static final double STAKE_BET = 1;
	public static final int NUMBER_OF_PLAYS =30;
	public static int stake = 0, monthlyWins=0, monthlyLosses =0;
	

	public static boolean winOrLose() {

		if ((int)Math.floor(Math.random()*10)%2 == 1) {
			monthlyWins++;
			return true;
			
		} else {
			monthlyLosses++;
			return false;
		}
	}

	public static void gamblerDecision() {
		boolean resign = false;
		
		while(resign == false) {
			
			if (winOrLose()) {
				stake ++;
			} else {
				stake --;
			}
			if (stake >= INITIAL_STAKE + (INITIAL_STAKE * 0.5) || stake <= INITIAL_STAKE / 2) {
				resign = true;
			} 
			
		}
	}

	public static void main(String[] args) {
		System.out.println(" Welcome To The Gambling Simulation Problem");
	    System.out.println("...................");

		double balance = 0;
	
		for(int numberOfDays = 0; numberOfDays<= NUMBER_OF_PLAYS ; numberOfDays++) {
			int stake = 100;
			gamblerDecision();
			balance = balance+stake; 			
		}
			
			System.out.println("Total amount : " + balance);
		
			double amountLostOrWon = (INITIAL_STAKE*NUMBER_OF_PLAYS) - balance;
			System.out.println("Amount Won(-ve) or Lost(+ve) = "+amountLostOrWon);
			System.out.println("Number of Days Lost : "+monthlyLosses);
			System.out.println("Number of Days Won : "+monthlyWins);
			
	}


}