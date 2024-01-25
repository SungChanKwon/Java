package ex01;

public class Practice04 {

	public static void main(String[] args) {

	int sum = 0, i=0;
	
	while(true) {
		i++;
		
		if(i%2==1) {
			sum += i;
		}else {
			sum -= i;
		}
		
		if(sum>=100)
			break;
	
	}
	System.out.println("i = " + i + ", sum = " + sum);
	
	
	
	
	}

}
