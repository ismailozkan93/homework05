package day11stringmethodsforloopdt;

import java.util.Scanner;

public class Homework05 {

	public static void main(String[] args) {
		//Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin ilk iki harﬁni büyük harf olarak ekrana yazdırın. 
		Scanner scan = new Scanner(System.in);
		System.out.println("Ülke ismi giriniz");
		String a = scan.nextLine();
	System.out.println(a.toUpperCase().charAt(0)+" " + a.toUpperCase().charAt(1));
	
	
	
	
	
	
	}

}
