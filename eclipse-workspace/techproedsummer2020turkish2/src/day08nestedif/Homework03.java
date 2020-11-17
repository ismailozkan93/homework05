package day08nestedif;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		/*Kullanıcıdan alacağı ürün miktarını ve ürünün birim ﬁyatını alın. 
		 * Eğer urun miktarı 1000 den fazla ise  Kullanıcıya %10 indirim yapın 
		 * ve ödemesi gereken toplam parayı ekrana yazdırın. Diğer durumlarda  
		 * ödemesi gereken toplam parayı herhangi bir indirim yapmadan ekrana yazdırın.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Ürün giriniz");
		int ürün = scan.nextInt();
		System.out.println("Birim Fiyatini Giriniz");
		double fiyat = scan.nextDouble();
		
		double toplam = ürün>1000? (ürün*fiyat*0.9):(ürün*fiyat);
		System.out.println(toplam);
	}

}
