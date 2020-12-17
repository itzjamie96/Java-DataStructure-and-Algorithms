package basic100;

import java.util.Scanner;

public class Main1046 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		long sum = a+b+c;
		System.out.printf("%d\n%.01f", sum, sum/(double)3);
		sc.close();
	}

}
