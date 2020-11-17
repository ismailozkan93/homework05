package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L01 {

	public static void main(String[] args) {
	
		String s[]= {"A","B","C"};
		System.out.println(Arrays.toString(s));
		List<String> sl = new ArrayList<>();
		
		// Bir array'i nasil list'e cevirebilirsiniz?
		
		sl = Arrays.asList(s);
		System.out.println(sl);//[A, B, C]
		
		
		//Bir list nasil Array'a cevrilir?
		//Java'da her class'in en az bir tane parent'i vardir.
		//Parent'i olmayan tek class Object class'dir.
		//Object class tüm class'larin ortak babasidir.
		
		
		Object[] lisstenArray=sl.toArray();
		
		
		
		

	}

}
