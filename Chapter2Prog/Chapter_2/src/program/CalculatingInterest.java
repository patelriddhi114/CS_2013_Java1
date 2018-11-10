package program;

import java.util.Scanner;

public class CalculatingInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the balance and interest rate(3%) 3.5 :");
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
		
		double intrest = balance * (interestRate /1200);
		
		System.out.println(" The interest is "+ intrest );

		

	}

}
