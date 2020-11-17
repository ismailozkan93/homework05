package day13dowhileloop;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		/*
	Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp bitiş 
	değerinde  biten 4 ve 6 ile bölünebilen tüm tamsayıları ekrana yazdırınız.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve bitis degeri giriniz");
		int a = scan.nextInt(); 
		int b = scan.nextInt();
		do {
		
			if(a%4==0 && a%6==0) {
				System.out.println(a);
				
			}
			a++;
		}while(a<=b);
	}

}
