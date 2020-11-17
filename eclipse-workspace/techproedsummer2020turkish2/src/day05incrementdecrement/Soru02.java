package day05incrementdecrement;

import java.util.Scanner;

public class Soru02 {

	public static void main(String[] args) {

		/* 
		0)sayilari kullanicidan aliniz
		 1)Iki tane integer variable olusturun.
		2)Sonra bu integerlerin degerlerinin yerlerini degistirin(swap).
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci Sayiyi Giriniz");
		int s1 = scan.nextInt();
		System.out.println("Ikinci Sayiyi Giriniz");
		int s2 = scan.nextInt();
		
		s1 = s1 + s2;
		s2 = s1 - s2; 
		s1 = s1 - s2;
		
		System.out.println(s1 + " " + s2);
		
		
		
		
		
		
	}

}
