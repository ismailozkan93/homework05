package day19arrays;

import java.util.Arrays;

public class A01 {

	public static void main(String[] args) {
		int arr[] = {3, 7, 1, 18};
		System.out.println(Arrays.toString(arr));
		
		
		//Array elemanlarini kücükten büyüge siralayalim.
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//[1, 3, 7, 18]
		
		//Bir String array olusturun ve elemanlarini alfabetik sirada dizin.
	
		String arr1[] = {"ahmet","veli","cemil","fadime"};
		System.out.println(Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
	//Bir integer array daki en büyük ve en kücük sayiyi ekrana yazdiran code u yaziniz.
		int irr[] = {13, 9, 6, 18, 23, 7, 11};
		Arrays.sort(irr);
		System.out.println(Arrays.toString(irr));
		System.out.println("En kücük: "+ irr[0]);
		System.out.println("En büyük: "+ irr[irr.length-1]);
	
	//Bir String array olusturun alfabetik siraya bastan ve sondan
	//ikinci elemanlari ekrana yazdirin.
		
	String krr[]= {"Ali", "Veli", "Can", "Fadime"};
	Arrays.sort(krr);
	System.out.println(Arrays.toString(krr));	
	System.out.println(krr[1]);//Can	
	System.out.println(krr[krr.length-2]);
	
	//Bir elemanin array de var olup olmadigini kontrol etmek
	int nrr[]= {2, 1, 7, 3, 5};
	
	//nrr arrayinda 7 elemaninin var olup olmadigini kontrol edin.
	int count = 0;
	//1.yol:Loop ile
	for(int i=0;i<nrr.length;i++) {
		if(nrr[i]==7) {
			count++;
		}
	}
	if(count!=0) {
		System.out.println("7 eleman olarak var");
	}else {
		System.out.println("7 eleman olarak yok");
	}
	//2.yol:BinarySearch()kullanarak
		//==>a)Once Kesinlikle sort()kullanmalisiniz.
		Arrays.sort(nrr);
		//==>b)arardiginiz eleman array da varsa binarySearch() size o elemanin
		//indexini verir.
		System.out.println(Arrays.binarySearch(nrr, 7));
/*
 * binarySearch()methodu eleman array'de var oldugunda asla negatif bir output vermez.		
 * binarySearch()methodu eleman array'de yoksa negatif bir output verir.
 */
System.out.println(Arrays.binarySearch(nrr, 6));//-5 verir==>"-"nin anlami yok demek.		
												// sayet 6 var olsaydi 5nci eleman olurdu.
		System.out.println(Arrays.binarySearch(nrr, 4));//-4
		
		System.out.println(Arrays.binarySearch(nrr, 99));//-6
		
		//Note: Bir array'de tekrarli elemanlar varsa binarySearch methodu varolup olmadigi hakkinda dogru karar verebilir
		//ama o elemanin sirasi hakkinda bazen yanilir.
		
	int mrr[] = {1, 3, 8, 3, 11};	
	Arrays.sort(mrr);//[1, 3, 3, 8, 11]	
	System.out.println(Arrays.binarySearch(mrr, 3));//1 veya 2 ama kesin sonuc yok.
	
	
	
		}
	}


