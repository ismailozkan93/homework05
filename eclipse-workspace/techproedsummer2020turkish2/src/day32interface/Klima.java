package day32interface;

public interface Klima {

void isitma();
 
void antiBakteri();

void fiyat();

int i=15; 



//1)Interface icinde bodysi olan bir method uretmek isterseniz
//ya "default" veya "static" keywordlerden birini kulllanmak gerekir.
//2)"default" veya "static" keywordlerden birini kullarsaniz mutlaka method body'si
//kullanmaniz gerekir aksi takdirde CTE alirsiniz.
//3)"default" veya "static" keywordlerden birini kullanarak olusturdugunuz body'li
//methodlari child classlarin override etme zorunlulugu yoktur. 



//public default void m1();==>olmaz
//public static void m2();==>olmaz

public default void sogutma() {
	System.out.println("Iyi sogutur.");
}
public static void fresh() {
	System.out.println("Iyi sogutur");
}


}
