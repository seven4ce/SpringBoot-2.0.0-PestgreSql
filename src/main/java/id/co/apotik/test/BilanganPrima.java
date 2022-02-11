package id.co.apotik.test;

public class BilanganPrima {

	public static void main(String[] args) {
		
		for (int i = 2; i < 18; i++) {
			boolean isPrima = true;
			
			for (int j = 2; j < i; j++) {
				
				if (i%j==0) {
					isPrima=false;
				}				
			}
			
			if (isPrima == true) {
				System.out.print(i+" ");
			}
			
			
		}
		

	}

}
