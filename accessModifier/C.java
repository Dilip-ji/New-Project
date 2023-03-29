package accessModifier;

public class C {
	
int x=10;  //Instance variable 
public int y = 20; // Instance variable with public access modifier 
private int z = 30; // Instance variable with private access modifier
protected int p = 50; // Instance variable with protected access modifier


void show()   //By default access modifier is 'default'
{
	System.out.println("X is :"+x);
}
public void display() {     // Method with public access modifier
System.out.println("X + Y :"+(x+y));
}
private void get() {   //Method with private access modifier
	System.out.println("X - Y)"+(z-y));
}
protected void set() {   // Method with protected access modifier
	System.out.println("X + Y + Z - A :"+(x+y+z-p));
}

public static void main(String args[]) {
	C p = new C();
	p.show();              // Default can access inside of same class
	p.display();           // Public can access inside of same class
	p.get();               // Private can access inside of same class
	p.set();               // Protected can access inside of same class
}
}