package day05incrementdecrement;

import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
		// Kullanicidan üc basamakli bir sayi aliniz,
		//bu sayinin rakamlari toplamini ekrana yazdirin.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("3 basamakli sayi giriniz");
		int s = scan.nextInt();
		
		int sonRakam = s%10;
		int ortaRakam = (s/10)%10;
		int ilkRakam = (s/100)%10;
		System.out.println(sonRakam + ortaRakam + ilkRakam);
		
		scan.close();
	}

}
