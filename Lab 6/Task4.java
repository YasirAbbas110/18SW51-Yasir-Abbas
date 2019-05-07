/*4. Create a class to print the area of a square and a rectangle. The class has
two methods with the same name but different number of parameters. The
method for printing area of rectangle has two parameters which are lengthand 
breadth respectively while the other method for printing area of square
has one parameter which is side of square. */

class Task4
{
	public static void main(String[] args)
	{
		Task4 overloading = new Task4();
		int length = 10;
		int breadth = 20;
		System.out.println("Area of Rectangle = "+overloading.area(length,breadth));
		System.out.println("Area of Square = "+overloading.area(length));
	}
	public int area(int l,int b)
	{
		return l*b;
	}
	public int area(int l)
	{
		return l*l;
	}
}