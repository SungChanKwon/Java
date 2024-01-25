package ex01;

public class Method01 {

	public static void main(String[] args) {
		System.out.println("Hello~~~~~~");  // 함수는 무조건 main 부터 우선적으로 실행해줌
		
		int num = max(100 ,20); 
		
		System.out.println("최대값 : " + num);
	}
		
	
		//매개변수 정수형 2개를 입력받아서, 정수값을 반환
		static int max(int n1, int n2) {
			System.out.println("난 최대!!");
			return n1>n2 ? n1 : n2; //최대 값 반환
		}
		
		
		
		static int min(int n1, int n2) {
			System.out.println("난 최소!!");
			return n1<2 ? n1 : n2; //최소 값 반환
		}
	

}
