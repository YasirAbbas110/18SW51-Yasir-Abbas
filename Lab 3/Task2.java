import java.util.*;
class Task2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter units you have consumed : ");
		int units = input.nextInt();
		int bill=0;
		if(units<=50)
		{
			bill = units*10;
		}
		else if(units>50 && units <=100)
		{
			bill=(50*10)+(units-50)*15;
		}
		else if(units>100 && units <=200)
		{
			bill=(50*10)+((100-50)*15)+(units-100)*20;
		}
		else if(units>200 && units <=300)
		{
			bill=(50*10)+((100-50)*15)+((200-100)*20)+(units-200)*25;
		}
		else if(units>300)
		{
			bill=(50*10)+((100-50)*15)+((200-100)*20)+(300-200)*25+((units-300)*30);
		}
		System.out.println("Your Bill = "+bill);
	}
}
		