/*5. Create a class 'Student' with three data members which are name, age and
address. The constructor of the class assigns default values name as
"unknown", age as '0' and address as "not available". It has two members
with the same name 'setInfo'. First method has two parameters for name and
age and assigns the same whereas the second method takes has three
parameters which are assigned to name, age and address respectively. Print
the name, age and address of 10 students.
Hint - Use array of objects */

class Task5
{
	public static void main(String[] args)
	{
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		Student student6 = new Student();
		Student student7 = new Student();
		Student student8 = new Student();
		Student student9 = new Student();
		Student student10 = new Student();
		student1.setInfo("Yasir",20,"Room no 212");
		student2.setInfo("Usama",18,"Room no 212");
		student3.setInfo("Meesum",25,"Room no 213");
		student4.setInfo("Mehtab",17,"Room no 213");
		student5.setInfo("Toseef",18,"Room no 226");
		student6.setInfo("Hakim",18,"Room no 226");
		student7.setInfo("Hassnain",18,"Room no 226");
		student8.setInfo("Moiz",17,"Room no 126");
		student9.setInfo("Altamash",18,"Room no 125");
		student10.setInfo("Zain",20,"Room no 123");
		Student[] students = {student1,student2,student3,student4,student5,student6,student7,student8,student9,student10};
			for(int i=0;i<students.length;i++)
			{
				System.out.println(students[i].toString());
			}
	}
}
class Student{
	private String name;
	private int age;
	private String address;
	public Student()
	{
		this.name="Unknown";
		this.age=0;
		this.address="Not available";
	}
	public void setInfo(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public void setInfo(String name,int age,String address)
	{
		this.name=name;
		this.age=age;
		this.address=address;
	}
	public String toString()
	{
		return ("Name = "+name+", Age = "+age+", Adress = "+address);
	}
}
	