package day26passbyvaluableinheritance;

public class Animal {

	public static void main(String[] args) {
		Animal oa = new Animal();
		oa.drink();
		oa.eat();
	
	}

	public static void eat() {
		System.out.println("Yemek yerler");
	}
	public static void drink() {
		System.out.println("Su icerler");
	}
	
	
	
	
	
}
