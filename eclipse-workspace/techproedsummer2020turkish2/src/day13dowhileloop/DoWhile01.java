package day13dowhileloop;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// "while" ile "do-while" farki nedir?do-while loop ise önce kodu calistirir, sonra sarti kontrol eder.
		//do-while da en az bir kere calisir. fakat while da hic calismamasi da mümkündür.
		
		
		int i = 1;
		while(i<1) {
			System.out.println(i);
		}
		
		do {
			System.out.println(i);
			i++;
		}while(i<1);
		
		/*kullanicidan sayi alin
		bu sayi 10 dan büyükse ekrana "Kazandiniz" yazdirin
		sayi 10 veya 10 dan büyükse ekrana "Kaybettiniz" yazip
		tekrar sayi isteyin.
		*/
		Scanner scan = new Scanner(System.in);
		int a = 20;// 10 dan büyük her deger verilebilir.
		do {
			if(a<=10) {
				System.out.println("Kaybettiniz");
			}
			System.out.println("Sayi giriniz");
			 a = scan.nextInt();
		} while(a <= 10);
		System.out.println("Kazandiniz");
		
		
	scan.close();
		  
		
}

}
