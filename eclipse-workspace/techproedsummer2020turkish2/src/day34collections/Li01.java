package day34collections;

import java.util.LinkedList;
import java.util.List;

public class Li01 {

	public static void main(String[] args) {

		//LinkedList elemanlari giris sirasina(insertion order) göre siralar.
		
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Veli");
		linkedList.add("Aliye");
		linkedList.add("Burhan");
		linkedList.add("Canan");
		linkedList.add("Kemal");
		linkedList.add("Reyhane");
		System.out.println(linkedList);
		
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList.add("XXXX");
		linkedList.add("YYYY");
		linkedList.add("ZZZZ");
		System.out.println(linkedList2);
		
		linkedList.add(1, "Cemal");
		System.out.println(linkedList);

		linkedList.addFirst("Kayahan");
		System.out.println(linkedList);
		
		linkedList.addLast("Ayse");
		System.out.println(linkedList);
		
		//addAll() kullandiginizda ilk list degisir.parentez icindeki list degismez.
		linkedList.addAll(linkedList2);
		System.out.println(linkedList);
		
		linkedList.addAll(5,linkedList2);
		System.out.println(linkedList);
		
		linkedList.remove();//Ilk elamani siler.
		System.out.println(linkedList);
		
		linkedList.remove(1);//indexi 1 olani siler.
		System.out.println(linkedList);
		
		linkedList.remove("Canan");//Olmayan elemani sil dersek error vermez ve silme yapamayz
		System.out.println(linkedList);
		
		linkedList.remove("YYYY");
		System.out.println(linkedList);
		
		linkedList.removeAll(linkedList2);
		System.out.println(linkedList);
		
		linkedList.removeFirst();
		System.out.println(linkedList);
		
		linkedList.removeLast();
		System.out.println(linkedList);
		
		
		
		
	}

}
