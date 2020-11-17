package day08nestedif;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi Giriniz");
		int sayi = scan.nextInt();
		
		int x= sayi%2 == 0?(sayi/2):(sayi*sayi);
		System.out.println(x);
	
	scan.close();
	
	}

}
