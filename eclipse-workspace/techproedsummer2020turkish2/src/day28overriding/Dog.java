package day28overriding;

public class Dog extends Animal {

	/*
	 *1)Parent'taki method'u method signature'ini degistirmeden method body'sini
	 *degistirerek Child class'da kullanmaya "Method Overriding" denir. 
	 *2)Parent class'daki private methodlar override edilemezler.
	 *3)Final methodlar override edilemezler.Cunku final methodlarin bodyleri olabilcekleri
	 *son haldedir yani method bodyleri degistirilemez.Halbuki overridingîn amaci method body'i
	 *degistirerek methodu kullanmaktadir.Bu celiskiden dolayi Java final methodlarin override
	 *edilmesine musaade etmez
	 *4)Static methodlar override edilemezler.Cunku static methodlar zaten ortak kullanima aciktir.
	 *onun body'sini degistirmek herkesi etkiler bu yüzden Java static methodlarin override 
	 *edilmesine musaade etmez.
	 *5)Child class'daki override edilmis method'un(Overriding Method)access modifier'i parent class'daki
	 *override edilen method'un (Overridden Method'undan)access modifierindan daha dar olamaz.
	 *6)Child class'daki override edilmis methodun return type ile ayni olur veya onun childlarindan biri
	 *olabilir.
	 *
	 *
	 */
	
	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.sound();
	
	}
	public void sound() {
		System.out.println("Havlarlar");
	}
	@Override//Annotation:Bu asagidaki methodun override kuralina uygun olarak 
		//override edilip edilmedigini kontrol eder.
	public void numOfFoot() {
		System.out.println("4 ayaklari vardir.");
	}
	

}
