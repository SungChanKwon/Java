package ex04;

public class BookController {

	public static void main(String[] args) {

		Book book = new Book("자바마스터", "송미영", 2020);
		book.displayInfo();
		
		
		EBook eb = new EBook("자바마스터", "송미영", 2020, 50, "포맷");
		eb.displayInfo();
//		System.out.println(eb.toString());
		
		AudioBook ab = new AudioBook("자바마스터", "송미영", 2020, 10,"권성찬");
		ab.displayInfo();
	}

}
