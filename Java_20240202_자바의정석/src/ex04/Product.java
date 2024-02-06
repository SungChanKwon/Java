package ex04;

public class Product {

	 int price;				//제퓸의가격
	 int bonusPoint;		//제품구매 시 제공하는 보너스점수
	
	Product(int price){
		this.price = price;
		bonusPoint = (int) (price/10.0);
	}
	
	Product() {		//기본 생성자
		
	}
}
