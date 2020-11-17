package day25encapsulation;

public class E03 {
	
	private byte yas = 23;
	private float borc = 6500.0f;
	private String isim = "Kemal Dogru";
	private boolean zengin = true;
	
	public byte getYas() {
		return yas;
	}


	public void setYas(byte i) {
		this.yas = i;
	}


	public String getIsim() {
		return isim;
	}


	public void setBorc(float borc) {
		this.borc = borc;
	}


	public static void main(String[] args) {
		

	}

//Java booleanlar icin getter olustururken method ismini "is" ile baslatir.
//Setterlarda set kullanmaya devam eder.
	
	public boolean isZengin() {
		return zengin;
	}


	public void setZengin(boolean zengin) {
		this.zengin = zengin;
	}

}
