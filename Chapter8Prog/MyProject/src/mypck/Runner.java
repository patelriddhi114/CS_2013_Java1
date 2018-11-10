package mypck;

import java.util.Date;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		temp=5;
		
		Person p = new Person();
		System.out.println(p.dob.toString());
		
		
		Date d = p.getDateOfBirth();
		d.setTime(1000);
		System.out.println(p.dob.toString());
		
		
	}
	public static void test()
	{
		temp = 7;
		
	}
}
