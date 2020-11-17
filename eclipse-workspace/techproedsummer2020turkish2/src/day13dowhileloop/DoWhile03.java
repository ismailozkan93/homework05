package day13dowhileloop;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/*KUllanicidan bir String aliniz
		 * String icinde 'a' varsa ekrana "Kazandiniz" yazdirin
		 *'a' yoksa ekrana "Kaybettiniz" yazdirin ve yeni String isteyin
		 */

		Scanner scan = new Scanner(System.in);
		String ch = "";
		do {
			System.out.println("Bir kelime giriniz");
			ch = scan.nextLine();
			System.out.println("Kaybettiniz");
		}while(!ch.contains("a"));
		System.out.println("Kazandiniz");
	}

}
