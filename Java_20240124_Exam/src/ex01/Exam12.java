package ex01;

public class Exam12 {

	public static void main(String[] args) {
		//다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 개수만큼 ‘*’
	    //을 찍어서 그래프를 그리는 프로그램이다. (1)~(2)에 알맞은 코드를 넣어서 완성하시오.
		
		// 그림 생각하면서 원리 이해하자!
		
		int [] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int [] counter = new int [4]; 
		
		for(int i=0; i < answer.length; i++) {
			counter[answer[i]-1]++;
		}
		
		for(int i=0; i < counter.length; i++) {
			System.out.print(counter[i]);
			
		for(int j=0; j < counter[i]; j++) 
			System.out.print("*");
			
		
		System.out.println();
		}
	}
	//배열을 이용해서 데이터의 개수를 세는 문제이다.
	// 1~4범위의 데이터를 집계할 것 이기 때문에 크기가 4인 배열(counter)을 생성하였다.
	// 크기가 4이지만 배열의 index는 0~3이기 때문에 answer[i]에서 1을 빼주어야 한다.
	
}
