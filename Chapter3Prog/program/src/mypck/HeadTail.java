package mypck;

import java.util.Random;
import java.util.Scanner;

public class HeadTail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in = new Scanner(System.in);

	        Random random = new Random();
	        int coin_flip = random.nextInt(2);

	        System.out.print("Coin flip.  Enter 1 for heads, 0 for tails: ");
	        int guess = in.nextInt();

	        if(guess == coin_flip){
	            System.out.println("Correct!");
	        }else{
	            System.out.println("Sorry, incorrect.");
	        }
	}

}
