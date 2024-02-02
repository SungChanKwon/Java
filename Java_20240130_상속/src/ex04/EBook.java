package ex04;

public class EBook extends Book{

	private double fileSize;
	private String format;
	
	public EBook () {
		
	}
	
	//두 값은 EBook 이 갖고 나머지 3개는 Book 에다 전송
	public EBook(String title, String author, 
			int publicationYear, double fileSize, String format) {
		super(title, author, publicationYear);
		this.fileSize = fileSize;
		this.format = format;
	}

//	@Override
//	public String toString() {
//		System.out.println(super.toString());
//		return "EBook [fileSize=" + fileSize + ", format=" + format + "]";
//	}
	
	@Override
	void displayInfo() {
		super.displayInfo();
		System.out.println("fileSize: [" + fileSize + "MB]" + " format: [" + format + "]");
	}

}
