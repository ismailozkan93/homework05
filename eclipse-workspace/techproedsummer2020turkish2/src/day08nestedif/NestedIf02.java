package day08nestedif;

import java.util.Scanner;

public class NestedIf02 {

	public static void main(String[] args) {
		/*Kullanicidan sayi alin 10 dan büyük mü diye kontrol edin
		 * sayi 10 dan büyükse "woow", kucuk ise "Himm" diye yazdirin
		 * 
		 * Sayi 0 veya negatif ise -10 dan kucuk mu diye kontrol edin
		 * -10 dan kucukse "Felaket" -10 dan büyükse "Ne yapalim"
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi Giriniz");
		int sayi = scan.nextInt();
	
		if(sayi > 0){
			if(sayi>10) {
				System.out.println("Woow");
			}
			else {
				System.out.println("Himmm");
			}
		}
		else if(sayi <= 0) {
			if(sayi < -10) {
				System.out.println("Felaket");}
			else {System.out.println("Ne yapalim");
		}
		}
		else {
			System.out.println("Sayi giriniz");
		}
		scan.close();
	}

}
