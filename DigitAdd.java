import java.util.Scanner;
class DigitAdd
{
public static void main(String args[])
{
int number,digit,sum=0;
Scanner input = new Scanner (System.in);
System.out.println("Enter input between 0 to 1000 : "); 
number=input.nextInt();
System.out.println("The sum of all digits in "+ number +" is ");
while(number>0)
{
digit=number % 10;
sum = sum + digit;
number= number/10;
}
System.out.println(sum);

System.out.println("Thanks for using our service");
}
}
