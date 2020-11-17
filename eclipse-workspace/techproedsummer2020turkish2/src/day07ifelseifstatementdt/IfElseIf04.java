package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf04 {

	public static void main(String[] args) {
		/*Kulln
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci Not Giriniz");
		byte not1 = scan.nextByte();

		System.out.println("Ikinci Not Giriniz");
		byte not2 = scan.nextByte();
		
		double ort = (not1+not2)/2;
		
		if(not1 < 0 || not2 < 0){
			System.out.println("Notlar negatif olamaz");
		}
		else if(not1 > 100 || not2 > 100){
			System.out.println("Notlar 100`den büyük olamaz");
		}
		
		else if(ort<50) {
			System.out.println("50´nin altinda kaldiniz");
		}
		
		else if(ort<70) {
			System.out.println("C ile gectiniz");
		}
		
		else if(ort<85) {
			System.out.println("B ile gectiniz");
		}
		else {
			System.out.println("A ile gectiniz");
		}
		
		
		
		
	}

}
