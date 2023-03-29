import java.util.Scanner;
class GreatestNumber
{
public static void main(String args[])
{
Scanner number = new Scanner(System.in);
System.out.println("Enter the 1st Number : ");
int a = number.nextInt();
System.out.println("Enter the 2nd Number : ");
int b = number.nextInt();
System.out.println("Enter the 3rd Number : ");
int c = number.nextInt();
if(a>b && a>c)
{
System.out.println("The greatest : " + a);
}else if (b>a && b>c)
{
System.out.println("The greatest : " + b);
}else
{
System.out.println("The greatest : " + c);
}

}
}