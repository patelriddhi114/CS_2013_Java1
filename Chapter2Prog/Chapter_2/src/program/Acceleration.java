package program;

import java.util.Scanner;

public class Acceleration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the starting velocity :");
		double v0 = input.nextDouble();
		
		System.out.println("Enter the ending velocity :");
		double v1 = input.nextDouble();
		
		System.out.println("Enter the time span :");
		double t = input.nextDouble();
		
		
		
		double acce = (v1 - v0) / t;
		
		System.out.println(" The average acceleration is " + acce);

	}

}
