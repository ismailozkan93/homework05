package day08nestedif;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*Kullanicidan cinsiyetini ve yasini aliniz
		 * erkek ve 18 yasindan kucukse "Erkek Cocuk"
		 * diger durumlarda "adam"
		 * kadin ve 18 yasindan kucukse "kiz Cocuk"
		 * diger durumlarda "Bayan"
		 * Diger cinsiyetler icin tanimlamadi yazalim
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("Cinsiyetinizi giriniz,Erkek/Kadin");
	String cinsiyet = scan.next();
	System.out.println("Yasinizi giriniz");
	int yas = scan.nextInt();
	
	if(cinsiyet.equals("Erkek")) {
		if(yas<18) {
			System.out.println("Erkek Cocuk");
		}
		else {
			System.out.println("Bay");
		}
		
	}
	else if(cinsiyet.equals("Kadin")) {
		if(yas<18) {
			System.out.println("Kiz Cocuk");
		}
		else {
			System.out.println("Bayan");
		}
	}
	else {
		System.out.println("Tanimlanmadi");
	}
scan.close();	
	}

}
