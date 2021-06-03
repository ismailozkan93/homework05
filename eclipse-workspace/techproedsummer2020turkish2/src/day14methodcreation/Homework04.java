package day14methodcreation;

import java.util.Scanner;

public class Homework04 {

	public static void main(String[] args) {
		//Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini ve
		//iki sayı seçmesini söyleyin.  Hangi şekli seçerse, o şeklin alanını ve 
		//çevresini ekrana yazdıran programı yazınız.
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		int b = scan.nextInt();
		int c = scan.nextInt(); 
		int d=scan.nextInt();
		
		
		
	}
	public static void dörtgen(String a, int b, int c, int d,int alan,int cevre) {
		switch(a.toLowerCase()) {
		case "ücgen":
			alan=(c*b)/2;
	//		cevre(b+c+d);
	//	case "dikdörtgen";
			alan=(b*c)/2;
		}
		
	}

	}


