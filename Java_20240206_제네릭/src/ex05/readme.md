class DBox<L,R>{
	private String left;
	private Integer right;
	
	public void set(String left, Integer right) {
		this.left = left;
		this.right = right;
	}

	@Override //: 오버라이딩은 메소드 시그니처가 일치해야 한다.블록안의 내용만 재정의 하는 것
	public String toString() {
		return left + "&" + right;
	}