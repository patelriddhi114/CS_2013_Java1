package program;

import java.util.Scanner;

public class ComputVolumeOfcylinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the radius and length of cylinder :");
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double area = radius * radius * 3.14;
		double volume = area * length;
		
		System.out.println(" The area is "+ area );

		System.out.println(" The volume  is "+ volume );
	}

}
