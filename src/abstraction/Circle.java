package abstraction;

public class Circle extends Shape {

	double radius;
	
	 public Circle(double radius) {
		 super("Circle");
	 }
	public static void main(String[] args) {
		Circle c = new Circle(5.6);
		c.draw();
		double result = c.calculateArea();
		System.out.println(result);
	}
	@Override
	public double calculateArea() {
      double result = 3.14 *radius * radius;
          return result;
	}
	@Override
	public void draw() {
         System.out.println("drawing "+name+" with radius "+radius);		
	}
	
	

}
