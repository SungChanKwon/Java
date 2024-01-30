package ex01;

public class Practice_240126 {

	public static void main(String[] args) {

		
		int[] arr = {10 ,20, 30};
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i] + " ");
		
		int[] arrNum = arr;
		for(int i=0; i<arrNum.length; i++)
			arrNum[i] += 100;
		
		System.out.println();
		
		
		//for(int i=0; i<arr.length; i++)
		//System.out.print(arr[i] + " ");
			for(int n : arr)
				System.out.print(n + " ");
		
			
		
			System.out.println();
		
		String[] str = {"kor", "eng", "math", "com", "sci"};
		
	//	for(int i=0; i<str.length; i++)
		//	System.out.print(str[i] + " ");
		
		for(String s : str)
			System.out.print(s + " ");
		
				 
		
		
			
		
	}

}
