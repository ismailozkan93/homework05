package Section02;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle1=new Circle();//Constructor has same name with class but it does not have return type.
		
		circle1.RadiusUpdate(23.45);
		System.out.println(circle1.calculateArea());
		
		Circle circle2;
		System.out.println(new Circle(5.0).calculateArea());
		
		
		
	}

}
