package day09nestedternary;

import java.util.Scanner;

public class HomeworkTernary04 {

	public static void main(String[] args) {
		/* Kullanıcıdan bir dikdörtgenin en ve boyunu girmesini isteyin.
		En ve boy eşit ise ekrana “Kare” farklı ise ekrana “Dikdörtgen” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen en ve boy degeri Giriniz");
		int en = scan.nextInt();
		int boy = scan.nextInt();
	String result = (en >0 && boy>0) ? ((en == boy) ? "Kare" : "Dikdörtgen"):("Gecersiz Deger");
System.out.println(result);
	
	}

}
