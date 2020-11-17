package day09nestedternary;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		/*kullanicidan bir ücgenin uc kenar uzunlugunu alin.
		 * Ucu birbirine esitse cevreyi kontrol edin.
		 * cevre 30 dan büyük ise ""Ne büyüksün yazdirin.
		 * degilse "Normal yazdirin"
		 *ucu birbirine esit degilse Cevreyi kontrol edin.
		 *cevre 20 den kücükse "Ne kücüksün yazdirin" degilse "Normal yazdirin"
		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("ücgenin kenarlarini giriniz");
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		int cevre = A + B + C;
	String result = (A == B && B == C) ? ((cevre > 30)?("Ne Büyüksün"):("Normal")):((cevre<20)?("Ne kücüksün"):("normal"));
		System.out.println(result);
		scan.close();
		
		
	}

}
