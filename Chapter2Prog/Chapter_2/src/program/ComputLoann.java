package program;

import java.util.Scanner;

public class ComputLoann {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enteer the interest rate, for ex 8.25 : ");
		double  annualInterestRate = input.nextDouble();
		
		double monthlyInterestRate = annualInterestRate /1200;
		
		System.out.println("Enteer the number of years as an integer, for ex 5 : ");
		int noyear = input.nextInt();
		
		System.out.println("Enteer the loan amount, for ex 120000.95 : ");
		double loanamount  = input.nextDouble();
		
		double monthlypayment = loanamount * monthlyInterestRate / 
				(1 - 1/Math.pow(1+monthlyInterestRate, noyear + 12));
		
		double  totalPayment = monthlypayment * noyear *12;
		
		System.out.println("The monthly payment is " +
			(int)(monthlypayment * 100) / 100.0);
		System.out.println("The total payment is " +
			(int)(totalPayment * 100) / 100.0);
	}

}
