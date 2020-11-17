package day07ifelseifstatementdt;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir üçgenin  üç kenar uzunluğunu alın 
		 * eğer üç kenar uzunluğu birbirine eşit ise ekrana  “Eşkenar üçgen” yazdırın. 
		 * Sadece iki kenar uzunluğu birbirine eşit ise ekrana “Ikizkenar üçgen”  yazdırın. 
		 * Tüm kenar uzunlukları birbirinden farklı ise “Çeşitkenar üçgen yazdırın” 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Ücgenin A kenarini giriniz");
		int kenarA = scan.nextInt();
		
		System.out.println("Ücgenin B kenarini giriniz");
		int kenarB = scan.nextInt();
		
		System.out.println("Ücgenin C kenarini giriniz");
		int kenarC = scan.nextInt();
		
		if(kenarA == kenarB && kenarB == kenarC){
			System.out.println("Eskanar Ücgen");
		}
		else if(kenarA == kenarB || kenarB == kenarC || kenarA == kenarC){
			System.out.println("Ikiz Kenar Ücgen");
		}
		else {
			System.out.println("Cok Kenar Ücgen");
		}
		
		
		
	}

}
