package program;

public class RandomChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

long randomSeed = System.currentTimeMillis();
		
		// We have to put the () in the expression
		int randomNumber = (int)(randomSeed % 26) + 65;
		char ch = (char)randomNumber;
		
		System.out.println(ch);
	}

}
