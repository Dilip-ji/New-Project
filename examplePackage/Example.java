package examplePackage;

import accessModifier.C;

public class Example {
	public static void main(String args[]) {
		C p = new C();
		p.show();              // Default can access inside of different package
		p.display();   // Only Public can access inside of different package
		p.get();               // Private can not access inside of different package
		p.set();               // Protected can access inside of different package
	}
}
