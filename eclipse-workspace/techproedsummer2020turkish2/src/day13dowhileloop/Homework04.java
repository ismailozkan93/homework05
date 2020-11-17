package day13dowhileloop;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		/*Kullanıcıya iki sayı girmesini söyleyin. Bu sayılar eşit ise ekrana “Kare oluşturdunuz” yazdırın.
		 *  Eşit değilse tekrar iki sayı girmesini söyleyin.
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Iki sayi giriniz");
		int a = 1;
		int b = 2;
		do {
		a = scan.nextInt();
		b = scan.nextInt();
			if(a!=b) {
				System.out.println("Tekrar Iki Sayi giriniz");	
			}
			
		
		}while(a!=b);
		System.out.println("Kare olusturdunuz.");
	}

}
