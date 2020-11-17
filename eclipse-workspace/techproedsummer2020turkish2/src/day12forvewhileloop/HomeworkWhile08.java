package day12forvewhileloop;

import java.util.Scanner;

public class HomeworkWhile08 {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden başlayıp
		//bitiş değerinde  biten 3 ve 5 ile bölünebilen tüm tamsayıları ekrana yazdırınız. 
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve bitis degeri giriniz:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		while(a<=b) {
			if(a%3==0 && a%5==0) {
				System.out.println(a+" ");
			}
			a++;
		}
	}

}
