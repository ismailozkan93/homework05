package Section03;

public class PrimitiveTypeVsReferance {

	public static void main(String[] args) {
		int i=1;
		
		int j=2;
		
		i=j;
		
		i++;
		
		Circle circle1=new Circle(5);
		
		Circle circle2=new Circle(10);
		
		System.out.println("c1: "+circle1.radius+"   c2: "+circle2.radius);
		
		circle1=circle2;
		
		circle1.radius=99;
		
		System.out.println(circle2.radius);//After Line 20 they show same Values.References are matching eachother
		
		
		
	}

}
