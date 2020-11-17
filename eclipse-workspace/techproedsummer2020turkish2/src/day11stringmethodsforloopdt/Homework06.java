package day11stringmethodsforloopdt;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		// Kullanıcıdan yaşadığı ülkenin ismini alın bu ülkenin
		//bastan ikinci harﬁ ile sondan ikinci harﬁni  büyük harf olarak ekrana yazdırın. 
		Scanner scan = new Scanner(System.in);
		System.out.println("Ülke ismi giriniz");
		String a = scan.nextLine();
		System.out.println("bastan ikinci harf: " + a.toUpperCase().charAt(1) + " " +"Sondan ikinci Harf: " + 
		a.toUpperCase().charAt(a.length()-2));
	}

}
