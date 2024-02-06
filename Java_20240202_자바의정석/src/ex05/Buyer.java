package ex05;

public class Buyer {

	int money = 3000;
	Product [] cart = new Product[3];
	int i = 0;
	
	void buy (Product p) {
		
		//1.1
		if(money < p.price) {
			System.out.println(p + "(" + p.price + ") 잔액 부족");
			return;
		}
		
		//1.2
		money -= p.price;
		
		//1.3
		add(p);
	}
	
	void add(Product p) {
		
		//1.1 -> i 값이 장바구니 보다 크면
		if(i>=cart.length) {
			Product [] tmp = new Product[cart.length * 2];  //1.1.1
			
			for(i=0; i<cart.length; i++)  //1.1.2
			tmp[i] = cart[i];
			cart = tmp;  //1.1.3
		}
			//1.2 -> 물건을 장바구니에 저장
			cart[i++] = p;
	}
	
	void summary() {	//구매한 물품에 대한 정보를 요약해서 보여준다.
		String itemList = "";
		int sum = 0;
		
		//1.1
		for(i=0; i<cart.length; i++) {
			itemList += cart[i] + ", ";
			sum += cart[i].price;
		}
		System.out.println("구입한 물건의 목록 : " + itemList);
		System.out.println("사용한 금액 : " + sum);
		System.out.println("남은 금액 : " + money);
	}
}