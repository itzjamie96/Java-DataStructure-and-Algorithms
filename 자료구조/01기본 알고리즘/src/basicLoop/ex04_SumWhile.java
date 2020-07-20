package basicLoop;

import java.util.Scanner;

public class ex04_SumWhile {

	public static void main(String[] args) {
		//1부터 n까지의 합
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n: ");
		int n = sc.nextInt();
		
		int sum = 0;
		int i = 1;	//1부터 시작값
		
		while(i <= n) {
//			System.out.println("i: "+i);
			sum += i;
			i++;
		}
		
		System.out.println("sum: "+sum);

	}

}
