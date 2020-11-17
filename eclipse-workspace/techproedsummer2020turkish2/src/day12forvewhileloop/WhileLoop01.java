package day12forvewhileloop;

public class WhileLoop01 {

	public static void main(String[] args) {
		// Ilk 10 sayma sayisini ekrana yazdiriniz.
		int i = 1;
		while(i<=10) {
			System.out.println(i +" ");
			i++;
		}
/*Yukaridaki kodda int i=1; ifadesi for-loop un ilk bölgesi,
 * i<=10 for-loop`un ikinci bölgesi,i++; for-loop un ucunu bölgesi gibidir.
 * DIKKAT:i++; ifadesi yazmazsaniz while-loop döngüsü sonsuz döngüye girer bu da pc ye zarar verebilir.	
*/
	//ilk 10 sayma sayisinin büyükten kücüge yazdiriniz.while-loop kullanin.	
		
		int a =10;
		while(a>=1) {
		System.out.println(a+" ");
		a--;
		}
		
//ilk 100 cift sayma sayisini yazdiriniz.
		int sayma=1;
		int t = 1;
		while(sayma<=100) {
		if(t%2==0) {
			System.out.print(t + " ");
		sayma++;
		}
		t++;
		}
//j den önceki tüm kücük harfleri yazdiran bir program yapiniz.while-loop kullaniniz
		
		char h ='a';
		while ( h<'j') {
			System.out.println(h+" ");
			h++;
		}
		
//Son ilk bes harfin aski degerleri toplamini ekrana yazdiran bir program yaziniz.While-loop kullaniniz
		int sum2=0;
		int s='A';//char s ='A'; Char lar matematiksel islemde aski degeri alirlar.
		while(s<='E') {
			sum2 = sum2 + s;
			s++;
		}
		System.out.println("toplam: " +sum2);
	}

}
