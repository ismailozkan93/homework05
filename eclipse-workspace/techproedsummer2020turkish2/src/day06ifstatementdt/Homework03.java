package day06ifstatementdt;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		/* Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın eğer üç kenar uzunluğu birbirine eşit ise 
		ekrana  “Eşkenar üçgen” yazdırın. 
		Diğer durumlarda ekrana “Eşkenar değil” yazdırın
		*/

	Scanner scan = new Scanner(System.in);
	System.out.println("Ücgenin A kenarinin uzunlugunu Giriniz");
	int kenarA = scan.nextInt();
	
	System.out.println("Ücgenin B kenarinin uzunlugunu Giriniz");
	int kenarB = scan.nextInt();
	
	System.out.println("Ücgenin C kenarinin uzunlugunu Giriniz");
	int kenarC = scan.nextInt();
	
	if(kenarA == kenarB && kenarB == kenarC) {System.out.println("Eskanar Ücgen");
		
	}
	else
		System.out.println("Eskanar Ücgen Degil");
	}

}
