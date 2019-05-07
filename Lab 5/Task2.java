/*2. Create a java class having an integer type array as instance variable.
Create a function; populateArray() to fill in the array by taking user
input. Create another function for printing the number of even and odd
numbers in the array.*/

import java.util.*;
class Task2

{
	int arr[]= new int[10];
	int even=0,odd=0;
	// array initaializer 
	public void populateArray()
	{
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){arr[i]=sc.nextInt();}		
	}
	//Even Odd Counter
	public void countArray()
	{
		for(int i=0;i<arr.length;i++){
			
			if(arr[i]%2==0){
				this.even++;
			}
			else{
				this.odd++;
			}
		}
	}
	//MAIN
	public static void main(String args[])
	{
		Task2 myArray = new Task2();
		myArray.populateArray();
		myArray.countArray();
		System.out.println("No. of even numbers in array = "+arrr.even+"\n"+"No. of odd numbers in array = "+arrr.odd);
	}
  	
}