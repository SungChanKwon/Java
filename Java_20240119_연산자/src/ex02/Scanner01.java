package ex02;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); //heap 공간을 참조하기 위해서 input 스택에서도 scanner 입력해줘야함.
		
		System.out.println("당신의 나이는 : ");
		int age = input.nextInt();
		
		System.out.println("당신의 이름을 입력하세요 : ");
		input.nextLine(); 
		String name = input.nextLine(); 
		
		
		System.out.println("이름은 " + name + " 나이는 " + age + "이요");
		
		
	}

}
