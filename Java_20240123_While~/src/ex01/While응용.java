package ex01;

public class While응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum=0;
		int i=1;
		
		boolean flag = true;
		
		//while(i<=5) {
		//while(flag == true) {
			while(true) {
			while(flag) {
				sum += sum + i;
				i++;
			
		// if(sum>1000000)
		// break;
				
				if(sum > 1000000)
					flag = false;
					System.out.println("while 누적합 : " + sum);
			}		
		}
		
		//System.out.println("while 누적합 : " + sum);
		
		
		
	}

}
