package day09nestedternary;

import java.util.Scanner;

public class NestedTernary01 {

	public static void main(String[] args) {
		/* Kullanicidan bir sayi alin.
*sayi pozitif ise 9 dan buyuk mu diye kontrol edin
*9 dan büyükse sayi degilse rakam yazdirin
*sayi pozitif degilse 0 mi diye kontrol edin
o ise "Rakam" degilse "Negatif sayi" yazdirin
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Bir sayi giriniz");
		int s = scan.nextInt();
String result = (s>0) ? ( (s>9) ? ("sayi") : ("rakam") ) : ((s == 0)?("Rakam"):("Negatif sayi"));		
		System.out.println(result);
	}

}
