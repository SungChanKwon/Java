package ex03;

public class Textbook extends Book{

	Textbook(String title, String author, int publishYear){
		super(title, author, publishYear);
	}
	@Override
	String getDetails() {
		return super.getDetails() + " : 학문 분야";
	}
	
	

}
