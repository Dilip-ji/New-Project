import java.util.Scanner;
class BodyMassIndex
{
public static void main(String args[])
{
Scanner body = new Scanner(System.in);
System.out.println("Enter your height in inches : ");
float i=body.nextFloat();
System.out.println("Enter your weight in pounds : ");
float p=body.nextFloat();
float BMI = (p/(i*i)*703);
System.out.println("Body Mass Index (BMI) is : "+BMI);
if(BMI<=18.5)
{
System.out.println("You are Underweigh");
}
else if(BMI>18.5 && BMI<=24.9)
{
System.out.println("You are  Healthy Weight");
}
else if(BMI>24.9 && BMI<=29.9)
{
System.out.println("You are Overweight");
}
else
{
System.out.println("You are Obesity");
}
System.out.println("Thanks for using our services");
}
}
