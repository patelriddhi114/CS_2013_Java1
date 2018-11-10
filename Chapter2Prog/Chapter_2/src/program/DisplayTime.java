package program;

import java.util.Scanner;

public class DisplayTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer for seconds :");
		int seconds = input.nextInt();
		
		int minutes = seconds/60;
		int reminingSeconds = seconds % 60;
		
		System.out.println(seconds +" Seconds is "+ minutes + " minutes and " + reminingSeconds + " seconds" );
	}

}
