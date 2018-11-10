package mypck;

import java.util.Scanner;

public class SessiorRockPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		int computer = (int)(Math.random() * 3);
		
		System.out.println("Scissor (0), Rock (1), Paper (2)");
		int user = input.nextInt();
		
		System.out.println("The compter is");
		switch(computer)
		{
			case 0:
				System.out.println("Scissor");
				break;
			case 1:
				System.out.println("Rock");
				break;
			case 2:
				System.out.println("Paper");
				break;
		}
		System.out.println("Users");
		switch(user)
		{
			case 0:
				System.out.println("Scissor");
				break;
			case 1:
				System.out.println("Rock");
				break;
			case 2:
				System.out.println("Paper");
				break;
		}
		
		if(computer == user)
		{
			System.out.println("too.. It is a draw");
		}
		else
		{
			boolean win = (user == 0 && computer == 2 ) || 
					(user == 1 && computer == 0 ) ||
					(user == 2 && computer == 1);
			
			if(win)
				System.out.println("you win");
			else
				System.out.println("you lose");
		}
	}

}
