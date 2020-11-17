package day21arraylists;


import java.util.ArrayList;
import java.util.List;

public class L01 {

	//1)Arraylerin uzunluklari en basta belirlenir ve bir daha degistirilemez
	//Listlerde(ArrayList) ise list olustururken uzunluk belirlemeye gerek yoktur.
	//Cünkü list'ler eleman eklendikce kendilerini büyütürler,eleman kücüldükce
	//kendilerini kücültürler.
	//2)Listler cok kullanisli methodlara sahiptir.Bu yüzden array'lere tercih edilir.
	//3)Array'ler primitive ve reference lari eleman olarak kabul ederler.
	//Ama listler sadece non-primitive'leri eleman olarak kabul ederler.
			
	public static void main(String[] args) {
	
	//List olusturma nasil yapilir?
	//1.yol:
	ArrayList<String> sl1 = new ArrayList<String>();//2nci Stringi yazmaya gerek yoktur.
	
	//2.yol
	ArrayList<String> sl2 = new ArrayList<>();
		
	//3.yol
	List<String> sl3 = new ArrayList<>();
		System.out.println(sl3);//[]
		
	sl3.add("A");	
	System.out.println(sl3);//[A]	

	sl3.add("B");//add() metodu her zaman yeni elemani en saga ekler.
	System.out.println(sl3);//[A,B]
	
	sl3.add("C");//
	System.out.println(sl3);//[A,B,C]
	
	//Herhangi bir indexe eleman ekleme nasil yapilir?
	sl3.add(1, "X");
	System.out.println(sl3);
	
	sl3.add(0,"Mustafa");
	System.out.println(sl3);
	
System.out.println(	sl3.size());//5
	
	//Bir listin bos olup olmadigini nasil anlariz?
	System.out.println(sl3.isEmpty());//Bos ise true,dolu ise false verir.
	
	//Bir listten eleman silme nasil yapilir?
	sl3.remove(0);							//1.YOL:index ile silme yapabilirsiniz.

	System.out.println(sl3);//[A,X,B,C]

	sl3.remove("X");//[A,B,C];
	System.out.println(sl3);
	
	sl3.add("B");//[A,B,C,B]
	sl3.remove("B");//1'den fazla varsa ilkini siler.
	System.out.println(sl3);//[A,C,B]
	
	
	sl3.remove("W");//Java'dan olmayan bir elemani remove etmesini isterseniz.
					//remove edemez ve list'i aynen oldugu gibi birakir.
	System.out.println(sl3);//[A, C, B]
	
	System.out.println(sl3.remove("W"));
	//java'dan olmayan bir elemani remove etmesini isterseniz
	//remove edemez ve list'i aynen oldugu gibi birakir.
	System.out.println(sl3);//[A, C, B]
	
	//remove(index) ne return eder?
	System.out.println(sl3.remove(1));//C
	System.out.println(sl3);//[A, B]
	
	//remove(eleman) ne return eder?
	//sl3==>[A, B]
	System.out.println(sl3.remove("A"));//true
	System.out.println(sl3);//[B]
	
	
	}
}
