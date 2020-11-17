package day26passbyvaluableinheritance;

public class Cat extends Mammal {

	public static void main(String[] args) {
		Cat oc = new Cat();
		oc.clean();
		oc.drink();
		oc.eat();
		oc.feed();
		oc.meow();

	}

	public static void meow() {
		System.out.println("Miyavlarlar");
	}
	
	public static void clean() {
		System.out.println("Temizlenirler");
	}
	
}
