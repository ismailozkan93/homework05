package day24accesmodifierstringbuilder;
/*
 * 1)String class her degisim icin yeni bir String olusturur, var olan String'i degistirmez.
 * Bu yüzden Stringler "immutable"(Degistirilemezdir)'dir.
 * 
 * String Builder ise degisime aciktir,yeni String olusturmadan var olani degistirmek mümkündür.
 * StringBuilderlar "mutable" (Degistirelebilir) demektir.
 * 
 * 
 */


public class Sb01 {

	public static void main(String[] args) {
		// StringBuilder ile String olusturmak icin 3 farkli yol var.
		//1.yol
		StringBuilder stb1 = new StringBuilder();
		stb1.append("Java");
		System.out.println(stb1);
		
		stb1.append("Kolaydir");
		System.out.println(stb1);
		
		//2.Yol
		StringBuilder stb2 = new StringBuilder(5);
		stb2.append("Ali");
		System.out.println(stb2);
		stb2.append("Kazandi");//Alika dan sonrasi 5 karakteri gecsede AliKazandi yazar.StringBuilder degisime aciktir.
		System.out.println(stb2);
		
		//3.yol
		
		StringBuilder stb3 = new StringBuilder("Java");
		System.out.println(stb3);
		
		/*Soru 
		 * 1)3.yolu kullanarak 1 String olusturun.
		 * 2)Bu Stringe ekleme yapin.
		 * 3)Bu Stringin belli bir bölümünü ekrana yazdirin.
		 * 
		 */
		
		StringBuilder stb4 = new StringBuilder("An");
		stb4.append("kara").append("soguktur.");
		System.out.println(stb4);
		System.out.println(stb4.substring(2,stb4.length()-4));
		System.out.println(stb4.charAt(2));
		
		//delete() Birinci parametre dahil,ikinci parametre dahil degildir.
		System.out.println(stb4.delete(11,15));
		
		System.out.println(stb4.getClass());//class java.lang.StringBuilder
		System.out.println(stb4);
		System.out.println(stb4.indexOf("guk"));
		
		System.out.println(stb4.insert(6,","));
		
		System.out.println(	stb4.lastIndexOf("a"));
		
		System.out.println(stb4.length());
		
		System.out.println(stb4.replace(6, 9, "TO"));
		
		System.out.println(stb4.replace(6, 9, "sog"));
		
		//String tersten yazdirma loopile
		String s="";
		for(int i=stb4.length()-1;i>=0;i--) {
			s=s+stb4.charAt(i);
		}System.out.println(s);
		
		//String tersten yazdirma Stringbuilder
		System.out.println(stb4.reverse());
		
		stb4.setCharAt(0, 'a');
		System.out.println(stb4);
		
		
		//capacity() ve length() farki
		
		/* 1)Belirlenenen kapasiteyi gecerseniz kapasite belirlenen kapasitenin 2 katinin 2 fazlasi 
		 * olarak yazilir.Belirlenen kapasitenin 2 katinin 2 fazlasini da gecerseniz capacityle length ayni olur.
		 * 
		 */
	
		StringBuilder stb5 = new StringBuilder(11);
		stb5.append("Java");
		System.out.println(stb5.capacity());//2 katinin 2 fazlasini gecince capacity ile lengthi esitler
		System.out.println(stb5.length());
		

		//Önemli Not
		StringBuilder stb6 = new StringBuilder("Java Kolay");
		//StringBuilder class'inden gelen methodlar StringBuilder'i degistirir.
		stb6.append("X");
		System.out.println(stb6);
		
		//substring() String class'inin metodur bu yüzden StringBuilder'i update edemez.
		stb6.substring(5);
		System.out.println(stb6);
		
	}
}
