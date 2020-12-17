package basic100;

import java.util.Scanner;

public class Main1035 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		int i = Integer.parseInt(tmp, 16);
		System.out.printf("%o", i);
		sc.close();
	}

}
