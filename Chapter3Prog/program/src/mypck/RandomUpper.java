package mypck;

public class RandomUpper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 65 + (int)(Math.random() * (91 -65));
		
		System.out.println((char)(number));
	}

}
