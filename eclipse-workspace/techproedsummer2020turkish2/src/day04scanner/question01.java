package day04scanner;

import java.util.Scanner;

public class question01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Dikdörtgenin en ve boyunu giriniz");
		double en = scan.nextDouble();
		double boy = scan.nextDouble();
		System.out.println("Alan= "+en*boy);
		System.out.println("cevre"+2*(en+boy));
scan.close();
	}

}
