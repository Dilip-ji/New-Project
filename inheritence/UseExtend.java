package inheritence;

public class UseExtend extends Animal{  // both classes are same package
	int c=100;
	int d=200;
	public static void main(String args[])
	{
		UseExtend ue =new UseExtend();
		ue.bark();
		ue.meuw();
		ue.squeak();
		//ue.roar(); //Only private access modifier can not access in same package using inheritance
	}

}
