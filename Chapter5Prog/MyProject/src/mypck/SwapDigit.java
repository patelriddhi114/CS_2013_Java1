package mypck;

import java.util.Scanner;

public class SwapDigit {
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input  = new Scanner(System.in);
		int num1,num2;
		//num1 = 5; num2 = 9;
		
		
		int[] list;
		list = new int[2];
		list[0] = 5;
		list[1] = 9;
		System.out.println("Before swap num1 is = " + list[0]
				+ " and num2 = " +list[1]);
		swap(list);
		System.out.println("Before swap num1 is = " + list[0]
				+ " and num2 = " +list[1]);
	}
	/*public static void swap(int num1,int num2)
	{
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}*/
	public static void swap(int[] list)
	{
		int temp = list[0];
		list[0] = list[1];
		list[1] = temp;
	}
}



















