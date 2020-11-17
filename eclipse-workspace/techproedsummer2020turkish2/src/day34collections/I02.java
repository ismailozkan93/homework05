package day34collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class I02 {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<>();
		list1.add("X");
		list1.add("Y");
		list1.add("Z");
		System.out.println(list1);
		
		ListIterator<String> li1=list1.listIterator();
		while(li1.hasNext()) {
			Object el=li1.next();//Pointer'i en saga tasidi
		}
		
		ListIterator<String> li2=list1.listIterator();
		
		while(li1.hasPrevious()) {
			Object el=li1.previous();//en sagdan baslayarak list'i uptade etti.
			li1.set(el+"A");
		}
		System.out.println(list1);
		Collections.reverse(list1);//listi ters cevirdik.
		System.out.println(list1);
		
		

	}

}
