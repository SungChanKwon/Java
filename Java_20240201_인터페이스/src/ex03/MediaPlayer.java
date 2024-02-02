package ex03;

public interface MediaPlayer {
	
	
	
	public void play();
	
	public void pause();
	
	
	public void stop();

	default void loadFile(String file) {
		System.out.println(file + "로딩중....");
	}
		
}
