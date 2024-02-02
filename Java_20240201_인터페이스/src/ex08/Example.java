package ex08;

public class Example {
	
	public static void action(A a) {
		a.method1();
		if(a instanceof C) {  //a 참조변수가 참조하는 대상이 C클래스 이거나, C클래스 상속한 클래스이면 true 반환
			C c = new C();	  									//C클래스를 상속한 클래스면 C클래스의 멤버를 가지고 있기 때문
			c.method2();
		}
	}

	public static void main(String[] args) {
		action(new B());
		action(new C());
	}
}
