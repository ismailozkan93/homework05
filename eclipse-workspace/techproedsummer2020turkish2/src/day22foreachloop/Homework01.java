
package day22foreachloop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		System.out.println(list);
		
		//1.Yöntem
		String arr[]=list.toArray(new String[0]);
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
	
		//2.Yöntem
		Object arr1[]=list.toArray();
		System.out.println(arr1.length);
		System.out.println(Arrays.toString(arr1));
		
		
		list.set(0, "Jonathan");
		System.out.println(list);
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}

}
