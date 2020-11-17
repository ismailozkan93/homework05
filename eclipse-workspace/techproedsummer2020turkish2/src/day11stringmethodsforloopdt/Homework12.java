package day11stringmethodsforloopdt;

import java.util.Scanner;

public class Homework12 {

	public static void main(String[] args) {
	//Kullanıcıdan başlangıç ve bitiş  harﬂerini alın ve başlangıç harﬁnden başlayıp
	//	bitiş harﬁnde  biten tüm harﬂeri büyük harf olarak ekrana yazdırın.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve Bitis degeri giriniz");
		char a = scan.next().charAt(0);
		char b = scan.next().charAt(0);
		for(char i= a; i<=b ;i++) {
		System.out.println(Character.toUpperCase(i));	
		}
	}

}
