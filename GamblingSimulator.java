package com.bridgelabz.gamblingSimulator;


public class GamblingSimulator {
	
	 public static void main(String[] args) {
		 
	        System.out.println(" Welcome To The Gambling Simulation Problem");
	        int total_Amount = 100;
	        int bet_Amount = 1;
	        while (total_Amount > 50 && total_Amount < 150) {
	            int gameAmount = (int) Math.floor(Math.random() * 10) % 2;

	            System.out.println("Gambler received amount : " + gameAmount);

	            if (bet_Amount == gameAmount) {
	                System.out.println("Gambler won the current game");
	                total_Amount = total_Amount + bet_Amount;
	                System.out.println("Total Current case of gambler has : " + total_Amount);

	            } else {
	                System.out.println("Gambler lost the  current game");
	                total_Amount = total_Amount - bet_Amount;
	                System.out.println("Total Current case of gambler has : " + total_Amount);

	            }
	        }
	        System.out.println("Total amount received by gambler has :" + total_Amount);

	        if (total_Amount == 50 || total_Amount == 150) {
	            System.out.println(".....................");
	            System.out.println("Player would like to resign for current day !");
	            System.out.println("....................");
	        }


	    }


	}

	
	
	