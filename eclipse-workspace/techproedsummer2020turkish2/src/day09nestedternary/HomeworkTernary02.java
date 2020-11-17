package day09nestedternary;

import java.util.Scanner;

public class HomeworkTernary02 {

	public static void main(String[] args) {
		//Kullanıcıdan iki tamsayı girmesini isteyin, ekrana her zaman büyük olanını yazdırın
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki Sayi Giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
	int result =(sayi1>sayi2)?(sayi1):(sayi2); 	
		System.out.println(result);
	}

}
