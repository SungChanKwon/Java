package ex01;
/*
 * 메서드 : max
 * 매개변수 : 없음
 * 반환타입 : int
 * 두 정수 입력받아서 최대값 출력
 */

public class 반환있고_매개변수없음 {

	public static void main(String[] args) {
		
		System.out.println("최대값 출력");
		
		int max = max();
		
		System.out.println("최대값 : " + max);
	}
		
	static int max() {
		
		int num1 = 20;
		int num2 = 10;
		
		
		if(num1 > num2)
				return num1;
		else
				return num2;
		
	}
		
	}


