package ex01;

import java.util.Scanner;

public class 홀수합짝수합구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1~100 사이에 홀수합과 짝수합 구하기
		
		int even = 0;
		int odd = 0;
		
		for(int i =1; i <= 100; i++) {
			
			if(i % 2 == 0)
				even += i;
			else
				odd += i;
		}
		
		System.out.println("짝수 항 : " + even);
		System.out.println("홀수 항 : " + odd);
		
		
		/*
		 * 1~100사이에
		 * 3의 배수 이면서 5의 배수 합 구하고
		 * 갯수 구하기 
		 * */
	
		int su = 0, i;
		
		for(i = 1; i <= 100; i++) {
		if(i % 3 == 0 && i % 5 == 0) {
		su += i;
		System.out.println("3의 배수이면서 5의 배수인 자연수의 합: " + su); 
		
		}
		}
		
		
		
		
		
	}

}
