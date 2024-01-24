package ex02;

public class Lotto {

	public static void main(String[] args) {

		//1~45 숫자 중에서 랜덤하게 6개 추출
		
		
		int[]lotto = new int[6];
		boolean flag;
		
		
		for(int j=0; j<5; j++) {
		
		for(int i=0; i<lotto.length; i++) {
			flag = false;													//flag = false를 설정해줘야함 중복값이 생겼을때 flag=true로 설정되어 if(flag)문을 거쳐 다시 랜덤을 돌렷을때 flag=true 값을 false로 바꿔줘야 다시 중복되지않을값을 찾게되므로.
			int num = (int)(Math.random()*45)+1;
			
			for(int k=0; k<i; k++) {
				if(num == lotto[k]) {
					flag = true;
					break; //break 가 없다면 continue는 그 직전 식까지만 돌아감.
				}
			}
			
			if(flag) {
				i--;
				continue;
			}
			lotto[i] = num;
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
			

		}
			System.out.println("\n----------------------------------");
		
	}
		}


}