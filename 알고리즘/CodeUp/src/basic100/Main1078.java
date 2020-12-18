package basic100;

import java.util.Scanner;

public class Main1078 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int sum = 0;
		
		for (int i=2; i<=a; i+=2) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
		sc.close();		
	}
}
