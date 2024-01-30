package ex01;

public class Practice03_240126 {

	public static void main(String[] args) {

		int[] scores = {83, 90, 87}; // int[] scores = new int{83, 90, 87};
		
		int sum1 = 0;
		for(int i=0; i<3; i++) {
			sum1 += scores[i];
		}
		
		System.out.println("총합 : " + sum1);
				
				
		
		//printItem(new int[] {83, 90, 87});
		printItem(new int[] {83, 90, 87});
		
	}
	
	static void printItem( int [] scores) {
		for(int i=0; i<3; i++)
			System.out.println("score[" + i + "]: " + scores[i]);
			                                                 
	}
	
		
		
	}


