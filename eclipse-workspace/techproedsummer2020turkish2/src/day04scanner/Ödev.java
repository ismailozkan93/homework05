package day04scanner;

import java.util.Scanner;

public class Ödev {

	public static void main(String[] args) {
		// Kullanıcıdan ad ve soyadını alıp ekrana yazdıran bir program yazınız. 
		Scanner scan = new Scanner(System.in);
		System.out.println("Adinizi Giriniz");
		String ad = scan.nextLine();
		System.out.println("Soyadinizi Giriniz");
		String soyAd = scan.nextLine();

		//Kullanıcıdan ad, soyad ve adresini alıp ekrana yazdıran bir program yazınız.Ad ve soyad ilk satırda, adres ikinci satırda olsun. 
		System.out.println("Ad ve Soyad Giriniz");
		String adSoyAd = scan.nextLine();
		System.out.println("Adres Giriniz");
		String adres = scan.nextLine();
		
		scan.close();
		
		
		
		
		
		
	}

}
