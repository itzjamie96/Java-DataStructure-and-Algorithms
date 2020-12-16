package basic100;

import java.util.Scanner;

public class Main1025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String[] input = sc.nextLine().split("");
		for(int i=input.length; i>0; i--) {
			int n = (int)(Integer.parseInt(input[5-i])*(Math.pow(10, i-1)));
			System.out.format("[%d]\n",n);
		}
		sc.close();
	}

}
