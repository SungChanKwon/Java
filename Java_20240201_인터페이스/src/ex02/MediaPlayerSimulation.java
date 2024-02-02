package ex02;

public class MediaPlayerSimulation {

	public static void main(String[] args) {

//		MediaPlayer mp = new MP3Player();
//		MediaPlayer mp1 = new WAVPlayer();
//		MediaPlayer mp2 = new FLACPlayer();
//		
//		
//		mp.play();
//		mp1.play();
//		mp2.play();
		
		MediaPlayer mp = new MP3Player(); // MediaPlayer(부모클래스)가 MP3Player(자식클래스)를 참조하고, MP3Player가 MediaPlayer에 접근해서 play 멤버를 호출 
		mp.play();
		
		mp = new WAVPlayer(); //위와 동일
		mp.play();
		
		mp = new FLACPlayer(); //위와 동일
		mp.play();
	}

}
