package ex01;

public class While01 {

	public static void main(String[] args) {

		int sum=0;
		int i=1; // 초기값
		
		while(i<=5) {  //조건
			sum = sum + i; //문장
			i++; //증가
		}
		
		System.out.println("while 누적합 : " + sum);
		
	}

}
