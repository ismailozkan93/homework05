package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {
		/*Kullanicidan bir sayi alin bu sayi 3 e bölünüyorsa 
		 * ekrana "3`un kati" bölünmüyorsa "3 e bölünmüyor yazdirin
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Tam Sayi Giriniz");
		int num = scan.nextInt();
		
		if(num%3==0) {System.out.println("3`ün");
		}
		
		if(num%3!=0){System.out.println("3`e bölünmüyor");
		}

	}

}
