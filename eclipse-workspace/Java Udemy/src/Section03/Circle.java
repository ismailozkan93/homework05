package Section03;

public class Circle {

	double radius;
	
	public Circle(double d) {
		radius=d;
	}

	public Circle() {
		// TODO Auto-generated constructor stub
	}

	double calculateArea() {
		return radius * radius * Math.PI;
	}

	double calculateArea(double y) {
		radius=y;
		return radius * radius * Math.PI;
	}
	
	double calculatePerimeter() {
		return 2 * radius * Math.PI;
	}
	void RadiusUpdate(double y) {
		radius=y;
	}	
}
//Math Max(a,b) is a method of class and all Math classes are static.
//But calculateArea() is not static  