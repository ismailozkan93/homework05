package day22foreachloop;

public class Homework04 {

	public static void main(String[] args) {
		// İki String array oluşturunuz ve bu array’lerdeki ortak elemanları For-each loop kullanarak bulunuz.
		//Sonucu ekrana yazdırınız.  Ortak eleman yoksa ekrana “Ortak eleman yok” yazdırınız 

		String [] arr1 = {"Ahmet", "Mehmet", "Ali", "Veli", "Nuri", "Tevfik", };
		String [] arr2 ={"Ali", "Anil", "Ahmet", "Nuri", "Mustafa", "Tevfik", };
		
		int count=0;
			for(String w : arr1) {
				for(String t: arr2) {
					if(w.equals(t)) {
						System.out.println(w);
						count++;
					}
				}
			}
			if(count>=0) {
				System.out.println("Ortak eleman vardir.");
			}else {
				System.out.println("Ortak eleman yoktur");
			}
				
				
			}
		}
		
		
		
		
		
		
		
		
		
	


