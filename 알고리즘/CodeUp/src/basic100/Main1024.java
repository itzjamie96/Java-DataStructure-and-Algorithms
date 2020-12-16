package basic100;

import java.util.Scanner;

public class Main1024 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split("");
		for (int i = 0; i < input.length; i++) {
			System.out.println("'"+input[i]+"'");
		}
		sc.close();
	}

}
