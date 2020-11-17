package day35collections;

import java.util.LinkedList;
import java.util.Queue;

public class Q01 {

	public static void main(String[] args) {
		//Ilk eklenen ilk silinir==>FIFO = First in first out
		
		Queue<String> q01=new LinkedList<>();
		q01.add("Apple");
		q01.add("Mango");
		q01.add("Fig");
		q01.add("Peach");
		q01.add("Grape");
		q01.add("Apricot");
		System.out.println(q01);
		
		q01.remove();
		System.out.println(q01);
		
		System.out.println(q01.element());//Size ilk elemani veir ama ilk elemani queden silmez.
		System.out.println(q01);
		
		q01.peek();//Size ilk elemani veir ama ilk elemani queden silmez.
		
		System.out.println(q01.poll());//Size ilk elemani verir ama ilk elemani queden siler.
		System.out.println(q01);
		
	}

}
