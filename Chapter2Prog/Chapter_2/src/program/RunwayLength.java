package program;

import java.util.Scanner;

public class RunwayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the V :");
		double v = input.nextDouble();
		
		System.out.println("Enter the A :");
		double a = input.nextDouble();
		
		
		
		double runway = Math.pow(v, 2) / (2 * a);
		
		System.out.println(" The  minimum runway length for this airplane is  " + runway);


	}

}
