package day09nestedternary;

import java.util.Scanner;

public class HomeworkTernary03 {

	public static void main(String[] args) {
		//Kullanıcıdan bir tamsayı girmesini isteyin, ekrana o tamsayının mutlak degerini yazdırın
		  
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen Bir Sayi Giriniz");
		int sayi1 = scan.nextInt();
	int result = sayi1 >= 0 ? (sayi1):(-sayi1);
System.out.println(result);
	}

}
