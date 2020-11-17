package day25encapsulation;

public class E02 {

	public static void main(String[] args) {
		E01 obj = new E01();
		System.out.println(obj.getSifre());//123456
		System.out.println(obj.getIsim());
		System.out.println(obj.getCh1());
		
		obj.setSifre(98765);
		System.out.println(obj.getSifre());//98765
		
		obj.setCh1('#');
		System.out.println(obj.getCh1());
		
		obj.setIsim("Ahmet Yildiz");
		System.out.println(obj.getIsim());
		
		E03 obj1 = new E03();
		System.out.println(obj1.getIsim());		
		System.out.println(obj1.getYas());
		
		obj1.setBorc(2300.34f);//Borc degistirildi fakat okuyamayiz,cunku getter yoktur.
		
		obj1.setYas((byte)25);
		System.out.println(obj1.getYas());
		
		
		
		
	}
}
