package ex08;

public class Person {
	
	//정적변수, 클래스변수
	private static int age;
	private static String name;
	
	//멤버변수, 인스턴스 변수
	private String address;
	
	
	//메소드, 인스턴스메소드
	void showInfo() {
		System.out.println("인스턴스 메소드");
	}
	
	//정적메소드, 클래스메소드
	//static은 정적베소드, 정적 변수만 사용가능 즉, 무조건 static이 붙어 있어야함
	static void staticShow() {
		System.out.println("static 메소드");
		System.out.println(age);
		System.out.println(name);
//		System.out.println(address); -> static 정적메소드로 사용불가. 인스턴스 변수이기 때문.
	}
	
}
