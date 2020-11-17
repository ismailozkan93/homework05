package day08nestedif;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir tamsayı alın eğer tamsayı 0 dan kucuk ise ekrana “Negatif” yazdırın.  
		 * Diğer durumlarda ekrana “Negatif degil” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi giriniz");
		int s = scan.nextInt();
		
		String sonuc= s<0? "Negatif" : "Negatif degil";
		System.out.println("Sonuc: " + sonuc);
		
		
		
		
	}

}
