package day13dowhileloop;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*Kullanicidan sayi alin,
		 * sayi cift sayi ise ekrana "kazandiniz"
		 * sayi tek ise ekrana "kaybettiniz" yazdirin ve yeni bir sayi isteyin
		 */

		Scanner scan = new Scanner(System.in);
		int a = 1;
		do {
			System.out.println("Sayi giriniz");
			a = scan.nextInt();
			System.out.println("Kaybettiniz");
		}while(a%2!= 0);
		System.out.println("Kazandiniz");
	}
}		
	
/*int b = 3;
do {
	if(b%2==0) {
		System.out.println("Kaybettiniz");
	}
	syso("Bir sayi giriniz)
	b = scan.nextInt();
}while();
System.out.println();
*/


