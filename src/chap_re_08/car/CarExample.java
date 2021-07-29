package chap_re_08.car;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		myCar.run();
		
		System.out.println();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		// 앞쪽 2개의 Tire가 변경됨.		
		
		myCar.run();

	}
}
