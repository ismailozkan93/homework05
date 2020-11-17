package day13dowhileloop;

public class Homework01 {

	public static void main(String[] args) {
		// 9 den 190 e kadar 7 nin kati olan tüm tamsayıları ekrana yazdırınız.
		
		int a = 9;
		System.out.println("7 nin katlari: ");
		do {
			if(a%7==0) {
				System.out.println(a);	
			}
			a++;
	}while(a<190);
	}
}
