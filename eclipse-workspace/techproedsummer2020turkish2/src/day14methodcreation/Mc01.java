package day14methodcreation;

public class Mc01 {
	//static methodlarin icinde kullanilan hersey static olmalidir.
	public static void main(String[] args) {
	toplama(3,5);//8
	cikarma(4,2);//2
	carpma(3,4);//12
	carpma(5);
	
	
	//Method cagrilirken parantez icindeki degerlere"argüment denir."
	String str = "Ali";
	
	
	}

	
	public static void toplama(int n1, int n2) {
		System.out.println(n1 + n2);
	}
	public static void cikarma(int n1, int n2) {
		System.out.println("sonuc:");
		System.out.println(n1-n2);
	}
	//carpma metodunu olusturun ve main methodun icinden cagirin
	
	/*1 )Ayni isimli method üretirken parametre sayisini degistirererk ayni isimli methodlar üretebilirsiniz.
	 *2 )Parametre sayilari ayni oldugu halde data type ini degistirerek ayni isimli metodlar uretebilirsiniz.
	* 3 )Parametrelerin data type lari farkli oldugunda parametrelerin yerlerini degistirerek ayni isimli metodlar üretebilirsiniz.
	*/
	public static void carpma(int n1,int n2) {
		System.out.println("Sonuc: ");
		System.out.println(n1*n2);
	}
	
	public static void carpma(int n1 ) {
		System.out.println("Ikinci carpma metodu: ");
	}
	public static void carpma(long n1) {
		System.out.println("Ücüncü carpma metodu");
	}
	public static void carpma(int n1,double n2) {
		System.out.println("Dorduncu carpma metodu");
	}
	public static void carpma(double n1, int n2) {
		System.out.println("Besinci carpma metodu");
	}
	/*1)Return Type lar degistirilerek method overloading yapilmaz.Yani;ismi ve paremetreleri ayni olan iki method
	 * return typelari farkli bile olsa java onlari ayni kabul eder.
	 *2)Access Modifier lar degistirilerek method overloading yapilmaz. Yani; ismi ve parametreleri ayni olan iki metod
	 *Acess Modiefierlari farkli bile olsa Java onlari ayni kabul eder.
	 *3)Method Bodyler degistirilerek method overloading yapilmaz.Yani; ismi ve parametreleri ayni bile olsa Java onlari
	 *ayni metod kabul eder. 
	 */
	//Note: Method Overloading Compile Time Polymorpfisim dir.
}
