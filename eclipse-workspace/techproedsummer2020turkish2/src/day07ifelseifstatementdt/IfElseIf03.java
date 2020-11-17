package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf03 {

	public static void main(String[] args) {
		/*Kullanicidan yasini aliniz
		 * yas 13 ten kücük ise ekrana "Calisamaz"
		 * yas 13 den 65 e kadar ise ekrana "calisabilir"
		 *yas 65 den büyükse ekrana "emekli yazdirin"
		*Negatif sayi girerse "yas negatiftir."
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("yas Giriniz");
		int yas = scan.nextInt();
		if(yas<0){
			System.out.println("Yas Negatif olamaz");
		}
		else if(yas<13) {System.out.println("Calisamaz");
		}
		else if(yas<65) {
			System.out.println("Calisabilir");
		}
		else {
			System.out.println("Emekli");
		}
		scan.close();
	}

}
