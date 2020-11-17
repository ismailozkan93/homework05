package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		/*Kullanicidan bir sayi aliniz.
		 * Sayi negatifse ekrana"Negatif"yazdirin.
		 * Sayi pozitifse ekrana "Pozitif" yazdirin.
		 * Sayi 0 ise ekrana Notr yazdirin
		 */
Scanner scan = new Scanner(System.in);
System.out.println("Bir Sayi Giriniz");
int num = scan.nextInt();
if(num<0) {System.out.println("Negatif");
}
if(num==0){System.out.println("Notr");
}
if(num>0){System.out.println("Pozitif");
}
scan.close();
		
		
		
	}

}
