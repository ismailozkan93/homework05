package day18arrays;

import java.util.Arrays;

public class A02 {

	public static void main(String[] args) {
		// Iki array olusturununuz.Bu arraylerin tüm elemanlari ayni ise 
		//ekrana ayni yazdirin,farkli ise ekrana "farkli" yazdirin.
		
	char ch1[] = {'a', 'b', 'c', 'd'};	
	char ch2[] = {'a', 'b', 'c', 'd'};	

	int count=0;
	int a=0;
		while(a<ch1.length) {
			if(ch1[a]==ch2[a]) {
				count++;
		}a++;		
		}
		if(count==a) {
			System.out.println("Ayni");
		}else {
			System.out.println("Farkli");
		}
		
	//2.yol
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Ayni");
		}
		else {
			System.out.println("Farkli");
		}
		
		
		
		
		
	}

}
