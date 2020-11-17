package day14methodcreation;

import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		// do_while kullanarak bir oyun tasarlayın

		Scanner scan = new Scanner(System.in);
		int s =1;
		System.out.println("1 den 100 e kadar sayi giriniz");
		do {
			s = scan.nextInt();
			if(s!=78) {
			System.out.println("Tekrar sayi giriniz");		}
			}while(s!=78);
	System.out.println("Kazandiniz");
	
	
		
		
		
		
	
	}
}
