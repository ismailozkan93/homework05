package day15constructors;

public class C02 {

	//1)Class olusturdugumuzda Java bizim kesinnlikle object üretecegimizi düsünür ve class ile beraber görünmez
	//bir constructor olusturur. Bu constructor parametresiz Constructordir ve ismi "Default Constructor" dir.
	//2)Siz kendiniz herhangi bir constructor üretirseniz Java default constructor'u iptal eder.
	
	C02(int i){
		
	}
	
	
	C02(){
		
	}
	
	public static void main(String[] args) {
		
		C02 obj1 = new C02();

	}

}
