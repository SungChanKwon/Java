package ex02;

public class AnimalSimulation {

	public static void main(String[] args) {
		

//		Animal a1 = new Dog();
//		a1.makeSound();
//		
//		Animal a2 = new Cat();
//		a2.makeSound();
//		
//		Animal a3 = new Bird();
//		a3.makeSound();
	
		//함수 호출
		sound(new Bird());
		sound(new Cat());
		sound(new Dog());
		
	}
		
		//객체를 생성하지않고 정적 메소드인 static을 이용
		static void sound(Animal animal) {
			animal.makeSound();
		}
	

}
