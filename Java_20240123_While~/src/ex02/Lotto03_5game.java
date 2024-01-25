package ex02;

public class Lotto03_5game {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		System.out.println(a + " : " + b); // 두 개 값을 바꿔줄 때는 변수가 하나 더 필요함
		
		int c = a;						// c는 두개의 값을 바꿔주는 새로운 그릇이다.
		a = b;
		b = c;
		
		System.out.println(a + " : " + b); // 두 개 값을 바꿔줄 때는 변수가 하나 더 필요함
		
		
		// 위 공식 응용 예제
		int[] lotto = new int[45];    // i 에는 1~45까지의 숫자가 들어감.
		
		for(int i=0; i<lotto.length; i++)
			lotto[i] = i+1;
		
		for(int i=0; i<1000; i++) {
			int num = (int)(Math.random()*44)+1; //1~44
			int tmp = lotto[0];				//  lotto 0번지를 tmp에 넣는다 tmp는 a,b값을 바꿔주는 새로운 그릇이다.
			lotto[0] = lotto[num];			//	랜덤으로 돌린 번호(=num)를 lotto 0번지에 넣는다
			lotto[num] = tmp;				//	tmp를 lotto[num]에 넣는다.
											//  초기에 0번지에 있는 값과 lotto[num] 값이 바뀌는 방식으로 계속 바뀌면서 무작위로 바뀐다.  
		}
		
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + " "); //한 게임
	}

}
