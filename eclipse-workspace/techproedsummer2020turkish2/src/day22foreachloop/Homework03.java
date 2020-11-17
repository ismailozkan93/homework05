package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class Homework03 {

	public static void main(String[] args) {
		// Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin toplamını For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız.
		
		List <Integer> number = new ArrayList<>();
		number.add(4);
		number.add(6);
		number.add(8);
		number.add(9);
		number.add(12);
		System.out.println(number);
		
		
		int sum=0;
		for(int w : number) {
			sum=sum+(w*w);
		}System.out.println(sum);
		
		
		
	}

}
