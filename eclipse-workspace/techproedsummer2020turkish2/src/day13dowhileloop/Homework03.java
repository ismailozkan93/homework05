package day13dowhileloop;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		/*Kullanıcıya sayı girmesini söyleyin.
		 *  Kullanıcı sıfır girdiğinde, ekrana o ana kadar girmiş olduğu  tüm sayıların 
		 *  toplamını yazdırınız. Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın 
		 */
		Scanner scan = new Scanner(System.in);
	
		int sum = 0;
		
		int sayi =1 ;
		do {
		System.out.println("sayi degeri giriniz");
		 sayi = scan.nextInt();
		sum = sayi + sum;
		
		}while(sayi  != 0);
		System.out.println(sum);
	}

}
