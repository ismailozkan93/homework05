package day03variables;

import java.util.Scanner;

public class Ödev {

	public static void main(String[] args) {
		//4.long min ve max degerlerini bulunuz
		//5.double min ve max degerlerini bulunuz

		long minValueLong = Long.MIN_VALUE;
		System.out.println(minValueLong);
		
		long maxValueLong = Long.MAX_VALUE;
		System.out.println(maxValueLong);
		
		double minValueDouble = Double.MIN_VALUE;
		System.out.println(minValueDouble);

		double maxValueDouble = Double.MAX_VALUE;
		System.out.println(maxValueDouble);
		
		//Kullanıcıdan karenin kenar uzunluğunu alin ve sonra bu karenin alan ve  çevresini hesaplayıp ekrana yazdıran bir program yazınız. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("karenin kenarinin degerigini giriniz");
		int kenar = scan.nextInt();
		System.out.println("Karenin Alan Degeri:");
		int alan = kenar*kenar;
		System.out.println(alan);
		
		System.out.println("Karenin Cevre Degeri:");
		int cevre= 4*kenar;
		System.out.println(cevre);
		
		//Kullanıcıdan alınan bir sayının küpünü hesaplayan bir program yazınız. 
		
		System.out.println("Bir sayi degerini giriniz");
		int sayi = scan.nextInt();
		
		System.out.println("Sayinin Küpünün Degeri:");
		int sayiKüp = sayi*sayi*sayi;
		System.out.println(sayiKüp);
		
		//Kullanıcıdan dikdörtgenin boyutlarını alan ve sonra diktörtgenin alan ve  cevresini hesaplayıp ekrana yazdıran bir program yazınız. 
		System.out.println("Dikdörtgenin eninin degerini giriniz");
		int dikdörtgenEn = scan.nextInt();
		
		System.out.println("Dikdörtgenin boyunun degerini giriniz");
		int dikdörtgenBoy = scan.nextInt();
		
		System.out.println("Dikdörtgenin Alan Degeri:");
		int dikdörtgenAlan = dikdörtgenEn*dikdörtgenBoy;
		System.out.println(dikdörtgenAlan);
		
		System.out.println("Dikdörtgenin Cevre Degeri:");
		int dikdörtgenCevre = 2*(dikdörtgenEn+dikdörtgenBoy);
		System.out.println(dikdörtgenCevre);
		
		//Boyutları kullanıcıdan alınan bir dikdörtgenler prizmasının hacmini hesaplayan bir program yazınız.
		System.out.println("Dikdörtgenler prizmasinin eninin degerini giriniz");
		int prizmaEn = scan.nextInt();
		
		System.out.println("Dikdörtgenler prizmasinin boyunun degerini giriniz");
		int prizmaBoy = scan.nextInt();
		
		System.out.println("Dikdörtgenler prizmasinin yükseklik degerini giriniz");
		int prizmaYük = scan.nextInt();
	
		System.out.println("Prizmanin Hacim Degeri:");
		int prizmaHacim = prizmaEn*prizmaBoy*prizmaYük;
		System.out.println(prizmaHacim);
		
		//)Yarıçapı kullanıcıdan alınan bir dairenin çevresini ve alanını hesaplayan  bir program yazınız. 
		System.out.println("Dairenin yaricapi degerini giriniz");
		float yariCap = scan.nextFloat();
		
		float daireAlan = yariCap*yariCap*3.14159f;
		System.out.println("Dairenin Alan Degeri:");
		System.out.println(daireAlan);
		
		float daireCevre = 2*yariCap*3.14159f;
		System.out.println("Dairenin Cevre Degeri:");
		System.out.println(daireCevre);
		
		//)Kenar uzunlukları kullanıcıdan alınan bir üçgenin çevresini hesaplayan bir  Program yazınız.
		System.out.println("Ücgenin a kenarinin degerini giriniz");
		byte kenarA = scan.nextByte();
		System.out.println("Ücgenin b kenarinin degerini giriniz");
		byte kenarB = scan.nextByte();
		System.out.println("Ücgenin c kenarinin degerini giriniz");
		byte kenarC = scan.nextByte();
		int ücgenCevre = (kenarA + kenarB + kenarC);
		System.out.println("Ücgenin Cevre Degeri:");
		System.out.println(ücgenCevre);
		
		//Mil’i kilometreye çeviren bir program yazınız.
		System.out.println("Kilometre degerini giriniz");
		double kilometre = scan.nextDouble();
		
		System.out.println("Mile cinsinden degeri:");
		double mileDeger = kilometre*1.6;
		System.out.println(mileDeger);
		
		
		//Saati saniyeye çeviren bir program yazınız.
		System.out.println("Saat degerini giriniz");
		long saat = scan.nextLong();
		
		System.out.println("Saniye degeri:");
		long saniye = saat*60*60;
		System.out.println(saniye);
		
		//1) Kullanıcıdan  “ * ” gibi bir sembol alin 2) Ekrana asagidaki sekli yazdırın
		System.out.println("Yildiz isareti giriniz");
		String isaret = scan.next();
		System.out.println(" "+" "+isaret);
		System.out.println(" "+isaret+" "+isaret);
		System.out.println(isaret+" "+isaret+" "+isaret);
		
		
		
		scan.close();
		
		
		
		
		
		
		
	}

}
