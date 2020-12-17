package basic100;

import java.util.Scanner;

public class Main1045 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a  = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%.02f", a+b, a-b, a*b, a/b, a%b, (double)a/(double)b);
		sc.close();
	}

}
