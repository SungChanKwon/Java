package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception05 {

	public static void main(String[] args) throws InputMismatchException{ //JVM으로 던짐
		int sum = 0;
				
			sum = func1();
		//func2()에서 예외를 던지기 때문에 2가지 방법으로 예외처리가능
		//내부처리, 외부 던지기
		
		System.out.println("두 수 합은 : " + sum);
	}
	
	static int func1() {
		return func2();
	}
		
	static int func2() throws InputMismatchException{
			
		Scanner sc = new Scanner(System.in);
		System.out.println("두 정수 입력 <<");
		int num1, num2;
		num1 = num2 = 0;
		
		// 예외가 발생하면 어떻게 처리??? ==> 1>외부로 던지기
		
		num1 = sc.nextInt();	//func1로 던짐
		num2 = sc.nextInt();
		System.out.println("func2 end................");
		return num1 + num2;
	}
	

}
