package day09nestedternary;

import java.util.Scanner;

public class HomeworkSwitch05 {

	public static void main(String[] args) {
		/*Kullanıcıdan A, B, C, D harﬂerinden birini alın eğer harf C ise ekrana “Doğru cevap” yazdırın.
		 *  A, B, D den biri ise ekrana “Yanlış cevap” yazdırın.
		 *  Bu harﬂerin dışındaki harﬂer için “Geçersiz cevap şıkkı” yazdırın.
*/
		Scanner scan = new Scanner(System.in);
		System.out.println("please write a character A, B , C or D");
		char ch = scan.next().charAt(0);
		
		switch(ch) {
		case 'C':System.out.println("Right Answer");
		break;
		
		case 'A':
		case 'B':
		case 'D':
			System.out.println("False Answer");
		break;
		
		default:System.out.println("invalid answer");
		}
	}

}
