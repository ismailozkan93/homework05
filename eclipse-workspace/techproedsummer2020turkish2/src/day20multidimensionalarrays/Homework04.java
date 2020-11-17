package day20multidimensionalarrays;

import java.util.Arrays;

public class Homework04 {

	public static void main(String[] args) {
		// Aşağıdaki multi dimensional array’in iç array’lerindeki tum elemanların
		//toplamını birer birer bulan  ve herbir sonucu yeni bir array’in elemanı yapan 
		//ve yeni array’i ekrana yazdıran bir program yazınız  { {1,2,3}, {4,5}, {6,7} }   
		//Ornegin; { {1,2,3}, {4,5}, {6,7} }  ==> 1+2+3=6  4+5=9  6+7=13  ==>  output: {6, 9, 13}
		
		int sum1 = 0;int sum2=0; int sum3=0;
		int arr[] [] = { {1, 2, 3}, {4, 5}, {6 , 7}};
		for(int i= 0;i<arr.length;i++){
			for(int k = 0; k<arr[i].length;k++) {
				if(arr[i]== arr[0]) {
				sum1 = sum1+arr[0][k];
				}
			
				if(arr[i]==arr[1]) {
				sum2= sum2+arr[1][k];
				}
				
				if(arr[i]==arr[2]) {
				sum3 = sum3+arr[2][k];}
			}
			
		}
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		
		
		int arr1[] = new int[3]; 
		 arr1[0]= sum1;
		 arr1[1]=sum2;
		arr1[2]=sum3;
		System.out.println(Arrays.toString(arr1));
		
		}
	}


