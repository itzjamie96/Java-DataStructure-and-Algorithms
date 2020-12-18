package basic100;

import java.util.Scanner;

public class Main1067 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a>0) {
			System.out.println("plus");
			if(a%2==0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		} else {
			System.out.println("minus");
			if(a%2==0) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
		sc.close();
	}
}
