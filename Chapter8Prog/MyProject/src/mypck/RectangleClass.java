package mypck;

public class RectangleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double width=1.0;
		double height=1.0;
		
		RectangleClass  r1 = new RectangleClass(4,40);
		RectangleClass r2 = new RectangleClass(3.5,35.9);
		
		//System.out.println("First");
		System.out.println("First area of Rectangle " + r1.getArea());
		System.out.println("First Perimeter" + r1.getPerimeter());
		
		
		//System.out.println("\nSecond");
		System.out.println("Second area of Rectangle " + r2.getArea());
		System.out.println("Second Perimeter" + r2.getPerimeter());
		
		
	}
	
	double width1;
	double height1;
	double area;
	double perimeter;
	public RectangleClass()
	{
		
	}
	
	public RectangleClass(double newWidth,double newHeight)
	{
		width1 = newWidth;
		height1 = newHeight;
	}
	
	public double getArea()
	{
		area = width1 * height1;
		return area;
	}
	public double getPerimeter()
	{
		perimeter = 2 * (width1 + height1);
		return perimeter;
	}
}
