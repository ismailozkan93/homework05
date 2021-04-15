package Section03;

public class TestTV {

	

	public static void main(String[] args) {
		TV tv1=new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);

		TV tv2=new TV(5);
		tv2.turnOn();
		tv2.channelUp();
		tv2.channelDown();
		tv2.volumeUp();
		
		
		System.out.println("TV1's Channel is "+tv1.channel + " and volume is "+tv1.volumeLevel);
		System.out.println("TV2's Channel is "+tv2.channel + " and voume is "+tv2.volumeLevel);
	}

}
//For certain things we use static, if we ask "how" question, we use Object(Nesne).
//Math Max(a,b) is a method of class and all Math classes are static.
//But getArea() is not static  




