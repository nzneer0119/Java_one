package chap08_4;

import chap08.Audio;
import chap08.RemoteControl;
import chap08.Television;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RemoteControl rc = null;
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();

	};

}
