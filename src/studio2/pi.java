package studio2;

import java.util.Scanner;

public class pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Amount of simulatios:");
		double totalSimulations = in.nextInt();
		int hits = 0;
		
		
		for (int i = 1; i<= totalSimulations; i++) {
			double xCoordinate = Math.random();
			double yCoordinate = Math.random();
			if (Math.sqrt(Math.pow(xCoordinate - 0.5, 2) + (Math.pow(yCoordinate - 0.5, 2))) <= 0.5)  {
			    hits = hits + 1;
				System.out.println("Hit");
			}
				else {
					System.out.println("Miss");
					
				
				
				
	
			}
	
		}
	
			System.out.println("Number of Hits: " + hits);
			double hitProbability = hits / totalSimulations;
			System.out.println("Approximation of Pi: " + hitProbability * 4);
		
		
		
		
	
		

		
		}

}
