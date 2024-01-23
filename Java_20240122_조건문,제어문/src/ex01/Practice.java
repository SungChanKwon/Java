package ex01;
import java.util.Scanner;
public class Practice {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			int sum = 0;
			System.out.println("5개의 숫자를 입력하세요.");
			Scanner s = new Scanner(System.in);
			for (int n = 1; n <= 5; n++) {
				int num = s.nextInt();
				sum += num;         // sum = sum + num과 같은 코드
			}
			
			System.out.println("합계 : " + sum);

		
	}

}
