package day37maps;

import java.util.Hashtable;

public class Ht01 {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> ht = new Hashtable<>();
		
		ht.put(100,"Ali");
		ht.put(101,"Veli");
		ht.put(102,"Aylin");
		ht.put(103,"Emine");
		
		//ht.pull(null,"Ramazan");//HashTable'da key icin 'null' kullanilmaz.
								//Key icin null kullanirsaniz 'NullPointerException' alir.
		
		//ht.pull(104,value);//HashTable'da value icin 'null' kullanilmaz.
							//value icin null kullanirsaniz 'NullPointerException' alir.
		
		System.out.println(ht);

	}

}
