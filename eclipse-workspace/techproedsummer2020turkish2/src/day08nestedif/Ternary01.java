package day08nestedif;

import java.util.Scanner;

public class Ternary01 {

	public static void main(String[] args) {
		// Ternary if-else in daha kisa yazimidir.
		
		//if-else kullandik
		if(5>4) {System.out.println("Elma");}else {System.out.println("Armut");}
	
		//Ternary kullandik
String result = 5>4 ? "Elma" : "Armut";
	System.out.println(result);
/*Kullanicidan bir sayi alin
 * Bu sayi 0 dan 9 a kadar ise ekrana rakam yazdirin
 * diger durumlarda ekrana sayi yazin
 * Bu soruyu Ternary ile cözün
*/	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir Sayi Giriniz");
	int sayi = scan.nextInt();
	
	String result1 = (sayi>=0 && sayi<=9)? "rakam" : "sayi";
	System.out.println(result1);
	scan.close();	
	
	
	
	}
}
