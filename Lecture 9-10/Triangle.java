class Triangle
{
	public double hypotenuse;
	public double perpendicular;
	public double base;
	public Triangle(double hyp,double perp,double bas)
	{
		hypotenuse=hyp;
		perpendicular=perp;
		base=bas;
	}
	public double getBase(double hyp, double per)
	{
		base=Math.sqrt(Math.pow(hyp,2)-Math.pow(per,2));
		return base;
	}
	public double getHyp(double bas, double per)
	{
		hypotenuse=Math.sqrt(Math.pow(bas,2)-Math.pow(per,2));
		return hypotenuse;
	}
	public double getPerp(double bas, double hyp)
	{
		perpendicular=Math.sqrt(Math.pow(hyp,2)-Math.pow(bas,2));
		return perpendicular;
	}
	public double getBases(double hypotenuse, double angle)
	{
		base=Math.cos(angle)*hypotenuse;
		return base;
	}
	public double getHypo(double perpendicular, double angle)
	{
		hypotenuse=perpendicular/Math.sin(angle);
		return base;
	}
	public double getPerpe(double base, double angle)
	{
		perpendicular=base*Math.tan(angle);
		return base;
	}
}
class MainClass
{
	public static void main(String[] args)
	{
		Triangle obj = new Triangle(3,4,5);
		System.out.println("Base = "+obj.getBase(6,5));
		System.out.println("Perpendicular = "+obj.getPerp(6,7));
		System.out.println("Hypotenuse = "+obj.getHyp(2,5));
		System.out.println("Base = "+obj.getBases(6,30));
		System.out.println("Perpendicular = "+obj.getPerpe(6,45));
		System.out.println("Hypotenuse = "+obj.getHypo(2,90));
	}
}