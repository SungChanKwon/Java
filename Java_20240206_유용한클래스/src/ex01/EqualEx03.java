package ex01;


public class EqualEx03 {

	public static void main(String[] args) {

		Box2 b1 = new Box2(10);
		Box2 b2 = new Box2(10);
		
		System.out.println("1 >> " + (b1 == b2)); 
		System.out.println("2 >> " + (b1.equals(b2)));
		
	}

}


class Box2{
	int x;
	public Box2(int x) {
		this.x = x;
	}
	@Override
	public boolean equals(Object obj) {
			Box2 b = (Box2)obj;
			return x == b.x;
					
//			return x == ((Box2)obj).x; 
			
			//객체를 비교하기 위해선 오버라이딩을 해줘야함
			//형변환을 통해서 비교 ==> Box2 b1 = (Box2) obj 
		}
	
	// equal 메소드 재정의
	}

