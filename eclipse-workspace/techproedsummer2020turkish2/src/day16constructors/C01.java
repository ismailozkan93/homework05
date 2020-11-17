package day16constructors;

public class C01 {
	
	int i = 12;			// instance (object) variable
	static int k = 13; //static(class)variable
	
	public static void main(String[] args) {
		C01 obj1 = new C01();
		obj1.i = 20;
		System.out.println(obj1.i);//20
		
		obj1.k = 30;
		System.out.println(obj1.k);//30
		
		C01 obj2 = new C01();
		System.out.println(obj2.i);//12
		System.out.println(obj2.k);//30
		
		
	}

}
