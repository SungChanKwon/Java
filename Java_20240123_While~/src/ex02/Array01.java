package ex02;

public class Array01 {

	public static void main(String[] args) {

	//int 형 배열
		
		int sum;
		
		int[] arrNum = new int[5];
		
		arrNum[0] = 10;
		arrNum[1] = 20;
		arrNum[2] = 30;
		arrNum[3] = 40;
		arrNum[4] = 50;
		
		for(int i=0; i<5; i++)
			System.out.print(arrNum[i] + " ");
		
		System.out.println("\n---------------------------------------");
		
		int[] arrNum2 = {11, 22, 33, 44, 55};
//		int[] arrNum2 = new int[]{11, 22, 33, 44, 55};
		
		
		
		for(int i=0; i<5; i++)
			System.out.print(arrNum2[i] + " ");
		
		System.out.println("\n---------------------------------------");
		
		int[] arrNum3 = {11, 22, 33, 44, 55, 66, 77};
		//System.out.println(arrNum3.length); 변의 길이를 알려줌 즉, 방의 개수를 알려주는 메서드
		
		for(int i=0; i<arrNum3.length; i++)		//length 이용해주는게 제일 좋다
			System.out.print(arrNum3[i] + " ");
		
		
		
	}

}
