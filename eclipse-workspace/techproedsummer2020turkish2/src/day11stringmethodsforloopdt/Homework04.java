package day11stringmethodsforloopdt;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		/*Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ismi Amerika ise ekrana USA, 
		 * Ingiltere ise ekrana UK,
		 * Almanya ise ekrana DE yazdırın. Diğer ülkeler için ise NA yazdırın. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ülke ismi giriniz");
		String a = scan.nextLine();
		if(a.equals("Amerika")) {
			System.out.println("USA");
		}
		else if(a.equals("Ingiltere")) {
			System.out.println("UK");
		}
		else if(a.equals("Almanya")) {
			System.out.println("DE");
		}
		else {
			System.out.println("NA");
		}
		
	}

}
