package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement04 {

	public static void main(String[] args) {
		/*Kullanicidan bir sayi alin
		 * Bu sayi 0 dan 9`a kadar ise ekrana"rakam " yazdir.
		 * Bu sayi 9`dan buyuk ve 100`den kucuk ise ekrana iki basamakli yazdirin
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz");
		int num = scan.nextInt();
	if(num>=0 && num<=9){
		System.out.println("Rakam");
	}
	if(num>9 && num<100){
		System.out.println("Iki basamakli sayi");
	}
	scan.close();
	
	
	}
}
