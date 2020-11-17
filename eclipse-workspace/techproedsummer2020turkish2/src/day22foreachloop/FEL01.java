package day22foreachloop;

import java.util.ArrayList;
import java.util.List;

public class FEL01 {

	public static void main(String[] args) {
	
		List<Integer> il = new ArrayList<>();
il.add(21);
il.add(22);
il.add(23);
il.add(24);
il.add(25);
il.add(26);
//for-each loop=Enhanced Loop

for(Integer w : il) {
	System.out.println(w);
}
//il listi'nin tüm elemanlarini toplayiniz.
int sum=0;
for(Integer w : il) {
	sum=sum+w;
}System.out.println(sum);

//il listinin icindeki tek sayi olan elemanlarin carpimini bulunuz.

int product=1;
for(Integer w : il) {//Integer yerine int de yazsak program calisir.
	if(w%2!=0) {
	product*=w;}
}System.out.println(product);

//il listinin icindeki tek sayi olan elamanlari yazdiriniz.
System.out.print("Tek Sayilar:");
for(Integer w : il) {//Integer yerine int de yazsak program calisir.
	if(w%2!=0) {
System.out.print(w+" ");
}
}

//break ve continue karsilastirmasi

//il listinin ilk 3 elemanini yazdiriniz.
System.out.println();
int count=0;
for(int w : il) {
	if(count<3) {
	System.out.println(w);
	count++;
	}
}
System.out.println();

int c=0;
for(int w : il) {
	System.out.println(w);
	c++;
if(c==3) {
	break;
}
}
System.out.println();
System.out.println("3ile bölünenler");
//il listesinde 3 ile bölünebilenleri ekrana yazdirin
//1.yol
for(int w : il) {
	if(w%3==0) {
		System.out.println(w);
	}
}
System.out.println();
//2.yol

for(int w:il) {
	if(w%3!=0) {
		continue;
	}else {
		System.out.println(w);
	}
}









}

	}


