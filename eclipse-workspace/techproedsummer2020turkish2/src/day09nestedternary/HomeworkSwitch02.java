package day09nestedternary;

import java.util.Scanner;

public class HomeworkSwitch02 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir harf alın eğer harf “a, e, i, o, u” dan biri ise ekrana “Sesli harf” yazdırın.
		 *  “b, c, d, f” den biri ise ekrana “Sessiz harf” yazdırın.
		 *  Bu harﬂerin dışında bir character için “Geçersiz character” yazdırın 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir harf Giriniz");
		char harf = scan.next().charAt(0);
		switch(harf) {
		case ('a'):
		case 'e':
		case 'i':
		case 'o':
		case  'u':	 
			System.out.println("Sesli harf");
			break;
			
		case ('b'):
		case  'c':
		case  'd':
		case  'f':	 
			System.out.println("Sessiz harf");
			break;	
		
			default:System.out.println("Gecersiz character");
		
		}
		
		
		
	}

}
