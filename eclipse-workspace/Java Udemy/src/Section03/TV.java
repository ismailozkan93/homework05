package Section03;

public class TV {
	int channel=1;	//Default channel is 1
	int volumeLevel=1; //Default volume is 1
	boolean on=false; //By default is OFF
	
public TV() {
	channel=1;
	volumeLevel=1;
	on=false;
}
public TV(int c) {
	channel=c;
	volumeLevel=1;
	on=false;
}
	
	
void turnOn() {
	on=true;
}
void turnOf() {
	on=false; 
	
}

void setChannel(int newChannel) {
	if(on && newChannel >=1 && newChannel<=120)
	channel=newChannel;
}
void setVolume(int newVolumeLevel) {
	if(on && newVolumeLevel >=1 && newVolumeLevel<=7)
	volumeLevel=newVolumeLevel;	
}
void channelUp() {
	if(on && channel <120)
	channel++;
}

void channelDown() {
	if(on && channel>1)
	channel--;
}
void volumeUp() {
	volumeLevel++;
}

void volumeDown() {
	volumeLevel--;
}



}
