package day20multidimensionalarrays;

import java.util.Arrays;

public class Mda01 {

	public static void main(String[] args) {
	
		//Multi dimensional array nasil olusturulur.
		
		int mda[] [] = new int[3] [2];  	
		//multi dimensional array'e deger atamasi nasil yapilir
		mda [1] [0] = 7;
		
		//Multi dimensional array'ler nasil console a yazdirilir?
		System.out.println(Arrays.deepToString(mda));
	
	mda[2][0]=11;
	System.out.println(Arrays.deepToString(mda));
	
	mda[0][1]=23;
	System.out.println(Arrays.deepToString(mda));
	
	mda [0][0]= 10;
	
	mda [1][1]= 12;
	
	mda[2][1]=55;
	
	System.out.println(Arrays.deepToString(mda));
	
	//Multi dimensional arraylerde istenen bir elemani yazdik.
	System.out.println(Arrays.toString(mda[0]));
	System.out.println(Arrays.toString(mda[1]));
	System.out.println(Arrays.toString(mda[2]));
	
	
	System.out.println(mda[0][0]);
	System.out.println(mda[1][1]);
	System.out.println(mda[2][0]);
	
	//Multi dimensional array olusturmanin kisa yolu nedir?
	char mdach [][] = {{'a','b','c'}, {'d'}, {'e','f'}, {'g','h','i','k'}};
	System.out.println(Arrays.deepToString(mdach));

	//Soru:Yukaridaki multidimensional array'deki ilk arrayin elemanlarinin
	//ASCII degerleri toplamini ekrana yazdiriniz.
	
	//1.yol
	System.out.println(mdach[0][0]+ mdach[0][1]+mdach[0][2]);
	
	//2.yol for-loop ile
	int sum = 0;
	for(int i=0; i<mdach[0].length;i++) {
		sum = sum +mdach[0][i];
	}
	System.out.println(sum);
	
	
	}

}
