package ex01;

import java.util.Scanner;

public class Array_String01_01 {
	public static void main(String[] args) {
	
	String[] myArr = new String[3];
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("3개 문자열을 입력하세요.");
	
	for(int i=0; i<3; i++) {
		myArr[i] = sc.nextLine();
	}
	
	for(int i=0; i<3; i++) {
		System.out.print(myArr[i] + " ");
	}
	

	}
	
}