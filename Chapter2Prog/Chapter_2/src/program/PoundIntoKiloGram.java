package program;

import java.util.Scanner;

public class PoundIntoKiloGram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of pounds:");
		double pounds = input.nextDouble();
		
		double kg = pounds * 0.454;
		
		System.out.println(pounds + " pounds is "+ kg + " kilogram" );

	}

}
