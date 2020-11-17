package day12forvewhileloop;

public class Homework07 {

	public static void main(String[] args) {
		//  8 den 180 e kadar 5 in kati olan tum tamsayıları ekrana yazdırınız.
		// for ve while ile ayri ayri yapiniz
		
		int a = 8;
		
		while(a<180) {
			if(a%5==0) {
				System.out.println(a);
				a++;
			}
		}
			
		
	}

}
