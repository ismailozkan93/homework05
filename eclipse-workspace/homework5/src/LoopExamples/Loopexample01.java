package LoopExamples;

public class Loopexample01 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i; j++) {
				System.out.print("*");
			}System.out.println();
		}System.out.println();
		
		for(int a=1;a<=5;a++){
			for(int b=5;b>=a;b--) {
				System.out.print("*");
			}System.out.println();
		}

	}
}
