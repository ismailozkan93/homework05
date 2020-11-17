package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework02 {

	public static void main(String[] args) {
		// 1) Elemanları A, C, E, ve F olan bir String ArrayList oluşturup ekrana yazdırınız. 
		List<String> sl = new ArrayList<>();
		sl.add("A");
		sl.add("C");
		sl.add("E");
		sl.add("F");
		System.out.println(sl);
		
		//2) İndexsiz add() methodunu kullanarak, B’yi ekleyiniz.  İndex’li add() methodunu kullanarak, 
		//L’yi 1 numaralı index’e ekleyiniz. ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, L, C, E, F, B. 
		sl.add("B");
		sl.add(1,"L");
		System.out.println(sl);
		
		//3) set() methodu kullanarak, E’yi D yapınız.  ArrayList’i ekrana yazdırınız, 
		//list şöyle olmalı; A, L, C, D, F, B.
		sl.set(3, "D");
		System.out.println(sl);
		
		//4) remove() methodu kullanarak, F’yi siliniz. ArrayList’i ekrana yazdırınız,
		//list şöyle olmalı; A, L, C, D, B. 
	
		sl.remove("F");
		System.out.println(sl);
	
		//5) sort() methodu kullanarak, elemanları alfabetik sıraya diziniz.
		//ArrayList’i ekrana yazdırınız, list şöyle olmalı; A, B, C, D, L. 
	
		Collections.sort(sl);
		System.out.println(sl);
	
		//6) contains() methodu kullanarak, L’nin list’de var oldugunu ve
		//M’nin list’de var olmadığını doğrulayınız. 
	
		System.out.println(sl.contains("L"));
		System.out.println(sl.contains("M"));
		System.out.println(sl);
	
		//7) size() methodu kullanarak, list’in kaç eleman olduğunu ekrana yazdırınız. 
		
		System.out.println(sl.size());
	
		//8) clear() methodu kullanarak, list’deki tum elemanları siliniz. 
		
			sl.clear();
		System.out.println(sl);
	
		//9) isEmpty() methodu kullanarak, list’deki tum elemanların silindiğini doğrulayınız.
		
		System.out.println(sl.isEmpty());
		
		
		
		
	
	
	}

}
