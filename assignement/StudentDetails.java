package assignement;

public class StudentDetails 
{
	String StudentName;
	int RollNo;
	double Sub1,Sub2,Sub3,Sub4,Sub5,Sub6;
	double totalMarks,Percentage;

	public void DisplayDetails(String StudentName,int RollNo, double Sub1,double Sub2,double Sub3,double Sub4,double Sub5,double Sub6)
	{
		System.out.println("Student Name: "+StudentName);
		System.out.println("Roll number: "+ RollNo);
		System.out.println("Marks of Sub1: "+ Sub1);
		System.out.println("Marks of Sub2: "+ Sub2);
		System.out.println("Marks of Sub3: "+Sub3);
		System.out.println("Marks of Sub4: "+Sub4);
		System.out.println("Marks of Sub5: "+Sub5);
		System.out.println("Marks of Sub6: "+Sub6);
		totalMarks=(Sub1+Sub2+Sub3+Sub4+Sub5+Sub6);
		System.out.println("Total Marks:"+totalMarks);
		Percentage=totalMarks*100/600;
		System.out.println("Percentage: "+Percentage);
	}
	
}

