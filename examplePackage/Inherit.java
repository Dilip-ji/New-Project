package examplePackage;
import inheritence.*;

 class Inherit extends Animal {     // Inherit and Animal both are different package
	public static void main(String args[])
	{
		Inherit ih = new Inherit();
		ih.bark();
		ih.meuw();           // public modifier can be access in different package
		ih.squeak();         // protected modifier can be access in different package
		ih.roar();
	
	}

}
