/*5. Create Marksheet class having three subjects as variables, methods
for calculating total marks, percentage, and grade.*/

class Marksheet {

	int oop;
	int dcld;
	int laag;
	int obtainedMarks;
	double percentage;
	char grade;
	Marksheet(int oop,int dcld,int laag)
	{
		this.oop=oop;
		this.dcld=dcld;
		this.laag=laag;
	}
	public int calcObtainedMarks()
	{
		obtainedMarks=oop+laag+dcld;
		return obtainedMarks;
	}
	public double calcPercent()
	{
		percentage=(obtainedMarks*100)/300;
		return percentage;
	}
	public char calcGrade()
	{
		if(percentage>=80){grade='A';}
		else if(percentage>=70 && percentage<80){grade='B';}
		else if(percentage>=60 && percentage<70){grade='C';}
		else if(percentage>=50 && percentage<60){grade='D';}
		else if(percentage<50){grade='F';}
		return grade;
	}
	public static void main(String[] args) {
		Marksheet marksheet=new Marksheet(90,75,80);
		System.out.println("Obtained marks = "+marksheet.calcObtainedMarks());
		System.out.println("Percentage = "+marksheet.calcPercent());
		System.out.println("Grade = "+marksheet.calcGrade());
	}
}