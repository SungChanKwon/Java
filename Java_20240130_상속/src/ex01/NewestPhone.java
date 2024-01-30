package ex01;

public class NewestPhone extends Phone{

	//상위 클래스 먼저 호출 후 하위 클래스 동작
	private boolean wifi;
	
	public NewestPhone() {
		System.out.println("NewestPhone");
	}
	
	public void internet() {
		System.out.println("인터넷 연결!!");
	}
	
	public void youtube() {
		System.out.println("유튜브 연결!!");
	}
}
