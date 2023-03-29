import java.util.Scanner;
public class InputNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
System.out.println("Enter first Value");
int x= scanner.nextInt();
System.out.println("Enter Second value");
int y= scanner.nextInt();
int sum = x+y;
System.out.println("sum of Value is: " +sum);
System.out.println("Enter Chanracter ?");

String ch=scanner.next();
System.out.println("Your Enter Character is: " +ch);
	}

}

