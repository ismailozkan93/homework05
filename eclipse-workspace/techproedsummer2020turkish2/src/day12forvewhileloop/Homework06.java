package day12forvewhileloop;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş  harﬂerini alın ve başlangıç harﬁnden 
		//   başlayıp bitiş harﬁnde  biten tüm harﬂeri büyük harf olarak ekrana yazdırın.
		//Kullanıcının hata yapmadığını farz edin.
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve bitis harflerini giriniz");
		char ch1 = scan.next().charAt(0);
		char ch2 = scan.next().charAt(0);
		
				while(ch1<=ch2) {
			System.out.println(Character.toUpperCase(ch1));
			ch1++;
		}
	
	}

}
