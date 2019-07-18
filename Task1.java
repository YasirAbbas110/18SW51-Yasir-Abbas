class Circle
{
	protected double radius;
	protected String colour;
	public Circle()
	{
		radius=1;
		colour="Red";
	}
	public Circle(double r)
	{
		radius=r;
	}
	public Circle(double r, String c)
	{
		radius=r;
		colour=c;
	}
	public void setRadius(double r)
	{
		radius=r;
	}
	public void setColour(String c)
	{
		colour=c;
	}
	public String getColour()
	{
		return colour;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getArea()
	{
		return (2*3.14*radius);
	}
	public String toString()
	{
		return ("Circle[Radius : "+radius+",Colour : "+colour+"]");
	}
}
class Cylinder extends Circle
{
	private double height;
	public Cylinder()
	{
		super();
		height=1;
	}
	public Cylinder(double r)
	{
		radius=r;
		colour="Red";
		height=1;
	}
	public Cylinder(double r, double h)
	{
		radius=r;
		colour="Red";
		height=h;
	}
	public Cylinder(double r, double h,String c)
	{
		radius=r;
		colour=c;
		height=h;
	}
	public void setHeight(double h)
	{
		height=h;
	}
	public double getHeight()
	{
		return height;
	}
}
class Task1
{
	public static void main(String[] args)
	{
		Circle circle = new Circle(5,"Black");
		Cylinder cylinder = new Cylinder(5,6,"While");
		System.out.println(circle.toString());
	}
}
		