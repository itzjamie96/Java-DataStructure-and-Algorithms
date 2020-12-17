package basic100;

import java.util.Scanner;

public class Main1051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 && b == 0) {
			System.out.println(1);			
		} else {
			System.out.println(b>a ? 1:0);			
		}
		sc.close();
	}

}
