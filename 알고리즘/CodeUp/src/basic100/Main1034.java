package basic100;

import java.util.Scanner;

public class Main1034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String octal = sc.nextLine();
		int i = Integer.parseInt(octal, 8);
		System.out.println(i);
		sc.close();
	}

}
