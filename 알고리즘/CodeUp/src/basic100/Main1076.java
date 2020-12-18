package basic100;

import java.util.Scanner;

public class Main1076 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char c = sc.nextLine().charAt(0);
		for (char a='a'; a<=c; a++) {
			System.out.printf("%c ", a);
		}
		sc.close();		
	}
}
