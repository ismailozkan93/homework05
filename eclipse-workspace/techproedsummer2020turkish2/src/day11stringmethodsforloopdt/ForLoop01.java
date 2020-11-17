package day11stringmethodsforloopdt;

public class ForLoop01 {

	public static void main(String[] args) {
		
		//Ekrana 10 defa java yazdiralim.
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		System.out.println("Java");
		
	//Yukaridaki isi for-loop kullanarak kisaca yapalim.
	//Baslangic condition artirma/azaltma
		
	for(int i = 1 ; i<=10 ;	i++		) {
	System.out.println("Java");	
	}
	
	
	//Ekrana 1 den 7 e kadar tam sayilari yazdiriniz.
	for(int k=1; k<=7 ; k++ ) {
		System.out.println(k);
	}
	//Ekrana 1 den 5 e kadar tam sayilari yazdiriniz.	
	for(int t=1; t<=5 ; t++ ) {
		System.out.println(t);
		
	//Ekrana 4 den 1 e kadar tamsayilari yazdirin.
	for(int z= 4 ;  z>=1  ; z=z-1) {
		System.out.println(z);
	}
	
	//1.yol Ekrana ilk üc cift sayma sayisini yazdirisiniz.
	for(int f= 2; f <=6 ; f=f+2) {
		System.out.println(f);
	}
	//2.Yol 
	for(int i = 1; i<= 6; i++) {
		if(i%2 == 0) {
			System.out.println(i);
		}
	}
	
	//Ekrana ilk 100 cift sayma sayisini yazdirin.
	//1.yol
	for(int a = 2; a<=200 ;a=a+2){
		System.out.println(a);
	}
	
	int sayma =1;
	for(int i = 1; sayma<=100; i++) {
		if(i%2==0) {
			System.out.println(i+" ");
			sayma++;
		}
	}
	
	
	
	}
	}

}
