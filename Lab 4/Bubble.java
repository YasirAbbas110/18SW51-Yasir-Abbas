//Bubble sort 
class Bubble
{
	public static void main(String[] args)
	{
		int[] array={1,2,3,5,9,8,2,4};
		for(int i=0;i<array.length;i++)
		{
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		for(int count = 0;count<array.length;count++)
		{
			if(count==array.length-1)
			System.out.print(array[count]);
			else
			System.out.print(array[count]+",");
		}
	}
}