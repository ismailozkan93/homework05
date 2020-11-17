package day14methodcreation;

import java.util.Scanner;

public class Homework03 {

	public static void main(String[] args) {
		// Kullanıcıya sayı girmesini söyleyin. 
		//Kullanıcının girdiği sayının rakamları toplamını ekrana  yazdıran bir program yazın.
		
		rakamtoplama(5);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi giriniz");
		int sayi = scan.nextInt();
		//12865
		
		}
		public static void rakamtoplama(int sayi) {
			int rakam=0;
			int sum = 0;
			while(sayi>0) {
			rakam = sayi%10;
			sum = rakam+sum;
			sayi/=10;
	}
	System.out.println(sum);
}
}	
	




/*	public static void rakamtop(int sayi) {
int birler = sayi%10;
int onlar = (sayi/10)%10;
int yüzler = (sayi/100)%10;
int binler = (sayi/1000)%10;
*/