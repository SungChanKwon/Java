package ex03;

import java.util.Scanner;

public class Ifexam01_02 {

	public static void main(String[] args) {


		
		
		Scanner sc = new Scanner(System.in);
		
		int bus = 1500;
		
		
		System.out.println("나이 입력 : ");
		int age1 = sc.nextInt();
		int age2 = sc.nextInt();
		int age3 = sc.nextInt();
		
		if(age1 <= 3) {
			System.out.println("할인율" + (bus / 100));
		}	
		else if(age2 <= 13) {
			System.out.println("할인율" + (bus / 0.5));
		}
		else if (age3 <= 19) {
			System.out.println("할인율" + (bus / 0.25));
		}
		else {
			System.out.println("할인율" + bus);
		}
		
		System.out.println("할인율 입력 : " );
}
}