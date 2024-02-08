package ex03;

/*
 * 이 코드 문제점(?)
 * 1. 이 박스에는 사과, 오린제만 담고싶은데.. 다른것이 담겨도 제거 불가
 * 2. get할 때 형변환 해야한다. (다운케스팅 해야한다)
 */
class Apple	{
	public String toString() {
		return "I am an apple";
	}
}

class Orange {
	public String toString() {
		return "I am an orange";
	}
}

class Box<T> {				//사과, 오렌지 담는 상자
	private T obj;
	
	void setObj(T obj) {  //타입이 같은 애들만 넣어줄 수 있음. 또한 그 아이를 상속하는 애들.
		this.obj = obj;   //
	}
	
	T getObj() {
		return obj;
	}
}

public class FruitBoxEx01 {

	public static void main(String[] args) {
		
		Box<Apple> abox = new Box();
		Box<Orange> bbox = new Box();
		Box<Integer> ibox = new Box<Integer>(); //우항에 제네릭 생략가능
		
		abox.setObj(new Apple());	//사과 담음
		bbox.setObj(new Orange());	//오렌지 담음
		
		Apple ap = abox.getObj();
		Orange op = bbox.getObj();
		
		System.out.println(ap);
		System.out.println(op);
		
		ibox.setObj(10);
		int num = ibox.getObj(); 
	}
}


