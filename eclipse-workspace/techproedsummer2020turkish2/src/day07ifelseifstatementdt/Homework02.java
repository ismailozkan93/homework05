package day07ifelseifstatementdt;

import java.util.Scanner;

public class Homework02 {

	public static void main(String[] args) {
		/*Kullanıcıdan notunu alın ve aşağıdaki kurallara göre ekrana A, B, C veya D yazdırın.
		 *  1. 50 den az - D     2. 50(dahil) ile 60 arası - C      
		 *  3. 60(dahil) ile 80 arası - B.     4. 80(dahil) ustu- A 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Notunuzu Giriniz");
		int not = scan.nextInt();
		
		if(not < 0 || not>100){
			System.out.println("Gecersiz Not Girdiniz");
		}
		
		else if(not < 50){
			System.out.println("Notunuz: D " + "\n" + not);	
		}
		else if(not < 60){
			System.out.println("Notunuz: C " + "\n" + not);	
		}
		else if(not < 80){
			System.out.println("Notunuz: B " + "\n" + not);	
		}
		else {
			System.out.println("Notunuz: A " + "\n" + not);	
		}
		
		
	}

}
