package ex01;

public class Array_StringClassMethod {

	public static void main(String[] args) {

		String str = "Korea";
		String str2 = "";
		
		String str3 = str.substring(2);
		
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str2.isEmpty());
		System.out.println(str.substring(2));
		System.out.println(str3);
		
		System.out.println(str.substring(0, 4));  // Start index <= string < End index
		
		String str4 = "Math";
		String str5 = str4.concat(str);
		
		System.out.println(str.concat(str4));
		System.out.println(str5);
		
		
		
	}

}
