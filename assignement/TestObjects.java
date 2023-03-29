package assignement;

public class TestObjects {
	
	public  void calculatePlotCost(int area, float costPerSqYd) {
		System.out.println("Cost = "+(area*costPerSqYd));
	}

	public static void main(String[] args) {
		 
		TestObjects testObject = new TestObjects();
		
		Shape square = new Shape(55,"Square");
		//square.area(55,"Square");
		
		Shape rectangle = new Shape(50, 40, "Rectangle");
		//rectangle.area(50, 40, "Rectangle");
		
		Shape cuboid = new Shape(30, 30, 30, "Cuboid");
		//cuboid.area(30, 30, 30, "Cuboid");
		
		Shape circle = new Shape(50, 3.14f, "Circle");
		//circle.area(50, 3.14f, "Circle");
		
		Shape triangle = new Shape(25, 30, "Triangle",0.5f);
		//triangle.area(25, 30, "Triangle",0.5f);
		
		Shape rhombus = new Shape(25, 25, "Rhombus",0.5f);
		//rhombus.area(25, 25, "Rhombus",0.5f);
		
		Shape square1 = new Shape(35);
		//int area = square1.area(35);
		
		
		testObject.calculatePlotCost(35,25);
		
		
	}

}
