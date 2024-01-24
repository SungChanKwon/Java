package ex02;

public class Lotto02_1game {

	public static void main(String[] args) {

		
		
		
		int[] lotto = new int[45];    // i 에는 1~45까지의 숫자가 들어감.
		
		for(int j=0; j<5; j++) {
		
		for(int i=0; i<lotto.length; i++)
			lotto[i] = i+1;
		
		for(int i=0; i<1000; i++) {
			int num = (int)(Math.random()*44)+1; //1~44
			int tmp = lotto[0];
			lotto[0] = lotto[num];
			lotto[num] = tmp;
		}
		
		for(int i=0; i<6; i++)
			System.out.print(lotto[i] + " "); //한 게임
		
		System.out.println();
		System.out.println("-------------------------------------");
	}
	}		
}
