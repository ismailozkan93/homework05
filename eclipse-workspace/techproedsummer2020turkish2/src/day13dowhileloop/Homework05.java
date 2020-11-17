package day13dowhileloop;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		//Kullanıcıya bir String girmesini söyleyin ve bu String’in 
		//ilk harﬁ ile son harﬁ aynı ise ekrana  “Simetrik” yazdırın.
		//Aynı değilse tekrar bir String girmesini isteyin.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir string giriniz");
		String ch = scan.nextLine();
		char ch1 = ch.charAt(0);
		char ch2 = ch.charAt(ch.length()-1);
		
		do {
		
			System.out.println(" Tekrar bir String Giriniz");
		}while(ch1!=ch2);
		System.out.println("Simetrik");
	}

}
