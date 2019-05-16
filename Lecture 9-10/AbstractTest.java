abstract class Shape
{
	protected String colour;
	protected boolean filled;
	Shape()
	{
		colour="White";
		filled=false;
	}
	Shape(String c, boolean f)
	{
		colour = c;
		filled = f;
	}
	abstract double getArea();
}
class Rectangle extends Shape
{
	private double width;
	private double length;
	Rectangle(double w,double l)
	{
		width=w;
		length=l;
	}
	double getArea()
	{
		return width*length;
	}
}
class AbstractTest
{
	public static void main(String[] args)
	{
		Rectangle obj1 = new Rectangle(5,6);
		System.out.println("Area = "+obj1.getArea());
	}
}
