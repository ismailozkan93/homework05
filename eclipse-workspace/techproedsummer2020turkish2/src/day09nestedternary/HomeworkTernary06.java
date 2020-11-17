package day09nestedternary;

import java.util.Scanner;

public class HomeworkTernary06 {

	public static void main(String[] args) {
		/* Kullanıcıdan bir yıl girmesini isteyin,
		yıl artık yıl ise ekrana “Artık yıl” degilse ekrana “Artık yıl degil” yazdırın
		 */
	
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir yil degeri Giriniz");
		int yil = scan.nextInt();
		String result = (yil %4 == 0 )? ("Artik Yil"):("Artik Yil Degil");
		System.out.println(result);
	}

}
