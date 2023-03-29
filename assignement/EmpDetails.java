package assignement;

public class EmpDetails 
{

	public static void main(String[] args) 
{
		Employee emp=new Employee();
		emp.EmployeeName="Dileep";
		emp.hra=5000;
		emp.pf=1750.00;
		emp.deduction=2500.88;
		emp.da=3032;
		emp.EmployeeDetails();
		emp.salary=emp.hra+emp.pf+emp.deduction+emp.da;
		emp.totalSalary();
		
		
	}

}
