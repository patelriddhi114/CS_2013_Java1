package mypck;

import java.util.Scanner;

public class SortingThreeInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three number :");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		if(num1 > num2)
		{
			int temp;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		if(num2 > num3)
		{
			int temp;
			temp = num2;
			num2 = num3;
			num3 = temp;
		}
		/*if(num3 > num1)
		{
			int temp;
			temp = num3;
			num3 = num1;
			num1 = temp;
		}*/
		
		System.out.println("The sorted num is " + num1 + "  " + num2 + "  " + num3);
		
		
	}

}
