package mypck;

import java.util.Scanner;

public class ComputeBMI {

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
		
		
		System.out.print(" The BMI value is ="+ bmi + "\n");
		
		if(bmi < 16)
			System.out.println("You are seriously underwight");
		else if(bmi < 18)
			System.out.println("You are underwight");
		else if(bmi < 24)
			System.out.println("You are normal wight");
		else if(bmi < 29)
			System.out.println("You are Overwight");
		else if(bmi < 35)
			System.out.println("You are seriously overwigth");
		else
			System.out.println("You are gravely over wight");
	}

}
