package b_if문;

import java.util.Scanner;

public class Main10817_세수 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		int mid;
		
		if(a<b) {
			if (a<c) {
				if(b<c) {
					mid = b;
				} else {
					mid = c;
				}
			} else {
				mid = a;
			}
			System.out.println(mid);
		} else if (a>c) {
			if(b>c) {
				mid = b;
			} else {
				mid = c;
			}
			System.out.println(mid);
		} else {
			mid = a;
			System.out.println(mid);
		}

	}

}
