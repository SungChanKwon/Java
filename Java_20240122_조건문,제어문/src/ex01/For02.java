package ex01;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int sum = 0;
		int count = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%3 == 0 && i%5 == 0) {
				sum+= i;
				count++;
			}
		}
		
		System.out.println("3과 5의 배수 합은 : " + sum);
		System.out.println("3과 5의 배수 개수는 : " + count);
		
		
	}

}
