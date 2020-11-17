package day06ifstatementdt;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		/*)Kullanıcıdan alacağı ürün miktarını ve ürünün birim ﬁyatını alın. 
		 * Eğer urun miktarı 1000 den fazla ise  Kullanıcıya %10 indirim yapın 
		 * ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda  
		 * ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */

Scanner scan = new Scanner(System.in);
System.out.println("Ürün Miktarini Giriniz");
int ürünMiktar = scan.nextInt();

System.out.println("Ürünün Birim Fiyatini Giriniz");
int ürünFiyat = scan.nextInt();	

int toplam = ürünMiktar * ürünFiyat;
		
if(ürünMiktar > 1000){
	System.out.println("ödenmesi gereken: " + (toplam * 0.9));
}

else
	System.out.println("ödenmesi gereken: " + toplam );


	}

}
