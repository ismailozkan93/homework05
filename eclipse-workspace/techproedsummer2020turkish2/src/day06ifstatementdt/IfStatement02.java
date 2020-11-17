package day06ifstatementdt;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		// Kullanican bir gün alin eger 
		//"Cuma" ise müslümanlar icin kutsal gün
		// cumartesi ise yahudiler icin kutsal gün
		//pazar ise hristiyanlar icin kutsal gün
	//Stringleri karsilastirirken sakin haa"=="kullanmayin.
		//Stringleri karsilastirken kesinlikle equals() kullanin
		//equals() boolean return eder.
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir Gün Giriniz");
	String gun = scan.nextLine();
	if(gun.equals("Cuma")) {
		System.out.println("Müslümanlar icin kutsal gün");
	}
	
	if(gun.equals("Cumartesi")) {
		System.out.println("Yahudiler icin kutsal gün");
	}
	if(gun.equals("Pazar")) {
		System.out.println("Hristiyanlar icin kutsal gün");
	}
	scan.close();
		
		
	}

}
