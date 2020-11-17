package day08nestedif;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın 
		 * eğer iki kenar uzunluğu birbirine eşit ise ekrana  “Ikizkenar Ucgen” yazdırın.
		 *  Diğer durumlarda ekrana “Ikizkenar değil” yazdırın.
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("kenar uzunluklarini giriniz");
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		String sonuc = A == B || B==C || A==C ? "Ikizkenar Ucgen" : "Ikizkenar Degil";
		System.out.println("Sonuc: " + sonuc);
	}

}
