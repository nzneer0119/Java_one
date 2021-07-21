
package chap08;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*RemoteControl rc = new RemoteControl() {

			@Override                     // RemoteControl에서 상속 받았으면 (개선해서)사용 해라..
			public void turnOn() {
			}
			@Override
			public void turnOff() {
			}
			@Override
			public void setVolume(int volume) {
			}
		*/
		RemoteControl rc = null;
			
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();

	};

	}

