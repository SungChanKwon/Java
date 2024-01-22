package ex01;

public class 삼항연산자01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int jumsu = 59;
		
		if(jumsu >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");
		
		//삼항 연산자 이용해서 변형 ->> 삼항연산자 공식->> 조건식 ? 조건식이 참이면 실행되는 코드 : 조건식이 거짓이면 실행되는 코드
		
		String msg = ( jumsu >= 60) ? "합격" : "불합격";
		
		//string msg = "합격" 하고 같은 문장임
		
		System.out.println(msg);
		
	}

}
