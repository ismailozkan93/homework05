package day30exceptions;

public class F01 {
	
	// final,finally,finalize()arasindaki farklar nelerdir?
	
	//final:final keyword'u variablelardan,methodlardan ve classlardan önce kullanilabilir.
	//1)final variable:Bir variable final ise,o variable'a bir kere deger atamasi yaparsaniz
	//bir daha o degeri degistiremezsiniz.
	//2)final method:Body'si son halde olan methodlardir.Yani body^si degistirilemezdir.Final
	//methodlar override edilemezler.
	//3)final class:Child'i olamaz.Inheritance yapilamaz.
	
	//finally:Try-catch den sonra kullanilir. Try block exception uretse de uretmese de finally block icindeki kod calisir. 
	 
	// finalize(): Java'da Garbage Collector silmesi gereken data'lari once finalize eder sonra imha eder.

	
	final double pi=3.14;
	
	public static void main(String[] args) {
		

	}

}
