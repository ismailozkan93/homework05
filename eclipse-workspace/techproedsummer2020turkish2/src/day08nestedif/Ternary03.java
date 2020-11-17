package day08nestedif;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		/*Kullanicidan bir karakter aliniz
		 * Eger character bir harf ise "Harf"
		 * diger durumda "harf degil" yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Harf Giriniz");
		char harf = scan.next().charAt(0);
		
		String a = (harf>= 'a' && harf<= 'z')||(harf>='A' && harf<='Z')? "Harf":"Harf Degil";
		System.out.println(a);
		scan.close();
	}

}
