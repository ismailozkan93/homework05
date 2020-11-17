package day06ifstatementdt;

public class IfElseStatement {

	public static void main(String[] args) {
		
	int num=3;
	
	if(num<0)
		System.out.println("negatif");
	else {
		System.out.println("negatif degil");//1 CONDITION BIR KERE KONTROL YAPAR DAHA AZ IS YAPAR
	}
	if(num<0) {
		System.out.println("Negatif");//2 CONDITION 2 KERE KONTROL YAPAR,DAHA FAZLA IS YAPAR
	}
	if(num>=0) {System.out.println("Negatif degil");	
		
	}

}
}