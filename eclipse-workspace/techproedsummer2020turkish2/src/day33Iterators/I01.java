package day33Iterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class I01 {

	public static void main(String[] args) {
	List<String> list1= new ArrayList<>();
	list1.add("X");
	list1.add("Y");
	list1.add("Z");
	System.out.println(list1);
	
	//list1 icindeki her elemanin sonuna "A" HARFINI EKLEYELIM
	//loop kullanarak list'leri degistiremezseniz,elemanlari degistirenbilirsiniz
	//fakat listi uptade edemezseniz
	
	
	for(String w:list1) {
		w=w+"A";
	}
	System.out.println(list1);
	
	//Bir listi uptade etmek isterseniz iterator kullanmak zorundasiniz.
	
	//1.adim:ListIterator objesi olusturun.
	ListIterator<String> li1 = list1.listIterator();
	
	//2.adim:While loop kullanin
	
	/*
	 * 1)hasNext():pointer'a "Senden sonra eleman var mi" diye sorar.Pointer sonra eleman varsa
	 * true,yoksa false cevabini alir.Cevap true ise loop bir kez daha calisir,cevap false ise loop
	 * kirilir.
	 * 2)next():Ponter'i bir sonraki elemanin önüne tasir ve üstünden atladigi elemani return eder.
	 * 3)set():list icindeki elemanlari degistirmeye yarar.
	 * 
	 */
	
	
	while(li1.hasNext()) {
		Object element = li1.next();
		li1.set(element+"A");
	}
	System.out.println(list1);
	
	/*
	 * String bir list olusturun.
	 * Her elemanin basina "K",sonuna "L"ekleyin.Yeni listi'i ekrana yazdirin.
	 * 
	 */
	
	List<String> list2=new ArrayList<>();
	list2.add("a");
	list2.add("b");
	list2.add("c");
	list2.add("d");
	System.out.println(list2);
	
	ListIterator<String>li2=list2.listIterator();
	while(li2.hasNext()) {
		Object el=li2.next();
		li2.set("K"+el+"L");
	}
	System.out.println(list2);
	}
	

}
