import java.util.*;
class Task3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter any albhabetical letter :");
		char letter = input.next().charAt(0);
		switch(letter)
		{
			case 'a' :
			case 'A' :
			case 'e' :
			case 'E' :
			case 'i' :
			case 'I' :
			case 'o' :
			case 'O' :
			case 'u' :
			case 'U' :
			System.out.println(letter+" is vowel ");
			break;
			default :
			System.out.print(letter+" is consonant");
		}
	}
}