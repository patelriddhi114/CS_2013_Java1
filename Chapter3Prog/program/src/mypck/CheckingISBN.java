package mypck;

import java.util.Scanner;

public class CheckingISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digit of an ISBN as integer :");
		
		int isbn = input.nextInt();
		
		int d1 = isbn / 100000000;
		int remaingDigit = isbn % 100000000;
		int d2 = remaingDigit / 10000000;
		remaingDigit %= 10000000;
		int d3 = remaingDigit / 1000000;
		remaingDigit %= 1000000;
		int d4 = remaingDigit / 100000;
		remaingDigit %= 100000;
		int d5 = remaingDigit / 10000;
		remaingDigit %= 10000;
		int d6 = remaingDigit / 1000;
		remaingDigit %= 1000;
		int d7 = remaingDigit / 100;
		remaingDigit %= 100;
		int d8 = remaingDigit / 10;
		remaingDigit %= 10;
		int d9 = remaingDigit;

		
		int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + 
				d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9);
		
		System.out.println("The ISBN-10 number is " + d1 + d2 + d3 + d4 
				+ d5 + d6 + d7 + d8 + d9);;
		
				
		if(d10 == 10)
			System.out.println("X");
		else
			System.out.println(d10);
	}

}
