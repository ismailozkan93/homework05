package day30exceptions;

public class E03 {

	public static void main(String[] args) {
		
		String s = "12345";
		String t="abcde";

		int i = Integer.parseInt(s);
		System.out.println(i+2);
		
		//Eger bir String rakamlardan olusturulmussa parseInt() metodunu onu sayiya cevirmek isterseniz
		//NumberFormatException alirsiniz.Cunku Java rakam disindaki characterleri parseInt() methodu ile 
		//sayiya ceviremez.
		
		int j=Integer.parseInt(t);
		
		
	}

}
