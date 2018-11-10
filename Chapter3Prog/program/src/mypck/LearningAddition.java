package mypck;

import java.util.Scanner;

public class LearningAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int num1 = (int)(Math.random()*100);
		int num2 = (int)(Math.random()*100);
		
		System.out.println("What is " + num1 + " + " + num2 + " ? ");
		
		int ans = input.nextInt();
		
		System.out.println(num1 + " + " + num2 + " = " + ans + "is" + (num1+num2 == ans));;
	}

}
