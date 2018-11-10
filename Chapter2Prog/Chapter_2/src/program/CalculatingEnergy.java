package program;

import java.util.Scanner;

public class CalculatingEnergy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount of water in kilogram :");
		double kg = input.nextDouble();
		System.out.println("Enter the initial temperature :");
		double InitialTemp = input.nextDouble();
		System.out.println("Enter the final temperature :");
		double FianlTemp = input.nextDouble();
		
		
		double q =( kg *(FianlTemp - InitialTemp) *4184) / 1000000;
		
		System.out.println(" The energy needed is " + q);


		
	}

}
