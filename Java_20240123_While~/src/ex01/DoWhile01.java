package ex01;

public class DoWhile01 {

	public static void main(String[] args) {

			//조건이 참이든 거짓이든 한번은 실행해야될때 do while 사용, but 쓸일 거의 없음
		int sum=0;
		int i=0;  //초기값
		
		do {
			i++;	//증가값
			sum += i;
		//}while(i<=10);;	
		}while(i<10);;	
			
		System.out.println("sum : " + sum);
		
		
//		int sum=0;
//		int i=1;  //초기값
		
//		do {
//			sum += i;
//			i++;	//증가값
//		}while(i<=10);;	
			
//		System.out.println("sum : " + sum);
		
		
		
		
		
	}

}
