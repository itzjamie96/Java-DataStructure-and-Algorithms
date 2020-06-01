package ch01;

public class p15_직각이등변삼각형method {

	//왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangleBL(int n) {
		if(n>0) {
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else System.out.println("n은 양수여야 합니다");
	}
	
	//왼쪽 위가 직각인 이등변 삼각형
	static void triangleUL(int n) {
		if(n>0) {
			for(int i=0; i<n; i++) {
				for(int j=n-1; j>=i; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	
	//오른쪽 위가 직각
	static void triangleUR(int n) {
		for(int i=1; i<=n; i++) {
			
			if(i>1) {
				for(int k=1; k<i; k++) {
					System.out.print(" ");
				}
			}
			
			for(int j=i; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//오른쪽 아래가 직각
	static void triangleBR(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		
//		triangleBL(3);
//		triangleUL(3);
//		triangleUR(4);
		triangleBR(4);

	}

}
