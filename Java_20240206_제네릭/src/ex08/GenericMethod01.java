package ex08;

class Box<T> { // ==> makeBox 메소드에 의해 제네릭을 통해서 String 타입을 갖는 클래스를 생성해줌. <T> 자리에 <String>이 오게됨.
	private T obj; // ==> 7. set 메소드에 의해서 Box의 인스턴스 변수 obj는 "korea" 주소값을 참조하게됨.

	void set(T obj) { // 6. "korea" 주소값
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}
}

class BoxFactory {
	// 제네릭 메소드 ==> <T>: 제네릭메소드 표시
	// Box<T>: 반환타입, makeBox: 함수명, (T o): 매개변수
	public static <T> Box<T> makeBox(T o) { // ==> 2. 메인메소드에 의해 (T o) 매개변수에는 "korea" 주소 값이 입력됨
		Box<T> box = new Box<T>(); // ==> 3. 참조변수 box가 참조하는 String 타입의 Box 인스턴스 생성
		box.set(o); // ==> 4. Box 클래스의 set 메소드를 호출해서 매개변수에 "korea"주소값
		return box; // ==> 5. box = Box의 주소값 반환
	}
}

/*
 * Box <String> sBox = BoxFactory.makeBox("korea"); ==> 이 문장이 전달되면 대략 이렇게 생성된다.
 * public static <T> Box<String> makeBox(String o){ Box<String> box = new
 * Box<String>(); box.set(o); return box; }
 */
public class GenericMethod01 {

	public static void main(String[] args) {

		Box<String> sBox = BoxFactory.makeBox("korea"); // ==> 1. 함수호출
														// ==> 제네릭

		System.out.println(sBox.get()); // 8. get 메소드를 호출해서 obj 가 참조하는 주소값의 "korea"를 출력

		Box<Integer> iBox = BoxFactory.makeBox(100);
		System.out.println(iBox.get());
	}

}
