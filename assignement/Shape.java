package assignement;

public class Shape {
	
	int dimemsion1;
	int demension2;
	int dimension3;
	String shape;
	int area;
	
	// constructor overloading
	
	public Shape(int dimension1,String shape){   // constructor created with same class name 
		System.out.println("Area of "+shape+" = "+(dimension1*dimension1));	
	}
	public Shape(int dimension1) {
		System.out.println("Area of "+shape+" = "+dimension1*dimension1);
	}
	public Shape(int dimension1, float piValue,String shape) {
		System.out.println("Area of "+shape+" = "+(piValue*dimension1*dimension1));
	}
	
	public Shape(int dimension1, int demenstion2,String shape) {
		System.out.println("Area of "+shape+" = "+(dimension1*dimension1));
	}
	public Shape(int dimension1, int demenstion2,String shape,float value) {
		System.out.println("Area of "+shape+" = "+(value*dimension1*dimension1));
	}
	
	public Shape(int dimension1, int demension2, int dimension3,String shape) {
		System.out.println("Area of "+shape+" = "+
	(2*(dimension1*demension2)+(demension2*dimension3)+(dimension3*dimension1)));
	}
	
	// If method name is same and have different parameters then that 
	// methods are called as overloading
	
	/* public void area(int dimension1,String shape) {
		System.out.println("Area of "+shape+" = "+(dimension1*dimension1));
		
	}
	
	public int area(int dimension1) {
		return area=dimension1*dimension1;
		
	}
	
	public void area(int dimension1, float piValue,String shape) {
		System.out.println("Area of "+shape+" = "+(piValue*dimension1*dimension1));
		
	}
	
	public void area(int dimension1, int demenstion2,String shape) {
		System.out.println("Area of "+shape+" = "+(dimension1*dimension1));
	}
	
	public void area(int dimension1, int demenstion2,String shape,float value) {
		System.out.println("Area of "+shape+" = "+(value*dimension1*dimension1));
	}
	
	public void area(int dimension1, int demension2, int dimension3,String shape) {
		System.out.println("Area of "+shape+" = "+
	(2*(dimension1*demension2)+(demension2*dimension3)+(dimension3*dimension1)));
	}
	*/
	
	

}
