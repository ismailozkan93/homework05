package day08nestedif;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir harf alın eğer harf büyük harf ise ekrana “Büyük harf” yazdırın. 
		 *  Diğer durumlarda ekrana “Büyük harf degil” yazdırın.
		 */

		Scanner scan = new Scanner(System.in);
		char harf = scan.next().charAt(0);
		
		
		String ekran = (harf >='A' && harf <= 'Z') ?	"Büyük Harf" : "Büyük Harf Degil ";
		System.out.println(ekran);
		
		
		
		
	}

}
