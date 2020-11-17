package day06ifstatementdt;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*  Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
		 *  “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
*/

	Scanner scan = new Scanner(System.in);
	System.out.println("Bir Harf Griniz");
	char harf = scan.next().charAt(0);
	if(harf == 'a' || harf == 'e' || harf =='i' || harf =='o' || harf =='u' ) {
		System.out.println("Sesli Harf");
	}
	
	if(harf == 'b' || harf == 'c' || harf =='d' || harf =='f' ) {
		System.out.println("Sessiz Harf");
	}
		
			
		
	}

}
