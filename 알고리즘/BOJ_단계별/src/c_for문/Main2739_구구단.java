package c_for문;

import java.util.Scanner;

public class Main2739_구구단 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		for (int i = 1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + num*i);
		}
	}
}
