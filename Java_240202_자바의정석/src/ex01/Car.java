package ex01;

public class Car {

	private String color;
	private String gearType;
	private int door;
	
	Car() {
	}
	
	
	
	void Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("색:" + color + " 기어타입 : " + gearType +"도어갯수:" + door);
	}
}
