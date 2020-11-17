package day18arrays;

import java.util.Arrays;

public class A01 {

	private static final int a = 0;
	
	public static void main(String[] args) {
	
		int arr1[] = new int[3];

	//Bir array'i console 'a yazdirmak icin Arrays.toString() kulllaniriz.
	System.out.println(Arrays.toString(arr1));

	//Bir array'a eleman ekleme==>
	
	arr1[2]=11;//Son eleman 11 dir.
	System.out.println(Arrays.toString(arr1));
	
	arr1[1]=9;//Orta eleman 9 olsun.
	System.out.println(Arrays.toString(arr1));
	
	arr1[0]=7;//Ilk eleman 7 olsun.
	System.out.println(Arrays.toString(arr1));
	
	//Bir array'de olmayan indexi kullanmaya calistigimizda compile time error degil
	//Run Time Error alirsiniz.Yani;kodu calistirdiktan sonra console'da kirmizi
	//hata mesaji görürsünüz.Kodu yazarken kirmizi alt cizgi almissaniz.
	//Örnegin; arr1[3]=13 ; kod calistiktan sonra "ArrayIndexOfBoundsException" hatasi verir.
	
	//Kisa Yoldan Array olusturup deger atama
	int arr2[]= {8, 10, 12, 14};
	System.out.println(Arrays.toString(arr2));//[8, 10, 12, 14]
	

	//Bir arraydaki belli elemani ekrana yadiralim
	System.out.println(arr2[0]);//8
	System.out.println(arr2[1]);//10
	System.out.println(arr2[2]);//12
	
	
	//Her array da son elemani yazdiran kod ne olabilir.
	int arr3[]= {21, 22, 23, 24, 25, 26, 27};
	System.out.println(arr3[arr3.length-1]);
	
	//Bir array olusturunuz,elemanlarini for loop kullanarak ekrana
	//ayni satirda aralarina bosluk koyarak yazdiriniz.
	
	int arr4[]= {1, 3, 5, 7 ,9};
	for(int i=0;i<arr4.length;i++) {
	System.out.print(arr4[i]+" ");
	}
	
	//Bir array olusturunuz.Bu array'in indexi cift sayi olan elemanlarini while-loop
	//Kullanarak ekrana ayni satirda ve aralarinda bosluk koyarak yaziniz.
	
	int arr6[]= {23, 24, 25, 26, 27, 28, 29};
	
	int a = 0;
	while(a<arr6.length) {
		if(a%2==0) {
		System.out.print(arr6[a]+" ");
	}a++;
		}
	////Bir array olusturunuz.Bu array'in icindeki tek ve cift sayi olan elemanlarini for-loop
	//Kullanarak ekrana ayni satirda ve aralarinda bosluk koyarak yaziniz.
	
	System.out.println();
	int arr5[]= {1, 2, 5, 8, 6, 7, 9 ,11};
	int b=0;
	while(b<arr5.length) {
		if(arr5[b]%2==1) {
		System.out.println(arr5[b]+"Tektir");	
		}
		else{
		System.out.println(arr5[b]+"Cifttir");
	}
	b++;
	}
	
	}
}
