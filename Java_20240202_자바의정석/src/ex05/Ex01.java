package ex05;

public class Ex01 {

	public static void main(String[] args) {

		Buyer b = new Buyer();
		
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		
		b.summary();
		
	}

}
