package day09nestedternary;

import java.util.Scanner;

public class HomeworkSwitch04 {

	public static void main(String[] args) {
		/*Kullanıcıdan ay ismi alın eğer ay ismi  31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
		 *  Eğer ay ismi  30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın. 
		 *  Eğer ay ismi  28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın. 
		 *  Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("please write a month");
		String day = scan.next();
		switch(day) {
		case ("January"):
		case ("March"):
		case ("May"):
		case ("Juli"):
		case("August"):
		case ("October"):	
		case ("December"):
		System.out.println("The months have 31 days");
		break;
		case ("April"):
		case ("June"):
		case ("September"):
		case ("November"):
		System.out.println("The months have 30 days");
		break;
		case ("February"): System.out.println("The month have 28 or 29 days"); 
		break;
		default:
			System.out.println("Invalid Month name");
		
		}
		
		
		
		
	}

}
