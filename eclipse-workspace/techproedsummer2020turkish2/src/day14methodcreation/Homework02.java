package day14methodcreation;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		 
		//Kullanıcıdan iki sayı alın bu sayılar eşit ise ekrana “Eşit”, birinci sayı büyük ise
		//ekrana “Birinci sayı büyük”, ikinci sayı büyük ise ekrana “Ikinci sayı büyük” yazdırınız.
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
	islem(n1,n2);
		
	}

	public static void islem(int n1,int n2) {
		
		if(n1==n2) {
			System.out.println("Esit");
		}
		else if(n1>n2) {
			System.out.println("Brinci sayi büyük");
		}
		else {
			System.out.println("Ikinci sayi büyük");
		}
	}
	
}
