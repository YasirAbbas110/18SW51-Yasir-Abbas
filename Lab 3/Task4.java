import java.util.*;
class Task4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number : ");
		double number1 = input.nextDouble();
		System.out.print("\nEnter second number : ");
		double number2 = input.nextDouble();
		System.out.print("\nEnter the operation : ");
		char operation = input.next().charAt(0);
		switch(operation)
		{
			case '+' :
			double sum = number1+number2;
			System.out.println(number1+" + "+number2+" = "+sum);
			break;
			case '-' :
			double sub = number1-number2;
			System.out.println(number1+" - "+number2+" = "+sub);
			break;
			case '*' :
			double multipication = number1*number2;
			System.out.println(number1+" * "+number2+" = "+multipication);
			break;
			case '/' :
			double division = number1/number2;
			System.out.println(number1+" / "+number2+" = "+division);
			break;
			default :
			System.out.println("Invalid operator");
		}
	}
}