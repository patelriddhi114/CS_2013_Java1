package mypck;

import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NumberOfQue = 10;
		int correctCount =0;
		int count = 0;
		long startTime = System.currentTimeMillis();
		String output ="";
		Scanner input = new Scanner(System.in);
		
		
		while(count < NumberOfQue)
		{
			int num1 = (int)(Math.random() * 16 +1);
			int num2 = (int)(Math.random() * 16 +1);
			
			if(num1 <num2)
			{
				int temp = num1;
				num1 = num2;
				num2= temp;
			}
			System.out.println("what is" + num1 + " + " + num2 + 	"? ");
			int ans = input.nextInt();
			
			if(num1 +num2 == ans)
			{
				System.out.println("You are correct!\n");
                correctCount++;	
			}
			else
				System.out.println("Your answer is wrong.\n" + num1
                        + " + " + num2 + " should be " + (num1 + num2) + "\n");
			
			long endtime = System.currentTimeMillis();
			long testTime = endtime - startTime;
			
			System.out.println("Correct count is " + correctCount +
	                "\nTest time is " + testTime / 1000 + " seconds\n" + output);
			
		}
	}

}
