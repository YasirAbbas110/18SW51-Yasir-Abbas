/*Write java code that takes a value at runtime and searches it in the
array. If the value appears in the array then it prints the position of the
value or else prints a message that value is not found.*/

import java.util.Scanner;
class Task6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] array={1,5,12,14,72};
		System.out.println("Enter the number you want to search :");
		int search = input.nextInt();
		int found = -1;
		for(int i=0;i<array.length;i++)
		{
			if(search==array[i])
			{
				found=i;
				break;
			}
		}
		if(found!=-1)
		{
			System.out.println(search+" is found at index "+(found+1));
		}
		else
			System.out.println(search+" is not found ");
	}
}