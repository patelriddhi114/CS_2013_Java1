package program;

import java.util.Scanner;

public class ConvertFeetToMeters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the feet:");
		double feet = input.nextDouble();
		
		double meters = feet * 0.305;
		
		System.out.println(feet + " feet is "+ meters + " meters" );


	}

}
