package day18arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Homework07 {

	public static void main(String[] args) {
		//Kullanıcıya kaç elemanlı bir array gireceğini sorun. 
		//Kullanıcıdan array’in elemanlarını girmesini isteyin. 
		//a) Bu array’in icinde herhangi bir elemanın var olup olmadigini kontrol edin. 
		//b) Bu arayın tum elemanlarını tersten yazdırın. 

		Scanner scan = new Scanner(System.in);
		System.out.println("Array eleman sayisini giriniz");
		int sayi=scan.nextInt();
		int arr[]=new int[sayi];
		for(int i=0;i<arr.length;i++) {
			System.out.println(i+"nci elemanin degeri giriniz");
			arr[i]=scan.nextInt();
		}System.out.println(Arrays.toString(arr));
		System.out.println("Bir eleman giriniz");
		int a =scan.nextInt();
		int count=0;
		for(int i =0;i<arr.length;i++) {
				if(a==arr[i]) {
					count++;
				}
		}
		if(count>0) {
			System.out.println("Eleman vardir");
		}else {
			System.out.println("Eleman yoktur");
		}
		
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(" "+ arr[i]);
		}
		System.out.println();
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		
		
		
		
		
		
}
}

/*		Scanner scan = new Scanner(System.in);
		System.out.println("eleman sayisini giriniz");
		int e=scan.nextInt();
		int arr[]=new int[e];
		for(int i=0;i<e;i++) {
			System.out.println("Eleman giriniz");
			arr[i]=scan.nextInt();
		}
		for(int i =0; i<arr.length;i++) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(" "+arr[i]);
		}
		System.out.println();
		System.out.println("Bir deger giriniz");
		int num = scan.nextInt();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(num == arr[i]) {
			count++;
		}if(count>0) {
			System.out.println("Eleman vardir");
		}else {
			System.out.println("Eleman yoktur");
		}
	}
 * 
 */



//
/*System.out.println("Bir deger giriniz");
		int num = scan.nextInt();
		int count=0;
		int i=0;
		while(i<arr.length)		{
			if(num == arr[i]) {
				count++;	
			}i++;
				
		}
		
*
*/