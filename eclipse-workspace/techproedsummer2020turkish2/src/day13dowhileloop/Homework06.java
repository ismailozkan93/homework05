package day13dowhileloop;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		// Kullanıcıdan bir String alın ve bu String’in icinde “a” harﬁ varsa ekrana “a harﬁ var” yazdırın.
		//“a” harﬁ yoksa tekrar bir String girmesini isteyin.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String ch = " ";
		
		do {
			ch = scan.nextLine();
			System.out.println("Tekrar string giriniz");
		}while(!ch.contains("a"));
		System.out.println("A harfi var");
	}

}
