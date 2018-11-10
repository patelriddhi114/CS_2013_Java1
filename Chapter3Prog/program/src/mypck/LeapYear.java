package mypck;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year :");
		int year = input.nextInt();
		
		boolean isLeapyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0);
		
		
		
		System.out.println(year + " is a leap year "+ isLeapyear + "\n");

	}

}
