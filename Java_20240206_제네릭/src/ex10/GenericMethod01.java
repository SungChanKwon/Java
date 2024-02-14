package ex10;

class Box<T> { // T 타입은 제네릭 클래스를 통해 Integer 클래스를 생성
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}
}

class BoxFactory {
	// T는 Number거나 Number의 하위클래스만 가능
	public static <T extends Number> Box<T> makeBox(T o) {
		Box<T> box = new Box();
		box.set(o);

		System.out.println("Boxed : " + o.intValue()); // intValue : Integer타입을 int타입으로 변환해주는 래퍼클래스
		return box;
	} // 언박싱: 객체 값을 기본형 값으로 변환
} // 오토박싱: 기본형 값을 객체 값으로로 변환

class Unboxer {
	// T 타입이 일치하는지 확인
	public static <T extends Number> T openBox(Box<T> box) { // 메인메소드의 41번라인에서 주소값을 전달받음
		System.out.println("unboxed : " + box.get().intValue()); // Box 인스턴스의 get을 호출해서 실행하여 this.obj를 반환시켜 obj가 참조하고 있는
																	// 100값을 출력해줌 ==>언박싱 자동으로해줌
		return box.get();// 래퍼클래스 Integer 100값을 메인메소드 41라인에 리텀시킴
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {

		Box<Integer> ibox = BoxFactory.makeBox(new Integer(100)); // 23라인 return Box;에 의해서 Box 인스턴스의 주소값을 받음 ==>참조변수
																	// ibox는 대입연산자에 의해 Box 주소값을 참조하게됨

		int num = Unboxer.openBox(ibox);// ibox가 39라인에 Box<Integer) 인스턴스의 주소값을 받았기 때문에 openBox 메소드를 호출해서 매개변수에 주소값을 전달해줌
		// 31라인의 return box.get();에 의해 Integer 100값을 리턴받음 ==> 언박싱 자동으로해줌
		System.out.println("date : " + num);
	}

}
