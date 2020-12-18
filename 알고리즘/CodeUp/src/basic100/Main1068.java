package basic100;

import java.util.Scanner;

public class Main1068 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a>89) {
			System.out.println("A");
		} else if (a>69) {
			System.out.println("B");
		} else if (a>39) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		sc.close();
	}
}
