package day18arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework06 {

	public static void main(String[] args) {
		/*Kullanıcıya kaç elemanlı bir array gireceğini sorun.  Kullanıcıdan array’in elemanlarını girmesini isteyin.
		 *  a) Bu array’in tum elemanlarını ekrana yazdırın. 
		 *  b) Bu arayın son elemanını ilk eleman yapın ve tum elemanlarını ekrana yazdırın.     
		 *    Mesela; array {1, 2, 3} ise ekrana {3, 1, 2} seklinde yazdırın.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Kac elemanli array olucak");
		int e = scan.nextInt();
		int arr[] = new int[e];
		int i=0;
		while(i<e) {
		System.out.println(i+"nci elemani giriniz:");	
		arr[i]=scan.nextInt();
		i++;
		}System.out.println(Arrays.toString(arr));//a)
	
		int temp=0;
		arr[0]=temp;
		arr[arr.length-1]=arr[0];
		temp=arr[arr.length-1];
		
		System.out.println();
	System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
/*		
		int arr[] = new int[e];
		for(int i=0;i<arr.length;i++) {
		System.out.println("Elemanlarini giriniz");
		arr[i]= scan.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
	
	int temp;
	temp = arr[0];
	arr[0]=arr[arr.length-1];
	arr[arr.length-1]=temp;
	System.out.println();
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
*/