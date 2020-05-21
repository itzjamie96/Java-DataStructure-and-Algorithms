package ch01;

import java.util.Scanner;

public class ex06_SumForPos {

	public static void main(String[] args) {
		// 양수만 입력가능한 합 구하기
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		//n이 0보다 같거나 작으면 이거 실행
		do {
			System.out.print("n: ");
			n = sc.nextInt();
		} while(n <= 0); //끝에 (;)
		
		int sum = 0;
		
		for(int i=1; i<=n; i++)
			sum+=i;
		
		System.out.println("sum: "+sum);

	}

}
