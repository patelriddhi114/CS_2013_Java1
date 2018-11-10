package program;

import java.util.Scanner;

public class FahrenhitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the degree in fahrenhit :");
		double fahrenhit = input.nextDouble();
		
		double celsius = (5.0 /9) * (fahrenhit -32);
		
		System.out.println(" Fahrenhit is "+ fahrenhit + " is " + celsius + " Celsius is " );
	
	}

}
