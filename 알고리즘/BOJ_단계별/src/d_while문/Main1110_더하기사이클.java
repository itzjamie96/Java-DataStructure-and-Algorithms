package d_while문;

import java.util.Scanner;

public class Main1110_더하기사이클 {

	public static void main(String[] args) {
		/*
		 * N 입력받기
		 * if N<10  ==> 0N  ==> 0+N  ==> [N]+[0+N] = new Number
		 * ex)
		 * 		N=26
		 * 		2+6 = 8		==> [6]+[8] = 68
		 * 		6+8 = 14	==> [8]+[4] = 84
		 * 		8+4 = 12	==> [4]+[2] = 42
		 * 		4+2 = 6		==> [2]+[6] = 26
		 * 		--사이클의 길이 = 4
		 */

		//Scanner sc = new Scanner(System.in);
		
		//int N = sc.nextInt();
		
//		System.out.println(N/10);
//		System.out.println(N%10);
		/*
		while (true) {
			int tenth = N/10;
			int one = N%10;
			
			
			
		}*/
		int b = 4+3/2;
		System.out.println(b);
		int c = b%3;
		System.out.println(c);
	}

}
