package ex05;

class DBox<L,R>{
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}

	@Override //: 오버라이딩은 메소드 시그니처가 일치해야 한다.블록안의 내용만 재정의 하는 것
	public String toString() {
		return left + "&" + right;
	}
	
	
	
}

public class MultiTypeGen {

	public static void main(String[] args) {
		
		DBox<String, Integer> box = new DBox<String, Integer>();
		
		box.set("apple", 10);
		System.out.println(box);
		
	}

}
