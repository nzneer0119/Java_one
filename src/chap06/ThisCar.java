package chap06;

public class ThisCar {
	//필드 - 맴버변수
	String model;
	int speed;
	
	//생성자
	ThisCar(String model) {
		this.model = model;
	}
	
	//매소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=100; i<=250; i+=20) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달립니다. (시속 : " + this.speed + "km/h )");
		}
	}
}
