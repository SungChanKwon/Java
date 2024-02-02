package ex04;

public class Book {

	private String title;
	private String author;
	private int publicationYear;
	
	public Book() {
		
	}
	
	public Book(String title, String author, int publicationYear) {
		this.title = title;
		this.author = author;
		this.publicationYear = publicationYear;
	}
	
	
	
//	@Override
//	public String toString() {
//		return "Book [title=" + title + ", author=" + author + ", publicationYear=" + publicationYear + "]";
//	}

		void displayInfo() {
		System.out.println("책 제목: [" + title + "], 저자: [" + author + "], 출판 연도: [" + publicationYear + "]");
	}
}
