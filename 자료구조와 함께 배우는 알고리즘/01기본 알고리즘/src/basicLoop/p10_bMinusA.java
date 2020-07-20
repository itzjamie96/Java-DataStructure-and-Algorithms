package basicLoop;

import java.util.Scanner;

public class p10_bMinusA {
	
	public static void main(String[] args) {
		// b-a 구하는 프로그램
		// b가 a이하면 다시 b의 값 입력
		
		Scanner sc = new Scanner(System.in);
		int a,b;
		
		System.out.print("a: ");
		a = sc.nextInt();
		
		do {	
			System.out.print("b: ");
			b = sc.nextInt();
		} while(b<=a);
		
		System.out.println("b - a = "+(b-a));

	}

}
