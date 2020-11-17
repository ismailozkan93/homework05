	package day09nestedternary;

import java.util.Scanner;

public class HomeworkSwitch03 {

	public static void main(String[] args) {
		/*Kullanıcıdan bir tamsayı alın eğer tamsayı 9 ise ekrana “Bir basamaklı en büyük sayı” yazdırın.
		 *  99 ise ekrana “İki basamaklı en büyük sayı” yazdırın. 
		 *  999 ise ekrana “Üç basamaklı en büyük sayı” yazdırın.
		 *  Bu sayıların dışındaki sayılar için “Yorum yok” yazdırın. 
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("please write a number");
		int num = scan.nextInt();
		switch(num){
			case (9):
				System.out.println("The biggest number");
			break;
			
			case (99): 
				System.out.println("The biggest number 2 ");
			break;
			
			case(999):
				System.out.println("The biggest number 3");
			break;
			
			default:System.out.println("No comments");
		}
	}

}
