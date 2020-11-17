package day06ifstatementdt;

import java.util.Scanner;

public class Homework02 {
	
	public static void main(String[] args) {
		/* Kullanıcıdan iki sayı alın eğer sayıların işaretleri  aynı ise ekrana “Aynı işaretli” yazdırın. 
		 * Sayıların işaretleri  farklı ise ekrana “Farklı işaretli” yazdırın.
		 */
Scanner scan = new Scanner(System.in);
System.out.println("Birinci sayiyi giriniz");
int numA = scan.nextInt();
System.out.println("Ikinci sayiyi giriniz");
int numB = scan.nextInt();

if((numA<0 && numB<0)||(numA>0 && numB>0)) {
System.out.println("Ayni Isaretli");
}

else {
	System.out.println("Farkli Isaretli");
}
		
		
		
		
		
	}

}
