package chap09.p411;

public class AnonymousExample {

	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		//
		anony.field.turnOn();
		//
		anony.method1();
		//
		anony.method2(
				new RemoteControl() {
					@Override
					public void turnOn() {
						System.out.println("Smart TV를 켭니다.");
					}
					@Override
					public void turnOff() {
						System.out.println("Smart TV를 끕니다.");
					}
				}
			);
	}
}
