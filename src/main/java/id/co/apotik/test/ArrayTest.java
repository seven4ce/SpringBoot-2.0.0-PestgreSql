package id.co.apotik.test;

public class ArrayTest {

	public static void main(String[] args) {

		int[] arrayA = {20,10,40,10,30};
		int[] arrayB = {30,10,70,50,30};
		
		int[] arrayC = new int[arrayA.length + arrayB.length];

		int Index = 0;

		for (int i : arrayA) {
			arrayC[Index] = i;
			Index++;
		}
		for (int i : arrayB) {
			arrayC[Index] = i;
			Index++;
		}
		
		for (int i = 0; i < arrayC.length; i++) {
			int temp=0;
			for (int j = i+1; j < arrayC.length; j++) {
				if (arrayC[i]>arrayC[j]) {
					temp = arrayC[i];
					arrayC[i]=arrayC[j];
					arrayC[j]=temp;
				}
				
			}
			System.out.print(arrayC[i]+" ");
		}


	}

}
