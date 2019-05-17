/*7. Write a program that reads two strings in the following format:
Ali, 18, BE-Software; Aisha, 19, BE-Electronics;
and prints the following output:
Student 1
Name: Ali
Age: 18
Program: BE-Software
Student 2
Name: Aisha
Age: 19
Program: BE-Electronics*/

import java.util.*;
class Student{
	public String name;
	public String age;
	public String program;
}
class Task7
{
	public static void main(String[] args)
	{
		String s="Ali,18,BE_Software; Aisha,19,BE_Software;";
		String[] arrOfS = s.split(";");
		String[] arrofs1 = arrOfS[0].split(",");
		String[] arrofs2 = arrOfS[1].split(",");
		System.out.println("Student 1");
		System.out.println("Name = "+arrofs1[0]);
		System.out.println("Age = "+arrofs1[1]);
		System.out.println("Program = "+arrofs1[2]);
		System.out.println("Student 2");
		System.out.println("Name = "+arrofs2[0]);
		System.out.println("Age = "+arrofs2[1]);
		System.out.println("Program = "+arrofs2[2]);
	}
}