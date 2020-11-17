package day15constructors;

public class Araba {

	int yil = 2019;
	String marka = "Toyata";
	String model = "Rav4";
	int fiyat = 20000;
	
	Araba(String model, int fiyat){
		this.model = model;
					//"Corolla"
		this.fiyat = fiyat;
					//12000
	}
	
	Araba(String marka, String model, int yil, int fiyat){
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.fiyat = fiyat;
		
	}
	
	Araba(){
		
	}

	
	public static void main(String[] args) {

	Araba a1 = new Araba();
	System.out.println("Fiyat: "+a1.fiyat);//20000
	System.out.println("Marka: "+a1.marka);//Toyata
	System.out.println("Model: "+a1.model);//RAV4
	System.out.println("Yil: "+a1.yil);//2019
	a1.hizlanma(10);
	a1.tüketim();
	
	
	System.out.println("-------------");	
	
	Araba a2 = new Araba("Corolla",12000);
	System.out.println("Fiyat: "+a2.fiyat);//12000
	System.out.println("Marka: "+a2.marka);//Toyata
	System.out.println("Model: "+a2.model);//corolla
	System.out.println("Yil: "+a2.yil);//2019
	a2.hizlanma(7);
	a2.tüketim();
	
	System.out.println("-------------");
	
	//Arabanin fiyat,marka,model ve yilini degistiren bir constructor üretiniz.	
	//Sonradan bir obje üretip,istediginiz bir araba olusturunuz	
	Araba a3 = new Araba("Honda", "Jazz", 2010 ,5000);
	System.out.println("Fiyat: "+a3.fiyat);//5000
	System.out.println("Marka: "+a3.marka);//Honda
	System.out.println("Model: "+a3.model);//Jazz
	System.out.println("Yil: "+a3.yil);//2010
	a2.hizlanma(10);
	a2.tüketim();
	
	}
	
	public static void hizlanma(int i) {
		System.out.println(i+ "sn'de 100 km/sa e ulasir.");
	}
	public static void tüketim() {
		System.out.println("Km de 0.1 dolar yakar");
	}
}
