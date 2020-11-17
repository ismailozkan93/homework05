package day14methodcreation;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		// Kullanıcıdan isim ve soyismini alın. Kullanıcının isim ve soyisminin ilk harﬂerini 
		//büyük diğer harﬂerini küçük harf olarak ekrana yazdıran programı yazınız.
		// soruları çözerken metodları main methodun dışında oluşturup main methodun icinden çağırınız
		Scanner scan = new Scanner(System.in);
		System.out.println("Isim giriniz"); 
		String ch1 = scan.nextLine();
		System.out.println("Soyisim giriniz");
		String ch2 = scan.nextLine();
		
		büyükücük("ahmet","mehmet");
		
		
		
	}
	public static void büyükücük(String ch1 , String ch2) {
	
		char a =ch1.toUpperCase().charAt(0);
		char b =ch2.toUpperCase().charAt(0);
		
		System.out.println(a+ch1.toLowerCase().substring(1, ch1.length())+b+ch2.toLowerCase().substring(1, ch2.length()));
		
	}

}
