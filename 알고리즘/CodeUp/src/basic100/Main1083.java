package basic100;

import java.util.Scanner;

public class Main1083 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.close();		
		
		for (int i=1; i<=a; i++) {
			if (i==3 || i==6 || i==9) {
				System.out.printf("X ");
			} else {
				System.out.printf("%d ",i);
			}
		}
	}
}
