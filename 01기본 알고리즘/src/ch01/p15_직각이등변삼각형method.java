package ch01;

public class p15_직각이등변삼각형method {

	//왼쪽 아래가 직각인 이등변 삼각형을 출력
	static void triangle(int n) {
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
	
	public static void main(String[] args) {
		
		triangle(8);

	}

}
