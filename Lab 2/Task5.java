class Task5
{
	public static void main(String [] args)
	{
		byte a = 6;
		byte b = 3;
		System.out.println(a+" << 2 = "+(a<<2));
		System.out.println(b+" >> 2 = "+(b>>2));
		System.out.println(b+" >>> 2 = "+(b>>>2));
		System.out.println(a+" & "+b+ " = "+(a&b));
		System.out.println(a+" | "+b+ " = "+(a|b));
		System.out.println(a+" ^ "+b+ " = "+(a^b));
		System.out.println("~"+a+" "+(~a));
	}
}