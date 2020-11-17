package day12forvewhileloop;

import java.util.Scanner;

public class Homework10 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir String alın ve
		 *  bu String’in ilk harﬁ ile son harﬁnin yerlerini değiştirerek  ekrana yazdırın. 
		 *  Ornegin; Kullanıcı “Java” girerse ekrana “aavJ” yazdıracaksınız.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("bir kelime giriniz");
		String a = scan.nextLine();
		char ch1 = a.charAt(0);
		char ch2 = a.charAt(a.length()-1);
				
		System.out.println(ch2 + a.substring(1,a.length()-1) + ch1);
		 
		
		

	}

}