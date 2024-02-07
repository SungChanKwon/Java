package ex01;

class A {	
	void funA() {
		System.out.println("funA");
	}
}
	
class B extends A{
	void funB() {
		System.out.println("funB");
	}
}

class C extends B{
	void funC() {
		System.out.println("funC");
	}
}

public class Exam01 {
	
	//					A객체, B객체, C객체
	static void testFunc(A a) {
		//funA, funB, funC를 출력하려면 어떻게 해야될까?
		
		
		if(a instanceof C) {
			C c = (C)a;
			c.funC();
//			((C)a).funC();  ==> '.' 연산자가 우선이기 때문에 중괄호로 묶어준것임
		}else if (a instanceof B) {
			B b = (B)a;
			b.funB();
		}else
			a.funA();
	}
	
//	static void testFunc1(A a) {  //이 메소드는 
//		if(a instanceof C) {
//			C c1 = (C)a;
//			c1.funA();
//			c1.funB();
//			c1.funC();
//		}
//	}
	
	public static void main(String[] args) {
		
		//상위 클래스는 하위 클래스 참조가능
		//하위클래스는 상위클래스를 상속받기 때문에 상위클래스에 있는 기능(멤버)을 포함하고 있기 때문에 상위클래스가 하위클래스를 참조할 수 있는것이다.
		A a1 = new A();
		A a2 = new B();
		A a3 = new C();
		
		//B b1 = new A(); 하위클래스는 상위클래스 참조 불가 ==> 왜?
		//하위클래스가 가지고 있는 멤버를 상위클래스는 가지고 있지 않다. 즉 상위클래스에서 존재하지않는 멤버,기능을 사용할 수 없기때문에 참조가 성립되지 않는다.
		B b2 = new B();
		B b3 = new C();
		
		//C c1 = new A(); 불가..
		//C c2 = new B(); 불가...
		C c3 = new C();
		
		
		//강제 타입 변환
		A aa1 = new B();
		//B bb1 = aa1; 불가 ==> 왜?
		B bb2 = (B)aa1;  //가능 ====> 왜? 형변환 연산자를 통해 같은 객체를 가리키게 됨. 같은 객체를 가리키고 있지만 aa1은 A클래스에 선언되어있는 기능만 쓸 수 있음.
		
		A aa2 = new C();
		
		C cc1 = (C)aa2;  //가능 ====> 왜?
		
		System.out.println("-------------------------------1차 여기까지..");
		
		testFunc(new A());
		testFunc(new B());
//		testFunc(new C());
		}
	}


