package ex01;

public class OverloadingTest {

	public static void main(String[] args) {
		
		MyMath3 mm = new MyMath3();
		
		int[] a = {100, 200, 300};
		System.out.println("mm.add(a) 결과: " + mm.add(a));
	}

}
