package basicLoop;

public class p16_피라미드 {

	//n단의 피라미드
	static void pyramid(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			
			for(int k=1; k<=i-1;k++) {
				System.out.print("*");
			}
		
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		pyramid(6);
	} 

}
