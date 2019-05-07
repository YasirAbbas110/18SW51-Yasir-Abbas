/*3. Create a class to print an integer and a character with two methods having
the same name but different sequence of the integer and the character
parameters.
For example, if the parameters of the first method are of the form (int
n, char c), then that of the second method will be of the form (char c,
int n).*/

class Task3
{
	public static void main(String[] args)
	{
		Task3 overloading = new Task3(); 
		overloading.intchar(5,'a');
		overloading.intchar('a',5);
	}
	public void intchar(int i, char c)
	{
		int number = i;
		char character = c;
		System.out.println("---------First integer then char----------------- ");
		System.out.println("number ="+number);
		System.out.println("Character ="+character);
	}
	public void intchar(char c,int i)
	{
		System.out.println("------------First char then integer---------------");
		int number = i;
		char character = c;
		System.out.println("number ="+number);
		System.out.println("Character ="+character);
	}
}