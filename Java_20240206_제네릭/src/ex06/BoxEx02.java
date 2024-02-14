package ex06;

class A {
	@Override
	public String toString() {
		return "A class";
	}
}

class B extends A {
	@Override
	public String toString() {
		return "B class";
	}
}

class C extends B {
	@Override
	public String toString() {
		return "C class";
	}
}

class Box<T extends A> { // A클래스 이거나 A를 상속한 클래스만 T 전달 가능!!!! ==> A B C 클래스만 가능
	private T obj;

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

public class BoxEx02 {

	public static void main(String[] args) {

		Box<A> abox = new Box<A>();
		Box<B> bbox = new Box();
		Box<C> cbox = new Box();

//		Box<Integer> ibox = new Box<Integer>(); == > Box 클래스에서 타입에 제한을 두었기 때문에 실행 불가능
	}

}
