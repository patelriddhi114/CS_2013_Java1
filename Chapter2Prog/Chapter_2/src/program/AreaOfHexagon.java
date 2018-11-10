package program;

import java.util.Scanner;

public class AreaOfHexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of Side:");
		double s = input.nextDouble();
		
		
		
		double area = (3 * Math.sqrt(3)) / 2 * Math.pow(s, 2);
		
		System.out.println(" The result of distance is " + area);

	}

}
