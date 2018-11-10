package mypck;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.printf("amount is %f %e\n", 32.32, 32.32);
		System.out.printf("amount is %5.2%% %5.4e\n", 32.327, 32.32);
		System.out.printf("%6b\n", (1 > 2));
		System.out.printf("%6s\n", "Java");
		System.out.printf("%-6b%s\n", (1 > 2), "Java");
		System.out.printf("%6b%-8s\n", (1 > 2), "Java");
	}

}
