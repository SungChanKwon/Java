package pr01;

public class Practice01 {

	public static void main(String[] args) {

		int x = 1;
		int y = 1;
		int result1 = ++x + 10; //x를 1증가 -> int result1 = 2 + 10;
		int result2 = y++ + 10; //int result2 = 1 + 10 -> y를 1증가

		System.out.println("result1: " + result1);
		System.out.println("result1: " + result2);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
	}

}