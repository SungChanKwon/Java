package ex02;

public class Practice01 {

	public static void main(String[] args) {

	int[]lotto = new int[6];
	
	for(int j=0; j<5; j++) {
	
	for(int i=0; i<lotto.length; i++) {
		int num = (int)(Math.random()*45)+1;
		lotto[i] = num;
	for(int k=0; k<i; k++) {
		if(lotto[i] == lotto[k]) {
			i--;
			break;
		}
			
	}
		
	System.out.print(lotto[i] + " ");
	
	}
	
	System.out.println("\n----------------------------------");
	}
	}

}
