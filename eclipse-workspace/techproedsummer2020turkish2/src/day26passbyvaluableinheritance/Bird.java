package day26passbyvaluableinheritance;

public class Bird extends Animal {

	public static void main(String[] args) {
		
		Bird ob = new Bird();
		ob.drink();
		ob.eat();
		ob.fly();

	}

	public static void fly() {
		System.out.println("Ucarlar");
	}
	
	
}
