package day20multidimensionalarrays;

public class Homework03 {

	public static void main(String[] args) {
	//  Aşağıdaki multi dimensional array’lerin iç array’lerinde aynı index’e sahip 
			//elemanların toplamını  ekrana yazdıran bir program yazınız.
			// arr1 = { {1,2}, {3,4,5}, {6} }  ve  arr2 = { {7,8,9}, {10,11}, {12} }

			int arr1[][]= {{1,2}, {3, 4, 5}, {6}};
			
			int arr2[][]= {{7,8,9}, {10, 11}, {12}};
			
			int sum=0;
			for(int i=0, j=0;i<arr1.length && j<arr2.length;i++,j++){
				for(int k=0,l=0;k<arr1[i].length&&l<arr2[j].length;k++,l++) {
					if(i==j&&k==l) {
						sum=arr1[i][k]+arr2[j][l];
					}
					}
				}System.out.println(sum);

	}

}
