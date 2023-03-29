import java.util.Scanner;
class Leangth
{
public static void main(String args[])
{
Scanner dist = new Scanner (System.in);
System.out.println("Enter leangth in inches : "); 
float i=dist.nextFloat();
System.out.println(i +" inches is " +i/39.37 +"Meters");
System.out.println("Enter leangth in meter : "); 
float m=dist.nextFloat();
System.out.println(m +" inches is " +m*39.37 +"Inches");
System.out.println("Thanks for using our service");
}
}
