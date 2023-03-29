package assignement;
class Employee
{
	
	String EmployeeName;
	double hra;
	double pf, deduction,da, salary;
	
	public void EmployeeDetails()
	{
		System.out.println("Emplyee Name is: "+ EmployeeName);
		System.out.println("HRA: "+hra);
		System.out.println("PF: "+pf);
		System.out.println("Deduction: "+deduction);
		System.out.println("DA: "+ da);
	}
	
	public void totalSalary()
	{
		System.out.println("Employee salary is  "+salary);
	}
}

