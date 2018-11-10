package program;

import java.util.Scanner;

public class CalFutureInvestmentValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter investment amount :");
		double IncestmentAmount = input.nextDouble();
		System.out.println("Enter the monthly interest rate(3%) 3.5 :");
		double monthlyinterestRate = input.nextDouble();
		monthlyinterestRate = monthlyinterestRate / 1200;
		System.out.println("Enter the no of Years :");
		double noOfYears = input.nextDouble();
		
		
		double futureInvestmentValue = IncestmentAmount * (Math.pow(1 + monthlyinterestRate,noOfYears *12 ));
		
		
		System.out.println(" The Accumulated value is "+ futureInvestmentValue );

	}

}
