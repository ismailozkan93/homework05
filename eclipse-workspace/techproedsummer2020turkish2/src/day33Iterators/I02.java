package day33Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		
		ListIterator<String> li1=list1.listIterator();
		//While loop un icinde next() methodunu kullanmazsaniz pointer hareket etmez ve sonsuz döngü olusur.
		//Listteki ilk iki elemani siliniz.
		while(li1.hasNext()) {
			Object el=li1.next();
			li1.remove();
			if(el.equals("Y")) {
				break;
			}
		}
		System.out.println(list1);
		
		/*
		 * Bir String list olusturun ve tüm elemanlaari "XXX"dönüstürün.
		 * 
		 */
		
		List<String> list2= new ArrayList<>();
		list2.add("AB");
		list2.add("CDgh");
		list2.add("EFGTA");
		System.out.println(list2);
		
		ListIterator<String> li2=list2.listIterator();
		while(li2.hasNext()) {
			String el=li2.next();
			
			li2.set(el.replace(el,""+el.length()));
			
		}
		
		System.out.println(list2);
		
		
		
		
		
		
	}

}
