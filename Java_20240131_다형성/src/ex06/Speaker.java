package ex06;

public abstract class Speaker {  //추상 클래스
								 //추상 클래스는 객체 생성 불가 = 비어있는 이력서와 같음
	   
	public abstract void powerOn(); //추상 메소드(미완성 메소드) 
									//추상 메소드는 바디(몸체)가 없음. 반드시 재정의를 요구함
	 
	   public abstract void powerOff(); 
	   
	   public abstract void soundUp(); 
	   
	   public abstract void soundDown(); 
	   
//	   public void powerOn() {
//	   }
//	   
//	   public void powerOff() {
//	   }
//	   
//	   public void soundUp() {
//	   }
//	   
//	   public void powerDown() {
//	   }
	}

