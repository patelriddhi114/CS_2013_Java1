package mypck;

import java.util.Scanner;

public class SbtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = (int)(Math.random() * 10);
		int num2 = (int)(Math.random() * 10);
		
		if(num1 < num2)
		{
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.println("What is " + num1 + " - " 
				+ num2 + "? ");
		Scanner input = new Scanner(System.in);
		
		int ans = input.nextInt();
		
		if(num1 - num2 == ans)
			System.out.println("You are correct !");
		else
			System.out.println("Your ans is wrong\n !" + num1 + " - "
					+ num2 + "should be " + (num1 - num2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
