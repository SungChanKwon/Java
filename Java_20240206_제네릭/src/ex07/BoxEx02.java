package ex07;

// Box 클래스 제네릭을 통해서 생성되는 대상은 Number 를 상속하는 타입들의 클래스만 생성한다.

class Box<T extends Number> { // ==> Number : 오브젝트의 자손이면서 모든 숫자들의 조상임
	private T obj; // 즉, Number 의 자손들은 모두 허용
					// main 메소드의 실행문(본문)에 속한 <Integer>와 <Double>은 Number의 자손이므로 T에 대입되면서 타입이 변환된다.

	void set(T obj) {
		this.obj = obj;
	}

	T get() {
		return obj;
	}
}

public class BoxEx02 {

	public static void main(String[] args) {

		// ==> Number를 상속받고 있으므로 제네릭에 의해서 Integer 타입을 가진 클래스가 생성됨.
		Box<Integer> iBox = new Box<Integer>();
		Box<Double> dBox = new Box<Double>();

//		Box<String> sBox = new Box(); ==> Number 의 자손이 아니기 때문에 생성불가

	}

}
