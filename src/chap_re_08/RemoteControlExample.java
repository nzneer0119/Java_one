package chap_re_08;

public class RemoteControlExample {

	public static void main(String[] args) {
	
		RemoteControl rc;    //디폴트 메소드 사용
		
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(true);
		rc.setVolume(6);
		
		System.out.println();
		
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setMute(false);
		
		
		RemoteControl.changeBattery();  // 정적 메소드 사용
		
	}
}
