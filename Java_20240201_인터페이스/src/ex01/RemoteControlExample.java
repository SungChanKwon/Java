package ex01;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		//인터페이스 변수선언, TV객체를 생성하고 인터페이스 변수에 대입 (구현 객체 대입)
		RemoteControl rc = new TV();  //상위클래스는 하위클래스를 참조할 수 있다를 적용
		//상위				//하위
		
		rc.turnOn();
		rc.setVolume(10);
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		//디폴트 메소드 호출
		rc.setMute(true);
		rc.setMute(false);
		

	}

}
