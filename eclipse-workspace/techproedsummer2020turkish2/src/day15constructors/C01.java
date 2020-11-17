package day15constructors;

public class C01 {

	
		//1)Constructorlar main methodun disinda, class in icinde olusturulur.
		//2)Constructor in ismi class ismi ile ayni olmalidir.
		//3)Method ile Constructor farki: a)method ismi class isminden farkli olabilir.
		//b) methodlarda return type olur,constructorlarda olmaz.Constructorlara return type eklerseniz o method olur.
		//4)Bir class da birden fazla constructor olabilir.Ama constructorlarin parametreleri farkli olmalidir.
		//Yani farkli parametre üretmek icin overloading kullanilir.
	
	C01(){
		System.out.println("Parametresiz Constructor");
	}
	C01(int i){
		System.out.println("Integer Parametreli Constructor");
	}
	C01 (String s){
		System.out.println("String Parametreli Constructor");
	}
	C01(String s, int i){
		System.out.println("Iki Parametreli");
	}
	
	public static void main(String[] args) {
	
		//Class ismi			objecte ismi						new Keyboard		Constructorlar
		
			C01						obj1					=			new						C01();
			C01						obj2					=			new						C01("Ali");
			C01						obj3					=			new						C01(11);
			C01						obj4					=			new						C01("",12);
		
	}
	
	public void toplama() {
	System.out.println("Toplama");	
	}

}
