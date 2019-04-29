class Task5
{
	public static void main(String[] args)
	{
		int[] array={2,5,3,7};
		int largest = array[0];
		for(int i=0;i<array.length;i++)
		{
			if(largest<array[i])
			{
				largest = array[i];
			}
		}
		System.out.println("Largest = "+largest);
	}
}