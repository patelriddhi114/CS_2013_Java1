package mypck;

import java.util.Scanner;

public class WhetherNumberEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an Integer : ");
		int num = input.nextInt();

		int total = num % 2;
				
		if(total == 0)
		{
			System.out.println(num + " is an even number");
			
		}
		else
		{
			System.out.println(num + " is an odd number");
			
		}
		
	}

}
