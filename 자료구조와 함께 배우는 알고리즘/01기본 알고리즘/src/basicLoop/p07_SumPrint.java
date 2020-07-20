package basicLoop;

import java.util.Scanner;

public class p07_SumPrint {

	public static void main(String[] args) {
		// 1+2+3+...+n = sum 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			System.out.print(i+" + ");
			sum += i;
		}
		System.out.print("= "+sum);
		

	}

}
