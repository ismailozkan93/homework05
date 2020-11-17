package day12forvewhileloop;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		/*Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp 
		 * bitiş değerinde  biten tüm tamsayıların çarpımını ekrana yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve Bitis degeri giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int product = 1;
		while(a<=b) {
			product = product*a;
			a++;
		}
		System.out.println(product);
	}
}
