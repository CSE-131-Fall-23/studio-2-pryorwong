package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Amount of money you started with:");
		double startAmount = in.nextDouble();
		System.out.println("Chance you win a single pay:");
		double winChance = in.nextDouble();
		System.out.println("Amount of money desired before leaving:");
		double winLimit = in.nextDouble();
		System.out.println("The numbers of day's you'll simulate: ");
		int totalSimulations = in.nextInt();
		int numRuins = 0;
		int numSuccesses = 0;
		
		
	
		
		for (int i = 1; i<= totalSimulations; i++) {
			double bank = startAmount;
			while (bank >= 100 && bank < winLimit)
			{
				double randomNumber = Math.random();
				if (randomNumber <= winChance)
				{
					bank = bank + 100;
				}
				else
				{
					bank = bank - 100;
				}
		
			}
			if (bank < 100) 
				{	
				System.out.println("Simulation " + i + ": Ruin");
				numRuins ++;
				}
			else
			{
				System.out.println("Simulation " + i + ": Success");
				numSuccesses ++;
			}
			
		}
		System.out.println("Number of successes: " + numSuccesses);
		System.out.println("Number of ruins: " + numRuins);
		double ruinRate = numRuins / totalSimulations;
		if (winChance == 0.5)
		{
			double expectedRuin = 1 - (startAmount / winLimit);
			System.out.println("Expected ruin: " + expectedRuin);
		}
		else
		{
			double alpha = (1 - winChance) / winChance;
			double expectedRuin = (Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit)) / (1 - Math.pow(alpha, winLimit));
			System.out.println("Expected ruin: " + expectedRuin);
		}
	}

}
