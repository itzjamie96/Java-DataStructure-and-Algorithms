package c_for문;

import java.util.Scanner;

public class Main2439_별찍기2_거꾸로 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		/* 
		 * 1: ----*		- : N-i
		 * 2: ---**		* : i
		 * 3: --***
		 * 4: -****
		 * 5: *****
		 * 
		 * => 두개의 for문이 필요함!
		 */
		
		//행을 나타내는 for문
		//공백이랑 *은 println 아니고 print로 나오게! 잊지말기
		for (int i=1; i<=N; i++) {	
			
			//공백: N-i개
			for (int j=1; j<=N-i; j++) {
				System.out.print(" ");
			}
			//*: 그냥 i개, 공백 뒤에 와야함
			for (int k=1; k<=i; k++) {
				System.out.print("*");
			}
			//줄바꿈 잊지말기
			System.out.println();
		}
	} 

}
