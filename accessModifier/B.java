package accessModifier;

public class B {
	public static void main(String args[]) {
		C p = new C();
		p.show();              // Default can access inside of same package
		p.display();           // Public can access inside of same package
		p.get();       // Private can not access inside of same package
		p.set();               // Protected can access inside of same package
	}
	}

