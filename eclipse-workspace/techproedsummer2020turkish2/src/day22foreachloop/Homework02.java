package day22foreachloop;

public class Homework02 {

	public static void main(String[] args) {
		//Bir integer array oluşturunuz ve bu array’deki tum sayıların çarpımını For-each loop kullanarak bulunuz. Sonucu ekrana yazdırınız. 
		
		
		int [] num= {12, 13, 15, 17, 19};

		int product=1;
		for(int w : num) {
			product*=w;
		
		}System.out.println(product);
		
		
		
		
		
		
		
	}

}
