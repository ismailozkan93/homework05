package day04scanner;

public class TypeCasting02 {

	public static void main(String[] args) {
//java yuvarlama yapmaz,ondalik kismi kesip atar.
//Decimal bir sayiyi byte, short, int, long gibi bir sayiya assign edersek
//o virgullu ondalik kismini iptal,sadece tam kismini kabul eder.
		
		
		int i1 = 5/3;
		System.out.println(i1);

//java int/int sonucunu tamsayi olarak kabul eder.
		
		double d1 = 5/2;
		System.out.println(d1);
		
//Matematiksel islemlerde birden fazla data type varsa bütük type göre olur.(double>int)		
		double d2 = 5.0/2;
		System.out.println(d2);
		
		double d3 = 5/2.0;
		System.out.println(d3);
		
	}

}
