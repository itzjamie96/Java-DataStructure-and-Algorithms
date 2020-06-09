package ch01;

public class p17_숫자피라미드 {

	//n단의 숫자 피라미드!
	static void numPyramid(int n) {
		
		for(int i=1; i<=n; i++) {
			
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print(i);
			}
			
			for(int k=1; k<=i-1;k++) {
				System.out.print(i);
			}
		
			System.out.println();
		}
					
	}
	
	public static void main(String[] args) {
		
		numPyramid(4);

	}

}
