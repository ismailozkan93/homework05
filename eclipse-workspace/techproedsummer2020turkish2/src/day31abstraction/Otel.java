package day31abstraction;

public abstract class Otel {

	/*
	 * Abstract class'i final yapamayiz.Cunku final classlarin child classlari olamaz;halbuki biz 
	 * abstract classlari child classlari olsun ve child class'lari bazi seyleri yapmaya mecbur biraksin diye olustururuz.
	 Bu celiskiden dolayi Java abstract class'larin final olmasina musaade etmez, Compile Time Error verir
	 */
	
	
public abstract void kahvalti();	

public void cay(){
	System.out.println("7/24 Cay Servisi");
}

public void wifi() {
	System.out.println("7/24 wifi servisi");
}

}


