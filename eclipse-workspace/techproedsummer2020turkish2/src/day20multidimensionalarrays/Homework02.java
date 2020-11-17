package day20multidimensionalarrays;

import java.util.Arrays;

public class Homework02 {

	public static void main(String[] args) {
		//  Aşağıdaki multi dimensional array’in iç array’lerindeki son elemanların çarpımını ekrana 
		//yazdıran  bir program yazınız { {1,2,3}, {4,5}, {6} } 

		int arr[][]= {{1, 2 ,3}, {4, 5}, {6}};
		//1.yol
		System.out.println((arr[0][2])*(arr[1][1])*(arr[2][0]));
		
		//2.yol
		
		for(int i=0; i<arr.length; i++){
			
				
				System.out.print(" "+arr[i][arr[i].length-1]);
			
			
		}
		
	}

}
