import java.util.Scanner;
class PostiveNegative
{
public static void main(String args[])
{
Scanner number= new Scanner(System.in);
System.out.println("Enter the number : ");
int n = number.nextInt();
if (n>=0)
{
System.out.println("Number is Postive");
}else
{
System.out.println("Number is Negative");
}
}
}