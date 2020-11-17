package day11stringmethodsforloopdt;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// Kullanıcıdan ilk ve soy ismini alın ilk ve soy isminin ilk harﬂerini büyük harf olarak ekrana yazdırın
		
			Scanner scan = new Scanner(System.in);
			System.out.println("isim  giriniz");
			String ad = scan.nextLine();
			System.out.println("Soyisim giriniz");
			String soyAd =scan.nextLine();
			System.out.println(ad.toUpperCase().charAt(0));
			System.out.println(soyAd.toUpperCase().charAt(0));
	}

}
