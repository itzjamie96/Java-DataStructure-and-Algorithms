package ch01;

import java.util.Scanner;

public class p14_정사각형 {

	public static void main(String[] args) {
		// 입력한 수를 *변으로 하는 정사각형 출력~
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
}
