package ex02;

public class WrapperEx01 {

	public static void main(String[] args) {
		//기본 자료형 8개 빼고는 전부다 객체다.
		
		int i = 10;
		
		Integer iref = new Integer(10);
		
		Integer iref2 = 20;  //new Integer(20)
		
		i = iref2.intValue(); //Integer -> int 기본형 자료로 바꿔줌 ==> int 언박싱
		
		iref = i; //new Integer(i); 오토박싱
		
	}

}
