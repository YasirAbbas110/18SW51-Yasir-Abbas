import java.util.*;
class Task1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your c++ marks : ");
		int cp = input.nextInt();
		System.out.print("\nEnter your data structure marks : ");
		int data = input.nextInt();
		System.out.print("\nEnter your operating system marks : ");
		int os = input.nextInt();
		int sum = cp+data+os;
		double per = (sum/300.0)*100;
		System.out.print("\nYour percentage = "+per);
		if(per>=90)
		{
			System.out.println("You got A grade ");
		}
		else if(per>=80 && per <90)
		{
			System.out.println("You got B grade");
		}
		else if(per>=70 && per <80)
		{
			System.out.println("You got c grade");
		}
		else if(per>=60 && per <70)
		{
			System.out.println("You got B grade");
		}
		else
		{
			System.out.println("You are legend");
		}
	}
}