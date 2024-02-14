package ex01;

/*
 * 이 코드 문제점(?)
 * 1. AppleBox , OrangeBox 거의 비슷
 * 2. 한 박스에 사과, 오렌지 담고 싶다. ==> 코드 확장 하지 않겠다
 */
class Apple {
	public String toString() {
		return "I am an apple";
	}
}

class Orange {
	public String toString() {
		return "I am an orange";
	}
}

class AppleBox { // 사과담는 상자
	private Apple ap;

	void setAp(Apple ap) {
		this.ap = ap;
	}

	Apple getAp() {
		return ap;
	}
}

class OrangeBox { // 오렌지담는 상자
	private Orange op;

	void setAp(Orange op) {
		this.op = op;
	}

	Orange getAp() {
		return op;
	}
}

public class FruitBoxEx01 {

	public static void main(String[] args) {
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();

		aBox.setAp(new Apple());
		oBox.setAp(new Orange());

		System.out.println(aBox.getAp());
		System.out.println(oBox.getAp());
	}
}
