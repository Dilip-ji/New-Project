import java.util.Scanner;
class Year
{
public static void main(String args[])
{
Scanner min = new Scanner(System.in);
System.out.println("Input the number of minutes : ");
int m = min.nextInt();
System.out.print(m +" minutes is approximately : ");
int d=m%525600/1440; 
m=m/525600;
System.out.print(m+" years and "+d+" days");
}
}