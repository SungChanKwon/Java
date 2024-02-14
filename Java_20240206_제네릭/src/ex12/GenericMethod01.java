package ex12;

class Box<T> {
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return this.obj;
	}

	@Override
	public String toString() {
		return obj.toString();
	}
}

class Unboxer {

	// 제네릭 메소드
	public static <T> void openBox(Box<T> box) {
		System.out.println(box);
	}

	// 와일드 메소드
	public static void peekBox(Box<?> box) { // ? 와일드카드
		System.out.println(box);
	}
}

public class GenericMethod01 {

	public static void main(String[] args) {

		Box<String> sbox = new Box();
		sbox.set("korea");

		Unboxer.<String>peekBox(sbox);
//		Unboxer.peekBox(sbox);

		Unboxer.<String>openBox(sbox);
//		Unboxer.openBox(sbox);
	}
}
