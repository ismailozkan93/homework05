package day18arrays;

public class Homework05 {

	public static void main(String[] args) {
		//  Bir array’de herhangi iki elemanın aynı olup olmadığını kontrol  eden bir program yazınız.
		//Aynı eleman varsa “Aynı eleman var” yoksa  “Aynı eleman yok” yazdırınız.
	
		int arr1[]= {1, 3, 3, 5, 7, 9, 11};
		int count=0;
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length-1;j++) {
			if(i!=j &&arr1[i]==arr1[j]) {
				count++;
			}
			}
		}
		if(count>0) {
			System.out.println("Ayni eleman var");
		}else {
			System.out.println("Ayni eleman yok");
		}
		
		
	}

}
