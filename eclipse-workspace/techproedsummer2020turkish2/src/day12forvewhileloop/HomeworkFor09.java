package day12forvewhileloop;

import java.util.Scanner;
public class HomeworkFor09 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("sayi degeri giriniz");
		int num = scan.nextInt();
		for(int i=1 ; i<= num ; i++) {
			if(num%i==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
