package mypck;

import java.util.Scanner;

public class CheckingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a nummber :");
		
		int x = input.nextInt();
		
		
		if(x%5 == 0 && x%6 == 0)
			System.out.println(x + " is divisible by both 5 and 6");
		else if (x%5 == 0 || x%6 == 0)
			System.out.println(x + " is divisible by both 5 or 6 ,but not both");
		else 
			System.out.println(x + " is divisible by either 5 or 6");
	}

}
