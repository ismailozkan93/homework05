package day09nestedternary;

import java.util.Scanner;

public class HomeworkSwitch01 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir gun alın eğer gun “Cuma” ise ekrana “Müslümanlar için kutsal gün” yazdırın.
		 *  “Cumartesi” ise ekrana “Yahudiler için kutsal gün” yazdırın.
		 *   “Pazar” ise ekrana  “Hıristiyanlar için kutsal gün” yazdırın.
		 *  Diler günler icin “Kutsal gün değil” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir gün Giriniz");
		String gun = scan.nextLine();
		
		switch(gun) {
		case ("Cuma"):System.out.println("Müslümanlar icin kutsal gün");
		break;
		
		case ("Cumartesi"):System.out.println("yahudiler icin kutsal gün");
		break;
		
		case ("Pazar"):System.out.println("Hristiyanlar icin kutsal gün");
		break;
		
		default:
			System.out.println("gecersiz gün");
		
		
		
		
		}
	}

}
