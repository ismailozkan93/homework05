package day22foreachloop;

import java.util.Arrays;

public class Homework05 {

	public static void main(String[] args) {
		// Bir String oluşturunuz, bu String’deki character’leri yukarıdan aşağıya for-each loop kullanarak yazdırınız.  

		String str = "Ankara";
		String [] arr= str.split("");
		System.out.println(Arrays.toString(arr));
		System.out.println();
		for(String w: arr) {
			System.out.println(w);
		}
	}

}
