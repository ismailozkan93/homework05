package day25encapsulation;

public class E01 {

	private int sifre = 123456;	
	private String isim = "Ali Can";
	private char ch1='*';
	
	public static void main(String[] args) {
		/*
		 * 1)Encapsulation "data saklamak(hiding)" demektir.
		 * 2)Encapsulation yapmak icin variablelari private yapariz.
		 * 3)Encapsulation yaptiginiz variable'i a)Okumak b)Degistirmek icin acabilirsiniz.
		 */	
	}
	
	//Encapsulation yaptiginiz variable'in baska class'lardan okunabilmesini isterseniz 
	//getter method olusturmaniz gerekir.
	
	//1)AccessModifier public olsun
	//2)Retrun Type variablein variable ile ayni olsun.
	//3)get+variable ismi ilk harf büyük harfle olsun.
	//4)metodun icinde return ve variable ismi yazilsin.
	
	
	
public int getSifre() {
	return sifre;
}

public String getIsim() {
	return isim;
}

//1)Variable olusturup encapsulation yapiniz.
//2)Bu variable diger classlardan okunabilmesi icin gerekenleri yapiniz.
//3)Bu variable diger class okuyunuz.

public char getCh1() {
	return ch1;
}


/*
 * 1)Access modifier'i public yapiniz.
 * 2)Return type'i her zaman void yapiniz.
 * 3)Method ismi "set+variable ismi" seklinde yaziniz.
 * 4)Methodu parantezi icine variable'i return type'i ile beraber yaziniz.
 * 5)Method body'si icine "this.ch=ch" gibi yaziniz.(Variable ismi ch ise)
 */





public void setSifre(int sifre) {
	
	this.sifre=sifre;
	
}

public void setCh1(char ch1) {
	
	this.ch1=ch1;
}

public void setIsim(String isim) {
	this.isim=isim;
}


}
