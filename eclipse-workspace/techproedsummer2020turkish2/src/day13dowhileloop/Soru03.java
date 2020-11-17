package day13dowhileloop;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		/*Kullanıcıdan uzunluğu çift sayı olan bir String alın ve
		 *  bu String’in ilk yarısını ekrana yazdırın. Ornegin; Kullanıcı “Hollanda” girerse 
		 *  ekrana “Holl” yazdıracaksınız.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("cift sayili karakterli bir string giriniz");
		String a = scan.nextLine();
		System.out.println("Ilk yari: " + a.substring(0,a.length()/2));
		System.out.println("Son yari: " +a.substring(a.length()/2));
		scan.close();
	}

}
