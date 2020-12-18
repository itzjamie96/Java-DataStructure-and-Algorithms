package basic100;

import java.util.Scanner;

public class Main1071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		while (true) {
			i = sc.nextInt();
			if (i==0) {
				break;
			} else {
				System.out.println(i);
			}
		}
		
		sc.close();
	}
}
