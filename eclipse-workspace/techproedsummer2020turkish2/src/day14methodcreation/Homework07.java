package day14methodcreation;

import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		// do_while kullanarak bir oyun tasarlayın
		
		bavul();
		
	}
	public static void bavul() {
		Scanner scan = new Scanner(System.in);
		int a=1;
		System.out.println("3 haneli bir sifre giriniz");
		int b1 ; int b2; int b3;
		do {
		a = scan.nextInt();
		 b1 = a%10;
		 b2= (a/10)%10;
		 b3= (a/100)%10;
		if(!(b1 == 1 && b2 == 2 && b3 == 8)) {
			System.out.println("Tekrar sifre giriniz");
		}
 		
		}while(!(b1 == 1 && b2 == 2  && b3 == 8));
		System.out.println("Bavul sifresi");
	}
}
