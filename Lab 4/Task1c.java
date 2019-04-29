class Task1c
{
	public static void main(String[] args)
	{
		int a=1;
		for(int i =1;i<6;i++)
		{
			for(int j=6;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=a;k++)
			{
				System.out.print("*");
			}
				a=a+2;
				System.out.println("");
		}
	}
}