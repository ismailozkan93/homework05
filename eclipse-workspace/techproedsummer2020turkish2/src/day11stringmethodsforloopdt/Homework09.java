package day11stringmethodsforloopdt;

import java.util.Scanner;

public class Homework09 {

	public static void main(String[] args) {
		/*Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden
		 *  veya sonrasından  başlayıp bitiş değerinde veya öncesinde biten 
		 *  tüm 3 ile bölünebilen tamsayıları ekrana yazdırın. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Iki sayi giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		for(int t=a; t<=b ;t++) {
			if(a%3==0) {
				System.out.println(t);
			}
		}
	}

}
