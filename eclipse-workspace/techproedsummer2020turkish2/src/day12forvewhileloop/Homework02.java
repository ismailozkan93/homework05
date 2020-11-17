package day12forvewhileloop;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
//		Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden
//		başlayıp bitiş değerinde  biten tüm tamsayıları while loop kullanarak ekrana yazdırınız. 

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve Bitis degeri giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		while(a<=b) {
			System.out.println(a);
			a++;
		}
		
		
		
	}
}
