package day11stringmethodsforloopdt;

import java.util.Scanner;

public class Homework11 {

	public static void main(String[] args) {
		// Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp
		// bitiş değerinde  biten tüm tamsayıların çarpımını ekrana yazdırın.

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve Bitis degeri giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int product = 1;
		for(int i=a; i<=b;i++) {
		product = product*i;	
		}
System.out.println("carpim: " + product);
	}

}
