package day06ifstatementdt;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir character alın eğer character bir harf ise ekrana “Harf” yazdırın. 
		 *  Diğer durumlarda ekrana “Harf değil” yazdırın.
		 */
Scanner scan = new Scanner(System.in);
System.out.println("Harf Giriniz");
char harf = scan.next().charAt(0);		
if((harf >='a'&& harf <='z')|| (harf <='Z' && harf >='A')) {
	System.out.println("Harf");
}

else {
	System.out.println("Harf Degil");
}
		
		
		
	}

}
