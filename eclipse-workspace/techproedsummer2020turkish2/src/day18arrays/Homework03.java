package day18arrays;

import java.util.Arrays;

public class Homework03 {

	public static void main(String[] args) {
		int arr1[]= {1, 2, 3};
		int arr2[]= {1, 2, 3};
	if(arr1==arr2) {
		System.out.println("Same");
	}else {
		System.out.println("Not Same");
	}
	if(Arrays.equals(arr1, arr2)) {
		System.out.println("Same");
	}else {
		System.out.println("Not Same");
	}
	
	}

}
