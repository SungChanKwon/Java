package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double div = 0;
		System.out.println("정수 2개 입력 >>");
		
		try { //문제의 소지가 있는 것들은 다 넣어주면 됨. 
			int num1 = sc.nextInt(); //정수입력을 요구 ==> 문자열일때 어떻게?
			int num2 = sc.nextInt(); 
			
			div = num1 / num2;		//0 아닌 값 요구 ==> 0입력하면 어떻게?
			
			int [] arr = new int[3];
			for(int i=0; i<10; i++)
				arr[i] = i;
			
		}catch(InputMismatchException e) {		//try, catch 구문은 많으면 많을수록 좋다.
			e.printStackTrace();
			
		}catch(ArithmeticException e) {			//0으로 나누기 했을 때 처리
			e.printStackTrace();
			
		}catch(Exception e) {					//아무거나
			e.printStackTrace();
			
		}finally{
			//여기는 예외가 발생하든 발생하지 않든 무조건 처리하는 구문
		}
		
		System.out.println("나누기 : " + div);
		
		System.err.println("프로그램 종료!!!");
		
	}

}
