package day31abstraction;

public abstract class Animal {

	/*1)"abstract" soyut demektir,zit anlamlisi "concrete"dir."concrete" somut demektir.
	 *2)"abstract" classlardan object üretilmez.Cünkü object concrete(somuttur.)ama "abstract"class
	 *abstract(soyuttur.) 
	 * 3)abstract class olusturarak child classlari bazi seylere yapmaya mecbur kilariz.
	 * Abstract class icerisinde olusturdugunuz abstract methodlar child classlar tarafindan
	 * uygulanmak zorundadir.Concere class icine abstract method yazamayiz.
	 * 4)"abstract" classlar icine abstract olmayan methodlar(concrete)methodlar
	 * yazabilirsiniz.Bu methodlar child classlar tarafindan istege bagli olarak kullanabilirler.
	 * 
	 */
	
	
	public abstract void asi() ;
	
	public abstract void drink();
	
}
