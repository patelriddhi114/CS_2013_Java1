package program;

import java.util.Scanner;

public class WidChillTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the tempratur in Fahrenhit(-58f - 41f ):");
		double temp = input.nextDouble();
		System.out.println("Enter the wid speed :");
		double speed = input.nextDouble();
		
		
		double windchill = 35.74 + 0.6215 * temp 
											- 35.75 * Math.pow(speed, 0.16)
											+ 0.4274 * temp * Math.pow(speed,0.16);
		
		
		System.out.println(" The wind chill index is " + windchill);

	}

}
