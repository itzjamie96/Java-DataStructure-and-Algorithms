package basic100;

import java.util.Scanner;

public class Main1027 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] date = sc.nextLine().split("\\.");
		System.out.format("%s-%s-%s", date[2],date[1],date[0] );
		sc.close();
	}

}
