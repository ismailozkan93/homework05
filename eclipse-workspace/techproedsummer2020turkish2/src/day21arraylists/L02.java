package day21arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L02 {

	public static void main(String[] args) {
		// Bir elemani degistirme
		
		List<String> sl = new ArrayList<>(); 
		sl.add("Ali");
		sl.add("Kemal");
		sl.add("Ayse");
		
		//Bir eleman nasil degistirilir?
		sl.set(0, "Aliye");
		System.out.println(sl);
		
		//Bir elemanin varligi nasil kontrol edilir?
		System.out.println(sl.contains("Kemal"));//True
		System.out.println(sl.contains("wwww"));//false
		
		//Elemanlari natural order'a göre(Kücükten büyüge,alfabetik sira) nasil dizeriz
		Collections.sort(sl);//Cok kullanilir.
		System.out.println(sl);//[Aliye, Ayse, Kemal]
		
		//Elemanlari natural order in tersine göre siralamak(Büyükten kcüüge,sondan basa)
		Collections.reverse(sl);
		System.out.println(sl);//[Kemal,Ayse,Aliye]
		
		//Listeki elemanlarinin tamamini nasil sileriz
		sl.clear();
		System.out.println(sl);
		
		//Iki listin esit olup olmadigini nasil kontrol ederiz
		//Note:Listler asla primitivelerle calismazlar.
		
		/*Her primitive data type'inin Wrapper Class'i vardir.
		 * booelan==>Boolean
		 * char==>Character
		 * byte==>Byte
		 * short==>Short
		 * int==>Integer
		 * long==>Long
		 * float==>Float
		 * double==>Double
		 */
		
		//Iki listin esit olup olmadigini nasil kontrol ederiz.
		List<Integer> il1 =new ArrayList<>();//
		
		il1.add(12);
		il1.add(13);
		il1.add(14);
		
		List<Integer> il2 = new ArrayList<>();
		il2.add(12);
		il2.add(13);
		il2.add(14);
		
		System.out.println(il1.equals(il2));//esitse true,degilse false verir.
											//Hem elemanlari hem de elemanlarin yerlerini kontrol eder.
		
		
		
	}

}
