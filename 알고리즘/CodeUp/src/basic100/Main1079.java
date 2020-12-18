package basic100;

import java.util.Scanner;

public class Main1079 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String[] input = sc.nextLine().split(" ");
		for (String s: input) {
			if (s.charAt(0)=='q') {
				System.out.println(s);
				break;
			} else {
				System.out.println(s);
			}
		}
		sc.close();		
	}
}
