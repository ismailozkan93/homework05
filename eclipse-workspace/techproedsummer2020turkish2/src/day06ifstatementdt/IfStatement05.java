package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement05 {

	public static void main(String[] args) {
		/*Kullanicidan sayi alin.
		 * Bu sayi 0 dan 9 a kadar ise ekrana rkaam yazdirin.
		 *9 dan büyük veya 0 dan kücük ise ekrana sayi yazdirin. 
		 */

		Scanner scan = new Scanner(System.in);	
	System.out.println("Sayi giriniz");
	int num = scan.nextInt();
	
	if(num>=0 && num<=9) {
		System.out.println("rakam");
	}
	
	if(num<0 || num>9) {
	System.out.println("sayi");	
	}
	scan.close();	
	}	
}
