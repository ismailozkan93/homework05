package day31abstraction;

public class Cat extends Mammal {

	/*1)Concrete class'lar parentleri olan abstract classlardaki tüm abstract methodlari
	 *override etmek zorundadirlar.Aksi takdirde CTE OLUSUR.
	 * 2)Concrete class'lar parentlari olan abstract class'lardaki methodlari overrid etmek 
	 * zorunda degildirler.Concerete methodlarin override edilmesi istege baglidir.
	 * 3))Concrete class'lar tüm abstract parentlarindaki tüm abstract methodlari 
	 * override etmek zorundadirlar.Aksi takdirde CTE olusur.
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void asi() {
		System.out.println("Ey kedi asi ol");
		
	}

	@Override
	public void drink() {
		System.out.println("Su ic");
		
	}

	@Override
	public void feed() {
		System.out.println("Yavrularini beslerler");
		
	}

}
