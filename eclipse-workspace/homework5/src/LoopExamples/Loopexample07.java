package LoopExamples;

public class Loopexample07 {
	public static void main(String[] args) {
		// Triangle loop
		int count=1;
		for(int i=1;i<5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" "+count);
				count++;
			}System.out.println();
		}

	}

}
