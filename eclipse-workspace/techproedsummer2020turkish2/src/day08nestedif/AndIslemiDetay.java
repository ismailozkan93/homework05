package day08nestedif;

public class AndIslemiDetay {

	public static void main(String[] args) {
// & ile && farki
/*T && T = T	
*T && F = F
*F && F =F
*F&& T =F
*Ilk ifade False ise sonuc kesinlikle False dur.Ikinciye bakmaz
/*T && T = T	
* T && F = F
* F && F = F
* F && T = F
*Ama And islemi icin tekli & sembolu kullanirsaniz java her iki durumda kontrol eder.
*&& kullanmak javanin isini azaltir.Javaya hiz kazandirir.Her zaman && kullaniriz.
*/
	if(5>4 & 6>2){
		System.out.println("Elma");
	}
	else {
		System.out.println("Armut");
	}
	}

}
