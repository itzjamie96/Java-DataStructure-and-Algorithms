package basic100;

import java.util.Scanner;

public class Main1080 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int i = 0;
		int sum = 0;
		do {
			i++;
			sum += i;
		} while (sum<a);
		System.out.println(i);
		sc.close();		
	}
}
