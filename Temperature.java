import java.util.Scanner;
class Temperature
{
public static void main(String args[])
{
Scanner digit=new Scanner(System.in);
System.out.println("Enter the celsius value : ");
float c = digit.nextFloat();
System.out.println(c+" Celsius value is equal to : " +((c*9/5)+32)+" Fahrenheit");

System.out.println("Enter the fahrenheit value : ");
float f = digit.nextFloat();
System.out.println(f+" Fahrenheit value is equal to : " +((f-32)*5/9)+" Celsius");

System.out.println("Thanks for using our service");
}
}

