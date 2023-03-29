package inheritence;

public class UseThis extends UseExtend{
int c=10;
int d= 20;
public void show()
{
	int c=1;
	int d =2;
	System.out.println("C + D : "+(c+d));             //Call the local variable first
	System.out.println("C + D : "+(this.c+this.d));  // define instance variable 
	System.out.println("C + D : "+(super.c+super.d)); //super define super or parent class variable
}
public static void main(String args[])
{
	UseThis ut =new UseThis();
	ut.show();
	
}
}
