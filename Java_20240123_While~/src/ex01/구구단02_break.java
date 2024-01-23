package ex01;

public class 구구단02_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=2; i<=9; i++) {
			
			for(int j=1; j<=9; j++) {
		
				System.out.println(i + "x" + j + " = " + (i*j));
				if(j==i) break;
				
			}	
		}
	}

}
