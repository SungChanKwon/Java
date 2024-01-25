package ex01;

public class Practice________ {

	public static void main(String[] args) {
		
		int[] numArr = change(5);
		
		for(int i=0; i<numArr.length; i++)
			System.out.print(numArr[i] + " ");
	}
		
		
		
		static int[] change(int num) {
			int[] arrNum = new int[num];
			
			
			for(int i=0; i<arrNum.length; i++)
				arrNum[i] = (int)(Math.random()*10)+1;
			
			return arrNum;
			
		}
	}


