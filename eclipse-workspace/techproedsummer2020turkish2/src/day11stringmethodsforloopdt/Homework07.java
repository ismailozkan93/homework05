package day11stringmethodsforloopdt;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş  değerlerini alın
		// ve başlangıç değerinden başlayıp bitiş değerinde  biten tüm tamsayıları ekrana yazdırın.
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki sayi giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		for(int t=a; t<=b ;t++) {
			System.out.println(t);
		}
		
	
	}

}
