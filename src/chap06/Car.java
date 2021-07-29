package chap06;

public class Car {
	
	String name;  //맴버변수
	int value; //맴버변수
	
	Car(){
		System.out.println("나 카 생성자야..");
	}
	
	Car(String color, int cc) {  //생성자
		name = color;
		value = cc;
	}
}
