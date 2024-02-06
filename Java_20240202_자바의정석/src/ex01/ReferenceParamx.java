package ex01;

public class ReferenceParamx {

	public static void main(String[] args) {

		int[] arr = new int[] {3,2,1,6,5,4};
		
		printArr(arr);
		sortArr(arr);
		printArr(arr);  //3
		System.out.print("sum= " + sumArr(arr)); // 5
	}
		// 1
	static void printArr(int[] arr) {
		System.out.print("[");
		
		for(int i : arr)  //반복
			System.out.print(i+",");
		System.out.println("]");
	}
		// 4
	static int sumArr(int[] arr) {
		int sum = 0;
				
		for(int i=0; i<arr.length; i++)
			sum += arr[i];
		return sum;
	}
		// 2
	static void sortArr(int[] arr) {
		for(int i=0; i<arr.length-1; i++) 
			for(int j=0; j<arr.length-1-i; j++) 
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
		}
	}
}
