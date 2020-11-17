package day09nestedternary;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*Kullanicidan bir harf alin
		 * Harf 'a' veya 'A' ise ekrana "ilk Harf yazdirin.
		 * Harf 'b' veya 'B' ise ekrana "ilk Harf yazdirin.
		 *Harf 'c' veya 'C' ise ekrana "ilk Harf yazdirin.
		 *Diger durumlarda "tanimlanamadi" yazdirin. 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Harf giriniz");
		char ch = scan.next().charAt(0);
		//1.YOL:if-else-if kullandik
		
		if(ch =='a' || ch == 'A') {
			System.out.println("ilk harf");
		}
		else if(ch =='b' || ch =='B') {
			System.out.println("ikinci Harf");
		}
		else if(ch =='c' || ch =='C') {
			System.out.println("Ücuncu Harf");
		}
		else {
			System.out.println("Tanimlanamadi");
		}
		//2.yol:switch statement
		switch(ch) {
		case 'a':
		case 'A':
			System.out.println("ilk harf");
			break;
		case 'b':
		case 'B':
			System.out.println("ikinci harf");
			break;		
		case 'c':
		case 'C':
			System.out.println("ücüncü harf");
			break;	
		default: System.out.println("Tanimlanamadi");	
			
		}
		scan.close();
	}

}
