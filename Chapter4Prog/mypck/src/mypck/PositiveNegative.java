package mypck;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	     int positive = 0, negative = 0, total = 0, count = 0;

	     float average;

	     System.out.println("Enter the number: ");
	     int number = input.nextInt();

	     while(number != 0) {
	        total += number;
	        count++;

	        if(number > 0){
	        positive++;
	        }

	        else if(number < 0){
	        negative++;
	        }

	     average = total / count;

	     System.out.println("The number of positives is "+ positive);
	     System.out.println("The number of negatives is "+ negative);
	     System.out.println("The total is "+ total);
	     System.out.println("The average is "+ average);
	}
	}
}
