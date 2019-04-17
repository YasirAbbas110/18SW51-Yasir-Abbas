//Calculate factorial when a number is supplied on runtime.
import java.util.*;
class Factorial
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number whose factorial is to be find ");
		int number = input.nextInt();
		int answer = 1; 
		while(number>0)
		{
		answer = answer * number;
		number--;
		}
		System.out.println("Factorial = "+answer);
	}
}