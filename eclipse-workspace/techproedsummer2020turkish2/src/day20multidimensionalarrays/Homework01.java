package day20multidimensionalarrays;

import java.util.Arrays;

public class Homework01 {

	public static void main(String[] args) {
		// Aşağıdaki multi dimensional array’in tum elemanlarının çarpımını ekrana yazdıran bir program yazınız. 
		//{ {1,2,3}, {4,5,6} } 
		int arr[] [] = {{1, 2, 3}, {4, 5, 6} };
		System.out.println(Arrays.deepToString(arr));
		
		int product=1;
		for(int i=0;i<arr.length;i++) {
			for(int k=0; k<arr[i].length;k++) {
			System.out.println(arr[i][k]);
		product=product*arr[i][k];
			}
		}System.out.println(product);

	}

}
