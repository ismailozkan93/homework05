package day04scanner;

public class TypeCasting01 {

	public static void main(String[] args) {
		// kucuk data type`nin büyük data type ina cast edilmesi
		byte b1 = 13;//Auto Widening Casting
		int i1 = b1;
		System.out.println(b1);
		System.out.println(i1);
		
		short s1 = 2300;
		float f1 = s1;
		System.out.println(s1);
		System.out.println(f1);
		
		//explicit(acikca) Narrowing
		short s2 = 120;
		byte b2 = (byte)s2;
		
		System.out.println(s2);
		System.out.println(b2);
		
		double d1 = 23.789;
		float f2 = (float)d1;
		
		System.out.println(d1);
		System.out.println(f2);
		
		short s3 = 1200;
		byte b3 = (byte)s3;
		System.out.println(s3);
		System.out.println(b3);
		
		
		//Asagidaki hata kac farkli sekilde düzeltilebilir.
		//               float f3 = 2.34;
		//1)2.34 den sonra f yazariz.
		//2)2.34 ün önüne float koyariz.
		//3) data type ni double f3 = 3.24 yapariz
		
		
		
	}

}
