package mypck;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Count myCount = new Count();
		int times =0 ;
		
		for(int i=0; i<100; i++)
			increment(myCount,times);
		System.out.println("Count is " + myCount.count);
		System.out.println("times is " + times);
		
	}
	public static void increment(Count c,int times )
	{
		c.count++;
		times++;
	}
}
	class Count
	{
	 	public int count;
	 	
	 	public Count(int c)
	 	{
	 		count=c;
	 	}
	 	public Count()
	 	{
	 		count =1;
	 	}
	}

