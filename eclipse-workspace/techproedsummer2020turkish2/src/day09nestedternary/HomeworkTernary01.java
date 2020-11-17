package day09nestedternary;

import java.util.Scanner;

public class HomeworkTernary01 {

	public static void main(String[] args) {
		/* Kullanıcıdan bir tamsayı girmesini isteyin,
		 *  tamsayı çift ise ekrana “Çift” tek ise ekrana “Tek” yazdırın.
		 */

	Scanner scan = new Scanner(System.in);
	System.out.println("Lütfen Bir Sayi Giriniz");
	int sayi = scan.nextInt();
	String result = sayi%2 == 0 ? "Cift":"Tek";
	System.out.println(result);	
		
		
		
		
		
		
		
	}

}
