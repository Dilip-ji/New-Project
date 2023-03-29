import java.util.Scanner;
class OperatorDemo{
public static void main(String args [])
{
Scanner input = new Scanner(System.in);
int a =input.nextInt();
System.out.println("Enter 1st Number : "+a);
int b =input.nextInt();
System.out.println("Enter 2nd Number : "+b);

System.out.println("Sum of two Numbers : "+(a+b));
if(a>b)
{
System.out.println("Difference of two Numbers : "+(a-b));
}else
{
System.out.println("Difference of two Numbers : "+(b-a));
}
System.out.println("Product of two Nunbers : "+(a*b));
System.out.println("Average of two Numbers : "+(a+b/2));
if(a>b){
System.out.println("Max Number : "+a);
}else
{
System.out.println("Max Number : "+b);
}
if(a<b){
System.out.println("Min Number : "+a);
}else
{
System.out.println("Min Number : "+b);
}
System.out.println("Thanks for using our service");

}}