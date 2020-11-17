package day07ifelseifstatementdt;

import java.util.Scanner;

public class IfElseIf01 {

	public static void main(String[] args) {
		/*Kulllanicidan sayi alin 
		 * sifirdan büyükse ekrana pozitif yazdirin.
		 * sayi sifir ise notr 
		 * sayi sifirdan kücükse negatif yazdirin
		 */
	Scanner scan = new Scanner(System.in);
	System.out.println("Bir Sayi Giriniz");
	double sayi = scan.nextDouble();
	
	if(sayi>0) {System.out.println("pozitif");		
	}
	
	else if(sayi==0) {
		System.out.println("Nötr");
	}
	else{
		System.out.println("Negatif");	
	}

	}
	
	}


