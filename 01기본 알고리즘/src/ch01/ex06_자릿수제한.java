package ch01;

import java.util.Scanner;

public class ex06_자릿수제한 {

	/*
	 *  -- 계속 조건
	 * 	do {		
	 * 		~~~~~~		
	 * 	} while(n<10 || n>99);			
	 * 
	 * -- !종료 조건
	 * 	do {		
	 * 		~~~~~~		
	 * 	} while(!n>=10 && n<=99);			
	 * 
	 * 
	 * == 결국 둘 다 같음
	 */
	
	public static void main(String[] args) {
		// 2의 자리 양수로만 제한하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		// n이 10보다 작던가 99보다 크면 n입력하라고 계속 말해주기
		do {
			System.out.print("n: ");
			n = sc.nextInt();
		} while(n<10 || n>99);
		
		System.out.println("두자릿수 n: "+n);

	}

}
