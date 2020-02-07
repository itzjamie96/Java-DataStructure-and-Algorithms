package for문;

import java.util.Scanner;

public class Main2438_별찍기1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i=1; i<=N; i++) {		
			//j는 계속해서 증가하는 변수 = i
			for (int j=1; j<=i; j++ ) {
				System.out.print("*");				
			}			
			System.out.println();
		}
	}
}
