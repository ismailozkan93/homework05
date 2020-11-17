package day04scanner;

import java.util.Scanner;

public class question02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Yaricapi Giriniz");
		float r = scan.nextFloat();
		System.out.println("Alan=" + 3.14159*r*r);
		System.out.println("Cevre=" + 3.14159*2*r);
scan.close();
	}

}
