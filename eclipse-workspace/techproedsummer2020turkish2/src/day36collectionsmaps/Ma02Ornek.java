package day36collectionsmaps;

import java.util.Arrays;
import java.util.HashMap;

public class Ma02Ornek {

	/*
	 * Size verilen bir yazida hangi kelimenin kac kere kullanildigini g�steren kodu yaziniz.
	 * 
	 */
	
	public static void main(String[] args) {
		
	String s="Java ogrenmek zevkliydi. Java ogrenmek kolay ama tekrar gerekiyor. Java tekrari zevkliydi ama vaktim yoktu.";	
		
	String kelime[]=s.split(" ");	
	System.out.println(Arrays.toString(kelime));
	
	HashMap<String,Integer>hm=new HashMap<>();
	
	
	for(String w:kelime) {
		if(w.contains(".")) {
			w.replace(".","" );
		if(!hm.containsKey(w)) {
			hm.put(w, 1);
		}else {
			hm.put(w, hm.get(w)+1);
		}
		}else {
			if(!hm.containsKey(w)) {
				hm.put(w, 1);
			}else {
				hm.put(w, hm.get(w)+1);
			}
			}
	}
	System.out.println(hm);
	
	
	
	
	
	
	
	}

}
