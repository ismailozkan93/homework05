package day03variables;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		
		//1.Kullanicidan tam isimini alin ekrana yazin.
		//2.Kullanicidan yasini alin ekrana yazin.
		//3.Kullanicidan isminin ilk harfini alin ekrana yazin.
		//4.Kullanicinin cocuk sayisini byte kullanarak aliniz.
		Scanner scan = new Scanner(System.in);
		System.out.println("Isminizi Griniz");
		String isim = scan.nextLine();
		
		System.out.println("Yasinizi Griniz");
		int yas = scan.nextInt();
		
		System.out.println("Isminizin ilk harfini Giriniz");
		char isimIlkHarf = scan.next().charAt(0);
		
		System.out.println("Cocuk Sayisini Giriniz");
		byte cocuk = scan.nextByte();
		scan.close();
	}

}
