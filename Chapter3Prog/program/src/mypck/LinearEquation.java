package mypck;

import java.util.Scanner;

public class LinearEquation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an a , b , c , d , e , f :  : ");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int d = input.nextInt();
		int e = input.nextInt();
		int f = input.nextInt();

		int total = a*d - b*c;
				
		if(total == 0)
		{
			System.out.println("The equation has no solution");
			
		}
		else
		{
			double x = ((e*d)-(b*f))/((a*d)-(b*c));
			double y = ((a*f)-(e*c))/((a*d)-(b*c));
			System.out.printf("x is %.1f and y is %.1f",x,y);
		}
	}

}
