package ex04;

public class AudioBook extends Book{

	private double length;
	private String narrator;
	
	public AudioBook() {
		
	}
	
	public AudioBook(String title, String author, 
			int publicationYear, double length, String narrator) {
		super(title, author, publicationYear);   //부모 클래스에 전달
		this.length = length;					 //내가 갖는 값
		this.narrator = narrator;				 //내가 값는 값
		System.out.println("length: " + length + " hours" + " Narrator: " + narrator);
	}

//	@Override
//	public String toString() {
//		return "AudioBook [length=" + length + ", narrator=" + narrator + "]";
//	}
	
	@Override //오버라이드를 적용시, 부모클래스에 메서드가 존재해야함 -> 안정성을 위해 사용하는것을 권장
	void displayInfo() {
		super.displayInfo();
		System.out.println("length: [" + length + "]hours" + ", Narrator: [" + narrator + "]");
	}
	
}
