/*Write a java program that calculates the sum of two 2-dimensional
arrays(Matrix) and saves the result in the third array and prints the
result along with the positions of each element.*/
class Task4
{
	public static void main(String[] args)
	{
		int[][] array1={{1,2},{4,5}};
		int[][] array2={{6,7},{8,9}};
		int[][] sum = new int[2][2];
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1[0].length;j++)
			{
				sum[i][j]=array1[i][j]+array2[i][j];
			}
		}
		for(int i=0;i<array1.length;i++)
		{
			for(int j=0;j<array1[0].length;j++)
			{
				System.out.print(sum[i][j]+" ");
			}
				System.out.println(" ");
		}
	}
}
