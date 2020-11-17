package day32interface;

public interface Car {
	
	/*
	 *1)Interface bir class degildir,interface interface'dir.
	 *2)Abstract class'larin icine concrete methodlar koyabilirdik,ama interface'lerin
	 *icine (Bazi ozel durumlar haric) concrete method koyamayiz.Yani;interface'ler sadece
	 *abstract method icerebilir.Bu yüzden interface kullanimi "full abstraction" olarak adlandirilir. 
	 *3)Interfaceler iclerindeki methodlari default olarak abstarct kabul ederler.Bu yüzden method olustururken
	 *abstract kullanmak istege bagliddir. 
	 *4)Interface icine concrete method koyarsaniz CTE verir.
	 *5)Interface lerdeki methodlar default olarak public olurlar.
	 *6)Interfacelerde variablelar default olarak "final" olurlar.
	 *7)Interface variablelarin acces modifierlari default olarak "public" olur.
	 *8)Interfacelerde variablelar default olarak static olurlar.
	 *9)Interfacelerde variable olusturdugumuzda mutlaka deger atamasi(initialize) yapmaliyiz.
	 *10)Interfacelerden obje üretilmez.
	 */
	
	//int i=12;==public final static int i=12;
	int i=12;
	
	public void motor(); 
		
	public abstract void direksiyon();
	
	//teker() hem publicdir hem de abstracttir.
	//void teker();=public void teker();==abstract void teker()== public abstract void teker();
	void teker();
	
	void fiyat();
	
	
}
