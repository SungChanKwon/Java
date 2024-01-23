package ex01;

public class Continue01 {

	public static void main(String[] args) {

	int a = 0;
	
	for(int i=0; i<=10; i++) {
		if(i % 2 == 1)
			a += i;
	}
		System.out.println("홀수 합 : " + a);
		System.out.println("------------------------");
	
		int a2 = 0;
		
		for(int i=1; i<=10; i+=2) {
			if(i % 2 == 1)
				a2 += i;	
		}
		System.out.println("홀수 합 : " + a2);
		System.out.println("------------------------");
		
		
	int sum3=0;
	for(int i=1; i<=10; i++) {
		if(i % 2 == 0)
			continue;
		
		sum3 += i;
	}
		System.out.println("홀수 합 : " + sum3);
		System.out.println("------------------------");
		
		
		
	}

}
