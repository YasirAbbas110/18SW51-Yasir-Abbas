//Generate a series of Odd number and even number using for and and while loop;
class OddAndEven
{
	public static void main (String[] args)
	{
		int i = 1;
		System.out.println("Even\tOdd");
		while(i<100)
		{
			int a=i+1;
			System.out.println(i+"\t"+a);
			i+=2;
		}
	}
}