package basic100;

import java.util.Scanner;

public class Main1019 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] date = sc.nextLine().split("\\.");
		System.out.format("%04d.%02d.%02d", Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
		sc.close();
	}

}
