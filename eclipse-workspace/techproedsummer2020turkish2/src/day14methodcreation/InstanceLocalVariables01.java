package day14methodcreation;

public class InstanceLocalVariables01 {

	int i = 12;//Instance Variable
	
	
	

	public static void main(String[] args) {
	
		
		/*Instance (Görünüm/Object) Variable = Object Variable
		 * Main metodun disinda class in icinde üretilen variablelara "Instance Variable" denir.
		 * Instance Variablelar class in icindeki tüm metodlar tarafindan kullanilir.
		 */

		/*Local Variable = Metod'un body icisinde veya metodun method parantezi icinde üretilen variable'lardir.
		 *Sadece Lokal Variable'lar sadece method bodysi icinde kullanilabilirler. 
		 *
		 */
		/*1) Instance Variable larin scope u icinde bulundugu class in her yeridir.Yani instance variablelar class in 
		 * 	 icinde her yerde kullanilabilir.
		 *2) Lokal Variablelarin scope icindeki bulunduklari metodun bodysidir.
		 *yani lokal variablelar method body icinde kullanilabilirler. 
		 */
		
	//Not:Instance variable'lara deger atamasi yapmazsaniz Java onlara default deger atamasi yapar. Ama local
	//variablelara deger atamasi yapmazsaniz Java onlara default deger atamasi yapmaz ve variable kullanmak
	//istediginizde "Compile Time Error" verir.	
		
		
	}
	
	public void toplama() {
		int sonuc = 13;
		i++;
		System.out.println("Toplama");
	
	}
	public void cikarma(int n1) {
		n1++;
		i--;
		System.out.println("Cikarma");
	}
}
	