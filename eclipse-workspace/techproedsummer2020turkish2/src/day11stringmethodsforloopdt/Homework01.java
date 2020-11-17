package day11stringmethodsforloopdt;

import java.util.Scanner;

public class Homework01 {

	public static void main(String[] args) {
		/*Kullanıcıdan kredi kartı numarasını alın ve 
		 * bu numaranın üçüncü, dördüncü ve sonuncu  rakamlarını ekrana yazdırın.12345
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Kredi karti numarasi giriniz");
		String num = scan.nextLine();
		System.out.println(num.charAt(2));
		System.out.println(num.charAt(3));
		System.out.println(num.charAt(num.length()-1));
		
		
	}

}
