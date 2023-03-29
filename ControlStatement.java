import java.util.Scanner;
public class ControlStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner person = new Scanner (System.in);
		System.out.println("Are you Disable person ? : ");
		String disability = person.next();
		
		if(disability != "yes") //if else control statement and Nested if (if is inside of if)
		{
	Scanner enter = new Scanner (System.in);
	System.out.println("Please Enter your age : ");
	int age = enter.nextInt();
	
   if (age>18 && age<70)
   {
	System.out.println("You age eligible for driving licence"); // if control statement
   }

   if(age<18) {
	System.out.println("You age Minor and not eligible for driving licence");// if control statement
   }
    if(age>70) {
	System.out.println("You age old person and not eligible for driving licence");// if control statement
   } 
   }else        //if else control statement
     {
	System.out.println("You are disable person and not eligible for driving licence");
     }
System.out.println("Thank you for using our service");

	}

}
