package program;

import java.util.Scanner;

public class DistanceTwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the value of X1:");
		double x1 = input.nextDouble();
		System.out.println("Enter the value of Y1 :");
		double y1 = input.nextDouble();
		System.out.println("Enter the value of X2 :");
		double x2 = input.nextDouble();
		System.out.println("Enter the value of Y2 :");
		double y2 = input.nextDouble();
		
		double result = Math.sqrt(Math.pow(	(x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println(" The result of distance is " + result);

	}

}
