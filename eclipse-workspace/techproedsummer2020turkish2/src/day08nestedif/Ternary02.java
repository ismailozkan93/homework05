package day08nestedif;

import java.util.Scanner;

public class Ternary02 {

	public static void main(String[] args) {
		/*Kullanicidan bir ücgenin üc kenar uzunlugunu alin
		 * üc kenar esitse eskenar ücgen
		 * degilse eskenar degil yazin
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Ücgenin A Giriniz");
		int kenarA = scan.nextInt();
		System.out.println("Ücgenin B Giriniz");
		int kenarB = scan.nextInt();
		System.out.println("Ücgenin C Giriniz");
		int kenarC = scan.nextInt();
		
	String sonuc = (kenarA == kenarB || kenarB == kenarC)? "Eskenar" : "Eskenar Degil";	
		System.out.println(sonuc);
		scan.close();
		
	}

}
