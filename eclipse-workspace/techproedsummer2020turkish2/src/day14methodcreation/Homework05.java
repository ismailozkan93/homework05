package day14methodcreation;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		//Kullanıcıya bir String girmesini söyleyin ve bu String’i yukarıdan
		//aşağıya doğru yazdıran  Program yazınız. Ornegin; CAN ==> 
		//C A N   

		Scanner scan = new Scanner(System.in);
		System.out.println("Bir isim giriniz");
		String a = scan.nextLine();
		
		for(int i=0; i <= a.length()-1;i++) {
			System.out.println(a.charAt(i));
		}
		
		
	}

}
