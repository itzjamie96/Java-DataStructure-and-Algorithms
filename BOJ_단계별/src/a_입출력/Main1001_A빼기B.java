package a_입출력;

import java.util.Scanner;

public class Main1001_A빼기B {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A;
		int B;

		A = scan.nextInt();
		if (A>0) {
			B = scan.nextInt();
			if (B<10) {
				System.out.println(A-B);	
			}
		}
	}

}
