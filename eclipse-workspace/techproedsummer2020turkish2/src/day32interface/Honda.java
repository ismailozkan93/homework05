package day32interface;

public class Honda implements Car, Klima {

	/*
	 * 1)Bir class'i bir interface'in child'i yapmak icin "implements" keyword kullaniriz.
	 * 2)Abstract class kullanarak abstraction yaparsak bir class'a 1'den fazla parent koyamayiz
	 * cunku java multiple inheritance'a müsaade etmez.Bu yüzden interface kullaniriz ve bir class
	 * icin 1'den fazla parent olusturarak calisabiliriz.
	 * 3)Birden fazla interface bir class icin parent yaptigimizda,parent olan interfacelarin ayni isimli
	 * methodlar kullanabilirsiniz ama ayni isimli methodlarin return type lari kullnmak zorundadir.Ayni 
	 * olmassa CTE alirsiniz.
	 * 4)1'den fazla interface'i bir class icin parent yaptiginizda,parent olan
	 * Interface'lerde ayni isimli variable'lar kullanabilirsiniz.Ancak hangi variable kullanacaginiza interface
	 * ismini kullanarak siz karar vermelisiniz.Aksii takdirde Java hangisini kullanacagina karar veremez bu
	 * yüzden CTE alirsiniz.  
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {

		Honda honda = new Honda();
		honda.antiBakteri();
		honda.isitma();
		honda.direksiyon();
		honda.motor();
		honda.teker();
		
		System.out.println(Car.i);
		System.out.println(Klima.i);
	}

	@Override
	public void motor() {
	System.out.println("1.6 VTEC Diesel");
		
	}

	@Override
	public void direksiyon() {
		System.out.println("Suni deri");
		
	}

	@Override
	public void teker() {
	System.out.println("16 inc alasim");
		
	}

	@Override
	public void fiyat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void isitma() {
		System.out.println("Isitma var");
		
	}

	@Override
	public void antiBakteri() {
		System.out.println("99% bakteri koruma");
		
	}

	


}
