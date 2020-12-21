package basic100;

import java.util.Scanner;

public class Main1086 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] inputs = sc.nextLine().split(" ");
		sc.close();
		
		double total = 1;
		for (int i=0; i<inputs.length; i++) {
			total *= Double.parseDouble(inputs[i]);
		}
		System.out.printf("%.2f MB",total/8388608);

	}
}
