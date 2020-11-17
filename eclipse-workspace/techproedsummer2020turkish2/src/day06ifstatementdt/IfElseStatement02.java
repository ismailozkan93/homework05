package day06ifstatementdt;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		/*Kullanicidan sayi alin
		 * Bu sayi 10`dan 100`e kadar ise ekran
		 *aksi takdirde iki basamli degil yazdirin*/
Scanner scan = new Scanner(System.in);
System.out.println("sayi giriniz");
int num = scan.nextInt();
if(num>=10 && num<100){
	System.out.println("Iki basamakli");
}
else {
	System.out.println("Iki basamakli Degil");
}
		
scan.close();		
	}

}
