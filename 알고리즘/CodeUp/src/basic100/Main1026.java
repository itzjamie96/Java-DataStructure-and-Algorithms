package basic100;

import java.util.Scanner;

public class Main1026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] time = sc.nextLine().split(":");
		System.out.println(Integer.parseInt(time[1]));
		sc.close();
	}

}
