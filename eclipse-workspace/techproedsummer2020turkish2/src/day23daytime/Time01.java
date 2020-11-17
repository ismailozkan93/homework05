package day23daytime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Time01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		
		//Zamanda ileri nasil gidilir?
		System.out.println(lt.plusMinutes(7));
		System.out.println(lt);
		
		System.out.println(lt.plusHours(6));
		
		//Zamanda nasil geri gidilir
		System.out.println(lt.minusSeconds(23));	
		
		//Time formati nasil degistirilir?
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm");
		System.out.println(dtf1.format(lt));
		
		//hh 12 saatlik dilimini HH 24 saatlik dilimi gösterir.
		
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm");
		System.out.println(dtf2.format(lt));
		
		//Farkli ülkelerdeki yerel saati nasil yaziriz
		System.out.println(LocalTime.now(ZoneId.of("Turkey")));
		System.out.println(LocalTime.now(ZoneId.of("Japan")));
		System.out.println(LocalTime.now(ZoneId.of("Europe/Moscow")));
		
		
		
	}

}
