package ex15;

class Box<T> { // T 타입은 제네릭 클래스를 통해 Integer 클래스를 생성
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}

	@Override
	public String toString() { // 이와 같이 toString을 재정의 해주면,
								// obj가 참조하고 있는 Integer 객체의 100값을 문자열 "100"으로 리턴해줌
		return obj.toString(); // 그래서 아래 메인메소드에서 Box의 주소값을 가지고 있는 ibox를 찍어주게되면, toString 이 자동으로 호출되어 "100"이
								// 출력되는것임.
	}
	// toString을 재정의 하지않고 ibox를 찍어주게되면, ibox가 참조하고 있는 Box의 주소값이 출력됨.
}

//ex15.Box@567d299b
class BoxFactory {
	// T는 Number거나 Number의 하위클래스만 가능
	public static <T extends Number> Box<T> makeBox(T o) {
		Box<T> box = new Box(); // 참조변수 box가 참조하는 Box 객체를 생성
		box.set(o); // set메소드를 호출해서 매개변수에 100값을 넣어줌

		System.out.println("Boxed : " + o.intValue()); // intValue : Integer타입을 int타입으로 변환해주는 래퍼클래스
		return box;
	} // 언박싱: 객체 값을 기본형 값으로 변환
} // 오토박싱: 기본형 값을 객체 값으로로 변환

class Unboxer {
	// T 타입이 일치하는지 확인
	public static <T extends Number> T openBox(Box<T> box) { // 메인메소드의 50라인에서 주소값을 전달받음
		System.out.println("unboxed : " + box.get().intValue()); // Box 인스턴스의 get을 호출해서 실행하여 obj가 참조하고 있는
																	// 100값을 출력해줌 ==>언박싱 자동으로해줌
		return box.get();// Integer 100값을 리턴해줌
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {

		Box<Integer> ibox = BoxFactory.makeBox(new Integer(100)); // 30라인 return box;에 의해서 box가 참조하고 있는 Box 객체 주소값을 반환받음
																	// ibox는 대입연산자에 의해 Box 주소값을 참조하게됨

		int num = Unboxer.openBox(ibox); // return box.get()에 의해 받은 Integer 100값을 num에 대입
		System.out.println("date : " + num);// 대입된 100을 출력

		System.out.println(ibox); // 해당 객체의 클래스에서 to string 메소드를 재정의 해줬을때, 그 객체가 가지고 있는 정보나 값을 문자열로 만들어 리턴해줌
									// 그래서 prtinln 메소드로 참조변수 ibox가 가라키고 있는 Box의 주소만을 호출했을때는 , toString이 자동적으로 호출되서
									// 100이 출력됨.

	}

}
