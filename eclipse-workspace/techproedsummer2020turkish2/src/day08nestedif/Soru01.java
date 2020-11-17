package day08nestedif;

import java.util.Scanner;

public class Soru01 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir yıl alın eğer yıl 1000’e bulunuyorsa ekrana “Milenyum” yazdırın.  
		 * Eğer yıl 100’e bulunuyorsa ekrana “Yüzyıl” yazdırın.
		 *  Eğer yıl 10’a bulunuyorsa ekrana “Onyıl” yazdırın
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Yili Giriniz");
		long yil = scan.nextLong();
		
		if(yil % 1000 == 0) {
			System.out.println("Milenyum");
		}
		else if(yil % 100 == 0) {
			System.out.println("Yüzyil");
		}
		else if(yil % 10 == 0){
			System.out.println("Onyil");
		}
		else {
			System.out.println("Yil");
		}
	}
}