package ch01;

import java.util.Scanner;

public class ex05_SumFor {

	public static void main(String[] args) {
		// 1부터 n까지의 합

		Scanner sc = new Scanner(System.in);

		System.out.print("n: ");
		int n = sc.nextInt();

		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
			
		}
		System.out.println("sum: "+sum);
	}

}
