package day23daytime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date01 {

	
	public static void main(String[] args) {
		/*1)Anlik tarihi almayi ögrencez
		 *2)Tarihi ilerletmeyi veya geriletmeyi ögrencez
		 *3)Tarihi farkli formatlarda yazmayi ögrencez.   
		 */
		
		//Anlik tarihi nasil alinir?
		LocalDate ld =LocalDate.now();
		System.out.println(ld);//2020-07-21
	
		//Ileri tarihler ekrana nasil yazdiririz?
		System.out.println(ld.plusDays(275));
		System.out.println(ld.plusMonths(3));
		System.out.println(ld.plusYears(3));
		System.out.println("--------");
		//Gecmis tarihler ekrana nasil yazdirilir?
		System.out.println(ld.minusDays(34));
		System.out.println(ld.minusMonths(6));
		System.out.println(ld.minusYears(4));
		
		System.out.println("--------------");
		
		//Tarihi nasil farkli bir formata yazdiririz
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");	
		System.out.println(dtf.format(ld));
		
		//MM==>Kacinci ay			MMM==>Ayin ilk 3 harfi  MMMM==> Ayin isminin tamami
		
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");	
		System.out.println(dtf1.format(ld));
		
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM.dd.yy");
		System.out.println(dtf2.format(ld));
	
	
		//d==> 10 dan kücük günler icin tek rakam basar ama 10 ve yukarisi icin cift rakam basar
	
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMM.d.yy");
		System.out.println(dtf3.format(ld));
	
	
	}
	

}
