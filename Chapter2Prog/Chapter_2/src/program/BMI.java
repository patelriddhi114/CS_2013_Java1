package program;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in poungs :");
		double weight = input.nextDouble();
		System.out.println("Enter height in meters :");
		double height = input.nextDouble();
		
		weight = weight * 0.45359237;
		height = height * 0.0254;
		
		double bmi = weight /(height * height);
		bmi = (int)(bmi *10000)/10000.0;
		
		
		System.out.println(" The BMI value is "+ bmi + "\n");

	}

}
