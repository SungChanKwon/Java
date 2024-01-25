package ex01;

import java.util.Scanner;

public class Exam07 {

	public static void main(String[] args) {
		
		//1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = 0;
		int input = 0; // 사용자 입력을 저장할 공간
		int count = 0; // 시도횟수를 세기위한 변수
			// 화면으로부터 사용자입력을 받기 위해서 Scanner 클래스 사용 
		answer = (int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 값을 입력하세요 : ");
			input = sc.nextInt();
			count++;
			
			
			if(input > answer)
				System.out.println("더 작은 수 입력!");
			else if(input < answer)
				System.out.println("더 큰 수 입력!");
			else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 : " + count + "번 입니다.");
			}
				
		}while(true); //무한 반복문
		
		
		
	}

}
