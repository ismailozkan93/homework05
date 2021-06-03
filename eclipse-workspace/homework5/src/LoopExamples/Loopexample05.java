package LoopExamples;

public class Loopexample05 {

	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==2 || j==2) {
				System.out.print("*");
			}else {
				System.out.print("0");
			}
				}System.out.println();
		}
		System.out.println();
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(i==j){
				System.out.print("O");
				}else {
					System.out.print("+");
				}
			}System.out.println();
		}
		System.out.println();
		System.out.println();
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(i==j || i+j==4) {
				System.out.print("+");
			}else {
				System.out.print("*");
			}
				}System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||j==1||i==5||j==5) {
				System.out.print("*");}
				else {
				System.out.print("+");
				}
			}System.out.println();
		}
				
	}
}
