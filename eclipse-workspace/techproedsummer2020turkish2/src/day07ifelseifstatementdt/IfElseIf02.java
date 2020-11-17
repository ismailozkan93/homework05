package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf02 {

	public static void main(String[] args) {
		/*Kullanicidan bir harf alalim
		 * Bu harf 'a' veya 'A' ise ekrana ilk harf
		*Bu harf 'b' veya 'B' ise ekrana ilk harf
		 *Bu harf 'c' veya 'C' ise ekrana ilk harf
		 *sirasini bilmiyoruz.
		 */


Scanner scan = new Scanner(System.in);
System.out.println("Harf Giriniz");
char harf = scan.next().charAt(0);

if(harf =='a'|| harf == 'A') {System.out.println("Ilk Harf");
}
else if(harf =='b'|| harf == 'B') {System.out.println("Ikinci Harf");
}
else if(harf =='c'|| harf == 'C') {System.out.println("Ücüncü Harf");
}
else{
	System.out.println("Sirasini Bilmiyoruz");
}


	}

}