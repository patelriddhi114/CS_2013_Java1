package program;

import java.util.Scanner;

public class ComputChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amount double :");
		double amount = input.nextDouble();
		
		int remainingSmount = (int)(amount *100);
		
		int noOfOneDollars = remainingSmount / 100;
		remainingSmount = remainingSmount % 100;
		
		int noOfoneQuaters = remainingSmount / 25;
		remainingSmount = remainingSmount % 25;
		
		int noOfOneDimes = remainingSmount / 10;
		remainingSmount = remainingSmount % 10;
		
		int noOfOnenickles = remainingSmount / 5;
		remainingSmount = remainingSmount % 5;
		  
		int noOfPennies = remainingSmount;
		
		
		
		System.out.println("Your amount " + amount + " consist of \n" 
		 + "\t" + noOfOneDollars + " dollars\n"
		 + "\t" + noOfoneQuaters + " quaters\n"
		 + "\t" + noOfOneDimes + " diems\n"
		 + "\t" + noOfOnenickles + " nickels\n"
		 + "\t" + noOfPennies + " pennies\n");

	}

}
