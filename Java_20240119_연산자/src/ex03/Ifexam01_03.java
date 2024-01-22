package ex03;

import java.util.Scanner;

public class Ifexam01_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3, min;
		
		System.out.println("정수 입력 1 >> ");
		num1 = sc.nextInt();
		System.out.println("정수 입력 2 >> ");
		num2 = sc.nextInt();
		System.out.println("정수 입력 3 >> ");
		num3 = sc.nextInt();
		
		min = num1;
		
		if (min > num2) {
			if (num2 > num3) {
				min = num3;
			}else {
				min = num2;
			}
		} else {
			if (min > num3) {
				min = num3;
			}
		}
		
		System.out.println("최소값 : " + min);
	}

}
