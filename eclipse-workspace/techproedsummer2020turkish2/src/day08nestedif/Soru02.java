package day08nestedif;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {
		/*)Kullanıcıdan alacağı ürün miktarını ve ürünün birim ﬁyatını alın. 
		 * Eğer urun miktarı 1000 den fazla ise  Kullanıcıya %10 indirim yapın 
		 * ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda  
		 * ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ürün adedini giriniz");
		int adet = scan.nextInt();
		System.out.println("Ürün Birim Fiyatini Giriniz");
		int fiyat = scan.nextInt();
		
		if(adet>1000) {
			System.out.println("Indirimli Fiyat: " + fiyat*0.9*adet);
		}
	
		else {
			System.out.println("Normal Fiyat: " + fiyat*adet);
		}	
	}
}
