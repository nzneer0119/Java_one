package chap07;

public class AnimalExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		Cat cat = new Cat();
		dog.sound();dog.breathe();
		cat.sound();cat.breathe();
		System.out.println("-------------");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal.breathe();
		animal = new Cat();
		animal.sound();
		animal.breathe();
		System.out.println("-------------");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound( Animal animal ) {
		animal.sound();
		animal.breathe();
	}

}
