package day27inheritance;

/*
 * 1)Java'da bir class sadece bir class'a extend edebilir.Java'da bir class'in
 * sadece bir tane parent'i olabilir.Java multiple inheritance'i onaylamaz.
 * 2)protected ve public methodlar inheritance'a uygundurlar.
 * 	private method'lar inheritance'a uygun degildirler.
 * 	default ayni package'da iseniz inheritance'a uygundur ama farkli package'da
 * iseniz uygun degildir.Kullanmak risklidir bu yüzden inheritance'da default
 * access modifier kullanilmaz.
 * 3)Parent class= super class
 * 	 child class= Sub class
 * 4)Her constructor'un ilk satirinda(aksi bir hamle yapilmadigi sürece)"super()"
 * constructor call' u vardir.Super() yazmak istege baglidir,yazsaniz da yazmasanizda
 * super() otomatik olarak calisir.
 */

public class Dog extends Mammal{

	public boolean loyal=true;
	
	public Dog() {
		super();//Istege baglidir,zorunlu degildir.
		System.out.println("Dog");
	}
	
	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.eat();
		dog.smell();
		dog.drink();
		dog.eat();
		dog.bark();
		System.out.println("sadik? "+ dog.loyal);	
		System.out.println("dogum? "+ dog.dogum);
		System.out.println("Yas? "+dog.age);
		
	}

	public void bark() {
		System.out.println("Havlarlar");
	}
	public void smell() {
		System.out.println("Iyi koku alirlar");
	}
}
