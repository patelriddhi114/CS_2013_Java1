package mypck;

import java.util.Scanner;

public class TextBooleanOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer :");
		int number = input.nextInt();
		
		System.out.println("Is " + number + "\n\t divisible by 2 and 3?" 
				+ (number % 2 == 0 && number % 3 == 0)
				+ "\n\t divisible by 2 or 3?" + 
				(number % 2 == 0 || number % 3 ==0 ) +
				"\n\t divisible by 2 or 3 , but not both?" );		
		

	}

}
