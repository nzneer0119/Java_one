package chap_re_08;

public class Audio implements RemoteControl{
	//필드
	private int volume;

	//turnOn() 추상메소드의 실체메소드
	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	//turnOff() 추상메소드의 실체메소드
	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	//setVolume() 추상메소드의 실체메소드
	@Override
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VALUE) {
			this.volume = RemoteControl.MAX_VALUE;
		} else if (volume<RemoteControl.MIN_VALUE) {
			this.volume = RemoteControl.MIN_VALUE;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}
}
