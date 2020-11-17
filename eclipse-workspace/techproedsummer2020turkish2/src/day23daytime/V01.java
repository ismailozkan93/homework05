package day23daytime;

public class V01 {

	public static void main(String[] args) {
		// Varargs :(Variable Arguments) Varargs normalde bir array'dir.Ama uzunlugu kullanicinin
		//girdigi deger sayisina göre büyür.		
		
		//Not: Varargs dipsiz bir kuyu gibidir,icine ne atilirsa kabul eder.
		
		
		//1)Varargs dan sonra baska parametre kullanilamaz.
		//Varargs method parantezi icerisinde her zaman en son parametre olmalidir.
		
		//2)Vargarsdan önce varargs olmayan parametreler kullanilabilir.
		
		//3)Bir method parentezinin icinde sadece bir tane varargs kullanabilirsiniz.
		
		
		add(3,5);
		add(3, 5, 7);
		add(3,5,7,9,11,13,15,17);
		product(2,3,5,6);
	}
	
//public static void add(int s1,int s2) {
//System.out.println(s1+s2);
//}
//public static void add(int s1,int s2,int s3) {
	//System.out.println(s1+s2+s3);
//}
public static void add(int...x) {
	int sum=0;
	for(int w:x) {
		sum=sum+w;
	}System.out.println(sum);
}
//Ne kadar sayi girilirse ekrana carpimini yazdirin
public static void product(int x,int...y) {
	int product=1;
	for(int w : y) {
		product= product*w;
	}System.out.println(product);
	
}

//Homework: Kelimenin haarflerini alip onlari giris sirasina göre birlestirerek ekrana basan bir program yaziniz.
//Varargs kullanmak zorundasiniz.

}
