package day12forvewhileloop;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		/*Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp 
		 * bitiş değerinde  biten tüm tamsayıların toplamını ekrana yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve Bitis degeri giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int sum = 0;
		while(a<=b) {
			sum = sum+a;
			a++;
		}
		System.out.println("toplam: "+ sum);
	}

}
