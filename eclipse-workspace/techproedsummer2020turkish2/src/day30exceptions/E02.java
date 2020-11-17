package day30exceptions;

public class E02 {

	/*
	 * 1)IllegalArgumentException bir Run Time Exception'dir,istedigimiz uygun argumentler
	 * kullanilmadigi zaman bu exception devreye girer.
	 *
	 *2)Throw ile throws farki nedir?
	 *a)Throw method body'si icinde kullanilir.Throws ise method parantezi ile curly brace 
	 *arasinda kullanilir.'==>) throws IQException { <=='
	 *
	 *b)throw method body'si icinde istedigimiz yerde istedigimiz kadar kullanabiliriz.Throws ise
	 *sadece method parantezi ile curly brace arasinda sadece bir kere kullanilabilir.
	 *
	 */
	
	public static void main(String[] args) {
		
		countEgg(-8);

	}

	public static void countEgg(int numOfEgg) {
	
		try {
		if(numOfEgg<0) {
			
			throw new IllegalArgumentException();
			
		}else {
		
			System.out.println(numOfEgg);
		
		}
		
	}catch(IllegalArgumentException e) {
		System.out.println("Ben sana yumurta sayisi diyorum sen negatif sayi kullaniyorsun");
	}
	
}}
