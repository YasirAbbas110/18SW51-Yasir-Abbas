import java.util.Scanner;
class Task3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the total numbers whose sum is to be find");
		int total=input.nextInt();
		int sum=0;
		for(int a=1;a<=total;a++)
		{
			System.out.print("Enter the number");
			int num = input.nextInt();
			sum=sum+num;
		}
		System.out.println("Sum = "+sum);
	}
}
