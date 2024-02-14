package ex11;

class Box<T> { // T 타입은 제네릭 클래스를 통해 Integer 클래스를 생성
	protected T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}
}

class SteelBox<T> extends Box<T> {
	public SteelBox(T o) {
		obj = o;
	}

}

class Unboxer {

}

public class GenericMethod01 {

	public static void main(String[] args) {

		Box<Integer> ibox = new SteelBox<Integer>(1234);
		Box<String> sbox = new SteelBox<String>("korea");
		// 제네릭 상속에서 Box -> SteelBox는 상속관계를 유지하지만
		// Box와 SteelBox는 타겟<>이 반드시 같은 타입이어야한다
		// 즉, 타입은 상위클래스와 하위클래스 둘다 일치해야한다.

		System.out.println(ibox.get());
		System.out.println(sbox.get());

	}

}
