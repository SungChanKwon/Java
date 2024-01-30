package ex08;

public class PersonController {

	public static void main(String[] args) {
		
		
		//객체 생성하지않고 접근 가능
		
		Person.staticShow();
		
		//인스턴스 메소드는 객체를 생성한다음 참조변수로 접근 가능
		Person p1 = new Person();
		p1.showInfo();
	}

}
