package ex01;

public interface RemoteControl {

	
	//인터페이스는 객체를 생성할 수 없기때문에 정적 메소드를 사용해줘야함
	//즉 public static이 항상 생략되어있음
	//상수필드 : 항상 public static final이 생략되어있음 ==> (public static final) int MAX_VOLUME = 100
	
	
	//interface는 추상 메소드만 사용할 수 있다
	//추상 메소드를 사용한다는건 자식 클래스에서 반드시 추상 메소드에 대한 재정의를 해줘야 한다는 것이다.
	
	//일반 메소드는 사용하지못하고 대신 default 메소드를 이용할 수 있다.
	//default 키워드는 반환타입 앞에 붙여 선언해준다.
	//default 메소드는 자식클래스에서 사용해도되고 안해도된다.
	
	//항상 생각해야되는건 상위 클래스가 하위 클래스를 참조할 수 있다는 것
	//그래서 제어하는 클래스에서 RemotControl 참조변수 = new 자식클래스(); 로 구현할 수 있다는 것이다.
	
	
	//상수 필드
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	
	//추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	
	//디폴트 인스턴스 메소드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리");
			//추상 메소드 호출하면서 상수 필드 사용
			setVolume(MIN_VOLUME);
		}else
			System.out.println("무음 헤제");
	}
	
	
}
