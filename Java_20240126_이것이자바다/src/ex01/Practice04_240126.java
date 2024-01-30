package ex01;

public class Practice04_240126 {

	public static void main(String[] args) {
		powerOn();
		powerOff();
		
		int num = plus(5,2);
		System.out.println(num);
		
		double avg = divide(5,2);
		System.out.println(avg);  // ctrl + shift + [ --한 화면을 두개로 나누어서 보여주는 단축키
		
	}
	
	// 리턴값이 없는 메소드 선언
	static void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// 리턴값이 없는 메소드 선언
	static void powerOff() {
		System.out.println("전원을 끕니다.");
	}
		

	
		
	//호출시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	static int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	//호출시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
	static double divide(int x, int y) {
		double result = (double)x / y;
		return result;
	}
	
	}
	

