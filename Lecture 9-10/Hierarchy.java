class Person
{
	protected String name;
	Person(String s)
	{
	name=s;
	}
}
class Student extends Person
{
	protected String id;
	Student(String d)
	{super("Ahmed");
	id=d;
	}
}
class Employee extends Person
{
	protected int salary;
	Employee(int s)
	{
	super("Ali");
	salary=s;
	}
}
class UnderGradute extends Student
{
	protected double gpa;
	UnderGradute(double g)
	{
	super("18sw51");
	gpa=g;
	}
} 
class Graduate extends Student
{
	protected double cgpa;
	Graduate(double c)
	{super("18sw57");
	cgpa=c;
	}
}
class Faculty extends Employee
{
	protected String designation;
	Faculty(String d)
	{super(80000);
	designation=d;
	}
}
class Staff extends Employee
{
	protected String post;
	Staff(String p)
	{super(8000);
	post=p;
	}
}
class Hierarchy
{
	public static void main(String[] args)
	{
	Staff obj1 = new Staff("peon");
	Faculty obj2 = new Faculty("Professor");
	Graduate obj3 = new Graduate(78.3);
	UnderGradute obj4 = new UnderGradute(82);
	System.out.println("Post = "+obj1.post);
	System.out.println("Name = "+obj1.name);
	System.out.println("Salary = "+obj1.salary);
	System.out.println("Designation = "+obj2.designation);
	System.out.println("Name = "+obj2.name);
	System.out.println("Salary = "+obj2.salary);
	System.out.println("Name of Graduate = "+obj3.name);
	System.out.println("ID = "+obj3.id);
	System.out.println("CGPA = "+obj3.cgpa);
	System.out.println("Name of UnderGraduate = "+obj4.name);
	System.out.println("ID = "+obj4.id);
	System.out.println("GPA = "+obj4.gpa);
	}
}