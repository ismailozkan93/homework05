package day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class SINAV01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*List<Integer> list = new ArrayList<>();

		//list.add(123);

	*	System.out.println(list.contains("123"));
*/
		//Ekran ciktisi true dur.
	
		ArrayList<String> list = new ArrayList<String>();

		list.add("A");

		list.add("B");

		list.add("C");

		list.add("D");

		for (int i = 0; i < list.size(); i++) { 		  

            System.out.print(list.get(i) + " "); 
	}

}
}