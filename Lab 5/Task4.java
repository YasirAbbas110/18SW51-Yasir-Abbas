/*4. Create a Student class that stores student data, provides methods for
initializing and displaying student data. Also provide a parameterized
constructor for initializing student class data members.*/

class Student{
	String name;
	String rollNo;
	int age;

	Student(String name,String rollNo,int age){
 		this.name=name;
 		this.rollNo=rollNo;
 		this.age=age; 		
 	}
 	public void showDetails(){
 		System.out.println("****STUDENT DETAILS****");
 		System.out.println("Name : "+this.name);
 		System.out.println("RollNo : "+this.rollNo);
 		System.out.println("Name : "+this.age);
 	}
	public static void main(String args[]){
		Student student1 = new Student("Yasir","18SW51",20);
		student1.showDetails();
		
	}
}