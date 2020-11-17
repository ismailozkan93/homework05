package day12forvewhileloop;

import java.util.Scanner;

public class HomeworkWhile09 {

	public static void main(String[] args) {
		// Kullanıcıdan bir sayı alın ve bu sayının bölenlerini ekrana yazdırınız. 
		//Ornegin; 12'nin bölenleri 1, 2, 3, 4, 6, 12 dir

		Scanner scan = new Scanner(System.in);
		System.out.println("sayi degeri giriniz");
		int num = scan.nextInt();
		int a=1;
		while(a <=num) {
			if(num%a ==0) {
				System.out.println(a);
				
			}
			a++;
		}
		
	}
}

