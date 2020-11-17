package day31abstraction;

public class AileOdasi extends Otel {
	
	
	public  void yatak() {
		System.out.println("Ek yatak al");
	}

	@Override
	public void kahvalti() {
		System.out.println("Ailece kahvalti yapin");
	}
}
