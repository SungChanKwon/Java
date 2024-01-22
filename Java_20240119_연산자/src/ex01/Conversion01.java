package ex01;

public class Conversion01 {

	public static void main(String[] args) {

		
		double d;
		int sum = 100;
		d = sum;
		System.out.println(d);
		System.out.println(sum);
		
		
		short s1 = 32000;
		int i1;
		i1 = s1;
		System.out.println(s1);
		System.out.println(i1);
		
		int i2 = 32000;
		short s2;
		s2 = (short)i2;
		System.out.println(i2);
		System.out.println(s2);
		
		int i3 = 50000;		// short-2바이트 int- 4바이트이므로 2바이트만큼만 집어넣는다는 의미, 그래서 -가 출력됨. 011 1100 1011 000-> 0으로 시작하면 마이너스(-)
		short s3 = (short)i3;
		System.out.println(i3);
		System.out.println(s3);
		
		
		
		
	}

}
