package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Homework01 {

	public static void main(String[] args) {
		//List olusturma ve eleman ekleme

		List<String> hayvan = new ArrayList<>();
		hayvan.add("Kedi");
		hayvan.add("Yilan");
		System.out.println(hayvan);
		
		hayvan.add(0, "Sinek");
		hayvan.add(1,"Kartal");
		hayvan.add(0, "Aslan");
	System.out.println(hayvan);
	
	//list in uzunlugunu bulma
	System.out.println(hayvan.size());
	
	//bos olup olmadigi
	System.out.println(hayvan.isEmpty());
	
	//array listten eleman silme
	System.out.println(hayvan.remove(2));
	System.out.println(hayvan);
	
	System.out.println(hayvan.remove("Sinek"));
	System.out.println(hayvan.remove("At"));
	
	System.out.println(hayvan.size());
	
	//eleman degistirme
	System.out.println(hayvan.set(0, "Tavsan"));
	System.out.println(hayvan);
	
	//tüm elemanlari silme
	hayvan.clear();
	System.out.println(hayvan);
	
	//icerip icermedigi
	hayvan.add("Kene");
	hayvan.add(1, "Kaplan");
	System.out.println(hayvan.contains("At"));
	System.out.println(hayvan.contains("Kaplan"));
	
	hayvan.add(2,"Kanguru");
	System.out.println(hayvan);
	
	//natural ordera göre sinirlama
	Collections.sort(hayvan);
	System.out.println(hayvan);
	

	
	
	
	
	
	
	
	
	
	
	
	}

}
