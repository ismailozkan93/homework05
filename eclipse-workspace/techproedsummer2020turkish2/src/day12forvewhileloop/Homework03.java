package day12forvewhileloop;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		//Kullanıcıdan başlangıç ve bitiş  değerlerini alın ve başlangıç değerinden veya sonrasından  
		//başlayıp bitiş değerinde veya öncesinde biten tüm çift tamsayıları while loop kullanarak ekrana yazdırınız.

		Scanner scan = new Scanner(System.in);
		System.out.println("Baslangic ve Bitis degeri giriniz");
		int a = scan.nextInt();
		int b = scan.nextInt();
		while(a<=b) {
			if(a%2==0) {

				System.out.print(a+"-");
			}
	a++;
		}
	}

}
