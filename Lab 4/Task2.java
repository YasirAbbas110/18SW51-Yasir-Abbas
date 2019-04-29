import java.util.Scanner;
class Task2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the table u want to print ");
		int table = input.nextInt();
		System.out.print("\nEnter the starting point of table u want to print ");
		int start = input.nextInt();
		System.out.print("\nEnter the ending point of table u want to print ");
		int end = input.nextInt();
		for(int a=start;a<=end;a++)
		{
			System.out.println(a+" * "+table+" = "+a*table);
		}
	}
}