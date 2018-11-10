package program;

import java.util.Scanner;

public class ASCIICode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the ASCII Code:");
		int code = input.nextInt();
		
		if(code < 0 || code > 127)
		{
			System.out.println("Invalid data" );
		}
		else
		{
			System.out.println("The charater for ASCII code " + code + " is " +(char)code );
		}
		//System.out.println(pounds + " pounds is "+ kg + " kilogram" );

	}

}
