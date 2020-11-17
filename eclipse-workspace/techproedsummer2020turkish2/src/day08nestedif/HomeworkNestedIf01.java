package day08nestedif;

import java.util.Scanner;

public class HomeworkNestedIf01 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir harf girmesini isteyin.  Girdiği küçük harf ise harﬁn “a” olup olmadığını kontrol edin. 
		 * Harf “a” ise ekrana “Ilk küçük harf” yazdırın. “a” değil ise ekrana “Ilk küçük harf değil” yazdırın. 
		 * Girdiği büyük harf ise harﬁn “Z” olup olmadığını kontrol edin. 
		 *Harf “Z” ise ekrana “Son büyük harf” yazdırın. “Z” değil ise ekrana “Son büyük harf değil” yazdırın
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("BiR harf giriniz");
		char harf = scan.next().charAt(0);
		
		if (harf >= 'a' && harf <= 'z'){
			if(harf == 'a') {
				System.out.println("Ilk kucuk Harf");
			}
			else {
				System.out.println("Ilk kucuk harf degil");
			}
		}
		
		else if(harf >= 'A' && harf <= 'Z') {
			if(harf=='Z') {
				System.out.println("Son Büyük Harf");
			}
			else {
				System.out.println("Son büyük harf degil");
			}
		}
		
		else {
			System.out.println("Lütfen Harf giriniz");
		}
		
		
		
	}

}
