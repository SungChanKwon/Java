package ex01;
/*
 * 메서드 : max
 * 매개변수 : 없음
 * 반환타입 : void
 * 두 정수 입력받아서 최대값 출력
 */

public class 반환없고_매개변수없음 {

	public static void main(String[] args) {
		
		System.out.println("최대값 출력");
		
		max(); // 호출
		
		System.out.println("프로그램 종료!");
		
	}
		
	static void max() {
		
		int num1 = 10;
		int num2 = 20;
		
		int max = num1 > num2? num1: num2;
		
		System.out.println("최대값 : " + max);
		
	}
		
	}


